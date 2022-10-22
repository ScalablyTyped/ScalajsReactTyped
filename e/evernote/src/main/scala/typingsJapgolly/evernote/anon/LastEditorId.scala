package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.Types.Timestamp
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastEditorId extends StObject {
  
  var lastEditorId: js.UndefOr[UserID] = js.undefined
  
  var saved: js.UndefOr[Timestamp] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  
  var updated: js.UndefOr[Timestamp] = js.undefined
}
object LastEditorId {
  
  inline def apply(): LastEditorId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastEditorId]
  }
  
  extension [Self <: LastEditorId](x: Self) {
    
    inline def setLastEditorId(value: UserID): Self = StObject.set(x, "lastEditorId", value.asInstanceOf[js.Any])
    
    inline def setLastEditorIdUndefined: Self = StObject.set(x, "lastEditorId", js.undefined)
    
    inline def setSaved(value: Timestamp): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    
    inline def setSavedUndefined: Self = StObject.set(x, "saved", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    inline def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    inline def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
