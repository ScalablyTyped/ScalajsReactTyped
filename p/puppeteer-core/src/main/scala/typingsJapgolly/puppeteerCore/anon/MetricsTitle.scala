package typingsJapgolly.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsTitle extends StObject {
  
  var metrics: typingsJapgolly.puppeteerCore.mod.Metrics
  
  var title: String
}
object MetricsTitle {
  
  inline def apply(metrics: typingsJapgolly.puppeteerCore.mod.Metrics, title: String): MetricsTitle = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsTitle]
  }
  
  extension [Self <: MetricsTitle](x: Self) {
    
    inline def setMetrics(value: typingsJapgolly.puppeteerCore.mod.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
