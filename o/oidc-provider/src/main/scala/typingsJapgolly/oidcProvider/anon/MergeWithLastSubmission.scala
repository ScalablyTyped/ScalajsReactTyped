package typingsJapgolly.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeWithLastSubmission extends StObject {
  
  var mergeWithLastSubmission: js.UndefOr[Boolean] = js.undefined
}
object MergeWithLastSubmission {
  
  inline def apply(): MergeWithLastSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeWithLastSubmission]
  }
  
  extension [Self <: MergeWithLastSubmission](x: Self) {
    
    inline def setMergeWithLastSubmission(value: Boolean): Self = StObject.set(x, "mergeWithLastSubmission", value.asInstanceOf[js.Any])
    
    inline def setMergeWithLastSubmissionUndefined: Self = StObject.set(x, "mergeWithLastSubmission", js.undefined)
  }
}
