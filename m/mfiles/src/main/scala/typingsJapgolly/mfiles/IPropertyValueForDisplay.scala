package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import typingsJapgolly.mfiles.MFiles.MFContentType
import typingsJapgolly.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValueForDisplay extends StObject {
  
  def Clone(): IPropertyValueForDisplay
  
  val ContentType: MFContentType
  
  val DataType: MFDataType
  
  val DisplayValue: String
  
  val PropertyDef: MFBuiltInPropertyDef | Double
  
  val PropertyDefName: String
  
  val PropertyValue: IPropertyValue
  
  val ReadOnly: Boolean
}
object IPropertyValueForDisplay {
  
  inline def apply(
    Clone: CallbackTo[IPropertyValueForDisplay],
    ContentType: MFContentType,
    DataType: MFDataType,
    DisplayValue: String,
    PropertyDef: MFBuiltInPropertyDef | Double,
    PropertyDefName: String,
    PropertyValue: IPropertyValue,
    ReadOnly: Boolean
  ): IPropertyValueForDisplay = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], PropertyDefName = PropertyDefName.asInstanceOf[js.Any], PropertyValue = PropertyValue.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueForDisplay]
  }
  
  extension [Self <: IPropertyValueForDisplay](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValueForDisplay]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setContentType(value: MFContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefName(value: String): Self = StObject.set(x, "PropertyDefName", value.asInstanceOf[js.Any])
    
    inline def setPropertyValue(value: IPropertyValue): Self = StObject.set(x, "PropertyValue", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
  }
}
