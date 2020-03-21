package typingsJapgolly.consolidate.mod

import typingsJapgolly.consolidate.AnonDictotherOptions
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererInterface extends js.Object {
  def apply(path: String): typingsJapgolly.bluebird.mod.^[String] = js.native
  def apply(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def apply(path: String, options: AnonDictotherOptions): typingsJapgolly.bluebird.mod.^[String] = js.native
  def apply(
    path: String,
    options: AnonDictotherOptions,
    fn: js.Function2[/* err */ js.Error, /* html */ String, _]
  ): js.Any = js.native
  def render(path: String): typingsJapgolly.bluebird.mod.^[String] = js.native
  def render(path: String, fn: js.Function2[/* err */ Error, /* html */ String, _]): js.Any = js.native
  def render(path: String, options: AnonDictotherOptions): typingsJapgolly.bluebird.mod.^[String] = js.native
  def render(
    path: String,
    options: AnonDictotherOptions,
    fn: js.Function2[/* err */ js.Error, /* html */ String, _]
  ): js.Any = js.native
}

