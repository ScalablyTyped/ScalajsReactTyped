package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.BaseDriver
import typingsJapgolly.wixUiCore.distEsSrcCommonBaseDriverDotprotractorMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTimePickerTimePickerDotprotractorDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/TimePicker.protractor.driver", "timePickerDriverFactory")
  @js.native
  val timePickerDriverFactory: DriverFactory[TimePickerDriver] = js.native
  
  trait TimePickerDriver
    extends StObject
       with BaseDriver {
    
    def blur(): js.Promise[Unit]
    
    def clickTickerDown(): js.Promise[Unit]
    
    def clickTickerUp(): js.Promise[Unit]
    
    def focus(): js.Promise[Unit]
    
    def getValue(): js.Promise[String]
    
    def mouseEnter(): js.Promise[Unit]
    
    def pressKeyArrowLeft(): js.Promise[Unit]
    
    def pressKeyArrowRight(): js.Promise[Unit]
  }
  object TimePickerDriver {
    
    inline def apply(
      blur: CallbackTo[js.Promise[Unit]],
      clickTickerDown: CallbackTo[js.Promise[Unit]],
      clickTickerUp: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[ElementFinder],
      focus: CallbackTo[js.Promise[Unit]],
      getValue: CallbackTo[js.Promise[String]],
      mouseEnter: CallbackTo[js.Promise[Unit]],
      pressKeyArrowLeft: CallbackTo[js.Promise[Unit]],
      pressKeyArrowRight: CallbackTo[js.Promise[Unit]]
    ): TimePickerDriver = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, clickTickerDown = clickTickerDown.toJsFn, clickTickerUp = clickTickerUp.toJsFn, element = element.toJsFn, focus = focus.toJsFn, getValue = getValue.toJsFn, mouseEnter = mouseEnter.toJsFn, pressKeyArrowLeft = pressKeyArrowLeft.toJsFn, pressKeyArrowRight = pressKeyArrowRight.toJsFn)
      __obj.asInstanceOf[TimePickerDriver]
    }
    
    extension [Self <: TimePickerDriver](x: Self) {
      
      inline def setBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setClickTickerDown(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickTickerDown", value.toJsFn)
      
      inline def setClickTickerUp(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickTickerUp", value.toJsFn)
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
      
      inline def setPressKeyArrowLeft(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "pressKeyArrowLeft", value.toJsFn)
      
      inline def setPressKeyArrowRight(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "pressKeyArrowRight", value.toJsFn)
    }
  }
}
