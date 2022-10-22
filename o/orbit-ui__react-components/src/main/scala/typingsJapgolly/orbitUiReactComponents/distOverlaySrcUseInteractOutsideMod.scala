package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUseInteractOutsideMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useInteractOutside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInteractOutside(rootElementRef: RefHandle[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractOutside")(rootElementRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useInteractOutside(rootElementRef: RefHandle[HTMLElement], hasIsDisabledOnInteractOutside: UseInteractOutsideOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInteractOutside")(rootElementRef.asInstanceOf[js.Any], hasIsDisabledOnInteractOutside.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait UseInteractOutsideOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onInteractOutside: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
  }
  object UseInteractOutsideOptions {
    
    inline def apply(): UseInteractOutsideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInteractOutsideOptions]
    }
    
    extension [Self <: UseInteractOutsideOptions](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnInteractOutside(value: /* e */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onInteractOutside", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnInteractOutsideUndefined: Self = StObject.set(x, "onInteractOutside", js.undefined)
    }
  }
}
