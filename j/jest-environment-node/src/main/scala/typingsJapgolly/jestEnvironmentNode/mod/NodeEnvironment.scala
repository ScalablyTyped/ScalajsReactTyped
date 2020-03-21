package typingsJapgolly.jestEnvironmentNode.mod

import typingsJapgolly.jestEnvironment.mod.JestEnvironment
import typingsJapgolly.jestFakeTimers.mod.JestFakeTimers
import typingsJapgolly.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeEnvironment extends JestEnvironment {
  var context: Context | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_NodeEnvironment: JestFakeTimers[Timer] | Null = js.native
}

