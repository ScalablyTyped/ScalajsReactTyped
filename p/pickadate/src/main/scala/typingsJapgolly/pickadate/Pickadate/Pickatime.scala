package typingsJapgolly.pickadate.Pickadate

import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.pickadate.JQuery
import typingsJapgolly.pickadate.pickadateStrings.$node
import typingsJapgolly.pickadate.pickadateStrings.$root
import typingsJapgolly.pickadate.pickadateStrings._hidden
import typingsJapgolly.pickadate.pickadateStrings.picker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pickatime extends js.Object {
  var defaults: TimeOptions = js.native
  /**
    * Initialize a time picker.
    */
  def apply(): JQuery = js.native
  /**
    * Access the API object on an initialized time picker element.
    */
  def apply(keyword: picker): TimePicker = js.native
  /**
    * Invoke API methods after time picker initialization.
    */
  def apply(methodName: String, arguments: js.Any*): js.Any = js.native
  def apply(objectName: $node): JQuery = js.native
  def apply(objectName: $root): JQuery = js.native
  def apply(objectName: _hidden): HTMLInputElement = js.native
  def apply(options: TimeOptions): JQuery = js.native
}

