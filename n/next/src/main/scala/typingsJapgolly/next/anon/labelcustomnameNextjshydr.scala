package typingsJapgolly.next.anon

import typingsJapgolly.next.distSharedLibUtilsMod.NextWebVitalsMetric
import typingsJapgolly.next.nextStrings.`NextDotjs-hydration`
import typingsJapgolly.next.nextStrings.`NextDotjs-render`
import typingsJapgolly.next.nextStrings.`NextDotjs-route-change-to-render`
import typingsJapgolly.next.nextStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  label :'custom',   name :'Next.js-hydration' | 'Next.js-route-change-to-render' | 'Next.js-render'} & {  id :string,   startTime :number,   value :number} */
trait labelcustomnameNextjshydr
  extends StObject
     with NextWebVitalsMetric {
  
  var id: String
  
  var label: custom
  
  var name: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`
  
  var startTime: Double
  
  var value: Double
}
object labelcustomnameNextjshydr {
  
  inline def apply(
    id: String,
    name: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`,
    startTime: Double,
    value: Double
  ): labelcustomnameNextjshydr = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = "custom", name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[labelcustomnameNextjshydr]
  }
  
  extension [Self <: labelcustomnameNextjshydr](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: custom): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setName(value: `NextDotjs-hydration` | `NextDotjs-route-change-to-render` | `NextDotjs-render`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
