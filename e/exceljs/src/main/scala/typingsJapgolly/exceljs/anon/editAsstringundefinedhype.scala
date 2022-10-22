package typingsJapgolly.exceljs.anon

import typingsJapgolly.exceljs.mod.Anchor
import typingsJapgolly.exceljs.mod.ImageHyperlinkValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  editAs :string | undefined,   hyperlinks :exceljs.exceljs.ImageHyperlinkValue | undefined} & exceljs.exceljs.ImageRange */
trait editAsstringundefinedhype extends StObject {
  
  var br: Anchor
  
  var editAs: js.UndefOr[String] = js.undefined
  
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.undefined
  
  var tl: Anchor
}
object editAsstringundefinedhype {
  
  inline def apply(br: Anchor, tl: Anchor): editAsstringundefinedhype = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringundefinedhype]
  }
  
  extension [Self <: editAsstringundefinedhype](x: Self) {
    
    inline def setBr(value: Anchor): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setEditAs(value: String): Self = StObject.set(x, "editAs", value.asInstanceOf[js.Any])
    
    inline def setEditAsUndefined: Self = StObject.set(x, "editAs", js.undefined)
    
    inline def setHyperlinks(value: ImageHyperlinkValue): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
    
    inline def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
    
    inline def setTl(value: Anchor): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
