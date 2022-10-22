package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRegexPatternSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsJapgolly.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to delete. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId
}
object DeleteRegexPatternSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, RegexPatternSetId: ResourceId): DeleteRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegexPatternSetRequest]
  }
  
  extension [Self <: DeleteRegexPatternSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetId(value: ResourceId): Self = StObject.set(x, "RegexPatternSetId", value.asInstanceOf[js.Any])
  }
}
