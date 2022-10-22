package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rating
  extends StObject
     with Widget {
  
  var container: JQuery = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_Rating: RatingOptions = js.native
  
  def readonly(enable: Boolean): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def value(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
