package typingsJapgolly.mailgunJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var data: String | Buffer | ReadWriteStream
  
  var filename: js.UndefOr[String] = js.undefined
  
  def getType(): String
  
  var knownLength: js.UndefOr[Double] = js.undefined
}
object Attachment {
  
  inline def apply(data: String | Buffer | ReadWriteStream, getType: CallbackTo[String]): Attachment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getType = getType.toJsFn)
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String | Buffer | ReadWriteStream): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setKnownLength(value: Double): Self = StObject.set(x, "knownLength", value.asInstanceOf[js.Any])
    
    inline def setKnownLengthUndefined: Self = StObject.set(x, "knownLength", js.undefined)
  }
}
