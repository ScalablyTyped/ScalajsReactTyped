package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.File
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropzoneDropzoneDotuniDotdriverMod {
  
  trait DropzoneUniDriver
    extends StObject
       with BaseUniDriver {
    
    def dropFiles(files: js.Array[File]): js.Promise[Unit]
    
    def getContentElement(): UniDriver[Any]
    
    def getOverlayElement(): UniDriver[Any]
  }
  object DropzoneUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      dropFiles: js.Array[File] => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getContentElement: CallbackTo[UniDriver[Any]],
      getOverlayElement: CallbackTo[UniDriver[Any]]
    ): DropzoneUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, dropFiles = js.Any.fromFunction1(dropFiles), element = element.toJsFn, exists = exists.toJsFn, getContentElement = getContentElement.toJsFn, getOverlayElement = getOverlayElement.toJsFn)
      __obj.asInstanceOf[DropzoneUniDriver]
    }
    
    extension [Self <: DropzoneUniDriver](x: Self) {
      
      inline def setDropFiles(value: js.Array[File] => js.Promise[Unit]): Self = StObject.set(x, "dropFiles", js.Any.fromFunction1(value))
      
      inline def setGetContentElement(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getContentElement", value.toJsFn)
      
      inline def setGetOverlayElement(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getOverlayElement", value.toJsFn)
    }
  }
}
