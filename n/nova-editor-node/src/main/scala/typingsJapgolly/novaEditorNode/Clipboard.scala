package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/clipboard/
trait Clipboard extends StObject {
  
  def readText(): js.Promise[String]
  
  def writeText(text: String): js.Promise[Unit]
}
object Clipboard {
  
  inline def apply(readText: CallbackTo[js.Promise[String]], writeText: String => js.Promise[Unit]): Clipboard = {
    val __obj = js.Dynamic.literal(readText = readText.toJsFn, writeText = js.Any.fromFunction1(writeText))
    __obj.asInstanceOf[Clipboard]
  }
  
  extension [Self <: Clipboard](x: Self) {
    
    inline def setReadText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "readText", value.toJsFn)
    
    inline def setWriteText(value: String => js.Promise[Unit]): Self = StObject.set(x, "writeText", js.Any.fromFunction1(value))
  }
}
