package typingsJapgolly.oauth2orize.mod.grant

import typingsJapgolly.oauth2orize.mod.IssueGrantCodeFunction
import typingsJapgolly.oauth2orize.mod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "grant.code")
@js.native
object code extends js.Object {
  def apply(issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueGrantCodeFunction): MiddlewareFunction = js.native
}

