package typingsJapgolly.mocha

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.mocha.Mocha_.HookFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
@JSGlobal("suiteSetup")
@js.native
object suiteSetup extends TopLevel[HookFunction]

