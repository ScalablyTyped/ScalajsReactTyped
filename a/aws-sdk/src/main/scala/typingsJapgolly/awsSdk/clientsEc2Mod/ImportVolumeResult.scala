package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportVolumeResult extends StObject {
  
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.ConversionTask] = js.undefined
}
object ImportVolumeResult {
  
  inline def apply(): ImportVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVolumeResult]
  }
  
  extension [Self <: ImportVolumeResult](x: Self) {
    
    inline def setConversionTask(value: ConversionTask): Self = StObject.set(x, "ConversionTask", value.asInstanceOf[js.Any])
    
    inline def setConversionTaskUndefined: Self = StObject.set(x, "ConversionTask", js.undefined)
  }
}
