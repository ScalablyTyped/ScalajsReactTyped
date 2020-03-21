package typingsJapgolly.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiCloud.serviceMod.SharedVolume
  - typingsJapgolly.pulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends js.Object

object Volume {
  @scala.inline
  def SharedVolume(kind: typingsJapgolly.pulumiCloud.pulumiCloudStrings.SharedVolume, name: String): Volume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  def HostPathVolume(kind: typingsJapgolly.pulumiCloud.pulumiCloudStrings.HostPathVolume, path: String): Volume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Volume]
  }
}

