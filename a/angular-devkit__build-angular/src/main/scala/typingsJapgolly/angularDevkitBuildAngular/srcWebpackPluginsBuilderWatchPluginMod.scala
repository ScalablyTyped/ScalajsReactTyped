package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.anon.Close
import typingsJapgolly.angularDevkitBuildAngular.anon.Time
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsBuilderWatchPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/builder-watch-plugin", "BuilderWatchPlugin")
  @js.native
  open class BuilderWatchPlugin protected () extends StObject {
    def this(watcherFactory: BuilderWatcherFactory) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ val watcherFactory: Any = js.native
  }
  
  type BuilderWatcherCallback = js.Function1[/* events */ js.Array[Time], Unit]
  
  trait BuilderWatcherFactory extends StObject {
    
    def watch(files: js.Iterable[String], directories: js.Iterable[String], callback: BuilderWatcherCallback): Close
  }
  object BuilderWatcherFactory {
    
    inline def apply(watch: (js.Iterable[String], js.Iterable[String], BuilderWatcherCallback) => Close): BuilderWatcherFactory = {
      val __obj = js.Dynamic.literal(watch = js.Any.fromFunction3(watch))
      __obj.asInstanceOf[BuilderWatcherFactory]
    }
    
    extension [Self <: BuilderWatcherFactory](x: Self) {
      
      inline def setWatch(value: (js.Iterable[String], js.Iterable[String], BuilderWatcherCallback) => Close): Self = StObject.set(x, "watch", js.Any.fromFunction3(value))
    }
  }
}
