package typingsJapgolly.next

import typingsJapgolly.next.anon.BundlePath
import typingsJapgolly.next.anon.Compilation
import typingsJapgolly.next.anon.Name
import typingsJapgolly.next.distBuildWebpackLoadersNextFlightClientEntryLoaderMod.ClientComponentImports
import typingsJapgolly.next.distBuildWebpackLoadersNextFlightClientEntryLoaderMod.CssImports
import typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFlightClientEntryPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/flight-client-entry-plugin", "FlightClientEntryPlugin")
  @js.native
  open class FlightClientEntryPlugin protected () extends StObject {
    def this(options: Options) = this()
    
    def addEntry(compilation: Any, context: String, entry: Any, options: Name): js.Promise[Any] = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def collectClientComponentsAndCSSForDependency(hasLayoutOrPageRequestCompilationDependency: Compilation): js.Tuple2[ClientComponentImports, CssImports] = js.native
    
    def createClientEndpoints(compiler: Any, compilation: Any): js.Promise[Unit] = js.native
    
    var dev: Boolean = js.native
    
    def injectClientEntryAndSSRModules(hasCompilerCompilationEntryNameClientComponentImportsBundlePath: BundlePath): js.Promise[Boolean] = js.native
    
    var isEdgeServer: Boolean = js.native
  }
  
  @JSImport("next/dist/build/webpack/plugins/flight-client-entry-plugin", "injectedClientEntries")
  @js.native
  val injectedClientEntries: Map[Any, Any] = js.native
  
  trait Options extends StObject {
    
    var dev: Boolean
    
    var isEdgeServer: Boolean
  }
  object Options {
    
    inline def apply(dev: Boolean, isEdgeServer: Boolean): Options = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], isEdgeServer = isEdgeServer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setIsEdgeServer(value: Boolean): Self = StObject.set(x, "isEdgeServer", value.asInstanceOf[js.Any])
    }
  }
}
