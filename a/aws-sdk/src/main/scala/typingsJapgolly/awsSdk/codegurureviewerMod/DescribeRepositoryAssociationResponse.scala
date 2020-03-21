package typingsJapgolly.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryAssociationResponse extends js.Object {
  /**
    * Information about the repository association.
    */
  var RepositoryAssociation: js.UndefOr[typingsJapgolly.awsSdk.codegurureviewerMod.RepositoryAssociation] = js.native
}

object DescribeRepositoryAssociationResponse {
  @scala.inline
  def apply(RepositoryAssociation: RepositoryAssociation = null): DescribeRepositoryAssociationResponse = {
    val __obj = js.Dynamic.literal()
    if (RepositoryAssociation != null) __obj.updateDynamic("RepositoryAssociation")(RepositoryAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryAssociationResponse]
  }
}

