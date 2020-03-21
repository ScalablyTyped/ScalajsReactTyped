package typingsJapgolly.pulumiAws.inputMod.dms

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointMongodbSettings extends js.Object {
  var authMechanism: js.UndefOr[Input[String]] = js.native
  var authSource: js.UndefOr[Input[String]] = js.native
  var authType: js.UndefOr[Input[String]] = js.native
  var docsToInvestigate: js.UndefOr[Input[String]] = js.native
  var extractDocId: js.UndefOr[Input[String]] = js.native
  var nestingLevel: js.UndefOr[Input[String]] = js.native
}

object EndpointMongodbSettings {
  @scala.inline
  def apply(
    authMechanism: Input[String] = null,
    authSource: Input[String] = null,
    authType: Input[String] = null,
    docsToInvestigate: Input[String] = null,
    extractDocId: Input[String] = null,
    nestingLevel: Input[String] = null
  ): EndpointMongodbSettings = {
    val __obj = js.Dynamic.literal()
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (docsToInvestigate != null) __obj.updateDynamic("docsToInvestigate")(docsToInvestigate.asInstanceOf[js.Any])
    if (extractDocId != null) __obj.updateDynamic("extractDocId")(extractDocId.asInstanceOf[js.Any])
    if (nestingLevel != null) __obj.updateDynamic("nestingLevel")(nestingLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointMongodbSettings]
  }
}

