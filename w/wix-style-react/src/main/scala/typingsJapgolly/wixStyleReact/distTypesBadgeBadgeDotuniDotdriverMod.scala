package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSize
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSkin
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeType
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeBadgeDotuniDotdriverMod {
  
  trait BadgeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSize(): js.Promise[BadgeSize]
    
    def getSkin(): js.Promise[BadgeSkin]
    
    def getType(): js.Promise[BadgeType]
    
    def hasClickCursor(): js.Promise[Boolean]
    
    def isUppercase(): js.Promise[Boolean]
    
    def text(): js.Promise[String]
  }
  object BadgeUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getSize: CallbackTo[js.Promise[BadgeSize]],
      getSkin: CallbackTo[js.Promise[BadgeSkin]],
      getType: CallbackTo[js.Promise[BadgeType]],
      hasClickCursor: CallbackTo[js.Promise[Boolean]],
      isUppercase: CallbackTo[js.Promise[Boolean]],
      text: CallbackTo[js.Promise[String]]
    ): BadgeUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSize = getSize.toJsFn, getSkin = getSkin.toJsFn, getType = getType.toJsFn, hasClickCursor = hasClickCursor.toJsFn, isUppercase = isUppercase.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[BadgeUniDriver]
    }
    
    extension [Self <: BadgeUniDriver](x: Self) {
      
      inline def setGetSize(value: CallbackTo[js.Promise[BadgeSize]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[js.Promise[BadgeSkin]]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[js.Promise[BadgeType]]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setHasClickCursor(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasClickCursor", value.toJsFn)
      
      inline def setIsUppercase(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isUppercase", value.toJsFn)
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
}
