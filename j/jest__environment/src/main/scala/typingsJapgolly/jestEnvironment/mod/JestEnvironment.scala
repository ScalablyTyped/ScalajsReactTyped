package typingsJapgolly.jestEnvironment.mod

import typingsJapgolly.jestEnvironment.AnonEVALRESULTVARIABLE
import typingsJapgolly.jestFakeTimers.mod.JestFakeTimers
import typingsJapgolly.jestMock.mod.ModuleMocker
import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.State
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import typingsJapgolly.jestTypes.globalMod.Global
import typingsJapgolly.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/environment", "JestEnvironment")
@js.native
class JestEnvironment protected () extends js.Object {
  def this(config: ProjectConfig) = this()
  def this(config: ProjectConfig, context: EnvironmentContext) = this()
  var fakeTimers: JestFakeTimers[_] | Null = js.native
  var global: Global = js.native
  var handleTestEvent: js.UndefOr[js.Function2[/* event */ Event, /* state */ State, Unit]] = js.native
  var moduleMocker: ModuleMocker | Null = js.native
  def runScript(script: Script): AnonEVALRESULTVARIABLE | Null = js.native
  def setup(): js.Promise[Unit] = js.native
  def teardown(): js.Promise[Unit] = js.native
}

