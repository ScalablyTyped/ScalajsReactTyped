package typingsJapgolly.kendoUi.kendo.mobile

import typingsJapgolly.kendoUi.kendo.Observable
import typingsJapgolly.kendoUi.kendo.Router
import typingsJapgolly.kendoUi.kendo.mobile.ui.Pane
import typingsJapgolly.kendoUi.kendo.mobile.ui.Scroller
import typingsJapgolly.kendoUi.kendo.mobile.ui.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application
  extends StObject
     with Observable {
  
  def changeLoadingMessage(text: String): Unit = js.native
  
  def hideLoading(): Unit = js.native
  
  def init(): Unit = js.native
  def init(element: Any): Unit = js.native
  def init(element: Any, options: ApplicationOptions): Unit = js.native
  def init(element: Unit, options: ApplicationOptions): Unit = js.native
  
  def navigate(url: String): Unit = js.native
  def navigate(url: String, transition: String): Unit = js.native
  
  var options: ApplicationOptions = js.native
  
  var pane: Pane = js.native
  
  def replace(url: String): Unit = js.native
  def replace(url: String, transition: String): Unit = js.native
  
  var router: Router = js.native
  
  def scroller(): Scroller = js.native
  
  def showLoading(): Unit = js.native
  
  def skin(skin: String): String = js.native
  
  def view(): View = js.native
}
