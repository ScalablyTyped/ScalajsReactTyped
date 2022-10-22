package typingsJapgolly.domMediacaptureTransform

import org.scalajs.dom.MediaStreamTrack
import typingsJapgolly.domMediacaptureTransform.domMediacaptureTransformStrings.audio
import typingsJapgolly.domMediacaptureTransform.domMediacaptureTransformStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackGeneratorInit & {  kind :'audio',   signalTarget :dom-mediacapture-transform.MediaStreamAudioTrack | undefined} */
  trait MediaStreamTrackGenerator extends StObject {
    
    var kind: typingsJapgolly.domMediacaptureTransform.MediaStreamTrackGeneratorKind & audio
    
    /**
      * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
      * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
      * MediaStreamTrackGenerator’s constructor will raise an exception.
      */
    var signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamAudioTrack]
  }
  object MediaStreamTrackGenerator {
    
    inline def apply(
      kind: typingsJapgolly.domMediacaptureTransform.MediaStreamTrackGeneratorKind & audio,
      signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamAudioTrack]
    ): typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackGenerator = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], signalTarget = signalTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackGenerator]
    }
    
    extension [Self <: typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackGenerator](x: Self) {
      
      inline def setKind(value: typingsJapgolly.domMediacaptureTransform.MediaStreamTrackGeneratorKind & audio): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSignalTarget(value: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamAudioTrack]): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackGeneratorInit & {  kind :'video',   signalTarget :dom-mediacapture-transform.MediaStreamVideoTrack | undefined} */
  trait MediaStreamTrackGeneratorKind extends StObject {
    
    var kind: typingsJapgolly.domMediacaptureTransform.MediaStreamTrackGeneratorKind & video
    
    /**
      * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
      * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
      * MediaStreamTrackGenerator’s constructor will raise an exception.
      */
    var signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamVideoTrack]
  }
  object MediaStreamTrackGeneratorKind {
    
    inline def apply(
      kind: typingsJapgolly.domMediacaptureTransform.MediaStreamTrackGeneratorKind & video,
      signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamVideoTrack]
    ): typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], signalTarget = signalTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind]
    }
    
    extension [Self <: typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind](x: Self) {
      
      inline def setKind(value: typingsJapgolly.domMediacaptureTransform.MediaStreamTrackGeneratorKind & video): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSignalTarget(value: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamVideoTrack]): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackProcessorInit & {  track :dom-mediacapture-transform.MediaStreamAudioTrack} */
  trait MediaStreamTrackProcessor extends StObject {
    
    /**
      * If media frames are not read from MediaStreamTrackProcessor.readable quickly enough, the
      * MediaStreamTrackProcessor will internally buffer up to maxBufferSize of the frames produced
      * by the track. If the internal buffer is full, each time the track produces a new frame, the
      * oldest frame in the buffer will be dropped and the new frame will be added to the buffer.
      */
    var maxBufferSize: js.UndefOr[Double] = js.undefined
    
    var track: MediaStreamTrack & MediaStreamAudioTrack
  }
  object MediaStreamTrackProcessor {
    
    inline def apply(track: MediaStreamTrack & MediaStreamAudioTrack): typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackProcessor = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackProcessor]
    }
    
    extension [Self <: typingsJapgolly.domMediacaptureTransform.anon.MediaStreamTrackProcessor](x: Self) {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      inline def setTrack(value: MediaStreamTrack & MediaStreamAudioTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackProcessorInit & {  track :dom-mediacapture-transform.MediaStreamVideoTrack} */
  trait MediaStreamTrackProcessorMaxBufferSize extends StObject {
    
    /**
      * If media frames are not read from MediaStreamTrackProcessor.readable quickly enough, the
      * MediaStreamTrackProcessor will internally buffer up to maxBufferSize of the frames produced
      * by the track. If the internal buffer is full, each time the track produces a new frame, the
      * oldest frame in the buffer will be dropped and the new frame will be added to the buffer.
      */
    var maxBufferSize: js.UndefOr[Double] = js.undefined
    
    var track: MediaStreamTrack & MediaStreamVideoTrack
  }
  object MediaStreamTrackProcessorMaxBufferSize {
    
    inline def apply(track: MediaStreamTrack & MediaStreamVideoTrack): MediaStreamTrackProcessorMaxBufferSize = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaStreamTrackProcessorMaxBufferSize]
    }
    
    extension [Self <: MediaStreamTrackProcessorMaxBufferSize](x: Self) {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      inline def setTrack(value: MediaStreamTrack & MediaStreamVideoTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
