package typingsJapgolly.emberQunit.mod

import typingsJapgolly.emberTestHelpers.mod.TestContext
import typingsJapgolly.qunit.Assert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-qunit", "only")
@js.native
object only extends js.Object {
  def apply(name: String, callback: js.ThisFunction1[/* this */ TestContext, /* assert */ Assert, Unit]): Unit = js.native
}

