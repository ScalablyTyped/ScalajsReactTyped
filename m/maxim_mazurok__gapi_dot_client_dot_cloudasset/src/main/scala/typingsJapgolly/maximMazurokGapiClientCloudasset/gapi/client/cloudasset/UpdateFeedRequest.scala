package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeedRequest extends StObject {
  
  /**
    * Required. The new values of feed details. It must match an existing feed and the field `name` must be in the format of: projects/project_number/feeds/feed_id or
    * folders/folder_number/feeds/feed_id or organizations/organization_number/feeds/feed_id.
    */
  var feed: js.UndefOr[Feed] = js.undefined
  
  /** Required. Only updates the `feed` fields indicated by this mask. The field mask must not be empty, and it must not contain fields that are immutable or only set by the server. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateFeedRequest {
  
  inline def apply(): UpdateFeedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFeedRequest]
  }
  
  extension [Self <: UpdateFeedRequest](x: Self) {
    
    inline def setFeed(value: Feed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    inline def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
