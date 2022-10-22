package typingsJapgolly.libp2pMplex

import japgolly.scalajs.react.Callback
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.Message
import typingsJapgolly.libp2pMplex.distSrcMplexMod.MplexStream
import typingsJapgolly.libp2pMplex.libp2pMplexStrings.initiator
import typingsJapgolly.libp2pMplex.libp2pMplexStrings.receiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStreamMod {
  
  @JSImport("@libp2p/mplex/dist/src/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(options: Options): MplexStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(options.asInstanceOf[js.Any]).asInstanceOf[MplexStream]
  
  trait Options extends StObject {
    
    var id: Double
    
    var maxMsgSize: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    def send(msg: Message): Unit
    
    var `type`: js.UndefOr[initiator | receiver] = js.undefined
  }
  object Options {
    
    inline def apply(id: Double, send: Message => Callback): Options = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], send = js.Any.fromFunction1((t0: Message) => send(t0).runNow()))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaxMsgSize(value: Double): Self = StObject.set(x, "maxMsgSize", value.asInstanceOf[js.Any])
      
      inline def setMaxMsgSizeUndefined: Self = StObject.set(x, "maxMsgSize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnEnd(value: /* err */ js.UndefOr[js.Error] => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Error]) => value(t0).runNow()))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setSend(value: Message => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
      
      inline def setType(value: initiator | receiver): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
