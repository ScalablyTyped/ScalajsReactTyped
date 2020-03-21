package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
trait INDCustomData extends js.Object {
  /** Gets the custom data. */
  var customData: Double
  /** Gets the 16-byte type identifier for the custom data. */
  var customDataTypeID: Double
}

object INDCustomData {
  @scala.inline
  def apply(customData: Double, customDataTypeID: Double): INDCustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], customDataTypeID = customDataTypeID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INDCustomData]
  }
}

