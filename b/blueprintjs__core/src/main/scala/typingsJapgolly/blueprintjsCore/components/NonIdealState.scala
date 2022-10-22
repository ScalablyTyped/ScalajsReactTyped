package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.horizontal
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.vertical
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsNonIdealStateNonIdealStateMod.INonIdealStateProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsNonIdealStateNonIdealStateMod.NonIdealStateIconSize
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NonIdealState {
  
  @JSImport("@blueprintjs/core", "NonIdealState")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.NonIdealState] {
    
    inline def action(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def description(value: ReactChild): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(value: BlueprintIcons16Id | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconSize(value: NonIdealStateIconSize): this.type = set("iconSize", value.asInstanceOf[js.Any])
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def layout(value: vertical | horizontal): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NonIdealState.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: INonIdealStateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
