package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.anon.Dictname
import typingsJapgolly.sharepoint.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPClientPeoplePickerMRU extends StObject {
  
  def GetItems(strKey: String): Dictname
  
  def ResetCache(): Unit
  
  def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit
}
object SPClientPeoplePickerMRU {
  
  inline def apply(GetItems: String => Dictname, ResetCache: Callback, SetItem: (String, Any) => Callback): SPClientPeoplePickerMRU = {
    val __obj = js.Dynamic.literal(GetItems = js.Any.fromFunction1(GetItems), ResetCache = ResetCache.toJsFn, SetItem = js.Any.fromFunction2((t0: String, t1: Any) => (SetItem(t0, t1)).runNow()))
    __obj.asInstanceOf[SPClientPeoplePickerMRU]
  }
  
  extension [Self <: SPClientPeoplePickerMRU](x: Self) {
    
    inline def setGetItems(value: String => Dictname): Self = StObject.set(x, "GetItems", js.Any.fromFunction1(value))
    
    inline def setResetCache(value: Callback): Self = StObject.set(x, "ResetCache", value.toJsFn)
    
    inline def setSetItem(value: (String, Any) => Callback): Self = StObject.set(x, "SetItem", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
