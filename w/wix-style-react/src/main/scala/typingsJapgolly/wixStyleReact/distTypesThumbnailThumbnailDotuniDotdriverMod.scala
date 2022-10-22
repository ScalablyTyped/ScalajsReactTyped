package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThumbnailThumbnailDotuniDotdriverMod {
  
  trait ThumbnailUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getBackgroundImage(): UniDriver[Any]
    
    def getDescription(): js.Promise[String]
    
    def getHeight(): js.Promise[String]
    
    def getImage(): UniDriver[Any]
    
    def getSelectedIcon(): UniDriver[Any]
    
    def getTitle(): js.Promise[String]
    
    def getWidth(): js.Promise[String]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isSelected(): js.Promise[Boolean]
  }
  object ThumbnailUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getBackgroundImage: CallbackTo[UniDriver[Any]],
      getDescription: CallbackTo[js.Promise[String]],
      getHeight: CallbackTo[js.Promise[String]],
      getImage: CallbackTo[UniDriver[Any]],
      getSelectedIcon: CallbackTo[UniDriver[Any]],
      getTitle: CallbackTo[js.Promise[String]],
      getWidth: CallbackTo[js.Promise[String]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isSelected: CallbackTo[js.Promise[Boolean]]
    ): ThumbnailUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getBackgroundImage = getBackgroundImage.toJsFn, getDescription = getDescription.toJsFn, getHeight = getHeight.toJsFn, getImage = getImage.toJsFn, getSelectedIcon = getSelectedIcon.toJsFn, getTitle = getTitle.toJsFn, getWidth = getWidth.toJsFn, isDisabled = isDisabled.toJsFn, isSelected = isSelected.toJsFn)
      __obj.asInstanceOf[ThumbnailUniDriver]
    }
    
    extension [Self <: ThumbnailUniDriver](x: Self) {
      
      inline def setGetBackgroundImage(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getBackgroundImage", value.toJsFn)
      
      inline def setGetDescription(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setGetHeight(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetImage(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getImage", value.toJsFn)
      
      inline def setGetSelectedIcon(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getSelectedIcon", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
    }
  }
}
