package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import typingsJapgolly.mfiles.MFiles.MFDefaultPropertyType
import typingsJapgolly.mfiles.MFiles.MFEmailField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDefaultProperty extends StObject {
  
  def Clone(): IDefaultProperty
  
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
  
  def SetFixedValue(TypedValue: ITypedValue): Unit
  
  def SetFromEmail(EmailField: MFEmailField, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromEmailHeader(Field: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromHPDSSXML(PromptName: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromOCR(OCRZone: IOCRZone, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  def SetFromXML(XPathExpression: String, TreatLookupAsID: Boolean, AddVLItemIfNotFound: Boolean): Unit
  
  val Type: MFDefaultPropertyType
}
object IDefaultProperty {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, DataFixedValueValue = DataFixedValueValue.asInstanceOf[js.Any], DataFromEmailAddVLItemIfNotFound = DataFromEmailAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailField = DataFromEmailField.asInstanceOf[js.Any], DataFromEmailHeaderAddVLItemIfNotFound = DataFromEmailHeaderAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromEmailHeaderField = DataFromEmailHeaderField.asInstanceOf[js.Any], DataFromEmailHeaderTreatLookupAsID = DataFromEmailHeaderTreatLookupAsID.asInstanceOf[js.Any], DataFromEmailTreatLookupAsID = DataFromEmailTreatLookupAsID.asInstanceOf[js.Any], DataFromHPDSSXMLAddVLItemIfNotFound = DataFromHPDSSXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromHPDSSXMLPromptName = DataFromHPDSSXMLPromptName.asInstanceOf[js.Any], DataFromHPDSSXMLTreatLookupAsID = DataFromHPDSSXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRAddVLItemIfNotFound = DataFromOCRAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromOCRTreatLookupAsID = DataFromOCRTreatLookupAsID.asInstanceOf[js.Any], DataFromOCRZone = DataFromOCRZone.asInstanceOf[js.Any], DataFromXMLAddVLItemIfNotFound = DataFromXMLAddVLItemIfNotFound.asInstanceOf[js.Any], DataFromXMLTreatLookupAsID = DataFromXMLTreatLookupAsID.asInstanceOf[js.Any], DataFromXMLXPathExpression = DataFromXMLXPathExpression.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any], SetFixedValue = js.Any.fromFunction1((t0: ITypedValue) => SetFixedValue(t0).runNow()), SetFromEmail = js.Any.fromFunction3((t0: MFEmailField, t1: Boolean, t2: Boolean) => (SetFromEmail(t0, t1, t2)).runNow()), SetFromEmailHeader = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (SetFromEmailHeader(t0, t1, t2)).runNow()), SetFromHPDSSXML = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (SetFromHPDSSXML(t0, t1, t2)).runNow()), SetFromOCR = js.Any.fromFunction3((t0: IOCRZone, t1: Boolean, t2: Boolean) => (SetFromOCR(t0, t1, t2)).runNow()), SetFromXML = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (SetFromXML(t0, t1, t2)).runNow()), Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaultProperty]
  }
  
  extension [Self <: IDefaultProperty](x: Self) {
    
    inline def setClone(value: CallbackTo[IDefaultProperty]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDataFixedValueValue(value: ITypedValue): Self = StObject.set(x, "DataFixedValueValue", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromEmailAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailField(value: MFEmailField): Self = StObject.set(x, "DataFromEmailField", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailHeaderAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromEmailHeaderAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailHeaderField(value: String): Self = StObject.set(x, "DataFromEmailHeaderField", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailHeaderTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromEmailHeaderTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromEmailTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromEmailTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromHPDSSXMLAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromHPDSSXMLAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromHPDSSXMLPromptName(value: String): Self = StObject.set(x, "DataFromHPDSSXMLPromptName", value.asInstanceOf[js.Any])
    
    inline def setDataFromHPDSSXMLTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromHPDSSXMLTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromOCRAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromOCRAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromOCRTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromOCRTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromOCRZone(value: IOCRZone): Self = StObject.set(x, "DataFromOCRZone", value.asInstanceOf[js.Any])
    
    inline def setDataFromXMLAddVLItemIfNotFound(value: Boolean): Self = StObject.set(x, "DataFromXMLAddVLItemIfNotFound", value.asInstanceOf[js.Any])
    
    inline def setDataFromXMLTreatLookupAsID(value: Boolean): Self = StObject.set(x, "DataFromXMLTreatLookupAsID", value.asInstanceOf[js.Any])
    
    inline def setDataFromXMLXPathExpression(value: String): Self = StObject.set(x, "DataFromXMLXPathExpression", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDefID", value.asInstanceOf[js.Any])
    
    inline def setSetFixedValue(value: ITypedValue => Callback): Self = StObject.set(x, "SetFixedValue", js.Any.fromFunction1((t0: ITypedValue) => value(t0).runNow()))
    
    inline def setSetFromEmail(value: (MFEmailField, Boolean, Boolean) => Callback): Self = StObject.set(x, "SetFromEmail", js.Any.fromFunction3((t0: MFEmailField, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetFromEmailHeader(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "SetFromEmailHeader", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetFromHPDSSXML(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "SetFromHPDSSXML", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetFromOCR(value: (IOCRZone, Boolean, Boolean) => Callback): Self = StObject.set(x, "SetFromOCR", js.Any.fromFunction3((t0: IOCRZone, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetFromXML(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "SetFromXML", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setType(value: MFDefaultPropertyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
