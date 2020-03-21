package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAnalysisSchemesRequest extends js.Object {
  /**
    * The analysis schemes you want to describe.
    */
  var AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.native
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typingsJapgolly.awsSdk.cloudsearchMod.DomainName = js.native
}

object DescribeAnalysisSchemesRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AnalysisSchemeNames: StandardNameList = null,
    Deployed: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeAnalysisSchemesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (AnalysisSchemeNames != null) __obj.updateDynamic("AnalysisSchemeNames")(AnalysisSchemeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisSchemesRequest]
  }
}

