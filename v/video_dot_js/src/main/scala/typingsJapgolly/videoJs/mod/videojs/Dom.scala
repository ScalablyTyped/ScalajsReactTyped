package typingsJapgolly.videoJs.mod.videojs

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLOptionElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.std.ClientRect
import typingsJapgolly.videoJs.mod.videojs.Dom.Coordinates
import typingsJapgolly.videoJs.mod.videojs.Dom.Position
import typingsJapgolly.videoJs.mod.videojs.Dom.Predicate
import typingsJapgolly.videoJs.videoJsStrings.canvas
import typingsJapgolly.videoJs.videoJsStrings.form
import typingsJapgolly.videoJs.videoJsStrings.img
import typingsJapgolly.videoJs.videoJsStrings.input
import typingsJapgolly.videoJs.videoJsStrings.option
import typingsJapgolly.videoJs.videoJsStrings.select
import typingsJapgolly.videoJs.videoJsStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dom extends StObject {
  
  /**
    * Finds a single DOM element matching `selector` within the optional
    * `context` of another DOM element (defaulting to `document`).
    *
    * @param selector
    *        A valid CSS selector, which will be passed to `querySelector`.
    *
    * @param [context=document]
    *        A DOM element within which to query. Can also be a selector
    *        string in which case the first matching element will be used
    *        as context. If missing (or no element matches selector), falls
    *        back to `document`.
    *
    * @return The element that was found or null.
    */
  @JSName("$")
  def $(selector: String): Element = js.native
  @JSName("$")
  def $(selector: String, context: String): Element = js.native
  @JSName("$")
  def $(selector: String, context: Element): Element = js.native
  
  /**
    * Finds a all DOM elements matching `selector` within the optional
    * `context` of another DOM element (defaulting to `document`).
    *
    * @param selector
    *           A valid CSS selector, which will be passed to `querySelectorAll`.
    *
    * @param [context=document]
    *           A DOM element within which to query. Can also be a selector
    *           string in which case the first matching element will be used
    *           as context. If missing (or no element matches selector), falls
    *           back to `document`.
    *
    * @return A element list of elements that were found. Will be empty if none were found.
    *
    */
  @JSName("$$")
  def DollarDollar(selector: String): NodeList[Node] = js.native
  @JSName("$$")
  def DollarDollar(selector: String, context: String): NodeList[Node] = js.native
  @JSName("$$")
  def DollarDollar(selector: String, context: Element): NodeList[Node] = js.native
  
  /**
    * Add a CSS class name to an element
    *
    * @param element
    *        Element to add class name to.
    *
    * @param classToAdd
    *        Class name to add.
    *
    * @return The dom element with the added class name.
    */
  def addClass(element: Element, classToAdd: String): Element = js.native
  
  def appendContent(el: Element, content: js.Array[Content]): Element = js.native
  /**
    * Normalizes and appends content to an element.
    *
    * @param el
    *        Element to append normalized content to.
    *
    *
    * @param content
    *        See the `content` argument of {@link dom:normalizeContent}
    *
    * @return The element with appended normalized content.
    */
  def appendContent(el: Element, content: Content): Element = js.native
  
  /**
    * Attempt to block the ability to select text while dragging controls
    */
  def blockTextSelection(): Unit = js.native
  
  def createEl(): Element = js.native
  def createEl(tagName: String): Element = js.native
  def createEl(tagName: String, properties: Any): Element = js.native
  def createEl(tagName: String, properties: Any, attributes: Any): Element = js.native
  def createEl(tagName: String, properties: Any, attributes: Any, content: Any): Element = js.native
  def createEl(tagName: String, properties: Any, attributes: Unit, content: Any): Element = js.native
  def createEl(tagName: String, properties: Unit, attributes: Any): Element = js.native
  def createEl(tagName: String, properties: Unit, attributes: Any, content: Any): Element = js.native
  def createEl(tagName: String, properties: Unit, attributes: Unit, content: Any): Element = js.native
  def createEl(tagName: Unit, properties: Any): Element = js.native
  def createEl(tagName: Unit, properties: Any, attributes: Any): Element = js.native
  def createEl(tagName: Unit, properties: Any, attributes: Any, content: Any): Element = js.native
  def createEl(tagName: Unit, properties: Any, attributes: Unit, content: Any): Element = js.native
  def createEl(tagName: Unit, properties: Unit, attributes: Any): Element = js.native
  def createEl(tagName: Unit, properties: Unit, attributes: Any, content: Any): Element = js.native
  def createEl(tagName: Unit, properties: Unit, attributes: Unit, content: Any): Element = js.native
  /**
    * Creates an element and applies properties.
    *
    * @param [tagName='div']
    *         Name of tag to be created.
    *
    * @param [properties={}]
    *         Element properties to be applied.
    *
    * @param [attributes={}]
    *         Element attributes to be applied.
    *
    * @param [content]
    *         Contents for the element (see: {@link dom:normalizeContent})
    *
    * @return The element that was created.
    */
  @JSName("createEl")
  def createEl_canvas(tagName: canvas): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Any, attributes: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Any, attributes: Any, content: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Any, attributes: Unit, content: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Unit, attributes: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Unit, attributes: Any, content: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_canvas(tagName: canvas, properties: Unit, attributes: Unit, content: Any): HTMLCanvasElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Any, attributes: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Any, attributes: Any, content: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Any, attributes: Unit, content: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Unit, attributes: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Unit, attributes: Any, content: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_form(tagName: form, properties: Unit, attributes: Unit, content: Any): HTMLFormElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Any, attributes: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Any, attributes: Any, content: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Any, attributes: Unit, content: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Unit, attributes: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Unit, attributes: Any, content: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_img(tagName: img, properties: Unit, attributes: Unit, content: Any): HTMLImageElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Any, attributes: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Any, attributes: Any, content: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Any, attributes: Unit, content: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Unit, attributes: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Unit, attributes: Any, content: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_input(tagName: input, properties: Unit, attributes: Unit, content: Any): HTMLInputElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Any, attributes: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Any, attributes: Any, content: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Any, attributes: Unit, content: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Unit, attributes: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Unit, attributes: Any, content: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_option(tagName: option, properties: Unit, attributes: Unit, content: Any): HTMLOptionElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Any, attributes: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Any, attributes: Any, content: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Any, attributes: Unit, content: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Unit, attributes: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Unit, attributes: Any, content: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_select(tagName: select, properties: Unit, attributes: Unit, content: Any): HTMLSelectElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Any): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Any, attributes: Any): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Any, attributes: Any, content: Any): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Any, attributes: Unit, content: Any): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Unit, attributes: Any): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Unit, attributes: Any, content: Any): HTMLTextAreaElement = js.native
  @JSName("createEl")
  def createEl_textarea(tagName: textarea, properties: Unit, attributes: Unit, content: Any): HTMLTextAreaElement = js.native
  
  /**
    * Empties the contents of an element.
    *
    * @param el
    *        The element to empty children from
    *
    * @return The element with no children
    */
  def emptyEl(el: Element): Element = js.native
  
  /**
    * Offset Left.
    * getBoundingClientRect technique from
    * John Resig
    *
    * @see http://ejohn.org/blog/getboundingclientrect-is-awesome/
    *
    * @param el
    *        Element from which to get offset
    *
    * @return The position of the element that was passed in.
    */
  def findPosition(el: Element): Position = js.native
  
  /**
    * Get the value of an element's attribute
    *
    * @param el
    *        A DOM element
    *
    * @param attribute
    *        Attribute to get the value of
    *
    * @return value of the attribute
    */
  def getAttribute(el: Element, attribute: String): String = js.native
  
  /**
    * Get an element's attribute values, as defined on the HTML tag
    * Attributes are not the same as properties. They're defined on the tag
    * or with setAttribute (which shouldn't be used with HTML)
    * This will return true or false for boolean attributes.
    *
    * @param tag
    *        Element from which to get tag attributes.
    *
    * @return All attributes of the element.
    */
  def getAttributes(tag: Element): Any = js.native
  
  /**
    * Identical to the native `getBoundingClientRect` function, but ensures that
    * the method is supported at all (it is in all browsers we claim to support)
    * and that the element is in the DOM before continuing.
    *
    * This wrapper function also shims properties which are not provided by some
    * older browsers (namely, IE8).
    *
    * Additionally, some browsers do not support adding properties to a
    * `ClientRect`/`DOMRect` object; so, we shallow-copy it with the standard
    * properties (except `x` and `y` which are not widely supported). This helps
    * avoid implementations where keys are non-enumerable.
    *
    * @param el
    *         Element whose `ClientRect` we want to calculate.
    *
    * @return Always returns a plain
    */
  def getBoundingClientRect(el: Element): ClientRect = js.native
  
  /**
    * Get pointer position in element
    * Returns an object with x and y coordinates.
    * The base on the coordinates are the bottom left of the element.
    *
    * @param el
    *        Element on which to get the pointer position on
    *
    * @param event
    *        Event object
    *
    * @return A Coordinates object corresponding to the mouse position.
    *
    */
  def getPointerPosition(el: Element, event: Event): Coordinates = js.native
  
  /**
    * Check if an element has a CSS class
    *
    * @param element
    *        Element to check
    *
    * @param classToCheck
    *        Class name to check for
    *
    * @return - True if the element had the class
    *         - False otherwise.
    *
    * @throws {Error}
    *         Throws an error if `classToCheck` has white space.
    */
  def hasClass(element: Element, classToCheck: String): Boolean = js.native
  
  /**
    * Normalizes and inserts content into an element; this is identical to
    * `appendContent()`, except it empties the element first.
    *
    * @param el
    *        Element to insert normalized content into.
    *
    * @param content
    *        See the `content` argument of {@link dom:normalizeContent}
    *
    * @return The element with inserted normalized content.
    *
    */
  def insertContent(el: Element, content: String): Element = js.native
  def insertContent(el: Element, content: js.Function0[Any]): Element = js.native
  def insertContent(el: Element, content: Element): Element = js.native
  
  /**
    * Determines, via duck typing, whether or not a value is a DOM element.
    *
    * @param value
    *        The thing to check
    *
    * @return - True if it is a DOM element
    *         - False otherwise
    */
  def isEl(value: Any): Boolean = js.native
  
  /**
    * Determines if the current DOM is embedded in an iframe.
    *
    * @return
    */
  def isInFrame(): Boolean = js.native
  
  /**
    * Whether the current DOM interface appears to be real.
    *
    * @return
    */
  def isReal(): Boolean = js.native
  
  /**
    * Check if event was a single left click
    *
    * @param event
    *        Event object
    *
    * @return - True if a left click
    *         - False if not a left click
    */
  def isSingleLeftClick(event: typingsJapgolly.videoJs.mod.videojs.EventTarget.Event): Boolean = js.native
  
  /**
    * Determines, via duck typing, whether or not a value is a text node.
    *
    * @param value
    *        Check if this value is a text node.
    *
    * @return - True if it is a text node
    *         - False otherwise
    */
  def isTextNode(value: Any): Boolean = js.native
  
  def normalizeContent(content: js.Array[Content]): js.Array[Content] = js.native
  /**
    * Normalizes content for eventual insertion into the DOM.
    *
    * This allows a wide range of content definition methods, but protects
    * from falling into the trap of simply writing to `innerHTML`, which is
    * an XSS concern.
    *
    * The content for an element can be passed in multiple types and
    * combinations, whose behavior is as follows:
    *
    * @param content
    *        - String: Normalized into a text node.
    *        - Element/TextNode: Passed through.
    *        - Array: A one-dimensional array of strings, elements, nodes, or functions
    *          (which return single strings, elements, or nodes).
    *        - Function: If the sole argument, is expected to produce a string, element,
    *          node, or array as defined above.
    *
    * @return All of the content that was passed in normalized.
    */
  def normalizeContent(content: Content): js.Array[Content] = js.native
  
  /**
    * Insert an element as the first child node of another
    *
    * @param child
    *        Element to insert
    *
    * @param parent
    *        Element to insert child into
    */
  def prependTo(child: Element, parent: Element): Unit = js.native
  
  /**
    * Remove an element's attribute
    *
    * @param el
    *        A DOM element
    *
    * @param attribute
    *        Attribute to remove
    */
  def removeAttribute(el: Element, attribute: String): Unit = js.native
  
  /**
    * Remove a CSS class name from an element
    *
    * @param element
    *        Element to remove a class name from.
    *
    * @param classToRemove
    *        Class name to remove
    *
    * @return The dom element with class name removed.
    */
  def removeClass(element: Element, classToRemove: String): Element = js.native
  
  /**
    * Set the value of an element's attribute
    *
    * @param el
    *        A DOM element
    *
    * @param attribute
    *        Attribute to set
    *
    * @param value
    *        Value to set the attribute to
    */
  def setAttribute(el: Element, attribute: String, value: String): Unit = js.native
  
  /**
    * Apply attributes to an HTML element.
    *
    * @param el
    *        Element to add attributes to.
    *
    * @param [attributes]
    *        Attributes to be applied.
    */
  def setAttributes(el: Element, attributes: Any): Unit = js.native
  
  /**
    * Injects text into an element, replacing any existing contents entirely.
    *
    * @param el
    *        The element to add text content into
    *
    * @param text
    *        The text content to add.
    *
    * @return The element with added text content.
    */
  def textContent(el: Element, text: String): Element = js.native
  
  /**
    * Adds or removes a CSS class name on an element depending on an optional
    * condition or the presence/absence of the class name.
    *
    * @param element
    *        The element to toggle a class name on.
    *
    * @param classToToggle
    *        The class that should be toggled
    *
    * @param [predicate]
    *        See the return value for {@link Dom~PredicateCallback}
    *
    * @return The element with a class that has been toggled.
    */
  def toggleClass(element: Element, classToToggle: String, predicate: Predicate): Element = js.native
  
  /**
    * Turn off text selection blocking
    */
  def unblockTextSelection(): Unit = js.native
}
object Dom {
  
  /**
    * x and y coordinates for a dom element or mouse pointer
    */
  trait Coordinates extends StObject {
    
    /**
      * x coordinate in pixels
      */
    var x: Double
    
    /**
      * y coordinate in pixels
      */
    var y: Double
  }
  object Coordinates {
    
    inline def apply(x: Double, y: Double): Coordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The postion of a DOM element on the page.
    */
  trait Position extends StObject {
    
    /**
      * Pixels to the left
      */
    var left: Double
    
    /**
      * Pixels on top
      */
    var top: Double
  }
  object Position {
    
    inline def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The callback definition for toggleElClass.
    *
    * @param element
    *        The DOM element of the Component.
    *
    * @param classToToggle
    *        The `className` that wants to be toggled
    *
    * @return - If true the `classToToggle` will get added to `element`.
    *         - If false the `classToToggle` will get removed from `element`.
    *         - If undefined this callback will be ignored
    */
  type Predicate = js.Function2[/* element */ Element, /* classToToggle */ String, Boolean]
}
