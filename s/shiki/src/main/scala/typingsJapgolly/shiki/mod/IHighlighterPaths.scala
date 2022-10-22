package typingsJapgolly.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHighlighterPaths extends StObject {
  
  /**
    * @default 'languages/'
    */
  var languages: js.UndefOr[String] = js.undefined
  
  /**
    * @default 'themes/'
    */
  var themes: js.UndefOr[String] = js.undefined
}
object IHighlighterPaths {
  
  inline def apply(): IHighlighterPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlighterPaths]
  }
  
  extension [Self <: IHighlighterPaths](x: Self) {
    
    inline def setLanguages(value: String): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setThemes(value: String): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    
    inline def setThemesUndefined: Self = StObject.set(x, "themes", js.undefined)
  }
}
