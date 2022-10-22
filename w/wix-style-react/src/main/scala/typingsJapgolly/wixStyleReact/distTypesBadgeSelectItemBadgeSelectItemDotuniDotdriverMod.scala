package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectItemBadgeSelectItemDotuniDotdriverMod {
  
  trait BadgeSelectItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSubtitleText(): js.Promise[String]
    
    def getText(): js.Promise[String]
  }
  object BadgeSelectItemUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSubtitleText: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]]
    ): BadgeSelectItemUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSubtitleText = getSubtitleText.toJsFn, getText = getText.toJsFn)
      __obj.asInstanceOf[BadgeSelectItemUniDriver]
    }
    
    extension [Self <: BadgeSelectItemUniDriver](x: Self) {
      
      inline def setGetSubtitleText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubtitleText", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
    }
  }
}
