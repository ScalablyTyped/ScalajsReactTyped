package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardFocusElementLookup
import typingsJapgolly.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardMovementConfig
import typingsJapgolly.reactMdUtils.typesSizingConstantsMod.QuerySize
import typingsJapgolly.reactMdUtils.typesSizingUseWidthMediaQueryMod.WidthMediaQuerys
import typingsJapgolly.reactMdUtils.typesTypesMod.NonNullRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @react-md/utils.@react-md/utils/types/sizing/useAppSizeMedia.AppSize & {  __initialized :boolean} */
  trait AppSizeinitializedboolean extends StObject {
    
    var __initialized: Boolean
    
    /**
      * Boolean if currently matching a desktop screen by comparing the max width
      * of the device.
      */
    var isDesktop: Boolean
    
    /**
      * Boolean if the app is considered to be in landscape mode. This will just
      * verify that the window width is greater than the window height.
      *
      * NOTE: This might not be super accurate on Android devices since the soft
      * keyboard will change the dimensions of the viewport when it appears. It is
      * recommended to use the `useOrientation` hook as well if you'd like to get
      * the current orientation type.
      */
    var isLandscape: Boolean
    
    /**
      * Boolean if currently matching a large desktop screen by comparing the max
      * width of the device.
      */
    var isLargeDesktop: Boolean
    
    /**
      * Boolean if currently matching a phone by comparing the max width of the
      * device.
      */
    var isPhone: Boolean
    
    /**
      * Boolean if currently matching a tablet by comparing the max width of the
      * device.
      */
    var isTablet: Boolean
  }
  object AppSizeinitializedboolean {
    
    inline def apply(
      __initialized: Boolean,
      isDesktop: Boolean,
      isLandscape: Boolean,
      isLargeDesktop: Boolean,
      isPhone: Boolean,
      isTablet: Boolean
    ): AppSizeinitializedboolean = {
      val __obj = js.Dynamic.literal(__initialized = __initialized.asInstanceOf[js.Any], isDesktop = isDesktop.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isLargeDesktop = isLargeDesktop.asInstanceOf[js.Any], isPhone = isPhone.asInstanceOf[js.Any], isTablet = isTablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppSizeinitializedboolean]
    }
    
    extension [Self <: AppSizeinitializedboolean](x: Self) {
      
      inline def setIsDesktop(value: Boolean): Self = StObject.set(x, "isDesktop", value.asInstanceOf[js.Any])
      
      inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
      
      inline def setIsLargeDesktop(value: Boolean): Self = StObject.set(x, "isLargeDesktop", value.asInstanceOf[js.Any])
      
      inline def setIsPhone(value: Boolean): Self = StObject.set(x, "isPhone", value.asInstanceOf[js.Any])
      
      inline def setIsTablet(value: Boolean): Self = StObject.set(x, "isTablet", value.asInstanceOf[js.Any])
      
      inline def set__initialized(value: Boolean): Self = StObject.set(x, "__initialized", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current[T] extends StObject {
    
    val current: T
  }
  object Current {
    
    inline def apply[T](current: T): Current[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current[T]]
    }
    
    extension [Self <: Current[?], T](x: Self & Current[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max
    extends StObject
       with WidthMediaQuerys {
    
    var max: QuerySize
  }
  object Max {
    
    inline def apply(max: QuerySize): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: QuerySize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxMin
    extends StObject
       with WidthMediaQuerys {
    
    var max: QuerySize
    
    var min: QuerySize
  }
  object MaxMin {
    
    inline def apply(max: QuerySize, min: QuerySize): MaxMin = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxMin]
    }
    
    extension [Self <: MaxMin](x: Self) {
      
      inline def setMax(value: QuerySize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: QuerySize): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Min
    extends StObject
       with WidthMediaQuerys {
    
    var min: QuerySize
  }
  object Min {
    
    inline def apply(min: QuerySize): Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Min]
    }
    
    extension [Self <: Min](x: Self) {
      
      inline def setMin(value: QuerySize): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/activeDescendantContext.ActiveDescendantContext> */
  trait ReadonlyActiveDescendantC extends StObject {
    
    val activeId: String
    
    val setActiveId: Dispatch[SetStateAction[String]]
  }
  object ReadonlyActiveDescendantC {
    
    inline def apply(activeId: String, setActiveId: SetStateAction[String] => Callback): ReadonlyActiveDescendantC = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1((t0: SetStateAction[String]) => setActiveId(t0).runNow()))
      __obj.asInstanceOf[ReadonlyActiveDescendantC]
    }
    
    extension [Self <: ReadonlyActiveDescendantC](x: Self) {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setSetActiveId(value: SetStateAction[String] => Callback): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1((t0: SetStateAction[String]) => value(t0).runNow()))
    }
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/hover/useHoverMode.HoverModeEventHandlers> */
  trait ReadonlyHoverModeEventHan extends StObject {
    
    val onClick: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
    
    val onMouseEnter: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
    
    val onMouseLeave: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
  }
  object ReadonlyHoverModeEventHan {
    
    inline def apply(
      onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
      onMouseEnter: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
      onMouseLeave: /* event */ ReactMouseEventFrom[HTMLElement] => Callback
    ): ReadonlyHoverModeEventHan = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onClick(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onMouseLeave(t0).runNow()))
      __obj.asInstanceOf[ReadonlyHoverModeEventHan]
    }
    
    extension [Self <: ReadonlyHoverModeEventHan](x: Self) {
      
      inline def setOnClick(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnMouseEnter(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    }
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/hover/useHoverMode.HoverModeHoverEventHandlers> */
  trait ReadonlyHoverModeHoverEve extends StObject {
    
    val onMouseEnter: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
    
    val onMouseLeave: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
  }
  object ReadonlyHoverModeHoverEve {
    
    inline def apply(
      onMouseEnter: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
      onMouseLeave: /* event */ ReactMouseEventFrom[HTMLElement] => Callback
    ): ReadonlyHoverModeHoverEve = {
      val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onMouseLeave(t0).runNow()))
      __obj.asInstanceOf[ReadonlyHoverModeHoverEve]
    }
    
    extension [Self <: ReadonlyHoverModeHoverEve](x: Self) {
      
      inline def setOnMouseEnter(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    }
  }
  
  /* Inlined std.Readonly<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardFocusContext> */
  trait ReadonlyKeyboardFocusCont extends StObject {
    
    val attach: js.Function1[/* element */ HTMLElement, Unit]
    
    val config: NonNullRef[KeyboardMovementConfig]
    
    val detach: js.Function1[/* element */ HTMLElement, Unit]
    
    val horizontal: Boolean
    
    val includeDisabled: Boolean
    
    val loopable: Boolean
    
    val searchable: Boolean
    
    val watching: KeyboardFocusElementLookup
  }
  object ReadonlyKeyboardFocusCont {
    
    inline def apply(
      attach: /* element */ HTMLElement => Callback,
      config: NonNullRef[KeyboardMovementConfig],
      detach: /* element */ HTMLElement => Callback,
      horizontal: Boolean,
      includeDisabled: Boolean,
      loopable: Boolean,
      searchable: Boolean,
      watching: KeyboardFocusElementLookup
    ): ReadonlyKeyboardFocusCont = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1((t0: /* element */ HTMLElement) => attach(t0).runNow()), config = config.asInstanceOf[js.Any], detach = js.Any.fromFunction1((t0: /* element */ HTMLElement) => detach(t0).runNow()), horizontal = horizontal.asInstanceOf[js.Any], includeDisabled = includeDisabled.asInstanceOf[js.Any], loopable = loopable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyKeyboardFocusCont]
    }
    
    extension [Self <: ReadonlyKeyboardFocusCont](x: Self) {
      
      inline def setAttach(value: /* element */ HTMLElement => Callback): Self = StObject.set(x, "attach", js.Any.fromFunction1((t0: /* element */ HTMLElement) => value(t0).runNow()))
      
      inline def setConfig(value: NonNullRef[KeyboardMovementConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDetach(value: /* element */ HTMLElement => Callback): Self = StObject.set(x, "detach", js.Any.fromFunction1((t0: /* element */ HTMLElement) => value(t0).runNow()))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
      
      inline def setLoopable(value: Boolean): Self = StObject.set(x, "loopable", value.asInstanceOf[js.Any])
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setWatching(value: KeyboardFocusElementLookup): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref[E /* <: HTMLElement */] extends StObject {
    
    /**
      * An optional ref that can be applied.
      */
    var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[E]] = js.undefined
  }
  object Ref {
    
    inline def apply[E /* <: HTMLElement */](): Ref[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[E]]
    }
    
    extension [Self <: Ref[?], E /* <: HTMLElement */](x: Self & Ref[E]) {
      
      inline def setRef(value: typingsJapgolly.react.mod.Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
