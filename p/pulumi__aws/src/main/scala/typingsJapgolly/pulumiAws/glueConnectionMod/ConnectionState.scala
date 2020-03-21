package typingsJapgolly.pulumiAws.glueConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionState extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of the connection. Defaults to `JBDC`.
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the connection.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: js.UndefOr[Input[ConnectionPhysicalConnectionRequirements]] = js.native
}

object ConnectionState {
  @scala.inline
  def apply(
    catalogId: Input[String] = null,
    connectionProperties: Input[StringDictionary[_]] = null,
    connectionType: Input[String] = null,
    description: Input[String] = null,
    matchCriterias: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    physicalConnectionRequirements: Input[ConnectionPhysicalConnectionRequirements] = null
  ): ConnectionState = {
    val __obj = js.Dynamic.literal()
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (connectionProperties != null) __obj.updateDynamic("connectionProperties")(connectionProperties.asInstanceOf[js.Any])
    if (connectionType != null) __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (matchCriterias != null) __obj.updateDynamic("matchCriterias")(matchCriterias.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (physicalConnectionRequirements != null) __obj.updateDynamic("physicalConnectionRequirements")(physicalConnectionRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
}

