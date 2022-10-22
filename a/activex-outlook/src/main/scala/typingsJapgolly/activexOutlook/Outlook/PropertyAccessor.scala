package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyAccessor extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  def BinaryToString(Value: Any): String
  
  val Class: OlObjectClass
  
  def DeleteProperties(SchemaNames: Any): Any
  
  def DeleteProperty(SchemaName: String): Unit
  
  def GetProperties(SchemaNames: Any): Any
  
  def GetProperty(SchemaName: String): Any
  
  def LocalTimeToUTC(Value: VarDate): VarDate
  
  /* private */ @JSName("Outlook.PropertyAccessor_typekey")
  var OutlookDotPropertyAccessor_typekey: PropertyAccessor
  
  val Parent: Any
  
  val Session: NameSpace
  
  def SetProperties(SchemaNames: Any, Values: Any): Any
  
  def SetProperty(SchemaName: String, Value: Any): Unit
  
  def StringToBinary(Value: String): Any
  
  def UTCToLocalTime(Value: VarDate): VarDate
}
object PropertyAccessor {
  
  inline def apply(
    Application: Application,
    BinaryToString: Any => String,
    Class: OlObjectClass,
    DeleteProperties: Any => Any,
    DeleteProperty: String => Callback,
    GetProperties: Any => Any,
    GetProperty: String => Any,
    LocalTimeToUTC: VarDate => VarDate,
    OutlookDotPropertyAccessor_typekey: PropertyAccessor,
    Parent: Any,
    Session: NameSpace,
    SetProperties: (Any, Any) => Any,
    SetProperty: (String, Any) => Callback,
    StringToBinary: String => Any,
    UTCToLocalTime: VarDate => VarDate
  ): PropertyAccessor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BinaryToString = js.Any.fromFunction1(BinaryToString), Class = Class.asInstanceOf[js.Any], DeleteProperties = js.Any.fromFunction1(DeleteProperties), DeleteProperty = js.Any.fromFunction1((t0: String) => DeleteProperty(t0).runNow()), GetProperties = js.Any.fromFunction1(GetProperties), GetProperty = js.Any.fromFunction1(GetProperty), LocalTimeToUTC = js.Any.fromFunction1(LocalTimeToUTC), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetProperties = js.Any.fromFunction2(SetProperties), SetProperty = js.Any.fromFunction2((t0: String, t1: Any) => (SetProperty(t0, t1)).runNow()), StringToBinary = js.Any.fromFunction1(StringToBinary), UTCToLocalTime = js.Any.fromFunction1(UTCToLocalTime))
    __obj.updateDynamic("Outlook.PropertyAccessor_typekey")(OutlookDotPropertyAccessor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyAccessor]
  }
  
  extension [Self <: PropertyAccessor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBinaryToString(value: Any => String): Self = StObject.set(x, "BinaryToString", js.Any.fromFunction1(value))
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDeleteProperties(value: Any => Any): Self = StObject.set(x, "DeleteProperties", js.Any.fromFunction1(value))
    
    inline def setDeleteProperty(value: String => Callback): Self = StObject.set(x, "DeleteProperty", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetProperties(value: Any => Any): Self = StObject.set(x, "GetProperties", js.Any.fromFunction1(value))
    
    inline def setGetProperty(value: String => Any): Self = StObject.set(x, "GetProperty", js.Any.fromFunction1(value))
    
    inline def setLocalTimeToUTC(value: VarDate => VarDate): Self = StObject.set(x, "LocalTimeToUTC", js.Any.fromFunction1(value))
    
    inline def setOutlookDotPropertyAccessor_typekey(value: PropertyAccessor): Self = StObject.set(x, "Outlook.PropertyAccessor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetProperties(value: (Any, Any) => Any): Self = StObject.set(x, "SetProperties", js.Any.fromFunction2(value))
    
    inline def setSetProperty(value: (String, Any) => Callback): Self = StObject.set(x, "SetProperty", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setStringToBinary(value: String => Any): Self = StObject.set(x, "StringToBinary", js.Any.fromFunction1(value))
    
    inline def setUTCToLocalTime(value: VarDate => VarDate): Self = StObject.set(x, "UTCToLocalTime", js.Any.fromFunction1(value))
  }
}
