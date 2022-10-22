package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait isCampaignChild extends StObject {
  
  def getCampaign(): Campaign
}
object isCampaignChild {
  
  inline def apply(getCampaign: CallbackTo[Campaign]): isCampaignChild = {
    val __obj = js.Dynamic.literal(getCampaign = getCampaign.toJsFn)
    __obj.asInstanceOf[isCampaignChild]
  }
  
  extension [Self <: isCampaignChild](x: Self) {
    
    inline def setGetCampaign(value: CallbackTo[Campaign]): Self = StObject.set(x, "getCampaign", value.toJsFn)
  }
}
