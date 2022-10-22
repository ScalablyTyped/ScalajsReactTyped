package typingsJapgolly.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSON2SheetOpts
  extends StObject
     with CommonOptions
     with DateNFOption {
  
  /** Use specified column order */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[Boolean] = js.undefined
}
object JSON2SheetOpts {
  
  inline def apply(): JSON2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSON2SheetOpts]
  }
  
  extension [Self <: JSON2SheetOpts](x: Self) {
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setSkipHeader(value: Boolean): Self = StObject.set(x, "skipHeader", value.asInstanceOf[js.Any])
    
    inline def setSkipHeaderUndefined: Self = StObject.set(x, "skipHeader", js.undefined)
  }
}
