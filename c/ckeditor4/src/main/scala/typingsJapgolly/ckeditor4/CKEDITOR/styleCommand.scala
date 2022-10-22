package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait styleCommand extends StObject {
  
  def exec(editor: editor): Unit
}
object styleCommand {
  
  inline def apply(exec: editor => Callback): styleCommand = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1((t0: editor) => exec(t0).runNow()))
    __obj.asInstanceOf[styleCommand]
  }
  
  extension [Self <: styleCommand](x: Self) {
    
    inline def setExec(value: editor => Callback): Self = StObject.set(x, "exec", js.Any.fromFunction1((t0: editor) => value(t0).runNow()))
  }
}
