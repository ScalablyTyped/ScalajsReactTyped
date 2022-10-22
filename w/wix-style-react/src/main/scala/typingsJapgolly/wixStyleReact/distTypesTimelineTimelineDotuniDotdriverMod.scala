package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineTimelineDotuniDotdriverMod {
  
  trait TimelineUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getLabelText(idx: Double): js.Promise[String]
    
    def getSuffixText(idx: Double): js.Promise[String]
  }
  object TimelineUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getLabelText: Double => js.Promise[String],
      getSuffixText: Double => js.Promise[String]
    ): TimelineUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getLabelText = js.Any.fromFunction1(getLabelText), getSuffixText = js.Any.fromFunction1(getSuffixText))
      __obj.asInstanceOf[TimelineUniDriver]
    }
    
    extension [Self <: TimelineUniDriver](x: Self) {
      
      inline def setGetLabelText(value: Double => js.Promise[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetSuffixText(value: Double => js.Promise[String]): Self = StObject.set(x, "getSuffixText", js.Any.fromFunction1(value))
    }
  }
}
