package typingsJapgolly.dojo.dijit._editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/selection.html
  *
  * Deprecated text selection API.  Will be removed in 2.0.  New code should use dijit/selection.
  * 
  */
trait selection extends js.Object {
  /**
    * Function to collapse (clear), the current selection
    * 
    * @param beginning Indicates whether to collapse the cursor to the beginning of the selection or end.             
    */
  def collapse(beginning: Boolean): Unit
  /**
    * Return the parent element of the current selection which is of
    * type tagName (or one of the other specified tagName)
    * 
    * @param tagName The tag name to determine if it has an ancestor of.             
    */
  def getAncestorElement(tagName: String): js.Any
  /**
    * Get the parent element of the current selection
    * 
    */
  def getParentElement(): js.Any
  /**
    * Function to locate a parent node that matches one of a set of tags
    * 
    * @param node The node to inspect.             
    * @param tags             
    */
  def getParentOfType(node: HTMLElement, tags: js.Array[String]): HTMLElement
  /**
    * Retrieves the selected element (if any), just in the case that
    * a single element (object like and image or a table) is
    * selected.
    * 
    */
  def getSelectedElement(): js.Any
  /**
    * Return the html text of the current selection or null if unavailable
    * 
    */
  def getSelectedHtml(): String
  /**
    * Return the text (no html tags) included in the current selection or null if no text is selected
    * 
    */
  def getSelectedText(): String
  /**
    * Get the selection type (like win.doc.select.type in IE).
    * 
    */
  def getType(): String
  /**
    * Check whether current selection has a  parent element which is
    * of type tagName (or one of the other specified tagName)
    * 
    * @param tagName The tag name to determine if it has an ancestor of.             
    */
  def hasAncestorElement(tagName: String): Boolean
  /**
    * This function determines if 'node' is
    * in the current selection.
    * 
    * @param node             
    */
  def inSelection(node: js.Any): Boolean
  /**
    * Function to determine if a node is one of an array of tags.
    * 
    * @param node The node to inspect.             
    * @param tags             
    */
  def isTag(node: HTMLElement, tags: js.Array[String]): js.Any
  /**
    * Function to delete the currently selected content from the document.
    * 
    */
  def remove(): js.Any
  /**
    * clear previous selection and select element (including all its children)
    * 
    * @param element The element to select.             
    * @param nochangefocus               OptionalBoolean indicating if the focus should be changed.  IE only.             
    */
  def selectElement(element: HTMLElement, nochangefocus: Boolean): Unit
  /**
    * clear previous selection and select the content of the node
    * (excluding the node itself)
    * 
    * @param element The element you wish to select the children content of.             
    * @param nochangefocus               OptionalIndicates if the focus should change or not.             
    */
  def selectElementChildren(element: HTMLElement, nochangefocus: Boolean): Unit
}

object selection {
  @scala.inline
  def apply(
    collapse: Boolean => Callback,
    getAncestorElement: String => CallbackTo[js.Any],
    getParentElement: CallbackTo[js.Any],
    getParentOfType: (HTMLElement, js.Array[String]) => CallbackTo[HTMLElement],
    getSelectedElement: CallbackTo[js.Any],
    getSelectedHtml: CallbackTo[String],
    getSelectedText: CallbackTo[String],
    getType: CallbackTo[String],
    hasAncestorElement: String => CallbackTo[Boolean],
    inSelection: js.Any => CallbackTo[Boolean],
    isTag: (HTMLElement, js.Array[String]) => CallbackTo[js.Any],
    remove: CallbackTo[js.Any],
    selectElement: (HTMLElement, Boolean) => Callback,
    selectElementChildren: (HTMLElement, Boolean) => Callback
  ): selection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: scala.Boolean) => collapse(t0).runNow()))
    __obj.updateDynamic("getAncestorElement")(js.Any.fromFunction1((t0: java.lang.String) => getAncestorElement(t0).runNow()))
    __obj.updateDynamic("getParentElement")(getParentElement.toJsFn)
    __obj.updateDynamic("getParentOfType")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Array[java.lang.String]) => getParentOfType(t0, t1).runNow()))
    __obj.updateDynamic("getSelectedElement")(getSelectedElement.toJsFn)
    __obj.updateDynamic("getSelectedHtml")(getSelectedHtml.toJsFn)
    __obj.updateDynamic("getSelectedText")(getSelectedText.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("hasAncestorElement")(js.Any.fromFunction1((t0: java.lang.String) => hasAncestorElement(t0).runNow()))
    __obj.updateDynamic("inSelection")(js.Any.fromFunction1((t0: js.Any) => inSelection(t0).runNow()))
    __obj.updateDynamic("isTag")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Array[java.lang.String]) => isTag(t0, t1).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("selectElement")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: scala.Boolean) => selectElement(t0, t1).runNow()))
    __obj.updateDynamic("selectElementChildren")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: scala.Boolean) => selectElementChildren(t0, t1).runNow()))
    __obj.asInstanceOf[selection]
  }
}

