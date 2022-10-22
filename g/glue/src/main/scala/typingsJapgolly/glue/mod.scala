package typingsJapgolly.glue

import japgolly.scalajs.react.Callback
import typingsJapgolly.glue.anon.Plugins
import typingsJapgolly.hapi.mod.Server
import typingsJapgolly.hapi.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose(manifest: Manifest): js.Promise[Server] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(manifest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Server]]
  inline def compose(manifest: Manifest, options: Options): js.Promise[Server] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(manifest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Server]]
  
  trait Manifest extends StObject {
    
    var register: js.UndefOr[Plugins] = js.undefined
    
    var server: ServerOptions
  }
  object Manifest {
    
    inline def apply(server: ServerOptions): Manifest = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    extension [Self <: Manifest](x: Self) {
      
      inline def setRegister(value: Plugins): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setServer(value: ServerOptions): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var preConnections: js.UndefOr[
        js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ Any, Unit], Unit]
      ] = js.undefined
    
    var preRegister: js.UndefOr[
        js.Function2[/* Server */ Server, /* next */ js.Function1[/* err */ Any, Unit], Unit]
      ] = js.undefined
    
    var relativeTo: String
  }
  object Options {
    
    inline def apply(relativeTo: String): Options = {
      val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPreConnections(value: (/* Server */ Server, /* next */ js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "preConnections", js.Any.fromFunction2((t0: /* Server */ Server, t1: /* next */ js.Function1[/* err */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPreConnectionsUndefined: Self = StObject.set(x, "preConnections", js.undefined)
      
      inline def setPreRegister(value: (/* Server */ Server, /* next */ js.Function1[/* err */ Any, Unit]) => Callback): Self = StObject.set(x, "preRegister", js.Any.fromFunction2((t0: /* Server */ Server, t1: /* next */ js.Function1[/* err */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPreRegisterUndefined: Self = StObject.set(x, "preRegister", js.undefined)
      
      inline def setRelativeTo(value: String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plugin extends StObject {
    
    var options: js.UndefOr[Any] = js.undefined
    
    var plugin: String | typingsJapgolly.glue.anon.Options
    
    var routes: js.UndefOr[Any] = js.undefined
  }
  object Plugin {
    
    inline def apply(plugin: String | typingsJapgolly.glue.anon.Options): Plugin = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugin(value: String | typingsJapgolly.glue.anon.Options): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    }
  }
}
