package typingsJapgolly.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("node-os-utils/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-os-utils/lib", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.nodeOsUtils.libUsersMod.default
  
  @JSImport("node-os-utils/lib", "cpu")
  @js.native
  val cpu: typingsJapgolly.nodeOsUtils.libCpuMod.default = js.native
  
  @JSImport("node-os-utils/lib", "drive")
  @js.native
  val drive: typingsJapgolly.nodeOsUtils.libDriveMod.default = js.native
  
  inline def exec(command: String): js.Function0[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[String]]]
  
  inline def isNotSupported(res: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotSupported")(res.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("node-os-utils/lib", "mem")
  @js.native
  val mem: typingsJapgolly.nodeOsUtils.libMemMod.default = js.native
  
  @JSImport("node-os-utils/lib", "netstat")
  @js.native
  val netstat: typingsJapgolly.nodeOsUtils.libNetstatMod.default = js.native
  
  @JSImport("node-os-utils/lib", "openfiles")
  @js.native
  val openfiles: typingsJapgolly.nodeOsUtils.libOpenfilesMod.default = js.native
  
  object options {
    
    @JSImport("node-os-utils/lib", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-os-utils/lib", "options.INTERVAL")
    @js.native
    def INTERVAL: Double = js.native
    inline def INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-os-utils/lib", "options.NOT_SUPPORTED_VALUE")
    @js.native
    def NOT_SUPPORTED_VALUE: String = js.native
    inline def NOT_SUPPORTED_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_VALUE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-os-utils/lib", "os")
  @js.native
  val os: typingsJapgolly.nodeOsUtils.libOsMod.default = js.native
  
  @JSImport("node-os-utils/lib", "oscmd")
  @js.native
  val oscmd: typingsJapgolly.nodeOsUtils.libOscmdMod.default = js.native
  
  @JSImport("node-os-utils/lib", "proc")
  @js.native
  val proc: typingsJapgolly.nodeOsUtils.libProcMod.default = js.native
  
  @JSImport("node-os-utils/lib", "users")
  @js.native
  val users: typingsJapgolly.nodeOsUtils.libUsersMod.default = js.native
  
  inline def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapExec")(command.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Function0[js.Promise[String]]]]
}
