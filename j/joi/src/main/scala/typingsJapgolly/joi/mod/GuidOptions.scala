package typingsJapgolly.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuidOptions extends js.Object {
  var version: js.Array[GuidVersions] | GuidVersions
}

object GuidOptions {
  @scala.inline
  def apply(version: js.Array[GuidVersions] | GuidVersions): GuidOptions = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GuidOptions]
  }
}

