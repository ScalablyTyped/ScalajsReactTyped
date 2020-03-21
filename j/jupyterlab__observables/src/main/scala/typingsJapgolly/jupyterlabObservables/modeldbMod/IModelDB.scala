package typingsJapgolly.jupyterlabObservables.modeldbMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString
import typingsJapgolly.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelDB extends IDisposable {
  /**
    * The base path for the `IModelDB`. This is prepended
    * to all the paths that are passed in to the member
    * functions of the object.
    */
  val basePath: String
  /**
    * A map of the currently active collaborators
    * for the database, including the local user.
    */
  val collaborators: js.UndefOr[ICollaboratorMap] = js.undefined
  /**
    * A promise that resolves when the database
    * has connected to its backend, if any.
    */
  val connected: js.Promise[Unit]
  /**
    * Whether the database is collaborative.
    */
  val isCollaborative: Boolean
  /**
    * Whether the database has been populated
    * with model values prior to connection.
    */
  val isPrepopulated: Boolean
  /**
    * Create an undoable list and insert it in the database.
    *
    * @param path: the path for the list.
    *
    * @returns the list that was created.
    *
    * #### Notes
    * The list can only store objects that are simple
    * JSON Objects and primitives.
    */
  def createList[T /* <: JSONValue */](path: String): IObservableUndoableList[T]
  /**
    * Create a map and insert it in the database.
    *
    * @param path: the path for the map.
    *
    * @returns the map that was created.
    *
    * #### Notes
    * The map can only store objects that are simple
    * JSON Objects and primitives.
    */
  def createMap(path: String): IObservableJSON
  /**
    * Create a string and insert it in the database.
    *
    * @param path: the path for the string.
    *
    * @returns the string that was created.
    */
  def createString(path: String): IObservableString
  /**
    * Create an opaque value and insert it in the database.
    *
    * @param path: the path for the value.
    *
    * @returns the value that was created.
    */
  def createValue(path: String): IObservableValue
  /**
    * Get a value for a path.
    *
    * @param path: the path for the object.
    *
    * @returns an `IObservable`.
    */
  def get(path: String): js.UndefOr[IObservable]
  /**
    * Get a value at a path, or `undefined if it has not been set
    * That value must already have been created using `createValue`.
    *
    * @param path: the path for the value.
    */
  def getValue(path: String): js.UndefOr[JSONValue]
  /**
    * Whether the `IModelDB` has an object at this path.
    *
    * @param path: the path for the object.
    *
    * @returns a boolean for whether an object is at `path`.
    */
  def has(path: String): Boolean
  /**
    * Set a value at a path. That value must already have
    * been created using `createValue`.
    *
    * @param path: the path for the value.
    *
    * @param value: the new value.
    */
  def setValue(path: String, value: JSONValue): Unit
  /**
    * Create a view onto a subtree of the model database.
    *
    * @param basePath: the path for the root of the subtree.
    *
    * @returns an `IModelDB` with a view onto the original
    *   `IModelDB`, with `basePath` prepended to all paths.
    */
  def view(basePath: String): IModelDB
}

object IModelDB {
  @scala.inline
  def apply(
    basePath: String,
    connected: js.Promise[Unit],
    createList: String => CallbackTo[IObservableUndoableList[js.Any]],
    createMap: String => CallbackTo[IObservableJSON],
    createString: String => CallbackTo[IObservableString],
    createValue: String => CallbackTo[IObservableValue],
    dispose: Callback,
    get: String => CallbackTo[js.UndefOr[IObservable]],
    getValue: String => CallbackTo[js.UndefOr[JSONValue]],
    has: String => CallbackTo[Boolean],
    isCollaborative: Boolean,
    isDisposed: Boolean,
    isPrepopulated: Boolean,
    setValue: (String, JSONValue) => Callback,
    view: String => CallbackTo[IModelDB],
    collaborators: ICollaboratorMap = null
  ): IModelDB = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], isCollaborative = isCollaborative.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isPrepopulated = isPrepopulated.asInstanceOf[js.Any])
    __obj.updateDynamic("createList")(js.Any.fromFunction1((t0: java.lang.String) => createList(t0).runNow()))
    __obj.updateDynamic("createMap")(js.Any.fromFunction1((t0: java.lang.String) => createMap(t0).runNow()))
    __obj.updateDynamic("createString")(js.Any.fromFunction1((t0: java.lang.String) => createString(t0).runNow()))
    __obj.updateDynamic("createValue")(js.Any.fromFunction1((t0: java.lang.String) => createValue(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: java.lang.String) => getValue(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue) => setValue(t0, t1).runNow()))
    __obj.updateDynamic("view")(js.Any.fromFunction1((t0: java.lang.String) => view(t0).runNow()))
    if (collaborators != null) __obj.updateDynamic("collaborators")(collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDB]
  }
}

