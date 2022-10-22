package typingsJapgolly.socketIoP2p

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MediaStream
import org.scalajs.dom.RTCIceCandidate
import org.scalajs.dom.RTCPeerConnection
import org.scalajs.dom.RTCSessionDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates the P2P object
    * @param socket Socket.io socket
    * @param opts Object of viable options
    * @param cb Optional callback
    */
  @JSImport("socket.io-p2p", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SocketioP2PStatic {
    def this(socket: Any) = this()
    def this(socket: Any, opts: P2POptions) = this()
    def this(socket: Any, opts: Unit, cb: js.Function0[Unit]) = this()
    def this(socket: Any, opts: P2POptions, cb: js.Function0[Unit]) = this()
    
    /* CompleteClass */
    override def binarySlice(arr: js.Array[Any], interval: Double, cb: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def cb(): Unit = js.native
    
    /* CompleteClass */
    var decoder: Any = js.native
    
    /* CompleteClass */
    var defaultOps: DefaultOps = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override def emit(eventName: Any, data: Any): Unit = js.native
    
    /* CompleteClass */
    var numConnectedClients: Double = js.native
    
    /* CompleteClass */
    override def on(event: String, callback: js.Function1[/* data */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    var opts: P2POptions = js.native
    
    /* CompleteClass */
    var peerOpts: PeerOpts = js.native
    
    /* CompleteClass */
    override def setupPeerEvents(peer: Any): Unit = js.native
    
    /* CompleteClass */
    var socket: Any = js.native
    
    /**
      * Upgrade the connection to p2p
      */
    /* CompleteClass */
    override def upgrade(): Unit = js.native
    
    /* CompleteClass */
    var usePeerConnection: Boolean = js.native
    
    /* CompleteClass */
    var useSockets: Boolean = js.native
  }
  
  trait DefaultOps extends StObject {
    
    var autoUpgrade: Boolean
    
    var numClients: Double
  }
  object DefaultOps {
    
    inline def apply(autoUpgrade: Boolean, numClients: Double): DefaultOps = {
      val __obj = js.Dynamic.literal(autoUpgrade = autoUpgrade.asInstanceOf[js.Any], numClients = numClients.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOps]
    }
    
    extension [Self <: DefaultOps](x: Self) {
      
      inline def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "autoUpgrade", value.asInstanceOf[js.Any])
      
      inline def setNumClients(value: Double): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
    }
  }
  
  trait P2POptions extends StObject {
    
    /**
      * Upgrade to p2p connection (from s.io one) when peers are ready
      * @default true
      */
    var autoUpgrade: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max number of peers each client can connect to
      * @default 5
      */
    var numClients: js.UndefOr[Double] = js.undefined
    
    /**
      * Object of options passed to underlying peers
      * @default {}
      */
    var peerOpts: js.UndefOr[PeerOpts] = js.undefined
  }
  object P2POptions {
    
    inline def apply(): P2POptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P2POptions]
    }
    
    extension [Self <: P2POptions](x: Self) {
      
      inline def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "autoUpgrade", value.asInstanceOf[js.Any])
      
      inline def setAutoUpgradeUndefined: Self = StObject.set(x, "autoUpgrade", js.undefined)
      
      inline def setNumClients(value: Double): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
      
      inline def setNumClientsUndefined: Self = StObject.set(x, "numClients", js.undefined)
      
      inline def setPeerOpts(value: PeerOpts): Self = StObject.set(x, "peerOpts", value.asInstanceOf[js.Any])
      
      inline def setPeerOptsUndefined: Self = StObject.set(x, "peerOpts", js.undefined)
    }
  }
  
  trait PeerOpts extends StObject {
    
    /**
      * Custom answer constraints (used by createAnswer method)
      */
    var answerConstraints: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Custom WebRTC channel configuration (used by createDataChannel)
      * @default {}
      */
    var channelConfig: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Custom WebRTC data channel name
      * @default <randomString>
      */
    var channelName: js.UndefOr[String] = js.undefined
    
    /**
      * Custom WebRTC configuration (used by RTCPeerConnection constructor)
      * @default {iceServers:[{urls:'stun:stun.l.google.com:19302'},{urls:'stun:global.stun.twilio.com:3478?transport=udp'}]}
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Custom WebRTC video/voice constrainst (used by RTCPeerConnection constructor)
      * @default {}
      */
    var constraints: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Set to true if this is the initiating peer
      * @default false
      */
    var initiator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to create the stream in Object Mode. In this mode, incoming string data is not automatically converted to Buffer objects
      * @default false
      */
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom offer contstraints (used by createOffer methode)
      * @default {}
      */
    var offerConstraints: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Function to transform generated SDP signaling data (for advanced users)
      * @default (sdp)=>sdp
      */
    var sdpTransfrom: js.UndefOr[js.Function1[/* sdp */ Any, Any]] = js.undefined
    
    /**
      * If video/voice is desired, pass stream from getUserMedia
      * @default false
      */
    var stream: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of MediaStreams returned from getUserMedia
      * @default []
      */
    var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
    
    /**
      * Set to false to disable trickle ICE and get single 'signal' event (slower)
      * @default true
      */
    var trickle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom WebRTC implementation, mainly useful in node to specify the wrtc package
      * @default {}
      */
    var wrtc: js.UndefOr[RTCPeerConnection | RTCSessionDescription | RTCIceCandidate] = js.undefined
  }
  object PeerOpts {
    
    inline def apply(): PeerOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerOpts]
    }
    
    extension [Self <: PeerOpts](x: Self) {
      
      inline def setAnswerConstraints(value: js.Object): Self = StObject.set(x, "answerConstraints", value.asInstanceOf[js.Any])
      
      inline def setAnswerConstraintsUndefined: Self = StObject.set(x, "answerConstraints", js.undefined)
      
      inline def setChannelConfig(value: js.Object): Self = StObject.set(x, "channelConfig", value.asInstanceOf[js.Any])
      
      inline def setChannelConfigUndefined: Self = StObject.set(x, "channelConfig", js.undefined)
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setInitiator(value: Boolean): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
      
      inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setOfferConstraints(value: js.Object): Self = StObject.set(x, "offerConstraints", value.asInstanceOf[js.Any])
      
      inline def setOfferConstraintsUndefined: Self = StObject.set(x, "offerConstraints", js.undefined)
      
      inline def setSdpTransfrom(value: /* sdp */ Any => Any): Self = StObject.set(x, "sdpTransfrom", js.Any.fromFunction1(value))
      
      inline def setSdpTransfromUndefined: Self = StObject.set(x, "sdpTransfrom", js.undefined)
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStreams(value: js.Array[MediaStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value*))
      
      inline def setTrickle(value: Boolean): Self = StObject.set(x, "trickle", value.asInstanceOf[js.Any])
      
      inline def setTrickleUndefined: Self = StObject.set(x, "trickle", js.undefined)
      
      inline def setWrtc(value: RTCPeerConnection | RTCSessionDescription | RTCIceCandidate): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      inline def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  /**
    * Creates the P2P object
    * @param socket Socket.io socket
    * @param opts Object of viable options
    * @param cb Optional callback
    */
  trait SocketioP2PStatic extends StObject {
    
    def binarySlice(arr: js.Array[Any], interval: Double, cb: js.Function0[Unit]): Unit
    
    def cb(): Unit
    
    var decoder: Any
    
    var defaultOps: DefaultOps
    
    def disconnect(): Unit
    
    def emit(eventName: Any, data: Any): Unit
    
    var numConnectedClients: Double
    
    def on(event: String, callback: js.Function1[/* data */ Any, Unit]): Unit
    
    var opts: P2POptions
    
    var peerOpts: PeerOpts
    
    def setupPeerEvents(peer: Any): Unit
    
    var socket: Any
    
    /**
      * Upgrade the connection to p2p
      */
    def upgrade(): Unit
    
    var usePeerConnection: Boolean
    
    var useSockets: Boolean
  }
  object SocketioP2PStatic {
    
    inline def apply(
      binarySlice: (js.Array[Any], Double, js.Function0[Unit]) => Callback,
      cb: Callback,
      decoder: Any,
      defaultOps: DefaultOps,
      disconnect: Callback,
      emit: (Any, Any) => Callback,
      numConnectedClients: Double,
      on: (String, js.Function1[/* data */ Any, Unit]) => Callback,
      opts: P2POptions,
      peerOpts: PeerOpts,
      setupPeerEvents: Any => Callback,
      socket: Any,
      upgrade: Callback,
      usePeerConnection: Boolean,
      useSockets: Boolean
    ): SocketioP2PStatic = {
      val __obj = js.Dynamic.literal(binarySlice = js.Any.fromFunction3((t0: js.Array[Any], t1: Double, t2: js.Function0[Unit]) => (binarySlice(t0, t1, t2)).runNow()), cb = cb.toJsFn, decoder = decoder.asInstanceOf[js.Any], defaultOps = defaultOps.asInstanceOf[js.Any], disconnect = disconnect.toJsFn, emit = js.Any.fromFunction2((t0: Any, t1: Any) => (emit(t0, t1)).runNow()), numConnectedClients = numConnectedClients.asInstanceOf[js.Any], on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* data */ Any, Unit]) => (on(t0, t1)).runNow()), opts = opts.asInstanceOf[js.Any], peerOpts = peerOpts.asInstanceOf[js.Any], setupPeerEvents = js.Any.fromFunction1((t0: Any) => setupPeerEvents(t0).runNow()), socket = socket.asInstanceOf[js.Any], upgrade = upgrade.toJsFn, usePeerConnection = usePeerConnection.asInstanceOf[js.Any], useSockets = useSockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketioP2PStatic]
    }
    
    extension [Self <: SocketioP2PStatic](x: Self) {
      
      inline def setBinarySlice(value: (js.Array[Any], Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "binarySlice", js.Any.fromFunction3((t0: js.Array[Any], t1: Double, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setCb(value: Callback): Self = StObject.set(x, "cb", value.toJsFn)
      
      inline def setDecoder(value: Any): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setDefaultOps(value: DefaultOps): Self = StObject.set(x, "defaultOps", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setEmit(value: (Any, Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setNumConnectedClients(value: Double): Self = StObject.set(x, "numConnectedClients", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (String, js.Function1[/* data */ Any, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* data */ Any, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOpts(value: P2POptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setPeerOpts(value: PeerOpts): Self = StObject.set(x, "peerOpts", value.asInstanceOf[js.Any])
      
      inline def setSetupPeerEvents(value: Any => Callback): Self = StObject.set(x, "setupPeerEvents", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSocket(value: Any): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setUpgrade(value: Callback): Self = StObject.set(x, "upgrade", value.toJsFn)
      
      inline def setUsePeerConnection(value: Boolean): Self = StObject.set(x, "usePeerConnection", value.asInstanceOf[js.Any])
      
      inline def setUseSockets(value: Boolean): Self = StObject.set(x, "useSockets", value.asInstanceOf[js.Any])
    }
  }
}
