package typingsJapgolly.dayjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsTomorrowMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isTomorrow", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsTomorrowMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
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
