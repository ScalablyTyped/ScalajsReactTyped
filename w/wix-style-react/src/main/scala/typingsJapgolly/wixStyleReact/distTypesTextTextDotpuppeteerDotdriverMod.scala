package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.puppeteer.mod.ElementHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextTextDotpuppeteerDotdriverMod {
  
  trait TextPuppeteerDriver extends StObject {
    
    def element(): ElementHandle[Element]
    
    def getValue(): js.Promise[String]
  }
  object TextPuppeteerDriver {
    
    inline def apply(element: CallbackTo[ElementHandle[Element]], getValue: CallbackTo[js.Promise[String]]): TextPuppeteerDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, getValue = getValue.toJsFn)
      __obj.asInstanceOf[TextPuppeteerDriver]
    }
    
    extension [Self <: TextPuppeteerDriver](x: Self) {
      
      inline def setElement(value: CallbackTo[ElementHandle[Element]]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
    }
  }
}
