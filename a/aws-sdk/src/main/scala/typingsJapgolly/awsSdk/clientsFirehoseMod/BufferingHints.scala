package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferingHints extends StObject {
  
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300. This parameter is optional but if you specify a value for it, you must also specify a value for SizeInMBs, and vice versa.
    */
  var IntervalInSeconds: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.IntervalInSeconds] = js.undefined
  
  /**
    * Buffer incoming data to the specified size, in MiBs, before delivering it to the destination. The default value is 5. This parameter is optional but if you specify a value for it, you must also specify a value for IntervalInSeconds, and vice versa. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MiB/sec, the value should be 10 MiB or higher.
    */
  var SizeInMBs: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.SizeInMBs] = js.undefined
}
object BufferingHints {
  
  inline def apply(): BufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingHints]
  }
  
  extension [Self <: BufferingHints](x: Self) {
    
    inline def setIntervalInSeconds(value: IntervalInSeconds): Self = StObject.set(x, "IntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalInSecondsUndefined: Self = StObject.set(x, "IntervalInSeconds", js.undefined)
    
    inline def setSizeInMBs(value: SizeInMBs): Self = StObject.set(x, "SizeInMBs", value.asInstanceOf[js.Any])
    
    inline def setSizeInMBsUndefined: Self = StObject.set(x, "SizeInMBs", js.undefined)
  }
}
