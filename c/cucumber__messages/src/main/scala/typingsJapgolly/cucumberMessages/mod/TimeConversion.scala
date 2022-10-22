package typingsJapgolly.cucumberMessages.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeConversion {
  
  @JSImport("@cucumber/messages", "TimeConversion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDurations(
    durationA: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration,
    durationB: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration
  ): typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("addDurations")(durationA.asInstanceOf[js.Any], durationB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration]
  
  inline def durationToMilliseconds(duration: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMilliseconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def millisecondsSinceEpochToTimestamp(millisecondsSinceEpoch: Double): typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsSinceEpochToTimestamp")(millisecondsSinceEpoch.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Timestamp]
  
  inline def millisecondsToDuration(durationInMilliseconds: Double): typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToDuration")(durationInMilliseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Duration]
  
  inline def timestampToMillisecondsSinceEpoch(timestamp: typingsJapgolly.cucumberMessages.distCjsSrcMessagesMod.Timestamp): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampToMillisecondsSinceEpoch")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
