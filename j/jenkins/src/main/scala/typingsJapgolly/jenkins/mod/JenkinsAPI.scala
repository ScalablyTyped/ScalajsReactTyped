package typingsJapgolly.jenkins.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jenkins.AnonAdd
import typingsJapgolly.jenkins.AnonBuild
import typingsJapgolly.jenkins.AnonCancel
import typingsJapgolly.jenkins.AnonConfig
import typingsJapgolly.jenkins.AnonGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsAPI extends js.Object {
  var build: AnonGet
  var job: AnonBuild
  var node: AnonConfig
  var queue: AnonCancel
  var view: AnonAdd
  def info(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: AnonGet,
    info: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Callback,
    job: AnonBuild,
    node: AnonConfig,
    queue: AnonCancel,
    view: AnonAdd
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* data */ js.Any, scala.Unit]) => info(t0).runNow()))
    __obj.asInstanceOf[JenkinsAPI]
  }
}

