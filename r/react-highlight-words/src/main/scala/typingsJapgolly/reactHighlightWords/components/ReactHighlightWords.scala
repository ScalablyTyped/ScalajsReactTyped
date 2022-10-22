package typingsJapgolly.reactHighlightWords.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactHighlightWords.mod.Chunk
import typingsJapgolly.reactHighlightWords.mod.FindChunks
import typingsJapgolly.reactHighlightWords.mod.HighlighterProps
import typingsJapgolly.reactHighlightWords.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighlightWords {
  
  inline def apply(searchWords: js.Array[String | js.RegExp], textToHighlight: String): Builder = {
    val __props = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighlighterProps]))
  }
  
  @JSImport("react-highlight-words", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    
    inline def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    inline def activeStyle(value: CSSProperties): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    inline def autoEscape(value: Boolean): this.type = set("autoEscape", value.asInstanceOf[js.Any])
    
    inline def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def findChunks(value: /* options */ FindChunks => js.Array[Chunk]): this.type = set("findChunks", js.Any.fromFunction1(value))
    
    inline def highlightClassName(value: String): this.type = set("highlightClassName", value.asInstanceOf[js.Any])
    
    inline def highlightStyle(value: CSSProperties): this.type = set("highlightStyle", value.asInstanceOf[js.Any])
    
    inline def highlightTag(value: String | ComponentType[Any]): this.type = set("highlightTag", value.asInstanceOf[js.Any])
    
    inline def sanitize(value: /* text */ String => String): this.type = set("sanitize", js.Any.fromFunction1(value))
    
    inline def unhighlightClassName(value: String): this.type = set("unhighlightClassName", value.asInstanceOf[js.Any])
    
    inline def unhighlightStyle(value: CSSProperties): this.type = set("unhighlightStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlighterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
