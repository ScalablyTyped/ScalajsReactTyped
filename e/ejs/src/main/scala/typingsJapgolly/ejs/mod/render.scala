package typingsJapgolly.ejs.mod

import typingsJapgolly.ejs.Optionsasyncfalse
import typingsJapgolly.ejs.Optionsasyncnever
import typingsJapgolly.ejs.Optionsasynctrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "render")
@js.native
object render extends js.Object {
  def apply(template: String): String = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Optionsasyncnever): String = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Optionsasynctrue): js.Promise[String] = js.native
  def apply(template: String, data: Data): String = js.native
  def apply(template: String, data: Data, opts: Optionsasyncfalse): String = js.native
  def apply(template: String, data: Data, opts: Optionsasyncnever): String = js.native
  def apply(template: String, data: Data, opts: Optionsasynctrue): js.Promise[String] = js.native
  def apply(template: String, data: Data, opts: Options): String | js.Promise[String] = js.native
}

