package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.anon.PartialClassNameMapGridLi
import typingsJapgolly.materialUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.bottom
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.top
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridListTileBar {
  
  @JSImport("@material-ui/core", "GridListTileBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actionIcon(value: VdomNode): this.type = set("actionIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionIconNull: this.type = set("actionIcon", null)
    
    inline def actionIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("actionIcon", js.Array(value*))
    
    inline def actionIconVdomElement(value: VdomElement): this.type = set("actionIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def actionPosition(value: left | right): this.type = set("actionPosition", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: PartialClassNameMapGridLi): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titlePosition(value: top | bottom): this.type = set("titlePosition", value.asInstanceOf[js.Any])
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GridListTileBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridListTileBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
