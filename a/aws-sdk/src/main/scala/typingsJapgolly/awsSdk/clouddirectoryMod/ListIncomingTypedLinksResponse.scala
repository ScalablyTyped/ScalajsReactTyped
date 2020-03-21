package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIncomingTypedLinksResponse extends js.Object {
  /**
    * Returns one or more typed link specifiers as output.
    */
  var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListIncomingTypedLinksResponse {
  @scala.inline
  def apply(LinkSpecifiers: TypedLinkSpecifierList = null, NextToken: NextToken = null): ListIncomingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    if (LinkSpecifiers != null) __obj.updateDynamic("LinkSpecifiers")(LinkSpecifiers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIncomingTypedLinksResponse]
  }
}

