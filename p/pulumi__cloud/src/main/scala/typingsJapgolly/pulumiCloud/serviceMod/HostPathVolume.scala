package typingsJapgolly.pulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPathVolume extends Volume {
  var kind: typingsJapgolly.pulumiCloud.pulumiCloudStrings.HostPathVolume
  var path: String
}

@JSImport("@pulumi/cloud/service", "HostPathVolume")
@js.native
object HostPathVolume extends TopLevel[HostPathVolumeConstructor]

