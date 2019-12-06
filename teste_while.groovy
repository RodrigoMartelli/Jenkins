 
// def command = 'sc query AdobeARMservice'
// //def command = 'dir'
// def proc = command.execute()
// proc.waitFor()              

// String result = proc.in.text
// println(result)
// println(result.substring(25, 50))
// println "Process exit code: ${proc.exitValue()}"
// println "Std Err: ${proc.err.text}"
// // println "Std Out: ${proc.in.text}" 

// int timeout = 0
// while ((timeout < 100) || (timeout < 50)) {
//         //validaServiceStop = shell.execute(commandStop03)
//         println('while')
//         sleep 6000
//         timeout = timeout + 1
//     }

taskExitCodeStop01 = '0'
boolean a = true
boolean b = false
int timeout = 0
//String teste

teste = 'Testes srting'

println(teste)

// while (timeout < 10) {
// //         //validaServiceStop = shell.execute(commandStop03)
//         println('while')
//         //sleep 6000
//         timeout = timeout + 1
//         if (timeout == 7) { 
//             break
//             }
        
//     }

verificaStatusServico("Siebel", "RUNNING")

public void verificaStatusServico(String servico, String stService){
    
    String cmdSt = "sc query ${servico} | grep ${stService} |  wc -l"
    println(cmdSt)

}
 


// if (b || a){
//     println('entrou no or')
// }

// if ( taskExitCodeStop01 != '1' ) {
// 			println('comparou string')
// 		}