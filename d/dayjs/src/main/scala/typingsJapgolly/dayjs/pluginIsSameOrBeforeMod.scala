package typingsJapgolly.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.mod.ConfigType
import typingsJapgolly.dayjs.mod.OpUnitType
import typingsJapgolly.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsSameOrBeforeMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isSameOrBefore", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsSameOrBeforeMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isSameOrBefore(date: ConfigType): Boolean = js.native
      def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    }
  }
}
