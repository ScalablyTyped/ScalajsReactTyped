package typingsJapgolly.cometd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cometd.mod.CometD
import typingsJapgolly.cometd.mod.Extension
import typingsJapgolly.cometd.mod.Listener
import typingsJapgolly.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeSyncExtensionMod {
  
  @JSImport("cometd/TimeSyncExtension", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TimeSyncExtension {
    
    /**
      * Get the estimated network lag in ms from the client to the server.
      */
    /* CompleteClass */
    override def getNetworkLag(): Double = js.native
    
    /**
      *
      * Get the estimated server time as a Date object
      */
    /* CompleteClass */
    override def getServerDate(): js.Date = js.native
    
    /**
      * Get the estimated server time in ms since the epoch.
      */
    /* CompleteClass */
    override def getServerTime(): Double = js.native
    
    /**
      * Get the estimated offset in ms from the clients clock to the
      * servers clock.  The server time is the client time plus the offset.
      */
    /* CompleteClass */
    override def getTimeOffset(): Double = js.native
    
    /**
      * Get an array of multiple offset samples used to calculate
      * the offset.
      */
    /* CompleteClass */
    override def getTimeOffsetSamples(): js.Array[Double] = js.native
    
    /* CompleteClass */
    @JSName("incoming")
    override def incoming_MTimeSyncExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("outgoing")
    override def outgoing_MTimeSyncExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("registered")
    override def registered_MTimeSyncExtension(name: String, cometd: CometD): Unit = js.native
    
    /* CompleteClass */
    @JSName("unregistered")
    override def unregistered_MTimeSyncExtension(): Unit = js.native
  }
  
  trait TimeSyncExtension
    extends StObject
       with Extension {
    
    /**
      * Get the estimated network lag in ms from the client to the server.
      */
    def getNetworkLag(): Double
    
    /**
      *
      * Get the estimated server time as a Date object
      */
    def getServerDate(): js.Date
    
    /**
      * Get the estimated server time in ms since the epoch.
      */
    def getServerTime(): Double
    
    /**
      * Get the estimated offset in ms from the clients clock to the
      * servers clock.  The server time is the client time plus the offset.
      */
    def getTimeOffset(): Double
    
    /**
      * Get an array of multiple offset samples used to calculate
      * the offset.
      */
    def getTimeOffsetSamples(): js.Array[Double]
    
    @JSName("incoming")
    def incoming_MTimeSyncExtension(message: Message): Unit
    @JSName("incoming")
    var incoming_Original: Listener
    
    @JSName("outgoing")
    def outgoing_MTimeSyncExtension(message: Message): Unit
    @JSName("outgoing")
    var outgoing_Original: Listener
    
    @JSName("registered")
    def registered_MTimeSyncExtension(name: String, cometd: CometD): Unit
    
    @JSName("unregistered")
    def unregistered_MTimeSyncExtension(): Unit
  }
  object TimeSyncExtension {
    
    inline def apply(
      getNetworkLag: CallbackTo[Double],
      getServerDate: CallbackTo[js.Date],
      getServerTime: CallbackTo[Double],
      getTimeOffset: CallbackTo[Double],
      getTimeOffsetSamples: CallbackTo[js.Array[Double]],
      incoming: /* message */ Message => Callback,
      outgoing: /* message */ Message => Callback,
      registered: (String, CometD) => Callback,
      unregistered: Callback
    ): TimeSyncExtension = {
      val __obj = js.Dynamic.literal(getNetworkLag = getNetworkLag.toJsFn, getServerDate = getServerDate.toJsFn, getServerTime = getServerTime.toJsFn, getTimeOffset = getTimeOffset.toJsFn, getTimeOffsetSamples = getTimeOffsetSamples.toJsFn, incoming = js.Any.fromFunction1((t0: /* message */ Message) => incoming(t0).runNow()), outgoing = js.Any.fromFunction1((t0: /* message */ Message) => outgoing(t0).runNow()), registered = js.Any.fromFunction2((t0: String, t1: CometD) => (registered(t0, t1)).runNow()), unregistered = unregistered.toJsFn)
      __obj.asInstanceOf[TimeSyncExtension]
    }
    
    extension [Self <: TimeSyncExtension](x: Self) {
      
      inline def setGetNetworkLag(value: CallbackTo[Double]): Self = StObject.set(x, "getNetworkLag", value.toJsFn)
      
      inline def setGetServerDate(value: CallbackTo[js.Date]): Self = StObject.set(x, "getServerDate", value.toJsFn)
      
      inline def setGetServerTime(value: CallbackTo[Double]): Self = StObject.set(x, "getServerTime", value.toJsFn)
      
      inline def setGetTimeOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeOffset", value.toJsFn)
      
      inline def setGetTimeOffsetSamples(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getTimeOffsetSamples", value.toJsFn)
      
      inline def setIncoming(value: /* message */ Message => Callback): Self = StObject.set(x, "incoming", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setOutgoing(value: /* message */ Message => Callback): Self = StObject.set(x, "outgoing", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setRegistered(value: (String, CometD) => Callback): Self = StObject.set(x, "registered", js.Any.fromFunction2((t0: String, t1: CometD) => (value(t0, t1)).runNow()))
      
      inline def setUnregistered(value: Callback): Self = StObject.set(x, "unregistered", value.toJsFn)
    }
  }
}
