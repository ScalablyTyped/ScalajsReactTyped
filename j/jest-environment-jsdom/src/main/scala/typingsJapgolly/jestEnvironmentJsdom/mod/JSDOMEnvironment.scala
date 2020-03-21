package typingsJapgolly.jestEnvironmentJsdom.mod

import typingsJapgolly.jestEnvironment.mod.JestEnvironment
import typingsJapgolly.jestEnvironmentJsdom.EventerrorError
import typingsJapgolly.jestFakeTimers.mod.JestFakeTimers
import typingsJapgolly.jsdom.mod.JSDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDOMEnvironment extends JestEnvironment {
  var dom: JSDOM | Null = js.native
  var errorEventListener: (js.Function1[/* event */ EventerrorError, Unit]) | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_JSDOMEnvironment: JestFakeTimers[Double] | Null = js.native
  @JSName("global")
  var global_JSDOMEnvironment: Win = js.native
}

