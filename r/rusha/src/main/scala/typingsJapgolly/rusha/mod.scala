package typingsJapgolly.rusha

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Blob
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.MessageEvent
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.rusha.rushaStrings.hex
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rusha", JSImport.Namespace)
  @js.native
  val ^ : Rusha = js.native
  
  @js.native
  trait Hash extends StObject {
    
    def digest(encoding: Unit): js.typedarray.ArrayBuffer = js.native
    @JSName("digest")
    def digest_hex(encoding: hex): String = js.native
    
    def update(value: String): Hash = js.native
    def update(value: js.Array[Double]): Hash = js.native
    def update(value: js.typedarray.ArrayBuffer): Hash = js.native
    def update(value: Buffer): Hash = js.native
  }
  
  trait Rusha extends StObject {
    
    def createHash(): Hash
    
    def createWorker(): RushaWorker
    
    def disableWorkerBehaviour(): Unit
  }
  object Rusha {
    
    inline def apply(
      createHash: CallbackTo[Hash],
      createWorker: CallbackTo[RushaWorker],
      disableWorkerBehaviour: Callback
    ): Rusha = {
      val __obj = js.Dynamic.literal(createHash = createHash.toJsFn, createWorker = createWorker.toJsFn, disableWorkerBehaviour = disableWorkerBehaviour.toJsFn)
      __obj.asInstanceOf[Rusha]
    }
    
    extension [Self <: Rusha](x: Self) {
      
      inline def setCreateHash(value: CallbackTo[Hash]): Self = StObject.set(x, "createHash", value.toJsFn)
      
      inline def setCreateWorker(value: CallbackTo[RushaWorker]): Self = StObject.set(x, "createWorker", value.toJsFn)
      
      inline def setDisableWorkerBehaviour(value: Callback): Self = StObject.set(x, "disableWorkerBehaviour", value.toJsFn)
    }
  }
  
  @js.native
  trait RushaWorker
    extends StObject
       with Worker {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    @JSName("onmessage")
    var onmessage_RushaWorker: (js.ThisFunction1[/* this */ this.type, /* res */ MessageEvent, Unit]) | Null = js.native
    
    def postMessage(req: RushaWorkerRequest): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  trait RushaWorkerRequest extends StObject {
    
    var data: String | js.Array[Double] | js.typedarray.ArrayBuffer | Buffer | Blob
    
    var id: String
  }
  object RushaWorkerRequest {
    
    inline def apply(data: String | js.Array[Double] | js.typedarray.ArrayBuffer | Buffer | Blob, id: String): RushaWorkerRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RushaWorkerRequest]
    }
    
    extension [Self <: RushaWorkerRequest](x: Self) {
      
      inline def setData(value: String | js.Array[Double] | js.typedarray.ArrayBuffer | Buffer | Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RushaWorkerResponse extends StObject {
    
    var hash: String
    
    var id: String
  }
  object RushaWorkerResponse {
    
    inline def apply(hash: String, id: String): RushaWorkerResponse = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RushaWorkerResponse]
    }
    
    extension [Self <: RushaWorkerResponse](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Rusha
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Rusha = ^
}
