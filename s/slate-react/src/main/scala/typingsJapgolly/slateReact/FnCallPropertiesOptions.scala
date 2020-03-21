package typingsJapgolly.slateReact

import typingsJapgolly.slate.AnonSnapshot
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPropertiesOptions extends js.Object {
  def apply(properties: String): Controller = js.native
  def apply(properties: String, options: AnonSnapshot): Controller = js.native
  def apply(properties: RangeType): Controller = js.native
  def apply(properties: RangeTypeJSON): Controller = js.native
  def apply(properties: RangeTypeJSON, options: AnonSnapshot): Controller = js.native
  def apply(properties: RangeTypeProperties): Controller = js.native
  def apply(properties: RangeTypeProperties, options: AnonSnapshot): Controller = js.native
  def apply(properties: RangeType, options: AnonSnapshot): Controller = js.native
}

