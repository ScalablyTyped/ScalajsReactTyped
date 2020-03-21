package typingsJapgolly.ionicCore.componentsMod.Components

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.interfaceMod.RouteID
import typingsJapgolly.ionicCore.interfaceMod.RouteWrite
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import typingsJapgolly.ionicCore.navInterfaceMod.RouterOutletOptions
import typingsJapgolly.ionicCore.navInterfaceMod.SwipeGestureHandler
import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: Boolean = js.native
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: ios | md = js.native
  var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
  def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: js.UndefOr[scala.Nothing], opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: typingsJapgolly.std.HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: typingsJapgolly.std.HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  def setRouteId(id: String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
}

