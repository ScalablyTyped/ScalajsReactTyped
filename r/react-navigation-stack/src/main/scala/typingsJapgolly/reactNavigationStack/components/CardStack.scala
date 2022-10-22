package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.reactNavigation.mod.NavigationState
import typingsJapgolly.reactNavigationStack.anon.Route
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackDescriptorMap
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsStackCardStackMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardStack {
  
  inline def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    getGesturesEnabled: Route => Boolean,
    getPreviousRoute: Route => js.UndefOr[
      typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
    ],
    headerMode: StackHeaderMode,
    insets: EdgeInsets,
    isParentHeaderShown: Boolean,
    mode: StackCardMode,
    onCloseRoute: Route => Callback,
    onOpenRoute: Route => Callback,
    onTransitionEnd: (Route, Boolean) => Callback,
    onTransitionStart: (Route, Boolean) => Callback,
    openingRouteKeys: js.Array[String],
    renderHeader: Props => Node,
    renderScene: Route => Node,
    routes: js.Array[
      typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
    ],
    state: NavigationState
  ): Builder = {
    val __props = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1((t0: Route) => onCloseRoute(t0).runNow()), onOpenRoute = js.Any.fromFunction1((t0: Route) => onOpenRoute(t0).runNow()), onTransitionEnd = js.Any.fromFunction2((t0: Route, t1: Boolean) => (onTransitionEnd(t0, t1)).runNow()), onTransitionStart = js.Any.fromFunction2((t0: Route, t1: Boolean) => (onTransitionStart(t0, t1)).runNow()), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsStackCardStackMod.Props]))
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def detachInactiveScreens(value: Boolean): this.type = set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    inline def onGestureCancel(value: /* props */ Route => Callback): this.type = set("onGestureCancel", js.Any.fromFunction1((t0: /* props */ Route) => value(t0).runNow()))
    
    inline def onGestureEnd(value: /* props */ Route => Callback): this.type = set("onGestureEnd", js.Any.fromFunction1((t0: /* props */ Route) => value(t0).runNow()))
    
    inline def onGestureStart(value: /* props */ Route => Callback): this.type = set("onGestureStart", js.Any.fromFunction1((t0: /* props */ Route) => value(t0).runNow()))
    
    inline def onPageChangeCancel(value: Callback): this.type = set("onPageChangeCancel", value.toJsFn)
    
    inline def onPageChangeConfirm(value: /* force */ Boolean => Callback): this.type = set("onPageChangeConfirm", js.Any.fromFunction1((t0: /* force */ Boolean) => value(t0).runNow()))
    
    inline def onPageChangeStart(value: Callback): this.type = set("onPageChangeStart", value.toJsFn)
  }
  
  def withProps(p: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsStackCardStackMod.Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
