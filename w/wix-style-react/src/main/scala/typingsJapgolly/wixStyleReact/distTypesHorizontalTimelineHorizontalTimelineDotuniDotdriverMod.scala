package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHorizontalTimelineHorizontalTimelineDotuniDotdriverMod {
  
  trait HorizontalTimelineUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabel(id: Double): js.Promise[String]
    
    def getSkin(): js.Promise[dark | standard]
  }
  object HorizontalTimelineUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLabel: Double => js.Promise[String],
      getSkin: CallbackTo[js.Promise[dark | standard]]
    ): HorizontalTimelineUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLabel = js.Any.fromFunction1(getLabel), getSkin = getSkin.toJsFn)
      __obj.asInstanceOf[HorizontalTimelineUniDriver]
    }
    
    extension [Self <: HorizontalTimelineUniDriver](x: Self) {
      
      inline def setGetLabel(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setGetSkin(value: CallbackTo[js.Promise[dark | standard]]): Self = StObject.set(x, "getSkin", value.toJsFn)
    }
  }
}
