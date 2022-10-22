package typingsJapgolly.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttestationFormat extends StObject
@JSImport("@google-cloud/kms", "v1.AttestationFormat")
@js.native
object AttestationFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttestationFormat & Double] = js.native
  
  @js.native
  sealed trait ATTESTATION_FORMAT_UNSPECIFIED
    extends StObject
       with AttestationFormat
  /* 0 */ val ATTESTATION_FORMAT_UNSPECIFIED: typingsJapgolly.googleCloudKms.mod.v1.AttestationFormat.ATTESTATION_FORMAT_UNSPECIFIED & Double = js.native
  
  // Cavium HSM attestation compressed with gzip. Note that this format is
  // defined by Cavium and subject to change at any time.
  @js.native
  sealed trait CAVIUM_V1_COMPRESSED
    extends StObject
       with AttestationFormat
  /* 3 */ val CAVIUM_V1_COMPRESSED: typingsJapgolly.googleCloudKms.mod.v1.AttestationFormat.CAVIUM_V1_COMPRESSED & Double = js.native
}
