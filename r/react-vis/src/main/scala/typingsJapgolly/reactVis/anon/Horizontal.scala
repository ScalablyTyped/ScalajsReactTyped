package typingsJapgolly.reactVis.anon

import typingsJapgolly.reactVis.reactVisStrings.auto
import typingsJapgolly.reactVis.reactVisStrings.bottom
import typingsJapgolly.reactVis.reactVisStrings.bottomEdge
import typingsJapgolly.reactVis.reactVisStrings.left
import typingsJapgolly.reactVis.reactVisStrings.leftEdge
import typingsJapgolly.reactVis.reactVisStrings.right
import typingsJapgolly.reactVis.reactVisStrings.rightEdge
import typingsJapgolly.reactVis.reactVisStrings.top
import typingsJapgolly.reactVis.reactVisStrings.topEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Horizontal extends StObject {
  
  var horizontal: js.UndefOr[auto | left | right | leftEdge | rightEdge] = js.undefined
  
  var vertical: js.UndefOr[auto | bottom | top | bottomEdge | topEdge] = js.undefined
}
object Horizontal {
  
  inline def apply(): Horizontal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Horizontal]
  }
  
  extension [Self <: Horizontal](x: Self) {
    
    inline def setHorizontal(value: auto | left | right | leftEdge | rightEdge): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: auto | bottom | top | bottomEdge | topEdge): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
