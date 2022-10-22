package typingsJapgolly.kendoUi.kendo.data

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObservableObject
  extends StObject
     with Observable {
  
  def get(name: String): Any = js.native
  
  def init(): Unit = js.native
  def init(value: Any): Unit = js.native
  
  def parent(): ObservableObject = js.native
  
  def set(name: String, value: Any): Unit = js.native
  
  def toJSON(): js.Object = js.native
  
  var uid: String = js.native
}
