package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values extends StObject {
  
  def clear(): Unit = js.native
  
  def focus(item: String): Unit = js.native
  
  def getCleanValues(): Any = js.native
  
  def getDirtyValues(): Any = js.native
  
  def getValues(): Any = js.native
  def getValues(details: Any): Any = js.native
  
  def isDirty(): Boolean = js.native
  
  def markInvalid(name: String): Unit = js.native
  def markInvalid(name: String, state: String): Unit = js.native
  def markInvalid(name: String, state: Boolean): Unit = js.native
  
  def setDirty(): Unit = js.native
  def setDirty(mark: Boolean): Unit = js.native
  
  def setValues(values: Any): Unit = js.native
  def setValues(values: Any, update: Boolean): Unit = js.native
}
