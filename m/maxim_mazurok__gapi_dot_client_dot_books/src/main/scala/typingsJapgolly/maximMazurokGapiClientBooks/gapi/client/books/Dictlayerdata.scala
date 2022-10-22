package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.maximMazurokGapiClientBooks.anon.Title
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictlayerdata extends StObject {
  
  var common: js.UndefOr[Title] = js.undefined
  
  var dict: js.UndefOr[Words] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object Dictlayerdata {
  
  inline def apply(): Dictlayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictlayerdata]
  }
  
  extension [Self <: Dictlayerdata](x: Self) {
    
    inline def setCommon(value: Title): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setDict(value: Words): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
    
    inline def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
