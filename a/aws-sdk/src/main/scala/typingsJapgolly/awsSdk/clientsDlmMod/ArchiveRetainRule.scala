package typingsJapgolly.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveRetainRule extends StObject {
  
  /**
    * Information about retention period in the Amazon EBS Snapshots Archive. For more information, see Archive Amazon EBS snapshots.
    */
  var RetentionArchiveTier: typingsJapgolly.awsSdk.clientsDlmMod.RetentionArchiveTier
}
object ArchiveRetainRule {
  
  inline def apply(RetentionArchiveTier: RetentionArchiveTier): ArchiveRetainRule = {
    val __obj = js.Dynamic.literal(RetentionArchiveTier = RetentionArchiveTier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveRetainRule]
  }
  
  extension [Self <: ArchiveRetainRule](x: Self) {
    
    inline def setRetentionArchiveTier(value: RetentionArchiveTier): Self = StObject.set(x, "RetentionArchiveTier", value.asInstanceOf[js.Any])
  }
}
