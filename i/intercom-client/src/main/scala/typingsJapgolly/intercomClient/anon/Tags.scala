package typingsJapgolly.intercomClient.anon

import typingsJapgolly.intercomClient.intercomClientStrings.tagDotlist
import typingsJapgolly.intercomClient.userMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  var tags: js.Array[Tag]
  
  var `type`: tagDotlist
}
object Tags {
  
  inline def apply(tags: js.Array[Tag]): Tags = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tag.list")
    __obj.asInstanceOf[Tags]
  }
  
  extension [Self <: Tags](x: Self) {
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: tagDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
