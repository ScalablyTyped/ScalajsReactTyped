package typingsJapgolly.awsGreengrassCoreSdk.streamManagerClientMod

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventTypeMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventTypeOptions
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventTypeOptionsFlipped
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventTypeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "EventType")
@js.native
open class EventType ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventType {
  def this(value: EventTypeValue) = this()
}
/* static members */
object EventType {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "EventType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "EventType.S3Task")
  @js.native
  def S3Task: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventType = js.native
  inline def S3Task_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S3Task")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: EventTypeMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.EventType]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "EventType.options")
  @js.native
  def options: EventTypeOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "EventType.optionsFlipped")
  @js.native
  def optionsFlipped: EventTypeOptionsFlipped = js.native
  inline def optionsFlipped_=(x: EventTypeOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: EventTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
