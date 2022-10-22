package typingsJapgolly.dayjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsYesterdayMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isYesterday", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsYesterdayMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isYesterday(): Boolean
    }
    object Dayjs {
      
      inline def apply(isYesterday: CallbackTo[Boolean]): Dayjs = {
        val __obj = js.Dynamic.literal(isYesterday = isYesterday.toJsFn)
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setIsYesterday(value: CallbackTo[Boolean]): Self = StObject.set(x, "isYesterday", value.toJsFn)
      }
    }
  }
}
