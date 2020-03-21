package typingsJapgolly.pulumiAws.thingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingState extends js.Object {
  /**
    * The ARN of the thing.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Map of attributes of the thing.
    */
  val attributes: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The default client ID.
    */
  val defaultClientId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the thing.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The thing type name.
    */
  val thingTypeName: js.UndefOr[Input[String]] = js.native
  /**
    * The current version of the thing record in the registry.
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object ThingState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    attributes: Input[StringDictionary[_]] = null,
    defaultClientId: Input[String] = null,
    name: Input[String] = null,
    thingTypeName: Input[String] = null,
    version: Input[Double] = null
  ): ThingState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (defaultClientId != null) __obj.updateDynamic("defaultClientId")(defaultClientId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingState]
  }
}

