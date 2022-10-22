package typingsJapgolly.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiCloud.serviceMod.SharedVolume
  - typingsJapgolly.pulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends StObject
object Volume {
  
  inline def HostPathVolume(path: String): typingsJapgolly.pulumiCloud.serviceMod.HostPathVolume = {
    val __obj = js.Dynamic.literal(kind = "HostPathVolume", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pulumiCloud.serviceMod.HostPathVolume]
  }
  
  inline def SharedVolume(name: String): typingsJapgolly.pulumiCloud.serviceMod.SharedVolume = {
    val __obj = js.Dynamic.literal(kind = "SharedVolume", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.pulumiCloud.serviceMod.SharedVolume]
  }
}
