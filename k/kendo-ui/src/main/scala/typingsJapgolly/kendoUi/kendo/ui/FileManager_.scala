package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.FileManagerDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManager_
  extends StObject
     with Widget {
  
  var dataSource: DataSource = js.native
  
  def executeCommand(command: String): Unit = js.native
  def executeCommand(command: String, args: Any): Unit = js.native
  
  def getSelected(): Any | js.Array[Any] = js.native
  
  def getSize(): Any = js.native
  
  def items(): Any = js.native
  
  def navigate(path: String): Unit = js.native
  
  @JSName("options")
  var options_FileManager_ : FileManagerOptions = js.native
  
  def path(): String = js.native
  
  def refresh(): Unit = js.native
  
  def setDataSource(dataSource: FileManagerDataSource): Unit = js.native
  
  def view(): String = js.native
  def view(view: String): Unit = js.native
  @JSName("view")
  def view_Unit(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
