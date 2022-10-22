package typingsJapgolly.awsGreengrassCoreSdk.mod.StreamManager

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportDefinitionMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.ExportDefinition")
@js.native
open class ExportDefinition protected ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod.ExportDefinition {
  /**
    * @param http Defines how the stream is uploaded to an HTTP endpoint.
    * @param iotAnalytics Defines how the stream is uploaded to IoT Analytics.
    * @param kinesis Defines how the stream is uploaded to Kinesis.
    * @param IotSitewise Defines how the stream is uploaded to IoT SiteWise.
    * @param s3TaskExecutor Defines the list of configs for S3 task executors.
    */
  def this(
    http: js.UndefOr[
        js.Array[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.HTTPConfig] | Null
      ],
    iotAnalytics: js.UndefOr[
        js.Array[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.IoTAnalyticsConfig] | Null
      ],
    kinesis: js.UndefOr[
        js.Array[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.KinesisConfig] | Null
      ],
    IotSitewise: js.UndefOr[
        js.Array[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.IoTSiteWiseConfig] | Null
      ],
    s3TaskExecutor: js.UndefOr[
        (js.Array[
          typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.S3ExportTaskExecutorConfig
        ]) | Null
      ]
  ) = this()
}
/* static members */
object ExportDefinition {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportDefinition.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportDefinitionMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportDefinition]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportDefinition.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportDefinition.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
