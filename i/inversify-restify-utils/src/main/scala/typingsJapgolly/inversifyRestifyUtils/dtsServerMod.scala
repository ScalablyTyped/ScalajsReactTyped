package typingsJapgolly.inversifyRestifyUtils

import typingsJapgolly.inversify.mod.Container
import typingsJapgolly.inversifyRestifyUtils.dtsInterfacesMod.interfaces.ConfigFunction
import typingsJapgolly.restify.mod.Server
import typingsJapgolly.restify.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsServerMod {
  
  @JSImport("inversify-restify-utils/dts/server", "InversifyRestifyServer")
  @js.native
  open class InversifyRestifyServer protected () extends StObject {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions & typingsJapgolly.inversifyRestifyUtils.dtsInterfacesMod.interfaces.ServerOptions
    ) = this()
    
    /* private */ var app: Any = js.native
    
    def build(): Server = js.native
    
    /* private */ var configFn: Any = js.native
    
    /* private */ var container: Any = js.native
    
    /* private */ var defaultRoot: Any = js.native
    
    /* private */ var handlerFactory: Any = js.native
    
    /* private */ var registerControllers: Any = js.native
    
    /* private */ var resolveMiddleware: Any = js.native
    
    def setConfig(fn: ConfigFunction): InversifyRestifyServer = js.native
  }
}
