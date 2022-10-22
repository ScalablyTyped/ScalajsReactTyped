package typingsJapgolly.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.mod.ConfigType
import typingsJapgolly.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginCalendarMod extends Shortcut {
  
  @JSImport("dayjs/plugin/calendar", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginCalendarMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def calendar(): String = js.native
      def calendar(referenceTime: Unit, formats: js.Object): String = js.native
      def calendar(referenceTime: ConfigType): String = js.native
      def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
    }
  }
}
