package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegexPatternSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsJapgolly.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to update. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId
  
  /**
    * An array of RegexPatternSetUpdate objects that you want to insert into or delete from a RegexPatternSet.
    */
  var Updates: RegexPatternSetUpdates
}
object UpdateRegexPatternSetRequest {
  
  inline def apply(ChangeToken: ChangeToken, RegexPatternSetId: ResourceId, Updates: RegexPatternSetUpdates): UpdateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegexPatternSetRequest]
  }
  
  extension [Self <: UpdateRegexPatternSetRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetId(value: ResourceId): Self = StObject.set(x, "RegexPatternSetId", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: RegexPatternSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: RegexPatternSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value*))
  }
}
