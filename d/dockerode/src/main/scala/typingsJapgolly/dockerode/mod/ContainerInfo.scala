package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dockerode.AnonDestination
import typingsJapgolly.dockerode.AnonNetworkMode
import typingsJapgolly.dockerode.AnonNetworks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInfo extends js.Object {
  var Command: String
  var Created: Double
  var HostConfig: AnonNetworkMode
  var Id: String
  var Image: String
  var ImageID: String
  var Labels: StringDictionary[String]
  var Mounts: js.Array[AnonDestination]
  var Names: js.Array[String]
  var NetworkSettings: AnonNetworks
  var Ports: js.Array[Port]
  var State: String
  var Status: String
}

object ContainerInfo {
  @scala.inline
  def apply(
    Command: String,
    Created: Double,
    HostConfig: AnonNetworkMode,
    Id: String,
    Image: String,
    ImageID: String,
    Labels: StringDictionary[String],
    Mounts: js.Array[AnonDestination],
    Names: js.Array[String],
    NetworkSettings: AnonNetworks,
    Ports: js.Array[Port],
    State: String,
    Status: String
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], ImageID = ImageID.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Ports = Ports.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerInfo]
  }
}

