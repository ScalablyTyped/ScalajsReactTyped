package typingsJapgolly.firebaseFirestore.distLiteInternalMod.firestoreV1ApiClientInterfaces

import typingsJapgolly.firebaseFirestore.distLiteInternalMod.TargetChangeTargetChangeType
import typingsJapgolly.firebaseFirestore.distLiteInternalMod.Timestamp2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetChange extends StObject {
  
  var cause: js.UndefOr[Status] = js.undefined
  
  var readTime: js.UndefOr[Timestamp2] = js.undefined
  
  var resumeToken: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var targetChangeType: js.UndefOr[TargetChangeTargetChangeType] = js.undefined
  
  var targetIds: js.UndefOr[js.Array[Double]] = js.undefined
}
object TargetChange {
  
  inline def apply(): TargetChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetChange]
  }
  
  extension [Self <: TargetChange](x: Self) {
    
    inline def setCause(value: Status): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setReadTime(value: Timestamp2): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetChangeType(value: TargetChangeTargetChangeType): Self = StObject.set(x, "targetChangeType", value.asInstanceOf[js.Any])
    
    inline def setTargetChangeTypeUndefined: Self = StObject.set(x, "targetChangeType", js.undefined)
    
    inline def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    inline def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
