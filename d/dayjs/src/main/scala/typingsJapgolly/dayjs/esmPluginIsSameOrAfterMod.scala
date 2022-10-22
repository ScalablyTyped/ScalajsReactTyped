package typingsJapgolly.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.esmMod.ConfigType
import typingsJapgolly.dayjs.esmMod.OpUnitType
import typingsJapgolly.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsSameOrAfterMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isSameOrAfter", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsSameOrAfterMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isSameOrAfter(date: ConfigType): Boolean = js.native
      def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    }
  }
}
