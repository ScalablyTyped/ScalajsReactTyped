package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.AnonAccessanalyzer
import typingsJapgolly.pulumiAws.AnonExternalId
import typingsJapgolly.pulumiAws.regionMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "config")
@js.native
object config extends js.Object {
  var accessKey: js.UndefOr[String] = js.native
  var allowedAccountIds: js.UndefOr[js.Array[String]] = js.native
  var assumeRole: js.UndefOr[AnonExternalId] = js.native
  var endpoints: js.UndefOr[js.Array[AnonAccessanalyzer]] = js.native
  var forbiddenAccountIds: js.UndefOr[js.Array[String]] = js.native
  var ignoreTagPrefixes: js.UndefOr[js.Array[String]] = js.native
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
  var insecure: js.UndefOr[Boolean] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var profile: js.UndefOr[String] = js.native
  var region: js.UndefOr[Region] = js.native
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  var secretKey: js.UndefOr[String] = js.native
  var sharedCredentialsFile: js.UndefOr[String] = js.native
  var skipCredentialsValidation: js.UndefOr[Boolean] = js.native
  var skipGetEc2Platforms: js.UndefOr[Boolean] = js.native
  var skipMetadataApiCheck: js.UndefOr[Boolean] = js.native
  var skipRegionValidation: js.UndefOr[Boolean] = js.native
  var skipRequestingAccountId: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[String] = js.native
  def requireRegion(): Region = js.native
}

