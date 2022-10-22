package typingsJapgolly.activexAdodb.ADODB

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /* private */ @JSName("ADODB.Field_typekey")
  var ADODBDotField_typekey: Field
  
  val ActualSize: Double
  
  def AppendChunk(Data: Any): Unit
  
  /** Sum of one or more of the values in the **FieldAttributeEnum** enum */
  var Attributes: FieldAttributeEnum
  
  var DataFormat: Any
  
  var DefinedSize: Double
  
  def GetChunk(Length: Double): Any
  
  val Name: String
  
  var NumericScale: Double
  
  val OriginalValue: Any
  
  var Precision: Double
  
  def Properties(Index: String): Property
  def Properties(Index: Double): Property
  @JSName("Properties")
  val Properties_Original: Properties
  
  val Status: Double
  
  var Type: DataTypeEnum
  
  val UnderlyingValue: Any
  
  var Value: Any
}
object Field {
  
  inline def apply(
    ADODBDotField_typekey: Field,
    ActualSize: Double,
    AppendChunk: Any => Callback,
    Attributes: FieldAttributeEnum,
    DataFormat: Any,
    DefinedSize: Double,
    GetChunk: Double => Any,
    Name: String,
    NumericScale: Double,
    OriginalValue: Any,
    Precision: Double,
    Properties: Properties,
    Status: Double,
    Type: DataTypeEnum,
    UnderlyingValue: Any,
    Value: Any
  ): Field = {
    val __obj = js.Dynamic.literal(ActualSize = ActualSize.asInstanceOf[js.Any], AppendChunk = js.Any.fromFunction1((t0: Any) => AppendChunk(t0).runNow()), Attributes = Attributes.asInstanceOf[js.Any], DataFormat = DataFormat.asInstanceOf[js.Any], DefinedSize = DefinedSize.asInstanceOf[js.Any], GetChunk = js.Any.fromFunction1(GetChunk), Name = Name.asInstanceOf[js.Any], NumericScale = NumericScale.asInstanceOf[js.Any], OriginalValue = OriginalValue.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnderlyingValue = UnderlyingValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Field_typekey")(ADODBDotField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setADODBDotField_typekey(value: Field): Self = StObject.set(x, "ADODB.Field_typekey", value.asInstanceOf[js.Any])
    
    inline def setActualSize(value: Double): Self = StObject.set(x, "ActualSize", value.asInstanceOf[js.Any])
    
    inline def setAppendChunk(value: Any => Callback): Self = StObject.set(x, "AppendChunk", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAttributes(value: FieldAttributeEnum): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setDataFormat(value: Any): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDefinedSize(value: Double): Self = StObject.set(x, "DefinedSize", value.asInstanceOf[js.Any])
    
    inline def setGetChunk(value: Double => Any): Self = StObject.set(x, "GetChunk", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumericScale(value: Double): Self = StObject.set(x, "NumericScale", value.asInstanceOf[js.Any])
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "OriginalValue", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnderlyingValue(value: Any): Self = StObject.set(x, "UnderlyingValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
