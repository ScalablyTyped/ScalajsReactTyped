package typingsJapgolly.extjs.Ext.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IElementLoader
import typingsJapgolly.extjs.Ext.dd.IDD
import typingsJapgolly.extjs.Ext.dd.IDDProxy
import typingsJapgolly.extjs.Ext.dd.IDDTarget
import typingsJapgolly.extjs.Ext.util.IKeyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement extends IAbstractElement {
  /** [Method] Sets up event handlers to add and remove a css class when the mouse is down and then up on this element a click effe
  		* @param className String The class to add
  		* @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
  		* @param scope Object The scope to execute the testFn in.
  		* @returns Ext.dom.Element this
  		*/
  var addClsOnClick: js.UndefOr[
    js.Function3[
      /* className */ js.UndefOr[String], 
      /* testFn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets up event handlers to add and remove a css class when this element has the focus Defined in override Ext dom Ele
  		* @param className String The class to add
  		* @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
  		* @param scope Object The scope to execute the testFn in.
  		* @returns Ext.dom.Element this
  		*/
  var addClsOnFocus: js.UndefOr[
    js.Function3[
      /* className */ js.UndefOr[String], 
      /* testFn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets up event handlers to add and remove a css class when the mouse is over this element Defined in override Ext dom
  		* @param className String The class to add
  		* @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
  		* @param scope Object The scope to execute the testFn in.
  		* @returns Ext.dom.Element this
  		*/
  var addClsOnOver: js.UndefOr[
    js.Function3[
      /* className */ js.UndefOr[String], 
      /* testFn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Convenience method for constructing a KeyMap
  		* @param key String/Number/Number[]/Object Either a string with the keys to listen for, the numeric key code, array of key codes or an object with the following options:
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the specified function is executed. Defaults to this Element.
  		* @returns Ext.util.KeyMap The KeyMap created
  		*/
  var addKeyListener: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      IKeyMap
    ]
  ] = js.undefined
  /** [Method] Creates a KeyMap for this element
  		* @param config Object The KeyMap config. See Ext.util.KeyMap for more details
  		* @returns Ext.util.KeyMap The KeyMap created
  		*/
  var addKeyMap: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], IKeyMap]] = js.undefined
  /** [Method] Shorthand for on
  		* @param eventName String The name of event to handle.
  		* @param fn Function The handler function the event invokes. This function is passed the following parameters: evt : EventObject The EventObject describing the event. el : HtmlElement The DOM element which was the target of the event. Note that this may be filtered by using the delegate option. o : Object The options object from the call that setup the listener.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties: scope Object : The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element. delegate String: A simple selector to filter the target or look for a descendant of the target. See below for additional details. stopEvent Boolean: True to stop the event. That is stop propagation, and prevent the default action. preventDefault Boolean: True to prevent the default action stopPropagation Boolean: True to prevent event propagation normalized Boolean: False to pass a browser event to the handler function instead of an Ext.EventObject target Ext.dom.Element: Only call the handler if the event was fired on the target Element, not if the event was bubbled up from a child node. delay Number: The number of milliseconds to delay the invocation of the handler after the event fires. single Boolean: True to add a handler to handle just the next firing of the event, and then remove itself. buffer Number: Causes the handler to be scheduled to run in an Ext.util.DelayedTask delayed by the specified number of milliseconds. If the event fires again within that time, the original handler is not invoked, but the new handler is scheduled in its place. Combining Options  Using the options argument, it is possible to combine different types of listeners:  A delayed, one-time listener that auto stops the event and adds a custom argument (forumId) to the options object. The options object is available as the third parameter in the handler function.  Code:  el.on('click', this.onClick, this, {  single: true,  delay: 100,  stopEvent : true,  forumId: 4 }); Attaching multiple handlers in 1 call  The method also allows for a single argument to be passed which is a config object containing properties which specify multiple handlers.  Code:  el.on({  'click' : {  fn: this.onClick,  scope: this,  delay: 100  },  'mouseover' : {  fn: this.onMouseOver,  scope: this  },  'mouseout' : {  fn: this.onMouseOut,  scope: this  } }); Or a shorthand syntax:  Code:  el.on({  'click' : this.onClick,  'mouseover' : this.onMouseOver,  'mouseout' : this.onMouseOut,  scope: this }); delegate  This is a configuration option that you can pass along when registering a handler for an event to assist with event delegation. Event delegation is a technique that is used to reduce memory consumption and prevent exposure to memory-leaks. By registering an event for a container element as opposed to each element within a container. By setting this configuration option to a simple selector, the target element will be filtered to look for a descendant of the target. For example:  // using this markup: &lt;div id='elId'&gt;  &lt;p id='p1'&gt;paragraph one&lt;/p&gt;  &lt;p id='p2' class='clickable'&gt;paragraph two&lt;/p&gt;  &lt;p id='p3'&gt;paragraph three&lt;/p&gt; &lt;/div&gt; // utilize event delegation to registering just one handler on the container element: el = Ext.get('elId'); el.on(  'click',  function(e,t) {  // handle click  console.info(t.id); // 'p2'  },  this,  {  // filter the target element to be a descendant with the class 'clickable'  delegate: '.clickable'  } );
  		* @returns Ext.dom.Element this
  		*/
  var addListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Performs custom animation on this Element
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Ext.dom.Element this
  		*/
  var animate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var autoBoxAdjust: js.UndefOr[Boolean] = js.undefined
  /** [Method] Tries to blur the element
  		* @returns Ext.dom.Element this
  		*/
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Wraps the specified element with a special 9 element markup CSS block that renders by default as a gray container wit
  		* @param class String A base CSS class to apply to the containing wrapper element. Note that there are a number of CSS rules that are dependent on this name to make the overall effect work, so if you supply an alternate base class, make sure you also supply all of the necessary rules.
  		* @returns Ext.dom.Element The outermost wrapping element of the created box structure.
  		*/
  var boxWrap: js.UndefOr[js.Function1[/* clazz */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] When an element is moved around in the DOM or is hidden using display none it loses layout and therefore all scrol
  		* @returns Function A function which will restore all descentant elements of this Element to their scroll positions recorded when this function was executed. Be aware that the returned function is a closure which has captured the scope of cacheScrollValues, so take care to derefence it as soon as not needed - if is it is a var it will drop out of scope, and the reference will be freed.
  		*/
  var cacheScrollValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Centers the Element in either the viewport or another Element
  		* @param centerIn String/HTMLElement/Ext.dom.Element element in which to center the element.
  		*/
  var center: js.UndefOr[js.Function1[/* centerIn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes Empty or whitespace filled text nodes
  		* @param forceReclean Boolean By default the element keeps track if it has been cleaned already so you can call this over and over. However, if you update the element and need to force a reclean, you can pass true.
  		*/
  var clean: js.UndefOr[js.Function1[/* forceReclean */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Alias for removeAllListeners
  		* @returns Ext.dom.Element this
  		*/
  var clearListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Clears any opacity settings from this element
  		* @returns Ext.dom.Element this
  		*/
  var clearOpacity: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Clears positioning back to the default when the document was loaded
  		* @param value String The value to use for the left, right, top, bottom. You could use 'auto'.
  		* @returns Ext.dom.Element this
  		*/
  var clearPositioning: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Store the current overflow setting and clip overflow on the element  use unclip to remove Defined in override Ext d
  		* @returns Ext.dom.Element this
  		*/
  var clip: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Creates a proxy element of this element
  		* @param config String/Object The class name of the proxy element or a DomHelper config object
  		* @param renderTo String/HTMLElement The element or element id to render the proxy to. Defaults to: document.body.
  		* @param matchBox Boolean True to align and size the proxy to this element now.
  		* @returns Ext.dom.Element The new proxy element
  		*/
  var createProxy: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* renderTo */ js.UndefOr[js.Any], 
      /* matchBox */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Creates an iframe shim for this element to keep selects and other windowed objects from showing through
  		* @returns Ext.dom.Element The new shim element
  		*/
  var createShim: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Convenience method for setVisibilityMode Element DISPLAY
  		* @param display String What to set display to when visible
  		* @returns Ext.dom.Element this
  		*/
  var enableDisplayMode: js.UndefOr[js.Function1[/* display */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Fade an element in from transparent to opaque
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.Element The Element
  		*/
  var fadeIn: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Fade an element out from opaque to transparent
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.Element The Element
  		*/
  var fadeOut: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Tries to focus the element
  		* @param defer Number Milliseconds to defer the focus
  		* @returns Ext.dom.Element this
  		*/
  var focus: js.UndefOr[js.Function1[/* defer */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Alias for isFocusable
  		* @returns Boolean True if the element is focusable
  		*/
  var focusable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Shows a ripple of exploding attenuating borders to draw attention to an Element
  		* @param color String The hex color value for the border.
  		* @param count Number The number of ripples to display.
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var frame: js.UndefOr[
    js.Function3[
      /* color */ js.UndefOr[String], 
      /* count */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Returns the value of a namespaced attribute from the element s underlying DOM node
  		* @param namespace String The namespace in which to look for the attribute
  		* @param name String The attribute name
  		* @returns String The attribute value
  		*/
  var getAttributeNS: js.UndefOr[
    js.Function2[/* namespace */ js.UndefOr[String], /* name */ js.UndefOr[String], String]
  ] = js.undefined
  /** [Method] Gets the bottom Y coordinate of the element element Y position  element height  Defined in override Ext dom Elemen
  		* @param local Boolean True to get the local css position instead of page coordinate
  		* @returns Number
  		*/
  var getBottom: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Calculates the x y to center this element on the screen Defined in override Ext dom Element_position
  		* @returns Number[] The x, y values [x, y]
  		*/
  var getCenterXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Return the CSS color for the specified CSS attribute
  		* @param attr String The css attribute
  		* @param defaultValue String The default value to use when a valid color isn't found
  		* @param prefix String defaults to #. Use an empty string when working with color anims.
  		*/
  var getColor: js.UndefOr[
    js.Function3[
      /* attr */ js.UndefOr[String], 
      /* defaultValue */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Returns either the offsetHeight or the height of this element based on CSS height adjusted by padding or borders when
  		* @returns Number
  		*/
  var getComputedHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns either the offsetWidth or the width of this element based on CSS width adjusted by padding or borders when ne
  		* @returns Number
  		*/
  var getComputedWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the sum width of the padding and borders for the passed sides
  		* @param sides String
  		* @returns Number
  		*/
  var getFrameWidth: js.UndefOr[js.Function1[/* sides */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Gets the left X coordinate Defined in override Ext dom Element_position
  		* @param local Boolean True to get the local css position instead of page coordinate
  		* @returns Number
  		*/
  var getLeft: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Gets this element s ElementLoader
  		* @returns Ext.ElementLoader The loader
  		*/
  var getLoader: js.UndefOr[js.Function0[IElementLoader]] = js.undefined
  /** [Method] Gets the local CSS X position for the element Defined in override Ext dom Element_position
  		* @returns Number
  		*/
  var getLocalX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the local CSS X and Y position for the element Defined in override Ext dom Element_position
  		* @returns Array [x, y]
  		*/
  var getLocalXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets the local CSS Y position for the element Defined in override Ext dom Element_position
  		* @returns Number
  		*/
  var getLocalY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns an object defining the area of this Element which can be passed to Ext util Positionable setBox to set anothe
  		* @param asRegion Boolean If true an Ext.util.Region will be returned
  		* @returns Object/Ext.util.Region box An object in the following format: {  left: &lt;Element's X position&gt;,  top: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY
  		*/
  var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Gets an object with all CSS positioning properties
  		* @param autoPx Boolean true to return pixel values for "auto" styles.
  		* @returns Object
  		*/
  var getPositioning: js.UndefOr[js.Function1[/* autoPx */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Gets the right X coordinate of the element element X position  element width  Defined in override Ext dom Element_
  		* @param local Boolean True to get the local css position instead of page coordinates
  		* @returns Number
  		*/
  var getRight: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Returns the current scroll position of the element
  		* @returns Object An object containing the scroll position in the format {left: (scrollLeft), top: (scrollTop)}
  		*/
  var getScroll: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the left scroll position Defined in override Ext dom Element_scroll
  		* @returns Number The left scroll position
  		*/
  var getScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the top scroll position Defined in override Ext dom Element_scroll
  		* @returns Number The top scroll position
  		*/
  var getScrollTop: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height.
  		*/
  var getStyleSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the width in pixels of the passed text or the width of the text in this Element
  		* @param text String The text to measure. Defaults to the innerHTML of the element.
  		* @param min Number The minumum value to return.
  		* @param max Number The maximum value to return.
  		* @returns Number The text width in pixels.
  		*/
  var getTextWidth: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  /** [Method] Gets the top Y coordinate Defined in override Ext dom Element_position
  		* @param local Boolean True to get the local css position instead of page coordinates
  		* @returns Number
  		*/
  var getTop: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Gets element X position in page coordinates Defined in override Ext dom Element_position
  		* @returns Number
  		*/
  var getX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets element X and Y positions in page coordinates Defined in override Ext dom Element_position
  		* @returns Array [x, y]
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets element Y position in page coordinates Defined in override Ext dom Element_position
  		* @returns Number
  		*/
  var getY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Slides the element while fading it out of view
  		* @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to bottom: 'b')
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var ghost: js.UndefOr[
    js.Function2[/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Hide this element  Uses display mode to determine whether to use display or visibility
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("hide")
  var hide_IElement: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Highlights the Element by setting a color applies to the background color by default but can be changed using the
  		* @param color String The highlight color. Should be a 6 char hex color without the leading # (defaults to yellow: 'ffff9c')
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var highlight: js.UndefOr[
    js.Function2[/* color */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets up event handlers to call the passed functions when the mouse is moved into and out of the Element
  		* @param overFn Function The function to call when the mouse enters the Element.
  		* @param outFn Function The function to call when the mouse leaves the Element.
  		* @param scope Object The scope (this reference) in which the functions are executed. Defaults to the Element's DOM element.
  		* @param options Object Options for the listener. See the options parameter.
  		* @returns Ext.dom.Element this
  		*/
  var hover: js.UndefOr[
    js.Function4[
      /* overFn */ js.UndefOr[js.Any], 
      /* outFn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Initializes a Ext dd DD drag drop object for this element
  		* @param group String The group the DD object is member of
  		* @param config Object The DD config object
  		* @param overrides Object An object containing methods to override/implement on the DD object
  		* @returns Ext.dd.DD The DD object
  		*/
  var initDD: js.UndefOr[
    js.Function3[
      /* group */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      /* overrides */ js.UndefOr[js.Any], 
      IDD
    ]
  ] = js.undefined
  /** [Method] Initializes a Ext dd DDProxy object for this element
  		* @param group String The group the DDProxy object is member of
  		* @param config Object The DDProxy config object
  		* @param overrides Object An object containing methods to override/implement on the DDProxy object
  		* @returns Ext.dd.DDProxy The DDProxy object
  		*/
  var initDDProxy: js.UndefOr[
    js.Function3[
      /* group */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      /* overrides */ js.UndefOr[js.Any], 
      IDDProxy
    ]
  ] = js.undefined
  /** [Method] Initializes a Ext dd DDTarget object for this element
  		* @param group String The group the DDTarget object is member of
  		* @param config Object The DDTarget config object
  		* @param overrides Object An object containing methods to override/implement on the DDTarget object
  		* @returns Ext.dd.DDTarget The DDTarget object
  		*/
  var initDDTarget: js.UndefOr[
    js.Function3[
      /* group */ js.UndefOr[String], 
      /* config */ js.UndefOr[js.Any], 
      /* overrides */ js.UndefOr[js.Any], 
      IDDTarget
    ]
  ] = js.undefined
  /** [Method] Tests various css rules browsers to determine if this element uses a border box
  		* @returns Boolean
  		*/
  var isBorderBox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if display is not none
  		* @returns Boolean
  		*/
  var isDisplayed: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Checks whether this element can be focused
  		* @param asFocusEl Object
  		* @returns Boolean True if the element is focusable
  		*/
  var isFocusable: js.UndefOr[js.Function1[/* asFocusEl */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns true if this element is masked
  		* @returns Boolean
  		*/
  var isMasked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this element is scrollable
  		* @returns Boolean
  		*/
  var isScrollable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Checks whether the element is currently visible using both visibility and display properties
  		* @param deep Boolean True to walk the dom and see if parent elements are hidden. If false, the function only checks the visibility of the element itself and it may return true even though a parent is not visible.
  		* @returns Boolean true if the element is currently visible, else false
  		*/
  var isVisible: js.UndefOr[js.Function1[/* deep */ js.UndefOr[Boolean], Boolean]] = js.undefined
  /** [Method] Direct access to the Ext ElementLoader Ext ElementLoader load method
  		* @param options Object
  		* @returns Ext.dom.Element this
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Puts a mask over this element to disable user interaction
  		* @param msg String A message to display in the mask
  		* @param msgCls String A css class to apply to the msg element
  		* @returns Ext.dom.Element The mask element
  		*/
  @JSName("mask")
  var mask_IElement: js.UndefOr[
    js.Function2[/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String], this.type]
  ] = js.undefined
  /** [Method] Monitors this Element for the mouse leaving
  		* @param delay Number The delay in milliseconds to wait for possible mouse re-entry before calling the handler function.
  		* @param handler Function The function to call if the mouse remains outside of this Element for the specified time.
  		* @param scope Object The scope (this reference) in which the handler function executes. Defaults to this Element.
  		* @returns Object The listeners object which was added to this element so that monitoring can be stopped. Example usage: // Hide the menu if the mouse moves out for 250ms or more this.mouseLeaveMonitor = this.menuEl.monitorMouseLeave(250, this.hideMenu, this); ... // Remove mouseleave monitor on menu destroy this.menuEl.un(this.mouseLeaveMonitor);
  		*/
  var monitorMouseLeave: js.UndefOr[
    js.Function3[
      /* delay */ js.UndefOr[Double], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the position of the element in page coordinates
  		* @param x Number X value for new position (coordinates are page-based)
  		* @param y Number Y value for new position (coordinates are page-based)
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var moveTo: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Returns true if this element needs an explicit tabIndex to make it focusable  */
  var needsTabIndex: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Appends an event handler to this element
  		* @param eventName String The name of event to handle.
  		* @param fn Function The handler function the event invokes. This function is passed the following parameters: evt : EventObject The EventObject describing the event. el : HtmlElement The DOM element which was the target of the event. Note that this may be filtered by using the delegate option. o : Object The options object from the call that setup the listener.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element.
  		* @param options Object An object containing handler configuration properties. This may contain any of the following properties: scope Object : The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element. delegate String: A simple selector to filter the target or look for a descendant of the target. See below for additional details. stopEvent Boolean: True to stop the event. That is stop propagation, and prevent the default action. preventDefault Boolean: True to prevent the default action stopPropagation Boolean: True to prevent event propagation normalized Boolean: False to pass a browser event to the handler function instead of an Ext.EventObject target Ext.dom.Element: Only call the handler if the event was fired on the target Element, not if the event was bubbled up from a child node. delay Number: The number of milliseconds to delay the invocation of the handler after the event fires. single Boolean: True to add a handler to handle just the next firing of the event, and then remove itself. buffer Number: Causes the handler to be scheduled to run in an Ext.util.DelayedTask delayed by the specified number of milliseconds. If the event fires again within that time, the original handler is not invoked, but the new handler is scheduled in its place. Combining Options  Using the options argument, it is possible to combine different types of listeners:  A delayed, one-time listener that auto stops the event and adds a custom argument (forumId) to the options object. The options object is available as the third parameter in the handler function.  Code:  el.on('click', this.onClick, this, {  single: true,  delay: 100,  stopEvent : true,  forumId: 4 }); Attaching multiple handlers in 1 call  The method also allows for a single argument to be passed which is a config object containing properties which specify multiple handlers.  Code:  el.on({  'click' : {  fn: this.onClick,  scope: this,  delay: 100  },  'mouseover' : {  fn: this.onMouseOver,  scope: this  },  'mouseout' : {  fn: this.onMouseOut,  scope: this  } }); Or a shorthand syntax:  Code:  el.on({  'click' : this.onClick,  'mouseover' : this.onMouseOver,  'mouseout' : this.onMouseOut,  scope: this }); delegate  This is a configuration option that you can pass along when registering a handler for an event to assist with event delegation. Event delegation is a technique that is used to reduce memory consumption and prevent exposure to memory-leaks. By registering an event for a container element as opposed to each element within a container. By setting this configuration option to a simple selector, the target element will be filtered to look for a descendant of the target. For example:  // using this markup: &lt;div id='elId'&gt;  &lt;p id='p1'&gt;paragraph one&lt;/p&gt;  &lt;p id='p2' class='clickable'&gt;paragraph two&lt;/p&gt;  &lt;p id='p3'&gt;paragraph three&lt;/p&gt; &lt;/div&gt; // utilize event delegation to registering just one handler on the container element: el = Ext.get('elId'); el.on(  'click',  function(e,t) {  // handle click  console.info(t.id); // 'p2'  },  this,  {  // filter the target element to be a descendant with the class 'clickable'  delegate: '.clickable'  } );
  		* @returns Ext.dom.Element this
  		*/
  var on: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (String) */
  var originalDisplay: js.UndefOr[String] = js.undefined
  /** [Method] Creates a pause before any subsequent queued effects begin
  		* @param seconds Number The length of time to pause (in seconds)
  		* @returns Ext.Element The Element
  		*/
  var pause: js.UndefOr[js.Function1[/* seconds */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Initializes positioning on this element
  		* @param pos String Positioning to use "relative", "absolute" or "fixed"
  		* @param zIndex Number The zIndex to apply
  		* @param x Number Set the page X position
  		* @param y Number Set the page Y position
  		*/
  var position: js.UndefOr[
    js.Function4[
      /* pos */ js.UndefOr[String], 
      /* zIndex */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Fades the element out while slowly expanding it in all directions
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var puff: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Recursively removes all previous added listeners from this element and its children
  		* @returns Ext.dom.Element this
  		*/
  var purgeAllListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Create an event handler on this element such that when the event fires and is handled by this element it will be rel
  		* @param eventName String The type of event to relay
  		* @param observable Object Any object that extends Ext.util.Observable that will provide the context for firing the relayed event
  		*/
  var relayEvent: js.UndefOr[
    js.Function2[/* eventName */ js.UndefOr[String], /* observable */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Removes all previous added listeners from this element
  		* @returns Ext.dom.Element this
  		*/
  var removeAllListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Shorthand for un
  		* @param eventName String The name of the event from which to remove the handler.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		* @returns Ext.dom.Element this
  		*/
  var removeListener: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Animates the transition of an element s dimensions from a starting height width to an ending height width
  		* @param width Number The new width (pass undefined to keep the original width)
  		* @param height Number The new height (pass undefined to keep the original height)
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.Element The Element
  		*/
  var scale: js.UndefOr[
    js.Function3[
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls this element the specified direction
  		* @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
  		* @param distance Number How far to scroll the element in pixels
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Boolean Returns true if a scroll was triggered or false if the element was scrolled as far as it could go.
  		*/
  var scroll: js.UndefOr[
    js.Function3[
      /* direction */ js.UndefOr[String], 
      /* distance */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.undefined
  /** [Method] Scrolls this element by the passed delta values optionally animating
  		* @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
  		* @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
  		* @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
  		* @returns Ext.Element this
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* deltaX */ js.UndefOr[js.Any], 
      /* deltaY */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls this element into view within the passed container
  		* @param container String/HTMLElement/Ext.Element The container element to scroll. Should be a string (id), dom node, or Ext.Element.
  		* @param hscroll Boolean False to disable horizontal scroll.
  		* @param animate Boolean/Object true for the default animation or a standard Element
  		* @param highlight Boolean true to highlight the element when it is in view. animation config object
  		* @returns Ext.dom.Element this
  		*/
  var scrollIntoView: js.UndefOr[
    js.Function4[
      /* container */ js.UndefOr[js.Any], 
      /* hscroll */ js.UndefOr[Boolean], 
      /* animate */ js.UndefOr[js.Any], 
      /* highlight */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls this element the specified scroll point
  		* @param side String Either "left" for scrollLeft values or "top" for scrollTop values.
  		* @param value Number The new scroll value
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.Element this
  		*/
  var scrollTo: js.UndefOr[
    js.Function3[
      /* side */ js.UndefOr[String], 
      /* value */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Enable text selection for this element normalized across browsers  Defined in override Ext dom Element_style
  		* @returns Ext.Element this
  		*/
  var selectable: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the element s CSS bottom style
  		* @param bottom Number/String Number of pixels or CSS string value to set as the bottom CSS property value
  		* @returns Ext.dom.Element this
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the element s position and size in one shot
  		* @param x Number X value for new position (coordinates are page-based)
  		* @param y Number Y value for new position (coordinates are page-based)
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels) A String used to set the CSS width style. Animation may not be used.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels) A String used to set the CSS height style. Animation may not be used.
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var setBounds: js.UndefOr[
    js.Function5[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the CSS display property
  		* @param value Boolean/String Boolean value to display the element using its default display, or a string to set the display directly.
  		* @returns Ext.dom.Element this
  		*/
  var setDisplayed: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the element s left position directly using CSS style instead of setX
  		* @param left Number/String Number of pixels or CSS string value to set as the left CSS property value
  		* @returns Ext.dom.Element this
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
  		* @param left Number/String Number of pixels or CSS string value to set as the left CSS property value
  		* @param top Number/String Number of pixels or CSS string value to set as the top CSS property value
  		* @returns Ext.dom.Element this
  		*/
  var setLeftTop: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the position of the element in page coordinates
  		* @param x Number X value for new position
  		* @param y Number Y value for new position
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var setLocation: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Set the opacity of the element Defined in override Ext dom Element_style
  		* @param opacity Number The new opacity. 0 = transparent, .5 = 50% visibile, 1 = fully visible, etc
  		* @param animate Boolean/Object a standard Element animation config object or true for the default animation ({duration: 350, easing: 'easeIn'})
  		* @returns Ext.dom.Element this
  		*/
  var setOpacity: js.UndefOr[
    js.Function2[/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Set positioning with an object returned by getPositioning
  		* @param posCfg Object
  		* @returns Ext.dom.Element this
  		*/
  var setPositioning: js.UndefOr[js.Function1[/* posCfg */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the element s CSS right style
  		* @param right Number/String Number of pixels or CSS string value to set as the right CSS property value
  		* @returns Ext.dom.Element this
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the left scroll position Defined in override Ext dom Element_scroll
  		* @param left Number The left scroll position
  		* @returns Ext.dom.Element this
  		*/
  var setScrollLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Sets the top scroll position Defined in override Ext dom Element_scroll
  		* @param top Number The top scroll position
  		* @returns Ext.dom.Element this
  		*/
  var setScrollTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top Number/String Number of pixels or CSS string value to set as the top CSS property value
  		* @returns Ext.dom.Element this
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setVisible")
  var setVisible_IElement: js.UndefOr[
    js.Function2[/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Animates the transition of any combination of an element s dimensions xy position and or opacity
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.Element The Element
  		*/
  var shift: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show this element  Uses display mode to determine whether to use display or visibility
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("show")
  var show_IElement: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Slides the element into view
  		* @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to top: 't')
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var slideIn: js.UndefOr[
    js.Function2[/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Slides the element out of view
  		* @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to top: 't')
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var slideOut: js.UndefOr[
    js.Function2[/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Stops the specified event s from bubbling and optionally prevents the default action
  		* @param eventName String/String[] an event / array of events to stop from bubbling
  		* @param preventDefault Boolean true to prevent the default action too
  		* @returns Ext.dom.Element this
  		*/
  var swallowEvent: js.UndefOr[
    js.Function2[
      /* eventName */ js.UndefOr[js.Any], 
      /* preventDefault */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Blinks the element as if it was clicked and then collapses on its center similar to switching off a television
  		* @param options Object Object literal with any of the Ext.fx.Anim config options
  		* @returns Ext.dom.Element The Element
  		*/
  var switchOff: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Toggles the element s visibility or display depending on visibility mode
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var toggle: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Removes an event handler from this element
  		* @param eventName String The name of the event from which to remove the handler.
  		* @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
  		* @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
  		* @returns Ext.dom.Element this
  		*/
  var un: js.UndefOr[
    js.Function3[
      /* eventName */ js.UndefOr[String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Return clipping overflow to original clipping before clip was called Defined in override Ext dom Element_style
  		* @returns Ext.dom.Element this
  		*/
  var unclip: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Disables text selection for this element normalized across browsers  Defined in override Ext dom Element_style
  		* @returns Ext.dom.Element this
  		*/
  var unselectable: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Updates the innerHTML of this element optionally searching for and processing scripts
  		* @param html String The new HTML
  		* @param loadScripts Boolean True to look for and process scripts (defaults to false)
  		* @param callback Function For async script loading you can be notified when the update completes
  		* @returns Ext.dom.Element this
  		*/
  @JSName("update")
  var update_IElement: js.UndefOr[
    js.Function3[
      /* html */ js.UndefOr[String], 
      /* loadScripts */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
}

object IElement {
  @scala.inline
  def apply(
    ASCLASS: Int | Double = null,
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    addCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    addClsOnClick: (/* className */ js.UndefOr[String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    addClsOnFocus: (/* className */ js.UndefOr[String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    addClsOnOver: (/* className */ js.UndefOr[String], /* testFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    addKeyListener: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IKeyMap] = null,
    addKeyMap: /* config */ js.UndefOr[js.Any] => CallbackTo[IKeyMap] = null,
    addListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: /* config */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    appendChild: (/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    appendTo: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    autoBoxAdjust: js.UndefOr[Boolean] = js.undefined,
    blur: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    boxWrap: /* clazz */ js.UndefOr[String] => CallbackTo[IElement] = null,
    cacheScrollValues: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    center: /* centerIn */ js.UndefOr[js.Any] => Callback = null,
    child: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    clean: /* forceReclean */ js.UndefOr[Boolean] => Callback = null,
    clearListeners: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    clearOpacity: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    clearPositioning: /* value */ js.UndefOr[String] => CallbackTo[IElement] = null,
    clip: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    config: js.Any = null,
    contains: /* el */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    createProxy: (/* config */ js.UndefOr[js.Any], /* renderTo */ js.UndefOr[js.Any], /* matchBox */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    createShim: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    defaultUnit: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    enableDisplayMode: /* display */ js.UndefOr[String] => CallbackTo[IElement] = null,
    extend: String = null,
    fadeIn: /* options */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    fadeOut: /* options */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    findParent: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    findParentNode: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    first: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    focus: /* defer */ js.UndefOr[Double] => CallbackTo[IElement] = null,
    focusable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    frame: (/* color */ js.UndefOr[String], /* count */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    getActiveElement: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getAttribute: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[String] = null,
    getAttributeNS: (/* namespace */ js.UndefOr[String], /* name */ js.UndefOr[String]) => CallbackTo[String] = null,
    getBorderWidth: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getBottom: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getById: (/* id */ js.UndefOr[String], /* asDom */ js.UndefOr[Boolean]) => Callback = null,
    getCenterXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getColor: (/* attr */ js.UndefOr[String], /* defaultValue */ js.UndefOr[String], /* prefix */ js.UndefOr[String]) => Callback = null,
    getComputedHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getComputedWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getFrameWidth: /* sides */ js.UndefOr[String] => CallbackTo[Double] = null,
    getHTML: js.UndefOr[Callback] = js.undefined,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLeft: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getLoader: js.UndefOr[CallbackTo[IElementLoader]] = js.undefined,
    getLocalX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLocalXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getLocalY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMargin: /* sides */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getPadding: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getPositioning: /* autoPx */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getRight: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getScroll: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getScrollLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollTop: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSize: /* contentSize */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getStyle: (/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getStyleSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTextWidth: (/* text */ js.UndefOr[String], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    getTop: /* local */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getValue: /* asNumber */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getViewSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    ghost: (/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    hasCls: /* className */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hide: /* animate */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    highlight: (/* color */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    hover: (/* overFn */ js.UndefOr[js.Any], /* outFn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    initDD: (/* group */ js.UndefOr[String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => CallbackTo[IDD] = null,
    initDDProxy: (/* group */ js.UndefOr[String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => CallbackTo[IDDProxy] = null,
    initDDTarget: (/* group */ js.UndefOr[String], /* config */ js.UndefOr[js.Any], /* overrides */ js.UndefOr[js.Any]) => CallbackTo[IDDTarget] = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    insertFirst: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    insertHtml: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    is: /* selector */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isBorderBox: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isDisplayed: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFocusable: /* asFocusEl */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isMasked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isScrollable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isStyle: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    isTransparent: /* prop */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isVisible: /* deep */ js.UndefOr[Boolean] => CallbackTo[Boolean] = null,
    last: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    load: /* options */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    mask: (/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    mixins: js.Any = null,
    monitorMouseLeave: (/* delay */ js.UndefOr[Double], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    moveTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    needsTabIndex: js.UndefOr[Callback] = js.undefined,
    next: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    on: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    originalDisplay: String = null,
    parent: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    pause: /* seconds */ js.UndefOr[Double] => CallbackTo[IElement] = null,
    position: (/* pos */ js.UndefOr[String], /* zIndex */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    prev: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    puff: /* options */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    purgeAllListeners: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    query: /* selector */ js.UndefOr[String] => CallbackTo[Array] = null,
    radioCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    relayEvent: (/* eventName */ js.UndefOr[String], /* observable */ js.UndefOr[js.Any]) => Callback = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeAllListeners: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    removeCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    repaint: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    replace: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    replaceCls: (/* oldClassName */ js.UndefOr[String], /* newClassName */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    requires: Array = null,
    scale: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    scroll: (/* direction */ js.UndefOr[String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    scrollBy: (/* deltaX */ js.UndefOr[js.Any], /* deltaY */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    scrollIntoView: (/* container */ js.UndefOr[js.Any], /* hscroll */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any], /* highlight */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    scrollTo: (/* side */ js.UndefOr[String], /* value */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    select: (/* selector */ js.UndefOr[String], /* unique */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.ICompositeElement] = null,
    selectable: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    set: (/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setBounds: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setDisplayed: /* value */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setHTML: /* html */ js.UndefOr[String] => CallbackTo[typingsJapgolly.extjs.Ext.IElement] = null,
    setHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setLeft: /* left */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setLeftTop: (/* left */ js.UndefOr[js.Any], /* top */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setLocation: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setOpacity: (/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setPositioning: /* posCfg */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setRight: /* right */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setScrollLeft: /* left */ js.UndefOr[Double] => CallbackTo[IElement] = null,
    setScrollTop: /* top */ js.UndefOr[Double] => CallbackTo[IElement] = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    setTop: /* top */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setVisible: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    shift: /* options */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    show: /* animate */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slideIn: (/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    slideOut: (/* anchor */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    statics: js.Any = null,
    swallowEvent: (/* eventName */ js.UndefOr[js.Any], /* preventDefault */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    switchOff: /* options */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    toggle: /* animate */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    toggleCls: /* className */ js.UndefOr[String] => CallbackTo[IElement] = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    unclip: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    unmask: js.UndefOr[Callback] = js.undefined,
    unselectable: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    up: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.IElement] = null,
    update: (/* html */ js.UndefOr[String], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], /* selector */ js.UndefOr[String]) => CallbackTo[js.Any] = null
  ): IElement = {
    val __obj = js.Dynamic.literal()
    if (ASCLASS != null) __obj.updateDynamic("ASCLASS")(ASCLASS.asInstanceOf[js.Any])
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => addCls(t0).runNow()))
    if (addClsOnClick != null) __obj.updateDynamic("addClsOnClick")(js.Any.fromFunction3((t0: /* className */ js.UndefOr[java.lang.String], t1: /* testFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addClsOnClick(t0, t1, t2).runNow()))
    if (addClsOnFocus != null) __obj.updateDynamic("addClsOnFocus")(js.Any.fromFunction3((t0: /* className */ js.UndefOr[java.lang.String], t1: /* testFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addClsOnFocus(t0, t1, t2).runNow()))
    if (addClsOnOver != null) __obj.updateDynamic("addClsOnOver")(js.Any.fromFunction3((t0: /* className */ js.UndefOr[java.lang.String], t1: /* testFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addClsOnOver(t0, t1, t2).runNow()))
    if (addKeyListener != null) __obj.updateDynamic("addKeyListener")(js.Any.fromFunction3((t0: /* key */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => addKeyListener(t0, t1, t2).runNow()))
    if (addKeyMap != null) __obj.updateDynamic("addKeyMap")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => addKeyMap(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => animate(t0).runNow()))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => appendChild(t0, t1).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => appendTo(t0).runNow()))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1((t0: /* styles */ js.UndefOr[js.Any]) => applyStyles(t0).runNow()))
    if (!js.isUndefined(autoBoxAdjust)) __obj.updateDynamic("autoBoxAdjust")(autoBoxAdjust.asInstanceOf[js.Any])
    blur.foreach(p => __obj.updateDynamic("blur")(p.toJsFn))
    if (boxWrap != null) __obj.updateDynamic("boxWrap")(js.Any.fromFunction1((t0: /* clazz */ js.UndefOr[java.lang.String]) => boxWrap(t0).runNow()))
    cacheScrollValues.foreach(p => __obj.updateDynamic("cacheScrollValues")(p.toJsFn))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (center != null) __obj.updateDynamic("center")(js.Any.fromFunction1((t0: /* centerIn */ js.UndefOr[js.Any]) => center(t0).runNow()))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => child(t0, t1).runNow()))
    if (clean != null) __obj.updateDynamic("clean")(js.Any.fromFunction1((t0: /* forceReclean */ js.UndefOr[scala.Boolean]) => clean(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearOpacity.foreach(p => __obj.updateDynamic("clearOpacity")(p.toJsFn))
    if (clearPositioning != null) __obj.updateDynamic("clearPositioning")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => clearPositioning(t0).runNow()))
    clip.foreach(p => __obj.updateDynamic("clip")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* insertBefore */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => createChild(t0, t1, t2).runNow()))
    if (createProxy != null) __obj.updateDynamic("createProxy")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* renderTo */ js.UndefOr[js.Any], t2: /* matchBox */ js.UndefOr[scala.Boolean]) => createProxy(t0, t1, t2).runNow()))
    createShim.foreach(p => __obj.updateDynamic("createShim")(p.toJsFn))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => down(t0, t1).runNow()))
    if (enableDisplayMode != null) __obj.updateDynamic("enableDisplayMode")(js.Any.fromFunction1((t0: /* display */ js.UndefOr[java.lang.String]) => enableDisplayMode(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => fadeIn(t0).runNow()))
    if (fadeOut != null) __obj.updateDynamic("fadeOut")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => fadeOut(t0).runNow()))
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParent(t0, t1, t2).runNow()))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParentNode(t0, t1, t2).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => first(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1((t0: /* defer */ js.UndefOr[scala.Double]) => focus(t0).runNow()))
    focusable.foreach(p => __obj.updateDynamic("focusable")(p.toJsFn))
    if (frame != null) __obj.updateDynamic("frame")(js.Any.fromFunction3((t0: /* color */ js.UndefOr[java.lang.String], t1: /* count */ js.UndefOr[scala.Double], t2: /* options */ js.UndefOr[js.Any]) => frame(t0, t1, t2).runNow()))
    getActiveElement.foreach(p => __obj.updateDynamic("getActiveElement")(p.toJsFn))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* namespace */ js.UndefOr[java.lang.String]) => getAttribute(t0, t1).runNow()))
    if (getAttributeNS != null) __obj.updateDynamic("getAttributeNS")(js.Any.fromFunction2((t0: /* namespace */ js.UndefOr[java.lang.String], t1: /* name */ js.UndefOr[java.lang.String]) => getAttributeNS(t0, t1).runNow()))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getBorderWidth(t0).runNow()))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getBottom(t0).runNow()))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* asDom */ js.UndefOr[scala.Boolean]) => getById(t0, t1).runNow()))
    getCenterXY.foreach(p => __obj.updateDynamic("getCenterXY")(p.toJsFn))
    if (getColor != null) __obj.updateDynamic("getColor")(js.Any.fromFunction3((t0: /* attr */ js.UndefOr[java.lang.String], t1: /* defaultValue */ js.UndefOr[java.lang.String], t2: /* prefix */ js.UndefOr[java.lang.String]) => getColor(t0, t1, t2).runNow()))
    getComputedHeight.foreach(p => __obj.updateDynamic("getComputedHeight")(p.toJsFn))
    getComputedWidth.foreach(p => __obj.updateDynamic("getComputedWidth")(p.toJsFn))
    if (getFrameWidth != null) __obj.updateDynamic("getFrameWidth")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getFrameWidth(t0).runNow()))
    getHTML.foreach(p => __obj.updateDynamic("getHTML")(p.toJsFn))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1((t0: /* contentHeight */ js.UndefOr[scala.Boolean]) => getHeight(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getLeft(t0).runNow()))
    getLoader.foreach(p => __obj.updateDynamic("getLoader")(p.toJsFn))
    getLocalX.foreach(p => __obj.updateDynamic("getLocalX")(p.toJsFn))
    getLocalXY.foreach(p => __obj.updateDynamic("getLocalXY")(p.toJsFn))
    getLocalY.foreach(p => __obj.updateDynamic("getLocalY")(p.toJsFn))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getMargin(t0).runNow()))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getPadding(t0).runNow()))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1((t0: /* asRegion */ js.UndefOr[scala.Boolean]) => getPageBox(t0).runNow()))
    if (getPositioning != null) __obj.updateDynamic("getPositioning")(js.Any.fromFunction1((t0: /* autoPx */ js.UndefOr[scala.Boolean]) => getPositioning(t0).runNow()))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getRight(t0).runNow()))
    getScroll.foreach(p => __obj.updateDynamic("getScroll")(p.toJsFn))
    getScrollLeft.foreach(p => __obj.updateDynamic("getScrollLeft")(p.toJsFn))
    getScrollTop.foreach(p => __obj.updateDynamic("getScrollTop")(p.toJsFn))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1((t0: /* contentSize */ js.UndefOr[scala.Boolean]) => getSize(t0).runNow()))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* inline */ js.UndefOr[scala.Boolean]) => getStyle(t0, t1).runNow()))
    getStyleSize.foreach(p => __obj.updateDynamic("getStyleSize")(p.toJsFn))
    if (getTextWidth != null) __obj.updateDynamic("getTextWidth")(js.Any.fromFunction3((t0: /* text */ js.UndefOr[java.lang.String], t1: /* min */ js.UndefOr[scala.Double], t2: /* max */ js.UndefOr[scala.Double]) => getTextWidth(t0, t1, t2).runNow()))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getTop(t0).runNow()))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: /* asNumber */ js.UndefOr[scala.Boolean]) => getValue(t0).runNow()))
    getViewSize.foreach(p => __obj.updateDynamic("getViewSize")(p.toJsFn))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1((t0: /* contentWidth */ js.UndefOr[scala.Boolean]) => getWidth(t0).runNow()))
    getX.foreach(p => __obj.updateDynamic("getX")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getY.foreach(p => __obj.updateDynamic("getY")(p.toJsFn))
    if (ghost != null) __obj.updateDynamic("ghost")(js.Any.fromFunction2((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => ghost(t0, t1).runNow()))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => hasCls(t0).runNow()))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => hide(t0).runNow()))
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction2((t0: /* color */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => highlight(t0, t1).runNow()))
    if (hover != null) __obj.updateDynamic("hover")(js.Any.fromFunction4((t0: /* overFn */ js.UndefOr[js.Any], t1: /* outFn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => hover(t0, t1, t2, t3).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (initDD != null) __obj.updateDynamic("initDD")(js.Any.fromFunction3((t0: /* group */ js.UndefOr[java.lang.String], t1: /* config */ js.UndefOr[js.Any], t2: /* overrides */ js.UndefOr[js.Any]) => initDD(t0, t1, t2).runNow()))
    if (initDDProxy != null) __obj.updateDynamic("initDDProxy")(js.Any.fromFunction3((t0: /* group */ js.UndefOr[java.lang.String], t1: /* config */ js.UndefOr[js.Any], t2: /* overrides */ js.UndefOr[js.Any]) => initDDProxy(t0, t1, t2).runNow()))
    if (initDDTarget != null) __obj.updateDynamic("initDDTarget")(js.Any.fromFunction3((t0: /* group */ js.UndefOr[java.lang.String], t1: /* config */ js.UndefOr[js.Any], t2: /* overrides */ js.UndefOr[js.Any]) => initDDTarget(t0, t1, t2).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertAfter(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertBefore(t0).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertFirst(t0).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3((t0: /* where */ js.UndefOr[java.lang.String], t1: /* html */ js.UndefOr[java.lang.String], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => insertHtml(t0, t1, t2).runNow()))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* where */ js.UndefOr[java.lang.String], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => insertSibling(t0, t1, t2).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    isBorderBox.foreach(p => __obj.updateDynamic("isBorderBox")(p.toJsFn))
    isDisplayed.foreach(p => __obj.updateDynamic("isDisplayed")(p.toJsFn))
    if (isFocusable != null) __obj.updateDynamic("isFocusable")(js.Any.fromFunction1((t0: /* asFocusEl */ js.UndefOr[js.Any]) => isFocusable(t0).runNow()))
    isMasked.foreach(p => __obj.updateDynamic("isMasked")(p.toJsFn))
    isScrollable.foreach(p => __obj.updateDynamic("isScrollable")(p.toJsFn))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2((t0: /* style */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[java.lang.String]) => isStyle(t0, t1).runNow()))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => isTransparent(t0).runNow()))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction1((t0: /* deep */ js.UndefOr[scala.Boolean]) => isVisible(t0).runNow()))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => last(t0, t1).runNow()))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => load(t0).runNow()))
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction2((t0: /* msg */ js.UndefOr[java.lang.String], t1: /* msgCls */ js.UndefOr[java.lang.String]) => mask(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (monitorMouseLeave != null) __obj.updateDynamic("monitorMouseLeave")(js.Any.fromFunction3((t0: /* delay */ js.UndefOr[scala.Double], t1: /* handler */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => monitorMouseLeave(t0, t1, t2).runNow()))
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => moveTo(t0, t1, t2).runNow()))
    needsTabIndex.foreach(p => __obj.updateDynamic("needsTabIndex")(p.toJsFn))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => next(t0, t1).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (originalDisplay != null) __obj.updateDynamic("originalDisplay")(originalDisplay.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => parent(t0, t1).runNow()))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: /* seconds */ js.UndefOr[scala.Double]) => pause(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction4((t0: /* pos */ js.UndefOr[java.lang.String], t1: /* zIndex */ js.UndefOr[scala.Double], t2: /* x */ js.UndefOr[scala.Double], t3: /* y */ js.UndefOr[scala.Double]) => position(t0, t1, t2, t3).runNow()))
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => prev(t0, t1).runNow()))
    if (puff != null) __obj.updateDynamic("puff")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => puff(t0).runNow()))
    purgeAllListeners.foreach(p => __obj.updateDynamic("purgeAllListeners")(p.toJsFn))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => radioCls(t0).runNow()))
    if (relayEvent != null) __obj.updateDynamic("relayEvent")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* observable */ js.UndefOr[js.Any]) => relayEvent(t0, t1).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    removeAllListeners.foreach(p => __obj.updateDynamic("removeAllListeners")(p.toJsFn))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => removeCls(t0).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    repaint.foreach(p => __obj.updateDynamic("repaint")(p.toJsFn))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replace(t0).runNow()))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction2((t0: /* oldClassName */ js.UndefOr[java.lang.String], t1: /* newClassName */ js.UndefOr[java.lang.String]) => replaceCls(t0, t1).runNow()))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replaceWith(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction3((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double], t2: /* options */ js.UndefOr[js.Any]) => scale(t0, t1, t2).runNow()))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction3((t0: /* direction */ js.UndefOr[java.lang.String], t1: /* distance */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => scroll(t0, t1, t2).runNow()))
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction3((t0: /* deltaX */ js.UndefOr[js.Any], t1: /* deltaY */ js.UndefOr[js.Any], t2: /* animate */ js.UndefOr[js.Any]) => scrollBy(t0, t1, t2).runNow()))
    if (scrollIntoView != null) __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction4((t0: /* container */ js.UndefOr[js.Any], t1: /* hscroll */ js.UndefOr[scala.Boolean], t2: /* animate */ js.UndefOr[js.Any], t3: /* highlight */ js.UndefOr[scala.Boolean]) => scrollIntoView(t0, t1, t2, t3).runNow()))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction3((t0: /* side */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => scrollTo(t0, t1, t2).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* unique */ js.UndefOr[scala.Boolean]) => select(t0, t1).runNow()))
    selectable.foreach(p => __obj.updateDynamic("selectable")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1((t0: /* form */ js.UndefOr[js.Any]) => serializeForm(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* o */ js.UndefOr[js.Any], t1: /* useSet */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[js.Any]) => setBottom(t0).runNow()))
    if (setBounds != null) __obj.updateDynamic("setBounds")(js.Any.fromFunction5((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* width */ js.UndefOr[js.Any], t3: /* height */ js.UndefOr[js.Any], t4: /* animate */ js.UndefOr[js.Any]) => setBounds(t0, t1, t2, t3, t4).runNow()))
    if (setDisplayed != null) __obj.updateDynamic("setDisplayed")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setDisplayed(t0).runNow()))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHTML(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setHeight(t0).runNow()))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[js.Any]) => setLeft(t0).runNow()))
    if (setLeftTop != null) __obj.updateDynamic("setLeftTop")(js.Any.fromFunction2((t0: /* left */ js.UndefOr[js.Any], t1: /* top */ js.UndefOr[js.Any]) => setLeftTop(t0, t1).runNow()))
    if (setLocation != null) __obj.updateDynamic("setLocation")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => setLocation(t0, t1, t2).runNow()))
    if (setOpacity != null) __obj.updateDynamic("setOpacity")(js.Any.fromFunction2((t0: /* opacity */ js.UndefOr[scala.Double], t1: /* animate */ js.UndefOr[js.Any]) => setOpacity(t0, t1).runNow()))
    if (setPositioning != null) __obj.updateDynamic("setPositioning")(js.Any.fromFunction1((t0: /* posCfg */ js.UndefOr[js.Any]) => setPositioning(t0).runNow()))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1((t0: /* right */ js.UndefOr[js.Any]) => setRight(t0).runNow()))
    if (setScrollLeft != null) __obj.updateDynamic("setScrollLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[scala.Double]) => setScrollLeft(t0).runNow()))
    if (setScrollTop != null) __obj.updateDynamic("setScrollTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[scala.Double]) => setScrollTop(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any]) => setSize(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => setStyle(t0, t1).runNow()))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[js.Any]) => setTop(t0).runNow()))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1((t0: /* mode */ js.UndefOr[js.Any]) => setVisibilityMode(t0).runNow()))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction2((t0: /* visible */ js.UndefOr[scala.Boolean], t1: /* animate */ js.UndefOr[js.Any]) => setVisible(t0, t1).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setWidth(t0).runNow()))
    if (shift != null) __obj.updateDynamic("shift")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => shift(t0).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => show(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slideIn != null) __obj.updateDynamic("slideIn")(js.Any.fromFunction2((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => slideIn(t0, t1).runNow()))
    if (slideOut != null) __obj.updateDynamic("slideOut")(js.Any.fromFunction2((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* options */ js.UndefOr[js.Any]) => slideOut(t0, t1).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (swallowEvent != null) __obj.updateDynamic("swallowEvent")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[js.Any], t1: /* preventDefault */ js.UndefOr[scala.Boolean]) => swallowEvent(t0, t1).runNow()))
    if (switchOff != null) __obj.updateDynamic("switchOff")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => switchOff(t0).runNow()))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => toggle(t0).runNow()))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => toggleCls(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    unclip.foreach(p => __obj.updateDynamic("unclip")(p.toJsFn))
    unmask.foreach(p => __obj.updateDynamic("unmask")(p.toJsFn))
    unselectable.foreach(p => __obj.updateDynamic("unselectable")(p.toJsFn))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => up(t0, t1, t2).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* html */ js.UndefOr[java.lang.String], t1: /* loadScripts */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any]) => update(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* returnDom */ js.UndefOr[scala.Boolean], t2: /* selector */ js.UndefOr[java.lang.String]) => wrap(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IElement]
  }
}

