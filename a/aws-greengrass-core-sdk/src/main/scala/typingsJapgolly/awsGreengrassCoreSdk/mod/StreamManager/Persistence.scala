package typingsJapgolly.awsGreengrassCoreSdk.mod.StreamManager

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.PersistenceMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.PersistenceOptions
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.PersistenceOptionsFlipped
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.PersistenceValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence")
@js.native
open class Persistence ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod.Persistence {
  def this(value: PersistenceValue) = this()
}
/* static members */
object Persistence {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.File")
  @js.native
  def File: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Persistence = js.native
  inline def File_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.Memory")
  @js.native
  def Memory: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Persistence = js.native
  inline def Memory_=(x: typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Persistence): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Memory")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: PersistenceMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Persistence = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Persistence]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.options")
  @js.native
  def options: PersistenceOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Persistence.optionsFlipped")
  @js.native
  def optionsFlipped: PersistenceOptionsFlipped = js.native
  inline def optionsFlipped_=(x: PersistenceOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: PersistenceOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
