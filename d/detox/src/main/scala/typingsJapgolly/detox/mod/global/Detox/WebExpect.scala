package typingsJapgolly.detox.mod.global.Detox

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExpect[R] extends StObject {
  
  /**
    * Negate the expectation.
    * @example await expect(web.element(by.web.id('UniqueId205'))).not.toExist();
    */
  var not: this.type
  
  /**
    * Expect the view to exist in the webview DOM tree.
    * @example await expect(web.element(by.web.id('UniqueId205'))).toExist();
    */
  def toExist(): R
  
  /**
    * Expect the element content to have the `text` supplied
    * @param text expected to be on the element content
    * @example
    * await expect(web.element(by.web.id('UniqueId205'))).toHaveText('ExactText');
    */
  def toHaveText(text: String): R
}
object WebExpect {
  
  inline def apply[R](not: WebExpect[R], toExist: CallbackTo[R], toHaveText: String => R): WebExpect[R] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], toExist = toExist.toJsFn, toHaveText = js.Any.fromFunction1(toHaveText))
    __obj.asInstanceOf[WebExpect[R]]
  }
  
  extension [Self <: WebExpect[?], R](x: Self & WebExpect[R]) {
    
    inline def setNot(value: WebExpect[R]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setToExist(value: CallbackTo[R]): Self = StObject.set(x, "toExist", value.toJsFn)
    
    inline def setToHaveText(value: String => R): Self = StObject.set(x, "toHaveText", js.Any.fromFunction1(value))
  }
}
