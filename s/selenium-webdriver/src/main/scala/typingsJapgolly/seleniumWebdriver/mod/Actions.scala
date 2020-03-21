package typingsJapgolly.seleniumWebdriver.mod

import typingsJapgolly.seleniumWebdriver.AnonAsync
import typingsJapgolly.seleniumWebdriver.AnonAsyncBoolean
import typingsJapgolly.seleniumWebdriver.AnonBridge
import typingsJapgolly.seleniumWebdriver.commandMod.Executor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "Actions")
@js.native
class Actions protected ()
  extends typingsJapgolly.seleniumWebdriver.inputMod.Actions {
  // region Constructors
  def this(executor: Executor) = this()
  def this(executor: Executor, options: AnonAsync) = this()
  def this(executor: Executor, options: AnonAsyncBoolean) = this()
  def this(executor: Executor, options: AnonBridge) = this()
}

