package typingsJapgolly.envToObject.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.envToObject.envToObjectStrings.boolean
import typingsJapgolly.envToObject.envToObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.envToObject.mod.IntegerMapping
  - typingsJapgolly.envToObject.mod.BooleanMapping
  - typingsJapgolly.envToObject.mod.GenericMapping
*/
trait Mapping extends js.Object

object Mapping {
  @scala.inline
  def IntegerMapping(keypath: String, radix: Double, `type`: integer): Mapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  @scala.inline
  def BooleanMapping(strict: Boolean, `type`: boolean): Mapping = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  @scala.inline
  def GenericMapping(
    keypath: String,
    StringDictionary: /* opt */ StringDictionary[js.Any] = null,
    `type`: String = null
  ): Mapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}

