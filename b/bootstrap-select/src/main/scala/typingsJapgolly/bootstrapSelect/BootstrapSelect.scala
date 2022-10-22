package typingsJapgolly.bootstrapSelect

import typingsJapgolly.bootstrapSelect.anon.BootstrapVersion
import typingsJapgolly.bootstrapSelect.anon.PartialBootstrapSelectOpt
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.`val`
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.add
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.deselectAll
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.destroy
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.hide
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.mobile
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.refresh
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.remove
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.render
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.selectAll
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.setStyle
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.show
import typingsJapgolly.bootstrapSelect.bootstrapSelectStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapSelect[T] extends StObject {
  
  /**
    * Main function
    */
  def apply(): JQuery[T] = js.native
  def apply(method: selectAll | deselectAll | render | mobile | refresh | toggle | hide | show | destroy): JQuery[T] = js.native
  /**
    * Methods
    * @see {@link https://developer.snapappointments.com/bootstrap-select/methods/}
    */
  def apply(method: `val`, value: String): JQuery[T] = js.native
  def apply(method: `val`, value: js.Array[String]): JQuery[T] = js.native
  def apply(method: setStyle): JQuery[T] = js.native
  def apply(method: setStyle, className: String): JQuery[T] = js.native
  def apply(method: setStyle, className: String, action: add | remove): JQuery[T] = js.native
  def apply(method: setStyle, className: Unit, action: add | remove): JQuery[T] = js.native
  def apply(opts: PartialBootstrapSelectOpt): JQuery[T] = js.native
  
  val Constructor: BootstrapVersion = js.native
}
