package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxPersist.reduxPersistBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @desc
  * `HSS` means HydratedSubState
  * `ESS` means EndSubState
  * `S` means State
  * `RS` means RawState
  */
trait PersistConfig[S, RS, HSS, ESS] extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * @desc Used for migrations.
    */
  var getStoredState: js.UndefOr[
    js.Function1[/* config */ PersistConfig[S, RS, HSS, ESS], js.Promise[PersistedState]]
  ] = js.undefined
  var key: String
  /**
    * @deprecated keyPrefix is going to be removed in v6.
    */
  var keyPrefix: js.UndefOr[String] = js.undefined
  var migrate: js.UndefOr[PersistMigrate] = js.undefined
  var serialize: js.UndefOr[Boolean] = js.undefined
  var stateReconciler: js.UndefOr[`false` | StateReconciler[S]] = js.undefined
  var storage: Storage
  var throttle: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transforms: js.UndefOr[js.Array[Transform[HSS, ESS, S, RS]]] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  var writeFailHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
}

object PersistConfig {
  @scala.inline
  def apply[S, RS, HSS, ESS](
    key: String,
    storage: Storage,
    blacklist: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    getStoredState: /* config */ PersistConfig[S, RS, HSS, ESS] => CallbackTo[js.Promise[PersistedState]] = null,
    keyPrefix: String = null,
    migrate: (/* state */ PersistedState, /* currentVersion */ Double) => CallbackTo[js.Promise[PersistedState]] = null,
    serialize: js.UndefOr[Boolean] = js.undefined,
    stateReconciler: `false` | StateReconciler[S] = null,
    throttle: Int | Double = null,
    timeout: Int | Double = null,
    transforms: js.Array[Transform[HSS, ESS, S, RS]] = null,
    version: Int | Double = null,
    whitelist: js.Array[String] = null,
    writeFailHandler: /* err */ js.Error => Callback = null
  ): PersistConfig[S, RS, HSS, ESS] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (getStoredState != null) __obj.updateDynamic("getStoredState")(js.Any.fromFunction1((t0: /* config */ typingsJapgolly.reduxPersist.typesMod.PersistConfig[S, RS, HSS, ESS]) => getStoredState(t0).runNow()))
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (migrate != null) __obj.updateDynamic("migrate")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.reduxPersist.typesMod.PersistedState, t1: /* currentVersion */ scala.Double) => migrate(t0, t1).runNow()))
    if (!js.isUndefined(serialize)) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (stateReconciler != null) __obj.updateDynamic("stateReconciler")(stateReconciler.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    if (writeFailHandler != null) __obj.updateDynamic("writeFailHandler")(js.Any.fromFunction1((t0: /* err */ js.Error) => writeFailHandler(t0).runNow()))
    __obj.asInstanceOf[PersistConfig[S, RS, HSS, ESS]]
  }
}

