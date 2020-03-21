package typingsJapgolly.emberMocha.mod

import typingsJapgolly.emberTestHelpers.mod.ModuleCallbacks
import typingsJapgolly.mocha.Mocha_.ISuiteCallbackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDefinitionFunction extends js.Object {
  def apply(
    name: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def apply(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def apply(name: String, description: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
  def apply(name: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
}

