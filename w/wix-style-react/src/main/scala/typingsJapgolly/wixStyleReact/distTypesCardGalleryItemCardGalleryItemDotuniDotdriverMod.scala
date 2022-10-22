package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardGalleryItemCardGalleryItemDotuniDotdriverMod {
  
  trait CardGalleryItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPrimaryAction(): js.Promise[Unit]
    
    def clickOnSecondaryAction(): js.Promise[Unit]
    
    def getBackgroundImageNode(): js.Promise[Any]
    
    def getBackgroundImageUrl(): js.Promise[String | Null]
    
    def getBadge(): js.Promise[Any]
    
    def getPrimaryActionLabel(): js.Promise[String]
    
    def getSecondaryActionLabel(): js.Promise[String]
    
    def getSettingsMenu(): js.Promise[Any]
    
    def getSubtitle(): js.Promise[String | Null]
    
    def getTitle(): js.Promise[String | Null]
    
    def hover(): js.Promise[Unit]
    
    def isPrimaryActionDisabled(): js.Promise[Boolean]
  }
  object CardGalleryItemUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnPrimaryAction: CallbackTo[js.Promise[Unit]],
      clickOnSecondaryAction: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getBackgroundImageNode: CallbackTo[js.Promise[Any]],
      getBackgroundImageUrl: CallbackTo[js.Promise[String | Null]],
      getBadge: CallbackTo[js.Promise[Any]],
      getPrimaryActionLabel: CallbackTo[js.Promise[String]],
      getSecondaryActionLabel: CallbackTo[js.Promise[String]],
      getSettingsMenu: CallbackTo[js.Promise[Any]],
      getSubtitle: CallbackTo[js.Promise[String | Null]],
      getTitle: CallbackTo[js.Promise[String | Null]],
      hover: CallbackTo[js.Promise[Unit]],
      isPrimaryActionDisabled: CallbackTo[js.Promise[Boolean]]
    ): CardGalleryItemUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnPrimaryAction = clickOnPrimaryAction.toJsFn, clickOnSecondaryAction = clickOnSecondaryAction.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getBackgroundImageNode = getBackgroundImageNode.toJsFn, getBackgroundImageUrl = getBackgroundImageUrl.toJsFn, getBadge = getBadge.toJsFn, getPrimaryActionLabel = getPrimaryActionLabel.toJsFn, getSecondaryActionLabel = getSecondaryActionLabel.toJsFn, getSettingsMenu = getSettingsMenu.toJsFn, getSubtitle = getSubtitle.toJsFn, getTitle = getTitle.toJsFn, hover = hover.toJsFn, isPrimaryActionDisabled = isPrimaryActionDisabled.toJsFn)
      __obj.asInstanceOf[CardGalleryItemUniDriver]
    }
    
    extension [Self <: CardGalleryItemUniDriver](x: Self) {
      
      inline def setClickOnPrimaryAction(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnPrimaryAction", value.toJsFn)
      
      inline def setClickOnSecondaryAction(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnSecondaryAction", value.toJsFn)
      
      inline def setGetBackgroundImageNode(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getBackgroundImageNode", value.toJsFn)
      
      inline def setGetBackgroundImageUrl(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getBackgroundImageUrl", value.toJsFn)
      
      inline def setGetBadge(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getBadge", value.toJsFn)
      
      inline def setGetPrimaryActionLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPrimaryActionLabel", value.toJsFn)
      
      inline def setGetSecondaryActionLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSecondaryActionLabel", value.toJsFn)
      
      inline def setGetSettingsMenu(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getSettingsMenu", value.toJsFn)
      
      inline def setGetSubtitle(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getSubtitle", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setHover(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hover", value.toJsFn)
      
      inline def setIsPrimaryActionDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPrimaryActionDisabled", value.toJsFn)
    }
  }
}
