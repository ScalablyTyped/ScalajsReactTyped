package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeAPI extends StObject {
  
  def close(id: String): Unit = js.native
  def close(id: Double): Unit = js.native
  
  def closeAll(): Unit = js.native
  
  def getOpenItems(): js.Array[Any] = js.native
  
  def getState(): Any = js.native
  
  def isBranchOpen(id: String): Boolean = js.native
  def isBranchOpen(id: Double): Boolean = js.native
  
  def open(id: String): Unit = js.native
  def open(id: String, show: Boolean): Unit = js.native
  def open(id: Double): Unit = js.native
  def open(id: Double, show: Boolean): Unit = js.native
  
  def openAll(): Unit = js.native
  
  def setState(state: Any): Unit = js.native
}
