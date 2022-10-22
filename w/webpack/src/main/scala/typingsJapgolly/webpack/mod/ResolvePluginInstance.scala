package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin instance.
  */
trait ResolvePluginInstance
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  /**
  	 * The run point of the plugin, required method.
  	 */
  @JSName("apply")
  def apply(resolver: Resolver): Unit
}
object ResolvePluginInstance {
  
  inline def apply(apply: Resolver => Callback): ResolvePluginInstance = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Resolver) => apply(t0).runNow()))
    __obj.asInstanceOf[ResolvePluginInstance]
  }
  
  extension [Self <: ResolvePluginInstance](x: Self) {
    
    inline def setApply(value: Resolver => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Resolver) => value(t0).runNow()))
  }
}
