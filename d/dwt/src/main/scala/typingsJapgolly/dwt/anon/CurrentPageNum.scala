package typingsJapgolly.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPageNum extends StObject {
  
  var currentPageNum: js.UndefOr[Double] = js.undefined
}
object CurrentPageNum {
  
  inline def apply(): CurrentPageNum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentPageNum]
  }
  
  extension [Self <: CurrentPageNum](x: Self) {
    
    inline def setCurrentPageNum(value: Double): Self = StObject.set(x, "currentPageNum", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageNumUndefined: Self = StObject.set(x, "currentPageNum", js.undefined)
  }
}
