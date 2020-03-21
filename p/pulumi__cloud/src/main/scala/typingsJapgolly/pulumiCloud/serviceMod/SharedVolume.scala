package typingsJapgolly.pulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedVolume extends Volume {
  var kind: typingsJapgolly.pulumiCloud.pulumiCloudStrings.SharedVolume
  var name: String
}

@JSImport("@pulumi/cloud/service", "SharedVolume")
@js.native
object SharedVolume extends TopLevel[SharedVolumeConstructor]

