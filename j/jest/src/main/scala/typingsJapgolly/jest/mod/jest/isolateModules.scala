package typingsJapgolly.jest.mod.jest

import typingsJapgolly.jest.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.isolateModules")
@js.native
object isolateModules extends js.Object {
  /**
    * Creates a sandbox registry for the modules that are loaded inside the callback function..
    * This is useful to isolate specific modules for every test so that local module state doesn't conflict between tests.
    */
  def apply(fn: js.Function0[Unit]): Typeofjest = js.native
}

