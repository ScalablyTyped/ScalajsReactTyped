package typingsJapgolly.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Verifiers (e.g. Kritis implementations) MUST verify signatures with respect
  * to the trust anchors defined in policy (e.g. a Kritis policy). Typically
  * this means that the verifier has been configured with a map from
  * `public_key_id` to public key material (and any required parameters, e.g.
  * signing algorithm).  In particular, verification implementations MUST NOT
  * treat the signature `public_key_id` as anything more than a key lookup
  * hint. The `public_key_id` DOES NOT validate or authenticate a public key;
  * it only provides a mechanism for quickly selecting a public key ALREADY
  * CONFIGURED on the verifier through a trusted channel. Verification
  * implementations MUST reject signatures in any of the following
  * circumstances:   * The `public_key_id` is not recognized by the verifier.
  * * The public key that `public_key_id` refers to does not verify the
  * signature with respect to the payload.  The `signature` contents SHOULD NOT
  * be &quot;attached&quot; (where the payload is included with the serialized
  * `signature` bytes). Verifiers MUST ignore any &quot;attached&quot; payload
  * and only verify signatures with respect to explicitly provided payload
  * (e.g. a `payload` field on the proto message that holds this Signature, or
  * the canonical serialization of the proto message that holds this
  * signature).
  */
@js.native
trait SchemaSignature extends js.Object {
  /**
    * The identifier for the public key that verifies this signature.   * The
    * `public_key_id` is required.   * The `public_key_id` MUST be an RFC3986
    * conformant URI.   * When possible, the `public_key_id` SHOULD be an
    * immutable reference,     such as a cryptographic digest.  Examples of
    * valid `public_key_id`s:  OpenPGP V4 public key fingerprint:   *
    * &quot;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA&quot; See
    * https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more
    * details on this scheme.  RFC6920 digest-named SubjectPublicKeyInfo
    * (digest of the DER serialization):   *
    * &quot;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU&quot;   *
    * &quot;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5&quot;
    */
  var publicKeyId: js.UndefOr[String] = js.native
  /**
    * The content of the signature, an opaque bytestring. The payload that this
    * signature verifies MUST be unambiguously provided with the Signature
    * during verification. A wrapper message might provide the payload
    * explicitly. Alternatively, a message might have a canonical serialization
    * that can always be unambiguously computed to derive the payload.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaSignature {
  @scala.inline
  def apply(publicKeyId: String = null, signature: String = null): SchemaSignature = {
    val __obj = js.Dynamic.literal()
    if (publicKeyId != null) __obj.updateDynamic("publicKeyId")(publicKeyId.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignature]
  }
}

