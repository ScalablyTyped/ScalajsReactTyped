package typingsJapgolly.mockjs.mod

import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.mock()
// see https://github.com/nuysoft/Mock/wiki/Mock.mock()
@js.native
trait MockjsMock extends js.Object {
  def apply(rurl: S, rtype: S, template: js.Any): Mockjs = js.native
  def apply(rurl: S, template: js.Any): Mockjs = js.native
  def apply(rurl: RegExp, rtype: S, template: js.Any): Mockjs = js.native
  def apply(rurl: RegExp, template: js.Any): Mockjs = js.native
  def apply(template: js.Any): js.Any = js.native
}

