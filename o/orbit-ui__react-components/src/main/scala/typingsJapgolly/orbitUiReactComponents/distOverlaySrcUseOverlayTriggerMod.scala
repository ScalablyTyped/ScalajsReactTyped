package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.anon.OnClick
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyUp
import typingsJapgolly.orbitUiReactComponents.anon.OnMouseEnter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUseOverlayTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useOverlayTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOverlayTrigger(isOpen: Boolean): OnClick | OnKeyUp | OnMouseEnter = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any]).asInstanceOf[OnClick | OnKeyUp | OnMouseEnter]
  inline def useOverlayTrigger(isOpen: Boolean, hasHideOnLeaveTriggerOnShowOnHideIsDisabled: UseOverlayTriggerOptions): OnClick | OnKeyUp | OnMouseEnter = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayTrigger")(isOpen.asInstanceOf[js.Any], hasHideOnLeaveTriggerOnShowOnHideIsDisabled.asInstanceOf[js.Any])).asInstanceOf[OnClick | OnKeyUp | OnMouseEnter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.none
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.click
    - typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.hover
  */
  trait OverlayTrigger extends StObject
  object OverlayTrigger {
    
    inline def click: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.click = "click".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.click]
    
    inline def hover: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.hover = "hover".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.hover]
    
    inline def none: typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.none = "none".asInstanceOf[typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.none]
  }
  
  trait UseOverlayTriggerOptions extends StObject {
    
    var hideOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var trigger: js.UndefOr[OverlayTrigger] = js.undefined
  }
  object UseOverlayTriggerOptions {
    
    inline def apply(): UseOverlayTriggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseOverlayTriggerOptions]
    }
    
    extension [Self <: UseOverlayTriggerOptions](x: Self) {
      
      inline def setHideOnLeave(value: Boolean): Self = StObject.set(x, "hideOnLeave", value.asInstanceOf[js.Any])
      
      inline def setHideOnLeaveUndefined: Self = StObject.set(x, "hideOnLeave", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnHide(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* event */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setTrigger(value: OverlayTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
