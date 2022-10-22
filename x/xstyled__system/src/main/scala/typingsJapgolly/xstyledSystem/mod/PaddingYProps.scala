package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.PaddingTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingYProps[TLength] extends StObject {
  
  val py: js.UndefOr[ResponsiveValue[PaddingTop[TLength]]] = js.undefined
}
object PaddingYProps {
  
  inline def apply[TLength](): PaddingYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingYProps[TLength]]
  }
  
  extension [Self <: PaddingYProps[?], TLength](x: Self & PaddingYProps[TLength]) {
    
    inline def setPy(value: ResponsiveValue[PaddingTop[TLength]]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
    
    inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
    
    inline def setPyVarargs(value: PaddingTop[TLength]*): Self = StObject.set(x, "py", js.Array(value*))
  }
}
