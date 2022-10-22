package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarGroupAvatarGroupDotuniDotdriverMod {
  
  trait AvatarGroupUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getMoreIndicatorContent(): js.Promise[String]
    
    def getVisibleAvatarTextContentByIndex(index: Double): js.Promise[String]
    
    def getVisibleAvatarsCount(): js.Promise[Double]
    
    def isMoreIndicatorExist(): js.Promise[Boolean]
  }
  object AvatarGroupUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getMoreIndicatorContent: CallbackTo[js.Promise[String]],
      getVisibleAvatarTextContentByIndex: Double => js.Promise[String],
      getVisibleAvatarsCount: CallbackTo[js.Promise[Double]],
      isMoreIndicatorExist: CallbackTo[js.Promise[Boolean]]
    ): AvatarGroupUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getMoreIndicatorContent = getMoreIndicatorContent.toJsFn, getVisibleAvatarTextContentByIndex = js.Any.fromFunction1(getVisibleAvatarTextContentByIndex), getVisibleAvatarsCount = getVisibleAvatarsCount.toJsFn, isMoreIndicatorExist = isMoreIndicatorExist.toJsFn)
      __obj.asInstanceOf[AvatarGroupUniDriver]
    }
    
    extension [Self <: AvatarGroupUniDriver](x: Self) {
      
      inline def setGetMoreIndicatorContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMoreIndicatorContent", value.toJsFn)
      
      inline def setGetVisibleAvatarTextContentByIndex(value: Double => js.Promise[String]): Self = StObject.set(x, "getVisibleAvatarTextContentByIndex", js.Any.fromFunction1(value))
      
      inline def setGetVisibleAvatarsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getVisibleAvatarsCount", value.toJsFn)
      
      inline def setIsMoreIndicatorExist(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isMoreIndicatorExist", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.text
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.placeholder
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.image
  */
  trait contentType extends StObject
  object contentType {
    
    inline def image: typingsJapgolly.wixStyleReact.wixStyleReactStrings.image = "image".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.image]
    
    inline def placeholder: typingsJapgolly.wixStyleReact.wixStyleReactStrings.placeholder = "placeholder".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.placeholder]
    
    inline def text: typingsJapgolly.wixStyleReact.wixStyleReactStrings.text = "text".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.text]
  }
}
