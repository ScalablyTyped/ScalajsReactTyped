package typingsJapgolly.dayjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginToArrayMod extends Shortcut {
  
  @JSImport("dayjs/plugin/toArray", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginToArrayMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def toArray(): js.Array[Double]
    }
    object Dayjs {
      
      inline def apply(toArray: CallbackTo[js.Array[Double]]): Dayjs = {
        val __obj = js.Dynamic.literal(toArray = toArray.toJsFn)
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setToArray(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "toArray", value.toJsFn)
      }
    }
  }
}
