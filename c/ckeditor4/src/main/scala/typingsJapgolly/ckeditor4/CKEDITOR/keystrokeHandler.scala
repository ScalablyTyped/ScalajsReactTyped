package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.ckeditor4.CKEDITOR.dom.domObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait keystrokeHandler extends StObject {
  
  def attach(domObject: domObject): Unit
  
  var blockedKeystrokes: NumberDictionary[String | Boolean]
  
  var keystrokes: NumberDictionary[String | Boolean]
}
object keystrokeHandler {
  
  inline def apply(
    attach: domObject => Callback,
    blockedKeystrokes: NumberDictionary[String | Boolean],
    keystrokes: NumberDictionary[String | Boolean]
  ): keystrokeHandler = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1((t0: domObject) => attach(t0).runNow()), blockedKeystrokes = blockedKeystrokes.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystrokeHandler]
  }
  
  extension [Self <: keystrokeHandler](x: Self) {
    
    inline def setAttach(value: domObject => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction1((t0: domObject) => value(t0).runNow()))
    
    inline def setBlockedKeystrokes(value: NumberDictionary[String | Boolean]): Self = StObject.set(x, "blockedKeystrokes", value.asInstanceOf[js.Any])
    
    inline def setKeystrokes(value: NumberDictionary[String | Boolean]): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
  }
}
