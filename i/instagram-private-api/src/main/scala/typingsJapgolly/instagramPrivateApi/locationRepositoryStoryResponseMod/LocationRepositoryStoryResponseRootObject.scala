package typingsJapgolly.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseRootObject extends js.Object {
  var status: String
  var story: LocationRepositoryStoryResponseStory
}

object LocationRepositoryStoryResponseRootObject {
  @scala.inline
  def apply(status: String, story: LocationRepositoryStoryResponseStory): LocationRepositoryStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseRootObject]
  }
}

