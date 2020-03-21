package typingsJapgolly.pulumiAws.ec2RouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.ec2.RouteTableRoute
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableArgs extends js.Object {
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of route objects. Their keys are documented below. This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val routes: js.UndefOr[Input[js.Array[Input[RouteTableRoute]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: Input[String] = js.native
}

object RouteTableArgs {
  @scala.inline
  def apply(
    vpcId: Input[String],
    propagatingVgws: Input[js.Array[Input[String]]] = null,
    routes: Input[js.Array[Input[RouteTableRoute]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): RouteTableArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (propagatingVgws != null) __obj.updateDynamic("propagatingVgws")(propagatingVgws.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableArgs]
  }
}

