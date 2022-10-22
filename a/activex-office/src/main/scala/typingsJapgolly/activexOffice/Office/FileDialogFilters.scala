package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDialogFilters extends StObject {
  
  def apply(Index: Double): FileDialogFilter = js.native
  
  def Add(Description: String, Extensions: String): FileDialogFilter = js.native
  def Add(Description: String, Extensions: String, Position: Double): FileDialogFilter = js.native
  
  val Application: Any = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(filter: Any): Unit = js.native
  
  def Item(Index: Double): FileDialogFilter = js.native
  
  val Parent: Any = js.native
}
