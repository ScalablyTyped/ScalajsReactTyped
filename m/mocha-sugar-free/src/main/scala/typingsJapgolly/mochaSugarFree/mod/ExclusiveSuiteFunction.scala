package typingsJapgolly.mochaSugarFree.mod

import typingsJapgolly.mocha.mod.Suite_
import typingsJapgolly.mochaSugarFree.OptionsfnSuiteFunc
import typingsJapgolly.mochaSugarFree.OptionstitlestringfnSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * [bdd, tdd, qunit]
	 *
	 * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
	 *
	 * Indicates this suite should be executed exclusively.
	 */
@js.native
trait ExclusiveSuiteFunction extends js.Object {
  // tslint:disable-next-line: unified-signatures
  def apply(options: OptionstitlestringfnSuite): Suite_ = js.native
  def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  def apply(title: String): Suite_ = js.native
  def apply(title: String, fn: SuiteFunc): Suite_ = js.native
  def apply(title: String, options: OptionsfnSuiteFunc): Suite_ = js.native
  def apply(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ = js.native
}

