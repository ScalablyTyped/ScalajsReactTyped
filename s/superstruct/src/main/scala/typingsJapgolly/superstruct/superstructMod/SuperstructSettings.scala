package typingsJapgolly.superstruct.superstructMod

import typingsJapgolly.std.Record
import typingsJapgolly.superstruct.AnonInstantiable
import typingsJapgolly.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperstructSettings extends js.Object {
  var error: AnonInstantiable
  var types: Record[String, Validator]
}

object SuperstructSettings {
  @scala.inline
  def apply(error: AnonInstantiable, types: Record[String, Validator]): SuperstructSettings = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuperstructSettings]
  }
}

