package typingsJapgolly.pickadate

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.pickadate.Pickadate.DateOptions
import typingsJapgolly.pickadate.Pickadate.DatePicker
import typingsJapgolly.pickadate.Pickadate.Pickatime
import typingsJapgolly.pickadate.Pickadate.TimeOptions
import typingsJapgolly.pickadate.Pickadate.TimePicker
import typingsJapgolly.pickadate.pickadateStrings.$node
import typingsJapgolly.pickadate.pickadateStrings.$root
import typingsJapgolly.pickadate.pickadateStrings._hidden
import typingsJapgolly.pickadate.pickadateStrings.picker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Initialize a date picker.
    */
  def pickadate(): JQuery
  /**
    * Invoke API methods after date picker initialization.
    */
  def pickadate(methodName: String, arguments: Any*): Any
  def pickadate(options: DateOptions): JQuery
  @JSName("pickadate")
  var pickadate_Original: typingsJapgolly.pickadate.Pickadate.Pickadate
  @JSName("pickadate")
  def pickadate_hidden(objectName: _hidden): HTMLInputElement
  @JSName("pickadate")
  def pickadate_node(objectName: $node): JQuery
  /**
    * Access the API object on an initialized date picker element.
    */
  @JSName("pickadate")
  def pickadate_picker(keyword: picker): DatePicker
  @JSName("pickadate")
  def pickadate_root(objectName: $root): JQuery
  
  /**
    * Initialize a time picker.
    */
  def pickatime(): JQuery
  /**
    * Invoke API methods after time picker initialization.
    */
  def pickatime(methodName: String, arguments: Any*): Any
  def pickatime(options: TimeOptions): JQuery
  @JSName("pickatime")
  var pickatime_Original: Pickatime
  @JSName("pickatime")
  def pickatime_hidden(objectName: _hidden): HTMLInputElement
  @JSName("pickatime")
  def pickatime_node(objectName: $node): JQuery
  /**
    * Access the API object on an initialized time picker element.
    */
  @JSName("pickatime")
  def pickatime_picker(keyword: picker): TimePicker
  @JSName("pickatime")
  def pickatime_root(objectName: $root): JQuery
}
object JQuery {
  
  inline def apply(pickadate: typingsJapgolly.pickadate.Pickadate.Pickadate, pickatime: Pickatime): JQuery = {
    val __obj = js.Dynamic.literal(pickadate = pickadate.asInstanceOf[js.Any], pickatime = pickatime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setPickadate(value: typingsJapgolly.pickadate.Pickadate.Pickadate): Self = StObject.set(x, "pickadate", value.asInstanceOf[js.Any])
    
    inline def setPickatime(value: Pickatime): Self = StObject.set(x, "pickatime", value.asInstanceOf[js.Any])
  }
}
