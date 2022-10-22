package typingsJapgolly.awsGreengrassCoreSdk.mod.StreamManager

import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.MessageMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.MessageTypesMap
import typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.MessageValidationsMap
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.Message")
@js.native
open class Message protected ()
  extends typingsJapgolly.awsGreengrassCoreSdk.streamManagerMod.Message {
  /**
    * @param streamName The name of the stream which this message is in.
    * @param sequenceNumber The sequence number of this message within the stream.
    * @param ingestTime The time that the message was ingested to Stream Manager. Data is Unix epoch time in milliseconds.
    * @param payload The binary message data.
    */
  def this(
    streamName: js.UndefOr[String | Null],
    sequenceNumber: js.UndefOr[Double | Null],
    ingestTime: js.UndefOr[Double | Null],
    payload: js.UndefOr[Buffer | Null]
  ) = this()
}
/* static members */
object Message {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Message")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Message.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: MessageMap): typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsGreengrassCoreSdk.streamManagerDataMod.Message]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Message.typesMap")
  @js.native
  def typesMap: MessageTypesMap = js.native
  inline def typesMap_=(x: MessageTypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Message.validationsMap")
  @js.native
  def validationsMap: MessageValidationsMap = js.native
  inline def validationsMap_=(x: MessageValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
