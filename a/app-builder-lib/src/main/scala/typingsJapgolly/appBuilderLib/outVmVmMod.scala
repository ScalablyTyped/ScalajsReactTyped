package typingsJapgolly.appBuilderLib

import typingsJapgolly.builderUtil.mod.DebugLogger
import typingsJapgolly.builderUtil.mod.ExtraSpawnOptions
import typingsJapgolly.node.childProcessMod.ExecFileOptions
import typingsJapgolly.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outVmVmMod {
  
  @JSImport("app-builder-lib/out/vm/vm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/vm/vm", "VmManager")
  @js.native
  open class VmManager () extends StObject {
    
    def exec(file: String, args: js.Array[String]): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: Unit, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
    
    def pathSep: String = js.native
    
    def spawn(file: String, args: js.Array[String]): js.Promise[Any] = js.native
    def spawn(file: String, args: js.Array[String], options: Unit, extraOptions: ExtraSpawnOptions): js.Promise[Any] = js.native
    def spawn(file: String, args: js.Array[String], options: SpawnOptions): js.Promise[Any] = js.native
    def spawn(file: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[Any] = js.native
    
    def toVmFile(file: String): String = js.native
  }
  
  inline def getWindowsVm(debugLogger: DebugLogger): js.Promise[VmManager] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowsVm")(debugLogger.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VmManager]]
}
