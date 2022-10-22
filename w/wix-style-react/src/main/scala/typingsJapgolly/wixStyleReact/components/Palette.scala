package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesPaletteMod.PaletteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Palette {
  
  @JSImport("wix-style-react", "Palette")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Palette] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def fill(value: js.Array[Node]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillVarargs(value: Node*): this.type = set("fill", js.Array(value*))
  }
  
  implicit def make(companion: Palette.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaletteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
