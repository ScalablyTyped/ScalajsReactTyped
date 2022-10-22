package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait isAdGroupChild
  extends StObject
     with isCampaignChild {
  
  def getAdGroup(): AdGroup
}
object isAdGroupChild {
  
  inline def apply(getAdGroup: CallbackTo[AdGroup], getCampaign: CallbackTo[Campaign]): isAdGroupChild = {
    val __obj = js.Dynamic.literal(getAdGroup = getAdGroup.toJsFn, getCampaign = getCampaign.toJsFn)
    __obj.asInstanceOf[isAdGroupChild]
  }
  
  extension [Self <: isAdGroupChild](x: Self) {
    
    inline def setGetAdGroup(value: CallbackTo[AdGroup]): Self = StObject.set(x, "getAdGroup", value.toJsFn)
  }
}
