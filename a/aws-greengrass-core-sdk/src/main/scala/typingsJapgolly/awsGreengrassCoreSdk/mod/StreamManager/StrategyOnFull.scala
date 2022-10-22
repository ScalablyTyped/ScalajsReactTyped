package typingsJapgolly.awsGreengrassCoreSdk.mod.StreamManager

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullOptions
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullOptionsFlipped
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.StrategyOnFull")
@js.native
open class StrategyOnFull ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod.StrategyOnFull {
  def this(value: StrategyOnFullValue) = this()
}
/* static members */
object StrategyOnFull {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StrategyOnFull")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StrategyOnFull.OverwriteOldestData")
  @js.native
  val OverwriteOldestData: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StrategyOnFull.RejectNewData")
  @js.native
  val RejectNewData: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull = js.native
  
  inline def fromMap(d: StrategyOnFullMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StrategyOnFull.options")
  @js.native
  def options: StrategyOnFullOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StrategyOnFull.optionsFlipped")
  @js.native
  def optionsFlipped: StrategyOnFullOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StrategyOnFullOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StrategyOnFullOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
