package typingsJapgolly.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This submessage provides human-readable hints about the purpose of the
  * AttestationAuthority.  Because the name of a Note acts as its resource
  * reference, it is important to disambiguate the canonical name of the Note
  * (which might be a UUID for security purposes) from &quot;readable&quot;
  * names more suitable for debug output.  Note that these hints should NOT be
  * used to look up AttestationAuthorities in security sensitive contexts, such
  * as when looking up Attestations to verify.
  */
@js.native
trait SchemaAttestationAuthorityHint extends js.Object {
  /**
    * The human readable name of this Attestation Authority, for example
    * &quot;qa&quot;.
    */
  var humanReadableName: js.UndefOr[String] = js.native
}

object SchemaAttestationAuthorityHint {
  @scala.inline
  def apply(humanReadableName: String = null): SchemaAttestationAuthorityHint = {
    val __obj = js.Dynamic.literal()
    if (humanReadableName != null) __obj.updateDynamic("humanReadableName")(humanReadableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttestationAuthorityHint]
  }
}

