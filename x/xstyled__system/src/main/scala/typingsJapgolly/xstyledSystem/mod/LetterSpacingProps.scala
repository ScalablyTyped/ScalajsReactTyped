package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.LetterSpacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacingProps[TLength] extends StObject {
  
  val letterSpacing: js.UndefOr[ResponsiveValue[LetterSpacing[TLength]]] = js.undefined
}
object LetterSpacingProps {
  
  inline def apply[TLength](): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
  
  extension [Self <: LetterSpacingProps[?], TLength](x: Self & LetterSpacingProps[TLength]) {
    
    inline def setLetterSpacing(value: ResponsiveValue[LetterSpacing[TLength]]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLetterSpacingVarargs(value: LetterSpacing[TLength]*): Self = StObject.set(x, "letterSpacing", js.Array(value*))
  }
}
