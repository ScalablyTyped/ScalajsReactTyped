package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetText extends StObject {
  
  def getText(): Unit
  
  // Orion Editor
  def setText(): Unit
}
object GetText {
  
  inline def apply(getText: Callback, setText: Callback): GetText = {
    val __obj = js.Dynamic.literal(getText = getText.toJsFn, setText = setText.toJsFn)
    __obj.asInstanceOf[GetText]
  }
  
  extension [Self <: GetText](x: Self) {
    
    inline def setGetText(value: Callback): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setSetText(value: Callback): Self = StObject.set(x, "setText", value.toJsFn)
  }
}
