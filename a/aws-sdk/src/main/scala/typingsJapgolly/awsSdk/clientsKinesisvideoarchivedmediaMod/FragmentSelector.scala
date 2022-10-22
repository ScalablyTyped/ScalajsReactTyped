package typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentSelector extends StObject {
  
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod.FragmentSelectorType
  
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: typingsJapgolly.awsSdk.clientsKinesisvideoarchivedmediaMod.TimestampRange
}
object FragmentSelector {
  
  inline def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSelector]
  }
  
  extension [Self <: FragmentSelector](x: Self) {
    
    inline def setFragmentSelectorType(value: FragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    inline def setTimestampRange(value: TimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
  }
}
