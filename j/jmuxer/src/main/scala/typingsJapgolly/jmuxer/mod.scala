package typingsJapgolly.jmuxer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.jmuxer.jmuxerStrings.audio
import typingsJapgolly.jmuxer.jmuxerStrings.both
import typingsJapgolly.jmuxer.jmuxerStrings.video
import typingsJapgolly.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jmuxer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with JMuxer {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def createStream(): Duplex = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def feed(data: Feeder): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  trait Feeder extends StObject {
    
    var audio: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var video: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Feeder {
    
    inline def apply(): Feeder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Feeder]
    }
    
    extension [Self <: Feeder](x: Self) {
      
      inline def setAudio(value: js.typedarray.Uint8Array): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setVideo(value: js.typedarray.Uint8Array): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait JMuxer extends StObject {
    
    def createStream(): Duplex
    
    def destroy(): Unit
    
    def feed(data: Feeder): Unit
    
    def reset(): Unit
  }
  object JMuxer {
    
    inline def apply(createStream: CallbackTo[Duplex], destroy: Callback, feed: Feeder => Callback, reset: Callback): JMuxer = {
      val __obj = js.Dynamic.literal(createStream = createStream.toJsFn, destroy = destroy.toJsFn, feed = js.Any.fromFunction1((t0: Feeder) => feed(t0).runNow()), reset = reset.toJsFn)
      __obj.asInstanceOf[JMuxer]
    }
    
    extension [Self <: JMuxer](x: Self) {
      
      inline def setCreateStream(value: CallbackTo[Duplex]): Self = StObject.set(x, "createStream", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setFeed(value: Feeder => Callback): Self = StObject.set(x, "feed", js.Any.fromFunction1((t0: Feeder) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  trait Options extends StObject {
    
    var clearBuffer: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var flushingTime: js.UndefOr[Double] = js.undefined
    
    var fps: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[both | audio | video] = js.undefined
    
    var node: String | HTMLVideoElement
    
    var onError: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(node: String | HTMLVideoElement): Options = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClearBuffer(value: Boolean): Self = StObject.set(x, "clearBuffer", value.asInstanceOf[js.Any])
      
      inline def setClearBufferUndefined: Self = StObject.set(x, "clearBuffer", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFlushingTime(value: Double): Self = StObject.set(x, "flushingTime", value.asInstanceOf[js.Any])
      
      inline def setFlushingTimeUndefined: Self = StObject.set(x, "flushingTime", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setMode(value: both | audio | video): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNode(value: String | HTMLVideoElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: /* data */ Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* data */ Any) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    }
  }
}
