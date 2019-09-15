<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>JavaScript・PHPでじゃんけんゲーム</title>
    <script src="./js/jankenpon.js"></script>
    <link rel="stylesheet" href="css/style.css" />
  </head>

  <body>
<!-- ここから入力 -->
<div class="imgBox">
<img src="img/1.png" alt="グーのスケッチ">
<img src="img/2.png" alt="チョキのスケッチ">
<img src="img/3.png" alt="パーのスケッチ">
</div>
<div class="site">
  <?php
    // 結果を代入する変数
    $result = false;
    // ポスト変数が存在するか
    if (isset($_POST['choice'])) {
    $janken = array(
        'グー',
        'チョキ',
        'パー'
    );
    // エスケープ
    $player = htmlspecialchars($_POST['choice'], ENT_QUOTES, 'UTF-8');
    // 相手の手をランダムで決定
    $com = $janken[array_rand($janken)];
    // グー勝敗判定
    if ($player === 'グー' && $com === 'チョキ') {
        $result = '勝ち';
    } elseif ($player === 'グー' && $com === 'グー') {
        $result = 'あいこ';
    } elseif ($player === 'グー' && $com === 'パー') {
        $result = '負け';
    }
    }
    // チョキ勝敗判定
    if ($player === 'チョキ' && $com === 'パー') {
        $result = '勝ち';
    } elseif ($player === 'チョキ' && $com === 'チョキ') {
        $result = 'あいこ';
    } elseif ($player === 'チョキ' && $com === 'グー') {
        $result = '負け';
    }
    // パー勝敗判定
    if ($player === 'パー' && $com === 'グー') {
    $result = '勝ち';
    } elseif ($player === 'パー' && $com === 'パー') {
    $result = 'あいこ';
    } elseif ($player === 'パー' && $com === 'チョキ') {
    $result = '負け';
}
?>
<p>選んでください。</p>
<form button="" method="post">
    <button type="submit" name="choice" value="グー">グー</button>
    <button type="submit" name="choice" value="チョキ">チョキ</button>
    <button type="submit" name="choice" value="パー">パー</button>
</form>
<?php if ($result) : ?>
    <p>結果</p>
    <p>
    あなた：<?php echo $player; ?><br>
    あいて：<?php echo $com; ?>
    </p>
    <p><?php echo $result; ?>です。</p>
<?php endif;?>

<!-- JavaScript ここから-->
<script>
      alert('ジャンケンのご準備はよろしいですか');
</script>
<!-- JavaScript// -->
</div>
</body>
</html>
