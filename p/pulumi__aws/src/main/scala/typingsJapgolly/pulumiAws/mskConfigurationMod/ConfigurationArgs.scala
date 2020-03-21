package typingsJapgolly.pulumiAws.mskConfigurationMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationArgs extends js.Object {
  /**
    * Description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: Input[js.Array[Input[String]]] = js.native
  /**
    * Name of the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: Input[String] = js.native
}

object ConfigurationArgs {
  @scala.inline
  def apply(
    kafkaVersions: Input[js.Array[Input[String]]],
    serverProperties: Input[String],
    description: Input[String] = null,
    name: Input[String] = null
  ): ConfigurationArgs = {
    val __obj = js.Dynamic.literal(kafkaVersions = kafkaVersions.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationArgs]
  }
}

