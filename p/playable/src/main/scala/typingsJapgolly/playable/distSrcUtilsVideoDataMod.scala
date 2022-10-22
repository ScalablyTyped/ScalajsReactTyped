package typingsJapgolly.playable

import org.scalajs.dom.TimeRanges
import typingsJapgolly.playable.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsVideoDataMod {
  
  @JSImport("playable/dist/src/utils/video-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def geOverallBufferLength(buffered: TimeRanges): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geOverallBufferLength")(buffered.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getNearestBufferSegmentInfo(buffered: TimeRanges): End = ^.asInstanceOf[js.Dynamic].applyDynamic("getNearestBufferSegmentInfo")(buffered.asInstanceOf[js.Any]).asInstanceOf[End]
  inline def getNearestBufferSegmentInfo(buffered: TimeRanges, currentTime: Double): End = (^.asInstanceOf[js.Dynamic].applyDynamic("getNearestBufferSegmentInfo")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any])).asInstanceOf[End]
  
  inline def getOverallBufferedPercent(buffered: TimeRanges): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getOverallBufferedPercent(buffered: TimeRanges, currentTime: Unit, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallBufferedPercent")(buffered.asInstanceOf[js.Any], currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getOverallPlayedPercent(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")().asInstanceOf[Double]
  inline def getOverallPlayedPercent(currentTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")(currentTime.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getOverallPlayedPercent(currentTime: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")(currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getOverallPlayedPercent(currentTime: Unit, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverallPlayedPercent")(currentTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTimePercent(time: Double, durationTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimePercent")(time.asInstanceOf[js.Any], durationTime.asInstanceOf[js.Any])).asInstanceOf[Double]
}
