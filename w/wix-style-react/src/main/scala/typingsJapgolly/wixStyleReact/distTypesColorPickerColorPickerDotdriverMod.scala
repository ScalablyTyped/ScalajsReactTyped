package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerDotdriverMod {
  
  trait ColorPickerDriver
    extends StObject
       with BaseDriver {
    
    def cancel(): Unit
    
    def clickOnPreviousColor(): Unit
    
    def confirm(): Unit
    
    def historyCurrentColor(): String
    
    def historyPanelExists(): Boolean
    
    def historyPreviousColor(): String
  }
  object ColorPickerDriver {
    
    inline def apply(
      cancel: Callback,
      clickOnPreviousColor: Callback,
      confirm: Callback,
      exists: CallbackTo[Boolean],
      historyCurrentColor: CallbackTo[String],
      historyPanelExists: CallbackTo[Boolean],
      historyPreviousColor: CallbackTo[String]
    ): ColorPickerDriver = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, clickOnPreviousColor = clickOnPreviousColor.toJsFn, confirm = confirm.toJsFn, exists = exists.toJsFn, historyCurrentColor = historyCurrentColor.toJsFn, historyPanelExists = historyPanelExists.toJsFn, historyPreviousColor = historyPreviousColor.toJsFn)
      __obj.asInstanceOf[ColorPickerDriver]
    }
    
    extension [Self <: ColorPickerDriver](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setClickOnPreviousColor(value: Callback): Self = StObject.set(x, "clickOnPreviousColor", value.toJsFn)
      
      inline def setConfirm(value: Callback): Self = StObject.set(x, "confirm", value.toJsFn)
      
      inline def setHistoryCurrentColor(value: CallbackTo[String]): Self = StObject.set(x, "historyCurrentColor", value.toJsFn)
      
      inline def setHistoryPanelExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "historyPanelExists", value.toJsFn)
      
      inline def setHistoryPreviousColor(value: CallbackTo[String]): Self = StObject.set(x, "historyPreviousColor", value.toJsFn)
    }
  }
}
