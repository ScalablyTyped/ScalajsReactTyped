package typingsJapgolly.pickadate

import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.pickadate.Pickadate.DateOptions
import typingsJapgolly.pickadate.Pickadate.DatePicker
import typingsJapgolly.pickadate.Pickadate.Pickatime
import typingsJapgolly.pickadate.Pickadate.TimeOptions
import typingsJapgolly.pickadate.Pickadate.TimePicker
import typingsJapgolly.pickadate.pickadateStrings.$node
import typingsJapgolly.pickadate.pickadateStrings.$root
import typingsJapgolly.pickadate.pickadateStrings._hidden
import typingsJapgolly.pickadate.pickadateStrings.picker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("pickadate")
  var pickadate_Original: typingsJapgolly.pickadate.Pickadate.Pickadate = js.native
  @JSName("pickatime")
  var pickatime_Original: Pickatime = js.native
  /**
    * Initialize a date picker.
    */
  def pickadate(): JQuery = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def pickadate(methodName: String, arguments: js.Any*): js.Any = js.native
  def pickadate(options: DateOptions): JQuery = js.native
  @JSName("pickadate")
  def pickadate_hidden(objectName: _hidden): HTMLInputElement = js.native
  @JSName("pickadate")
  def pickadate_node(objectName: $node): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  @JSName("pickadate")
  def pickadate_picker(keyword: picker): DatePicker = js.native
  @JSName("pickadate")
  def pickadate_root(objectName: $root): JQuery = js.native
  /**
    * Initialize a time picker.
    */
  def pickatime(): JQuery = js.native
  /**
    * Invoke API methods after time picker initialization.
    */
  def pickatime(methodName: String, arguments: js.Any*): js.Any = js.native
  def pickatime(options: TimeOptions): JQuery = js.native
  @JSName("pickatime")
  def pickatime_hidden(objectName: _hidden): HTMLInputElement = js.native
  @JSName("pickatime")
  def pickatime_node(objectName: $node): JQuery = js.native
  /**
    * Access the API object on an initialized time picker element.
    */
  @JSName("pickatime")
  def pickatime_picker(keyword: picker): TimePicker = js.native
  @JSName("pickatime")
  def pickatime_root(objectName: $root): JQuery = js.native
}

