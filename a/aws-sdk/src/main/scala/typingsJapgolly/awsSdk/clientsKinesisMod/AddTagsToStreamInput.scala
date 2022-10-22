package typingsJapgolly.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToStreamInput extends StObject {
  
  /**
    * The name of the stream.
    */
  var StreamName: typingsJapgolly.awsSdk.clientsKinesisMod.StreamName
  
  /**
    * A set of up to 10 key-value pairs to use to create the tags.
    */
  var Tags: TagMap
}
object AddTagsToStreamInput {
  
  inline def apply(StreamName: StreamName, Tags: TagMap): AddTagsToStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToStreamInput]
  }
  
  extension [Self <: AddTagsToStreamInput](x: Self) {
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
