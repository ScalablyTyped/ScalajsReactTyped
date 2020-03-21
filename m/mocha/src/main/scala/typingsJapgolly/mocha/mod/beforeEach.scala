package typingsJapgolly.mocha.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.mocha.Mocha_.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
@JSImport("mocha", "beforeEach")
@js.native
object beforeEach extends TopLevel[HookFunction]

