package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & any>,   type :string,   stale :false}> */
trait ReadonlykeystringindexnumIndex extends StObject {
  
  val history: js.UndefOr[js.Array[Any]] = js.undefined
  
  val index: Double
  
  val key: String
  
  val routeNames: js.Array[String]
  
  val routes: js.Array[KeyName & `0` & Any]
  
  val stale: `false`
  
  val `type`: String
}
object ReadonlykeystringindexnumIndex {
  
  inline def apply(
    index: Double,
    key: String,
    routeNames: js.Array[String],
    routes: js.Array[KeyName & `0` & Any],
    `type`: String
  ): ReadonlykeystringindexnumIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlykeystringindexnumIndex]
  }
  
  extension [Self <: ReadonlykeystringindexnumIndex](x: Self) {
    
    inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value*))
    
    inline def setRoutes(value: js.Array[KeyName & `0` & Any]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: (KeyName & `0` & Any)*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
