package typingsJapgolly.ignoreWalk

import typingsJapgolly.ignoreWalk.mod.Walker
import typingsJapgolly.ignoreWalk.mod.WalkerSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFollow extends js.Object {
  var follow: Boolean
  var ignoreFiles: js.Array[String]
  var includeEmpty: Boolean
  var parent: Walker | WalkerSync
  var path: String
}

object AnonFollow {
  @scala.inline
  def apply(
    follow: Boolean,
    ignoreFiles: js.Array[String],
    includeEmpty: Boolean,
    parent: Walker | WalkerSync,
    path: String
  ): AnonFollow = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFollow]
  }
}

