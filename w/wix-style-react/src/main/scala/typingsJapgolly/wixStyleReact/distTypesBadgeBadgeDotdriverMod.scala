package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSize
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSkin
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeType
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeBadgeDotdriverMod {
  
  trait BadgeDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getSize(): BadgeSize
    
    def getSkin(): BadgeSkin
    
    def getType(): BadgeType
    
    def hasClickCursor(): Boolean
    
    def isUppercase(): Boolean
    
    def text(): String
  }
  object BadgeDriver {
    
    inline def apply(
      click: Callback,
      exists: CallbackTo[Boolean],
      getSize: CallbackTo[BadgeSize],
      getSkin: CallbackTo[BadgeSkin],
      getType: CallbackTo[BadgeType],
      hasClickCursor: CallbackTo[Boolean],
      isUppercase: CallbackTo[Boolean],
      text: CallbackTo[String]
    ): BadgeDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getSize = getSize.toJsFn, getSkin = getSkin.toJsFn, getType = getType.toJsFn, hasClickCursor = hasClickCursor.toJsFn, isUppercase = isUppercase.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[BadgeDriver]
    }
    
    extension [Self <: BadgeDriver](x: Self) {
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[BadgeSize]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetSkin(value: CallbackTo[BadgeSkin]): Self = StObject.set(x, "getSkin", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[BadgeType]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setHasClickCursor(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasClickCursor", value.toJsFn)
      
      inline def setIsUppercase(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUppercase", value.toJsFn)
      
      inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
}
