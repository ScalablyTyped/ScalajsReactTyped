package typingsJapgolly.typedGithubApi.interfacesPullRequestMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestRef extends js.Object {
  val number: Double
  def loadAsync(): js.Promise[PullRequest | Null]
}

object PullRequestRef {
  @scala.inline
  def apply(loadAsync: CallbackTo[js.Promise[PullRequest | Null]], number: Double): PullRequestRef = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.asInstanceOf[PullRequestRef]
  }
}

