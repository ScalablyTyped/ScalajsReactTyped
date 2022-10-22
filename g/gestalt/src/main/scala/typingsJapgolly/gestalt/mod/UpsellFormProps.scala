package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.gestalt.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsellFormProps extends StObject {
  
  var onSubmit: AbstractEventHandler[
    (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]), 
    js.Object
  ]
  
  var submitButtonAccessibilityLabel: String
  
  var submitButtonDisabled: js.UndefOr[Boolean] = js.undefined
  
  var submitButtonText: String
}
object UpsellFormProps {
  
  inline def apply(
    onSubmit: /* arg */ js.Object & (Event[
      (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
    ]) => Callback,
    submitButtonAccessibilityLabel: String,
    submitButtonText: String
  ): UpsellFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[
      (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
    ])) => onSubmit(t0).runNow()), submitButtonAccessibilityLabel = submitButtonAccessibilityLabel.asInstanceOf[js.Any], submitButtonText = submitButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsellFormProps]
  }
  
  extension [Self <: UpsellFormProps](x: Self) {
    
    inline def setOnSubmit(
      value: /* arg */ js.Object & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
        ]) => Callback
    ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLButtonElement) & Element])
        ])) => value(t0).runNow()))
    
    inline def setSubmitButtonAccessibilityLabel(value: String): Self = StObject.set(x, "submitButtonAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonDisabled(value: Boolean): Self = StObject.set(x, "submitButtonDisabled", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonDisabledUndefined: Self = StObject.set(x, "submitButtonDisabled", js.undefined)
    
    inline def setSubmitButtonText(value: String): Self = StObject.set(x, "submitButtonText", value.asInstanceOf[js.Any])
  }
}
