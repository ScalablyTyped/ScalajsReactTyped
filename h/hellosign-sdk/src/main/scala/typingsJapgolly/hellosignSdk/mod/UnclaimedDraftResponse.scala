package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnclaimedDraftResponse
  extends StObject
     with BaseResponse {
  
  var unclaimed_draft: UnclaimedDraft
}
object UnclaimedDraftResponse {
  
  inline def apply(resHeaders: IncomingHttpHeaders, unclaimed_draft: UnclaimedDraft): UnclaimedDraftResponse = {
    val __obj = js.Dynamic.literal(resHeaders = resHeaders.asInstanceOf[js.Any], unclaimed_draft = unclaimed_draft.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnclaimedDraftResponse]
  }
  
  extension [Self <: UnclaimedDraftResponse](x: Self) {
    
    inline def setUnclaimed_draft(value: UnclaimedDraft): Self = StObject.set(x, "unclaimed_draft", value.asInstanceOf[js.Any])
  }
}
