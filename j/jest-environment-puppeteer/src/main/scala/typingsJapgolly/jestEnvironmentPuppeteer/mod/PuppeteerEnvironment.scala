package typingsJapgolly.jestEnvironmentPuppeteer.mod

import typingsJapgolly.jestEnvironment.mod.JestEnvironment
import typingsJapgolly.jestFakeTimers.mod.JestFakeTimers
import typingsJapgolly.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
@js.native
trait PuppeteerEnvironment extends JestEnvironment {
  var context: Context | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_PuppeteerEnvironment: JestFakeTimers[Timer] | Null = js.native
  @JSName("global")
  var global_PuppeteerEnvironment: Global = js.native
}

