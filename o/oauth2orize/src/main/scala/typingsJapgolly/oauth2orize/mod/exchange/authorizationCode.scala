package typingsJapgolly.oauth2orize.mod.exchange

import typingsJapgolly.oauth2orize.mod.IssueExchangeCodeFunction
import typingsJapgolly.oauth2orize.mod.MiddlewareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "exchange.authorizationCode")
@js.native
object authorizationCode extends js.Object {
  def apply(issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
  def apply(options: Options, issue: IssueExchangeCodeFunction): MiddlewareFunction = js.native
}

