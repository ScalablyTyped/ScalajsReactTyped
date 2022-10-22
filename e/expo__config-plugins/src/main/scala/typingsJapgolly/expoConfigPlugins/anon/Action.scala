package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.ExportedConfigWithProps
import typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.OptionalPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[T] extends StObject {
  
  def action(config: ExportedConfigWithProps[T]): OptionalPromise[ExportedConfigWithProps[T]]
  @JSName("action")
  var action_Original: typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.Mod[T]
}
object Action {
  
  inline def apply[T](action: typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.Mod[T]): Action[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  
  extension [Self <: Action[?], T](x: Self & Action[T]) {
    
    inline def setAction(value: typingsJapgolly.expoConfigPlugins.buildPluginDottypesMod.Mod[T]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
