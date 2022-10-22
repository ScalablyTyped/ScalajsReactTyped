package typingsJapgolly.catalog.mod

import typingsJapgolly.catalog.catalogInts.`1`
import typingsJapgolly.catalog.catalogInts.`2`
import typingsJapgolly.catalog.catalogInts.`3`
import typingsJapgolly.catalog.catalogInts.`4`
import typingsJapgolly.catalog.catalogInts.`5`
import typingsJapgolly.catalog.catalogInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenProps extends StObject {
  
  var rawBody: js.UndefOr[String] = js.undefined
  
  var rawOptions: js.UndefOr[String] = js.undefined
  
  var span: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
}
object SpecimenProps {
  
  inline def apply(): SpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenProps]
  }
  
  extension [Self <: SpecimenProps](x: Self) {
    
    inline def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
    
    inline def setRawBodyUndefined: Self = StObject.set(x, "rawBody", js.undefined)
    
    inline def setRawOptions(value: String): Self = StObject.set(x, "rawOptions", value.asInstanceOf[js.Any])
    
    inline def setRawOptionsUndefined: Self = StObject.set(x, "rawOptions", js.undefined)
    
    inline def setSpan(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
