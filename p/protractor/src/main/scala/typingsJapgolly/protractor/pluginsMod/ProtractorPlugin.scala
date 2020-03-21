package typingsJapgolly.protractor.pluginsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.AnonSpecName
import typingsJapgolly.protractor.AnonSpecNameString
import typingsJapgolly.protractor.browserMod.ProtractorBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtractorPlugin extends js.Object {
  /**
    * Adds a failed assertion to the test's results.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * @param {string} message The error message for the failed assertion
    * @param {specName: string, stackTrace: string} options Some optional extra
    *     information about the assertion:
    *       - specName The name of the spec which this assertion belongs to.
    *            Defaults to `PLUGIN_NAME + ' Plugin Tests'`.
    *       - stackTrace The stack trace for the failure.  Defaults to undefined.
    *     Defaults to `{}`.
    *
    * @throws {Error} Throws an error if called after results have been reported
    */
  var addFailure: js.UndefOr[
    js.Function2[/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecName], Unit]
  ] = js.undefined
  /**
    * Adds a passed assertion to the test's results.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * @param {specName: string} options Extra information about the assertion:
    *       - specName The name of the spec which this assertion belongs to.
    *            Defaults to `PLUGIN_NAME + ' Plugin Tests'`.
    *     Defaults to `{}`.
    *
    * @throws {Error} Throws an error if called after results have been reported
    */
  var addSuccess: js.UndefOr[js.Function1[/* info */ js.UndefOr[AnonSpecNameString], Unit]] = js.undefined
  /**
    * Warns the user that something is problematic.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * @param {string} message The message to warn the user about
    * @param {specName: string} options Extra information about the assertion:
    *       - specName The name of the spec which this assertion belongs to.
    *            Defaults to `PLUGIN_NAME + ' Plugin Tests'`.
    *     Defaults to `{}`.
    */
  var addWarning: js.UndefOr[
    js.Function2[/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecNameString], Unit]
  ] = js.undefined
  /**
    * The plugin's configuration object.
    *
    * Note: this property is added by Protractor at runtime.  Any pre-existing
    * value will be overwritten.
    *
    * Note: that this is not the entire Protractor config object, just the entry
    * in the `plugins` array for this plugin.
    *
    * @type {Object}
    */
  var config: js.UndefOr[PluginConfig] = js.undefined
  /**
    * The name of the plugin.  Used when reporting results.
    *
    * If you do not specify this property, it will be filled in with something
    * reasonable (e.g. the plugin's path) by Protractor at runtime.
    *
    * @type {string}
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * This is called inside browser.get() directly after the page loads, and before
    * angular bootstraps.
    *
    * @param {ProtractorBrowser} browser The browser instance which is loading a page.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise=} Can return a promise, in which case
    *     protractor will wait for the promise to resolve before continuing.  If
    *     the promise is rejected, a failed assertion is added to the test results.
    */
  var onPageLoad: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, Unit | js.Promise[Unit]]] = js.undefined
  /**
    * This is called inside browser.get() directly after angular is done
    * bootstrapping/synchronizing.  If `browser.ignoreSynchronization` is `true`,
    * this will not be called.
    *
    * @param {ProtractorBrowser} browser The browser instance which is loading a page.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise=} Can return a promise, in which case
    *     protractor will wait for the promise to resolve before continuing.  If
    *     the promise is rejected, a failed assertion is added to the test results.
    */
  var onPageStable: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, Unit | js.Promise[Unit]]] = js.undefined
  /**
    * This is called before the test have been run but after the test framework has
    * been set up.  Analogous to a config file's `onPrepare`.
    *
    * Very similar to using `setup`, but allows you to access framework-specific
    * variables/functions (e.g. `jasmine.getEnv().addReporter()`).
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, a failed assertion is added to the test results.
    */
  var onPrepare: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Called after the test results have been finalized and any jobs have been
    * updated (if applicable).
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, it is outputted to the console.
    *     It is too late to add a failed assertion to the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, an error is logged to the console.
    */
  var postResults: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Called after each test block (in Jasmine, this means an `it` block)
    * completes.
    *
    * @param {boolean} passed True if the test passed.
    * @param {Object} testInfo information about the test which just ran.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before outputting test results.  Protractor
    *     will *not* wait before executing the next test; however, if the promise
    *     is rejected, a failed assertion is added to the test results.
    */
  var postTest: js.UndefOr[
    js.Function2[/* passed */ Boolean, /* testInfo */ js.Any, Unit | js.Promise[Unit]]
  ] = js.undefined
  /**
    * Sets up plugins before tests are run. This is called after the WebDriver
    * session has been started, but before the test framework has been set up.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, a failed assertion is added to the test results.
    */
  var setup: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Used to turn off default checks for angular stability
    *
    * Normally Protractor waits for all $timeout and $http calls to be processed
    * before executing the next command.  This can be disabled using
    * browser.ignoreSynchronization, but that will also disable any
    * <Plugin>.waitForPromise or <Plugin>.waitForCondition checks.  If you want
    * to disable synchronization with angular, but leave intact any custom plugin
    * synchronization, this is the option for you.
    *
    * This is used by plugin authors who want to replace Protractor's
    * synchronization code with their own.
    *
    * @type {boolean}
    */
  var skipAngularStability: js.UndefOr[Boolean] = js.undefined
  /**
    * This is called after the tests have been run, but before the WebDriver
    * session has been terminated.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {Promise=} Can return a promise, in which case protractor will wait
    *     for the promise to resolve before continuing.  If the promise is
    *     rejected, a failed assertion is added to the test results.
    */
  var teardown: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
  /**
    * Between every webdriver action, Protractor calls browser.waitForAngular() to
    * make sure that Angular has no outstanding $http or $timeout calls.
    * You can use waitForCondition() to have Protractor additionally wait for your
    * custom condition to be truthy.  If specified, this function will be called
    * repeatedly until truthy.
    *
    * @param {ProtractorBrowser} browser The browser instance which needs invoked `waitForAngular`.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise<boolean>|boolean} If truthy, Protractor
    *     will continue onto the next command. If falsy, webdriver will
    *     continuously re-run this function until it is truthy.  If a rejected promise
    *     is returned, a failed assertion is added to the test results, and Protractor
    *     will continue onto the next command.
    */
  var waitForCondition: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, js.Promise[Boolean] | Boolean]] = js.undefined
  /**
    * Between every webdriver action, Protractor calls browser.waitForAngular() to
    * make sure that Angular has no outstanding $http or $timeout calls.
    * You can use waitForPromise() to have Protractor additionally wait for your
    * custom promise to be resolved inside of browser.waitForAngular().
    *
    * @param {ProtractorBrowser} browser The browser instance which needs invoked `waitForAngular`.
    *
    * @this {Object} bound to module.exports.
    *
    * @throws {*} If this function throws an error, a failed assertion is added to
    *     the test results.
    *
    * @return {webdriver.promise.Promise=} Can return a promise, in which case
    *     protractor will wait for the promise to resolve before continuing. If the
    *     promise is rejected, a failed assertion is added to the test results, and
    *     protractor will continue onto the next command. If nothing is returned or
    *     something other than a promise is returned, protractor will continue
    *     onto the next command.
    */
  var waitForPromise: js.UndefOr[js.Function1[/* browser */ ProtractorBrowser, js.Promise[Unit]]] = js.undefined
}

object ProtractorPlugin {
  @scala.inline
  def apply(
    addFailure: (/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecName]) => Callback = null,
    addSuccess: /* info */ js.UndefOr[AnonSpecNameString] => Callback = null,
    addWarning: (/* message */ js.UndefOr[String], /* info */ js.UndefOr[AnonSpecNameString]) => Callback = null,
    config: PluginConfig = null,
    name: String = null,
    onPageLoad: /* browser */ ProtractorBrowser => CallbackTo[Unit | js.Promise[Unit]] = null,
    onPageStable: /* browser */ ProtractorBrowser => CallbackTo[Unit | js.Promise[Unit]] = null,
    onPrepare: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined,
    postResults: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined,
    postTest: (/* passed */ Boolean, /* testInfo */ js.Any) => CallbackTo[Unit | js.Promise[Unit]] = null,
    setup: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined,
    skipAngularStability: js.UndefOr[Boolean] = js.undefined,
    teardown: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined,
    waitForCondition: /* browser */ ProtractorBrowser => CallbackTo[js.Promise[Boolean] | Boolean] = null,
    waitForPromise: /* browser */ ProtractorBrowser => CallbackTo[js.Promise[Unit]] = null
  ): ProtractorPlugin = {
    val __obj = js.Dynamic.literal()
    if (addFailure != null) __obj.updateDynamic("addFailure")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[java.lang.String], t1: /* info */ js.UndefOr[typingsJapgolly.protractor.AnonSpecName]) => addFailure(t0, t1).runNow()))
    if (addSuccess != null) __obj.updateDynamic("addSuccess")(js.Any.fromFunction1((t0: /* info */ js.UndefOr[typingsJapgolly.protractor.AnonSpecNameString]) => addSuccess(t0).runNow()))
    if (addWarning != null) __obj.updateDynamic("addWarning")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[java.lang.String], t1: /* info */ js.UndefOr[typingsJapgolly.protractor.AnonSpecNameString]) => addWarning(t0, t1).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onPageLoad != null) __obj.updateDynamic("onPageLoad")(js.Any.fromFunction1((t0: /* browser */ typingsJapgolly.protractor.browserMod.ProtractorBrowser) => onPageLoad(t0).runNow()))
    if (onPageStable != null) __obj.updateDynamic("onPageStable")(js.Any.fromFunction1((t0: /* browser */ typingsJapgolly.protractor.browserMod.ProtractorBrowser) => onPageStable(t0).runNow()))
    onPrepare.foreach(p => __obj.updateDynamic("onPrepare")(p.toJsFn))
    postResults.foreach(p => __obj.updateDynamic("postResults")(p.toJsFn))
    if (postTest != null) __obj.updateDynamic("postTest")(js.Any.fromFunction2((t0: /* passed */ scala.Boolean, t1: /* testInfo */ js.Any) => postTest(t0, t1).runNow()))
    setup.foreach(p => __obj.updateDynamic("setup")(p.toJsFn))
    if (!js.isUndefined(skipAngularStability)) __obj.updateDynamic("skipAngularStability")(skipAngularStability.asInstanceOf[js.Any])
    teardown.foreach(p => __obj.updateDynamic("teardown")(p.toJsFn))
    if (waitForCondition != null) __obj.updateDynamic("waitForCondition")(js.Any.fromFunction1((t0: /* browser */ typingsJapgolly.protractor.browserMod.ProtractorBrowser) => waitForCondition(t0).runNow()))
    if (waitForPromise != null) __obj.updateDynamic("waitForPromise")(js.Any.fromFunction1((t0: /* browser */ typingsJapgolly.protractor.browserMod.ProtractorBrowser) => waitForPromise(t0).runNow()))
    __obj.asInstanceOf[ProtractorPlugin]
  }
}

