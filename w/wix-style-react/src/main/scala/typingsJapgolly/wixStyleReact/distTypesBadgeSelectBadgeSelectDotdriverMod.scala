package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectBadgeSelectDotdriverMod {
  
  trait BadgeSelectDriver
    extends StObject
       with BaseDriver {
    
    def clickAtOption(index: Double): Unit
    
    def text(): String
  }
  object BadgeSelectDriver {
    
    inline def apply(clickAtOption: Double => Callback, exists: CallbackTo[Boolean], text: CallbackTo[String]): BadgeSelectDriver = {
      val __obj = js.Dynamic.literal(clickAtOption = js.Any.fromFunction1((t0: Double) => clickAtOption(t0).runNow()), exists = exists.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[BadgeSelectDriver]
    }
    
    extension [Self <: BadgeSelectDriver](x: Self) {
      
      inline def setClickAtOption(value: Double => Callback): Self = StObject.set(x, "clickAtOption", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
}
