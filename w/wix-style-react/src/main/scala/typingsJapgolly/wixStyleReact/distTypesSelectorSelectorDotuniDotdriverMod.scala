package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesTextTextDotuniDotdriverMod.TextUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorSelectorDotuniDotdriverMod {
  
  trait SelectorUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getExtraNode(): js.Promise[HTMLElement]
    
    def getImage(): js.Promise[HTMLElement]
    
    def hasExtraNode(): js.Promise[Boolean]
    
    def hasImage(): js.Promise[Boolean]
    
    def isChecked(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isImageCinema(): js.Promise[Boolean]
    
    def isImageCircle(): js.Promise[Boolean]
    
    def isImageLarge(): js.Promise[Boolean]
    
    def isImagePortrait(): js.Promise[Boolean]
    
    def isImageRectangular(): js.Promise[Boolean]
    
    def isImageSmall(): js.Promise[Boolean]
    
    def isImageTiny(): js.Promise[Boolean]
    
    def isIndeterminate(): js.Promise[Boolean]
    
    def subtitleTextDriver(): TextUniDriver
    
    def titleTextDriver(): TextUniDriver
    
    def toggle(): js.Promise[Unit]
    
    def toggleType(): js.Promise[String]
  }
  object SelectorUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getExtraNode: CallbackTo[js.Promise[HTMLElement]],
      getImage: CallbackTo[js.Promise[HTMLElement]],
      hasExtraNode: CallbackTo[js.Promise[Boolean]],
      hasImage: CallbackTo[js.Promise[Boolean]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isImageCinema: CallbackTo[js.Promise[Boolean]],
      isImageCircle: CallbackTo[js.Promise[Boolean]],
      isImageLarge: CallbackTo[js.Promise[Boolean]],
      isImagePortrait: CallbackTo[js.Promise[Boolean]],
      isImageRectangular: CallbackTo[js.Promise[Boolean]],
      isImageSmall: CallbackTo[js.Promise[Boolean]],
      isImageTiny: CallbackTo[js.Promise[Boolean]],
      isIndeterminate: CallbackTo[js.Promise[Boolean]],
      subtitleTextDriver: CallbackTo[TextUniDriver],
      titleTextDriver: CallbackTo[TextUniDriver],
      toggle: CallbackTo[js.Promise[Unit]],
      toggleType: CallbackTo[js.Promise[String]]
    ): SelectorUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getExtraNode = getExtraNode.toJsFn, getImage = getImage.toJsFn, hasExtraNode = hasExtraNode.toJsFn, hasImage = hasImage.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isImageCinema = isImageCinema.toJsFn, isImageCircle = isImageCircle.toJsFn, isImageLarge = isImageLarge.toJsFn, isImagePortrait = isImagePortrait.toJsFn, isImageRectangular = isImageRectangular.toJsFn, isImageSmall = isImageSmall.toJsFn, isImageTiny = isImageTiny.toJsFn, isIndeterminate = isIndeterminate.toJsFn, subtitleTextDriver = subtitleTextDriver.toJsFn, titleTextDriver = titleTextDriver.toJsFn, toggle = toggle.toJsFn, toggleType = toggleType.toJsFn)
      __obj.asInstanceOf[SelectorUniDriver]
    }
    
    extension [Self <: SelectorUniDriver](x: Self) {
      
      inline def setGetExtraNode(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getExtraNode", value.toJsFn)
      
      inline def setGetImage(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getImage", value.toJsFn)
      
      inline def setHasExtraNode(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasExtraNode", value.toJsFn)
      
      inline def setHasImage(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasImage", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsImageCinema(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageCinema", value.toJsFn)
      
      inline def setIsImageCircle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageCircle", value.toJsFn)
      
      inline def setIsImageLarge(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageLarge", value.toJsFn)
      
      inline def setIsImagePortrait(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImagePortrait", value.toJsFn)
      
      inline def setIsImageRectangular(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageRectangular", value.toJsFn)
      
      inline def setIsImageSmall(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageSmall", value.toJsFn)
      
      inline def setIsImageTiny(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageTiny", value.toJsFn)
      
      inline def setIsIndeterminate(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isIndeterminate", value.toJsFn)
      
      inline def setSubtitleTextDriver(value: CallbackTo[TextUniDriver]): Self = StObject.set(x, "subtitleTextDriver", value.toJsFn)
      
      inline def setTitleTextDriver(value: CallbackTo[TextUniDriver]): Self = StObject.set(x, "titleTextDriver", value.toJsFn)
      
      inline def setToggle(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "toggle", value.toJsFn)
      
      inline def setToggleType(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "toggleType", value.toJsFn)
    }
  }
}
