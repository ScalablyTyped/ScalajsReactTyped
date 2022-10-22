package typingsJapgolly.reactour

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MutationObserver
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactour.reactourStrings.div
import typingsJapgolly.reactour.reactourStrings.esc
import typingsJapgolly.reactour.reactourStrings.left
import typingsJapgolly.reactour.reactourStrings.nav
import typingsJapgolly.reactour.reactourStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactour", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reactour", JSImport.Default)
  @js.native
  open class default () extends Component[ReactourProps, ReactourState, Any]
  
  inline def Arrow(props: ArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Arrow")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("reactour", "Badge")
  @js.native
  val Badge: FC[BadgeProps] = js.native
  
  inline def Close(props: CloseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Close")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("reactour", "Controls")
  @js.native
  val Controls: FC[ControlsProps] = js.native
  
  @JSImport("reactour", "Dot")
  @js.native
  val Dot: FC[DotProps] = js.native
  
  @JSImport("reactour", "Navigation")
  @js.native
  val Navigation: FC[NavigationProps] = js.native
  
  trait ArrowProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var onClick: MouseEventHandler[HTMLButtonElement]
  }
  object ArrowProps {
    
    inline def apply(onClick: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): ArrowProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => onClick(t0).runNow()))
      __obj.asInstanceOf[ArrowProps]
    }
    
    extension [Self <: ArrowProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'span' extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<'span'>> : react.react.PropsWithRef<react.react.ComponentProps<'span'>> */ trait BadgeProps extends StObject {
    
    var accentColor: js.UndefOr[String] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
    }
  }
  
  trait CloseProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: MouseEventHandler[HTMLButtonElement]
  }
  object CloseProps {
    
    inline def apply(onClick: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): CloseProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => onClick(t0).runNow()))
      __obj.asInstanceOf[CloseProps]
    }
    
    extension [Self <: CloseProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
  
  type ControlsProps = ComponentPropsWithRef[div]
  
  trait CustomHelperProps extends StObject {
    
    def close(): Unit
    
    var content: Node | (js.Function1[/* args */ ReactourStepContentArgs, Node])
    
    var current: Double
    
    def gotoStep(step: Double): Unit
    
    var totalSteps: Double
  }
  object CustomHelperProps {
    
    inline def apply(close: Callback, current: Double, gotoStep: Double => Callback, totalSteps: Double): CustomHelperProps = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, current = current.asInstanceOf[js.Any], gotoStep = js.Any.fromFunction1((t0: Double) => gotoStep(t0).runNow()), totalSteps = totalSteps.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[CustomHelperProps]
    }
    
    extension [Self <: CustomHelperProps](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setContent(value: Node | (js.Function1[/* args */ ReactourStepContentArgs, Node])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* args */ ReactourStepContentArgs => Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setGotoStep(value: Double => Callback): Self = StObject.set(x, "gotoStep", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'button' extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<'button'>> : react.react.PropsWithRef<react.react.ComponentProps<'button'>> */ trait DotProps extends StObject {
    
    var accentColor: js.UndefOr[String] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var showNumber: js.UndefOr[Boolean] = js.undefined
  }
  object DotProps {
    
    inline def apply(): DotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotProps]
    }
    
    extension [Self <: DotProps](x: Self) {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
      
      inline def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
    }
  }
  
  type NavigationProps = ComponentPropsWithRef[nav]
  
  trait ReactourAccessibilityOptions extends StObject {
    
    // attribute to associate the dialog with a title for screen readers
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    // aria-label attribute for the close button
    var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    // Show/Hide Navigation Dots for screen reader software
    var showNavigationScreenReaders: js.UndefOr[Boolean] = js.undefined
  }
  object ReactourAccessibilityOptions {
    
    inline def apply(): ReactourAccessibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactourAccessibilityOptions]
    }
    
    extension [Self <: ReactourAccessibilityOptions](x: Self) {
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      inline def setShowNavigationScreenReaders(value: Boolean): Self = StObject.set(x, "showNavigationScreenReaders", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationScreenReadersUndefined: Self = StObject.set(x, "showNavigationScreenReaders", js.undefined)
    }
  }
  
  trait ReactourProps extends StObject {
    
    /**
      * CustomHelper component
      */
    var CustomHelper: js.UndefOr[js.Function1[/* hasProps */ CustomHelperProps, Element]] = js.undefined
    
    /**
      * Change `--reactour-accent` _(defaults to accentColor on IE)_ css custom prop to apply color in _Helper_, number, dots, etc
      * @default #007aff
      */
    var accentColor: js.UndefOr[String] = js.undefined
    
    /**
      * Configure accessibility related accessibility options
      */
    var accessibilityOptions: js.UndefOr[ReactourAccessibilityOptions] = js.undefined
    
    /**
      * Customize _Badge_ content using `current` and `total` steps values
      */
    var badgeContent: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, Node]] = js.undefined
    
    /**
      * Content to be rendered inside the _Helper_
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Custom class name to add to the _Helper_
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Close the _Tour_ by clicking the _Mask_
      * @default true
      */
    var closeWithMask: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable interactivity with _Dots_ navigation in _Helper_
      */
    var disableDotsNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable FocusLock component
      * @default false
      */
    var disableFocusLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable the ability to click or intercat in any way with the _Highlighted_ element
      */
    var disableInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable all keyboard navigation (next and prev step) when true, disable only selected keys when array
      */
    var disableKeyboardNavigation: js.UndefOr[Boolean | (js.Array[esc | right | left])] = js.undefined
    
    /**
      * Function triggered each time current step change
      */
    var getCurrentStep: js.UndefOr[js.Function1[/* currentStep */ Double, Unit]] = js.undefined
    
    /**
      * Programmatically change current step after the first render, when the value changes
      */
    var goToStep: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom class name to add to the element which is the overlay for the target element when `disableInteraction`
      */
    var highlightedMaskClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Tolerance in pixels to add when calculating if an element is outside viewport to scroll into view
      */
    var inViewThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * You know…
      */
    var isOpen: Boolean
    
    /**
      * Change Next button in last step into a custom button to close the Tour
      */
    var lastStepNextButton: js.UndefOr[Node] = js.undefined
    
    /**
      * Custom class name to add to the _Mask_
      */
    var maskClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Extra Space between in pixels between _Highlighted_ element and _Mask_
      */
    var maskSpace: js.UndefOr[Double] = js.undefined
    
    /**
      * Renders as next button navigation
      */
    var nextButton: js.UndefOr[Node] = js.undefined
    
    /**
      * Overrides default `nextStep` internal function
      */
    var nextStep: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Do something after _Tour_ is opened
      */
    var onAfterOpen: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.undefined
    
    /**
      * Do something before _Tour_ is closed
      */
    var onBeforeClose: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.undefined
    
    /**
      * Function to close the _Tour_
      */
    def onRequestClose(event: ReactMouseEventFrom[HTMLDivElement]): Unit
    
    /**
      * Renders as prev button navigation
      */
    var prevButton: js.UndefOr[Node] = js.undefined
    
    /**
      * Overrides default `prevStep` internal function
      */
    var prevStep: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Beautify _Helper_ and _Mask_ with `border-radius` (in px)
      * @default 0
      */
    var rounded: js.UndefOr[Double] = js.undefined
    
    /**
      * Smooth scroll duration when positioning the target element (in ms)
      * @default 1
      */
    var scrollDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Offset when positioning the target element after scroll to it, by default it's a calculation to the center of the viewport
      */
    var scrollOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Show/Hide _Helper_ Navigation buttons
      * @default true
      */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide _Helper_ Close button
      * @default true
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide _Helper_ Navigation Dots
      * @default true
      */
    var showNavigation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide number when hovers on each Navigation Dot
      * @default true
      */
    var showNavigationNumber: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show/Hide _Helper_ Number Badge
      * @default true
      */
    var showNumber: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Starting step when _Tour_ is open the first time
      */
    var startAt: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of elements to highlight with special info and props
      */
    var steps: js.Array[ReactourStep]
    
    /**
      * Value to listen if a forced update is needed
      */
    var update: js.UndefOr[String] = js.undefined
    
    /**
      * Delay time when forcing update. Useful when there are known animation/transitions
      * @default 1
      */
    var updateDelay: js.UndefOr[Double] = js.undefined
  }
  object ReactourProps {
    
    inline def apply(
      isOpen: Boolean,
      onRequestClose: ReactMouseEventFrom[HTMLDivElement] => Callback,
      steps: js.Array[ReactourStep]
    ): ReactourProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement]) => onRequestClose(t0).runNow()), steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactourProps]
    }
    
    extension [Self <: ReactourProps](x: Self) {
      
      inline def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      inline def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      inline def setAccessibilityOptions(value: ReactourAccessibilityOptions): Self = StObject.set(x, "accessibilityOptions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityOptionsUndefined: Self = StObject.set(x, "accessibilityOptions", js.undefined)
      
      inline def setBadgeContent(value: (/* current */ Double, /* total */ Double) => Node): Self = StObject.set(x, "badgeContent", js.Any.fromFunction2(value))
      
      inline def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseWithMask(value: Boolean): Self = StObject.set(x, "closeWithMask", value.asInstanceOf[js.Any])
      
      inline def setCloseWithMaskUndefined: Self = StObject.set(x, "closeWithMask", js.undefined)
      
      inline def setCustomHelper(value: /* hasProps */ CustomHelperProps => Element): Self = StObject.set(x, "CustomHelper", js.Any.fromFunction1(value))
      
      inline def setCustomHelperUndefined: Self = StObject.set(x, "CustomHelper", js.undefined)
      
      inline def setDisableDotsNavigation(value: Boolean): Self = StObject.set(x, "disableDotsNavigation", value.asInstanceOf[js.Any])
      
      inline def setDisableDotsNavigationUndefined: Self = StObject.set(x, "disableDotsNavigation", js.undefined)
      
      inline def setDisableFocusLock(value: Boolean): Self = StObject.set(x, "disableFocusLock", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusLockUndefined: Self = StObject.set(x, "disableFocusLock", js.undefined)
      
      inline def setDisableInteraction(value: Boolean): Self = StObject.set(x, "disableInteraction", value.asInstanceOf[js.Any])
      
      inline def setDisableInteractionUndefined: Self = StObject.set(x, "disableInteraction", js.undefined)
      
      inline def setDisableKeyboardNavigation(value: Boolean | (js.Array[esc | right | left])): Self = StObject.set(x, "disableKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setDisableKeyboardNavigationUndefined: Self = StObject.set(x, "disableKeyboardNavigation", js.undefined)
      
      inline def setDisableKeyboardNavigationVarargs(value: (esc | right | left)*): Self = StObject.set(x, "disableKeyboardNavigation", js.Array(value*))
      
      inline def setGetCurrentStep(value: /* currentStep */ Double => Callback): Self = StObject.set(x, "getCurrentStep", js.Any.fromFunction1((t0: /* currentStep */ Double) => value(t0).runNow()))
      
      inline def setGetCurrentStepUndefined: Self = StObject.set(x, "getCurrentStep", js.undefined)
      
      inline def setGoToStep(value: Double): Self = StObject.set(x, "goToStep", value.asInstanceOf[js.Any])
      
      inline def setGoToStepUndefined: Self = StObject.set(x, "goToStep", js.undefined)
      
      inline def setHighlightedMaskClassName(value: String): Self = StObject.set(x, "highlightedMaskClassName", value.asInstanceOf[js.Any])
      
      inline def setHighlightedMaskClassNameUndefined: Self = StObject.set(x, "highlightedMaskClassName", js.undefined)
      
      inline def setInViewThreshold(value: Double): Self = StObject.set(x, "inViewThreshold", value.asInstanceOf[js.Any])
      
      inline def setInViewThresholdUndefined: Self = StObject.set(x, "inViewThreshold", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setLastStepNextButton(value: VdomNode): Self = StObject.set(x, "lastStepNextButton", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLastStepNextButtonNull: Self = StObject.set(x, "lastStepNextButton", null)
      
      inline def setLastStepNextButtonUndefined: Self = StObject.set(x, "lastStepNextButton", js.undefined)
      
      inline def setLastStepNextButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "lastStepNextButton", js.Array(value*))
      
      inline def setLastStepNextButtonVdomElement(value: VdomElement): Self = StObject.set(x, "lastStepNextButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskSpace(value: Double): Self = StObject.set(x, "maskSpace", value.asInstanceOf[js.Any])
      
      inline def setMaskSpaceUndefined: Self = StObject.set(x, "maskSpace", js.undefined)
      
      inline def setNextButton(value: VdomNode): Self = StObject.set(x, "nextButton", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNextButtonNull: Self = StObject.set(x, "nextButton", null)
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setNextButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "nextButton", js.Array(value*))
      
      inline def setNextButtonVdomElement(value: VdomElement): Self = StObject.set(x, "nextButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNextStep(value: Callback): Self = StObject.set(x, "nextStep", value.toJsFn)
      
      inline def setNextStepUndefined: Self = StObject.set(x, "nextStep", js.undefined)
      
      inline def setOnAfterOpen(value: /* target */ HTMLDivElement => Callback): Self = StObject.set(x, "onAfterOpen", js.Any.fromFunction1((t0: /* target */ HTMLDivElement) => value(t0).runNow()))
      
      inline def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      inline def setOnBeforeClose(value: /* target */ HTMLDivElement => Callback): Self = StObject.set(x, "onBeforeClose", js.Any.fromFunction1((t0: /* target */ HTMLDivElement) => value(t0).runNow()))
      
      inline def setOnBeforeCloseUndefined: Self = StObject.set(x, "onBeforeClose", js.undefined)
      
      inline def setOnRequestClose(value: ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setPrevButton(value: VdomNode): Self = StObject.set(x, "prevButton", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrevButtonNull: Self = StObject.set(x, "prevButton", null)
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      inline def setPrevButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prevButton", js.Array(value*))
      
      inline def setPrevButtonVdomElement(value: VdomElement): Self = StObject.set(x, "prevButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrevStep(value: Callback): Self = StObject.set(x, "prevStep", value.toJsFn)
      
      inline def setPrevStepUndefined: Self = StObject.set(x, "prevStep", js.undefined)
      
      inline def setRounded(value: Double): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
      
      inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationNumber(value: Boolean): Self = StObject.set(x, "showNavigationNumber", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationNumberUndefined: Self = StObject.set(x, "showNavigationNumber", js.undefined)
      
      inline def setShowNavigationUndefined: Self = StObject.set(x, "showNavigation", js.undefined)
      
      inline def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
      
      inline def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setSteps(value: js.Array[ReactourStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: ReactourStep*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
      
      inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait ReactourState extends StObject {
    
    var bottom: Double
    
    var current: Double
    
    var focusUnlocked: Boolean
    
    var h: Double
    
    var height: Double
    
    var helperHeight: js.UndefOr[Double] = js.undefined
    
    var helperPosition: js.UndefOr[ReactourStepPosition] = js.undefined
    
    var helperWidth: js.UndefOr[Double] = js.undefined
    
    var inDOM: Boolean
    
    var isOpen: Boolean
    
    var left: Double
    
    var observer: MutationObserver | Null
    
    var right: Double
    
    var top: Double
    
    var w: Double
    
    var width: Double
  }
  object ReactourState {
    
    inline def apply(
      bottom: Double,
      current: Double,
      focusUnlocked: Boolean,
      h: Double,
      height: Double,
      inDOM: Boolean,
      isOpen: Boolean,
      left: Double,
      right: Double,
      top: Double,
      w: Double,
      width: Double
    ): ReactourState = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], focusUnlocked = focusUnlocked.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inDOM = inDOM.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], observer = null)
      __obj.asInstanceOf[ReactourState]
    }
    
    extension [Self <: ReactourState](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setFocusUnlocked(value: Boolean): Self = StObject.set(x, "focusUnlocked", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHelperHeight(value: Double): Self = StObject.set(x, "helperHeight", value.asInstanceOf[js.Any])
      
      inline def setHelperHeightUndefined: Self = StObject.set(x, "helperHeight", js.undefined)
      
      inline def setHelperPosition(value: ReactourStepPosition): Self = StObject.set(x, "helperPosition", value.asInstanceOf[js.Any])
      
      inline def setHelperPositionUndefined: Self = StObject.set(x, "helperPosition", js.undefined)
      
      inline def setHelperWidth(value: Double): Self = StObject.set(x, "helperWidth", value.asInstanceOf[js.Any])
      
      inline def setHelperWidthUndefined: Self = StObject.set(x, "helperWidth", js.undefined)
      
      inline def setInDOM(value: Boolean): Self = StObject.set(x, "inDOM", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setObserver(value: MutationObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setObserverNull: Self = StObject.set(x, "observer", null)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactourStep extends StObject {
    
    /**
      * Action that can be executed on target element of the step
      */
    var action: js.UndefOr[js.Function1[/* domNode */ Any, Unit]] = js.undefined
    
    /**
      * Content of the step
      */
    var content: Node | (js.Function1[/* args */ ReactourStepContentArgs, Node])
    
    /**
      * Array of selectors, each selected node will be included (by union)
      * in the highlighted region of the mask. You don't need to add the
      * step selector here as the default highlighted region is focused on it
      */
    var highlightedSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Array of selectors, each selected node DOM addition/removal will triggered a rerender
      * of the mask shape. Useful in combinaison with highlightedSelectors when highlighted
      * region of mask should be redrawn after a user action
      */
    var mutationObservables: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Text read to screen reader software for this step's navigation dot
      */
    var navDotAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Observe direct children DOM mutations of this node
      * If a child is added: the highlighted region is redrawn focused on it
      * If a child is removed: the highlighted region is redrawn focused on the step selector
      */
    var observe: js.UndefOr[String] = js.undefined
    
    /**
      * Position of step content
      */
    var position: js.UndefOr[ReactourStepPosition | (js.Tuple2[Double, Double])] = js.undefined
    
    /**
      * Array of selectors, each selected node resize will triggered a rerender of the mask shape.
      * Useful in combinaison with highlightedSelectors when highlighted region of mask should
      * be redrawn after a user action. You should also add the selector in mutationObservables
      * if you want to track DOM addition/removal too
      */
    var resizeObservables: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * DOM selector to find the target element
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Disable interaction for this specific step.
      * Could be enabled passing `true`
      * when `disableInteraction` prop is present in Tour
      */
    var stepInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional styles
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReactourStep {
    
    inline def apply(): ReactourStep = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[ReactourStep]
    }
    
    extension [Self <: ReactourStep](x: Self) {
      
      inline def setAction(value: /* domNode */ Any => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: /* domNode */ Any) => value(t0).runNow()))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setContent(value: Node | (js.Function1[/* args */ ReactourStepContentArgs, Node])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* args */ ReactourStepContentArgs => Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHighlightedSelectors(value: js.Array[String]): Self = StObject.set(x, "highlightedSelectors", value.asInstanceOf[js.Any])
      
      inline def setHighlightedSelectorsUndefined: Self = StObject.set(x, "highlightedSelectors", js.undefined)
      
      inline def setHighlightedSelectorsVarargs(value: String*): Self = StObject.set(x, "highlightedSelectors", js.Array(value*))
      
      inline def setMutationObservables(value: js.Array[String]): Self = StObject.set(x, "mutationObservables", value.asInstanceOf[js.Any])
      
      inline def setMutationObservablesUndefined: Self = StObject.set(x, "mutationObservables", js.undefined)
      
      inline def setMutationObservablesVarargs(value: String*): Self = StObject.set(x, "mutationObservables", js.Array(value*))
      
      inline def setNavDotAriaLabel(value: String): Self = StObject.set(x, "navDotAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNavDotAriaLabelUndefined: Self = StObject.set(x, "navDotAriaLabel", js.undefined)
      
      inline def setObserve(value: String): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
      
      inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      inline def setPosition(value: ReactourStepPosition | (js.Tuple2[Double, Double])): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizeObservables(value: js.Array[String]): Self = StObject.set(x, "resizeObservables", value.asInstanceOf[js.Any])
      
      inline def setResizeObservablesUndefined: Self = StObject.set(x, "resizeObservables", js.undefined)
      
      inline def setResizeObservablesVarargs(value: String*): Self = StObject.set(x, "resizeObservables", js.Array(value*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setStepInteraction(value: Boolean): Self = StObject.set(x, "stepInteraction", value.asInstanceOf[js.Any])
      
      inline def setStepInteractionUndefined: Self = StObject.set(x, "stepInteraction", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ReactourStepContentArgs extends StObject {
    
    def close(): Unit
    
    def goTo(step: Double): Unit
    
    var inDOM: Boolean
    
    var step: Double
  }
  object ReactourStepContentArgs {
    
    inline def apply(close: Callback, goTo: Double => Callback, inDOM: Boolean, step: Double): ReactourStepContentArgs = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, goTo = js.Any.fromFunction1((t0: Double) => goTo(t0).runNow()), inDOM = inDOM.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactourStepContentArgs]
    }
    
    extension [Self <: ReactourStepContentArgs](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setGoTo(value: Double => Callback): Self = StObject.set(x, "goTo", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setInDOM(value: Boolean): Self = StObject.set(x, "inDOM", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactour.reactourStrings.top
    - typingsJapgolly.reactour.reactourStrings.right
    - typingsJapgolly.reactour.reactourStrings.bottom
    - typingsJapgolly.reactour.reactourStrings.left
    - typingsJapgolly.reactour.reactourStrings.center
  */
  trait ReactourStepPosition extends StObject
  object ReactourStepPosition {
    
    inline def bottom: typingsJapgolly.reactour.reactourStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactour.reactourStrings.bottom]
    
    inline def center: typingsJapgolly.reactour.reactourStrings.center = "center".asInstanceOf[typingsJapgolly.reactour.reactourStrings.center]
    
    inline def left: typingsJapgolly.reactour.reactourStrings.left = "left".asInstanceOf[typingsJapgolly.reactour.reactourStrings.left]
    
    inline def right: typingsJapgolly.reactour.reactourStrings.right = "right".asInstanceOf[typingsJapgolly.reactour.reactourStrings.right]
    
    inline def top: typingsJapgolly.reactour.reactourStrings.top = "top".asInstanceOf[typingsJapgolly.reactour.reactourStrings.top]
  }
  
  type Tour = japgolly.scalajs.react.facade.React.Component[ReactourProps & js.Object, js.Object]
}
