package typingsJapgolly.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceResponse extends StObject {
  
  /**
    * The list of tags removed
    */
  var TagList: js.UndefOr[typingsJapgolly.awsSdk.clientsMemorydbMod.TagList] = js.undefined
}
object UntagResourceResponse {
  
  inline def apply(): UntagResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceResponse]
  }
  
  extension [Self <: UntagResourceResponse](x: Self) {
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
