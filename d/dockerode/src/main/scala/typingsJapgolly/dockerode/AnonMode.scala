package typingsJapgolly.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var Destination: String
  var Mode: String
  var Name: js.UndefOr[String] = js.undefined
  var Propagation: String
  var RW: Boolean
  var Source: String
}

object AnonMode {
  @scala.inline
  def apply(
    Destination: String,
    Mode: String,
    Propagation: String,
    RW: Boolean,
    Source: String,
    Name: String = null
  ): AnonMode = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Propagation = Propagation.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

