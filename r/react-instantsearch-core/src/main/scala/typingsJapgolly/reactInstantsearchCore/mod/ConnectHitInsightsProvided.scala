package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactInstantsearchCore.anon.HitBasicDoc
import typingsJapgolly.reactInstantsearchCore.anon.PartialInsightsClientPayl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectHitInsightsProvided extends StObject {
  
  var hit: HitBasicDoc
  
  var insights: WrappedInsightsClient
}
object ConnectHitInsightsProvided {
  
  inline def apply(
    hit: HitBasicDoc,
    insights: (/* method */ InsightsClientMethod, /* payload */ PartialInsightsClientPayl) => Callback
  ): ConnectHitInsightsProvided = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], insights = js.Any.fromFunction2((t0: /* method */ InsightsClientMethod, t1: /* payload */ PartialInsightsClientPayl) => (insights(t0, t1)).runNow()))
    __obj.asInstanceOf[ConnectHitInsightsProvided]
  }
  
  extension [Self <: ConnectHitInsightsProvided](x: Self) {
    
    inline def setHit(value: HitBasicDoc): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    inline def setInsights(value: (/* method */ InsightsClientMethod, /* payload */ PartialInsightsClientPayl) => Callback): Self = StObject.set(x, "insights", js.Any.fromFunction2((t0: /* method */ InsightsClientMethod, t1: /* payload */ PartialInsightsClientPayl) => (value(t0, t1)).runNow()))
  }
}
