package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAccordionAccordionDotuniDotdriverMod {
  
  trait AccordionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickItemAt(idx: Double): js.Promise[Unit]
    
    def clickToggleButtonAt(idx: Double): js.Promise[Unit]
    
    def getHorizontalPadding(): js.Promise[js.UndefOr[none_ | tiny | small | medium | large]]
    
    def getItemSubtitleAt(idx: Double): js.Promise[String]
    
    def getItemTitleAt(idx: Double): js.Promise[String]
    
    def getSkin(): js.Promise[js.UndefOr[light | standard | neutral]]
    
    def getToggleButtonLabelAt(idx: Double): js.Promise[String]
    
    def getTransitionSpeed(): js.Promise[String]
    
    def isIconExistsAt(idx: Double): js.Promise[Boolean]
    
    def isItemExpandedAt(idx: Double): js.Promise[Boolean]
  }
  object AccordionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickItemAt: Double => js.Promise[Unit],
      clickToggleButtonAt: Double => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getHorizontalPadding: CallbackTo[js.Promise[js.UndefOr[none_ | tiny | small | medium | large]]],
      getItemSubtitleAt: Double => js.Promise[String],
      getItemTitleAt: Double => js.Promise[String],
      getSkin: CallbackTo[js.Promise[js.UndefOr[light | standard | neutral]]],
      getToggleButtonLabelAt: Double => js.Promise[String],
      getTransitionSpeed: CallbackTo[js.Promise[String]],
      isIconExistsAt: Double => js.Promise[Boolean],
      isItemExpandedAt: Double => js.Promise[Boolean]
    ): AccordionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickItemAt = js.Any.fromFunction1(clickItemAt), clickToggleButtonAt = js.Any.fromFunction1(clickToggleButtonAt), element = element.toJsFn, exists = exists.toJsFn, getHorizontalPadding = getHorizontalPadding.toJsFn, getItemSubtitleAt = js.Any.fromFunction1(getItemSubtitleAt), getItemTitleAt = js.Any.fromFunction1(getItemTitleAt), getSkin = getSkin.toJsFn, getToggleButtonLabelAt = js.Any.fromFunction1(getToggleButtonLabelAt), getTransitionSpeed = getTransitionSpeed.toJsFn, isIconExistsAt = js.Any.fromFunction1(isIconExistsAt), isItemExpandedAt = js.Any.fromFunction1(isItemExpandedAt))
      __obj.asInstanceOf[AccordionUniDriver]
    }
    
    extension [Self <: AccordionUniDriver](x: Self) {
      
      inline def setClickItemAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickItemAt", js.Any.fromFunction1(value))
      
      inline def setClickToggleButtonAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickToggleButtonAt", js.Any.fromFunction1(value))
      
      inline def setGetHorizontalPadding(value: CallbackTo[js.Promise[js.UndefOr[none_ | tiny | small | medium | large]]]): Self = StObject.set(x, "getHorizontalPadding", value.toJsFn)
      
      inline def setGetItemSubtitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemSubtitleAt", js.Any.fromFunction1(value))
      
      inline def setGetItemTitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getItemTitleAt", js.Any.fromFunction1(value))
      
      inline def setGetSkin(value: CallbackTo[js.Promise[js.UndefOr[light | standard | neutral]]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetToggleButtonLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getToggleButtonLabelAt", js.Any.fromFunction1(value))
      
      inline def setGetTransitionSpeed(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTransitionSpeed", value.toJsFn)
      
      inline def setIsIconExistsAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isIconExistsAt", js.Any.fromFunction1(value))
      
      inline def setIsItemExpandedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isItemExpandedAt", js.Any.fromFunction1(value))
    }
  }
}
