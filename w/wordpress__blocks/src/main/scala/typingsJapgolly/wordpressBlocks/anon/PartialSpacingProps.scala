package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.wordpressBlocks.mod.AxialDirection
import typingsJapgolly.wordpressBlocks.mod.CSSDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.SpacingProps> */
trait PartialSpacingProps extends StObject {
  
  var blockGap: js.UndefOr[Boolean | js.Array[AxialDirection]] = js.undefined
  
  var margin: js.UndefOr[Boolean | js.Array[CSSDirection]] = js.undefined
  
  var padding: js.UndefOr[Boolean | js.Array[CSSDirection]] = js.undefined
}
object PartialSpacingProps {
  
  inline def apply(): PartialSpacingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSpacingProps]
  }
  
  extension [Self <: PartialSpacingProps](x: Self) {
    
    inline def setBlockGap(value: Boolean | js.Array[AxialDirection]): Self = StObject.set(x, "blockGap", value.asInstanceOf[js.Any])
    
    inline def setBlockGapUndefined: Self = StObject.set(x, "blockGap", js.undefined)
    
    inline def setBlockGapVarargs(value: AxialDirection*): Self = StObject.set(x, "blockGap", js.Array(value*))
    
    inline def setMargin(value: Boolean | js.Array[CSSDirection]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: CSSDirection*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setPadding(value: Boolean | js.Array[CSSDirection]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: CSSDirection*): Self = StObject.set(x, "padding", js.Array(value*))
  }
}
