package typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod

import typingsJapgolly.reactDashNavigation.Anon_ActionKey
import typingsJapgolly.reactDashNavigation.Anon_ParamsP
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationDispatch
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationEventCallback
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationEventSubscription
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationState
import typingsJapgolly.reactDashNavigationDashStack.Anon_Immediate
import typingsJapgolly.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.refocus
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {push (routeName : string, params ? : react-navigation.react-navigation.NavigationParams, action ? : react-navigation.react-navigation.NavigationNavigateAction): boolean, replace (routeName : string, params ? : react-navigation.react-navigation.NavigationParams, action ? : react-navigation.react-navigation.NavigationNavigateAction): boolean, reset (actions : std.Array<react-navigation.react-navigation.NavigationAction>, index : number): boolean, pop (n ? : number, params ? : {  immediate ? :boolean}): boolean, popToTop (params ? : {  immediate ? :boolean}): boolean, addListener (event : react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackEventName, callback : react-navigation.react-navigation.NavigationEventCallback): react-navigation.react-navigation.NavigationEventSubscription} */
@js.native
trait NavigationStackProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with Anon_ParamsP[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def closeDrawer(): js.Any = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  def getParam[T /* <: String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: String */](
    param: T,
    fallback: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
  ] = js.native
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  def isFirstRouteInParent(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def navigate(options: Anon_ActionKey): Boolean = js.native
  def navigate(routeNameOrOptions: String): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams, action: NavigationAction): Boolean = js.native
  def openDrawer(): js.Any = js.native
  def pop(): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Anon_Immediate): Boolean = js.native
  def popToTop(): Boolean = js.native
  def popToTop(params: Anon_Immediate): Boolean = js.native
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
  def toggleDrawer(): js.Any = js.native
}

