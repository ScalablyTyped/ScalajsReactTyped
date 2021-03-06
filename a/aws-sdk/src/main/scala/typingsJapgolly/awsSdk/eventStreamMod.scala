package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.awsSdkStrings.data_
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/event-stream/event-stream", JSImport.Namespace)
@js.native
object eventStreamMod extends js.Object {
  @js.native
  trait StreamingEventStream[Events] extends ReadableStream {
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_data(event: data_, listener: js.Function1[/* event */ Events, Unit]): this.type = js.native
  }
  
  type EventStream[Events] = StreamingEventStream[Events] | js.Array[Events]
}

