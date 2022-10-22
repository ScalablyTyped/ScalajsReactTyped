package typingsJapgolly.prismReactRenderer.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProps extends StObject {
  
  var Prism: PrismLib
  
  def children(props: RenderProps): Node
  
  var code: String
  
  var language: Language
  
  var theme: js.UndefOr[PrismTheme] = js.undefined
}
object HighlightProps {
  
  inline def apply(Prism: PrismLib, children: RenderProps => Node, code: String, language: Language): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
  
  extension [Self <: HighlightProps](x: Self) {
    
    inline def setChildren(value: RenderProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setPrism(value: PrismLib): Self = StObject.set(x, "Prism", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: PrismTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
