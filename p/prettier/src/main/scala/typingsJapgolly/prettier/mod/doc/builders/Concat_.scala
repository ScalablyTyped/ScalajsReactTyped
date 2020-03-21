package typingsJapgolly.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concat_ extends _Doc {
  var parts: js.Array[Doc]
  var `type`: typingsJapgolly.prettier.prettierStrings.concat
}

object Concat_ {
  @scala.inline
  def apply(parts: js.Array[Doc], `type`: typingsJapgolly.prettier.prettierStrings.concat): Concat_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concat_]
  }
}

