package typingsJapgolly.angularCompilerCli.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typescript.typescript.CompilerHost, 'getCurrentDirectory' | 'getCanonicalFileName'> */
trait PickCompilerHostgetCurren extends StObject {
  
  def getCanonicalFileName(fileName: String): String
  @JSName("getCanonicalFileName")
  var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String]
  
  def getCurrentDirectory(): String
  @JSName("getCurrentDirectory")
  var getCurrentDirectory_Original: js.Function0[String]
}
object PickCompilerHostgetCurren {
  
  inline def apply(getCanonicalFileName: /* fileName */ String => String, getCurrentDirectory: CallbackTo[String]): PickCompilerHostgetCurren = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = getCurrentDirectory.toJsFn)
    __obj.asInstanceOf[PickCompilerHostgetCurren]
  }
  
  extension [Self <: PickCompilerHostgetCurren](x: Self) {
    
    inline def setGetCanonicalFileName(value: /* fileName */ String => String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentDirectory", value.toJsFn)
  }
}
