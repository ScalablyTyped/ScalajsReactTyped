package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import typingsJapgolly.mfiles.MFiles.MFDefaultPropertyType
import typingsJapgolly.mfiles.MFiles.MFEmailField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultProperty extends js.Object {
  var DataFixedValueValue: ITypedValue
  var DataFromEmailAddVLItemIfNotFound: Boolean
  var DataFromEmailField: MFEmailField
  var DataFromEmailHeaderAddVLItemIfNotFound: Boolean
  var DataFromEmailHeaderField: String
  var DataFromEmailHeaderTreatLookupAsID: Boolean
  var DataFromEmailTreatLookupAsID: Boolean
  var DataFromHPDSSXMLAddVLItemIfNotFound: Boolean
  var DataFromHPDSSXMLPromptName: String
  var DataFromHPDSSXMLTreatLookupAsID: Boolean
  var DataFromOCRAddVLItemIfNotFound: Boolean
  var DataFromOCRTreatLookupAsID: Boolean
  var DataFromOCRZone: IOCRZone
  var DataFromXMLAddVLItemIfNotFound: Boolean
  var DataFromXMLTreatLookupAsID: Boolean
  var DataFromXMLXPathExpression: String
  var PropertyDefID: MFBuiltInPropertyDef | Double
  val Type: MFDefaultPropertyType
  def Clone(): IDefaultProperty
  def SetFixedValue(TypedValue: ITypedValue): Unit
  def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
}

object IDefaultProperty {
  @scala.inline
  def apply(
    Clone: CallbackTo[IDefaultProperty],
    DataFixedValueValue: ITypedValue,
    DataFromEmailAddVLItemIfNotFound: Boolean,
    DataFromEmailField: MFEmailField,
    DataFromEmailHeaderAddVLItemIfNotFound: Boolean,
    DataFromEmailHeaderField: String,
    DataFromEmailHeaderTreatLookupAsID: Boolean,
    DataFromEmailTreatLookupAsID: Boolean,
    DataFromHPDSSXMLAddVLItemIfNotFound: Boolean,
    DataFromHPDSSXMLPromptName: String,
    DataFromHPDSSXMLTreatLookupAsID: Boolean,
    DataFromOCRAddVLItemIfNotFound: Boolean,
    DataFromOCRTreatLookupAsID: Boolean,
    DataFromOCRZone: IOCRZone,
    DataFromXMLAddVLItemIfNotFound: Boolean,
    DataFromXMLTreatLookupAsID: Boolean,
    DataFromXMLXPathExpression: String,
    PropertyDefID: MFBuiltInPropertyDef | Double,
    SetFixedValue: ITypedValue => Callback,
    SetFromEmail: (MFEmailField, Boolean, Boolean) => Callback,
    SetFromEmailHeader: (String, Boolean, Boolean) => Callback,
    SetFromHPDSSXML: (String, Boolean, Boolean) => Callback,
    SetFromOCR: (IOCRZone, Boolean, Boolean) => Callback,
    SetFromXML: (String, Boolean, Boolean) => Callback,
    Type: MFDefaultPropertyType
  ): IDefaultProperty = {
    val __obj = js.Dynamic.literal(DataFixedValueValue = DataFixedValueValue.asInstanceOf[js.Any], DataFromEmailAddVLItemIfNotFound = DataFromEmailAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailField = DataFromEmailField.asInstanceOf[js.Any], DataFromEmailHeaderAddVLItemIfNotFound = DataFromEmailHeaderAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailHeaderField = DataFromEmailHeaderField.asInstanceOf[js.Any], DataFromEmailHeaderTreatLookupAsID = DataFromEmailHeaderTreatLookupAsID.asInstanceOf[js.Any], DataFromEmailTreatLookupAsID = DataFromEmailTreatLookupAsID.asInstanceOf[js.Any], DataFromHPDSSXMLAddVLItemIfNotFound = DataFromHPDSSXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromHPDSSXMLPromptName = DataFromHPDSSXMLPromptName.asInstanceOf[js.Any], DataFromHPDSSXMLTreatLookupAsID = DataFromHPDSSXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRAddVLItemIfNotFound = DataFromOCRAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromOCRTreatLookupAsID = DataFromOCRTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRZone = DataFromOCRZone.asInstanceOf[js.Any], DataFromXMLAddVLItemIfNotFound = DataFromXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromXMLTreatLookupAsID = DataFromXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromXMLXPathExpression = DataFromXMLXPathExpression.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetFixedValue")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ITypedValue) => SetFixedValue(t0).runNow()))
    __obj.updateDynamic("SetFromEmail")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.MFiles.MFEmailField, t1: scala.Boolean, t2: scala.Boolean) => SetFromEmail(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetFromEmailHeader")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => SetFromEmailHeader(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetFromHPDSSXML")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => SetFromHPDSSXML(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetFromOCR")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IOCRZone, t1: scala.Boolean, t2: scala.Boolean) => SetFromOCR(t0, t1, t2).runNow()))
    __obj.updateDynamic("SetFromXML")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => SetFromXML(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IDefaultProperty]
  }
}

