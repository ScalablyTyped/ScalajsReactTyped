package typingsJapgolly.senchaTouch.Ext.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElement extends IObservable {
  /** [Property] (Number) */
  var DISPLAY: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var OFFSETS: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var VISIBILITY: js.UndefOr[Double] = js.undefined
  /** [Method] Adds the given CSS class es to this Element
  		* @param names String The CSS class(es) to add to this element.
  		* @param prefix String Prefix to prepend to each class.
  		* @param suffix String Suffix to append to each class.
  		* @returns Ext.dom.Element this
  		*/
  var addCls: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Appends the passed element s to this element
  		* @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var appendChild: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Appends this element to the passed element
  		* @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] More flexible version of setStyle for setting style properties
  		* @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
  		* @returns Ext.dom.Element this
  		*/
  var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector.
  		* @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true)
  		*/
  var child: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Returns true if this element is an ancestor of the passed element
  		* @param element HTMLElement/String The element to check.
  		* @returns Boolean true if this element is an ancestor of el, else false.
  		*/
  var contains: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element.
  		* @param returnDom Boolean true to return the dom node instead of creating an Element.
  		* @returns Ext.dom.Element The new child element.
  		*/
  var createChild: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Translates an element using CSS 3 in 2D  */
  var cssTranslate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (String) */
  var defaultUnit: js.UndefOr[String] = js.undefined
  /** [Property] (HTMLElement) */
  var dom: js.UndefOr[HTMLElement] = js.undefined
  /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
  		* @param selector String The CSS selector.
  		* @param returnDom Boolean true to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom is true).
  		*/
  var down: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Looks at this node and then at parent nodes for a match of the passed simple selector e g
  		* @param simpleSelector String The simple selector to test.
  		* @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 50 || document.body)
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement/null The matching DOM node (or null if no match was found).
  		*/
  var findParent: js.UndefOr[
    js.Function3[
      /* simpleSelector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Looks at parent nodes for a match of the passed simple selector e g
  		* @param simpleSelector String The simple selector to test.
  		* @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement/null The matching DOM node (or null if no match was found).
  		*/
  var findParentNode: js.UndefOr[
    js.Function3[
      /* simpleSelector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Gets the first child skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The first child or null.
  		*/
  var first: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the x y coordinates to align this element with another element
  		* @param element Mixed The element to align to.
  		* @param position String The position to align to.
  		* @param offsets Array Offset the positioning by [x, y].
  		* @returns Array [x, y]
  		*/
  var getAlignToXY: js.UndefOr[
    js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      Array
    ]
  ] = js.undefined
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
  		* @param anchor String The specified anchor position.
  		* @param local Boolean true to get the local (element top/left-relative) anchor position instead of page coordinates.
  		* @param size Object An object containing the size to use for calculating anchor position. {width: (target width), height: (target height)} (defaults to the element's current size)
  		* @returns Array [x, y] An array containing the element's x and y coordinates.
  		*/
  var getAnchorXY: js.UndefOr[
    js.Function3[
      /* anchor */ js.UndefOr[String], 
      /* local */ js.UndefOr[Boolean], 
      /* size */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Method] Returns the value of an attribute from the element s underlying DOM node
  		* @param name String The attribute name.
  		* @param namespace String The namespace in which to look for the attribute.
  		* @returns String The attribute value.
  		*/
  var getAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String], String]
  ] = js.undefined
  /** [Method] Gets the width of the border s for the specified side s
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
  		* @returns Number The width of the sides passed added together
  		*/
  var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Gets the bottom Y coordinate of the element element Y position  element height
  		* @returns Number
  		*/
  var getBottom: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top are returned instead of page x/y.
  		* @returns Object An object in the format
  		*/
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Returns the innerHTML of an element
  		* @returns String
  		*/
  var getHTML: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the offset height of the element
  		* @param contentHeight Boolean true to get the height minus borders and padding.
  		* @returns Number The element's height.
  		*/
  var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Returns the innerHTML of an element
  		* @returns String
  		*/
  var getHtml: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Gets the left X coordinate
  		* @returns Number
  		*/
  var getLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
  		* @param sides String Any combination of 'l', 'r', 't', 'b' to get the sum of those sides.
  		* @returns Object/Number
  		*/
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns the offsets of this element from the passed element
  		* @param element Mixed The element to get the offsets from.
  		* @returns Array The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Retrieves the height of the element account for the top and bottom margins  */
  var getOuterHeight: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Retrieves the width of the element accounting for the left and right margins  */
  var getOuterWidth: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the width of the padding s for the specified side s
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
  		* @returns Number The padding of the sides passed added together.
  		*/
  var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param asRegion Boolean If true an Ext.util.Region will be returned.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. So the result may also be used for setXY.
  		*/
  var getPageBox: js.UndefOr[js.Function1[/* asRegion */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Gets the right X coordinate of the element element X position  element width
  		* @returns Number
  		*/
  var getRight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the Scroller instance of the first parent that has one  */
  var getScrollParent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the size of the element
  		* @param contentSize Boolean true to get the width/size minus borders and padding.
  		* @returns Object An object containing the element's size:
  		*/
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Normalizes currentStyle and computedStyle
  		* @param prop String The style property whose value is returned.
  		* @returns String The current value of the style property for this element.
  		*/
  var getStyle: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], String]] = js.undefined
  /** [Method] Gets the top Y coordinate
  		* @returns Number
  		*/
  var getTop: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of the value attribute
  		* @param asNumber Boolean true to parse the value as a number.
  		* @returns String/Number
  		*/
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height:
  		*/
  var getViewSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the offset width of the element
  		* @param contentWidth Boolean true to get the width minus borders and padding.
  		* @returns Number The element's width.
  		*/
  var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Gets the current X position of the element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the current position of the element based on page coordinates
  		* @returns Array The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets the current Y position of the element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param name String The CSS class to check for.
  		* @returns Boolean true if the class exists, else false.
  		*/
  var hasCls: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Hides this element  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Method] Inserts this element after the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Inserts this element before the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Inserts an element as the first child of this element
  		* @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
  		* @returns Ext.dom.Element this
  		*/
  var insertFirst: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Inserts an HTML fragment into this element
  		* @param where String Where to insert the HTML in relation to this element - 'beforeBegin', 'afterBegin', 'beforeEnd', 'afterEnd'. See Ext.DomHelper.insertHtml for details.
  		* @param html String The HTML fragment
  		* @param returnEl Boolean true to return an Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The inserted node (or nearest related if more than 1 inserted).
  		*/
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[String], 
      /* html */ js.UndefOr[String], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
  		* @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
  		* @param where String 'before' or 'after'.
  		* @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
  		*/
  var insertSibling: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* where */ js.UndefOr[String], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Returns true if this element matches the passed simple selector e g
  		* @param selector String The simple selector to test.
  		* @returns Boolean true if this element matches the selector, else false.
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Determines if this element is a descendant of the passed in Element  */
  var isDescendent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Checks if the current value of a style is equal to a given value
  		* @param style String property whose value is returned.
  		* @param value String to check against.
  		* @returns Boolean true for when the current value equals the given value.
  		*/
  var isStyle: js.UndefOr[
    js.Function2[/* style */ js.UndefOr[String], /* value */ js.UndefOr[String], Boolean]
  ] = js.undefined
  /** [Method] Returns true if the value of the given property is visually transparent
  		* @param prop String The style property whose value is to be tested.
  		* @returns Boolean true if the style property is visually transparent.
  		*/
  var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Gets the last child skipping text nodes
  		* @param selector String Find the previous sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The last child or null.
  		*/
  var last: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Puts a mask over this element to disable user interaction  */
  var mask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the next sibling skipping text nodes
  		* @param selector String Find the next sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw dom node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The next sibling or null.
  		*/
  var next: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector
  		* @param selector String Find a parent node that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element.
  		* @returns Ext.dom.Element/HTMLElement/null The parent node or null.
  		*/
  var parent: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the previous sibling skipping text nodes
  		* @param selector String Find the previous sibling that matches the passed simple selector.
  		* @param returnDom Boolean true to return a raw DOM node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement/null The previous sibling or null.
  		*/
  var prev: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Removes all listeners for this object  */
  var purgeAllListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector.
  		* @returns HTMLElement[] An array of the matched nodes.
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Array]] = js.undefined
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
  		* @param className String/String[] The CSS class to add, or an array of classes.
  		* @returns Ext.dom.Element this
  		*/
  var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IElement: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Removes this element s DOM reference  */
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes all listeners for this object  */
  var removeAllListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes the given CSS class es from this Element
  		* @param names String The CSS class(es) to remove from this element.
  		* @param prefix String Prefix to prepend to each class to be removed.
  		* @param suffix String Suffix to append to each class to be removed.
  		* @returns Ext.dom.Element this
  		*/
  var removeCls: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Forces the browser to repaint this element
  		* @returns Ext.dom.Element this
  		*/
  var repaint: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Replaces the passed element with this element
  		* @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  var replace: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces a CSS class on the element with another
  		* @param oldName String The CSS class to replace.
  		* @param newName String The replacement CSS class.
  		* @param prefix String Prefix to prepend to each class to be replaced.
  		* @param suffix String Suffix to append to each class to be replaced.
  		* @returns Ext.dom.Element this
  		*/
  var replaceCls: js.UndefOr[
    js.Function4[
      /* oldName */ js.UndefOr[String], 
      /* newName */ js.UndefOr[String], 
      /* prefix */ js.UndefOr[String], 
      /* suffix */ js.UndefOr[String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Replaces this element with the passed element
  		* @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
  		* @returns Ext.dom.Element This element.
  		*/
  var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Serializes a DOM form into a url encoded string
  		* @param form Object The form
  		* @returns String The url encoded form
  		*/
  var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], String]] = js.undefined
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
  		* @param attributes Object The object with the attributes.
  		* @param useSet Boolean false to override the default setAttribute to use expandos.
  		* @returns Ext.dom.Element this
  		*/
  var set: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Sets the element s CSS bottom style
  		* @param bottom String The bottom CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Sets the element s box
  		* @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
  		* @returns Ext.dom.Element this
  		*/
  var setBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the specified CSS class on this element s DOM node
  		* @param className String/Array The CSS class to set on this element.
  		*/
  var setCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height.
  		* @returns Ext.dom.Element this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the element s left position directly using CSS style instead of setX
  		* @param left String The left CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Set the maximum height of this Element
  		* @param height Number/String The new maximum height.
  		* @returns Ext.dom.Element this
  		*/
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Set the maximum width of this Element
  		* @param width Number/String The new maximum width.
  		* @returns Ext.dom.Element this
  		*/
  var setMaxWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Set the minimum height of this Element
  		* @param height Number/String The new minimum height.
  		* @returns Ext.dom.Element this
  		*/
  var setMinHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Set the minimum width of this Element
  		* @param width Number/String The new minimum width.
  		* @returns Ext.dom.Element this
  		*/
  var setMinWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the element s CSS right style
  		* @param right String The right CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Set the size of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.dom.Element this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], this.type]
  ] = js.undefined
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top String The top CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Sets the element s top and left positions directly using CSS style  */
  var setTopLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
  		* @param mode Object
  		* @returns Ext.dom.Element this
  		*/
  var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible.
  		* @returns Ext.Element this
  		*/
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width.
  		* @returns Ext.dom.Element this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the X position of the element based on page coordinates
  		* @param x Number The X position of the element
  		* @returns Ext.dom.Element this
  		*/
  var setX: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
  		* @returns Ext.dom.Element this
  		*/
  var setXY: js.UndefOr[js.Function1[/* pos */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Method] Sets the Y position of the element based on page coordinates
  		* @param y Number The Y position of the element.
  		* @returns Ext.dom.Element this
  		*/
  var setY: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Shows this element  */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
  		* @param className String The CSS class to toggle.
  		* @returns Ext.dom.Element this
  		*/
  var toggleCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], this.type]] = js.undefined
  /** [Method] Translates the passed page coordinates into left top CSS values for this element
  		* @param x Number/Array The page x or an array containing [x, y].
  		* @param y Number The page y, required if x is not an array.
  		* @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}.
  		*/
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Removes a previously applied mask  */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Walks up the dom looking for a parent node that matches the passed simple selector e g
  		* @param simpleSelector String The simple selector to test
  		* @param maxDepth Number/String/HTMLElement/Ext.Element The max depth to search as a number or element (defaults to 10 || document.body).
  		* @returns Ext.dom.Element/null The matching DOM node (or null if no match was found).
  		*/
  var up: js.UndefOr[
    js.Function2[/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Sets the innerHTML of this element
  		* @param html String The new HTML.
  		*/
  var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Creates and wraps this element with another element
  		* @param config Object DomHelper element config object for the wrapper element or null for an empty div
  		* @param domNode Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The newly created wrapper element.
  		*/
  var wrap: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean], _]
  ] = js.undefined
}

object IElement {
  @scala.inline
  def apply(
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addCls: (/* names */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: /* element */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    appendTo: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    child: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    contains: /* element */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    cssTranslate: js.UndefOr[Callback] = js.undefined,
    defaultUnit: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    findParent: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    findParentNode: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    first: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getAlignToXY: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    getAnchorXY: (/* anchor */ js.UndefOr[String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getAttribute: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[String] = null,
    getBorderWidth: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getBottom: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getBox: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getHTML: js.UndefOr[CallbackTo[String]] = js.undefined,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getHtml: js.UndefOr[CallbackTo[String]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMargin: /* sides */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getOffsetsTo: /* element */ js.UndefOr[js.Any] => CallbackTo[Array] = null,
    getOuterHeight: js.UndefOr[Callback] = js.undefined,
    getOuterWidth: js.UndefOr[Callback] = js.undefined,
    getPadding: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getRight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollParent: js.UndefOr[Callback] = js.undefined,
    getSize: /* contentSize */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getStyle: /* prop */ js.UndefOr[String] => CallbackTo[String] = null,
    getTop: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getValue: /* asNumber */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getViewSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hasCls: /* name */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hide: js.UndefOr[Callback] = js.undefined,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    insertFirst: /* element */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    insertHtml: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    is: /* selector */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isDescendent: js.UndefOr[Callback] = js.undefined,
    isStyle: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    isTransparent: /* prop */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    last: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    listeners: js.Any = null,
    mask: js.UndefOr[Callback] = js.undefined,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    next: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    parent: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    platformConfig: js.Any = null,
    prev: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    purgeAllListeners: js.UndefOr[Callback] = js.undefined,
    query: /* selector */ js.UndefOr[String] => CallbackTo[Array] = null,
    radioCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeAllListeners: js.UndefOr[Callback] = js.undefined,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeCls: (/* names */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    repaint: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    replace: /* element */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    replaceCls: (/* oldName */ js.UndefOr[String], /* newName */ js.UndefOr[String], /* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    set: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    setBottom: /* bottom */ js.UndefOr[String] => CallbackTo[IElement] = null,
    setBox: /* box */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setCls: /* className */ js.UndefOr[js.Any] => Callback = null,
    setHTML: /* html */ js.UndefOr[String] => Callback = null,
    setHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setHtml: /* html */ js.UndefOr[String] => Callback = null,
    setLeft: /* left */ js.UndefOr[String] => CallbackTo[IElement] = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMaxHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setMaxWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setMinHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setMinWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setRight: /* right */ js.UndefOr[String] => CallbackTo[IElement] = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    setTop: /* top */ js.UndefOr[String] => CallbackTo[IElement] = null,
    setTopLeft: js.UndefOr[Callback] = js.undefined,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setVisible: /* visible */ js.UndefOr[Boolean] => CallbackTo[IElement] = null,
    setWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setX: /* x */ js.UndefOr[Double] => CallbackTo[IElement] = null,
    setXY: /* pos */ js.UndefOr[Array] => CallbackTo[IElement] = null,
    setY: /* y */ js.UndefOr[Double] => CallbackTo[IElement] = null,
    show: js.UndefOr[Callback] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    toggleCls: /* className */ js.UndefOr[String] => CallbackTo[IElement] = null,
    translatePoints: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unmask: js.UndefOr[Callback] = js.undefined,
    up: (/* simpleSelector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    update: /* html */ js.UndefOr[String] => Callback = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null
  ): IElement = {
    val __obj = js.Dynamic.literal()
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3((t0: /* names */ js.UndefOr[java.lang.String], t1: /* prefix */ js.UndefOr[java.lang.String], t2: /* suffix */ js.UndefOr[java.lang.String]) => addCls(t0, t1, t2).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => addListener(t0, t1, t2, t3, t4).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => appendChild(t0).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => appendTo(t0).runNow()))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1((t0: /* styles */ js.UndefOr[js.Any]) => applyStyles(t0).runNow()))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => child(t0, t1).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* insertBefore */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => createChild(t0, t1, t2).runNow()))
    cssTranslate.foreach(p => __obj.updateDynamic("cssTranslate")(p.toJsFn))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => down(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3((t0: /* simpleSelector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParent(t0, t1, t2).runNow()))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3((t0: /* simpleSelector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParentNode(t0, t1, t2).runNow()))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => first(t0, t1).runNow()))
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(js.Any.fromFunction3((t0: /* element */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[java.lang.String], t2: /* offsets */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => getAlignToXY(t0, t1, t2).runNow()))
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(js.Any.fromFunction3((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* local */ js.UndefOr[scala.Boolean], t2: /* size */ js.UndefOr[js.Any]) => getAnchorXY(t0, t1, t2).runNow()))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* namespace */ js.UndefOr[java.lang.String]) => getAttribute(t0, t1).runNow()))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getBorderWidth(t0).runNow()))
    getBottom.foreach(p => __obj.updateDynamic("getBottom")(p.toJsFn))
    if (getBox != null) __obj.updateDynamic("getBox")(js.Any.fromFunction2((t0: /* contentBox */ js.UndefOr[scala.Boolean], t1: /* local */ js.UndefOr[scala.Boolean]) => getBox(t0, t1).runNow()))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getHTML.foreach(p => __obj.updateDynamic("getHTML")(p.toJsFn))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1((t0: /* contentHeight */ js.UndefOr[scala.Boolean]) => getHeight(t0).runNow()))
    getHtml.foreach(p => __obj.updateDynamic("getHtml")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLeft.foreach(p => __obj.updateDynamic("getLeft")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getMargin(t0).runNow()))
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => getOffsetsTo(t0).runNow()))
    getOuterHeight.foreach(p => __obj.updateDynamic("getOuterHeight")(p.toJsFn))
    getOuterWidth.foreach(p => __obj.updateDynamic("getOuterWidth")(p.toJsFn))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getPadding(t0).runNow()))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1((t0: /* asRegion */ js.UndefOr[scala.Boolean]) => getPageBox(t0).runNow()))
    getRight.foreach(p => __obj.updateDynamic("getRight")(p.toJsFn))
    getScrollParent.foreach(p => __obj.updateDynamic("getScrollParent")(p.toJsFn))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1((t0: /* contentSize */ js.UndefOr[scala.Boolean]) => getSize(t0).runNow()))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => getStyle(t0).runNow()))
    getTop.foreach(p => __obj.updateDynamic("getTop")(p.toJsFn))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: /* asNumber */ js.UndefOr[scala.Boolean]) => getValue(t0).runNow()))
    getViewSize.foreach(p => __obj.updateDynamic("getViewSize")(p.toJsFn))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1((t0: /* contentWidth */ js.UndefOr[scala.Boolean]) => getWidth(t0).runNow()))
    getX.foreach(p => __obj.updateDynamic("getX")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getY.foreach(p => __obj.updateDynamic("getY")(p.toJsFn))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => hasCls(t0).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertAfter(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertBefore(t0).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => insertFirst(t0).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3((t0: /* where */ js.UndefOr[java.lang.String], t1: /* html */ js.UndefOr[java.lang.String], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => insertHtml(t0, t1, t2).runNow()))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* where */ js.UndefOr[java.lang.String], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => insertSibling(t0, t1, t2).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    isDescendent.foreach(p => __obj.updateDynamic("isDescendent")(p.toJsFn))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2((t0: /* style */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[java.lang.String]) => isStyle(t0, t1).runNow()))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => isTransparent(t0).runNow()))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => last(t0, t1).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    mask.foreach(p => __obj.updateDynamic("mask")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => next(t0, t1).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => parent(t0, t1).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => prev(t0, t1).runNow()))
    purgeAllListeners.foreach(p => __obj.updateDynamic("purgeAllListeners")(p.toJsFn))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => radioCls(t0).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    removeAllListeners.foreach(p => __obj.updateDynamic("removeAllListeners")(p.toJsFn))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3((t0: /* names */ js.UndefOr[java.lang.String], t1: /* prefix */ js.UndefOr[java.lang.String], t2: /* suffix */ js.UndefOr[java.lang.String]) => removeCls(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    repaint.foreach(p => __obj.updateDynamic("repaint")(p.toJsFn))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => replace(t0).runNow()))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4((t0: /* oldName */ js.UndefOr[java.lang.String], t1: /* newName */ js.UndefOr[java.lang.String], t2: /* prefix */ js.UndefOr[java.lang.String], t3: /* suffix */ js.UndefOr[java.lang.String]) => replaceCls(t0, t1, t2, t3).runNow()))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replaceWith(t0).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1((t0: /* form */ js.UndefOr[js.Any]) => serializeForm(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* attributes */ js.UndefOr[js.Any], t1: /* useSet */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[java.lang.String]) => setBottom(t0).runNow()))
    if (setBox != null) __obj.updateDynamic("setBox")(js.Any.fromFunction1((t0: /* box */ js.UndefOr[js.Any]) => setBox(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => setCls(t0).runNow()))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHTML(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setHeight(t0).runNow()))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHtml(t0).runNow()))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[java.lang.String]) => setLeft(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setMaxHeight(t0).runNow()))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setMaxWidth(t0).runNow()))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setMinHeight(t0).runNow()))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setMinWidth(t0).runNow()))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1((t0: /* right */ js.UndefOr[java.lang.String]) => setRight(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any]) => setSize(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => setStyle(t0, t1).runNow()))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[java.lang.String]) => setTop(t0).runNow()))
    setTopLeft.foreach(p => __obj.updateDynamic("setTopLeft")(p.toJsFn))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1((t0: /* mode */ js.UndefOr[js.Any]) => setVisibilityMode(t0).runNow()))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: /* visible */ js.UndefOr[scala.Boolean]) => setVisible(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setWidth(t0).runNow()))
    if (setX != null) __obj.updateDynamic("setX")(js.Any.fromFunction1((t0: /* x */ js.UndefOr[scala.Double]) => setX(t0).runNow()))
    if (setXY != null) __obj.updateDynamic("setXY")(js.Any.fromFunction1((t0: /* pos */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setXY(t0).runNow()))
    if (setY != null) __obj.updateDynamic("setY")(js.Any.fromFunction1((t0: /* y */ js.UndefOr[scala.Double]) => setY(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => toggleCls(t0).runNow()))
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double]) => translatePoints(t0, t1).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    unmask.foreach(p => __obj.updateDynamic("unmask")(p.toJsFn))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction2((t0: /* simpleSelector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any]) => up(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => update(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction2((t0: /* config */ js.UndefOr[js.Any], t1: /* domNode */ js.UndefOr[scala.Boolean]) => wrap(t0, t1).runNow()))
    __obj.asInstanceOf[IElement]
  }
}

