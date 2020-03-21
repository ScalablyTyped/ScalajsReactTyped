package typingsJapgolly.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiThingFields
  extends /**
  * custom fields.
  */
/* name */ StringDictionary[js.Any] {
  /**
    * firmware version given by thing vendor.
    */
  var _firmwareVersion: js.UndefOr[String] = js.undefined
  /**
    * lot identifier given by thing vendor.
    */
  var _lot: js.UndefOr[String] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField1: js.UndefOr[Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField2: js.UndefOr[Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField3: js.UndefOr[Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField4: js.UndefOr[Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField5: js.UndefOr[Double] = js.undefined
  /**
    * thing password given by thing vendor.
    */
  var _password: String
  /**
    * product name given by thing vendor.
    */
  var _productName: js.UndefOr[String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField1: js.UndefOr[String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField2: js.UndefOr[String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField3: js.UndefOr[String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField4: js.UndefOr[String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField5: js.UndefOr[String] = js.undefined
  /**
    * thing type given by thing vendor.
    */
  var _thingType: js.UndefOr[String] = js.undefined
  /**
    * vendor identifier given by thing vendor.
    */
  var _vendor: js.UndefOr[String] = js.undefined
  /**
    * thing identifier given by thing vendor.
    */
  var _vendorThingID: String
}

object KiiThingFields {
  @scala.inline
  def apply(
    _password: String,
    _vendorThingID: String,
    StringDictionary: /**
    * custom fields.
    */
  /* name */ StringDictionary[js.Any] = null,
    _firmwareVersion: String = null,
    _lot: String = null,
    _numberField1: Int | Double = null,
    _numberField2: Int | Double = null,
    _numberField3: Int | Double = null,
    _numberField4: Int | Double = null,
    _numberField5: Int | Double = null,
    _productName: String = null,
    _stringField1: String = null,
    _stringField2: String = null,
    _stringField3: String = null,
    _stringField4: String = null,
    _stringField5: String = null,
    _thingType: String = null,
    _vendor: String = null
  ): KiiThingFields = {
    val __obj = js.Dynamic.literal(_password = _password.asInstanceOf[js.Any], _vendorThingID = _vendorThingID.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_firmwareVersion != null) __obj.updateDynamic("_firmwareVersion")(_firmwareVersion.asInstanceOf[js.Any])
    if (_lot != null) __obj.updateDynamic("_lot")(_lot.asInstanceOf[js.Any])
    if (_numberField1 != null) __obj.updateDynamic("_numberField1")(_numberField1.asInstanceOf[js.Any])
    if (_numberField2 != null) __obj.updateDynamic("_numberField2")(_numberField2.asInstanceOf[js.Any])
    if (_numberField3 != null) __obj.updateDynamic("_numberField3")(_numberField3.asInstanceOf[js.Any])
    if (_numberField4 != null) __obj.updateDynamic("_numberField4")(_numberField4.asInstanceOf[js.Any])
    if (_numberField5 != null) __obj.updateDynamic("_numberField5")(_numberField5.asInstanceOf[js.Any])
    if (_productName != null) __obj.updateDynamic("_productName")(_productName.asInstanceOf[js.Any])
    if (_stringField1 != null) __obj.updateDynamic("_stringField1")(_stringField1.asInstanceOf[js.Any])
    if (_stringField2 != null) __obj.updateDynamic("_stringField2")(_stringField2.asInstanceOf[js.Any])
    if (_stringField3 != null) __obj.updateDynamic("_stringField3")(_stringField3.asInstanceOf[js.Any])
    if (_stringField4 != null) __obj.updateDynamic("_stringField4")(_stringField4.asInstanceOf[js.Any])
    if (_stringField5 != null) __obj.updateDynamic("_stringField5")(_stringField5.asInstanceOf[js.Any])
    if (_thingType != null) __obj.updateDynamic("_thingType")(_thingType.asInstanceOf[js.Any])
    if (_vendor != null) __obj.updateDynamic("_vendor")(_vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiThingFields]
  }
}

