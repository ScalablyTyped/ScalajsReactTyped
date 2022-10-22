package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputSize
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorInputColorInputDotuniDotdriverMod {
  
  trait ColorInputUniDriver
    extends StObject
       with BaseUniDriver {
    
    def cancel(): js.Promise[Unit]
    
    def clickColorViewer(): js.Promise[Unit]
    
    def colorPickerVisible(): js.Promise[Boolean]
    
    def confirm(): js.Promise[Unit]
    
    def enterText(text: String): js.Promise[Unit]
    
    def getPlaceholder(): js.Promise[String | Null]
    
    def getSize(): js.Promise[InputSize | Null]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getValue(): js.Promise[String]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
  }
  object ColorInputUniDriver {
    
    inline def apply(
      cancel: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      clickColorViewer: CallbackTo[js.Promise[Unit]],
      colorPickerVisible: CallbackTo[js.Promise[Boolean]],
      confirm: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[Unit],
      exists: CallbackTo[js.Promise[Boolean]],
      getPlaceholder: CallbackTo[js.Promise[String | Null]],
      getSize: CallbackTo[js.Promise[InputSize | Null]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      getValue: CallbackTo[js.Promise[String]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isDisabled: CallbackTo[js.Promise[Boolean]]
    ): ColorInputUniDriver = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, click = click.toJsFn, clickColorViewer = clickColorViewer.toJsFn, colorPickerVisible = colorPickerVisible.toJsFn, confirm = confirm.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getSize = getSize.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getValue = getValue.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[ColorInputUniDriver]
    }
    
    extension [Self <: ColorInputUniDriver](x: Self) {
      
      inline def setCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setClickColorViewer(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickColorViewer", value.toJsFn)
      
      inline def setColorPickerVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "colorPickerVisible", value.toJsFn)
      
      inline def setConfirm(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "confirm", value.toJsFn)
      
      inline def setEnterText(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setGetPlaceholder(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[InputSize | Null]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    }
  }
}
