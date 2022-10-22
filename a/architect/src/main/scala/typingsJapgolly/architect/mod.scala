package typingsJapgolly.architect

import typingsJapgolly.architect.architectStrings.error
import typingsJapgolly.architect.architectStrings.plugin
import typingsJapgolly.architect.architectStrings.ready
import typingsJapgolly.architect.architectStrings.service
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("architect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createApp(config: Config): Architect = ^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(config.asInstanceOf[js.Any]).asInstanceOf[Architect]
  inline def createApp(config: Config, callback: js.Function2[/* err */ js.Error, /* app */ Architect, Unit]): Architect = (^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Architect]
  
  inline def loadConfig(configPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(configPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadConfig(configPath: String, callback: js.Function2[/* err */ js.Error, /* config */ Config, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(configPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Architect extends EventEmitter {
    
    def getService(name: String): Any = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_plugin(event: plugin, listener: js.Function1[/* plugin */ Plugin, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* app */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_service(
      event: service,
      listener: js.Function3[/* name */ String, /* service */ Service, /* plugin */ Plugin, Unit]
    ): this.type = js.native
  }
  
  type Config = Any
  
  type Plugin = Any
  
  type Service = Any
}
