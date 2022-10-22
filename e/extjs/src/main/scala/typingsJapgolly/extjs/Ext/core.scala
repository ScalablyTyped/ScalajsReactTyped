package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.dd.IDD
import typingsJapgolly.extjs.Ext.dd.IDDProxy
import typingsJapgolly.extjs.Ext.dd.IDDTarget
import typingsJapgolly.extjs.Ext.dom.IAbstractElement
import typingsJapgolly.extjs.Ext.dom.IHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  trait DomHelper extends StObject
  
  trait DomQuery extends StObject
  
  trait Element extends StObject
  
  type IDomHelper = IHelper
  
  trait IDomQuery extends StObject
  
  trait IElement
    extends StObject
       with IAbstractElement {
    
    /** [Method] Sets up event handlers to add and remove a css class when the mouse is down and then up on this element a click effe
      * @param className String The class to add
      * @param testFn Function A test function to execute before adding the class. The passed parameter will be the Element instance. If this functions returns false, the class will not be added.
      * @param scope Object The scope to execute the testFn in.
      * @returns Ext.dom.Element this
      */
    var addClsOnClick: js.UndefOr[
        js.Function3[
          /* className */ js.UndefOr[java.lang.String], 
          /* testFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
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
          /* className */ js.UndefOr[java.lang.String], 
          /* testFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
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
          /* className */ js.UndefOr[java.lang.String], 
          /* testFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
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
          /* key */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          typingsJapgolly.extjs.Ext.util.IKeyMap
        ]
      ] = js.undefined
    
    /** [Method] Creates a KeyMap for this element
      * @param config Object The KeyMap config. See Ext.util.KeyMap for more details
      * @returns Ext.util.KeyMap The KeyMap created
      */
    var addKeyMap: js.UndefOr[
        js.Function1[/* config */ js.UndefOr[Any], typingsJapgolly.extjs.Ext.util.IKeyMap]
      ] = js.undefined
    
    /** [Method] Shorthand for on
      * @param eventName String The name of event to handle.
      * @param fn Function The handler function the event invokes. This function is passed the following parameters: evt : EventObject The EventObject describing the event. el : HtmlElement The DOM element which was the target of the event. Note that this may be filtered by using the delegate option. o : Object The options object from the call that setup the listener.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element.
      * @param options Object An object containing handler configuration properties. This may contain any of the following properties: scope Object : The scope (this reference) in which the handler function is executed. If omitted, defaults to this Element. delegate String: A simple selector to filter the target or look for a descendant of the target. See below for additional details. stopEvent Boolean: True to stop the event. That is stop propagation, and prevent the default action. preventDefault Boolean: True to prevent the default action stopPropagation Boolean: True to prevent event propagation normalized Boolean: False to pass a browser event to the handler function instead of an Ext.EventObject target Ext.dom.Element: Only call the handler if the event was fired on the target Element, not if the event was bubbled up from a child node. delay Number: The number of milliseconds to delay the invocation of the handler after the event fires. single Boolean: True to add a handler to handle just the next firing of the event, and then remove itself. buffer Number: Causes the handler to be scheduled to run in an Ext.util.DelayedTask delayed by the specified number of milliseconds. If the event fires again within that time, the original handler is not invoked, but the new handler is scheduled in its place. Combining Options  Using the options argument, it is possible to combine different types of listeners:  A delayed, one-time listener that auto stops the event and adds a custom argument (forumId) to the options object. The options object is available as the third parameter in the handler function.  Code:  el.on('click', this.onClick, this, {  single: true,  delay: 100,  stopEvent : true,  forumId: 4 }); Attaching multiple handlers in 1 call  The method also allows for a single argument to be passed which is a config object containing properties which specify multiple handlers.  Code:  el.on({  'click' : {  fn: this.onClick,  scope: this,  delay: 100  },  'mouseover' : {  fn: this.onMouseOver,  scope: this  },  'mouseout' : {  fn: this.onMouseOut,  scope: this  } }); Or a shorthand syntax:  Code:  el.on({  'click' : this.onClick,  'mouseover' : this.onMouseOver,  'mouseout' : this.onMouseOut,  scope: this }); delegate  This is a configuration option that you can pass along when registering a handler for an event to assist with event delegation. Event delegation is a technique that is used to reduce memory consumption and prevent exposure to memory-leaks. By registering an event for a container element as opposed to each element within a container. By setting this configuration option to a simple selector, the target element will be filtered to look for a descendant of the target. For example:  // using this markup: &lt;div id='elId'&gt;  &lt;p id='p1'&gt;paragraph one&lt;/p&gt;  &lt;p id='p2' class='clickable'&gt;paragraph two&lt;/p&gt;  &lt;p id='p3'&gt;paragraph three&lt;/p&gt; &lt;/div&gt; // utilize event delegation to registering just one handler on the container element: el = Ext.get('elId'); el.on(  'click',  function(e,t) {  // handle click  console.info(t.id); // 'p2'  },  this,  {  // filter the target element to be a descendant with the class 'clickable'  delegate: '.clickable'  } );
      * @returns Ext.dom.Element this
      */
    var addListener: js.UndefOr[
        js.Function4[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Performs custom animation on this Element
      * @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
      * @returns Ext.dom.Element this
      */
    var animate: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], this.type]] = js.undefined
    
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
    var boxWrap: js.UndefOr[js.Function1[/* clazz */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] When an element is moved around in the DOM or is hidden using display none it loses layout and therefore all scrol
      * @returns Function A function which will restore all descentant elements of this Element to their scroll positions recorded when this function was executed. Be aware that the returned function is a closure which has captured the scope of cacheScrollValues, so take care to derefence it as soon as not needed - if is it is a var it will drop out of scope, and the reference will be freed.
      */
    var cacheScrollValues: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Centers the Element in either the viewport or another Element
      * @param centerIn String/HTMLElement/Ext.dom.Element element in which to center the element.
      */
    var center: js.UndefOr[js.Function1[/* centerIn */ js.UndefOr[Any], Unit]] = js.undefined
    
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
    var clearPositioning: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
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
          /* config */ js.UndefOr[Any], 
          /* renderTo */ js.UndefOr[Any], 
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
    var enableDisplayMode: js.UndefOr[js.Function1[/* display */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Fade an element in from transparent to opaque
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var fadeIn: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Fade an element out from opaque to transparent
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var fadeOut: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
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
          /* color */ js.UndefOr[java.lang.String], 
          /* count */ js.UndefOr[Double], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Returns the value of a namespaced attribute from the element s underlying DOM node
      * @param namespace String The namespace in which to look for the attribute
      * @param name String The attribute name
      * @returns String The attribute value
      */
    var getAttributeNS: js.UndefOr[
        js.Function2[
          /* namespace */ js.UndefOr[java.lang.String], 
          /* name */ js.UndefOr[java.lang.String], 
          java.lang.String
        ]
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
          /* attr */ js.UndefOr[java.lang.String], 
          /* defaultValue */ js.UndefOr[java.lang.String], 
          /* prefix */ js.UndefOr[java.lang.String], 
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
    var getFrameWidth: js.UndefOr[js.Function1[/* sides */ js.UndefOr[java.lang.String], Double]] = js.undefined
    
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
    var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], Any]] = js.undefined
    
    /** [Method] Gets an object with all CSS positioning properties
      * @param autoPx Boolean true to return pixel values for "auto" styles.
      * @returns Object
      */
    var getPositioning: js.UndefOr[js.Function1[/* autoPx */ js.UndefOr[Boolean], Any]] = js.undefined
    
    /** [Method] Gets the right X coordinate of the element element X position  element width  Defined in override Ext dom Element_
      * @param local Boolean True to get the local css position instead of page coordinates
      * @returns Number
      */
    var getRight: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Double]] = js.undefined
    
    /** [Method] Returns the current scroll position of the element
      * @returns Object An object containing the scroll position in the format {left: (scrollLeft), top: (scrollTop)}
      */
    var getScroll: js.UndefOr[js.Function0[Any]] = js.undefined
    
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
    var getStyleSize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the width in pixels of the passed text or the width of the text in this Element
      * @param text String The text to measure. Defaults to the innerHTML of the element.
      * @param min Number The minumum value to return.
      * @param max Number The maximum value to return.
      * @returns Number The text width in pixels.
      */
    var getTextWidth: js.UndefOr[
        js.Function3[
          /* text */ js.UndefOr[java.lang.String], 
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
        js.Function2[/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Hide this element  Uses display mode to determine whether to use display or visibility
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    @JSName("hide")
    var hide_IElement: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Highlights the Element by setting a color applies to the background color by default but can be changed using the
      * @param color String The highlight color. Should be a 6 char hex color without the leading # (defaults to yellow: 'ffff9c')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var highlight: js.UndefOr[
        js.Function2[/* color */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
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
          /* overFn */ js.UndefOr[Any], 
          /* outFn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
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
          /* group */ js.UndefOr[java.lang.String], 
          /* config */ js.UndefOr[Any], 
          /* overrides */ js.UndefOr[Any], 
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
          /* group */ js.UndefOr[java.lang.String], 
          /* config */ js.UndefOr[Any], 
          /* overrides */ js.UndefOr[Any], 
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
          /* group */ js.UndefOr[java.lang.String], 
          /* config */ js.UndefOr[Any], 
          /* overrides */ js.UndefOr[Any], 
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
    var isFocusable: js.UndefOr[js.Function1[/* asFocusEl */ js.UndefOr[Any], Boolean]] = js.undefined
    
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
    var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Puts a mask over this element to disable user interaction
      * @param msg String A message to display in the mask
      * @param msgCls String A css class to apply to the msg element
      * @returns Ext.dom.Element The mask element
      */
    @JSName("mask")
    var mask_IElement: js.UndefOr[
        js.Function2[
          /* msg */ js.UndefOr[java.lang.String], 
          /* msgCls */ js.UndefOr[java.lang.String], 
          this.type
        ]
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
          /* handler */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Any
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
          /* animate */ js.UndefOr[Any], 
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
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Property] (String) */
    var originalDisplay: js.UndefOr[java.lang.String] = js.undefined
    
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
          /* pos */ js.UndefOr[java.lang.String], 
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
    var puff: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Recursively removes all previous added listeners from this element and its children
      * @returns Ext.dom.Element this
      */
    var purgeAllListeners: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Create an event handler on this element such that when the event fires and is handled by this element it will be rel
      * @param eventName String The type of event to relay
      * @param observable Object Any object that extends Ext.util.Observable that will provide the context for firing the relayed event
      */
    var relayEvent: js.UndefOr[
        js.Function2[/* eventName */ js.UndefOr[java.lang.String], /* observable */ js.UndefOr[Any], Unit]
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
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
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
          /* options */ js.UndefOr[Any], 
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
          /* direction */ js.UndefOr[java.lang.String], 
          /* distance */ js.UndefOr[Double], 
          /* animate */ js.UndefOr[Any], 
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
          /* deltaX */ js.UndefOr[Any], 
          /* deltaY */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
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
          /* container */ js.UndefOr[Any], 
          /* hscroll */ js.UndefOr[Boolean], 
          /* animate */ js.UndefOr[Any], 
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
          /* side */ js.UndefOr[java.lang.String], 
          /* value */ js.UndefOr[Double], 
          /* animate */ js.UndefOr[Any], 
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
    var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Any], this.type]] = js.undefined
    
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
          /* width */ js.UndefOr[Any], 
          /* height */ js.UndefOr[Any], 
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Sets the CSS display property
      * @param value Boolean/String Boolean value to display the element using its default display, or a string to set the display directly.
      * @returns Ext.dom.Element this
      */
    var setDisplayed: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s left position directly using CSS style instead of setX
      * @param left Number/String Number of pixels or CSS string value to set as the left CSS property value
      * @returns Ext.dom.Element this
      */
    var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s left and top positions directly using CSS style Defined in override Ext dom Element_position
      * @param left Number/String Number of pixels or CSS string value to set as the left CSS property value
      * @param top Number/String Number of pixels or CSS string value to set as the top CSS property value
      * @returns Ext.dom.Element this
      */
    var setLeftTop: js.UndefOr[js.Function2[/* left */ js.UndefOr[Any], /* top */ js.UndefOr[Any], this.type]] = js.undefined
    
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
          /* animate */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Set the opacity of the element Defined in override Ext dom Element_style
      * @param opacity Number The new opacity. 0 = transparent, .5 = 50% visibile, 1 = fully visible, etc
      * @param animate Boolean/Object a standard Element animation config object or true for the default animation ({duration: 350, easing: 'easeIn'})
      * @returns Ext.dom.Element this
      */
    var setOpacity: js.UndefOr[
        js.Function2[/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Set positioning with an object returned by getPositioning
      * @param posCfg Object
      * @returns Ext.dom.Element this
      */
    var setPositioning: js.UndefOr[js.Function1[/* posCfg */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the element s CSS right style
      * @param right Number/String Number of pixels or CSS string value to set as the right CSS property value
      * @returns Ext.dom.Element this
      */
    var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[Any], this.type]] = js.undefined
    
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
    var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the visibility of the element see details
      * @param visible Boolean Whether the element is visible
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    @JSName("setVisible")
    var setVisible_IElement: js.UndefOr[
        js.Function2[/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Animates the transition of any combination of an element s dimensions xy position and or opacity
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.Element The Element
      */
    var shift: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Show this element  Uses display mode to determine whether to use display or visibility
      * @param animate Boolean/Object true for the default animation or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    @JSName("show")
    var show_IElement: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Slides the element into view
      * @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to top: 't')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var slideIn: js.UndefOr[
        js.Function2[/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Slides the element out of view
      * @param anchor String One of the valid Ext.fx.Anim anchor positions (defaults to top: 't')
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var slideOut: js.UndefOr[
        js.Function2[/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any], this.type]
      ] = js.undefined
    
    /** [Method] Stops the specified event s from bubbling and optionally prevents the default action
      * @param eventName String/String[] an event / array of events to stop from bubbling
      * @param preventDefault Boolean true to prevent the default action too
      * @returns Ext.dom.Element this
      */
    var swallowEvent: js.UndefOr[
        js.Function2[/* eventName */ js.UndefOr[Any], /* preventDefault */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Method] Blinks the element as if it was clicked and then collapses on its center similar to switching off a television
      * @param options Object Object literal with any of the Ext.fx.Anim config options
      * @returns Ext.dom.Element The Element
      */
    var switchOff: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Toggles the element s visibility or display depending on visibility mode
      * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
      * @returns Ext.dom.Element this
      */
    var toggle: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Removes an event handler from this element
      * @param eventName String The name of the event from which to remove the handler.
      * @param fn Function The handler function to remove. This must be a reference to the function passed into the on call.
      * @param scope Object If a scope (this reference) was specified when the listener was added, then this must refer to the same object.
      * @returns Ext.dom.Element this
      */
    var un: js.UndefOr[
        js.Function3[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
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
          /* html */ js.UndefOr[java.lang.String], 
          /* loadScripts */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
  }
  object IElement {
    
    inline def apply(): typingsJapgolly.extjs.Ext.core.IElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.extjs.Ext.core.IElement]
    }
    
    extension [Self <: typingsJapgolly.extjs.Ext.core.IElement](x: Self) {
      
      inline def setAddClsOnClick(
        value: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "addClsOnClick", js.Any.fromFunction3(value))
      
      inline def setAddClsOnClickUndefined: Self = StObject.set(x, "addClsOnClick", js.undefined)
      
      inline def setAddClsOnFocus(
        value: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "addClsOnFocus", js.Any.fromFunction3(value))
      
      inline def setAddClsOnFocusUndefined: Self = StObject.set(x, "addClsOnFocus", js.undefined)
      
      inline def setAddClsOnOver(
        value: (/* className */ js.UndefOr[java.lang.String], /* testFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "addClsOnOver", js.Any.fromFunction3(value))
      
      inline def setAddClsOnOverUndefined: Self = StObject.set(x, "addClsOnOver", js.undefined)
      
      inline def setAddKeyListener(
        value: (/* key */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.util.IKeyMap
      ): Self = StObject.set(x, "addKeyListener", js.Any.fromFunction3(value))
      
      inline def setAddKeyListenerUndefined: Self = StObject.set(x, "addKeyListener", js.undefined)
      
      inline def setAddKeyMap(value: /* config */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.util.IKeyMap): Self = StObject.set(x, "addKeyMap", js.Any.fromFunction1(value))
      
      inline def setAddKeyMapUndefined: Self = StObject.set(x, "addKeyMap", js.undefined)
      
      inline def setAddListener(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setAnimate(value: /* config */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutoBoxAdjust(value: Boolean): Self = StObject.set(x, "autoBoxAdjust", value.asInstanceOf[js.Any])
      
      inline def setAutoBoxAdjustUndefined: Self = StObject.set(x, "autoBoxAdjust", js.undefined)
      
      inline def setBlur(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setBoxWrap(value: /* clazz */ js.UndefOr[java.lang.String] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "boxWrap", js.Any.fromFunction1(value))
      
      inline def setBoxWrapUndefined: Self = StObject.set(x, "boxWrap", js.undefined)
      
      inline def setCacheScrollValues(value: CallbackTo[Any]): Self = StObject.set(x, "cacheScrollValues", value.toJsFn)
      
      inline def setCacheScrollValuesUndefined: Self = StObject.set(x, "cacheScrollValues", js.undefined)
      
      inline def setCenter(value: /* centerIn */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "center", js.Any.fromFunction1((t0: /* centerIn */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setClean(value: /* forceReclean */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "clean", js.Any.fromFunction1((t0: /* forceReclean */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setClearListeners(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "clearListeners", value.toJsFn)
      
      inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
      
      inline def setClearOpacity(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "clearOpacity", value.toJsFn)
      
      inline def setClearOpacityUndefined: Self = StObject.set(x, "clearOpacity", js.undefined)
      
      inline def setClearPositioning(value: /* value */ js.UndefOr[java.lang.String] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "clearPositioning", js.Any.fromFunction1(value))
      
      inline def setClearPositioningUndefined: Self = StObject.set(x, "clearPositioning", js.undefined)
      
      inline def setClip(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "clip", value.toJsFn)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setCreateProxy(
        value: (/* config */ js.UndefOr[Any], /* renderTo */ js.UndefOr[Any], /* matchBox */ js.UndefOr[Boolean]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "createProxy", js.Any.fromFunction3(value))
      
      inline def setCreateProxyUndefined: Self = StObject.set(x, "createProxy", js.undefined)
      
      inline def setCreateShim(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "createShim", value.toJsFn)
      
      inline def setCreateShimUndefined: Self = StObject.set(x, "createShim", js.undefined)
      
      inline def setEnableDisplayMode(value: /* display */ js.UndefOr[java.lang.String] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "enableDisplayMode", js.Any.fromFunction1(value))
      
      inline def setEnableDisplayModeUndefined: Self = StObject.set(x, "enableDisplayMode", js.undefined)
      
      inline def setFadeIn(value: /* options */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "fadeIn", js.Any.fromFunction1(value))
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setFadeOut(value: /* options */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "fadeOut", js.Any.fromFunction1(value))
      
      inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      inline def setFocus(value: /* defer */ js.UndefOr[Double] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFocusable(value: CallbackTo[Boolean]): Self = StObject.set(x, "focusable", value.toJsFn)
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFrame(
        value: (/* color */ js.UndefOr[java.lang.String], /* count */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "frame", js.Any.fromFunction3(value))
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setGetAttributeNS(
        value: (/* namespace */ js.UndefOr[java.lang.String], /* name */ js.UndefOr[java.lang.String]) => java.lang.String
      ): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
      
      inline def setGetAttributeNSUndefined: Self = StObject.set(x, "getAttributeNS", js.undefined)
      
      inline def setGetBottom(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction1(value))
      
      inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
      
      inline def setGetCenterXY(value: CallbackTo[Array]): Self = StObject.set(x, "getCenterXY", value.toJsFn)
      
      inline def setGetCenterXYUndefined: Self = StObject.set(x, "getCenterXY", js.undefined)
      
      inline def setGetColor(
        value: (/* attr */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String]) => Callback
      ): Self = StObject.set(x, "getColor", js.Any.fromFunction3((t0: /* attr */ js.UndefOr[java.lang.String], t1: /* defaultValue */ js.UndefOr[java.lang.String], t2: /* prefix */ js.UndefOr[java.lang.String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
      
      inline def setGetComputedHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getComputedHeight", value.toJsFn)
      
      inline def setGetComputedHeightUndefined: Self = StObject.set(x, "getComputedHeight", js.undefined)
      
      inline def setGetComputedWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getComputedWidth", value.toJsFn)
      
      inline def setGetComputedWidthUndefined: Self = StObject.set(x, "getComputedWidth", js.undefined)
      
      inline def setGetFrameWidth(value: /* sides */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "getFrameWidth", js.Any.fromFunction1(value))
      
      inline def setGetFrameWidthUndefined: Self = StObject.set(x, "getFrameWidth", js.undefined)
      
      inline def setGetLeft(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getLeft", js.Any.fromFunction1(value))
      
      inline def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
      
      inline def setGetLoader(value: CallbackTo[IElementLoader]): Self = StObject.set(x, "getLoader", value.toJsFn)
      
      inline def setGetLoaderUndefined: Self = StObject.set(x, "getLoader", js.undefined)
      
      inline def setGetLocalX(value: CallbackTo[Double]): Self = StObject.set(x, "getLocalX", value.toJsFn)
      
      inline def setGetLocalXUndefined: Self = StObject.set(x, "getLocalX", js.undefined)
      
      inline def setGetLocalXY(value: CallbackTo[Array]): Self = StObject.set(x, "getLocalXY", value.toJsFn)
      
      inline def setGetLocalXYUndefined: Self = StObject.set(x, "getLocalXY", js.undefined)
      
      inline def setGetLocalY(value: CallbackTo[Double]): Self = StObject.set(x, "getLocalY", value.toJsFn)
      
      inline def setGetLocalYUndefined: Self = StObject.set(x, "getLocalY", js.undefined)
      
      inline def setGetPageBox(value: /* asRegion */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getPageBox", js.Any.fromFunction1(value))
      
      inline def setGetPageBoxUndefined: Self = StObject.set(x, "getPageBox", js.undefined)
      
      inline def setGetPositioning(value: /* autoPx */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "getPositioning", js.Any.fromFunction1(value))
      
      inline def setGetPositioningUndefined: Self = StObject.set(x, "getPositioning", js.undefined)
      
      inline def setGetRight(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getRight", js.Any.fromFunction1(value))
      
      inline def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
      
      inline def setGetScroll(value: CallbackTo[Any]): Self = StObject.set(x, "getScroll", value.toJsFn)
      
      inline def setGetScrollLeft(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollLeft", value.toJsFn)
      
      inline def setGetScrollLeftUndefined: Self = StObject.set(x, "getScrollLeft", js.undefined)
      
      inline def setGetScrollTop(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollTop", value.toJsFn)
      
      inline def setGetScrollTopUndefined: Self = StObject.set(x, "getScrollTop", js.undefined)
      
      inline def setGetScrollUndefined: Self = StObject.set(x, "getScroll", js.undefined)
      
      inline def setGetStyleSize(value: CallbackTo[Any]): Self = StObject.set(x, "getStyleSize", value.toJsFn)
      
      inline def setGetStyleSizeUndefined: Self = StObject.set(x, "getStyleSize", js.undefined)
      
      inline def setGetTextWidth(
        value: (/* text */ js.UndefOr[java.lang.String], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "getTextWidth", js.Any.fromFunction3(value))
      
      inline def setGetTextWidthUndefined: Self = StObject.set(x, "getTextWidth", js.undefined)
      
      inline def setGetTop(value: /* local */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "getTop", js.Any.fromFunction1(value))
      
      inline def setGetTopUndefined: Self = StObject.set(x, "getTop", js.undefined)
      
      inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
      
      inline def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
      
      inline def setGetXY(value: CallbackTo[Array]): Self = StObject.set(x, "getXY", value.toJsFn)
      
      inline def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
      
      inline def setGetY(value: CallbackTo[Double]): Self = StObject.set(x, "getY", value.toJsFn)
      
      inline def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
      
      inline def setGhost(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "ghost", js.Any.fromFunction2(value))
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setHide(value: /* animate */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHighlight(
        value: (/* color */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "highlight", js.Any.fromFunction2(value))
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setHover(
        value: (/* overFn */ js.UndefOr[Any], /* outFn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "hover", js.Any.fromFunction4(value))
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setInitDD(
        value: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[Any], /* overrides */ js.UndefOr[Any]) => IDD
      ): Self = StObject.set(x, "initDD", js.Any.fromFunction3(value))
      
      inline def setInitDDProxy(
        value: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[Any], /* overrides */ js.UndefOr[Any]) => IDDProxy
      ): Self = StObject.set(x, "initDDProxy", js.Any.fromFunction3(value))
      
      inline def setInitDDProxyUndefined: Self = StObject.set(x, "initDDProxy", js.undefined)
      
      inline def setInitDDTarget(
        value: (/* group */ js.UndefOr[java.lang.String], /* config */ js.UndefOr[Any], /* overrides */ js.UndefOr[Any]) => IDDTarget
      ): Self = StObject.set(x, "initDDTarget", js.Any.fromFunction3(value))
      
      inline def setInitDDTargetUndefined: Self = StObject.set(x, "initDDTarget", js.undefined)
      
      inline def setInitDDUndefined: Self = StObject.set(x, "initDD", js.undefined)
      
      inline def setIsBorderBox(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBorderBox", value.toJsFn)
      
      inline def setIsBorderBoxUndefined: Self = StObject.set(x, "isBorderBox", js.undefined)
      
      inline def setIsDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisplayed", value.toJsFn)
      
      inline def setIsDisplayedUndefined: Self = StObject.set(x, "isDisplayed", js.undefined)
      
      inline def setIsFocusable(value: /* asFocusEl */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isFocusable", js.Any.fromFunction1(value))
      
      inline def setIsFocusableUndefined: Self = StObject.set(x, "isFocusable", js.undefined)
      
      inline def setIsMasked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMasked", value.toJsFn)
      
      inline def setIsMaskedUndefined: Self = StObject.set(x, "isMasked", js.undefined)
      
      inline def setIsScrollable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isScrollable", value.toJsFn)
      
      inline def setIsScrollableUndefined: Self = StObject.set(x, "isScrollable", js.undefined)
      
      inline def setIsVisible(value: /* deep */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setLoad(value: /* options */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setMask(
        value: (/* msg */ js.UndefOr[java.lang.String], /* msgCls */ js.UndefOr[java.lang.String]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "mask", js.Any.fromFunction2(value))
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMonitorMouseLeave(
        value: (/* delay */ js.UndefOr[Double], /* handler */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "monitorMouseLeave", js.Any.fromFunction3(value))
      
      inline def setMonitorMouseLeaveUndefined: Self = StObject.set(x, "monitorMouseLeave", js.undefined)
      
      inline def setMoveTo(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "moveTo", js.Any.fromFunction3(value))
      
      inline def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
      
      inline def setNeedsTabIndex(value: Callback): Self = StObject.set(x, "needsTabIndex", value.toJsFn)
      
      inline def setNeedsTabIndexUndefined: Self = StObject.set(x, "needsTabIndex", js.undefined)
      
      inline def setOn(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOriginalDisplay(value: java.lang.String): Self = StObject.set(x, "originalDisplay", value.asInstanceOf[js.Any])
      
      inline def setOriginalDisplayUndefined: Self = StObject.set(x, "originalDisplay", js.undefined)
      
      inline def setPause(value: /* seconds */ js.UndefOr[Double] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPosition(
        value: (/* pos */ js.UndefOr[java.lang.String], /* zIndex */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "position", js.Any.fromFunction4((t0: /* pos */ js.UndefOr[java.lang.String], t1: /* zIndex */ js.UndefOr[Double], t2: /* x */ js.UndefOr[Double], t3: /* y */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPuff(value: /* options */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "puff", js.Any.fromFunction1(value))
      
      inline def setPuffUndefined: Self = StObject.set(x, "puff", js.undefined)
      
      inline def setPurgeAllListeners(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "purgeAllListeners", value.toJsFn)
      
      inline def setPurgeAllListenersUndefined: Self = StObject.set(x, "purgeAllListeners", js.undefined)
      
      inline def setRelayEvent(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* observable */ js.UndefOr[Any]) => Callback
      ): Self = StObject.set(x, "relayEvent", js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* observable */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRelayEventUndefined: Self = StObject.set(x, "relayEvent", js.undefined)
      
      inline def setRemoveAllListeners(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "removeAllListeners", value.toJsFn)
      
      inline def setRemoveAllListenersUndefined: Self = StObject.set(x, "removeAllListeners", js.undefined)
      
      inline def setRemoveListener(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setScale(
        value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "scale", js.Any.fromFunction3(value))
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScroll(
        value: (/* direction */ js.UndefOr[java.lang.String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => Boolean
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction3(value))
      
      inline def setScrollBy(
        value: (/* deltaX */ js.UndefOr[Any], /* deltaY */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "scrollBy", js.Any.fromFunction3(value))
      
      inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
      
      inline def setScrollIntoView(
        value: (/* container */ js.UndefOr[Any], /* hscroll */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any], /* highlight */ js.UndefOr[Boolean]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction4(value))
      
      inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
      
      inline def setScrollTo(
        value: (/* side */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction3(value))
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSelectable(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "selectable", value.toJsFn)
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSetBottom(value: /* bottom */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
      
      inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      inline def setSetBounds(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "setBounds", js.Any.fromFunction5(value))
      
      inline def setSetBoundsUndefined: Self = StObject.set(x, "setBounds", js.undefined)
      
      inline def setSetDisplayed(value: /* value */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setDisplayed", js.Any.fromFunction1(value))
      
      inline def setSetDisplayedUndefined: Self = StObject.set(x, "setDisplayed", js.undefined)
      
      inline def setSetLeft(value: /* left */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      inline def setSetLeftTop(
        value: (/* left */ js.UndefOr[Any], /* top */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "setLeftTop", js.Any.fromFunction2(value))
      
      inline def setSetLeftTopUndefined: Self = StObject.set(x, "setLeftTop", js.undefined)
      
      inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      inline def setSetLocation(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "setLocation", js.Any.fromFunction3(value))
      
      inline def setSetLocationUndefined: Self = StObject.set(x, "setLocation", js.undefined)
      
      inline def setSetOpacity(
        value: (/* opacity */ js.UndefOr[Double], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "setOpacity", js.Any.fromFunction2(value))
      
      inline def setSetOpacityUndefined: Self = StObject.set(x, "setOpacity", js.undefined)
      
      inline def setSetPositioning(value: /* posCfg */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setPositioning", js.Any.fromFunction1(value))
      
      inline def setSetPositioningUndefined: Self = StObject.set(x, "setPositioning", js.undefined)
      
      inline def setSetRight(value: /* right */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
      
      inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      inline def setSetScrollLeft(value: /* left */ js.UndefOr[Double] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setScrollLeft", js.Any.fromFunction1(value))
      
      inline def setSetScrollLeftUndefined: Self = StObject.set(x, "setScrollLeft", js.undefined)
      
      inline def setSetScrollTop(value: /* top */ js.UndefOr[Double] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1(value))
      
      inline def setSetScrollTopUndefined: Self = StObject.set(x, "setScrollTop", js.undefined)
      
      inline def setSetTop(value: /* top */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
      
      inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      inline def setSetVisible(
        value: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "setVisible", js.Any.fromFunction2(value))
      
      inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
      
      inline def setShift(value: /* options */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setShow(value: /* animate */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSlideIn(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "slideIn", js.Any.fromFunction2(value))
      
      inline def setSlideInUndefined: Self = StObject.set(x, "slideIn", js.undefined)
      
      inline def setSlideOut(
        value: (/* anchor */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "slideOut", js.Any.fromFunction2(value))
      
      inline def setSlideOutUndefined: Self = StObject.set(x, "slideOut", js.undefined)
      
      inline def setSwallowEvent(
        value: (/* eventName */ js.UndefOr[Any], /* preventDefault */ js.UndefOr[Boolean]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "swallowEvent", js.Any.fromFunction2(value))
      
      inline def setSwallowEventUndefined: Self = StObject.set(x, "swallowEvent", js.undefined)
      
      inline def setSwitchOff(value: /* options */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "switchOff", js.Any.fromFunction1(value))
      
      inline def setSwitchOffUndefined: Self = StObject.set(x, "switchOff", js.undefined)
      
      inline def setToggle(value: /* animate */ js.UndefOr[Any] => typingsJapgolly.extjs.Ext.core.IElement): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setUn(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
      
      inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
      
      inline def setUnclip(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "unclip", value.toJsFn)
      
      inline def setUnclipUndefined: Self = StObject.set(x, "unclip", js.undefined)
      
      inline def setUnselectable(value: CallbackTo[typingsJapgolly.extjs.Ext.core.IElement]): Self = StObject.set(x, "unselectable", value.toJsFn)
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setUpdate(
        value: (/* html */ js.UndefOr[java.lang.String], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.core.IElement
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
