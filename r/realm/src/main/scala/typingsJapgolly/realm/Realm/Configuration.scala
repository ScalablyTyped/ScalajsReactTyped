package typingsJapgolly.realm.Realm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.realm.PartialSyncConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * realm configuration
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
  */
trait Configuration extends js.Object {
  var deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.undefined
  var disableFormatUpgrade: js.UndefOr[Boolean] = js.undefined
  var encryptionKey: js.UndefOr[
    scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | scala.scalajs.js.typedarray.Int8Array
  ] = js.undefined
  var fifoFilesFallbackPath: js.UndefOr[String] = js.undefined
  var inMemory: js.UndefOr[Boolean] = js.undefined
  var migration: js.UndefOr[MigrationCallback] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.undefined
  var schemaVersion: js.UndefOr[Double] = js.undefined
  var shouldCompactOnLaunch: js.UndefOr[js.Function2[/* totalBytes */ Double, /* usedBytes */ Double, Boolean]] = js.undefined
  var sync: js.UndefOr[PartialSyncConfiguration] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.undefined,
    disableFormatUpgrade: js.UndefOr[Boolean] = js.undefined,
    encryptionKey: scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | scala.scalajs.js.typedarray.Int8Array = null,
    fifoFilesFallbackPath: String = null,
    inMemory: js.UndefOr[Boolean] = js.undefined,
    migration: (/* oldRealm */ typingsJapgolly.realm.Realm, /* newRealm */ typingsJapgolly.realm.Realm) => Callback = null,
    path: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    schema: js.Array[ObjectClass | ObjectSchema] = null,
    schemaVersion: Int | Double = null,
    shouldCompactOnLaunch: (/* totalBytes */ Double, /* usedBytes */ Double) => CallbackTo[Boolean] = null,
    sync: PartialSyncConfiguration = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteRealmIfMigrationNeeded)) __obj.updateDynamic("deleteRealmIfMigrationNeeded")(deleteRealmIfMigrationNeeded.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFormatUpgrade)) __obj.updateDynamic("disableFormatUpgrade")(disableFormatUpgrade.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fifoFilesFallbackPath != null) __obj.updateDynamic("fifoFilesFallbackPath")(fifoFilesFallbackPath.asInstanceOf[js.Any])
    if (!js.isUndefined(inMemory)) __obj.updateDynamic("inMemory")(inMemory.asInstanceOf[js.Any])
    if (migration != null) __obj.updateDynamic("migration")(js.Any.fromFunction2((t0: /* oldRealm */ typingsJapgolly.realm.Realm, t1: /* newRealm */ typingsJapgolly.realm.Realm) => migration(t0, t1).runNow()))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaVersion != null) __obj.updateDynamic("schemaVersion")(schemaVersion.asInstanceOf[js.Any])
    if (shouldCompactOnLaunch != null) __obj.updateDynamic("shouldCompactOnLaunch")(js.Any.fromFunction2((t0: /* totalBytes */ scala.Double, t1: /* usedBytes */ scala.Double) => shouldCompactOnLaunch(t0, t1).runNow()))
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

