package typingsJapgolly.typedGithubApi.interfacesIssueMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueRef extends js.Object {
  val number: Double
  def loadAsync(): js.Promise[Issue | Null]
  def loadRepositoryAsync(): js.Promise[Repository]
}

object IssueRef {
  @scala.inline
  def apply(
    loadAsync: CallbackTo[js.Promise[Issue | Null]],
    loadRepositoryAsync: CallbackTo[js.Promise[Repository]],
    number: Double
  ): IssueRef = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.updateDynamic("loadRepositoryAsync")(loadRepositoryAsync.toJsFn)
    __obj.asInstanceOf[IssueRef]
  }
}

