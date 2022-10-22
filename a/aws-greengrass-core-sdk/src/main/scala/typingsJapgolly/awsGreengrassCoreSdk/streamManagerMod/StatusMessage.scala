package typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusMessageMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "StatusMessage")
@js.native
open class StatusMessage protected ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerClientMod.StatusMessage {
  /**
    * @param eventType
    * @param statusLevel
    * @param status
    * @param statusContext
    * @param message  String describing the status message.
    * @param timestampEpochMs  The time this status was added to the status-stream (in milliseconds since epoch).
    */
  def this(
    eventType: js.UndefOr[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventType | Null],
    statusLevel: js.UndefOr[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel | Null],
    status: js.UndefOr[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Status | Null],
    statusContext: js.UndefOr[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusContext | Null],
    message: js.UndefOr[String | Null],
    timestampEpochMs: js.UndefOr[Double | Null]
  ) = this()
}
/* static members */
object StatusMessage {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusMessage.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMessageMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusMessage]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusMessage.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusMessage.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
