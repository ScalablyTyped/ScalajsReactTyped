package typingsJapgolly.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contacts extends js.Object {
  def create(): Contact = js.native
  def create(properties: js.Any): Contact = js.native
  def find(
    contactFields: js.Array[String],
    contactSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    contactError: js.Function1[/* error */ ContactError, Unit]
  ): Unit = js.native
  def find(
    contactFields: js.Array[String],
    contactSuccess: js.Function1[/* contacts */ js.Array[Contact], Unit],
    contactError: js.Function1[/* error */ ContactError, Unit],
    contactFindOptions: ContactFindOptions
  ): Unit = js.native
}

