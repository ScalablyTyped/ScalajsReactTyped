package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerDotuniDotdriverMod {
  
  trait ColorPickerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def cancel(): js.Promise[Unit]
    
    def clickAddColor(): js.Promise[Unit]
    
    def clickOnPreviousColor(): js.Promise[Unit]
    
    def confirm(): js.Promise[Unit]
    
    def historyCurrentColor(): js.Promise[String]
    
    def historyPanelExists(): js.Promise[Boolean]
    
    def historyPreviousColor(): js.Promise[String]
    
    def selectHsbTab(): js.Promise[Unit]
    
    def selectRgbTab(): js.Promise[Unit]
  }
  object ColorPickerUniDriver {
    
    inline def apply(
      cancel: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      clickAddColor: CallbackTo[js.Promise[Unit]],
      clickOnPreviousColor: CallbackTo[js.Promise[Unit]],
      confirm: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      historyCurrentColor: CallbackTo[js.Promise[String]],
      historyPanelExists: CallbackTo[js.Promise[Boolean]],
      historyPreviousColor: CallbackTo[js.Promise[String]],
      selectHsbTab: CallbackTo[js.Promise[Unit]],
      selectRgbTab: CallbackTo[js.Promise[Unit]]
    ): ColorPickerUniDriver = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, click = click.toJsFn, clickAddColor = clickAddColor.toJsFn, clickOnPreviousColor = clickOnPreviousColor.toJsFn, confirm = confirm.toJsFn, element = element.toJsFn, exists = exists.toJsFn, historyCurrentColor = historyCurrentColor.toJsFn, historyPanelExists = historyPanelExists.toJsFn, historyPreviousColor = historyPreviousColor.toJsFn, selectHsbTab = selectHsbTab.toJsFn, selectRgbTab = selectRgbTab.toJsFn)
      __obj.asInstanceOf[ColorPickerUniDriver]
    }
    
    extension [Self <: ColorPickerUniDriver](x: Self) {
      
      inline def setCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setClickAddColor(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickAddColor", value.toJsFn)
      
      inline def setClickOnPreviousColor(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnPreviousColor", value.toJsFn)
      
      inline def setConfirm(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "confirm", value.toJsFn)
      
      inline def setHistoryCurrentColor(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "historyCurrentColor", value.toJsFn)
      
      inline def setHistoryPanelExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "historyPanelExists", value.toJsFn)
      
      inline def setHistoryPreviousColor(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "historyPreviousColor", value.toJsFn)
      
      inline def setSelectHsbTab(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "selectHsbTab", value.toJsFn)
      
      inline def setSelectRgbTab(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "selectRgbTab", value.toJsFn)
    }
  }
}
