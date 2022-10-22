package typingsJapgolly.pickadate.Pickadate

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.pickadate.JQuery
import typingsJapgolly.pickadate.pickadateStrings.$node
import typingsJapgolly.pickadate.pickadateStrings.$root
import typingsJapgolly.pickadate.pickadateStrings._hidden
import typingsJapgolly.pickadate.pickadateStrings.picker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pickadate extends StObject {
  
  /**
    * Initialize a date picker.
    */
  def apply(): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  def apply(keyword: picker): DatePicker = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def apply(methodName: String, arguments: Any*): Any = js.native
  def apply(objectName: $node): JQuery = js.native
  def apply(objectName: $root): JQuery = js.native
  def apply(objectName: _hidden): HTMLInputElement = js.native
  def apply(options: DateOptions): JQuery = js.native
  
  var defaults: DateOptions = js.native
}
