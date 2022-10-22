package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionModel extends StObject {
  
  def getSelectedId(as_array: Boolean): String | js.Array[Any] = js.native
  
  def getSelectedItem(as_array: Boolean): Any = js.native
  
  def isSelected(id: String): Boolean = js.native
  def isSelected(id: Double): Boolean = js.native
  
  def select(id: String, preserve: Boolean): Unit = js.native
  def select(id: js.Array[Any], preserve: Boolean): Unit = js.native
  
  def selectAll(): Unit = js.native
  def selectAll(from: String): Unit = js.native
  def selectAll(from: String, to: String): Unit = js.native
  def selectAll(from: Unit, to: String): Unit = js.native
  
  def unselect(): Unit = js.native
  def unselect(id: String): Unit = js.native
  
  def unselectAll(): Unit = js.native
}
