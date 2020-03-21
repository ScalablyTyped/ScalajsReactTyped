package typingsJapgolly.keyv.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.keyv.keyvStrings.mongo
import typingsJapgolly.keyv.keyvStrings.mongodb
import typingsJapgolly.keyv.keyvStrings.mysql
import typingsJapgolly.keyv.keyvStrings.postgres
import typingsJapgolly.keyv.keyvStrings.postgresql
import typingsJapgolly.keyv.keyvStrings.redis
import typingsJapgolly.keyv.keyvStrings.sqlite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TValue]
  extends /* key */ StringDictionary[js.Any] {
  /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
  var adapter: js.UndefOr[redis | mongodb | mongo | sqlite | postgresql | postgres | mysql] = js.undefined
  /** A custom deserialization function. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, TValue]] = js.undefined
  /** Namespace for the current instance. */
  var namespace: js.UndefOr[String] = js.undefined
  /** A custom serialization function. */
  var serialize: js.UndefOr[js.Function1[/* data */ TValue, String]] = js.undefined
  /** The storage adapter instance to be used by Keyv. */
  var store: js.UndefOr[Store[TValue]] = js.undefined
  /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
  var ttl: js.UndefOr[Double] = js.undefined
  /** The connection string URI. */
  var uri: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply[TValue](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    adapter: redis | mongodb | mongo | sqlite | postgresql | postgres | mysql = null,
    deserialize: /* data */ String => CallbackTo[TValue] = null,
    namespace: String = null,
    serialize: /* data */ TValue => CallbackTo[String] = null,
    store: Store[TValue] = null,
    ttl: Int | Double = null,
    uri: String = null
  ): Options[TValue] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => deserialize(t0).runNow()))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: /* data */ TValue) => serialize(t0).runNow()))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TValue]]
  }
}

