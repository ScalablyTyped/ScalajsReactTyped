package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.RouterOutletOptions
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.SwipeGestureHandler
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteID
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteWrite
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRouterOutlet extends StObject {
  
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: Boolean = js.native
  
  /**
    * This property allows to create custom transition using AnimationBuilder functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  
  def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: Unit, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: ios | md = js.native
  
  def setRouteId(id: String, params: Unit, direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: Unit, direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  
  var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
}
