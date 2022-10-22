package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.reactNavigation.mod.NavigationState
import typingsJapgolly.reactNavigationStack.anon.Gestures
import typingsJapgolly.reactNavigationStack.anon.Route
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackDescriptorMap
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderMode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsStackCardStackMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", JSImport.Default)
  @js.native
  open class default protected () extends CardStack {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: Props, state: State): Gestures | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Gestures | Null]
  }
  
  @js.native
  trait CardStack extends Component[Props, State, Any] {
    
    /* private */ var getFocusedRoute: Any = js.native
    
    /* private */ var getPreviousScene: Any = js.native
    
    /* private */ var handleHeaderLayout: Any = js.native
    
    /* private */ var handleLayout: Any = js.native
  }
  
  type GestureValues = StringDictionary[Value]
  
  trait Props extends StObject {
    
    var closingRouteKeys: js.Array[String]
    
    var descriptors: StackDescriptorMap
    
    var detachInactiveScreens: js.UndefOr[Boolean] = js.undefined
    
    def getGesturesEnabled(props: Route): Boolean
    
    def getPreviousRoute(props: Route): js.UndefOr[
        typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
      ]
    
    var headerMode: StackHeaderMode
    
    var insets: EdgeInsets
    
    var isParentHeaderShown: Boolean
    
    var mode: StackCardMode
    
    def onCloseRoute(props: Route): Unit
    
    var onGestureCancel: js.UndefOr[js.Function1[/* props */ Route, Unit]] = js.undefined
    
    var onGestureEnd: js.UndefOr[js.Function1[/* props */ Route, Unit]] = js.undefined
    
    var onGestureStart: js.UndefOr[js.Function1[/* props */ Route, Unit]] = js.undefined
    
    def onOpenRoute(props: Route): Unit
    
    var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPageChangeConfirm: js.UndefOr[js.Function1[/* force */ Boolean, Unit]] = js.undefined
    
    var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onTransitionEnd(props: Route, closing: Boolean): Unit
    
    def onTransitionStart(props: Route, closing: Boolean): Unit
    
    var openingRouteKeys: js.Array[String]
    
    def renderHeader(
      props: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props
    ): Node
    
    def renderScene(props: Route): Node
    
    var routes: js.Array[
        typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
      ]
    
    var state: NavigationState
  }
  object Props {
    
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
      renderHeader: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props => Node,
      renderScene: Route => Node,
      routes: js.Array[
          typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
        ],
      state: NavigationState
    ): Props = {
      val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1((t0: Route) => onCloseRoute(t0).runNow()), onOpenRoute = js.Any.fromFunction1((t0: Route) => onOpenRoute(t0).runNow()), onTransitionEnd = js.Any.fromFunction2((t0: Route, t1: Boolean) => (onTransitionEnd(t0, t1)).runNow()), onTransitionStart = js.Any.fromFunction2((t0: Route, t1: Boolean) => (onTransitionStart(t0, t1)).runNow()), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value*))
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      inline def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
      
      inline def setGetGesturesEnabled(value: Route => Boolean): Self = StObject.set(x, "getGesturesEnabled", js.Any.fromFunction1(value))
      
      inline def setGetPreviousRoute(
        value: Route => js.UndefOr[
              typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
            ]
      ): Self = StObject.set(x, "getPreviousRoute", js.Any.fromFunction1(value))
      
      inline def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setIsParentHeaderShown(value: Boolean): Self = StObject.set(x, "isParentHeaderShown", value.asInstanceOf[js.Any])
      
      inline def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnCloseRoute(value: Route => Callback): Self = StObject.set(x, "onCloseRoute", js.Any.fromFunction1((t0: Route) => value(t0).runNow()))
      
      inline def setOnGestureCancel(value: /* props */ Route => Callback): Self = StObject.set(x, "onGestureCancel", js.Any.fromFunction1((t0: /* props */ Route) => value(t0).runNow()))
      
      inline def setOnGestureCancelUndefined: Self = StObject.set(x, "onGestureCancel", js.undefined)
      
      inline def setOnGestureEnd(value: /* props */ Route => Callback): Self = StObject.set(x, "onGestureEnd", js.Any.fromFunction1((t0: /* props */ Route) => value(t0).runNow()))
      
      inline def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      inline def setOnGestureStart(value: /* props */ Route => Callback): Self = StObject.set(x, "onGestureStart", js.Any.fromFunction1((t0: /* props */ Route) => value(t0).runNow()))
      
      inline def setOnGestureStartUndefined: Self = StObject.set(x, "onGestureStart", js.undefined)
      
      inline def setOnOpenRoute(value: Route => Callback): Self = StObject.set(x, "onOpenRoute", js.Any.fromFunction1((t0: Route) => value(t0).runNow()))
      
      inline def setOnPageChangeCancel(value: Callback): Self = StObject.set(x, "onPageChangeCancel", value.toJsFn)
      
      inline def setOnPageChangeCancelUndefined: Self = StObject.set(x, "onPageChangeCancel", js.undefined)
      
      inline def setOnPageChangeConfirm(value: /* force */ Boolean => Callback): Self = StObject.set(x, "onPageChangeConfirm", js.Any.fromFunction1((t0: /* force */ Boolean) => value(t0).runNow()))
      
      inline def setOnPageChangeConfirmUndefined: Self = StObject.set(x, "onPageChangeConfirm", js.undefined)
      
      inline def setOnPageChangeStart(value: Callback): Self = StObject.set(x, "onPageChangeStart", value.toJsFn)
      
      inline def setOnPageChangeStartUndefined: Self = StObject.set(x, "onPageChangeStart", js.undefined)
      
      inline def setOnTransitionEnd(value: (Route, Boolean) => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction2((t0: Route, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnTransitionStart(value: (Route, Boolean) => Callback): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2((t0: Route, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
      
      inline def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value*))
      
      inline def setRenderHeader(
        value: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderContainerMod.Props => Node
      ): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      inline def setRenderScene(value: Route => Node): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      inline def setRoutes(
        value: js.Array[
              typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
            ]
      ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var descriptors: StackDescriptorMap
    
    var gestures: GestureValues
    
    var headerHeights: Record[String, Double]
    
    var layout: Layout
    
    var routes: js.Array[
        typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
      ]
    
    var scenes: js.Array[
        Scene[
          typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
        ]
      ]
  }
  object State {
    
    inline def apply(
      descriptors: StackDescriptorMap,
      gestures: GestureValues,
      headerHeights: Record[String, Double],
      layout: Layout,
      routes: js.Array[
          typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
        ],
      scenes: js.Array[
          Scene[
            typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
          ]
        ]
    ): State = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setGestures(value: GestureValues): Self = StObject.set(x, "gestures", value.asInstanceOf[js.Any])
      
      inline def setHeaderHeights(value: Record[String, Double]): Self = StObject.set(x, "headerHeights", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setRoutes(
        value: js.Array[
              typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
            ]
      ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setScenes(
        value: js.Array[
              Scene[
                typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
              ]
            ]
      ): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
      
      inline def setScenesVarargs(
        value: (Scene[
              typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
            ])*
      ): Self = StObject.set(x, "scenes", js.Array(value*))
    }
  }
}
