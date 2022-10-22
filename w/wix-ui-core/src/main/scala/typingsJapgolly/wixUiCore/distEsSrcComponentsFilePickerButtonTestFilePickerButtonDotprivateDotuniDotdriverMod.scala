package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.anon.PartialFile
import typingsJapgolly.wixUiCore.distEsSrcComponentsFilePickerButtonTestFilePickerButtonDotuniDotdriverMod.FilePickerButtonUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsFilePickerButtonTestFilePickerButtonDotprivateDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/test/FilePickerButton.private.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filePickerButtonPrivateUniDriverFactory(base: UniDriver[Any]): FilePickerButtonPrivateUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("filePickerButtonPrivateUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[FilePickerButtonPrivateUniDriver]
  
  trait FilePickerButtonPrivateUniDriver
    extends StObject
       with FilePickerButtonUniDriver {
    
    def focusChooseFileButton(): js.Promise[Unit]
    
    def getChooseFileButtonAttribute(attr: String): js.Promise[String]
    
    def getFileInputAttribute(attr: String): js.Promise[String]
    
    def getNativeInput(): js.Promise[HTMLInputElement]
  }
  object FilePickerButtonPrivateUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      focusChooseFileButton: CallbackTo[js.Promise[Unit]],
      getAccept: CallbackTo[js.Promise[String]],
      getChooseFileButtonAttribute: String => js.Promise[String],
      getContent: CallbackTo[js.Promise[js.Array[Any]]],
      getFileInputAttribute: String => js.Promise[String],
      getNativeInput: CallbackTo[js.Promise[HTMLInputElement]],
      getText: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isRequired: CallbackTo[js.Promise[Boolean]],
      selectFile: PartialFile => js.Promise[Unit]
    ): FilePickerButtonPrivateUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focusChooseFileButton = focusChooseFileButton.toJsFn, getAccept = getAccept.toJsFn, getChooseFileButtonAttribute = js.Any.fromFunction1(getChooseFileButtonAttribute), getContent = getContent.toJsFn, getFileInputAttribute = js.Any.fromFunction1(getFileInputAttribute), getNativeInput = getNativeInput.toJsFn, getText = getText.toJsFn, isDisabled = isDisabled.toJsFn, isRequired = isRequired.toJsFn, selectFile = js.Any.fromFunction1(selectFile))
      __obj.asInstanceOf[FilePickerButtonPrivateUniDriver]
    }
    
    extension [Self <: FilePickerButtonPrivateUniDriver](x: Self) {
      
      inline def setFocusChooseFileButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focusChooseFileButton", value.toJsFn)
      
      inline def setGetChooseFileButtonAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getChooseFileButtonAttribute", js.Any.fromFunction1(value))
      
      inline def setGetFileInputAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getFileInputAttribute", js.Any.fromFunction1(value))
      
      inline def setGetNativeInput(value: CallbackTo[js.Promise[HTMLInputElement]]): Self = StObject.set(x, "getNativeInput", value.toJsFn)
    }
  }
}
