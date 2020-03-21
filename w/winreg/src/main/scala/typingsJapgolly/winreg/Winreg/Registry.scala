package typingsJapgolly.winreg.Winreg

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  /**
    * The registry hive architecture ('x86' or 'x64').
    * @readonly
    */
  var arch: String
  /**
    * The hive id.
    * @readonly
    */
  var hive: String
  /**
    * The hostname.
    * @readonly
    */
  var host: String
  /**
    * The registry key name.
    * @readonly
    */
  var key: String
  /**
    * Creates a new {@link Registry} instance that points to the parent registry key.
    * @readonly
    */
  var parent: Registry
  /**
    * The full path to the registry key.
    * @readonly
    */
  var path: String
  /**
    * Remove all subkeys and values (including the default value) from this registry key.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def clear(cb: js.Function1[/* err */ js.Error, Unit]): Registry
  /**
    * Create this registry key. Note that this is a no-op if the key already exists.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def create(cb: js.Function1[/* err */ js.Error, Unit]): Registry
  /**
    * Delete this key and all subkeys from the registry.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def destroy(cb: js.Function1[/* err */ js.Error, Unit]): Registry
  /**
    * Alias for the clear method to keep it backward compatible.
    * @method
    * @deprecated Use {@link Registry#clear} or {@link Registry#destroy} in favour of this method.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def erase(cb: js.Function1[/* err */ js.Error, Unit]): Registry
  /**
    * Gets a named value from this registry key.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err, item)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {RegistryItem=} cb.item - the retrieved registry item
    * @returns {Registry} this registry key object
    */
  def get(name: String, cb: js.Function2[/* err */ js.Error, /* result */ RegistryItem, Unit]): Registry
  /**
    * Checks if this key already exists.
    * @param {function (err, exists)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {boolean=} cb.exists - true if a registry key with this name already exists
    * @returns {Registry} this registry key object
    */
  def keyExists(cb: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Registry
  /**
    * Retrieve all subkeys from this registry key.
    * @param {function (err, items)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {array=} cb.items - an array of {@link Registry} objects
    * @returns {Registry} this registry key object
    */
  def keys(cb: js.Function2[/* err */ js.Error, /* result */ js.Array[this.type], Unit]): Registry
  /**
    * Remove a named value from this registry key. If name is empty, sets the default value of this key.
    * Note: This key must be already existing.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def remove(name: String, cb: js.Function1[/* err */ js.Error, Unit]): Registry
  /**
    * Sets a named value in this registry key, overwriting an already existing value.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {string} type - the value type
    * @param {string} value - the value
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def set(name: String, `type`: String, value: String, cb: js.Function1[/* err */ js.Error, Unit]): Registry
  /**
    * Checks if a value with the given name already exists within this key.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err, exists)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {boolean=} cb.exists - true if a value with the given name was found in this key
    * @returns {Registry} this registry key object
    */
  def valueExists(name: String, cb: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Registry
  /**
    * Retrieve all values from this registry key.
    * @param {valuesCallback} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {array=} cb.items - an array of {@link RegistryItem} objects
    * @returns {Registry} this registry key object
    */
  def values(cb: js.Function2[/* err */ js.Error, /* result */ js.Array[RegistryItem], Unit]): Registry
}

object Registry {
  @scala.inline
  def apply(
    arch: String,
    clear: js.Function1[/* err */ js.Error, Unit] => CallbackTo[Registry],
    create: js.Function1[/* err */ js.Error, Unit] => CallbackTo[Registry],
    destroy: js.Function1[/* err */ js.Error, Unit] => CallbackTo[Registry],
    erase: js.Function1[/* err */ js.Error, Unit] => CallbackTo[Registry],
    get: (String, js.Function2[/* err */ js.Error, /* result */ RegistryItem, Unit]) => CallbackTo[Registry],
    hive: String,
    host: String,
    key: String,
    keyExists: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit] => CallbackTo[Registry],
    keys: js.Function2[/* err */ js.Error, /* result */ js.Array[Registry], Unit] => CallbackTo[Registry],
    parent: Registry,
    path: String,
    remove: (String, js.Function1[/* err */ js.Error, Unit]) => CallbackTo[Registry],
    set: (String, String, String, js.Function1[/* err */ js.Error, Unit]) => CallbackTo[Registry],
    valueExists: (String, js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]) => CallbackTo[Registry],
    values: js.Function2[/* err */ js.Error, /* result */ js.Array[RegistryItem], Unit] => CallbackTo[Registry]
  ): Registry = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], hive = hive.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error, scala.Unit]) => clear(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error, scala.Unit]) => create(t0).runNow()))
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error, scala.Unit]) => destroy(t0).runNow()))
    __obj.updateDynamic("erase")(js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error, scala.Unit]) => erase(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ js.Error, 
  /* result */ typingsJapgolly.winreg.Winreg.RegistryItem, 
  scala.Unit]) => get(t0, t1).runNow()))
    __obj.updateDynamic("keyExists")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* exists */ scala.Boolean, scala.Unit]) => keyExists(t0).runNow()))
    __obj.updateDynamic("keys")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ js.Error, 
  /* result */ js.Array[typingsJapgolly.winreg.Winreg.Registry], 
  scala.Unit]) => keys(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ js.Error, scala.Unit]) => remove(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: js.Function1[/* err */ js.Error, scala.Unit]) => set(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("valueExists")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Error, /* exists */ scala.Boolean, scala.Unit]) => valueExists(t0, t1).runNow()))
    __obj.updateDynamic("values")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ js.Error, 
  /* result */ js.Array[typingsJapgolly.winreg.Winreg.RegistryItem], 
  scala.Unit]) => values(t0).runNow()))
    __obj.asInstanceOf[Registry]
  }
}

