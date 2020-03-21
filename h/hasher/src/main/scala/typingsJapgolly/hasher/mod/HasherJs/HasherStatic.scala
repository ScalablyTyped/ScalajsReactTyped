package typingsJapgolly.hasher.mod.HasherJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.signals.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasherStatic extends js.Object {
  // <static> <constant> {string} hasher.VERSION
  // hasher Version Number
  var VERSION: String
  // {string} hasher.appendHash
  // String that should always be added to the end of Hash value.
  var appendHash: String
  // default value: '';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {signals.Signal} hasher.changed
  // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
  var changed: Signal[_]
  // <static> {signals.Signal} hasher.initialized
  // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
  var initialized: Signal[_]
  // <static> {string} hasher.prependHash
  // String that should always be added to the beginning of Hash value.
  var prependHash: String
  // default value: '/';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {string} hasher.separator
  // String used to split hash paths; used by hasher.getHashAsArray() to split paths.
  var separator: String
  // default value: '/';
  // <static> {signals.Signal} hasher.stopped
  // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
  var stopped: Signal[_]
  // Method Detail
  // <static> hasher.dispose()
  // Removes all event listeners, stops hasher and destroy hasher object. - IMPORTANT: hasher won't work after calling this method, hasher Object will be deleted.
  def dispose(): Unit
  // <static> {string} hasher.getBaseURL()
  // Returns:
  // {string} Retrieve URL without query string and hash.
  def getBaseURL(): String
  // <static> {string} hasher.getHash()
  // Returns:
  // {string} Hash value without '#', `hasher.appendHash` and `hasher.prependHash`.
  def getHash(): String
  // <static> {Array.} hasher.getHashAsArray()
  // Returns:
  // {Array.} Hash value split into an Array.
  def getHashAsArray(): js.Array[String]
  // <static> {string} hasher.getURL()
  // Returns:
  // {string} Full URL.
  def getURL(): String
  // <static> hasher.init()
  // Start listening/dispatching changes in the hash/history.
  def init(): Unit
  // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons before calling this method.
  // <static> {boolean} hasher.isActive()
  // Returns:
  // {boolean} If hasher is listening to changes on the browser history and/or hash value.
  def isActive(): Boolean
  // <static> hasher.replaceHash(path)
  // Set Hash value without keeping previous hash on the history record. Similar to calling window.location.replace("#/hash") but will also work on IE6-7.
  // hasher.replaceHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
  // Parameters:
  // {...string} path
  // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
  def replaceHash(path: String*): Unit
  // <static> hasher.setHash(path)
  // Set Hash value, generating a new history record.
  // hasher.setHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
  // Parameters:
  // {...string} path
  // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
  def setHash(path: String*): Unit
  // <static> hasher.stop()
  // Stop listening/dispatching changes in the hash/history.
  // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons after calling this method, unless you call hasher.init() again.
  // hasher will still dispatch changes made programatically by calling hasher.setHash();
  def stop(): Unit
}

object HasherStatic {
  @scala.inline
  def apply(
    VERSION: String,
    appendHash: String,
    changed: Signal[_],
    dispose: Callback,
    getBaseURL: CallbackTo[String],
    getHash: CallbackTo[String],
    getHashAsArray: CallbackTo[js.Array[String]],
    getURL: CallbackTo[String],
    init: Callback,
    initialized: Signal[_],
    isActive: CallbackTo[Boolean],
    prependHash: String,
    replaceHash: /* repeated */ String => Callback,
    separator: String,
    setHash: /* repeated */ String => Callback,
    stop: Callback,
    stopped: Signal[_]
  ): HasherStatic = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], appendHash = appendHash.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], prependHash = prependHash.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("getBaseURL")(getBaseURL.toJsFn)
    __obj.updateDynamic("getHash")(getHash.toJsFn)
    __obj.updateDynamic("getHashAsArray")(getHashAsArray.toJsFn)
    __obj.updateDynamic("getURL")(getURL.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("isActive")(isActive.toJsFn)
    __obj.updateDynamic("replaceHash")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => replaceHash(t0).runNow()))
    __obj.updateDynamic("setHash")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => setHash(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[HasherStatic]
  }
}

