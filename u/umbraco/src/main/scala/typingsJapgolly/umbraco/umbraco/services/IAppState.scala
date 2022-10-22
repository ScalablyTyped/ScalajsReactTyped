package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.appState
  * @function
  *
  * @description
  * Tracks the various application state variables when working in the back office, raises events when state changes.
  */
trait IAppState extends StObject {
  
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
  def setState(stateObj: IStateObject, key: String, value: Any, stateObjName: String): Unit
  
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
  
  inline def apply(
    getGlobalState: String => IGlobalState,
    getMenuState: String => IStateObject,
    getSectionState: String => ISectionState,
    getState: (IStateObject, String, String) => IStateObject,
    getTreeState: String => ITreeState,
    setGlobalState: (String, Boolean) => Callback,
    setMenuState: (String, IMenuState) => Callback,
    setSectionState: (String, ISectionState) => Callback,
    setState: (IStateObject, String, Any, String) => Callback,
    setTreeState: (String, ITreeState) => Callback
  ): IAppState = {
    val __obj = js.Dynamic.literal(getGlobalState = js.Any.fromFunction1(getGlobalState), getMenuState = js.Any.fromFunction1(getMenuState), getSectionState = js.Any.fromFunction1(getSectionState), getState = js.Any.fromFunction3(getState), getTreeState = js.Any.fromFunction1(getTreeState), setGlobalState = js.Any.fromFunction2((t0: String, t1: Boolean) => (setGlobalState(t0, t1)).runNow()), setMenuState = js.Any.fromFunction2((t0: String, t1: IMenuState) => (setMenuState(t0, t1)).runNow()), setSectionState = js.Any.fromFunction2((t0: String, t1: ISectionState) => (setSectionState(t0, t1)).runNow()), setState = js.Any.fromFunction4((t0: IStateObject, t1: String, t2: Any, t3: String) => (setState(t0, t1, t2, t3)).runNow()), setTreeState = js.Any.fromFunction2((t0: String, t1: ITreeState) => (setTreeState(t0, t1)).runNow()))
    __obj.asInstanceOf[IAppState]
  }
  
  extension [Self <: IAppState](x: Self) {
    
    inline def setGetGlobalState(value: String => IGlobalState): Self = StObject.set(x, "getGlobalState", js.Any.fromFunction1(value))
    
    inline def setGetMenuState(value: String => IStateObject): Self = StObject.set(x, "getMenuState", js.Any.fromFunction1(value))
    
    inline def setGetSectionState(value: String => ISectionState): Self = StObject.set(x, "getSectionState", js.Any.fromFunction1(value))
    
    inline def setGetState(value: (IStateObject, String, String) => IStateObject): Self = StObject.set(x, "getState", js.Any.fromFunction3(value))
    
    inline def setGetTreeState(value: String => ITreeState): Self = StObject.set(x, "getTreeState", js.Any.fromFunction1(value))
    
    inline def setSetGlobalState(value: (String, Boolean) => Callback): Self = StObject.set(x, "setGlobalState", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetMenuState(value: (String, IMenuState) => Callback): Self = StObject.set(x, "setMenuState", js.Any.fromFunction2((t0: String, t1: IMenuState) => (value(t0, t1)).runNow()))
    
    inline def setSetSectionState(value: (String, ISectionState) => Callback): Self = StObject.set(x, "setSectionState", js.Any.fromFunction2((t0: String, t1: ISectionState) => (value(t0, t1)).runNow()))
    
    inline def setSetState(value: (IStateObject, String, Any, String) => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction4((t0: IStateObject, t1: String, t2: Any, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetTreeState(value: (String, ITreeState) => Callback): Self = StObject.set(x, "setTreeState", js.Any.fromFunction2((t0: String, t1: ITreeState) => (value(t0, t1)).runNow()))
  }
}
