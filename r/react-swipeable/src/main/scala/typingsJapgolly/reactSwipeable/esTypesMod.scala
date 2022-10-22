package typingsJapgolly.reactSwipeable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.reactSwipeable.anon.Event
import typingsJapgolly.reactSwipeable.anon.Passive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  @JSImport("react-swipeable/es/types", "DOWN")
  @js.native
  val DOWN: /* "Down" */ String = js.native
  
  @JSImport("react-swipeable/es/types", "LEFT")
  @js.native
  val LEFT: /* "Left" */ String = js.native
  
  @JSImport("react-swipeable/es/types", "RIGHT")
  @js.native
  val RIGHT: /* "Right" */ String = js.native
  
  @JSImport("react-swipeable/es/types", "UP")
  @js.native
  val UP: /* "Up" */ String = js.native
  
  type AttachTouch = js.Function2[
    /* el */ HTMLElement, 
    /* props */ SwipeablePropsWithDefaultOptions, 
    js.Function0[Unit]
  ]
  
  type ConfigurationOptionDelta = Double | (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Lowercase<react-swipeable.react-swipeable/es/types.SwipeDirections> ]:? number} */ js.Any)
  
  trait ConfigurationOptions extends StObject {
    
    /**
      * Min distance(px) before a swipe starts. **Default**: `10`
      */
    var delta: ConfigurationOptionDelta
    
    /**
      * Prevents scroll during swipe in most cases. **Default**: `false`
      */
    var preventScrollOnSwipe: Boolean
    
    /**
      * Set a rotation angle. **Default**: `0`
      */
    var rotationAngle: Double
    
    /**
      * Allowable duration of a swipe (ms). **Default**: `Infinity`
      */
    var swipeDuration: Double
    
    /**
      * Options for touch event listeners
      */
    var touchEventOptions: Passive
    
    /**
      * Track mouse input. **Default**: `false`
      */
    var trackMouse: Boolean
    
    /**
      * Track touch input. **Default**: `true`
      */
    var trackTouch: Boolean
  }
  object ConfigurationOptions {
    
    inline def apply(
      delta: ConfigurationOptionDelta,
      preventScrollOnSwipe: Boolean,
      rotationAngle: Double,
      swipeDuration: Double,
      touchEventOptions: Passive,
      trackMouse: Boolean,
      trackTouch: Boolean
    ): ConfigurationOptions = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], preventScrollOnSwipe = preventScrollOnSwipe.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], swipeDuration = swipeDuration.asInstanceOf[js.Any], touchEventOptions = touchEventOptions.asInstanceOf[js.Any], trackMouse = trackMouse.asInstanceOf[js.Any], trackTouch = trackTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    extension [Self <: ConfigurationOptions](x: Self) {
      
      inline def setDelta(value: ConfigurationOptionDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollOnSwipe(value: Boolean): Self = StObject.set(x, "preventScrollOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setSwipeDuration(value: Double): Self = StObject.set(x, "swipeDuration", value.asInstanceOf[js.Any])
      
      inline def setTouchEventOptions(value: Passive): Self = StObject.set(x, "touchEventOptions", value.asInstanceOf[js.Any])
      
      inline def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      inline def setTrackTouch(value: Boolean): Self = StObject.set(x, "trackTouch", value.asInstanceOf[js.Any])
    }
  }
  
  type HandledEvents = ReactMouseEventFrom[Element] | TouchEvent | MouseEvent
  
  type Setter = js.Function1[/* stateSetter */ StateSetter, Unit]
  
  type StateSetter = js.Function2[
    /* state */ SwipeableState, 
    /* props */ SwipeablePropsWithDefaultOptions, 
    SwipeableState
  ]
  
  type SwipeCallback = js.Function1[/* eventData */ SwipeEventData, Unit]
  
  type SwipeDirections = /* "Left" */ String
  
  trait SwipeEventData extends StObject {
    
    /**
      * Absolute displacement of swipe in x. Math.abs(deltaX);
      */
    var absX: Double
    
    /**
      * Absolute displacement of swipe in y. Math.abs(deltaY);
      */
    var absY: Double
    
    /**
      * Displacement of swipe in x. (current.x - initial.x)
      */
    var deltaX: Double
    
    /**
      * Displacement of swipe in y. (current.y - initial.y)
      */
    var deltaY: Double
    
    /**
      * Direction of swipe - Left | Right | Up | Down
      */
    var dir: SwipeDirections
    
    /**
      * Source event.
      */
    var event: HandledEvents
    
    /**
      * True for the first event of a tracked swipe.
      */
    var first: Boolean
    
    /**
      * Location where swipe started - [x, y].
      */
    var initial: Vector2
    
    /**
      * "Absolute velocity" (speed) - √(absX^2 + absY^2) / time
      */
    var velocity: Double
    
    /**
      * Velocity per axis - [ deltaX/time, deltaY/time ]
      */
    var vxvy: Vector2
  }
  object SwipeEventData {
    
    inline def apply(
      absX: Double,
      absY: Double,
      deltaX: Double,
      deltaY: Double,
      dir: SwipeDirections,
      event: HandledEvents,
      first: Boolean,
      initial: Vector2,
      velocity: Double,
      vxvy: Vector2
    ): SwipeEventData = {
      val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], vxvy = vxvy.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeEventData]
    }
    
    extension [Self <: SwipeEventData](x: Self) {
      
      inline def setAbsX(value: Double): Self = StObject.set(x, "absX", value.asInstanceOf[js.Any])
      
      inline def setAbsY(value: Double): Self = StObject.set(x, "absY", value.asInstanceOf[js.Any])
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDir(value: SwipeDirections): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: HandledEvents): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Vector2): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVxvy(value: Vector2): Self = StObject.set(x, "vxvy", value.asInstanceOf[js.Any])
    }
  }
  
  trait SwipeableCallbacks
    extends StObject
       with SwipeableDirectionCallbacks {
    
    /**
      * Called at start of a tracked swipe.
      */
    var onSwipeStart: SwipeCallback
    
    /**
      * Called after any swipe.
      */
    var onSwiped: SwipeCallback
    
    /**
      * Called for each move event during a tracked swipe.
      */
    var onSwiping: SwipeCallback
    
    /**
      * Called after a tap. A touch under the min distance, `delta`.
      */
    var onTap: TapCallback
    
    /**
      * Called for `touchend` and `mouseup`.
      */
    var onTouchEndOrOnMouseUp: TapCallback
    
    /**
      * Called for `touchstart` and `mousedown`.
      */
    var onTouchStartOrOnMouseDown: TapCallback
  }
  object SwipeableCallbacks {
    
    inline def apply(
      onSwipeStart: /* eventData */ SwipeEventData => Callback,
      onSwiped: /* eventData */ SwipeEventData => Callback,
      onSwipedDown: /* eventData */ SwipeEventData => Callback,
      onSwipedLeft: /* eventData */ SwipeEventData => Callback,
      onSwipedRight: /* eventData */ SwipeEventData => Callback,
      onSwipedUp: /* eventData */ SwipeEventData => Callback,
      onSwiping: /* eventData */ SwipeEventData => Callback,
      onTap: /* hasEvent */ Event => Callback,
      onTouchEndOrOnMouseUp: /* hasEvent */ Event => Callback,
      onTouchStartOrOnMouseDown: /* hasEvent */ Event => Callback
    ): SwipeableCallbacks = {
      val __obj = js.Dynamic.literal(onSwipeStart = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipeStart(t0).runNow()), onSwiped = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwiped(t0).runNow()), onSwipedDown = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedDown(t0).runNow()), onSwipedLeft = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedLeft(t0).runNow()), onSwipedRight = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedRight(t0).runNow()), onSwipedUp = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedUp(t0).runNow()), onSwiping = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwiping(t0).runNow()), onTap = js.Any.fromFunction1((t0: /* hasEvent */ Event) => onTap(t0).runNow()), onTouchEndOrOnMouseUp = js.Any.fromFunction1((t0: /* hasEvent */ Event) => onTouchEndOrOnMouseUp(t0).runNow()), onTouchStartOrOnMouseDown = js.Any.fromFunction1((t0: /* hasEvent */ Event) => onTouchStartOrOnMouseDown(t0).runNow()))
      __obj.asInstanceOf[SwipeableCallbacks]
    }
    
    extension [Self <: SwipeableCallbacks](x: Self) {
      
      inline def setOnSwipeStart(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwiped(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwiped", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwiping(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnTap(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTouchEndOrOnMouseUp(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTouchEndOrOnMouseUp", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTouchStartOrOnMouseDown(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTouchStartOrOnMouseDown", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
    }
  }
  
  trait SwipeableDirectionCallbacks extends StObject {
    
    /**
      * Called after a DOWN swipe
      */
    var onSwipedDown: SwipeCallback
    
    /**
      * Called after a LEFT swipe
      */
    var onSwipedLeft: SwipeCallback
    
    /**
      * Called after a RIGHT swipe
      */
    var onSwipedRight: SwipeCallback
    
    /**
      * Called after a UP swipe
      */
    var onSwipedUp: SwipeCallback
  }
  object SwipeableDirectionCallbacks {
    
    inline def apply(
      onSwipedDown: /* eventData */ SwipeEventData => Callback,
      onSwipedLeft: /* eventData */ SwipeEventData => Callback,
      onSwipedRight: /* eventData */ SwipeEventData => Callback,
      onSwipedUp: /* eventData */ SwipeEventData => Callback
    ): SwipeableDirectionCallbacks = {
      val __obj = js.Dynamic.literal(onSwipedDown = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedDown(t0).runNow()), onSwipedLeft = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedLeft(t0).runNow()), onSwipedRight = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedRight(t0).runNow()), onSwipedUp = js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => onSwipedUp(t0).runNow()))
      __obj.asInstanceOf[SwipeableDirectionCallbacks]
    }
    
    extension [Self <: SwipeableDirectionCallbacks](x: Self) {
      
      inline def setOnSwipedDown(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedDown", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedLeft", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedRight(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedRight", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedUp(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedUp", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait SwipeableHandlers extends StObject {
    
    var onMouseDown: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[Element], Unit]] = js.native
    
    def ref(): Unit = js.native
    def ref(element: HTMLElement): Unit = js.native
  }
  
  /* Inlined std.Partial<react-swipeable.react-swipeable/es/types.SwipeableCallbacks & react-swipeable.react-swipeable/es/types.ConfigurationOptions> */
  trait SwipeableProps extends StObject {
    
    var delta: js.UndefOr[ConfigurationOptionDelta] = js.undefined
    
    var onSwipeStart: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwiped: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedDown: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedLeft: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedRight: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedUp: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwiping: js.UndefOr[SwipeCallback] = js.undefined
    
    var onTap: js.UndefOr[TapCallback] = js.undefined
    
    var onTouchEndOrOnMouseUp: js.UndefOr[TapCallback] = js.undefined
    
    var onTouchStartOrOnMouseDown: js.UndefOr[TapCallback] = js.undefined
    
    var preventScrollOnSwipe: js.UndefOr[Boolean] = js.undefined
    
    var rotationAngle: js.UndefOr[Double] = js.undefined
    
    var swipeDuration: js.UndefOr[Double] = js.undefined
    
    var touchEventOptions: js.UndefOr[Passive] = js.undefined
    
    var trackMouse: js.UndefOr[Boolean] = js.undefined
    
    var trackTouch: js.UndefOr[Boolean] = js.undefined
  }
  object SwipeableProps {
    
    inline def apply(): SwipeableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableProps]
    }
    
    extension [Self <: SwipeableProps](x: Self) {
      
      inline def setDelta(value: ConfigurationOptionDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setOnSwipeStart(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOnSwiped(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwiped", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedDown(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedDown", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedDownUndefined: Self = StObject.set(x, "onSwipedDown", js.undefined)
      
      inline def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedLeft", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedLeftUndefined: Self = StObject.set(x, "onSwipedLeft", js.undefined)
      
      inline def setOnSwipedRight(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedRight", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedRightUndefined: Self = StObject.set(x, "onSwipedRight", js.undefined)
      
      inline def setOnSwipedUndefined: Self = StObject.set(x, "onSwiped", js.undefined)
      
      inline def setOnSwipedUp(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedUp", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedUpUndefined: Self = StObject.set(x, "onSwipedUp", js.undefined)
      
      inline def setOnSwiping(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
      
      inline def setOnTap(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnTouchEndOrOnMouseUp(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTouchEndOrOnMouseUp", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTouchEndOrOnMouseUpUndefined: Self = StObject.set(x, "onTouchEndOrOnMouseUp", js.undefined)
      
      inline def setOnTouchStartOrOnMouseDown(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTouchStartOrOnMouseDown", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTouchStartOrOnMouseDownUndefined: Self = StObject.set(x, "onTouchStartOrOnMouseDown", js.undefined)
      
      inline def setPreventScrollOnSwipe(value: Boolean): Self = StObject.set(x, "preventScrollOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollOnSwipeUndefined: Self = StObject.set(x, "preventScrollOnSwipe", js.undefined)
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      inline def setSwipeDuration(value: Double): Self = StObject.set(x, "swipeDuration", value.asInstanceOf[js.Any])
      
      inline def setSwipeDurationUndefined: Self = StObject.set(x, "swipeDuration", js.undefined)
      
      inline def setTouchEventOptions(value: Passive): Self = StObject.set(x, "touchEventOptions", value.asInstanceOf[js.Any])
      
      inline def setTouchEventOptionsUndefined: Self = StObject.set(x, "touchEventOptions", js.undefined)
      
      inline def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      inline def setTrackMouseUndefined: Self = StObject.set(x, "trackMouse", js.undefined)
      
      inline def setTrackTouch(value: Boolean): Self = StObject.set(x, "trackTouch", value.asInstanceOf[js.Any])
      
      inline def setTrackTouchUndefined: Self = StObject.set(x, "trackTouch", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-swipeable.react-swipeable/es/types.SwipeableCallbacks> & react-swipeable.react-swipeable/es/types.ConfigurationOptions */
  trait SwipeablePropsWithDefaultOptions extends StObject {
    
    /**
      * Min distance(px) before a swipe starts. **Default**: `10`
      */
    var delta: ConfigurationOptionDelta
    
    var onSwipeStart: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwiped: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedDown: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedLeft: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedRight: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwipedUp: js.UndefOr[SwipeCallback] = js.undefined
    
    var onSwiping: js.UndefOr[SwipeCallback] = js.undefined
    
    var onTap: js.UndefOr[TapCallback] = js.undefined
    
    var onTouchEndOrOnMouseUp: js.UndefOr[TapCallback] = js.undefined
    
    var onTouchStartOrOnMouseDown: js.UndefOr[TapCallback] = js.undefined
    
    /**
      * Prevents scroll during swipe in most cases. **Default**: `false`
      */
    var preventScrollOnSwipe: Boolean
    
    /**
      * Set a rotation angle. **Default**: `0`
      */
    var rotationAngle: Double
    
    /**
      * Allowable duration of a swipe (ms). **Default**: `Infinity`
      */
    var swipeDuration: Double
    
    /**
      * Options for touch event listeners
      */
    var touchEventOptions: Passive
    
    /**
      * Track mouse input. **Default**: `false`
      */
    var trackMouse: Boolean
    
    /**
      * Track touch input. **Default**: `true`
      */
    var trackTouch: Boolean
  }
  object SwipeablePropsWithDefaultOptions {
    
    inline def apply(
      delta: ConfigurationOptionDelta,
      preventScrollOnSwipe: Boolean,
      rotationAngle: Double,
      swipeDuration: Double,
      touchEventOptions: Passive,
      trackMouse: Boolean,
      trackTouch: Boolean
    ): SwipeablePropsWithDefaultOptions = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], preventScrollOnSwipe = preventScrollOnSwipe.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], swipeDuration = swipeDuration.asInstanceOf[js.Any], touchEventOptions = touchEventOptions.asInstanceOf[js.Any], trackMouse = trackMouse.asInstanceOf[js.Any], trackTouch = trackTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeablePropsWithDefaultOptions]
    }
    
    extension [Self <: SwipeablePropsWithDefaultOptions](x: Self) {
      
      inline def setDelta(value: ConfigurationOptionDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setOnSwipeStart(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipeStart", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipeStartUndefined: Self = StObject.set(x, "onSwipeStart", js.undefined)
      
      inline def setOnSwiped(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwiped", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedDown(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedDown", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedDownUndefined: Self = StObject.set(x, "onSwipedDown", js.undefined)
      
      inline def setOnSwipedLeft(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedLeft", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedLeftUndefined: Self = StObject.set(x, "onSwipedLeft", js.undefined)
      
      inline def setOnSwipedRight(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedRight", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedRightUndefined: Self = StObject.set(x, "onSwipedRight", js.undefined)
      
      inline def setOnSwipedUndefined: Self = StObject.set(x, "onSwiped", js.undefined)
      
      inline def setOnSwipedUp(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwipedUp", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipedUpUndefined: Self = StObject.set(x, "onSwipedUp", js.undefined)
      
      inline def setOnSwiping(value: /* eventData */ SwipeEventData => Callback): Self = StObject.set(x, "onSwiping", js.Any.fromFunction1((t0: /* eventData */ SwipeEventData) => value(t0).runNow()))
      
      inline def setOnSwipingUndefined: Self = StObject.set(x, "onSwiping", js.undefined)
      
      inline def setOnTap(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
      
      inline def setOnTouchEndOrOnMouseUp(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTouchEndOrOnMouseUp", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTouchEndOrOnMouseUpUndefined: Self = StObject.set(x, "onTouchEndOrOnMouseUp", js.undefined)
      
      inline def setOnTouchStartOrOnMouseDown(value: /* hasEvent */ Event => Callback): Self = StObject.set(x, "onTouchStartOrOnMouseDown", js.Any.fromFunction1((t0: /* hasEvent */ Event) => value(t0).runNow()))
      
      inline def setOnTouchStartOrOnMouseDownUndefined: Self = StObject.set(x, "onTouchStartOrOnMouseDown", js.undefined)
      
      inline def setPreventScrollOnSwipe(value: Boolean): Self = StObject.set(x, "preventScrollOnSwipe", value.asInstanceOf[js.Any])
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setSwipeDuration(value: Double): Self = StObject.set(x, "swipeDuration", value.asInstanceOf[js.Any])
      
      inline def setTouchEventOptions(value: Passive): Self = StObject.set(x, "touchEventOptions", value.asInstanceOf[js.Any])
      
      inline def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      inline def setTrackTouch(value: Boolean): Self = StObject.set(x, "trackTouch", value.asInstanceOf[js.Any])
    }
  }
  
  trait SwipeableState extends StObject {
    
    var cleanUpTouch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var el: js.UndefOr[HTMLElement] = js.undefined
    
    var eventData: js.UndefOr[SwipeEventData] = js.undefined
    
    var first: Boolean
    
    var initial: Vector2
    
    var start: Double
    
    var swiping: Boolean
    
    var xy: Vector2
  }
  object SwipeableState {
    
    inline def apply(first: Boolean, initial: Vector2, start: Double, swiping: Boolean, xy: Vector2): SwipeableState = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwipeableState]
    }
    
    extension [Self <: SwipeableState](x: Self) {
      
      inline def setCleanUpTouch(value: Callback): Self = StObject.set(x, "cleanUpTouch", value.toJsFn)
      
      inline def setCleanUpTouchUndefined: Self = StObject.set(x, "cleanUpTouch", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setEventData(value: SwipeEventData): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Vector2): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      inline def setXy(value: Vector2): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    }
  }
  
  type TapCallback = js.Function1[/* hasEvent */ Event, Unit]
  
  type Vector2 = js.Tuple2[Double, Double]
}
