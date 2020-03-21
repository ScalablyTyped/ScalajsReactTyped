package typingsJapgolly.dojo.dijit.tree

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.dijit.Tree_.TreeNode
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/_dndContainer.html
  *
  * This is a base class for dijit/tree/_dndSelector, and isn't meant to be used directly.
  * It's modeled after dojo/dnd/Container.
  * 
  * @param tree Node or node's id to build the container on     
  * @param params A dict of parameters, which gets mixed into the object     
  */
@JSGlobal("dijit.tree._dndContainer")
@js.native
class dndContainer protected () extends js.Object {
  def this(tree: HTMLElement, params: js.Object) = this()
  /**
    * The currently hovered TreeNode.  Not set to anything for keyboard operation.  (TODO: change?)
    * 
    */
  var current: js.Object = js.native
  /**
    * Prepares this object to be garbage-collected
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Called when mouse is moved away from a TreeNode
    * 
    * @param widget             
    * @param evt             
    */
  def onMouseOut(widget: TreeNode, evt: Event_): Unit = js.native
  /**
    * Called when mouse is moved over a TreeNode
    * 
    * @param widget             
    * @param evt             
    */
  def onMouseOver(widget: TreeNode, evt: Event_): Unit = js.native
  /**
    * This function is called once, when mouse is out of our container
    * 
    */
  def onOutEvent(): Unit = js.native
  /**
    * This function is called once, when mouse is over our container
    * 
    */
  def onOverEvent(): Unit = js.native
}

