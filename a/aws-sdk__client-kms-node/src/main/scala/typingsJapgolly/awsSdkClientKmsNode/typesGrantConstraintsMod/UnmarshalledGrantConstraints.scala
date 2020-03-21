package typingsJapgolly.awsSdkClientKmsNode.typesGrantConstraintsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGrantConstraints extends GrantConstraints {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  @JSName("EncryptionContextEquals")
  var EncryptionContextEquals_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  @JSName("EncryptionContextSubset")
  var EncryptionContextSubset_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.undefined
}

object UnmarshalledGrantConstraints {
  @scala.inline
  def apply(
    EncryptionContextEquals: StringDictionary[String] = null,
    EncryptionContextSubset: StringDictionary[String] = null
  ): UnmarshalledGrantConstraints = {
    val __obj = js.Dynamic.literal()
    if (EncryptionContextEquals != null) __obj.updateDynamic("EncryptionContextEquals")(EncryptionContextEquals.asInstanceOf[js.Any])
    if (EncryptionContextSubset != null) __obj.updateDynamic("EncryptionContextSubset")(EncryptionContextSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGrantConstraints]
  }
}

