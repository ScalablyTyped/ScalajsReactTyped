package typingsJapgolly.got.mod

import typingsJapgolly.got.GotInstanceGotBodyFnstrin
import typingsJapgolly.got.GotInstanceGotFormFnstrin
import typingsJapgolly.got.GotInstanceGotJSONFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotExtend extends js.Object {
  def apply(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  def apply(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def apply(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
}

