package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesTextTextDotdriverMod.TextDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorSelectorDotdriverMod {
  
  trait SelectorDriver
    extends StObject
       with BaseDriver {
    
    def getExtraNode(): HTMLElement
    
    def getImage(): HTMLElement
    
    def hasExtraNode(): Boolean
    
    def hasImage(): Boolean
    
    def isChecked(): Boolean
    
    def isDisabled(): Boolean
    
    def isImageCinema(): Boolean
    
    def isImageCircle(): Boolean
    
    def isImageLarge(): Boolean
    
    def isImagePortrait(): Boolean
    
    def isImageRectangular(): Boolean
    
    def isImageSmall(): Boolean
    
    def isImageTiny(): Boolean
    
    def subtitleTextDriver(): TextDriver
    
    def titleTextDriver(): TextDriver
    
    def toggle(): Unit
    
    def toggleType(): String
  }
  object SelectorDriver {
    
    inline def apply(
      exists: CallbackTo[Boolean],
      getExtraNode: CallbackTo[HTMLElement],
      getImage: CallbackTo[HTMLElement],
      hasExtraNode: CallbackTo[Boolean],
      hasImage: CallbackTo[Boolean],
      isChecked: CallbackTo[Boolean],
      isDisabled: CallbackTo[Boolean],
      isImageCinema: CallbackTo[Boolean],
      isImageCircle: CallbackTo[Boolean],
      isImageLarge: CallbackTo[Boolean],
      isImagePortrait: CallbackTo[Boolean],
      isImageRectangular: CallbackTo[Boolean],
      isImageSmall: CallbackTo[Boolean],
      isImageTiny: CallbackTo[Boolean],
      subtitleTextDriver: CallbackTo[TextDriver],
      titleTextDriver: CallbackTo[TextDriver],
      toggle: Callback,
      toggleType: CallbackTo[String]
    ): SelectorDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, getExtraNode = getExtraNode.toJsFn, getImage = getImage.toJsFn, hasExtraNode = hasExtraNode.toJsFn, hasImage = hasImage.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isImageCinema = isImageCinema.toJsFn, isImageCircle = isImageCircle.toJsFn, isImageLarge = isImageLarge.toJsFn, isImagePortrait = isImagePortrait.toJsFn, isImageRectangular = isImageRectangular.toJsFn, isImageSmall = isImageSmall.toJsFn, isImageTiny = isImageTiny.toJsFn, subtitleTextDriver = subtitleTextDriver.toJsFn, titleTextDriver = titleTextDriver.toJsFn, toggle = toggle.toJsFn, toggleType = toggleType.toJsFn)
      __obj.asInstanceOf[SelectorDriver]
    }
    
    extension [Self <: SelectorDriver](x: Self) {
      
      inline def setGetExtraNode(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getExtraNode", value.toJsFn)
      
      inline def setGetImage(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getImage", value.toJsFn)
      
      inline def setHasExtraNode(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasExtraNode", value.toJsFn)
      
      inline def setHasImage(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasImage", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsImageCinema(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageCinema", value.toJsFn)
      
      inline def setIsImageCircle(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageCircle", value.toJsFn)
      
      inline def setIsImageLarge(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageLarge", value.toJsFn)
      
      inline def setIsImagePortrait(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImagePortrait", value.toJsFn)
      
      inline def setIsImageRectangular(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageRectangular", value.toJsFn)
      
      inline def setIsImageSmall(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageSmall", value.toJsFn)
      
      inline def setIsImageTiny(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageTiny", value.toJsFn)
      
      inline def setSubtitleTextDriver(value: CallbackTo[TextDriver]): Self = StObject.set(x, "subtitleTextDriver", value.toJsFn)
      
      inline def setTitleTextDriver(value: CallbackTo[TextDriver]): Self = StObject.set(x, "titleTextDriver", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
      
      inline def setToggleType(value: CallbackTo[String]): Self = StObject.set(x, "toggleType", value.toJsFn)
    }
  }
}
