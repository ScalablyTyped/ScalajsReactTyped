package typingsJapgolly.semanticUiPopup.SemanticUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiPopup.JQuery
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typingsJapgolly.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typingsJapgolly.semanticUiPopup.semanticUiPopupBooleans.`false`
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.adjacent
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.auto
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.click
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.focus
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hover
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.manual
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.opposite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupSettings {
  
  trait Impl extends StObject {
    
    /**
      * When using on: 'hover' whether touchstart events should be added to allow the popup to be triggered
      */
    var addTouchEvents: Boolean
    
    /**
      * When the popup surpasses the boundary of this element, it will attempt to find another display position.
      */
    var boundary: String | JQuery
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * When using on: 'click' specifies whether clicking the page should close the popup
      *
      * @default true
      */
    var closable: Boolean
    
    /**
      * Content to display
      */
    var content: String
    
    /**
      * Selector or jquery object specifying where the popup should be created.
      *
      * @default 'body'
      */
    var context: String | JQuery
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    /**
      * Delay in milliseconds before showing or hiding a popup on hover or focus
      */
    var delay: DelaySettings
    
    /**
      * Offset for distance of popup from element
      *
      * @default 0
      */
    var distanceAway: Double
    
    /**
      * Duration of animation events
      *
      * @default 200
      */
    var duration: Double
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    /**
      * Whether all other popups should be hidden when this popup is opened
      *
      * @default false
      */
    var exclusive: Boolean
    
    /**
      * Whether popup should hide on scroll or touchmove, auto only hides for popups without on: 'click'.
      * Set this to false to prevent mobile browsers from closing popups when you tap inside input fields.
      *
      * @default 'auto'
      */
    var hideOnScroll: auto | `false`
    
    /**
      * Whether popup should not close on hover (useful for popup navigation menus)
      *
      * @default false
      */
    var hoverable: Boolean
    
    /**
      * HTML content to display instead of preformatted title and content
      */
    var html: String | JQuery
    
    /**
      * If a popup is inline it will be created next to current element, allowing for local css rules to apply.
      * It will not be removed from the DOM after being hidden.
      * Otherwise popups will appended to body and removed after being hidden.
      *
      * @default false
      */
    var `inline`: Boolean
    
    /**
      * Number of pixels that a popup is allowed to appear outside the boundaries of its context.
      * This allows for permissible rounding errors when an element is against the edge of its context.
      *
      * @default 2
      */
    var jitter: Double
    
    /**
      * When set to false, a popup will not appear and produce an error message if it cannot entirely fit on page.
      * Setting this to a position like, right center forces the popup to use this position as a last resort even if it is partially offstage.
      * Setting this to true will use the last attempted position.
      *
      * @default false
      */
    var lastResort: Boolean | String
    
    /**
      * Number of iterations before giving up search for popup position when a popup cannot fit on screen
      *
      * @default 10
      */
    var maxSearchDepth: Double
    
    /**
      * HTML Data attributes used to store data
      */
    var metadata: MetadataSettings
    
    /**
      * Whether to move popup to same offset container as target element when popup already exists on the page.
      * Using a popup inside of an element without overflow:visible, like a sidebar, may require you to set this to false
      *
      * @default true
      */
    var movePopup: Boolean
    
    // endregion
    // region Debug Settings
    /**
      * Name used in log statements
      */
    var name: String
    
    // endregion
    // region Component Settings
    // region DOM Settings
    /**
      * Event namespace. Makes sure module teardown does not effect other events attached to an element.
      */
    var namespace: String
    
    /**
      * Whether popup should attach mutationObservers to automatically run destroy when the element is removed from the page's DOM.
      *
      * @default true
      */
    var observeChanges: Boolean
    
    /**
      * Offset in pixels from calculated position
      *
      * @default 0
      */
    var offset: Double
    
    /**
      * Event used to trigger popup. Can be either focus, click, hover, or manual. Manual popups must be triggered with $('.element').popup('show');
      *
      * @default 'hover'
      */
    var on: focus | click | hover | manual
    
    // endregion
    // region Callbacks
    /**
      * Callback on popup element creation, with created popup
      */
    def onCreate($module: JQuery): Unit
    
    /**
      * Callback after popup is hidden
      */
    def onHidden($module: JQuery): Unit
    
    /**
      * Callback before popup is hidden. Returning false from this callback will cancel the popup from hiding.
      */
    def onHide($module: JQuery): `false` | Unit
    
    /**
      * Callback immediately before Popup is removed from DOM
      */
    def onRemove($module: JQuery): Unit
    
    /**
      * Callback before popup is shown. Returning false from this callback will cancel the popup from showing.
      */
    def onShow($module: JQuery): `false` | Unit
    
    /**
      * Callback after popup cannot be placed on screen
      */
    def onUnplaceable($module: JQuery): Unit
    
    /**
      * Callback after popup is shown
      */
    def onVisible($module: JQuery): Unit
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    // region Popup Settings
    /**
      * Can specify a DOM element that should be used as the popup. This is useful for including a pre-formatted popup.
      *
      * @default false
      */
    var popup: `false` | String | JQuery
    
    /**
      * Position that the popup should appear
      *
      * @default 'top left'
      */
    var position: String
    
    /**
      * Can be set to adjacent or opposite to prefer adjacent or opposite position if popup cannot fit on screen
      *
      * @default 'adjacent'
      */
    var prefer: adjacent | opposite
    
    /**
      * Whether popup contents should be preserved in the page after being hidden, allowing it to re-appear slightly faster on subsequent loads.
      *
      * @default false
      */
    var preserve: Boolean
    
    /**
      * Will automatically hide a popup on scroll event in this context
      */
    var scrollContext: String | JQuery
    
    // endregion
    // region DOM Settings
    /**
      * DOM Selectors used internally
      */
    var selector: SelectorSettings
    
    /**
      * Whether popup should set fluid popup variation width on load to avoid width: 100% including padding
      *
      * @default true
      */
    var setFluidWidth: Boolean
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    /**
      * If a selector or jQuery object is specified this allows the popup to be positioned relative to that element.
      *
      * @default false
      */
    var target: `false` | String | JQuery
    
    /**
      * Title to display alongside content
      */
    var title: String
    
    /**
      * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
      *
      * @default 'slide down'
      * @see {@link http://semantic-ui.com/modules/transition.html}
      */
    var transition: String
    
    // endregion
    // region Content Settings
    /**
      * Popup variation to use, can use multiple variations with a space delimiter
      */
    var variation: String
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      addTouchEvents: Boolean,
      boundary: String | JQuery,
      className: ClassNameSettings,
      closable: Boolean,
      content: String,
      context: String | JQuery,
      debug: Boolean,
      delay: DelaySettings,
      distanceAway: Double,
      duration: Double,
      error: ErrorSettings,
      exclusive: Boolean,
      hideOnScroll: auto | `false`,
      hoverable: Boolean,
      html: String | JQuery,
      `inline`: Boolean,
      jitter: Double,
      lastResort: Boolean | String,
      maxSearchDepth: Double,
      metadata: MetadataSettings,
      movePopup: Boolean,
      name: String,
      namespace: String,
      observeChanges: Boolean,
      offset: Double,
      on: focus | click | hover | manual,
      onCreate: JQuery => Callback,
      onHidden: JQuery => Callback,
      onHide: JQuery => `false` | Unit,
      onRemove: JQuery => Callback,
      onShow: JQuery => `false` | Unit,
      onUnplaceable: JQuery => Callback,
      onVisible: JQuery => Callback,
      performance: Boolean,
      popup: `false` | String | JQuery,
      position: String,
      prefer: adjacent | opposite,
      preserve: Boolean,
      scrollContext: String | JQuery,
      selector: SelectorSettings,
      setFluidWidth: Boolean,
      silent: Boolean,
      target: `false` | String | JQuery,
      title: String,
      transition: String,
      variation: String,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], distanceAway = distanceAway.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], hideOnScroll = hideOnScroll.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], lastResort = lastResort.asInstanceOf[js.Any], maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], movePopup = movePopup.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1((t0: JQuery) => onCreate(t0).runNow()), onHidden = js.Any.fromFunction1((t0: JQuery) => onHidden(t0).runNow()), onHide = js.Any.fromFunction1(onHide), onRemove = js.Any.fromFunction1((t0: JQuery) => onRemove(t0).runNow()), onShow = js.Any.fromFunction1(onShow), onUnplaceable = js.Any.fromFunction1((t0: JQuery) => onUnplaceable(t0).runNow()), onVisible = js.Any.fromFunction1((t0: JQuery) => onVisible(t0).runNow()), performance = performance.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prefer = prefer.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], setFluidWidth = setFluidWidth.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setAddTouchEvents(value: Boolean): Self = StObject.set(x, "addTouchEvents", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: String | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDistanceAway(value: Double): Self = StObject.set(x, "distanceAway", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setHideOnScroll(value: auto | `false`): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String | JQuery): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setLastResort(value: Boolean | String): Self = StObject.set(x, "lastResort", value.asInstanceOf[js.Any])
      
      inline def setMaxSearchDepth(value: Double): Self = StObject.set(x, "maxSearchDepth", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMovePopup(value: Boolean): Self = StObject.set(x, "movePopup", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOn(value: focus | click | hover | manual): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnCreate(value: JQuery => Callback): Self = StObject.set(x, "onCreate", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
      
      inline def setOnHidden(value: JQuery => Callback): Self = StObject.set(x, "onHidden", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
      
      inline def setOnHide(value: JQuery => `false` | Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: JQuery => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
      
      inline def setOnShow(value: JQuery => `false` | Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnUnplaceable(value: JQuery => Callback): Self = StObject.set(x, "onUnplaceable", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
      
      inline def setOnVisible(value: JQuery => Callback): Self = StObject.set(x, "onVisible", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPopup(value: `false` | String | JQuery): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPrefer(value: adjacent | opposite): Self = StObject.set(x, "prefer", value.asInstanceOf[js.Any])
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSetFluidWidth(value: Boolean): Self = StObject.set(x, "setFluidWidth", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: `false` | String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiPopup.anon.PickImplpopupPartialPickI
    - typingsJapgolly.semanticUiPopup.anon.PickImplexclusivePartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplmovePopupPartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplobserveChangesPar
    - typingsJapgolly.semanticUiPopup.anon.PickImplboundaryPartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplcontextPartialPic
    - typingsJapgolly.semanticUiPopup.anon.PickImplscrollContextPart
    - typingsJapgolly.semanticUiPopup.anon.PickImpljitterPartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImplpositionPartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplinlinePartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImplpreservePartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplpreferPartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImpllastResortPartial
    - typingsJapgolly.semanticUiPopup.anon.PickImplonPartialPickImpl
    - typingsJapgolly.semanticUiPopup.anon.PickImpldelayPartialPickI
    - typingsJapgolly.semanticUiPopup.anon.PickImpltransitionPartial
    - typingsJapgolly.semanticUiPopup.anon.PickImpldurationPartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplsetFluidWidthPart
    - typingsJapgolly.semanticUiPopup.anon.PickImplhoverablePartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplclosablePartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImpladdTouchEventsPar
    - typingsJapgolly.semanticUiPopup.anon.PickImplhideOnScrollParti
    - typingsJapgolly.semanticUiPopup.anon.PickImpltargetPartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImpldistanceAwayParti
    - typingsJapgolly.semanticUiPopup.anon.PickImploffsetPartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImplmaxSearchDepthPar
    - typingsJapgolly.semanticUiPopup.anon.PickImplonCreatePartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplonRemovePartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplonShowPartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImplonVisiblePartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplonHidePartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImplonHiddenPartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplonUnplaceablePart
    - typingsJapgolly.semanticUiPopup.anon.PickImplvariationPartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplcontentPartialPic
    - typingsJapgolly.semanticUiPopup.anon.PickImpltitlePartialPickI
    - typingsJapgolly.semanticUiPopup.anon.PickImplhtmlPartialPickIm
    - typingsJapgolly.semanticUiPopup.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplmetadataPartialPi
    - typingsJapgolly.semanticUiPopup.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiPopup.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiPopup.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiPopup.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiPopup.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiPopup.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiPopup.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImpladdTouchEventsPar(addTouchEvents: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImpladdTouchEventsPar = {
      val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpladdTouchEventsPar]
    }
    
    inline def PickImplboundaryPartialPi(boundary: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiPopup.anon.PickImplboundaryPartialPi = {
      val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplboundaryPartialPi]
    }
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiPopup.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplclosablePartialPi(closable: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplclosablePartialPi = {
      val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplclosablePartialPi]
    }
    
    inline def PickImplcontentPartialPic(content: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImplcontentPartialPic = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplcontentPartialPic]
    }
    
    inline def PickImplcontextPartialPic(context: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiPopup.anon.PickImplcontextPartialPic = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplcontextPartialPic]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldelayPartialPickI(delay: DelaySettings & js.UndefOr[DelaySettings]): typingsJapgolly.semanticUiPopup.anon.PickImpldelayPartialPickI = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpldelayPartialPickI]
    }
    
    inline def PickImpldistanceAwayParti(distanceAway: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiPopup.anon.PickImpldistanceAwayParti = {
      val __obj = js.Dynamic.literal(distanceAway = distanceAway.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpldistanceAwayParti]
    }
    
    inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiPopup.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiPopup.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplexclusivePartialP(exclusive: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplexclusivePartialP = {
      val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplexclusivePartialP]
    }
    
    inline def PickImplhideOnScrollParti(hideOnScroll: (auto | `false`) & (js.UndefOr[auto | `false`])): typingsJapgolly.semanticUiPopup.anon.PickImplhideOnScrollParti = {
      val __obj = js.Dynamic.literal(hideOnScroll = hideOnScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplhideOnScrollParti]
    }
    
    inline def PickImplhoverablePartialP(hoverable: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplhoverablePartialP = {
      val __obj = js.Dynamic.literal(hoverable = hoverable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplhoverablePartialP]
    }
    
    inline def PickImplhtmlPartialPickIm(html: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiPopup.anon.PickImplhtmlPartialPickIm = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplhtmlPartialPickIm]
    }
    
    inline def PickImplinlinePartialPick(`inline`: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplinlinePartialPick = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplinlinePartialPick]
    }
    
    inline def PickImpljitterPartialPick(jitter: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiPopup.anon.PickImpljitterPartialPick = {
      val __obj = js.Dynamic.literal(jitter = jitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpljitterPartialPick]
    }
    
    inline def PickImpllastResortPartial(lastResort: (Boolean | String) & (js.UndefOr[Boolean | String])): typingsJapgolly.semanticUiPopup.anon.PickImpllastResortPartial = {
      val __obj = js.Dynamic.literal(lastResort = lastResort.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpllastResortPartial]
    }
    
    inline def PickImplmaxSearchDepthPar(maxSearchDepth: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiPopup.anon.PickImplmaxSearchDepthPar = {
      val __obj = js.Dynamic.literal(maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplmaxSearchDepthPar]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiPopup.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplmovePopupPartialP(movePopup: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplmovePopupPartialP = {
      val __obj = js.Dynamic.literal(movePopup = movePopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplmovePopupPartialP]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplobserveChangesPar(observeChanges: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplobserveChangesPar = {
      val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplobserveChangesPar]
    }
    
    inline def PickImploffsetPartialPick(offset: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiPopup.anon.PickImploffsetPartialPick = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImploffsetPartialPick]
    }
    
    inline def PickImplonCreatePartialPi(
      onCreate: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonCreatePartialPi = {
      val __obj = js.Dynamic.literal(onCreate = onCreate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonCreatePartialPi]
    }
    
    inline def PickImplonHiddenPartialPi(
      onHidden: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonHiddenPartialPi = {
      val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonHiddenPartialPi]
    }
    
    inline def PickImplonHidePartialPick(
      onHide: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonHidePartialPick = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonHidePartialPick]
    }
    
    inline def PickImplonPartialPickImpl(on: (focus | click | hover | manual) & (js.UndefOr[focus | click | hover | manual])): typingsJapgolly.semanticUiPopup.anon.PickImplonPartialPickImpl = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonPartialPickImpl]
    }
    
    inline def PickImplonRemovePartialPi(
      onRemove: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonRemovePartialPi = {
      val __obj = js.Dynamic.literal(onRemove = onRemove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonRemovePartialPi]
    }
    
    inline def PickImplonShowPartialPick(
      onShow: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonShowPartialPick = {
      val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonShowPartialPick]
    }
    
    inline def PickImplonUnplaceablePart(
      onUnplaceable: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonUnplaceablePart = {
      val __obj = js.Dynamic.literal(onUnplaceable = onUnplaceable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonUnplaceablePart]
    }
    
    inline def PickImplonVisiblePartialP(
      onVisible: (js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiPopup.anon.PickImplonVisiblePartialP = {
      val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplonVisiblePartialP]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplperformancePartia]
    }
    
    inline def PickImplpopupPartialPickI(popup: (`false` | String | JQuery) & (js.UndefOr[`false` | String | JQuery])): typingsJapgolly.semanticUiPopup.anon.PickImplpopupPartialPickI = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplpopupPartialPickI]
    }
    
    inline def PickImplpositionPartialPi(position: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImplpositionPartialPi = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplpositionPartialPi]
    }
    
    inline def PickImplpreferPartialPick(prefer: (adjacent | opposite) & (js.UndefOr[adjacent | opposite])): typingsJapgolly.semanticUiPopup.anon.PickImplpreferPartialPick = {
      val __obj = js.Dynamic.literal(prefer = prefer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplpreferPartialPick]
    }
    
    inline def PickImplpreservePartialPi(preserve: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplpreservePartialPi = {
      val __obj = js.Dynamic.literal(preserve = preserve.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplpreservePartialPi]
    }
    
    inline def PickImplscrollContextPart(scrollContext: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiPopup.anon.PickImplscrollContextPart = {
      val __obj = js.Dynamic.literal(scrollContext = scrollContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplscrollContextPart]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiPopup.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsetFluidWidthPart(setFluidWidth: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplsetFluidWidthPart = {
      val __obj = js.Dynamic.literal(setFluidWidth = setFluidWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplsetFluidWidthPart]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltargetPartialPick(target: (`false` | String | JQuery) & (js.UndefOr[`false` | String | JQuery])): typingsJapgolly.semanticUiPopup.anon.PickImpltargetPartialPick = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpltargetPartialPick]
    }
    
    inline def PickImpltitlePartialPickI(title: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImpltitlePartialPickI = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpltitlePartialPickI]
    }
    
    inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImpltransitionPartial]
    }
    
    inline def PickImplvariationPartialP(variation: String & js.UndefOr[String]): typingsJapgolly.semanticUiPopup.anon.PickImplvariationPartialP = {
      val __obj = js.Dynamic.literal(variation = variation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplvariationPartialP]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiPopup.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiPopup.anon.PickImplverbosePartialPic]
    }
  }
}
