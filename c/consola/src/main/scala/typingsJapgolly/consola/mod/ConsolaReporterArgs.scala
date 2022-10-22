package typingsJapgolly.consola.mod

import typingsJapgolly.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaReporterArgs extends StObject {
  
  var async: Boolean
  
  var stderr: WritableStream
  
  var stdout: WritableStream
}
object ConsolaReporterArgs {
  
  inline def apply(async: Boolean, stderr: WritableStream, stdout: WritableStream): ConsolaReporterArgs = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterArgs]
  }
  
  extension [Self <: ConsolaReporterArgs](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: WritableStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: WritableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
