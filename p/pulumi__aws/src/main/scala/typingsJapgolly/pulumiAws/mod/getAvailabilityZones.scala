package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.getAvailabilityZonesMod.GetAvailabilityZonesArgs
import typingsJapgolly.pulumiAws.getAvailabilityZonesMod.GetAvailabilityZonesResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAvailabilityZones")
@js.native
object getAvailabilityZones extends js.Object {
  def apply(): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def apply(args: GetAvailabilityZonesArgs): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
  def apply(args: GetAvailabilityZonesArgs, opts: InvokeOptions): js.Promise[GetAvailabilityZonesResult] with GetAvailabilityZonesResult = js.native
}

