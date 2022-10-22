package typingsJapgolly.next.anon

import typingsJapgolly.next.distSharedLibUtilsMod.NextWebVitalsMetric
import typingsJapgolly.next.nextStrings.CLS
import typingsJapgolly.next.nextStrings.FCP
import typingsJapgolly.next.nextStrings.FID
import typingsJapgolly.next.nextStrings.INP
import typingsJapgolly.next.nextStrings.LCP
import typingsJapgolly.next.nextStrings.TTFB
import typingsJapgolly.next.nextStrings.`web-vital`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  label :'web-vital',   name :'FCP' | 'LCP' | 'CLS' | 'FID' | 'TTFB' | 'INP'} & {  id :string,   startTime :number,   value :number} */
trait labelwebvitalnameFCPLCPCL
  extends StObject
     with NextWebVitalsMetric {
  
  var id: String
  
  var label: `web-vital`
  
  var name: FCP | LCP | CLS | FID | TTFB | INP
  
  var startTime: Double
  
  var value: Double
}
object labelwebvitalnameFCPLCPCL {
  
  inline def apply(id: String, name: FCP | LCP | CLS | FID | TTFB | INP, startTime: Double, value: Double): labelwebvitalnameFCPLCPCL = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "web-vital", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[labelwebvitalnameFCPLCPCL]
  }
  
  extension [Self <: labelwebvitalnameFCPLCPCL](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `web-vital`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: FCP | LCP | CLS | FID | TTFB | INP): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
