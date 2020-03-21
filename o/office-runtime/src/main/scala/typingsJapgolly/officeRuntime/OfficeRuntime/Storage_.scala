package typingsJapgolly.officeRuntime.OfficeRuntime

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Asynchronous, global, and persistent key-value storage.
  *
  * [Api set: SharedRuntime 1.1]
  *
  * @remarks
  * Storage limit is 10 MB per domain, which may be shared by multiple add-ins.
  */
trait Storage_ extends js.Object {
  /**
    * Retrieves an item from storage based on its key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be retrieved. Must be a string.
    */
  def getItem(key: String): js.Promise[String | Null]
  /**
    * Retrieves multiple items from storage based on their key.
    * Returns a Promise. In the event the Promise does not resolve, returns null.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def getItems(keys: js.Array[String]): js.Promise[StringDictionary[String | Null]]
  /**
    * Retrieves an array of all keys from storage.
    *  Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  def getKeys(): js.Promise[js.Array[String]]
  /**
    * Removes an item from storage based on its key.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be removed. Must be a string.
    */
  def removeItem(key: String): js.Promise[Unit]
  /**
    * Removes multiple items from storage.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keys Keys of items to be removed. Must be an array of strings.
    */
  def removeItems(keys: js.Array[String]): js.Promise[Unit]
  /**
    * Sets a key-value pair into storage or updates an existing key-value pair.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param key Key of item to be set. Must be a string.
    * @param value Must be a string.
    */
  def setItem(key: String, value: String): js.Promise[Unit]
  /**
    * Sets multiple items into storage or updates multiple items within storage.
    * Returns a Promise.
    *
    * [Api set: SharedRuntime 1.1]
    *
    * @param keyValues Key-value pairs to be set. Must be strings.
    */
  def setItems(keyValues: StringDictionary[String]): js.Promise[Unit]
}

object Storage_ {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[js.Promise[String | Null]],
    getItems: js.Array[String] => CallbackTo[js.Promise[StringDictionary[String | Null]]],
    getKeys: CallbackTo[js.Promise[js.Array[String]]],
    removeItem: String => CallbackTo[js.Promise[Unit]],
    removeItems: js.Array[String] => CallbackTo[js.Promise[Unit]],
    setItem: (String, String) => CallbackTo[js.Promise[Unit]],
    setItems: StringDictionary[String] => CallbackTo[js.Promise[Unit]]
  ): Storage_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("getItems")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => getItems(t0).runNow()))
    __obj.updateDynamic("getKeys")(getKeys.toJsFn)
    __obj.updateDynamic("removeItem")(js.Any.fromFunction1((t0: java.lang.String) => removeItem(t0).runNow()))
    __obj.updateDynamic("removeItems")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => removeItems(t0).runNow()))
    __obj.updateDynamic("setItem")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setItem(t0, t1).runNow()))
    __obj.updateDynamic("setItems")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[java.lang.String]) => setItems(t0).runNow()))
    __obj.asInstanceOf[Storage_]
  }
}

