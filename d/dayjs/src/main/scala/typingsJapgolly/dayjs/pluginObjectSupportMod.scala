package typingsJapgolly.dayjs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dayjs.anon.D
import typingsJapgolly.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginObjectSupportMod extends Shortcut {
  
  @JSImport("dayjs/plugin/objectSupport", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginObjectSupportMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    trait ConfigTypeMap extends StObject {
      
      var objectSupport: D
    }
    object ConfigTypeMap {
      
      inline def apply(objectSupport: D): ConfigTypeMap = {
        val __obj = js.Dynamic.literal(objectSupport = objectSupport.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigTypeMap]
      }
      
      extension [Self <: ConfigTypeMap](x: Self) {
        
        inline def setObjectSupport(value: D): Self = StObject.set(x, "objectSupport", value.asInstanceOf[js.Any])
      }
    }
    
    trait Dayjs extends StObject {
      
      def add(argument: js.Object): Dayjs
      
      def set(argument: js.Object): Dayjs
      
      def subtract(argument: js.Object): Dayjs
    }
    object Dayjs {
      
      inline def apply(add: js.Object => Dayjs, set: js.Object => Dayjs, subtract: js.Object => Dayjs): Dayjs = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), set = js.Any.fromFunction1(set), subtract = js.Any.fromFunction1(subtract))
        __obj.asInstanceOf[Dayjs]
      }
      
      extension [Self <: Dayjs](x: Self) {
        
        inline def setAdd(value: js.Object => Dayjs): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        inline def setSet(value: js.Object => Dayjs): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
        
        inline def setSubtract(value: js.Object => Dayjs): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      }
    }
  }
}
