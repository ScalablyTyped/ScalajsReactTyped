package typingsJapgolly.semanticUiPopup.SemanticUI.PopupSettings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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
}

object Impl {
  @scala.inline
  def apply(
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
    onHide: JQuery => CallbackTo[`false` | Unit],
    onRemove: JQuery => Callback,
    onShow: JQuery => CallbackTo[`false` | Unit],
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
    val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], distanceAway = distanceAway.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], hideOnScroll = hideOnScroll.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], lastResort = lastResort.asInstanceOf[js.Any], maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], movePopup = movePopup.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prefer = prefer.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], setFluidWidth = setFluidWidth.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.updateDynamic("onCreate")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onCreate(t0).runNow()))
    __obj.updateDynamic("onHidden")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onHidden(t0).runNow()))
    __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onHide(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onRemove(t0).runNow()))
    __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onShow(t0).runNow()))
    __obj.updateDynamic("onUnplaceable")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onUnplaceable(t0).runNow()))
    __obj.updateDynamic("onVisible")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiPopup.JQuery) => onVisible(t0).runNow()))
    __obj.asInstanceOf[Impl]
  }
}

