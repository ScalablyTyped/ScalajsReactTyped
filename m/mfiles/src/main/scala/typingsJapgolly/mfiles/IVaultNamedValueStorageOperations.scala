package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFNamedValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultNamedValueStorageOperations extends StObject {
  
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues
  
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit
  
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit
}
object IVaultNamedValueStorageOperations {
  
  inline def apply(
    GetNamedValues: (MFNamedValueType, String) => INamedValues,
    RemoveNamedValues: (MFNamedValueType, String, IStrings) => Callback,
    SetNamedValues: (MFNamedValueType, String, INamedValues) => Callback
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal(GetNamedValues = js.Any.fromFunction2(GetNamedValues), RemoveNamedValues = js.Any.fromFunction3((t0: MFNamedValueType, t1: String, t2: IStrings) => (RemoveNamedValues(t0, t1, t2)).runNow()), SetNamedValues = js.Any.fromFunction3((t0: MFNamedValueType, t1: String, t2: INamedValues) => (SetNamedValues(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
  
  extension [Self <: IVaultNamedValueStorageOperations](x: Self) {
    
    inline def setGetNamedValues(value: (MFNamedValueType, String) => INamedValues): Self = StObject.set(x, "GetNamedValues", js.Any.fromFunction2(value))
    
    inline def setRemoveNamedValues(value: (MFNamedValueType, String, IStrings) => Callback): Self = StObject.set(x, "RemoveNamedValues", js.Any.fromFunction3((t0: MFNamedValueType, t1: String, t2: IStrings) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetNamedValues(value: (MFNamedValueType, String, INamedValues) => Callback): Self = StObject.set(x, "SetNamedValues", js.Any.fromFunction3((t0: MFNamedValueType, t1: String, t2: INamedValues) => (value(t0, t1, t2)).runNow()))
  }
}
