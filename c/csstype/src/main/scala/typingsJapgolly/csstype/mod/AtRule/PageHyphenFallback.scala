package typingsJapgolly.csstype.mod.AtRule

import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.AtRule.PageHyphen<TLength, TTime>> */
trait PageHyphenFallback[TLength, TTime] extends StObject {
  
  var bleed: js.UndefOr[Bleed[TLength] | js.Array[NonNullable[js.UndefOr[Bleed[TLength]]]]] = js.undefined
  
  var marks: js.UndefOr[Marks | js.Array[NonNullable[js.UndefOr[Marks]]]] = js.undefined
  
  var size: js.UndefOr[Size[TLength] | js.Array[NonNullable[js.UndefOr[Size[TLength]]]]] = js.undefined
}
object PageHyphenFallback {
  
  inline def apply[TLength, TTime](): PageHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphenFallback[TLength, TTime]]
  }
  
  extension [Self <: PageHyphenFallback[?, ?], TLength, TTime](x: Self & (PageHyphenFallback[TLength, TTime])) {
    
    inline def setBleed(value: Bleed[TLength] | js.Array[NonNullable[js.UndefOr[Bleed[TLength]]]]): Self = StObject.set(x, "bleed", value.asInstanceOf[js.Any])
    
    inline def setBleedUndefined: Self = StObject.set(x, "bleed", js.undefined)
    
    inline def setBleedVarargs(value: NonNullable[js.UndefOr[Bleed[TLength]]]*): Self = StObject.set(x, "bleed", js.Array(value*))
    
    inline def setMarks(value: Marks | js.Array[NonNullable[js.UndefOr[Marks]]]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: NonNullable[js.UndefOr[Marks]]*): Self = StObject.set(x, "marks", js.Array(value*))
    
    inline def setSize(value: Size[TLength] | js.Array[NonNullable[js.UndefOr[Size[TLength]]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: NonNullable[js.UndefOr[Size[TLength]]]*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
