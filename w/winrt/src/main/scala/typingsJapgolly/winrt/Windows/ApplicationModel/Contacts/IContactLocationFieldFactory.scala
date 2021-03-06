package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactLocationFieldFactory extends js.Object {
  def createLocation(unstructuredAddress: String): ContactLocationField = js.native
  def createLocation(unstructuredAddress: String, category: ContactFieldCategory): ContactLocationField = js.native
  def createLocation(
    unstructuredAddress: String,
    category: ContactFieldCategory,
    street: String,
    city: String,
    region: String,
    country: String,
    postalCode: String
  ): ContactLocationField = js.native
}

