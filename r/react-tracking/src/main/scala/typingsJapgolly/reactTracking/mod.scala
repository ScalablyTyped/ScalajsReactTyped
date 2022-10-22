package typingsJapgolly.reactTracking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactTracking.anon.PropsWithChildren
import typingsJapgolly.reactTracking.anon.Tracking
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-tracking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-tracking", JSImport.Default)
  @js.native
  val default: Track_[Any, Any, Any] = js.native
  
  @JSImport("react-tracking", "ReactTrackingContext")
  @js.native
  val ReactTrackingContext: TrackingContext[Any] = js.native
  
  @JSImport("react-tracking", "track")
  @js.native
  val track: Track_[Any, Any, Any] = js.native
  
  inline def useTracking[P](): TrackingHook[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTracking")().asInstanceOf[TrackingHook[P]]
  inline def useTracking[P](trackingData: js.Function0[Partial[P]]): TrackingHook[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTracking")(trackingData.asInstanceOf[js.Any]).asInstanceOf[TrackingHook[P]]
  inline def useTracking[P](trackingData: js.Function0[Partial[P]], options: Partial[Options[P]]): TrackingHook[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTracking")(trackingData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TrackingHook[P]]
  inline def useTracking[P](trackingData: Unit, options: Partial[Options[P]]): TrackingHook[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTracking")(trackingData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TrackingHook[P]]
  inline def useTracking[P](trackingData: Partial[P]): TrackingHook[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTracking")(trackingData.asInstanceOf[js.Any]).asInstanceOf[TrackingHook[P]]
  inline def useTracking[P](trackingData: Partial[P], options: Partial[Options[P]]): TrackingHook[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTracking")(trackingData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TrackingHook[P]]
  
  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  
  @js.native
  trait Decorator
    extends ClassDecorator
       with MethodDecorator {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Function): js.Function = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* target */ js.Object,
      arg2: /* propertyKey */ String | js.Symbol,
      arg3: /* descriptor */ TypedPropertyDescriptor[Any]
    ): TypedPropertyDescriptor[Any] = js.native
  }
  
  trait DecoratorOptions[T]
    extends StObject
       with Options[T] {
    
    /**
      * When set to `true`, adding a ref to the wrapped component will actually return the instance of the underlying
      * component.
      *
      * Default is `false`.
      */
    var forwardRef: js.UndefOr[Boolean] = js.undefined
  }
  object DecoratorOptions {
    
    inline def apply[T](): DecoratorOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoratorOptions[T]]
    }
    
    extension [Self <: DecoratorOptions[?], T](x: Self & DecoratorOptions[T]) {
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactTracking.reactTrackingBooleans.`false`
    - scala.Null
    - scala.Unit
    - typingsJapgolly.reactTracking.reactTrackingStrings._empty
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[Any], 
    TypedPropertyDescriptor[Any]
  ]
  
  trait Options[T] extends StObject {
    
    /**
      * By default, data tracking objects are pushed to `window.dataLayer[]`. This is a good default if you use Google
      * Tag Manager. You can override this by passing in a dispatch function as a second parameter to the tracking
      * decorator `{ dispatch: fn() }` on some top-level component high up in your app (typically some root-level
      * component that wraps your entire app).
      */
    var dispatch: js.UndefOr[js.Function1[/* data */ T, Any]] = js.undefined
    
    /**
      * To dispatch tracking data when a component mounts, you can pass in `{ dispatchOnMount: true }` as the second
      * parameter to `@track()`. This is useful for dispatching tracking data on "Page" components.
      *
      * If you pass in a function, the function will be called with all of the tracking data from the app's context when
      * the component mounts. The return value of this function will be dispatched in `componentDidMount()`. The object
      * returned from this function call will be merged with the context data and then dispatched. A use case for this
      * would be that you want to provide extra tracking data without adding it to the context.
      */
    var dispatchOnMount: js.UndefOr[Boolean | (js.Function1[/* contextData */ T, T])] = js.undefined
    
    /**
      * When there's a need to implicitly dispatch an event with some data for every component, you can define an
      * `options.process` function. This function should be declared once, at some top-level component. It will get
      * called with each component's tracking data as the only argument. The returned object from this function will be
      * merged with all the tracking context data and dispatched in `componentDidMount()`. If a falsy value is returned
      * (`false`, `null`, `undefined`, ...), nothing will be dispatched.
      *
      * A common use case for this is to dispatch a `pageview` event for every component in the application that has a
      * `page` property on its `trackingData`.
      */
    var process: js.UndefOr[js.Function1[/* ownTrackingData */ T, T | Falsy]] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setDispatch(value: /* data */ T => Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchOnMount(value: Boolean | (js.Function1[/* contextData */ T, T])): Self = StObject.set(x, "dispatchOnMount", value.asInstanceOf[js.Any])
      
      inline def setDispatchOnMountFunction1(value: /* contextData */ T => T): Self = StObject.set(x, "dispatchOnMount", js.Any.fromFunction1(value))
      
      inline def setDispatchOnMountUndefined: Self = StObject.set(x, "dispatchOnMount", js.undefined)
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setProcess(value: /* ownTrackingData */ T => T | Falsy): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  type Track_[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[TrackingInfo[Pick[T, /* keyof T */ String], P, S]], 
    /* options */ js.UndefOr[DecoratorOptions[Partial[T]]], 
    Decorator
  ]
  
  type TrackingComponent[P] = FC[PropsWithChildren]
  
  type TrackingContext[T] = Context[Tracking[T]]
  
  trait TrackingHook[P]
    extends StObject
       with TrackingProp[P] {
    
    /**
      * This component will pass any tracking data as context to tracking calls made in any components within its subtree.
      */
    var Track: TrackingComponent[P]
  }
  object TrackingHook {
    
    inline def apply[P](
      Track: TrackingComponent[P],
      getTrackingData: CallbackTo[js.Object],
      trackEvent: Partial[P] => Callback
    ): TrackingHook[P] = {
      val __obj = js.Dynamic.literal(Track = Track.asInstanceOf[js.Any], getTrackingData = getTrackingData.toJsFn, trackEvent = js.Any.fromFunction1((t0: Partial[P]) => trackEvent(t0).runNow()))
      __obj.asInstanceOf[TrackingHook[P]]
    }
    
    extension [Self <: TrackingHook[?], P](x: Self & TrackingHook[P]) {
      
      inline def setTrack(value: TrackingComponent[P]): Self = StObject.set(x, "Track", value.asInstanceOf[js.Any])
    }
  }
  
  type TrackingInfo[T, P, S] = T | (js.Function4[
    /* props */ P, 
    /* state */ S, 
    /* import warning: importer.ImportType#apply Failed type conversion: any[any] */ /* args */ js.Any, 
    /* hasValueErr */ js.Tuple2[Any, Any], 
    T | Falsy
  ])
  
  trait TrackingProp[P] extends StObject {
    
    /**
      * This method returns all of the contextual tracking data up until this point in the component hierarchy.
      */
    def getTrackingData(): js.Object
    
    /**
      * This function tracks an event, along with related data.
      */
    def trackEvent(data: Partial[P]): Unit
  }
  object TrackingProp {
    
    inline def apply[P](getTrackingData: CallbackTo[js.Object], trackEvent: Partial[P] => Callback): TrackingProp[P] = {
      val __obj = js.Dynamic.literal(getTrackingData = getTrackingData.toJsFn, trackEvent = js.Any.fromFunction1((t0: Partial[P]) => trackEvent(t0).runNow()))
      __obj.asInstanceOf[TrackingProp[P]]
    }
    
    extension [Self <: TrackingProp[?], P](x: Self & TrackingProp[P]) {
      
      inline def setGetTrackingData(value: CallbackTo[js.Object]): Self = StObject.set(x, "getTrackingData", value.toJsFn)
      
      inline def setTrackEvent(value: Partial[P] => Callback): Self = StObject.set(x, "trackEvent", js.Any.fromFunction1((t0: Partial[P]) => value(t0).runNow()))
    }
  }
  
  trait _Falsy extends StObject
}
