package typingsJapgolly.mocha.mod

import typingsJapgolly.mocha.Mocha_.IContext
import typingsJapgolly.mocha.Mocha_.ISuite
import typingsJapgolly.mocha.Mocha_.SuiteConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Suite "post-require" event
// #region Suite untyped events
// #endregion Suite "require" event
// #region Suite "post-require" event
// #endregion Suite "pre-require" event
// #region Suite "require" event
// #endregion Suite "run" event
// #region Suite "pre-require" event
// #endregion Suite "test" event
// #region Suite "run" event
// #endregion Suite "suite" event
// #region Suite "test" event
// #endregion Suite "afterEach" event
// #region Suite "suite" event
// #endregion Suite "beforeEach" event
// #region Suite "afterEach" event
// #endregion Suite "afterAll" event
// #region Suite "beforeEach" event
// #endregion Suite "beforeAll" event
// #region Suite "afterAll" event
// #region Suite "beforeAll" event
/**
  * Initialize a new `Suite` with the given `title` and `ctx`.
  *
  * @see https://mochajs.org/api/Mocha.Suite.html
  */
@JSImport("mocha", "Suite")
@js.native
class Suite_ protected ()
  extends typingsJapgolly.mocha.Mocha_.Suite_ {
  def this(title: String) = this()
  def this(title: String, parentContext: typingsJapgolly.mocha.Mocha_.Context) = this()
  def this(title: String, parentContext: IContext) = this()
}

/* static members */
@JSImport("mocha", "Suite")
@js.native
object Suite_ extends js.Object {
  val constants: SuiteConstants = js.native
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def create(parent: ISuite, title: String): typingsJapgolly.mocha.Mocha_.Suite_ = js.native
  /**
    * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
    * with the same title is already present, that suite is returned to provide
    * nicer reporter and more flexible meta-testing.
    *
    * @see https://mochajs.org/api/mocha#.exports.create
    */
  def create(parent: typingsJapgolly.mocha.Mocha_.Suite_, title: String): typingsJapgolly.mocha.Mocha_.Suite_ = js.native
}

