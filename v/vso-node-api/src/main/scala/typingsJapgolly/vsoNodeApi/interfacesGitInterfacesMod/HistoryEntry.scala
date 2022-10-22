package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryEntry[T] extends StObject {
  
  /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
  var changeList: ChangeList[T]
  
  /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
  var itemChangeType: VersionControlChangeType
  
  /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
  var serverItem: String
}
object HistoryEntry {
  
  inline def apply[T](changeList: ChangeList[T], itemChangeType: VersionControlChangeType, serverItem: String): HistoryEntry[T] = {
    val __obj = js.Dynamic.literal(changeList = changeList.asInstanceOf[js.Any], itemChangeType = itemChangeType.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryEntry[T]]
  }
  
  extension [Self <: HistoryEntry[?], T](x: Self & HistoryEntry[T]) {
    
    inline def setChangeList(value: ChangeList[T]): Self = StObject.set(x, "changeList", value.asInstanceOf[js.Any])
    
    inline def setItemChangeType(value: VersionControlChangeType): Self = StObject.set(x, "itemChangeType", value.asInstanceOf[js.Any])
    
    inline def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
  }
}
