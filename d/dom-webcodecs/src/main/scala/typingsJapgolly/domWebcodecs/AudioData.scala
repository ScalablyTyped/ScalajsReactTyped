package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioData extends StObject {
  
  def allocationSize(options: AudioDataCopyToOptions): Double
  
  def close(): Unit
  
  def copyTo(destination: AllowSharedBufferSource, options: AudioDataCopyToOptions): Unit
  
  val duration: Double
  
  val format: AudioSampleFormat
  
  val numberOfChannels: Double
  
  val numberOfFrames: Double
  
  val sampleRate: Double
  
  val timestamp: Double
}
object AudioData {
  
  inline def apply(
    allocationSize: AudioDataCopyToOptions => Double,
    close: Callback,
    copyTo: (AllowSharedBufferSource, AudioDataCopyToOptions) => Callback,
    duration: Double,
    format: AudioSampleFormat,
    numberOfChannels: Double,
    numberOfFrames: Double,
    sampleRate: Double,
    timestamp: Double
  ): AudioData = {
    val __obj = js.Dynamic.literal(allocationSize = js.Any.fromFunction1(allocationSize), close = close.toJsFn, copyTo = js.Any.fromFunction2((t0: AllowSharedBufferSource, t1: AudioDataCopyToOptions) => (copyTo(t0, t1)).runNow()), duration = duration.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], numberOfFrames = numberOfFrames.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioData]
  }
  
  extension [Self <: AudioData](x: Self) {
    
    inline def setAllocationSize(value: AudioDataCopyToOptions => Double): Self = StObject.set(x, "allocationSize", js.Any.fromFunction1(value))
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCopyTo(value: (AllowSharedBufferSource, AudioDataCopyToOptions) => Callback): Self = StObject.set(x, "copyTo", js.Any.fromFunction2((t0: AllowSharedBufferSource, t1: AudioDataCopyToOptions) => (value(t0, t1)).runNow()))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: AudioSampleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFrames(value: Double): Self = StObject.set(x, "numberOfFrames", value.asInstanceOf[js.Any])
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
