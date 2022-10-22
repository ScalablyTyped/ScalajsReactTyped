package typingsJapgolly.ink.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ink.buildComponentsTextMod.Props
import typingsJapgolly.ink.inkStrings.`truncate-end`
import typingsJapgolly.ink.inkStrings.`truncate-middle`
import typingsJapgolly.ink.inkStrings.`truncate-start`
import typingsJapgolly.ink.inkStrings.end
import typingsJapgolly.ink.inkStrings.middle
import typingsJapgolly.ink.inkStrings.truncate
import typingsJapgolly.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("ink", "Text")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
    ): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    
    inline def color(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
    ): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dimColor(value: Boolean): this.type = set("dimColor", value.asInstanceOf[js.Any])
    
    inline def inverse(value: Boolean): this.type = set("inverse", value.asInstanceOf[js.Any])
    
    inline def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    
    inline def strikethrough(value: Boolean): this.type = set("strikethrough", value.asInstanceOf[js.Any])
    
    inline def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    
    inline def wrap(
      value: typingsJapgolly.ink.inkStrings.wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
    ): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
