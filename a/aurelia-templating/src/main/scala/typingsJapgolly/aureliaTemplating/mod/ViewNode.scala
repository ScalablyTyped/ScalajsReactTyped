package typingsJapgolly.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewNode extends StObject {
  
  /**
  	* Triggers the attach for the node and its children.
  	*/
  def attached(): Unit = js.native
  
  /**
  	* Binds the node and it's children.
  	* @param bindingContext The binding context to bind to.
  	* @param overrideContext A secondary binding context that can override the standard context.
  	*/
  def bind(bindingContext: js.Object): Unit = js.native
  def bind(bindingContext: js.Object, overrideContext: js.Object): Unit = js.native
  
  /**
  	 * The children of this view node
  	 */
  var children: js.Array[ViewNode] = js.native
  
  /**
  	* Triggers the detach for the node and its children.
  	*/
  def detached(): Unit = js.native
  
  /**
  	* Unbinds the node and its children.
  	*/
  def unbind(): Unit = js.native
}
