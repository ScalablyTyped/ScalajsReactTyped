package typingsJapgolly.reactNavigation.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationRouter[State, Options] extends StObject {
  
  def getActionCreators(route: NavigationRoute[NavigationParams], key: String): StringDictionary[js.Function0[NavigationAction]] = js.native
  
  /**
    * Maps a URI-like string to an action. This can be mapped to a state
    * using `getStateForAction`.
    */
  def getActionForPathAndParams(path: String): NavigationAction | Null = js.native
  def getActionForPathAndParams(path: String, params: NavigationParams): NavigationAction | Null = js.native
  
  def getComponentForRouteName(routeName: String): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  
  def getComponentForState(state: State): NavigationComponent[
    js.Object, 
    NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  ] = js.native
  
  def getPathAndParamsForState(state: State): Path = js.native
  
  /**
    * Gets the screen navigation options for a given screen.
    *
    * For example, we could get the config for the 'Foo' screen when the
    * `navigation.state` is:
    *
    *  {routeName: 'Foo', key: '123'}
    */
  var getScreenOptions: NavigationScreenOptionsGetter[Options] = js.native
  
  /**
    * The reducer that outputs the new navigation state for a given action, with
    * an optional previous state. When the action is considered handled but the
    * state is unchanged, the output state is null.
    */
  def getStateForAction(action: NavigationAction): State | Null = js.native
  def getStateForAction(action: NavigationAction, lastState: State): State | Null = js.native
}
