package typingsJapgolly.nodeOsUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOsMod {
  
  @JSImport("node-os-utils/lib/os", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Os {
    
    /* CompleteClass */
    override def arch(): String = js.native
    
    /* CompleteClass */
    override def hostname(): String = js.native
    
    /* CompleteClass */
    override def ip(): String = js.native
    
    /* CompleteClass */
    override def oos(): js.Function0[js.Promise[String]] = js.native
    
    /* CompleteClass */
    override def platform(): Platform = js.native
    
    /* CompleteClass */
    override def `type`(): String = js.native
    
    /* CompleteClass */
    override def uptime(): Double = js.native
  }
  
  trait Os extends StObject {
    
    def arch(): String
    
    def hostname(): String
    
    def ip(): String
    
    def oos(): js.Function0[js.Promise[String]]
    
    def platform(): Platform
    
    def `type`(): String
    
    def uptime(): Double
  }
  object Os {
    
    inline def apply(
      arch: CallbackTo[String],
      hostname: CallbackTo[String],
      ip: CallbackTo[String],
      oos: CallbackTo[js.Function0[js.Promise[String]]],
      platform: CallbackTo[Platform],
      `type`: CallbackTo[String],
      uptime: CallbackTo[Double]
    ): Os = {
      val __obj = js.Dynamic.literal(arch = arch.toJsFn, hostname = hostname.toJsFn, ip = ip.toJsFn, oos = oos.toJsFn, platform = platform.toJsFn, uptime = uptime.toJsFn)
      __obj.updateDynamic("type")(`type`.toJsFn)
      __obj.asInstanceOf[Os]
    }
    
    extension [Self <: Os](x: Self) {
      
      inline def setArch(value: CallbackTo[String]): Self = StObject.set(x, "arch", value.toJsFn)
      
      inline def setHostname(value: CallbackTo[String]): Self = StObject.set(x, "hostname", value.toJsFn)
      
      inline def setIp(value: CallbackTo[String]): Self = StObject.set(x, "ip", value.toJsFn)
      
      inline def setOos(value: CallbackTo[js.Function0[js.Promise[String]]]): Self = StObject.set(x, "oos", value.toJsFn)
      
      inline def setPlatform(value: CallbackTo[Platform]): Self = StObject.set(x, "platform", value.toJsFn)
      
      inline def setType(value: CallbackTo[String]): Self = StObject.set(x, "type", value.toJsFn)
      
      inline def setUptime(value: CallbackTo[Double]): Self = StObject.set(x, "uptime", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.aix
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.android
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.darwin
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.freebsd
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.linux
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.openbsd
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.sunos
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.win32
    - typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.cygwin
  */
  trait Platform extends StObject
  object Platform {
    
    inline def aix: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.aix = "aix".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.aix]
    
    inline def android: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.android = "android".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.android]
    
    inline def cygwin: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.cygwin = "cygwin".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.cygwin]
    
    inline def darwin: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.darwin = "darwin".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.darwin]
    
    inline def freebsd: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.freebsd = "freebsd".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.freebsd]
    
    inline def linux: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.linux = "linux".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.linux]
    
    inline def openbsd: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.openbsd = "openbsd".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.openbsd]
    
    inline def sunos: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.sunos = "sunos".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.sunos]
    
    inline def win32: typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.win32 = "win32".asInstanceOf[typingsJapgolly.nodeOsUtils.nodeOsUtilsStrings.win32]
  }
}
