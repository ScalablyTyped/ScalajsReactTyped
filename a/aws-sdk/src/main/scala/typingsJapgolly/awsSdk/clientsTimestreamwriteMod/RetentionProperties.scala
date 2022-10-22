package typingsJapgolly.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionProperties extends StObject {
  
  /**
    * The duration for which data must be stored in the magnetic store. 
    */
  var MagneticStoreRetentionPeriodInDays: typingsJapgolly.awsSdk.clientsTimestreamwriteMod.MagneticStoreRetentionPeriodInDays
  
  /**
    * The duration for which data must be stored in the memory store. 
    */
  var MemoryStoreRetentionPeriodInHours: typingsJapgolly.awsSdk.clientsTimestreamwriteMod.MemoryStoreRetentionPeriodInHours
}
object RetentionProperties {
  
  inline def apply(
    MagneticStoreRetentionPeriodInDays: MagneticStoreRetentionPeriodInDays,
    MemoryStoreRetentionPeriodInHours: MemoryStoreRetentionPeriodInHours
  ): RetentionProperties = {
    val __obj = js.Dynamic.literal(MagneticStoreRetentionPeriodInDays = MagneticStoreRetentionPeriodInDays.asInstanceOf[js.Any], MemoryStoreRetentionPeriodInHours = MemoryStoreRetentionPeriodInHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionProperties]
  }
  
  extension [Self <: RetentionProperties](x: Self) {
    
    inline def setMagneticStoreRetentionPeriodInDays(value: MagneticStoreRetentionPeriodInDays): Self = StObject.set(x, "MagneticStoreRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setMemoryStoreRetentionPeriodInHours(value: MemoryStoreRetentionPeriodInHours): Self = StObject.set(x, "MemoryStoreRetentionPeriodInHours", value.asInstanceOf[js.Any])
  }
}
