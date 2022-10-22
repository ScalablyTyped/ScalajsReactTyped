package typingsJapgolly.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageHyphen[TLength] extends StObject {
  
  var bleed: js.UndefOr[PageBleedProperty[TLength]] = js.undefined
  
  var marks: js.UndefOr[PageMarksProperty] = js.undefined
}
object PageHyphen {
  
  inline def apply[TLength](): PageHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHyphen[TLength]]
  }
  
  extension [Self <: PageHyphen[?], TLength](x: Self & PageHyphen[TLength]) {
    
    inline def setBleed(value: PageBleedProperty[TLength]): Self = StObject.set(x, "bleed", value.asInstanceOf[js.Any])
    
    inline def setBleedUndefined: Self = StObject.set(x, "bleed", js.undefined)
    
    inline def setMarks(value: PageMarksProperty): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
  }
}
