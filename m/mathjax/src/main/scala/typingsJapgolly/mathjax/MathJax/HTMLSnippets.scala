package typingsJapgolly.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLSnippets extends StObject {
  
  /*HTML that gives the download link for the STIX fonts only. (Used in place of fonts when the HTML-CSS option
    * for availableFonts only includes the STIX fonts.)
    */
  var STIXfonts: js.UndefOr[String] = js.undefined
  
  /*HTML that gives the download link for the MathJax TeX fonts only. (Used in place of fonts when the HTML-CSS
    * option for availableFonts only includes the TeX fonts.)
    */
  var TeXfonts: js.UndefOr[String] = js.undefined
  
  /*The HTML for the close box in the FontWarning message.*/
  var closeBox: js.UndefOr[String] = js.undefined
  
  /*HTML that includes links to the MathJax and STIX font download pages.*/
  var fonts: js.UndefOr[String] = js.undefined
  
  /*The HTML for a paragraph suggesting an upgrade to a more modern browser that supports web fonts.*/
  var webfonts: js.UndefOr[String] = js.undefined
}
object HTMLSnippets {
  
  inline def apply(): HTMLSnippets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLSnippets]
  }
  
  extension [Self <: HTMLSnippets](x: Self) {
    
    inline def setCloseBox(value: String): Self = StObject.set(x, "closeBox", value.asInstanceOf[js.Any])
    
    inline def setCloseBoxUndefined: Self = StObject.set(x, "closeBox", js.undefined)
    
    inline def setFonts(value: String): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setSTIXfonts(value: String): Self = StObject.set(x, "STIXfonts", value.asInstanceOf[js.Any])
    
    inline def setSTIXfontsUndefined: Self = StObject.set(x, "STIXfonts", js.undefined)
    
    inline def setTeXfonts(value: String): Self = StObject.set(x, "TeXfonts", value.asInstanceOf[js.Any])
    
    inline def setTeXfontsUndefined: Self = StObject.set(x, "TeXfonts", js.undefined)
    
    inline def setWebfonts(value: String): Self = StObject.set(x, "webfonts", value.asInstanceOf[js.Any])
    
    inline def setWebfontsUndefined: Self = StObject.set(x, "webfonts", js.undefined)
  }
}
