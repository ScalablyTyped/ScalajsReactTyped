package typingsJapgolly.osUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allLoadavg(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("allLoadavg")().asInstanceOf[String]
  
  inline def cpuCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuCount")().asInstanceOf[Double]
  
  inline def cpuFree(callback: js.Function1[/* percentage */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuFree")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cpuUsage(callback: js.Function1[/* percentage */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cpuUsage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeCommand(callback: js.Function1[/* used_mem */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeCommand")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freemem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freemem")().asInstanceOf[Double]
  
  inline def freememPercentage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("freememPercentage")().asInstanceOf[Double]
  
  inline def getProcesses(callback: js.Function1[/* result */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcesses")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getProcesses(nProcess: Double, callback: js.Function1[/* result */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getProcesses")(nProcess.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def harddrive(callback: js.Function3[/* total */ Double, /* free */ Double, /* used */ Double, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("harddrive")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def loadavg(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")().asInstanceOf[Double]
  inline def loadavg(_time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loadavg")(_time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def platform(): Platform_ = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")().asInstanceOf[Platform_]
  
  inline def processUptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processUptime")().asInstanceOf[Double]
  
  inline def sysUptime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sysUptime")().asInstanceOf[Double]
  
  inline def totalmem(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("totalmem")().asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.osUtils.osUtilsStrings.aix
    - typingsJapgolly.osUtils.osUtilsStrings.android
    - typingsJapgolly.osUtils.osUtilsStrings.darwin
    - typingsJapgolly.osUtils.osUtilsStrings.freebsd
    - typingsJapgolly.osUtils.osUtilsStrings.linux
    - typingsJapgolly.osUtils.osUtilsStrings.openbsd
    - typingsJapgolly.osUtils.osUtilsStrings.sunos
    - typingsJapgolly.osUtils.osUtilsStrings.win32
    - typingsJapgolly.osUtils.osUtilsStrings.cygwin
  */
  trait Platform_ extends StObject
  object Platform_ {
    
    inline def aix: typingsJapgolly.osUtils.osUtilsStrings.aix = "aix".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.aix]
    
    inline def android: typingsJapgolly.osUtils.osUtilsStrings.android = "android".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.android]
    
    inline def cygwin: typingsJapgolly.osUtils.osUtilsStrings.cygwin = "cygwin".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.cygwin]
    
    inline def darwin: typingsJapgolly.osUtils.osUtilsStrings.darwin = "darwin".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.darwin]
    
    inline def freebsd: typingsJapgolly.osUtils.osUtilsStrings.freebsd = "freebsd".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.freebsd]
    
    inline def linux: typingsJapgolly.osUtils.osUtilsStrings.linux = "linux".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.linux]
    
    inline def openbsd: typingsJapgolly.osUtils.osUtilsStrings.openbsd = "openbsd".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.openbsd]
    
    inline def sunos: typingsJapgolly.osUtils.osUtilsStrings.sunos = "sunos".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.sunos]
    
    inline def win32: typingsJapgolly.osUtils.osUtilsStrings.win32 = "win32".asInstanceOf[typingsJapgolly.osUtils.osUtilsStrings.win32]
  }
}
