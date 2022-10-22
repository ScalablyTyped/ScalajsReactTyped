package typingsJapgolly.dayjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsoWeeksInYearMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isoWeeksInYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsoWeeksInYearMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    trait Dayjs extends StObject {
      
      def isoWeeksInYear(): Double
    }
    object Dayjs {
      
      inline def apply(isoWeeksInYear: CallbackTo[Double]): Dayjs = {
        val __obj = js.Dynamic.literal(isoWeeksInYear = isoWeeksInYear.toJsFn)
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setIsoWeeksInYear(value: CallbackTo[Double]): Self = StObject.set(x, "isoWeeksInYear", value.toJsFn)
      }
    }
  }
}
