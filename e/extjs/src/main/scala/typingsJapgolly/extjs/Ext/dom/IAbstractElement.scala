package typingsJapgolly.extjs.Ext.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractElement extends IBase {
  /** [Property] (Number) */
  var ASCLASS: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var DISPLAY: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var OFFSETS: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var VISIBILITY: js.UndefOr[Double] = js.undefined
  /** [Method] Adds one or more CSS classes to the element
  		* @param className String/String[] The CSS classes to add separated by space, or an array of classes
  		* @returns Ext.dom.Element this
  		*/
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Appends the passed element s to this element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object The id or element to insert or a DomHelper config The id of the node, a DOM Node or an existing Element.
  		* @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
  		* @returns Ext.dom.AbstractElement The inserted Element.
  		*/
  var appendChild: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Method] Appends this element to the passed element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The new parent element. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var appendTo: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] More flexible version of setStyle for setting style properties
  		* @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
  		* @returns Ext.dom.Element this
  		*/
  var applyStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Selects a single direct child based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector
  		* @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element.
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom = true)
  		*/
  var child: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Returns true if this element is an ancestor of the passed element
  		* @param el HTMLElement/String The element to check
  		* @returns Boolean True if this element is an ancestor of el, else false
  		*/
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element
  		* @param returnDom Boolean true to return the dom node instead of creating an Element
  		* @returns Ext.dom.AbstractElement The new child element
  		*/
  var createChild: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[HTMLElement], 
      /* returnDom */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Property] (String) */
  var defaultUnit: js.UndefOr[String] = js.undefined
  /** [Method] Alias to remove  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (HTMLElement) */
  var dom: js.UndefOr[HTMLElement] = js.undefined
  /** [Method] Selects a single child at any depth below this element based on the passed CSS selector the selector should not cont
  		* @param selector String The CSS selector
  		* @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element
  		* @returns HTMLElement/Ext.dom.Element The child Ext.dom.Element (or DOM node if returnDom = true)
  		*/
  var down: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Looks at this node and then at parent nodes for a match of the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
  		* @param returnEl Boolean True to return a Ext.Element object instead of DOM node
  		* @returns HTMLElement The matching DOM node (or null if no match was found)
  		*/
  var findParent: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* limit */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.undefined
  /** [Method] Looks at parent nodes for a match of the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
  		* @param returnEl Boolean True to return a Ext.Element object instead of DOM node
  		* @returns HTMLElement The matching DOM node (or null if no match was found)
  		*/
  var findParentNode: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* limit */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.undefined
  /** [Method] Gets the first child skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the next sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The first child or null
  		*/
  var first: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Returns the active element in the DOM
  		* @returns HTMLElement The active (focused) element in the document.
  		*/
  var getActiveElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  /** [Method] Returns the value of an attribute from the element s underlying DOM node
  		* @param name String The attribute name
  		* @param namespace String The namespace in which to look for the attribute
  		* @returns String The attribute value
  		*/
  var getAttribute: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String], String]
  ] = js.undefined
  /** [Method] Gets the width of the border s for the specified side s  Defined in override Ext dom AbstractElement_style
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the border left width + the border right width.
  		* @returns Number The width of the sides passed added together
  		*/
  var getBorderWidth: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Returns a child element of this element given its id
  		* @param id String The id of the desired child element.
  		* @param asDom Boolean True to return the DOM element, false to return a wrapped Element object.
  		*/
  var getById: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* asDom */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Returns the innerHTML of an Element or an empty string if the element s dom no longer exists  */
  var getHTML: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the offset height of the element Defined in override Ext dom AbstractElement_style
  		* @param contentHeight Boolean true to get the height minus borders and padding
  		* @returns Number The element's height
  		*/
  var getHeight: js.UndefOr[js.Function1[/* contentHeight */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Returns an object with properties top left right and bottom representing the margins of this element unless sides i
  		* @param sides String Any combination of l, r, t, b to get the sum of those sides
  		* @returns Object/Number
  		*/
  var getMargin: js.UndefOr[js.Function1[/* sides */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Gets the width of the padding s for the specified side s  Defined in override Ext dom AbstractElement_style
  		* @param side String Can be t, l, r, b or any combination of those to add multiple values. For example, passing 'lr' would get the padding left + the padding right.
  		* @returns Number The padding of the sides passed added together
  		*/
  var getPadding: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Double]] = js.undefined
  /** [Method] Returns the size of the element
  		* @param contentSize Boolean true to get the width/size minus borders and padding
  		* @returns Object An object containing the element's size:
  		*/
  var getSize: js.UndefOr[js.Function1[/* contentSize */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Returns a named style property based on computed currentStyle primary and inline style if primary is not available
  		* @param property String/String[] The style property (or multiple property names in an array) whose value is returned.
  		* @param inline Boolean if true only inline styles will be returned.
  		* @returns String/Object The current value of the style property for this element (or a hash of named style values if multiple property arguments are requested).
  		*/
  var getStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Returns the value of the value attribute
  		* @param asNumber Boolean true to parse the value as a number
  		* @returns String/Number
  		*/
  var getValue: js.UndefOr[js.Function1[/* asNumber */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Returns the dimensions of the element available to lay content out in
  		* @returns Object Object describing width and height.
  		*/
  var getViewSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the offset width of the element Defined in override Ext dom AbstractElement_style
  		* @param contentWidth Boolean true to get the width minus borders and padding
  		* @returns Number The element's width
  		*/
  var getWidth: js.UndefOr[js.Function1[/* contentWidth */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param className String The CSS class to check for
  		* @returns Boolean True if the class exists, else false
  		*/
  var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Hide this element  Uses display mode to determine whether to use display or visibility
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var hide: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Property] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Method] Inserts this element after the passed element in the DOM Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The element to insert after. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var insertAfter: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Inserts this element before the passed element in the DOM Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var insertBefore: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Inserts or creates an element or DomHelper config as the first child of this element Defined in override Ext dom
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object The id or element to insert or a DomHelper config to create and insert
  		* @returns Ext.dom.AbstractElement The new child
  		*/
  var insertFirst: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Inserts an html fragment into this element Defined in override Ext dom AbstractElement_insertion
  		* @param where String Where to insert the html in relation to this element - beforeBegin, afterBegin, beforeEnd, afterEnd. See Ext.dom.Helper.insertHtml for details.
  		* @param html String The HTML fragment
  		* @param returnEl Boolean True to return an Ext.dom.AbstractElement
  		* @returns HTMLElement/Ext.dom.AbstractElement The inserted node (or nearest related if more than 1 inserted)
  		*/
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[String], 
      /* html */ js.UndefOr[String], 
      /* returnEl */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element Defined in override Ext d
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
  		* @param where String 'before' or 'after'
  		* @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
  		* @returns Ext.dom.AbstractElement The inserted Element. If an array is passed, the last inserted element is returned.
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
  		* @param selector String The simple selector to test
  		* @returns Boolean True if this element matches the selector, else false
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Boolean]] = js.undefined
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
  		* @returns Boolean True if the style property is visually transparent.
  		*/
  var isTransparent: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Gets the last child skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the previous sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The last child or null
  		*/
  var last: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Puts a mask over this element to disable user interaction
  		* @param msg String A message to display in the mask
  		* @param msgCls String A css class to apply to the msg element
  		*/
  var mask: js.UndefOr[
    js.Function2[/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] Gets the next sibling skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the next sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The next sibling or null
  		*/
  var next: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the parent node for this element optionally chaining up trying to match a selector Defined in override Ext dom
  		* @param selector String Find a parent node that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The parent node or null
  		*/
  var parent: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the previous sibling skipping text nodes Defined in override Ext dom AbstractElement_traversal
  		* @param selector String Find the previous sibling that matches the passed simple selector
  		* @param returnDom Boolean True to return a raw dom node instead of an Ext.dom.Element
  		* @returns Ext.dom.Element/HTMLElement The previous sibling or null
  		*/
  var prev: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Selects child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector
  		* @returns HTMLElement[] An array of the matched nodes
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Array]] = js.undefined
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
  		* @param className String/String[] The CSS class to add, or an array of classes
  		* @returns Ext.dom.Element this
  		*/
  var radioCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Removes this element s dom reference  */
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes one or more CSS classes from the element
  		* @param className String/String[] The CSS classes to remove separated by space, or an array of classes
  		* @returns Ext.dom.Element this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Forces the browser to repaint this element Defined in override Ext dom AbstractElement_style
  		* @returns Ext.dom.Element this
  		*/
  var repaint: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Replaces the passed element with this element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement The element to replace. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var replace: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces a CSS class on the element with another
  		* @param oldClassName String The CSS class to replace
  		* @param newClassName String The replacement CSS class
  		* @returns Ext.dom.Element this
  		*/
  var replaceCls: js.UndefOr[
    js.Function2[
      /* oldClassName */ js.UndefOr[String], 
      /* newClassName */ js.UndefOr[String], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Replaces this element with the passed element Defined in override Ext dom AbstractElement_insertion
  		* @param el String/HTMLElement/Ext.dom.AbstractElement/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create
  		* @returns Ext.dom.AbstractElement This element
  		*/
  var replaceWith: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Creates a Ext CompositeElement for child nodes based on the passed CSS selector the selector should not contain an id
  		* @param selector String The CSS selector
  		* @param unique Boolean True to create a unique Ext.Element for each element. Defaults to a shared flyweight object.
  		* @returns Ext.CompositeElement The composite element
  		*/
  var select: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[String], 
      /* unique */ js.UndefOr[Boolean], 
      typingsJapgolly.extjs.Ext.ICompositeElement
    ]
  ] = js.undefined
  /** [Method] Serializes a DOM form into a url encoded string Defined in override Ext dom AbstractElement_static
  		* @param form Object The form
  		* @returns String The url encoded form
  		*/
  var serializeForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], String]] = js.undefined
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
  		* @param o Object The object with the attributes
  		* @param useSet Boolean false to override the default setAttribute to use expandos.
  		* @returns Ext.dom.Element this
  		*/
  var set: js.UndefOr[
    js.Function2[/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean], IElement]
  ] = js.undefined
  /** [Method] Set the innerHTML of this element
  		* @param html String The new HTML
  		* @returns Ext.Element this
  		*/
  var setHTML: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], typingsJapgolly.extjs.Ext.IElement]] = js.undefined
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels.) A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the size of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IElement]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.dom.Element this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], IElement]
  ] = js.undefined
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY OFFSETS or ASCLASS
  		* @param mode Object
  		* @returns Ext.dom.AbstractElement this
  		*/
  var setVisibilityMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var setVisible: js.UndefOr[
    js.Function2[/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any], IElement]
  ] = js.undefined
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Show this element  Uses display mode to determine whether to use display or visibility
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.dom.Element this
  		*/
  var show: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
  		* @param className String The CSS class to toggle
  		* @returns Ext.dom.Element this
  		*/
  var toggleCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[String], IElement]] = js.undefined
  /** [Method] Removes a previously applied mask  */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Walks up the DOM looking for a parent node that matches the passed simple selector e g
  		* @param selector String The simple selector to test
  		* @param limit Number/String/HTMLElement/Ext.Element The max depth to search as a number or an element which causes the upward traversal to stop and is not considered for inclusion as the result. (defaults to 50 || document.documentElement)
  		* @param returnDom Boolean True to return the DOM node instead of Ext.dom.Element
  		* @returns Ext.Element The matching DOM node (or null if no match was found)
  		*/
  var up: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* limit */ js.UndefOr[js.Any], 
      /* returnDom */ js.UndefOr[Boolean], 
      typingsJapgolly.extjs.Ext.IElement
    ]
  ] = js.undefined
  /** [Method] Update the innerHTML of this element
  		* @param html String The new HTML
  		* @returns Ext.dom.Element this
  		*/
  var update: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], IElement]] = js.undefined
  /** [Method] Creates and wraps this element with another element Defined in override Ext dom AbstractElement_insertion
  		* @param config Object DomHelper element config object for the wrapper element or null for an empty div
  		* @param returnDom Boolean True to return the raw DOM element instead of Ext.dom.AbstractElement
  		* @param selector String A DomQuery selector to select a descendant node within the created element to use as the wrapping element.
  		* @returns HTMLElement/Ext.dom.AbstractElement The newly created wrapper element
  		*/
  var wrap: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* returnDom */ js.UndefOr[Boolean], 
      /* selector */ js.UndefOr[String], 
      _
    ]
  ] = js.undefined
}

object IAbstractElement {
  @scala.inline
  def apply(
    ASCLASS: Int | Double = null,
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    addCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: (/* el */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IAbstractElement] = null,
    appendTo: /* el */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    child: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    config: js.Any = null,
    contains: /* el */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IAbstractElement] = null,
    defaultUnit: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    extend: String = null,
    findParent: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    findParentNode: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    first: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getActiveElement: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getAttribute: (/* name */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[String] = null,
    getBorderWidth: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getById: (/* id */ js.UndefOr[String], /* asDom */ js.UndefOr[Boolean]) => Callback = null,
    getHTML: js.UndefOr[Callback] = js.undefined,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getMargin: /* sides */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getPadding: /* side */ js.UndefOr[String] => CallbackTo[Double] = null,
    getSize: /* contentSize */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getStyle: (/* property */ js.UndefOr[js.Any], /* inline */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getValue: /* asNumber */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getViewSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    hasCls: /* className */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hide: /* animate */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    insertFirst: /* el */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    insertHtml: (/* where */ js.UndefOr[String], /* html */ js.UndefOr[String], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[IAbstractElement] = null,
    is: /* selector */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isStyle: (/* style */ js.UndefOr[String], /* value */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    isTransparent: /* prop */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    last: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    mask: (/* msg */ js.UndefOr[String], /* msgCls */ js.UndefOr[String]) => Callback = null,
    mixins: js.Any = null,
    next: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    parent: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    prev: (/* selector */ js.UndefOr[String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    query: /* selector */ js.UndefOr[String] => CallbackTo[Array] = null,
    radioCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeCls: /* className */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    repaint: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    replace: /* el */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    replaceCls: (/* oldClassName */ js.UndefOr[String], /* newClassName */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    requires: Array = null,
    select: (/* selector */ js.UndefOr[String], /* unique */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.ICompositeElement] = null,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    set: (/* o */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => CallbackTo[IElement] = null,
    setHTML: /* html */ js.UndefOr[String] => CallbackTo[typingsJapgolly.extjs.Ext.IElement] = null,
    setHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => CallbackTo[IElement] = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => CallbackTo[IAbstractElement] = null,
    setVisible: (/* visible */ js.UndefOr[Boolean], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IElement] = null,
    setWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    show: /* animate */ js.UndefOr[js.Any] => CallbackTo[IElement] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toggleCls: /* className */ js.UndefOr[String] => CallbackTo[IElement] = null,
    unmask: js.UndefOr[Callback] = js.undefined,
    up: (/* selector */ js.UndefOr[String], /* limit */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.IElement] = null,
    update: /* html */ js.UndefOr[String] => CallbackTo[IElement] = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* returnDom */ js.UndefOr[Boolean], /* selector */ js.UndefOr[String]) => CallbackTo[js.Any] = null
  ): IAbstractElement = {
    val __obj = js.Dynamic.literal()
    if (ASCLASS != null) __obj.updateDynamic("ASCLASS")(ASCLASS.asInstanceOf[js.Any])
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => addCls(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => appendChild(t0, t1).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => appendTo(t0).runNow()))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1((t0: /* styles */ js.UndefOr[js.Any]) => applyStyles(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => child(t0, t1).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* insertBefore */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => createChild(t0, t1, t2).runNow()))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => down(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParent(t0, t1, t2).runNow()))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParentNode(t0, t1, t2).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => first(t0, t1).runNow()))
    getActiveElement.foreach(p => __obj.updateDynamic("getActiveElement")(p.toJsFn))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* namespace */ js.UndefOr[java.lang.String]) => getAttribute(t0, t1).runNow()))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getBorderWidth(t0).runNow()))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* asDom */ js.UndefOr[scala.Boolean]) => getById(t0, t1).runNow()))
    getHTML.foreach(p => __obj.updateDynamic("getHTML")(p.toJsFn))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1((t0: /* contentHeight */ js.UndefOr[scala.Boolean]) => getHeight(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getMargin(t0).runNow()))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getPadding(t0).runNow()))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1((t0: /* contentSize */ js.UndefOr[scala.Boolean]) => getSize(t0).runNow()))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* inline */ js.UndefOr[scala.Boolean]) => getStyle(t0, t1).runNow()))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: /* asNumber */ js.UndefOr[scala.Boolean]) => getValue(t0).runNow()))
    getViewSize.foreach(p => __obj.updateDynamic("getViewSize")(p.toJsFn))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1((t0: /* contentWidth */ js.UndefOr[scala.Boolean]) => getWidth(t0).runNow()))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => hasCls(t0).runNow()))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => hide(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertAfter(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertBefore(t0).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertFirst(t0).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3((t0: /* where */ js.UndefOr[java.lang.String], t1: /* html */ js.UndefOr[java.lang.String], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => insertHtml(t0, t1, t2).runNow()))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* where */ js.UndefOr[java.lang.String], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => insertSibling(t0, t1, t2).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2((t0: /* style */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[java.lang.String]) => isStyle(t0, t1).runNow()))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => isTransparent(t0).runNow()))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => last(t0, t1).runNow()))
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction2((t0: /* msg */ js.UndefOr[java.lang.String], t1: /* msgCls */ js.UndefOr[java.lang.String]) => mask(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => next(t0, t1).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => parent(t0, t1).runNow()))
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => prev(t0, t1).runNow()))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => radioCls(t0).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => removeCls(t0).runNow()))
    repaint.foreach(p => __obj.updateDynamic("repaint")(p.toJsFn))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replace(t0).runNow()))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction2((t0: /* oldClassName */ js.UndefOr[java.lang.String], t1: /* newClassName */ js.UndefOr[java.lang.String]) => replaceCls(t0, t1).runNow()))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replaceWith(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* unique */ js.UndefOr[scala.Boolean]) => select(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1((t0: /* form */ js.UndefOr[js.Any]) => serializeForm(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* o */ js.UndefOr[js.Any], t1: /* useSet */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHTML(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setHeight(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any]) => setSize(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => setStyle(t0, t1).runNow()))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1((t0: /* mode */ js.UndefOr[js.Any]) => setVisibilityMode(t0).runNow()))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction2((t0: /* visible */ js.UndefOr[scala.Boolean], t1: /* animate */ js.UndefOr[js.Any]) => setVisible(t0, t1).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setWidth(t0).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[js.Any]) => show(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => toggleCls(t0).runNow()))
    unmask.foreach(p => __obj.updateDynamic("unmask")(p.toJsFn))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* limit */ js.UndefOr[js.Any], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => up(t0, t1, t2).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => update(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* returnDom */ js.UndefOr[scala.Boolean], t2: /* selector */ js.UndefOr[java.lang.String]) => wrap(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IAbstractElement]
  }
}

