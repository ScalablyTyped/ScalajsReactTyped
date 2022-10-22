package typingsJapgolly.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueueTagsResult extends StObject {
  
  /**
    * The list of all tags added to the specified queue.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ListQueueTagsResult {
  
  inline def apply(): ListQueueTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueueTagsResult]
  }
  
  extension [Self <: ListQueueTagsResult](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
