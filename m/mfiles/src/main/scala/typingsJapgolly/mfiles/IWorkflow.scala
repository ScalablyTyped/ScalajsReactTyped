package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInDocumentClass
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkflow extends StObject {
  
  def Clone(): IWorkflow
  
  def GetAsLookup(): ILookup
  
  def GetAsTypedValue(): ITypedValue
  
  var ID: Double
  
  var Name: String
  
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
}
object IWorkflow {
  
  inline def apply(
    Clone: CallbackTo[IWorkflow],
    GetAsLookup: CallbackTo[ILookup],
    GetAsTypedValue: CallbackTo[ITypedValue],
    ID: Double,
    Name: String,
    ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  ): IWorkflow = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, GetAsLookup = GetAsLookup.toJsFn, GetAsTypedValue = GetAsTypedValue.toJsFn, ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectClass = ObjectClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflow]
  }
  
  extension [Self <: IWorkflow](x: Self) {
    
    inline def setClone(value: CallbackTo[IWorkflow]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setGetAsLookup(value: CallbackTo[ILookup]): Self = StObject.set(x, "GetAsLookup", value.toJsFn)
    
    inline def setGetAsTypedValue(value: CallbackTo[ITypedValue]): Self = StObject.set(x, "GetAsTypedValue", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = StObject.set(x, "ObjectClass", value.asInstanceOf[js.Any])
  }
}
