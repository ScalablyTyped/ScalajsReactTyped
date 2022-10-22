package typingsJapgolly.vueTestUtils

import typingsJapgolly.std.Record
import typingsJapgolly.vueTestUtils.anon.CreateStubs
import typingsJapgolly.vueTestUtils.anon.RequiredOmitGlobalMountOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMod {
  
  @JSImport("@vue/test-utils/dist/config", "config")
  @js.native
  val config: GlobalConfigOptions = js.native
  
  trait GlobalConfigOptions extends StObject {
    
    var global: RequiredOmitGlobalMountOp
    
    var plugins: CreateStubs
    
    var renderStubDefaultSlot: Boolean
  }
  object GlobalConfigOptions {
    
    inline def apply(global: RequiredOmitGlobalMountOp, plugins: CreateStubs, renderStubDefaultSlot: Boolean): GlobalConfigOptions = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], renderStubDefaultSlot = renderStubDefaultSlot.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfigOptions]
    }
    
    extension [Self <: GlobalConfigOptions](x: Self) {
      
      inline def setGlobal(value: RequiredOmitGlobalMountOp): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: CreateStubs): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setRenderStubDefaultSlot(value: Boolean): Self = StObject.set(x, "renderStubDefaultSlot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pluggable[Instance] extends StObject {
    
    def extend(instance: Instance): Unit = js.native
    
    def install[O](handler: js.Function1[/* instance */ Instance, Record[String, Any]]): Unit = js.native
    def install[O](handler: js.Function2[/* instance */ Instance, /* options */ O, Record[String, Any]], options: O): Unit = js.native
    
    var installedPlugins: js.Array[Plugin[Instance, Any]] = js.native
    
    /** For testing */
    def reset(): Unit = js.native
  }
  
  @js.native
  trait Plugin[Instance, O] extends StObject {
    
    def handler(instance: Instance): Record[String, Any] = js.native
    def handler(instance: Instance, options: O): Record[String, Any] = js.native
    
    var options: O = js.native
  }
}
