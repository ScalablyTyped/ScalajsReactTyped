package typingsJapgolly.mocha.mod

import typingsJapgolly.mocha.Mocha.RunnerConstants
import typingsJapgolly.mocha.Mocha.RunnerOptions
import typingsJapgolly.mocha.Mocha.Suite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion Runner "pending" event
// #region Runner untyped events
// #endregion Runner "fail" event
// #region Runner "pending" event
// #endregion Runner "pass" event
// #region Runner "fail" event
// #endregion Runner "hook end" event
// #region Runner "pass" event
// #endregion Runner "hook" event
// #region Runner "hook end" event
// #endregion Runner "test end" event
// #region Runner "hook" event
// #endregion Runner "test" event
// #region Runner "test end" event
// #endregion Runner "suite end" event
// #region Runner "test" event
// #endregion Runner "suite" event
// #region Runner "suite end" event
// #endregion Runner "end" event
// #region Runner "suite" event
// #endregion Runner "start" event
// #region Runner "end" event
// #endregion Runner "waiting" event
// #region Runner "start" event
// #region Runner "waiting" event
/**
  * Initialize a `Runner` for the given `suite`.
  *
  * @see https://mochajs.org/api/Mocha.Runner.html
  */
@JSImport("mocha", "Runner")
@js.native
open class Runner protected ()
  extends StObject
     with typingsJapgolly.mocha.Mocha.Runner {
  /**
    * Initialize a `Runner` at the Root Suite, which represents a hierarchy of Suites and Tests.
    *
    * @param suite Root suite
    * @param optionsOrDelay Options. If boolean (deprecated), whether or not to delay execution of root suite until ready.
    */
  def this(suite: Suite) = this()
  def this(suite: Suite, optionsOrDelay: Boolean) = this()
  def this(suite: Suite, optionsOrDelay: RunnerOptions) = this()
}
object Runner {
  
  @JSImport("mocha", "Runner")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mocha", "Runner.constants")
  @js.native
  val constants: RunnerConstants = js.native
  
  /**
    * Wrapper for setImmediate, process.nextTick, or browser polyfill.
    */
  /* static member */
  inline def immediately(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("immediately")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
