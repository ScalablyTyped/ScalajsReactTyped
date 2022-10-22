package typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod

import typingsJapgolly.reactNavigation.mod.NavigationAction
import typingsJapgolly.reactNavigation.mod.NavigationEventCallback
import typingsJapgolly.reactNavigation.mod.NavigationEventSubscription
import typingsJapgolly.reactNavigation.mod.NavigationNavigateAction
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationStack.anon.Immediate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNavigationProp[State, Params]
  extends StObject
     with NavigationScreenProp[State, Params] {
  
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  
  def pop(): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Immediate): Boolean = js.native
  def pop(n: Unit, params: Immediate): Boolean = js.native
  
  def popToTop(): Boolean = js.native
  def popToTop(params: Immediate): Boolean = js.native
  
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: Unit, action: NavigationNavigateAction): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: Unit, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
}
