package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewElement extends StObject {
  
  def element(webMatcher: WebMatcher): IndexableWebElement
}
object WebViewElement {
  
  inline def apply(element: WebMatcher => IndexableWebElement): WebViewElement = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction1(element))
    __obj.asInstanceOf[WebViewElement]
  }
  
  extension [Self <: WebViewElement](x: Self) {
    
    inline def setElement(value: WebMatcher => IndexableWebElement): Self = StObject.set(x, "element", js.Any.fromFunction1(value))
  }
}
