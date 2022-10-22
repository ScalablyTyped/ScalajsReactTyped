package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleEntry extends StObject {
  
  /**
    * The approximate duration of this program, in seconds.
    */
  var ApproximateDurationSeconds: js.UndefOr[long] = js.undefined
  
  /**
    * The approximate time that the program will start playing.
    */
  var ApproximateStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the program.
    */
  var Arn: string
  
  /**
    * The name of the channel that uses this schedule.
    */
  var ChannelName: string
  
  /**
    * The name of the live source used for the program.
    */
  var LiveSourceName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the program.
    */
  var ProgramName: string
  
  /**
    * The schedule's ad break properties.
    */
  var ScheduleAdBreaks: js.UndefOr[listOfScheduleAdBreak] = js.undefined
  
  /**
    * The type of schedule entry. Valid values: PROGRAM or FILLER_SLATE.
    */
  var ScheduleEntryType: js.UndefOr[typingsJapgolly.awsSdk.clientsMediatailorMod.ScheduleEntryType] = js.undefined
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: string
  
  /**
    * The name of the VOD source.
    */
  var VodSourceName: js.UndefOr[string] = js.undefined
}
object ScheduleEntry {
  
  inline def apply(Arn: string, ChannelName: string, ProgramName: string, SourceLocationName: string): ScheduleEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ChannelName = ChannelName.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleEntry]
  }
  
  extension [Self <: ScheduleEntry](x: Self) {
    
    inline def setApproximateDurationSeconds(value: long): Self = StObject.set(x, "ApproximateDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setApproximateDurationSecondsUndefined: Self = StObject.set(x, "ApproximateDurationSeconds", js.undefined)
    
    inline def setApproximateStartTime(value: js.Date): Self = StObject.set(x, "ApproximateStartTime", value.asInstanceOf[js.Any])
    
    inline def setApproximateStartTimeUndefined: Self = StObject.set(x, "ApproximateStartTime", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceNameUndefined: Self = StObject.set(x, "LiveSourceName", js.undefined)
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    inline def setScheduleAdBreaks(value: listOfScheduleAdBreak): Self = StObject.set(x, "ScheduleAdBreaks", value.asInstanceOf[js.Any])
    
    inline def setScheduleAdBreaksUndefined: Self = StObject.set(x, "ScheduleAdBreaks", js.undefined)
    
    inline def setScheduleAdBreaksVarargs(value: ScheduleAdBreak*): Self = StObject.set(x, "ScheduleAdBreaks", js.Array(value*))
    
    inline def setScheduleEntryType(value: ScheduleEntryType): Self = StObject.set(x, "ScheduleEntryType", value.asInstanceOf[js.Any])
    
    inline def setScheduleEntryTypeUndefined: Self = StObject.set(x, "ScheduleEntryType", js.undefined)
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
