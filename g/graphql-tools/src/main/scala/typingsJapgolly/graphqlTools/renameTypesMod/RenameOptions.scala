package typingsJapgolly.graphqlTools.renameTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions extends js.Object {
  var renameBuiltins: Boolean
  var renameScalars: Boolean
}

object RenameOptions {
  @scala.inline
  def apply(renameBuiltins: Boolean, renameScalars: Boolean): RenameOptions = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameOptions]
  }
}

