package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.vegaLiteStrings.color
import typingsJapgolly.vegaLite.vegaLiteStrings.fill
import typingsJapgolly.vegaLite.vegaLiteStrings.fillOpacity
import typingsJapgolly.vegaLite.vegaLiteStrings.opacity
import typingsJapgolly.vegaLite.vegaLiteStrings.shape
import typingsJapgolly.vegaLite.vegaLiteStrings.size
import typingsJapgolly.vegaLite.vegaLiteStrings.stroke
import typingsJapgolly.vegaLite.vegaLiteStrings.strokeOpacity
import typingsJapgolly.vegaLite.vegaLiteStrings.strokeWidth
import typingsJapgolly.vegaLite.vegaLiteStrings.text
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var encoding: fill | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | x | y | shape
  
  var order: Unit
}
object Encoding {
  
  inline def apply(
    encoding: fill | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | x | y | shape,
    order: Unit
  ): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setEncoding(
      value: fill | color | fillOpacity | opacity | stroke | strokeOpacity | strokeWidth | text | size | typingsJapgolly.vegaLite.vegaLiteStrings.x | y | shape
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Unit): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
