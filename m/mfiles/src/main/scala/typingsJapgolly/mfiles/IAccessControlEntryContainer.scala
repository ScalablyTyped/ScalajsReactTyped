package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryContainer extends StObject {
  
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit
  
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData
  
  def Clear(): Unit
  
  def Clone(): IAccessControlEntryContainer
  
  def GetKeys(): IAccessControlEntryKeys
  
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys
  
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean
  
  val IsEmpty: Boolean
  
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit
}
object IAccessControlEntryContainer {
  
  inline def apply(
    Add: (IAccessControlEntryKey, IAccessControlEntryData) => Callback,
    At: IAccessControlEntryKey => IAccessControlEntryData,
    Clear: Callback,
    Clone: CallbackTo[IAccessControlEntryContainer],
    GetKeys: CallbackTo[IAccessControlEntryKeys],
    GetKeysWithPseudoUserDefinitions: CallbackTo[IAccessControlEntryKeys],
    HasKey: IAccessControlEntryKey => Boolean,
    IsEmpty: Boolean,
    Remove: IAccessControlEntryKey => Callback
  ): IAccessControlEntryContainer = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: IAccessControlEntryKey, t1: IAccessControlEntryData) => (Add(t0, t1)).runNow()), At = js.Any.fromFunction1(At), Clear = Clear.toJsFn, Clone = Clone.toJsFn, GetKeys = GetKeys.toJsFn, GetKeysWithPseudoUserDefinitions = GetKeysWithPseudoUserDefinitions.toJsFn, HasKey = js.Any.fromFunction1(HasKey), IsEmpty = IsEmpty.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: IAccessControlEntryKey) => Remove(t0).runNow()))
    __obj.asInstanceOf[IAccessControlEntryContainer]
  }
  
  extension [Self <: IAccessControlEntryContainer](x: Self) {
    
    inline def setAdd(value: (IAccessControlEntryKey, IAccessControlEntryData) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: IAccessControlEntryKey, t1: IAccessControlEntryData) => (value(t0, t1)).runNow()))
    
    inline def setAt(value: IAccessControlEntryKey => IAccessControlEntryData): Self = StObject.set(x, "At", js.Any.fromFunction1(value))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setClone(value: CallbackTo[IAccessControlEntryContainer]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setGetKeys(value: CallbackTo[IAccessControlEntryKeys]): Self = StObject.set(x, "GetKeys", value.toJsFn)
    
    inline def setGetKeysWithPseudoUserDefinitions(value: CallbackTo[IAccessControlEntryKeys]): Self = StObject.set(x, "GetKeysWithPseudoUserDefinitions", value.toJsFn)
    
    inline def setHasKey(value: IAccessControlEntryKey => Boolean): Self = StObject.set(x, "HasKey", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "IsEmpty", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: IAccessControlEntryKey => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: IAccessControlEntryKey) => value(t0).runNow()))
  }
}
