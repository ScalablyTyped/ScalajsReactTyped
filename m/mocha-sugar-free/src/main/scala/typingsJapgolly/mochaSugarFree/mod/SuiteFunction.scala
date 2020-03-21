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
	 */
@js.native
trait SuiteFunction extends js.Object {
  /**
  		 * [bdd, tdd, qunit]
  		 *
  		 * Indicates this suite should be executed exclusively.
  		 */
  @JSName("only")
  var only_Original: ExclusiveSuiteFunction = js.native
  /**
  		 * [bdd, tdd]
  		 *
  		 * Indicates this suite should not be executed.
  		 */
  @JSName("skip")
  var skip_Original: PendingSuiteFunction = js.native
  // tslint:disable-next-line: unified-signatures
  def apply(options: OptionstitlestringfnSuite): Suite_ = js.native
  def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  def apply(title: String): Suite_ = js.native
  def apply(title: String, fn: SuiteFunc): Suite_ = js.native
  def apply(title: String, options: OptionsfnSuiteFunc): Suite_ = js.native
  def apply(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
  		 * [bdd, tdd, qunit]
  		 *
  		 * Indicates this suite should be executed exclusively.
  		 */
  def only(options: OptionstitlestringfnSuite): Suite_ = js.native
  def only(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  /**
  		 * [bdd, tdd, qunit]
  		 *
  		 * Indicates this suite should be executed exclusively.
  		 */
  def only(title: String): Suite_ = js.native
  def only(title: String, fn: SuiteFunc): Suite_ = js.native
  def only(title: String, options: OptionsfnSuiteFunc): Suite_ = js.native
  def only(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
  		 * [bdd, tdd]
  		 *
  		 * Indicates this suite should not be executed.
  		 */
  def skip(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
  def skip(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
  /**
  		 * [bdd, tdd]
  		 *
  		 * Indicates this suite should not be executed.
  		 */
  def skip(title: String): Suite_ | Unit = js.native
  def skip(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
  def skip(title: String, options: OptionsfnSuiteFunc): Suite_ | Unit = js.native
  def skip(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ | Unit = js.native
}

