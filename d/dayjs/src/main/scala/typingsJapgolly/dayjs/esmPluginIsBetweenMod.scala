package typingsJapgolly.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.dayjsStrings.`[]`
import typingsJapgolly.dayjs.esmMod.ConfigType
import typingsJapgolly.dayjs.esmMod.OpUnitType
import typingsJapgolly.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsBetweenMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isBetween", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsBetweenMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: Null, d: (/* () */ String) | `[]`): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: Unit, d: (/* () */ String) | `[]`): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
      def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: (/* () */ String) | `[]`): Boolean = js.native
    }
  }
}
