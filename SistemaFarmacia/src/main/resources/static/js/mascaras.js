/*! jQuery v1.11.3 | (c) 2005, 2015 jQuery Foundation, Inc. | jquery.org/license */
$(document).ready(function () { 
            var $CampoCpf = $("#cpf");
            $CampoCpf.mask('000.000.000-00', {reverse: true});

            var $CampoData = $("#data_nasc");
            $CampoData.mask('00/00/0000', {reverse: true});

            var $CampoHora = $("#horario");
            $CampoHora.mask('00:00', {reverse: true});

            var $Notas = $("#notas");
            $Notas.mask('10,00',{reverse:true});

            var $Notas = $("#notas2");
            $Notas.mask('10,00',{reverse:true});
        });
//# sourceMappingURL=jquery.min.map