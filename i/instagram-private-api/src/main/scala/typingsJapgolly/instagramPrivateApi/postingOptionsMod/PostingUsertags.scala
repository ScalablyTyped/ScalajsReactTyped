package typingsJapgolly.instagramPrivateApi.postingOptionsMod

import typingsJapgolly.instagramPrivateApi.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingUsertags extends js.Object {
  var in: js.Array[AnonPosition]
}

object PostingUsertags {
  @scala.inline
  def apply(in: js.Array[AnonPosition]): PostingUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostingUsertags]
  }
}

