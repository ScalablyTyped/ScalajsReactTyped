package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectionRequest extends js.Object {
  /**
    * ID for the collection that you are creating.
    */
  var CollectionId: typingsJapgolly.awsSdk.rekognitionMod.CollectionId = js.native
}

object CreateCollectionRequest {
  @scala.inline
  def apply(CollectionId: CollectionId): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCollectionRequest]
  }
}

