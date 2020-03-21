package typingsJapgolly.lokijs

import japgolly.scalajs.react.Callback
import typingsJapgolly.lokijs.lokijsStrings.BROWSER
import typingsJapgolly.lokijs.lokijsStrings.CORDOVA
import typingsJapgolly.lokijs.lokijsStrings.NA
import typingsJapgolly.lokijs.lokijsStrings.NATIVESCRIPT
import typingsJapgolly.lokijs.lokijsStrings.NODEJS
import typingsJapgolly.lokijs.lokijsStrings.destructured
import typingsJapgolly.lokijs.lokijsStrings.fs
import typingsJapgolly.lokijs.lokijsStrings.localStorage
import typingsJapgolly.lokijs.lokijsStrings.memory
import typingsJapgolly.lokijs.lokijsStrings.normal
import typingsJapgolly.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.LokiConstructorOptions> & std.Partial<lokijs.LokiConfigOptions> & std.Partial<lokijs.ThrottledSaveDrainOptions> */
trait PartialLokiConstructorOptAdapter extends js.Object {
  var adapter: js.UndefOr[LokiPersistenceAdapter] = js.undefined
  var autoload: js.UndefOr[Boolean] = js.undefined
  var autoloadCallback: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var autosave: js.UndefOr[Boolean] = js.undefined
  var autosaveCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.undefined
  var autosaveInterval: js.UndefOr[String | Double] = js.undefined
  var destructureDelimiter: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA] = js.undefined
  var persistenceMethod: js.UndefOr[fs | localStorage | memory] = js.undefined
  var recursiveWait: js.UndefOr[Boolean] = js.undefined
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.undefined
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.undefined
  var serializationMethod: js.UndefOr[normal | pretty | destructured] = js.undefined
  var started: js.UndefOr[Double] = js.undefined
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialLokiConstructorOptAdapter {
  @scala.inline
  def apply(
    adapter: LokiPersistenceAdapter = null,
    autoload: js.UndefOr[Boolean] = js.undefined,
    autoloadCallback: /* err */ js.Any => Callback = null,
    autosave: js.UndefOr[Boolean] = js.undefined,
    autosaveCallback: /* err */ js.UndefOr[js.Any] => Callback = null,
    autosaveInterval: String | Double = null,
    destructureDelimiter: String = null,
    env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA = null,
    persistenceMethod: fs | localStorage | memory = null,
    recursiveWait: js.UndefOr[Boolean] = js.undefined,
    recursiveWaitLimit: js.UndefOr[Boolean] = js.undefined,
    recursiveWaitLimitDuration: Int | Double = null,
    serializationMethod: normal | pretty | destructured = null,
    started: Int | Double = null,
    throttledSaves: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialLokiConstructorOptAdapter = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload.asInstanceOf[js.Any])
    if (autoloadCallback != null) __obj.updateDynamic("autoloadCallback")(js.Any.fromFunction1((t0: /* err */ js.Any) => autoloadCallback(t0).runNow()))
    if (!js.isUndefined(autosave)) __obj.updateDynamic("autosave")(autosave.asInstanceOf[js.Any])
    if (autosaveCallback != null) __obj.updateDynamic("autosaveCallback")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Any]) => autosaveCallback(t0).runNow()))
    if (autosaveInterval != null) __obj.updateDynamic("autosaveInterval")(autosaveInterval.asInstanceOf[js.Any])
    if (destructureDelimiter != null) __obj.updateDynamic("destructureDelimiter")(destructureDelimiter.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (persistenceMethod != null) __obj.updateDynamic("persistenceMethod")(persistenceMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(recursiveWait)) __obj.updateDynamic("recursiveWait")(recursiveWait.asInstanceOf[js.Any])
    if (!js.isUndefined(recursiveWaitLimit)) __obj.updateDynamic("recursiveWaitLimit")(recursiveWaitLimit.asInstanceOf[js.Any])
    if (recursiveWaitLimitDuration != null) __obj.updateDynamic("recursiveWaitLimitDuration")(recursiveWaitLimitDuration.asInstanceOf[js.Any])
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLokiConstructorOptAdapter]
  }
}

