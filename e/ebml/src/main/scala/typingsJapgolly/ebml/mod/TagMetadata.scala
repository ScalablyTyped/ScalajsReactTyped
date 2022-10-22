package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.ebmlStrings.f
import typingsJapgolly.ebml.ebmlStrings.i
import typingsJapgolly.ebml.ebmlStrings.s
import typingsJapgolly.ebml.ebmlStrings.u
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagMetadata extends StObject {
  
  /** Size of data in bytes */
  var dataSize: Double
  
  /** End byte offset if known, else `-1` */
  var end: Double
  
  /** Element name */
  var name: String
  
  /** Start byte offset */
  var start: Double
  
  /** EBML ID */
  var tag: Double
  
  /** EBML ID as a hex string */
  var tagStr: String
  
  /** Data type */
  var `type`: TagType | u | i | f | s
}
object TagMetadata {
  
  inline def apply(
    dataSize: Double,
    end: Double,
    name: String,
    start: Double,
    tag: Double,
    tagStr: String,
    `type`: TagType | u | i | f | s
  ): TagMetadata = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagStr = tagStr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagMetadata]
  }
  
  extension [Self <: TagMetadata](x: Self) {
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagStr(value: String): Self = StObject.set(x, "tagStr", value.asInstanceOf[js.Any])
    
    inline def setType(value: TagType | u | i | f | s): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
