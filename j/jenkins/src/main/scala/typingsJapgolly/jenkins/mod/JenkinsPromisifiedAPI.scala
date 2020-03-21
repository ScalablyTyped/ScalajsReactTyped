package typingsJapgolly.jenkins.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jenkins.AnonCopy
import typingsJapgolly.jenkins.AnonCreate
import typingsJapgolly.jenkins.AnonDestroy
import typingsJapgolly.jenkins.AnonItem
import typingsJapgolly.jenkins.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: AnonLog
  var job: AnonCopy
  var node: AnonCreate
  var queue: AnonItem
  var view: AnonDestroy
  def info(): js.Promise[_]
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(
    build: AnonLog,
    info: CallbackTo[js.Promise[js.Any]],
    job: AnonCopy,
    node: AnonCreate,
    queue: AnonItem,
    view: AnonDestroy
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("info")(info.toJsFn)
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

