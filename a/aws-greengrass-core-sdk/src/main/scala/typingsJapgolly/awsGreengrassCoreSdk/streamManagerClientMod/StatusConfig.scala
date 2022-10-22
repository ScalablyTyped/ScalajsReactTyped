package typingsJapgolly.awsGreengrassCoreSdk.streamManagerClientMod

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfigMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusConfig")
@js.native
/**
  * @param statusLevel Defines the verbosity of status messages in a status-stream.
  * @param statusStreamName The name of the stream to which status messages are appended.
  * The status-stream should be created before associating it with another stream.
  */
open class StatusConfig ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfig {
  def this(statusLevel: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel) = this()
  def this(statusLevel: Null, statusStreamName: String) = this()
  def this(statusLevel: Unit, statusStreamName: String) = this()
  def this(
    statusLevel: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel,
    statusStreamName: String
  ) = this()
}
/* static members */
object StatusConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusConfig.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusConfigMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfig]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusConfig.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusConfig.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
