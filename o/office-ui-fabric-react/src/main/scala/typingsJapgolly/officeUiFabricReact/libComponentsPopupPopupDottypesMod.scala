package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.anon.ContainsFocus
import typingsJapgolly.officeUiFabricReact.libComponentsPopupPopupMod.Popup
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPopupPopupDottypesMod {
  
  trait IPopupProps
    extends StObject
       with HTMLAttributes[Popup] {
    
    /**
      * Defines the element id referencing the element containing the description for the popup.
      */
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Accessible label text for the popup.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      *  Defines the element id referencing the element containing label text for popup.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * A callback function for when the popup is dismissed from the close button or light dismiss. If provided, will
      * handle escape keypresses and call this. The event will be stopped/canceled.
      */
    var onDismiss: js.UndefOr[
        js.Function1[
          /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], 
          Any
        ]
      ] = js.undefined
    
    /**
      * Called when the component is unmounting, and focus needs to be restored.
      * Argument passed down contains two variables, the element that the underlying
      * popup believes focus should go to * and whether or not the popup currently
      * contains focus. If this is provided, focus will not be restored automatically,
      * you'll need to call originalElement.focus()
      */
    var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.undefined
    
    /**
      * Aria role for popup
      */
    @JSName("role")
    var role_IPopupProps: js.UndefOr[String] = js.undefined
    
    /**
      * If true, when this component is unmounted, focus will be restored to the element that had focus when the component
      * first mounted.
      * @defaultvalue true
      * @deprecated use restoreFocus callback instead
      */
    var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
  }
  object IPopupProps {
    
    inline def apply(): IPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupProps]
    }
    
    extension [Self <: IPopupProps](x: Self) {
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setOnDismiss(
        value: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]] => Any
      ): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnRestoreFocus(value: /* options */ ContainsFocus => Callback): Self = StObject.set(x, "onRestoreFocus", js.Any.fromFunction1((t0: /* options */ ContainsFocus) => value(t0).runNow()))
      
      inline def setOnRestoreFocusUndefined: Self = StObject.set(x, "onRestoreFocus", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShouldRestoreFocus(value: Boolean): Self = StObject.set(x, "shouldRestoreFocus", value.asInstanceOf[js.Any])
      
      inline def setShouldRestoreFocusUndefined: Self = StObject.set(x, "shouldRestoreFocus", js.undefined)
    }
  }
}
