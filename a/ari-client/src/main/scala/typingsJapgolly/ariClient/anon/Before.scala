package typingsJapgolly.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before extends StObject {
  
  var after: js.UndefOr[Double] = js.undefined
  
  var before: js.UndefOr[Double] = js.undefined
  
  var between: js.UndefOr[Double] = js.undefined
  
  var channelId: String
  
  var dtmf: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object Before {
  
  inline def apply(channelId: String): Before = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  
  extension [Self <: Before](x: Self) {
    
    inline def setAfter(value: Double): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: Double): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBetween(value: Double): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setDtmf(value: String): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setDtmfUndefined: Self = StObject.set(x, "dtmf", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
