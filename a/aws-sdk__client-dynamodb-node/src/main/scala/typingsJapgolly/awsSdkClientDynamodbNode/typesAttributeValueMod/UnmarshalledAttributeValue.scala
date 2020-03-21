package typingsJapgolly.awsSdkClientDynamodbNode.typesAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledAttributeValue extends AttributeValue {
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  @JSName("BS")
  var BS_UnmarshalledAttributeValue: js.UndefOr[js.Array[scala.scalajs.js.typedarray.Uint8Array]] = js.undefined
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  @JSName("B")
  var B_UnmarshalledAttributeValue: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.undefined
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  @JSName("L")
  var L_UnmarshalledAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  @JSName("M")
  var M_UnmarshalledAttributeValue: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  @JSName("NS")
  var NS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  @JSName("SS")
  var SS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
}

object UnmarshalledAttributeValue {
  @scala.inline
  def apply(
    B: scala.scalajs.js.typedarray.Uint8Array = null,
    BOOL: js.UndefOr[Boolean] = js.undefined,
    BS: js.Array[scala.scalajs.js.typedarray.Uint8Array] = null,
    L: js.Array[UnmarshalledAttributeValue] = null,
    M: StringDictionary[UnmarshalledAttributeValue] = null,
    N: String = null,
    NS: js.Array[String] = null,
    NULL: js.UndefOr[Boolean] = js.undefined,
    S: String = null,
    SS: js.Array[String] = null
  ): UnmarshalledAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (B != null) __obj.updateDynamic("B")(B.asInstanceOf[js.Any])
    if (!js.isUndefined(BOOL)) __obj.updateDynamic("BOOL")(BOOL.asInstanceOf[js.Any])
    if (BS != null) __obj.updateDynamic("BS")(BS.asInstanceOf[js.Any])
    if (L != null) __obj.updateDynamic("L")(L.asInstanceOf[js.Any])
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (N != null) __obj.updateDynamic("N")(N.asInstanceOf[js.Any])
    if (NS != null) __obj.updateDynamic("NS")(NS.asInstanceOf[js.Any])
    if (!js.isUndefined(NULL)) __obj.updateDynamic("NULL")(NULL.asInstanceOf[js.Any])
    if (S != null) __obj.updateDynamic("S")(S.asInstanceOf[js.Any])
    if (SS != null) __obj.updateDynamic("SS")(SS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledAttributeValue]
  }
}

