package typingsJapgolly.prettier.mod.doc.builders

import typingsJapgolly.prettier.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align_ extends _Doc {
  var contents: Doc
  var n: Double | String | AnonType
  var `type`: typingsJapgolly.prettier.prettierStrings.align
}

object Align_ {
  @scala.inline
  def apply(
    contents: Doc,
    n: Double | String | AnonType,
    `type`: typingsJapgolly.prettier.prettierStrings.align
  ): Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align_]
  }
}

