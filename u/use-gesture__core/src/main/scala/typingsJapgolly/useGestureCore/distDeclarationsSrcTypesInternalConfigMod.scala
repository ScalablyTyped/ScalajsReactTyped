package typingsJapgolly.useGestureCore

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.EventTarget
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.useGestureCore.anon.DragStateeventEventTypesd
import typingsJapgolly.useGestureCore.anon.Duration
import typingsJapgolly.useGestureCore.anon.RecordPointerTypenumber
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesKey
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.ModifierKey
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import typingsJapgolly.useGestureCore.useGestureCoreStrings.gesture
import typingsJapgolly.useGestureCore.useGestureCoreStrings.hover
import typingsJapgolly.useGestureCore.useGestureCoreStrings.mouse
import typingsJapgolly.useGestureCore.useGestureCoreStrings.move
import typingsJapgolly.useGestureCore.useGestureCoreStrings.pinch
import typingsJapgolly.useGestureCore.useGestureCoreStrings.pointer
import typingsJapgolly.useGestureCore.useGestureCoreStrings.scroll
import typingsJapgolly.useGestureCore.useGestureCoreStrings.touch
import typingsJapgolly.useGestureCore.useGestureCoreStrings.wheel
import typingsJapgolly.useGestureCore.useGestureCoreStrings.x
import typingsJapgolly.useGestureCore.useGestureCoreStrings.xy
import typingsJapgolly.useGestureCore.useGestureCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesInternalConfigMod {
  
  trait InternalConfig extends StObject {
    
    var drag: js.UndefOr[InternalDragOptions] = js.undefined
    
    var hover: js.UndefOr[
        InternalCoordinatesOptions[typingsJapgolly.useGestureCore.useGestureCoreStrings.hover] & MoveAndHoverMouseOnly
      ] = js.undefined
    
    var move: js.UndefOr[
        InternalCoordinatesOptions[typingsJapgolly.useGestureCore.useGestureCoreStrings.move] & MoveAndHoverMouseOnly
      ] = js.undefined
    
    var pinch: js.UndefOr[InternalPinchOptions] = js.undefined
    
    var scroll: js.UndefOr[
        InternalCoordinatesOptions[typingsJapgolly.useGestureCore.useGestureCoreStrings.scroll]
      ] = js.undefined
    
    var shared: InternalGenericOptions
    
    var wheel: js.UndefOr[
        InternalCoordinatesOptions[typingsJapgolly.useGestureCore.useGestureCoreStrings.wheel]
      ] = js.undefined
  }
  object InternalConfig {
    
    inline def apply(shared: InternalGenericOptions): InternalConfig = {
      val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalConfig]
    }
    
    extension [Self <: InternalConfig](x: Self) {
      
      inline def setDrag(value: InternalDragOptions): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setHover(value: InternalCoordinatesOptions[hover] & MoveAndHoverMouseOnly): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setMove(value: InternalCoordinatesOptions[move] & MoveAndHoverMouseOnly): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setPinch(value: InternalPinchOptions): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
      
      inline def setPinchUndefined: Self = StObject.set(x, "pinch", js.undefined)
      
      inline def setScroll(value: InternalCoordinatesOptions[scroll]): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShared(value: InternalGenericOptions): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setWheel(value: InternalCoordinatesOptions[wheel]): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    }
  }
  
  trait InternalCoordinatesOptions[Key /* <: CoordinatesKey */]
    extends StObject
       with InternalGestureOptions[Key] {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var axisThreshold: Double
    
    var lockDirection: Boolean
  }
  object InternalCoordinatesOptions {
    
    inline def apply[Key /* <: CoordinatesKey */](
      axisThreshold: Double,
      bounds: (js.Tuple2[Vector2, Vector2]) | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          js.Tuple2[Vector2, Vector2]
        ]),
      enabled: Boolean,
      eventOptions: AddEventListenerOptions,
      from: Vector2 | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          Vector2
        ]),
      hasCustomTransform: Boolean,
      lockDirection: Boolean,
      preventDefault: Boolean,
      rubberband: Vector2,
      threshold: Vector2,
      transform: Vector2 => Vector2,
      triggerAllEvents: Boolean
    ): InternalCoordinatesOptions[Key] = {
      val __obj = js.Dynamic.literal(axisThreshold = axisThreshold.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventOptions = eventOptions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], hasCustomTransform = hasCustomTransform.asInstanceOf[js.Any], lockDirection = lockDirection.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rubberband = rubberband.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform), triggerAllEvents = triggerAllEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalCoordinatesOptions[Key]]
    }
    
    extension [Self <: InternalCoordinatesOptions[?], Key /* <: CoordinatesKey */](x: Self & InternalCoordinatesOptions[Key]) {
      
      inline def setAxis(value: typingsJapgolly.useGestureCore.useGestureCoreStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisThreshold(value: Double): Self = StObject.set(x, "axisThreshold", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setLockDirection(value: Boolean): Self = StObject.set(x, "lockDirection", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/internalConfig.InternalCoordinatesOptions<'drag'>, 'axisThreshold'> & {  filterTaps :boolean,   tapsThreshold :number,   pointerButtons :number | std.Array<number>,   pointerCapture :boolean,   preventScrollDelay :number | undefined,   preventScrollAxis :'x' | 'y' | 'xy' | undefined,   pointerLock :boolean,   keys :boolean,   device :'pointer' | 'touch' | 'mouse',   swipe :{  velocity :@use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.Vector2,   distance :@use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.Vector2,   duration :number},   delay :number,   axisThreshold :std.Record<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.PointerType, number>} */
  trait InternalDragOptions extends StObject {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var axisThreshold: RecordPointerTypenumber
    
    var bounds: (js.Tuple2[Vector2, Vector2]) | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesd], js.Tuple2[Vector2, Vector2]])
    
    var delay: Double
    
    var device: pointer | touch | mouse
    
    var enabled: Boolean
    
    var eventOptions: AddEventListenerOptions
    
    var filterTaps: Boolean
    
    var from: Vector2 | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesd], Vector2])
    
    var hasCustomTransform: Boolean
    
    var keys: Boolean
    
    var lockDirection: Boolean
    
    var pointerButtons: Double | js.Array[Double]
    
    var pointerCapture: Boolean
    
    var pointerLock: Boolean
    
    var preventDefault: Boolean
    
    var preventScrollAxis: js.UndefOr[x | y | xy] = js.undefined
    
    var preventScrollDelay: js.UndefOr[Double] = js.undefined
    
    var rubberband: Vector2
    
    var swipe: Duration
    
    var tapsThreshold: Double
    
    var threshold: Vector2
    
    def transform(v: Vector2): Vector2
    @JSName("transform")
    var transform_Original: js.Function1[/* v */ Vector2, Vector2]
    
    var triggerAllEvents: Boolean
  }
  object InternalDragOptions {
    
    inline def apply(
      axisThreshold: RecordPointerTypenumber,
      bounds: (js.Tuple2[Vector2, Vector2]) | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesd], js.Tuple2[Vector2, Vector2]]),
      delay: Double,
      device: pointer | touch | mouse,
      enabled: Boolean,
      eventOptions: AddEventListenerOptions,
      filterTaps: Boolean,
      from: Vector2 | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesd], Vector2]),
      hasCustomTransform: Boolean,
      keys: Boolean,
      lockDirection: Boolean,
      pointerButtons: Double | js.Array[Double],
      pointerCapture: Boolean,
      pointerLock: Boolean,
      preventDefault: Boolean,
      rubberband: Vector2,
      swipe: Duration,
      tapsThreshold: Double,
      threshold: Vector2,
      transform: /* v */ Vector2 => Vector2,
      triggerAllEvents: Boolean
    ): InternalDragOptions = {
      val __obj = js.Dynamic.literal(axisThreshold = axisThreshold.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventOptions = eventOptions.asInstanceOf[js.Any], filterTaps = filterTaps.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], hasCustomTransform = hasCustomTransform.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], lockDirection = lockDirection.asInstanceOf[js.Any], pointerButtons = pointerButtons.asInstanceOf[js.Any], pointerCapture = pointerCapture.asInstanceOf[js.Any], pointerLock = pointerLock.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rubberband = rubberband.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], tapsThreshold = tapsThreshold.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform), triggerAllEvents = triggerAllEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalDragOptions]
    }
    
    extension [Self <: InternalDragOptions](x: Self) {
      
      inline def setAxis(value: typingsJapgolly.useGestureCore.useGestureCoreStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisThreshold(value: RecordPointerTypenumber): Self = StObject.set(x, "axisThreshold", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setBounds(
        value: (js.Tuple2[Vector2, Vector2]) | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesd], js.Tuple2[Vector2, Vector2]])
      ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsFunction1(value: /* state */ js.UndefOr[DragStateeventEventTypesd] => js.Tuple2[Vector2, Vector2]): Self = StObject.set(x, "bounds", js.Any.fromFunction1(value))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: pointer | touch | mouse): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
      
      inline def setFilterTaps(value: Boolean): Self = StObject.set(x, "filterTaps", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Vector2 | (js.Function1[/* state */ js.UndefOr[DragStateeventEventTypesd], Vector2])): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromFunction1(value: /* state */ js.UndefOr[DragStateeventEventTypesd] => Vector2): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setHasCustomTransform(value: Boolean): Self = StObject.set(x, "hasCustomTransform", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLockDirection(value: Boolean): Self = StObject.set(x, "lockDirection", value.asInstanceOf[js.Any])
      
      inline def setPointerButtons(value: Double | js.Array[Double]): Self = StObject.set(x, "pointerButtons", value.asInstanceOf[js.Any])
      
      inline def setPointerButtonsVarargs(value: Double*): Self = StObject.set(x, "pointerButtons", js.Array(value*))
      
      inline def setPointerCapture(value: Boolean): Self = StObject.set(x, "pointerCapture", value.asInstanceOf[js.Any])
      
      inline def setPointerLock(value: Boolean): Self = StObject.set(x, "pointerLock", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollAxis(value: typingsJapgolly.useGestureCore.useGestureCoreStrings.x | y | xy): Self = StObject.set(x, "preventScrollAxis", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollAxisUndefined: Self = StObject.set(x, "preventScrollAxis", js.undefined)
      
      inline def setPreventScrollDelay(value: Double): Self = StObject.set(x, "preventScrollDelay", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollDelayUndefined: Self = StObject.set(x, "preventScrollDelay", js.undefined)
      
      inline def setRubberband(value: Vector2): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
      
      inline def setSwipe(value: Duration): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setTapsThreshold(value: Double): Self = StObject.set(x, "tapsThreshold", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Vector2): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: /* v */ Vector2 => Vector2): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTriggerAllEvents(value: Boolean): Self = StObject.set(x, "triggerAllEvents", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalGenericOptions extends StObject {
    
    var enabled: Boolean
    
    var eventOptions: AddEventListenerOptions
    
    var target: js.UndefOr[js.Function0[EventTarget]] = js.undefined
    
    var transform: js.UndefOr[js.Function1[/* v */ Vector2, Vector2]] = js.undefined
    
    var window: EventTarget
  }
  object InternalGenericOptions {
    
    inline def apply(enabled: Boolean, eventOptions: AddEventListenerOptions, window: EventTarget): InternalGenericOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], eventOptions = eventOptions.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalGenericOptions]
    }
    
    extension [Self <: InternalGenericOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: CallbackTo[EventTarget]): Self = StObject.set(x, "target", value.toJsFn)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTransform(value: /* v */ Vector2 => Vector2): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWindow(value: EventTarget): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalGestureOptions[Key /* <: GestureKey */] extends StObject {
    
    var bounds: (js.Tuple2[Vector2, Vector2]) | (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
        js.Tuple2[Vector2, Vector2]
      ])
    
    var enabled: Boolean
    
    var eventOptions: AddEventListenerOptions
    
    var from: Vector2 | (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
        Vector2
      ])
    
    var hasCustomTransform: Boolean
    
    var preventDefault: Boolean
    
    var rubberband: Vector2
    
    var threshold: Vector2
    
    def transform(v: Vector2): Vector2
    
    var triggerAllEvents: Boolean
  }
  object InternalGestureOptions {
    
    inline def apply[Key /* <: GestureKey */](
      bounds: (js.Tuple2[Vector2, Vector2]) | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          js.Tuple2[Vector2, Vector2]
        ]),
      enabled: Boolean,
      eventOptions: AddEventListenerOptions,
      from: Vector2 | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          Vector2
        ]),
      hasCustomTransform: Boolean,
      preventDefault: Boolean,
      rubberband: Vector2,
      threshold: Vector2,
      transform: Vector2 => Vector2,
      triggerAllEvents: Boolean
    ): InternalGestureOptions[Key] = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventOptions = eventOptions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], hasCustomTransform = hasCustomTransform.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rubberband = rubberband.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform), triggerAllEvents = triggerAllEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalGestureOptions[Key]]
    }
    
    extension [Self <: InternalGestureOptions[?], Key /* <: GestureKey */](x: Self & InternalGestureOptions[Key]) {
      
      inline def setBounds(
        value: (js.Tuple2[Vector2, Vector2]) | (js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
              js.Tuple2[Vector2, Vector2]
            ])
      ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsFunction1(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any => js.Tuple2[Vector2, Vector2]
      ): Self = StObject.set(x, "bounds", js.Any.fromFunction1(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEventOptions(value: AddEventListenerOptions): Self = StObject.set(x, "eventOptions", value.asInstanceOf[js.Any])
      
      inline def setFrom(
        value: Vector2 | (js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
              Vector2
            ])
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromFunction1(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any => Vector2
      ): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setHasCustomTransform(value: Boolean): Self = StObject.set(x, "hasCustomTransform", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setRubberband(value: Vector2): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Vector2): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Vector2 => Vector2): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTriggerAllEvents(value: Boolean): Self = StObject.set(x, "triggerAllEvents", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalPinchOptions
    extends StObject
       with InternalGestureOptions[pinch] {
    
    /**
      * When device is undefined, we'll be using wheel to zoom.
      */
    var device: js.UndefOr[gesture | pointer | touch] = js.undefined
    
    var lockDirection: Boolean
    
    var modifierKey: ModifierKey
  }
  object InternalPinchOptions {
    
    inline def apply(
      bounds: (js.Tuple2[Vector2, Vector2]) | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          js.Tuple2[Vector2, Vector2]
        ]),
      enabled: Boolean,
      eventOptions: AddEventListenerOptions,
      from: Vector2 | (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: @use-gesture/core.@use-gesture/core/dist/declarations/src/types/state.State[Key] */ /* state */ js.Any, 
          Vector2
        ]),
      hasCustomTransform: Boolean,
      lockDirection: Boolean,
      preventDefault: Boolean,
      rubberband: Vector2,
      threshold: Vector2,
      transform: Vector2 => Vector2,
      triggerAllEvents: Boolean
    ): InternalPinchOptions = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventOptions = eventOptions.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], hasCustomTransform = hasCustomTransform.asInstanceOf[js.Any], lockDirection = lockDirection.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rubberband = rubberband.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform), triggerAllEvents = triggerAllEvents.asInstanceOf[js.Any], modifierKey = null)
      __obj.asInstanceOf[InternalPinchOptions]
    }
    
    extension [Self <: InternalPinchOptions](x: Self) {
      
      inline def setDevice(value: gesture | pointer | touch): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setLockDirection(value: Boolean): Self = StObject.set(x, "lockDirection", value.asInstanceOf[js.Any])
      
      inline def setModifierKey(value: ModifierKey): Self = StObject.set(x, "modifierKey", value.asInstanceOf[js.Any])
      
      inline def setModifierKeyNull: Self = StObject.set(x, "modifierKey", null)
    }
  }
  
  trait MoveAndHoverMouseOnly extends StObject {
    
    var mouseOnly: Boolean
  }
  object MoveAndHoverMouseOnly {
    
    inline def apply(mouseOnly: Boolean): MoveAndHoverMouseOnly = {
      val __obj = js.Dynamic.literal(mouseOnly = mouseOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveAndHoverMouseOnly]
    }
    
    extension [Self <: MoveAndHoverMouseOnly](x: Self) {
      
      inline def setMouseOnly(value: Boolean): Self = StObject.set(x, "mouseOnly", value.asInstanceOf[js.Any])
    }
  }
}
