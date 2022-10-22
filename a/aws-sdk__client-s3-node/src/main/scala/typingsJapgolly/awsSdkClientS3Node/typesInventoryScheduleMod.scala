package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Daily
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Weekly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryScheduleMod {
  
  trait InventorySchedule extends StObject {
    
    /**
      * <p>Specifies how frequently inventory results are produced.</p>
      */
    var Frequency: Daily | Weekly | String
  }
  object InventorySchedule {
    
    inline def apply(Frequency: Daily | Weekly | String): InventorySchedule = {
      val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventorySchedule]
    }
    
    extension [Self <: InventorySchedule](x: Self) {
      
      inline def setFrequency(value: Daily | Weekly | String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledInventorySchedule = InventorySchedule
}
