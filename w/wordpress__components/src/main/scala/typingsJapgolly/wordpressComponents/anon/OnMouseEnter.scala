package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.error
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.success
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.validating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMouseEnter extends StObject {
  
  /**
    * Function to call when onMouseEnter event triggered on token.
    */
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  
  /**
    * Function to call when onMouseLeave is triggered on token.
    */
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  
  /**
    * Applies styles to token.
    */
  var status: js.UndefOr[error | validating | success] = js.undefined
  
  /**
    * Adds a title to the token.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the token.
    */
  var value: String
}
object OnMouseEnter {
  
  inline def apply(value: String): OnMouseEnter = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseEnter]
  }
  
  extension [Self <: OnMouseEnter](x: Self) {
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLSpanElement & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setStatus(value: error | validating | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
