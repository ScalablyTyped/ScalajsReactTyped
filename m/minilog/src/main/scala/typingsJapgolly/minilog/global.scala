package typingsJapgolly.minilog

import typingsJapgolly.minilog.mod.MinilogBackends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Minilog {
    
    inline def apply(namespace: String): typingsJapgolly.minilog.mod.Minilog = ^.asInstanceOf[js.Dynamic].apply(namespace.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minilog.mod.Minilog]
    
    @JSGlobal("Minilog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Minilog.Console")
    @js.native
    open class Console ()
      extends typingsJapgolly.minilog.mod.Console
    
    @JSGlobal("Minilog.Filter")
    @js.native
    open class Filter ()
      extends typingsJapgolly.minilog.mod.Filter
    
    @JSGlobal("Minilog.Transform")
    @js.native
    open class Transform ()
      extends typingsJapgolly.minilog.mod.Transform
    
    @JSGlobal("Minilog.backends")
    @js.native
    def backends: MinilogBackends = js.native
    inline def backends_=(x: MinilogBackends): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backends")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Minilog.defaultBackend")
    @js.native
    def defaultBackend: Any = js.native
    inline def defaultBackend_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBackend")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Minilog.defaultFormatter")
    @js.native
    def defaultFormatter: String = js.native
    inline def defaultFormatter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormatter")(x.asInstanceOf[js.Any])
    
    inline def disable(): typingsJapgolly.minilog.mod.Minilog = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[typingsJapgolly.minilog.mod.Minilog]
    
    inline def enable(): typingsJapgolly.minilog.mod.Minilog = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[typingsJapgolly.minilog.mod.Minilog]
    
    inline def pipe(dest: Any): typingsJapgolly.minilog.mod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(dest.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.minilog.mod.Transform]
    
    @JSGlobal("Minilog.suggest")
    @js.native
    def suggest: typingsJapgolly.minilog.mod.Filter = js.native
    inline def suggest_=(x: typingsJapgolly.minilog.mod.Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
  }
}
