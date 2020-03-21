package typingsJapgolly.emberMocha.mod

import typingsJapgolly.emberTestHelpers.mod.ModuleCallbacks
import typingsJapgolly.mocha.Mocha_.ISuiteCallbackContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextDefinition extends ContextDefinitionFunction {
  @JSName("only")
  var only_Original: ContextDefinitionFunction = js.native
  @JSName("skip")
  var skip_Original: ContextDefinitionFunction = js.native
  def only(
    name: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def only(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def only(name: String, description: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
  def only(name: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
  def skip(
    name: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def skip(
    name: String,
    description: String,
    callbacks: ModuleCallbacks,
    tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]
  ): Unit = js.native
  def skip(name: String, description: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
  def skip(name: String, tests: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
}

