package typingsJapgolly.toastifyJs

import typingsJapgolly.toastifyJs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Toastify {
    
    inline def apply(): typingsJapgolly.toastifyJs.mod.Toastify = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.toastifyJs.mod.Toastify]
    inline def apply(options: Options): typingsJapgolly.toastifyJs.mod.Toastify = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.toastifyJs.mod.Toastify]
    
    @JSGlobal("Toastify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def reposition(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reposition")().asInstanceOf[Unit]
  }
}
