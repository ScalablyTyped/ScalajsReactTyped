package typingsJapgolly.scHotReboot

import typingsJapgolly.chokidar.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sc-hot-reboot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(scMasterInstance: typingsJapgolly.socketcluster.mod.^): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(scMasterInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def attach(scMasterInstance: typingsJapgolly.socketcluster.mod.^, options: WatchOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(scMasterInstance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
