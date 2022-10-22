package typingsJapgolly.naverWhale.whale.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformInfo extends StObject {
  
  /**
    * The machine's processor architecture.
    */
  var arch: typingsJapgolly.chrome.chrome.runtime.PlatformArch
  
  /**
    * The native client architecture. This may be different from arch on some platforms.
    */
  var nacl_arch: typingsJapgolly.chrome.chrome.runtime.PlatformNaclArch
  
  /**
    * The operating system chrome is running on.
    */
  var os: typingsJapgolly.chrome.chrome.runtime.PlatformOs
}
object PlatformInfo {
  
  inline def apply(
    arch: typingsJapgolly.chrome.chrome.runtime.PlatformArch,
    nacl_arch: typingsJapgolly.chrome.chrome.runtime.PlatformNaclArch,
    os: typingsJapgolly.chrome.chrome.runtime.PlatformOs
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  
  extension [Self <: PlatformInfo](x: Self) {
    
    inline def setArch(value: typingsJapgolly.chrome.chrome.runtime.PlatformArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_arch(value: typingsJapgolly.chrome.chrome.runtime.PlatformNaclArch): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setOs(value: typingsJapgolly.chrome.chrome.runtime.PlatformOs): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
