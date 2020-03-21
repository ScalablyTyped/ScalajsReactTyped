package typingsJapgolly.atomMochaTestRunner.mod

import typingsJapgolly.atom.mod.TestRunner
import typingsJapgolly.mocha.Mocha_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The test runner function is augmented on export by:
//   import createRunner from './lib/create-runner'
//
//   module.exports = createRunner()
//   module.exports.createRunner = createRunner
// Which is what we're trying to model here.
@js.native
trait TestRunnerExport extends TestRunner {
  def createRunner(): TestRunner = js.native
  def createRunner(options: AtomMochaOptions): TestRunner = js.native
  def createRunner(options: AtomMochaOptions, mochaConfigFunction: js.Function1[/* mocha */ Mocha_, Unit]): TestRunner = js.native
}

