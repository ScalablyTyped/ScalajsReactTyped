package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgEncodeChannel
import typingsJapgolly.vegaLite.vegaLiteStrings.axis
import typingsJapgolly.vegaLite.vegaLiteStrings.domain
import typingsJapgolly.vegaLite.vegaLiteStrings.grid
import typingsJapgolly.vegaLite.vegaLiteStrings.labels
import typingsJapgolly.vegaLite.vegaLiteStrings.ticks
import typingsJapgolly.vegaLite.vegaLiteStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Part extends StObject {
  
  var part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
  
  var vgProp: VgEncodeChannel
}
object Part {
  
  inline def apply(
    part: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain,
    vgProp: VgEncodeChannel
  ): Part = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any], vgProp = vgProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  
  extension [Self <: Part](x: Self) {
    
    inline def setPart(
      value: /* keyof vega-typings.vega-typings/types/spec/axis.AxisEncode */ axis | ticks | labels | title | grid | domain
    ): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setVgProp(value: VgEncodeChannel): Self = StObject.set(x, "vgProp", value.asInstanceOf[js.Any])
  }
}
