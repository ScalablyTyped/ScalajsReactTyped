package typingsJapgolly.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachStderr extends js.Object {
  var AttachStderr: Boolean
  var AttachStdin: Boolean
  var AttachStdout: Boolean
  var Cmd: js.Array[String]
  var Domainname: String
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.undefined
  var Env: js.Array[String]
  var ExposedPorts: StringDictionary[js.Object]
  var Hostname: String
  var Image: String
  var Labels: StringDictionary[String]
  var OnBuild: js.UndefOr[js.Any] = js.undefined
  var OpenStdin: Boolean
  var StdinOnce: Boolean
  var Tty: Boolean
  var User: String
  var Volumes: StringDictionary[js.Object]
  var WorkingDir: String
}

object AnonAttachStderr {
  @scala.inline
  def apply(
    AttachStderr: Boolean,
    AttachStdin: Boolean,
    AttachStdout: Boolean,
    Cmd: js.Array[String],
    Domainname: String,
    Env: js.Array[String],
    ExposedPorts: StringDictionary[js.Object],
    Hostname: String,
    Image: String,
    Labels: StringDictionary[String],
    OpenStdin: Boolean,
    StdinOnce: Boolean,
    Tty: Boolean,
    User: String,
    Volumes: StringDictionary[js.Object],
    WorkingDir: String,
    Entrypoint: String | js.Array[String] = null,
    OnBuild: js.Any = null
  ): AnonAttachStderr = {
    val __obj = js.Dynamic.literal(AttachStderr = AttachStderr.asInstanceOf[js.Any], AttachStdin = AttachStdin.asInstanceOf[js.Any], AttachStdout = AttachStdout.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Domainname = Domainname.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], ExposedPorts = ExposedPorts.asInstanceOf[js.Any], Hostname = Hostname.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], StdinOnce = StdinOnce.asInstanceOf[js.Any], Tty = Tty.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Volumes = Volumes.asInstanceOf[js.Any], WorkingDir = WorkingDir.asInstanceOf[js.Any])
    if (Entrypoint != null) __obj.updateDynamic("Entrypoint")(Entrypoint.asInstanceOf[js.Any])
    if (OnBuild != null) __obj.updateDynamic("OnBuild")(OnBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachStderr]
  }
}

