package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  var URI: String
  
  def getDBConnections(callback: CbCallback): Unit
  
  def getLogs(callback: CbCallback): Unit
  
  def getStatistics(callback: CbCallback): Unit
  
  def getStatisticsHistory(callback: CbCallback): Unit
  
  def setQuery(query: Query): Unit
  
  var systemKey: String
  
  var user: APIUser
}
object Metrics {
  
  inline def apply(
    URI: String,
    getDBConnections: CbCallback => Callback,
    getLogs: CbCallback => Callback,
    getStatistics: CbCallback => Callback,
    getStatisticsHistory: CbCallback => Callback,
    setQuery: Query => Callback,
    systemKey: String,
    user: APIUser
  ): Metrics = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], getDBConnections = js.Any.fromFunction1((t0: CbCallback) => getDBConnections(t0).runNow()), getLogs = js.Any.fromFunction1((t0: CbCallback) => getLogs(t0).runNow()), getStatistics = js.Any.fromFunction1((t0: CbCallback) => getStatistics(t0).runNow()), getStatisticsHistory = js.Any.fromFunction1((t0: CbCallback) => getStatisticsHistory(t0).runNow()), setQuery = js.Any.fromFunction1((t0: Query) => setQuery(t0).runNow()), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setGetDBConnections(value: CbCallback => Callback): Self = StObject.set(x, "getDBConnections", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setGetLogs(value: CbCallback => Callback): Self = StObject.set(x, "getLogs", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setGetStatistics(value: CbCallback => Callback): Self = StObject.set(x, "getStatistics", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setGetStatisticsHistory(value: CbCallback => Callback): Self = StObject.set(x, "getStatisticsHistory", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSetQuery(value: Query => Callback): Self = StObject.set(x, "setQuery", js.Any.fromFunction1((t0: Query) => value(t0).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
