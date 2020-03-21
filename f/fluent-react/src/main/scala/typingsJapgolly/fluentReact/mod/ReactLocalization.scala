package typingsJapgolly.fluentReact.mod

import typingsJapgolly.fluent.mod.FluentBundle
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-react", "ReactLocalization")
@js.native
class ReactLocalization protected () extends js.Object {
  def this(bundles: IterableIterator[FluentBundle]) = this()
  def getString(id: String): String = js.native
  def getString(id: String, args: js.Object): String = js.native
  def getString(id: String, args: js.Object, fallback: String): String = js.native
}

