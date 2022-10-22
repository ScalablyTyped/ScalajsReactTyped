package typingsJapgolly.servicenow

import japgolly.scalajs.react.Callback
import typingsJapgolly.servicenow.servicenow.GlideRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideSysAttachment extends StObject {
  
  def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit
  
  def deleteAttachment(sysId: String): Unit
  
  def getContent(record: GlideRecord): Any
  
  def getContentBase64(record: GlideRecord): String
  
  def getContentStream(sysId: String): js.Object
  
  def write(record: GlideRecord, fileName: String, contentType: String, data: Any): String
  
  def writeBase64(record: GlideRecord, fileName: String, contentType: String, base64Content: String): String
  
  def writeContentStream(record: GlideRecord, fileName: String, contentType: String, inputStream: js.Object): String
}
object GlideSysAttachment {
  
  inline def apply(
    copy: (String, String, String, String) => Callback,
    deleteAttachment: String => Callback,
    getContent: GlideRecord => Any,
    getContentBase64: GlideRecord => String,
    getContentStream: String => js.Object,
    write: (GlideRecord, String, String, Any) => String,
    writeBase64: (GlideRecord, String, String, String) => String,
    writeContentStream: (GlideRecord, String, String, js.Object) => String
  ): GlideSysAttachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (copy(t0, t1, t2, t3)).runNow()), deleteAttachment = js.Any.fromFunction1((t0: String) => deleteAttachment(t0).runNow()), getContent = js.Any.fromFunction1(getContent), getContentBase64 = js.Any.fromFunction1(getContentBase64), getContentStream = js.Any.fromFunction1(getContentStream), write = js.Any.fromFunction4(write), writeBase64 = js.Any.fromFunction4(writeBase64), writeContentStream = js.Any.fromFunction4(writeContentStream))
    __obj.asInstanceOf[GlideSysAttachment]
  }
  
  extension [Self <: GlideSysAttachment](x: Self) {
    
    inline def setCopy(value: (String, String, String, String) => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDeleteAttachment(value: String => Callback): Self = StObject.set(x, "deleteAttachment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetContent(value: GlideRecord => Any): Self = StObject.set(x, "getContent", js.Any.fromFunction1(value))
    
    inline def setGetContentBase64(value: GlideRecord => String): Self = StObject.set(x, "getContentBase64", js.Any.fromFunction1(value))
    
    inline def setGetContentStream(value: String => js.Object): Self = StObject.set(x, "getContentStream", js.Any.fromFunction1(value))
    
    inline def setWrite(value: (GlideRecord, String, String, Any) => String): Self = StObject.set(x, "write", js.Any.fromFunction4(value))
    
    inline def setWriteBase64(value: (GlideRecord, String, String, String) => String): Self = StObject.set(x, "writeBase64", js.Any.fromFunction4(value))
    
    inline def setWriteContentStream(value: (GlideRecord, String, String, js.Object) => String): Self = StObject.set(x, "writeContentStream", js.Any.fromFunction4(value))
  }
}
