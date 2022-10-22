package typingsJapgolly.fluentuiReactFocus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusInts.`0`
import typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusInts.`1`
import typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusInts.`2`
import typingsJapgolly.fluentuiUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.fluentuiUtilities.libPointMod.Point
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFocusZoneFocusZoneDottypesMod {
  
  @js.native
  sealed trait FocusZoneDirection extends StObject
  @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone.types", "FocusZoneDirection")
  @js.native
  object FocusZoneDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FocusZoneDirection & Double] = js.native
    
    /** React to all arrows. */
    @js.native
    sealed trait bidirectional
      extends StObject
         with FocusZoneDirection
    /* 2 */ val bidirectional: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.bidirectional & Double = js.native
    
    /**
      * React to all arrows. Navigate next item in DOM on right/down arrow keys and previous - left/up arrow keys.
      * Right and Left arrow keys are swapped in RTL mode.
      */
    @js.native
    sealed trait domOrder
      extends StObject
         with FocusZoneDirection
    /* 3 */ val domOrder: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.domOrder & Double = js.native
    
    /** Only react to left/right arrows. */
    @js.native
    sealed trait horizontal
      extends StObject
         with FocusZoneDirection
    /* 1 */ val horizontal: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.horizontal & Double = js.native
    
    /** Only react to up/down arrows. */
    @js.native
    sealed trait vertical
      extends StObject
         with FocusZoneDirection
    /* 0 */ val vertical: typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.vertical & Double = js.native
  }
  
  /* Inlined {  none :0,   all :1,   inputOnly :2}[keyof {  none :0,   all :1,   inputOnly :2}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusInts.`0`
    - typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusInts.`1`
    - typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusInts.`2`
  */
  trait FocusZoneTabbableElements extends StObject
  object FocusZoneTabbableElements {
    
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone.types", "FocusZoneTabbableElements")
    @js.native
    val ^ : js.Any = js.native
    
    /** All tabbing action is allowed */
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone.types", "FocusZoneTabbableElements.all")
    @js.native
    def all: `1` = js.native
    inline def all_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** Tabbing is allowed only on input elements */
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone.types", "FocusZoneTabbableElements.inputOnly")
    @js.native
    def inputOnly: `2` = js.native
    inline def inputOnly_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputOnly")(x.asInstanceOf[js.Any])
    
    /** Tabbing is not allowed */
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone.types", "FocusZoneTabbableElements.none")
    @js.native
    def none: `0` = js.native
    inline def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IFocusZone extends StObject {
    
    /**
      * Sets focus to the first tabbable item in the zone.
      * @param forceIntoFirstElement - If true, focus will be forced into the first element, even
      * if focus is already in the focus zone.
      * @param bypassHiddenElements - If true, focus will be not be set on hidden elements.
      * @returns True if focus could be set to an active element, false if no operation was taken.
      */
    def focus(): Boolean = js.native
    def focus(forceIntoFirstElement: Boolean): Boolean = js.native
    def focus(forceIntoFirstElement: Boolean, bypassHiddenElements: Boolean): Boolean = js.native
    def focus(forceIntoFirstElement: Unit, bypassHiddenElements: Boolean): Boolean = js.native
    
    /**
      * Sets focus to a specific child element within the zone. This can be used in conjunction with
      * shouldReceiveFocus to create delayed focus scenarios (like animate the scroll position to the correct
      * location and then focus.)
      * @param childElement - The child element within the zone to focus.
      * @param forceAlignment - If true, focus alignment will be set according to the element provided.
      * @returns True if focus could be set to an active element, false if no operation was taken.
      */
    def focusElement(): Boolean = js.native
    def focusElement(childElement: HTMLElement): Boolean = js.native
    def focusElement(childElement: HTMLElement, forceAlignment: Boolean): Boolean = js.native
    def focusElement(childElement: Unit, forceAlignment: Boolean): Boolean = js.native
    
    /**
      * Sets focus to the last tabbable item in the zone.
      * @returns True if focus could be set to an active element, false if no operation was taken.
      */
    def focusLast(): Boolean = js.native
    
    /**
      * Forces horizontal alignment in the context of vertical arrowing to use specific point as the reference, rather
      * than a center based on the last horizontal motion.
      * @param point - the new reference point.
      */
    def setFocusAlignment(point: Point): Unit = js.native
  }
  
  trait IFocusZoneProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /** Allows focus to park on root when focus is in the `FocusZone` at render time. */
    var allowFocusRoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows tab key to be handled to tab through a list of items in the focus zone,
      * an unfortunate side effect is that users will not be able to tab out of the focus zone
      * and have to hit escape or some other key.
      * @deprecated Use `handleTabKey` instead.
      *
      */
    var allowTabKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the aria-describedby attribute.
      * @deprecated Directly use the `aria-describedby` attribute instead
      */
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the aria-labelledby attribute.
      * @deprecated Directly use the `aria-labelledby` attribute instead
      */
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * A component that should be used as the root element of the FocusZone component.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Determines whether to check for data-no-horizontal-wrap or data-no-vertical-wrap attributes
      * when determining how to move focus
      * @defaultvalue false
      */
    var checkForNoWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional callback to access the IFocusZone interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IFocusZone]] = js.undefined
    
    /**
      * Optionally provide a selector for identifying the initial active element.
      * @deprecated Use `defaultTabbableElement` instead.
      */
    var defaultActiveElement: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally defines the initial tabbable element inside the FocusZone.
      * If a string is passed then it is treated as a selector for identifying the initial tabbable element.
      * If a function is passed then it uses the root element as a parameter to return the initial tabbable element.
      */
    var defaultTabbableElement: js.UndefOr[String | (js.Function1[/* root */ HTMLElement, HTMLElement])] = js.undefined
    
    /**
      * Defines which arrows to react to.
      * @defaultvalue FocusZoneDirection.bidirectional
      */
    var direction: js.UndefOr[FocusZoneDirection] = js.undefined
    
    /**
      * If set, the FocusZone will not be tabbable and keyboard navigation will be disabled.
      * This does not affect disabled attribute of any child.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the FocusZone should allow focus events to propagate past the FocusZone.
      * @deprecated Use `stopFocusPropagation` instead.
      */
    var doNotAllowFocusEventToPropagate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional callback to access the root DOM element.
      * @deprecated Temporary solution which will be replaced with ref in the V8 release.
      */
    var elementRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    /**
      * Element type the root element will use. Default is "div".
      * @deprecated Use `as` instead.
      */
    var elementType: js.UndefOr[Any] = js.undefined
    
    /**
      * Allows tab key to be handled to tab through a list of items in the focus zone,
      * an unfortunate side effect is that users will not be able to tab out of the focus zone
      * and have to hit escape or some other key.
      */
    var handleTabKey: js.UndefOr[FocusZoneTabbableElements] = js.undefined
    
    /**
      * If set, will cycle to the beginning of the targets once the user navigates to the
      * next target while at the end, and to the end when navigate to the previous at the beginning.
      */
    var isCircularNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If provided, this callback will be executed on keypresses to determine if the user
      * intends to navigate into the inner zone. Returning true will ask the first inner zone to
      * set focus.
      * @deprecated Use `shouldEnterInnerZone` instead.
      */
    var isInnerZoneKeystroke: js.UndefOr[js.Function1[/* ev */ ReactKeyboardEventFrom[HTMLElement], Boolean]] = js.undefined
    
    /**
      * Callback for when one of immediate children elements gets active by getting focused
      * or by having one of its respective children elements focused.
      */
    var onActiveElementChanged: js.UndefOr[
        js.Function2[
          /* element */ js.UndefOr[HTMLElement], 
          /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Callback method for determining if focus should indeed be set on the given element.
      * @param element - The child element within the zone to focus.
      * @returns True if focus should be set to the given element, false to avoid setting focus.
      * @deprecated Use `shouldReceiveFocus` instead.
      */
    var onBeforeFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.undefined
    
    /**
      * Callback to notify creators that focus has been set on the FocusZone
      * @deprecated Use `onFocus` instead.
      */
    var onFocusNotification: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback called when "focus" event triggered in FocusZone.
      * @param event - React's original FocusEvent.
      */
    @JSName("onFocus")
    var onFocus_IFocusZoneProps: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], Unit]] = js.undefined
    
    /**
      * Determines whether to disable the paging support for Page Up and Page Down keyboard scenarios.
      * @defaultvalue false
      */
    var pagingSupportDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, FocusZone prevents the default behavior of Keyboard events when changing focus between elements.
      * @defaultvalue false
      */
    var preventDefaultWhenHandled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, prevents the FocusZone from attempting to restore the focus to the inner element when the focus is on the
      * root element after componentDidUpdate.
      * @defaultvalue false
      */
    var preventFocusRestoration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Div props provided to the FocusZone will be mixed into the root element.
      * Deprecated at v1.12.1.
      */
    var rootProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Callback function that will be executed on keypresses to determine if the user intends to navigate into
      * the inner (nested) zone. Returning true will ask the first inner zone to set focus.
      */
    var shouldEnterInnerZone: js.UndefOr[js.Function1[/* ev */ ReactKeyboardEventFrom[HTMLElement], Boolean]] = js.undefined
    
    /**
      * If true and FocusZone's root element (container) receives focus, the focus will land either on the
      * defaultTabbableElement (if set) or on the first tabbable element of this FocusZone.
      * Usually a case for nested focus zones, when the nested focus zone's container is a focusable element.
      */
    var shouldFocusInnerElementWhenReceivedFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines if a default tabbable element should be force focused on FocusZone mount.
      * @default false
      */
    var shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback method to determine if an input or textarea element should lose focus on arrow keys
      *  @param inputElement - The input or textarea element which is to lose focus.
      *  @returns True if input element should loose focus or false otherwise.
      */
    var shouldInputLoseFocusOnArrowKey: js.UndefOr[js.Function1[/* inputElement */ HTMLInputElement | HTMLTextAreaElement, Boolean]] = js.undefined
    
    /**
      * Determines whether the FocusZone will walk up the DOM trying to invoke click callbacks on focusable elements on
      * Enter and Space keydowns to ensure accessibility for tags that don't guarantee this behavior.
      * @defaultvalue true
      */
    var shouldRaiseClicks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Relates to `shouldRaiseClicks`.
      * Allows the click event raising for the "Enter" key to be set independently from `shouldRaiseClicks`.
      * Inherits the value of `shouldRaiseClicks` if not set explicitly.
      */
    var shouldRaiseClicksOnEnter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Relates to `shouldRaiseClicks`.
      * Allows the click event raising for the "Space" key to be set independently from `shouldRaiseClicks`.
      * Inherits the value of `shouldRaiseClicks` if not set explicitly.
      */
    var shouldRaiseClicksOnSpace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback method for determining if focus should indeed be set on the given element.
      * @param element - The child element within the zone to focus.
      * @returns True if focus should be set to the given element, false to avoid setting focus.
      */
    var shouldReceiveFocus: js.UndefOr[js.Function1[/* childElement */ js.UndefOr[HTMLElement], Boolean]] = js.undefined
    
    /**
      * If true and TAB key is not handled by FocusZone, resets current active element to null value.
      * For example, when roving index is not desirable and focus should always reset to the default tabbable element.
      */
    var shouldResetActiveElementWhenTabFromZone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the FocusZone should allow focus events to propagate past the FocusZone.
      */
    var stopFocusPropagation: js.UndefOr[Boolean] = js.undefined
  }
  object IFocusZoneProps {
    
    inline def apply(): IFocusZoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFocusZoneProps]
    }
    
    extension [Self <: IFocusZoneProps](x: Self) {
      
      inline def setAllowFocusRoot(value: Boolean): Self = StObject.set(x, "allowFocusRoot", value.asInstanceOf[js.Any])
      
      inline def setAllowFocusRootUndefined: Self = StObject.set(x, "allowFocusRoot", js.undefined)
      
      inline def setAllowTabKey(value: Boolean): Self = StObject.set(x, "allowTabKey", value.asInstanceOf[js.Any])
      
      inline def setAllowTabKeyUndefined: Self = StObject.set(x, "allowTabKey", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCheckForNoWrap(value: Boolean): Self = StObject.set(x, "checkForNoWrap", value.asInstanceOf[js.Any])
      
      inline def setCheckForNoWrapUndefined: Self = StObject.set(x, "checkForNoWrap", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IFocusZone]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IFocusZone | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IFocusZone | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDefaultActiveElement(value: String): Self = StObject.set(x, "defaultActiveElement", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveElementUndefined: Self = StObject.set(x, "defaultActiveElement", js.undefined)
      
      inline def setDefaultTabbableElement(value: String | (js.Function1[/* root */ HTMLElement, HTMLElement])): Self = StObject.set(x, "defaultTabbableElement", value.asInstanceOf[js.Any])
      
      inline def setDefaultTabbableElementFunction1(value: /* root */ HTMLElement => HTMLElement): Self = StObject.set(x, "defaultTabbableElement", js.Any.fromFunction1(value))
      
      inline def setDefaultTabbableElementUndefined: Self = StObject.set(x, "defaultTabbableElement", js.undefined)
      
      inline def setDirection(value: FocusZoneDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDoNotAllowFocusEventToPropagate(value: Boolean): Self = StObject.set(x, "doNotAllowFocusEventToPropagate", value.asInstanceOf[js.Any])
      
      inline def setDoNotAllowFocusEventToPropagateUndefined: Self = StObject.set(x, "doNotAllowFocusEventToPropagate", js.undefined)
      
      inline def setElementRef(value: Ref[HTMLElement]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      inline def setElementRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "elementRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      inline def setElementType(value: Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setHandleTabKey(value: FocusZoneTabbableElements): Self = StObject.set(x, "handleTabKey", value.asInstanceOf[js.Any])
      
      inline def setHandleTabKeyUndefined: Self = StObject.set(x, "handleTabKey", js.undefined)
      
      inline def setIsCircularNavigation(value: Boolean): Self = StObject.set(x, "isCircularNavigation", value.asInstanceOf[js.Any])
      
      inline def setIsCircularNavigationUndefined: Self = StObject.set(x, "isCircularNavigation", js.undefined)
      
      inline def setIsInnerZoneKeystroke(value: /* ev */ ReactKeyboardEventFrom[HTMLElement] => Boolean): Self = StObject.set(x, "isInnerZoneKeystroke", js.Any.fromFunction1(value))
      
      inline def setIsInnerZoneKeystrokeUndefined: Self = StObject.set(x, "isInnerZoneKeystroke", js.undefined)
      
      inline def setOnActiveElementChanged(
        value: (/* element */ js.UndefOr[HTMLElement], /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]]) => Callback
      ): Self = StObject.set(x, "onActiveElementChanged", js.Any.fromFunction2((t0: /* element */ js.UndefOr[HTMLElement], t1: /* ev */ js.UndefOr[ReactFocusEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnActiveElementChangedUndefined: Self = StObject.set(x, "onActiveElementChanged", js.undefined)
      
      inline def setOnBeforeFocus(value: /* childElement */ js.UndefOr[HTMLElement] => Boolean): Self = StObject.set(x, "onBeforeFocus", js.Any.fromFunction1(value))
      
      inline def setOnBeforeFocusUndefined: Self = StObject.set(x, "onBeforeFocus", js.undefined)
      
      inline def setOnFocus(value: /* event */ ReactFocusEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnFocusNotification(value: Callback): Self = StObject.set(x, "onFocusNotification", value.toJsFn)
      
      inline def setOnFocusNotificationUndefined: Self = StObject.set(x, "onFocusNotification", js.undefined)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setPagingSupportDisabled(value: Boolean): Self = StObject.set(x, "pagingSupportDisabled", value.asInstanceOf[js.Any])
      
      inline def setPagingSupportDisabledUndefined: Self = StObject.set(x, "pagingSupportDisabled", js.undefined)
      
      inline def setPreventDefaultWhenHandled(value: Boolean): Self = StObject.set(x, "preventDefaultWhenHandled", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultWhenHandledUndefined: Self = StObject.set(x, "preventDefaultWhenHandled", js.undefined)
      
      inline def setPreventFocusRestoration(value: Boolean): Self = StObject.set(x, "preventFocusRestoration", value.asInstanceOf[js.Any])
      
      inline def setPreventFocusRestorationUndefined: Self = StObject.set(x, "preventFocusRestoration", js.undefined)
      
      inline def setRootProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
      
      inline def setRootPropsUndefined: Self = StObject.set(x, "rootProps", js.undefined)
      
      inline def setShouldEnterInnerZone(value: /* ev */ ReactKeyboardEventFrom[HTMLElement] => Boolean): Self = StObject.set(x, "shouldEnterInnerZone", js.Any.fromFunction1(value))
      
      inline def setShouldEnterInnerZoneUndefined: Self = StObject.set(x, "shouldEnterInnerZone", js.undefined)
      
      inline def setShouldFocusInnerElementWhenReceivedFocus(value: Boolean): Self = StObject.set(x, "shouldFocusInnerElementWhenReceivedFocus", value.asInstanceOf[js.Any])
      
      inline def setShouldFocusInnerElementWhenReceivedFocusUndefined: Self = StObject.set(x, "shouldFocusInnerElementWhenReceivedFocus", js.undefined)
      
      inline def setShouldFocusOnMount(value: Boolean): Self = StObject.set(x, "shouldFocusOnMount", value.asInstanceOf[js.Any])
      
      inline def setShouldFocusOnMountUndefined: Self = StObject.set(x, "shouldFocusOnMount", js.undefined)
      
      inline def setShouldInputLoseFocusOnArrowKey(value: /* inputElement */ HTMLInputElement | HTMLTextAreaElement => Boolean): Self = StObject.set(x, "shouldInputLoseFocusOnArrowKey", js.Any.fromFunction1(value))
      
      inline def setShouldInputLoseFocusOnArrowKeyUndefined: Self = StObject.set(x, "shouldInputLoseFocusOnArrowKey", js.undefined)
      
      inline def setShouldRaiseClicks(value: Boolean): Self = StObject.set(x, "shouldRaiseClicks", value.asInstanceOf[js.Any])
      
      inline def setShouldRaiseClicksOnEnter(value: Boolean): Self = StObject.set(x, "shouldRaiseClicksOnEnter", value.asInstanceOf[js.Any])
      
      inline def setShouldRaiseClicksOnEnterUndefined: Self = StObject.set(x, "shouldRaiseClicksOnEnter", js.undefined)
      
      inline def setShouldRaiseClicksOnSpace(value: Boolean): Self = StObject.set(x, "shouldRaiseClicksOnSpace", value.asInstanceOf[js.Any])
      
      inline def setShouldRaiseClicksOnSpaceUndefined: Self = StObject.set(x, "shouldRaiseClicksOnSpace", js.undefined)
      
      inline def setShouldRaiseClicksUndefined: Self = StObject.set(x, "shouldRaiseClicks", js.undefined)
      
      inline def setShouldReceiveFocus(value: /* childElement */ js.UndefOr[HTMLElement] => Boolean): Self = StObject.set(x, "shouldReceiveFocus", js.Any.fromFunction1(value))
      
      inline def setShouldReceiveFocusUndefined: Self = StObject.set(x, "shouldReceiveFocus", js.undefined)
      
      inline def setShouldResetActiveElementWhenTabFromZone(value: Boolean): Self = StObject.set(x, "shouldResetActiveElementWhenTabFromZone", value.asInstanceOf[js.Any])
      
      inline def setShouldResetActiveElementWhenTabFromZoneUndefined: Self = StObject.set(x, "shouldResetActiveElementWhenTabFromZone", js.undefined)
      
      inline def setStopFocusPropagation(value: Boolean): Self = StObject.set(x, "stopFocusPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopFocusPropagationUndefined: Self = StObject.set(x, "stopFocusPropagation", js.undefined)
    }
  }
}
