package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.anon.PartialFile
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsFilePickerButtonTestFilePickerButtonDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/test/FilePickerButton.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filePickerButtonUniDriverFactory(base: UniDriver[Any]): FilePickerButtonUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("filePickerButtonUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[FilePickerButtonUniDriver]
  
  trait FilePickerButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getAccept(): js.Promise[String]
    
    def getContent(): js.Promise[js.Array[Any]]
    
    def getText(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isRequired(): js.Promise[Boolean]
    
    def selectFile(file: PartialFile): js.Promise[Unit]
  }
  object FilePickerButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAccept: CallbackTo[js.Promise[String]],
      getContent: CallbackTo[js.Promise[js.Array[Any]]],
      getText: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isRequired: CallbackTo[js.Promise[Boolean]],
      selectFile: PartialFile => js.Promise[Unit]
    ): FilePickerButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAccept = getAccept.toJsFn, getContent = getContent.toJsFn, getText = getText.toJsFn, isDisabled = isDisabled.toJsFn, isRequired = isRequired.toJsFn, selectFile = js.Any.fromFunction1(selectFile))
      __obj.asInstanceOf[FilePickerButtonUniDriver]
    }
    
    extension [Self <: FilePickerButtonUniDriver](x: Self) {
      
      inline def setGetAccept(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAccept", value.toJsFn)
      
      inline def setGetContent(value: CallbackTo[js.Promise[js.Array[Any]]]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsRequired(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRequired", value.toJsFn)
      
      inline def setSelectFile(value: PartialFile => js.Promise[Unit]): Self = StObject.set(x, "selectFile", js.Any.fromFunction1(value))
    }
  }
}
