package typingsJapgolly.typedGithubApi.interfacesBranchMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchRef extends js.Object {
  val name: String
  val repository: RepositoryRef
  def loadAsync(): js.Promise[Branch | Null]
}

object BranchRef {
  @scala.inline
  def apply(loadAsync: CallbackTo[js.Promise[Branch | Null]], name: String, repository: RepositoryRef): BranchRef = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("loadAsync")(loadAsync.toJsFn)
    __obj.asInstanceOf[BranchRef]
  }
}

