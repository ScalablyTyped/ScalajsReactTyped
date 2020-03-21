package typingsJapgolly.antDesignPro.authorizedMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.authorizedRouteMod.authority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizedProps extends js.Object {
  var authority: typingsJapgolly.antDesignPro.authorizedRouteMod.authority
  var noMatch: js.UndefOr[Node] = js.undefined
}

object IAuthorizedProps {
  @scala.inline
  def apply(authority: authority, noMatch: VdomNode = null): IAuthorizedProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedProps]
  }
}

