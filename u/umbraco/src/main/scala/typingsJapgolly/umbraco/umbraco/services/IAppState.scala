package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.appState
  * @function
  *
  * @description
  * Tracks the various application state variables when working in the back office, raises events when state changes.
  */
trait IAppState extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getGlobalState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current global state value by key - we do not return an object reference here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getGlobalState(key: String): IGlobalState
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getMenuState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current menu state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getMenuState(key: String): IStateObject
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getSectionState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current section state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getSectionState(key: String): ISectionState
  /** function to validate and set the state on a state object */
  def getState(stateObj: IStateObject, key: String, stateObjName: String): IStateObject
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#getTreeState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Returns the current tree state value by key - we do not return an object here - we do NOT want this
    * to be publicly mutable and allow setting arbitrary values
    */
  def getTreeState(key: String): ITreeState
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setGlobalState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a global state value by key
    */
  def setGlobalState(key: String, value: Boolean): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setMenuState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setMenuState(key: String, value: IMenuState): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setSectionState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setSectionState(key: String, value: ISectionState): Unit
  /** function to validate and set the state on a state object */
  def setState(stateObj: IStateObject, key: String, value: js.Any, stateObjName: String): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#setTreeState
    * @methodOf umbraco.services.appState
    * @function
    *
    * @description
    * Sets a section state value by key
    */
  def setTreeState(key: String, value: ITreeState): Unit
}

object IAppState {
  @scala.inline
  def apply(
    getGlobalState: String => CallbackTo[IGlobalState],
    getMenuState: String => CallbackTo[IStateObject],
    getSectionState: String => CallbackTo[ISectionState],
    getState: (IStateObject, String, String) => CallbackTo[IStateObject],
    getTreeState: String => CallbackTo[ITreeState],
    setGlobalState: (String, Boolean) => Callback,
    setMenuState: (String, IMenuState) => Callback,
    setSectionState: (String, ISectionState) => Callback,
    setState: (IStateObject, String, js.Any, String) => Callback,
    setTreeState: (String, ITreeState) => Callback
  ): IAppState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGlobalState")(js.Any.fromFunction1((t0: java.lang.String) => getGlobalState(t0).runNow()))
    __obj.updateDynamic("getMenuState")(js.Any.fromFunction1((t0: java.lang.String) => getMenuState(t0).runNow()))
    __obj.updateDynamic("getSectionState")(js.Any.fromFunction1((t0: java.lang.String) => getSectionState(t0).runNow()))
    __obj.updateDynamic("getState")(js.Any.fromFunction3((t0: typingsJapgolly.umbraco.umbraco.services.IStateObject, t1: java.lang.String, t2: java.lang.String) => getState(t0, t1, t2).runNow()))
    __obj.updateDynamic("getTreeState")(js.Any.fromFunction1((t0: java.lang.String) => getTreeState(t0).runNow()))
    __obj.updateDynamic("setGlobalState")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => setGlobalState(t0, t1).runNow()))
    __obj.updateDynamic("setMenuState")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.umbraco.umbraco.services.IMenuState) => setMenuState(t0, t1).runNow()))
    __obj.updateDynamic("setSectionState")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.umbraco.umbraco.services.ISectionState) => setSectionState(t0, t1).runNow()))
    __obj.updateDynamic("setState")(js.Any.fromFunction4((t0: typingsJapgolly.umbraco.umbraco.services.IStateObject, t1: java.lang.String, t2: js.Any, t3: java.lang.String) => setState(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setTreeState")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.umbraco.umbraco.services.ITreeState) => setTreeState(t0, t1).runNow()))
    __obj.asInstanceOf[IAppState]
  }
}

