package typingsJapgolly.pulumiAws.basePathMappingMod

import typingsJapgolly.pulumiAws.restApiMod.RestApi
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePathMappingArgs extends js.Object {
  /**
    * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
    */
  val basePath: js.UndefOr[Input[String]] = js.native
  /**
    * The already-registered domain name to connect the API to.
    */
  val domainName: Input[String] = js.native
  /**
    * The id of the API to connect.
    */
  val restApi: Input[RestApi] = js.native
  /**
    * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
    */
  val stageName: js.UndefOr[Input[String]] = js.native
}

object BasePathMappingArgs {
  @scala.inline
  def apply(
    domainName: Input[String],
    restApi: Input[RestApi],
    basePath: Input[String] = null,
    stageName: Input[String] = null
  ): BasePathMappingArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathMappingArgs]
  }
}

