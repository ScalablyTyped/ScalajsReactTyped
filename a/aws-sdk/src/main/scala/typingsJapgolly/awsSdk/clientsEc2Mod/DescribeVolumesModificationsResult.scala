package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesModificationsResult extends StObject {
  
  /**
    * Token for pagination, null if there are no more results 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the volume modifications.
    */
  var VolumesModifications: js.UndefOr[VolumeModificationList] = js.undefined
}
object DescribeVolumesModificationsResult {
  
  inline def apply(): DescribeVolumesModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesModificationsResult]
  }
  
  extension [Self <: DescribeVolumesModificationsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVolumesModifications(value: VolumeModificationList): Self = StObject.set(x, "VolumesModifications", value.asInstanceOf[js.Any])
    
    inline def setVolumesModificationsUndefined: Self = StObject.set(x, "VolumesModifications", js.undefined)
    
    inline def setVolumesModificationsVarargs(value: VolumeModification*): Self = StObject.set(x, "VolumesModifications", js.Array(value*))
  }
}
