*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body{
    background:#f4fff4;
    color:#333;
}

header{
    background:#2e7d32;
    color:white;
    text-align:center;
    padding:25px;
}

nav{
    margin-top:15px;
}

nav a{
    color:white;
    text-decoration:none;
    margin:15px;
    font-weight:bold;
}

nav a:hover{
    color:#ffe082;
}

.hero{
    text-align:center;
    padding:60px 20px;
    background:#81c784;
    color:white;
}

button{
    margin-top:20px;
    padding:12px 25px;
    border:none;
    border-radius:8px;
    background:#2e7d32;
    color:white;
    font-size:18px;
    cursor:pointer;
    transition:.3s;
}

button:hover{
    background:#1b5e20;
    transform:scale(1.05);
}

section{
    padding:50px 20px;
}

.cards{
    display:flex;
    justify-content:center;
    gap:25px;
    flex-wrap:wrap;
    margin-top:30px;
}

.card{
    width:250px;
    background:white;
    padding:20px;
    border-radius:15px;
    box-shadow:0 0 10px rgba(0,0,0,.15);
    text-align:center;
    transition:.3s;
}

.card:hover{
    transform:translateY(-8px);
}

.galeria{
    display:flex;
    gap:20px;
    justify-content:center;
    flex-wrap:wrap;
}

.galeria img{
    width:300px;
    border-radius:15px;
    transition:.3s;
}

.galeria img:hover{
    transform:scale(1.05);
}

footer{
    background:#2e7d32;
    color:white;
    text-align:center;
    padding:20px;
}
