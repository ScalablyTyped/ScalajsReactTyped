package typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatOptions
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatOptionsFlipped
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "ExportFormat")
@js.native
open class ExportFormat protected ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerClientMod.ExportFormat {
  def this(value: ExportFormatValue) = this()
}
/* static members */
object ExportFormat {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ExportFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ExportFormat.JSON_BATCHED")
  @js.native
  def JSON_BATCHED: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat = js.native
  inline def JSON_BATCHED_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_BATCHED")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ExportFormat.RAW_NOT_BATCHED")
  @js.native
  def RAW_NOT_BATCHED: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat = js.native
  inline def RAW_NOT_BATCHED_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW_NOT_BATCHED")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportFormatMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ExportFormat.options")
  @js.native
  def options: ExportFormatOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "ExportFormat.optionsFlipped")
  @js.native
  def optionsFlipped: ExportFormatOptionsFlipped = js.native
  inline def optionsFlipped_=(x: ExportFormatOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: ExportFormatOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
