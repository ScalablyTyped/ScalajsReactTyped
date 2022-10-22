package typingsJapgolly.antDesignProLayout.anon

import typingsJapgolly.antDesignProLayout.esTypingsMod.Route
import typingsJapgolly.antDesignProLayout.esTypingsMod.StaticContext
import typingsJapgolly.antDesignProLayout.esTypingsMod.`match`
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.Location
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/es/typings.RouterTypes> */
trait PartialRouterTypes extends StObject {
  
  var computedMatch: js.UndefOr[`match`[Any]] = js.undefined
  
  var history: js.UndefOr[History] = js.undefined
  
  var location: js.UndefOr[Location | Pathname] = js.undefined
  
  var `match`: js.UndefOr[typingsJapgolly.antDesignProLayout.esTypingsMod.`match`[Record[String, Any]]] = js.undefined
  
  var route: js.UndefOr[Route] = js.undefined
  
  var staticContext: js.UndefOr[StaticContext] = js.undefined
}
object PartialRouterTypes {
  
  inline def apply(): PartialRouterTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterTypes]
  }
  
  extension [Self <: PartialRouterTypes](x: Self) {
    
    inline def setComputedMatch(value: `match`[Any]): Self = StObject.set(x, "computedMatch", value.asInstanceOf[js.Any])
    
    inline def setComputedMatchUndefined: Self = StObject.set(x, "computedMatch", js.undefined)
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setLocation(value: Location | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMatch(value: `match`[Record[String, Any]]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    inline def setStaticContext(value: StaticContext): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
    
    inline def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
  }
}
