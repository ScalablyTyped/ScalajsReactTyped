package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberMocha {
  type mochaAfter = typingsJapgolly.mocha.Mocha_.HookFunction
  type mochaAfterEach = typingsJapgolly.mocha.Mocha_.HookFunction
  // these globals are re-exported as named exports by ember-mocha
  type mochaBefore = typingsJapgolly.mocha.Mocha_.HookFunction
  type mochaBeforeEach = typingsJapgolly.mocha.Mocha_.HookFunction
  type mochaSetup = typingsJapgolly.mocha.Mocha_.HookFunction
  type mochaSuiteSetup = typingsJapgolly.mocha.Mocha_.HookFunction
  type mochaSuiteTeardown = typingsJapgolly.mocha.Mocha_.HookFunction
  type mochaTeardown = typingsJapgolly.mocha.Mocha_.HookFunction
}
