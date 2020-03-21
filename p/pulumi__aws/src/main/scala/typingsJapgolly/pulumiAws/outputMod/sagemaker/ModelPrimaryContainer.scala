package typingsJapgolly.pulumiAws.outputMod.sagemaker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPrimaryContainer extends js.Object {
  var containerHostname: js.UndefOr[String] = js.native
  var environment: js.UndefOr[StringDictionary[js.Any]] = js.native
  var image: String = js.native
  var modelDataUrl: js.UndefOr[String] = js.native
}

object ModelPrimaryContainer {
  @scala.inline
  def apply(
    image: String,
    containerHostname: String = null,
    environment: StringDictionary[js.Any] = null,
    modelDataUrl: String = null
  ): ModelPrimaryContainer = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPrimaryContainer]
  }
}

