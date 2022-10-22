package typingsJapgolly.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var metrics: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiPageMod.Metrics
  
  var title: String
}
object Title {
  
  inline def apply(metrics: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiPageMod.Metrics, title: String): Title = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setMetrics(value: typingsJapgolly.puppeteerCore.libEsmPuppeteerApiPageMod.Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
