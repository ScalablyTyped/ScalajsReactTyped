package typingsJapgolly.dayjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsTomorrowMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isTomorrow", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsTomorrowMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isTomorrow(): Boolean
    }
    object Dayjs {
      
      inline def apply(isTomorrow: CallbackTo[Boolean]): Dayjs = {
        val __obj = js.Dynamic.literal(isTomorrow = isTomorrow.toJsFn)
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setIsTomorrow(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTomorrow", value.toJsFn)
      }
    }
  }
}
