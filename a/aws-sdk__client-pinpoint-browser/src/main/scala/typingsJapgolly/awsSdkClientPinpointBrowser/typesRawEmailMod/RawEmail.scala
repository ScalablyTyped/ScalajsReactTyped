package typingsJapgolly.awsSdkClientPinpointBrowser.typesRawEmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEmail extends js.Object {
  /**
    * The raw data of the email.
    */
  var Data: js.UndefOr[
    scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String
  ] = js.undefined
}

object RawEmail {
  @scala.inline
  def apply(
    Data: scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String = null
  ): RawEmail = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEmail]
  }
}

