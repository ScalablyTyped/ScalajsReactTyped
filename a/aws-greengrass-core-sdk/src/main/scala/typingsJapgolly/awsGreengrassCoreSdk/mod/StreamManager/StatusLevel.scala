package typingsJapgolly.awsGreengrassCoreSdk.mod.StreamManager

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelOptions
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelOptionsFlipped
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel")
@js.native
open class StatusLevel ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod.StatusLevel {
  def this(value: StatusLevelValue) = this()
}
/* static members */
object StatusLevel {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.DEBUG")
  @js.native
  def DEBUG: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def DEBUG_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.ERROR")
  @js.native
  def ERROR: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def ERROR_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.INFO")
  @js.native
  def INFO: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def INFO_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.TRACE")
  @js.native
  def TRACE: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def TRACE_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.WARN")
  @js.native
  def WARN: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def WARN_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusLevelMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.options")
  @js.native
  def options: StatusLevelOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusLevel.optionsFlipped")
  @js.native
  def optionsFlipped: StatusLevelOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StatusLevelOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StatusLevelOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
