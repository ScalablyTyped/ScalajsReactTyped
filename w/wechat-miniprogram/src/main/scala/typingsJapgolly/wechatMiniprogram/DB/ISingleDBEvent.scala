package typingsJapgolly.wechatMiniprogram.DB

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISingleDBEvent extends StObject {
  
  var dataType: DataType
  
  var doc: Record[String, Any]
  
  var docId: String
  
  var id: Double
  
  var queueType: QueueType
  
  var removedFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var updatedFields: js.UndefOr[Record[String, Any]] = js.undefined
}
object ISingleDBEvent {
  
  inline def apply(dataType: DataType, doc: Record[String, Any], docId: String, id: Double, queueType: QueueType): ISingleDBEvent = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], docId = docId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueType = queueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleDBEvent]
  }
  
  extension [Self <: ISingleDBEvent](x: Self) {
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDoc(value: Record[String, Any]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocId(value: String): Self = StObject.set(x, "docId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setQueueType(value: QueueType): Self = StObject.set(x, "queueType", value.asInstanceOf[js.Any])
    
    inline def setRemovedFields(value: js.Array[String]): Self = StObject.set(x, "removedFields", value.asInstanceOf[js.Any])
    
    inline def setRemovedFieldsUndefined: Self = StObject.set(x, "removedFields", js.undefined)
    
    inline def setRemovedFieldsVarargs(value: String*): Self = StObject.set(x, "removedFields", js.Array(value*))
    
    inline def setUpdatedFields(value: Record[String, Any]): Self = StObject.set(x, "updatedFields", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFieldsUndefined: Self = StObject.set(x, "updatedFields", js.undefined)
  }
}
