package typingsJapgolly.cypress.mochaMod.reporters

import typingsJapgolly.cypress.Mocha_.IRunner
import typingsJapgolly.cypress.Mocha_.Runner
import typingsJapgolly.cypress.Mocha_.reporters.Progress_.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Progress` bar test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Progress.html
  */
@JSImport("mocha", "reporters.Progress")
@js.native
class Progress_ protected ()
  extends typingsJapgolly.cypress.Mocha_.reporters.Progress_ {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: MochaOptions) = this()
  def this(runner: Runner, options: MochaOptions) = this()
}

