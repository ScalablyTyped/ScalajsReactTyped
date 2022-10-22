package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.antDesignProStrings.horizontal
import typingsJapgolly.antDesignPro.antDesignProStrings.large
import typingsJapgolly.antDesignPro.antDesignProStrings.small
import typingsJapgolly.antDesignPro.antDesignProStrings.vertical
import typingsJapgolly.antDesignPro.libDescriptionListDescriptionMod.DescriptionProps
import typingsJapgolly.antDesignPro.libDescriptionListMod.DescriptionListProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DescriptionList {
  
  @JSImport("ant-design-pro", "DescriptionList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.DescriptionList] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def col(value: Double): this.type = set("col", value.asInstanceOf[js.Any])
    
    inline def description(value: js.Array[DescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionVarargs(value: DescriptionProps*): this.type = set("description", js.Array(value*))
    
    inline def gutter(value: Double): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DescriptionList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DescriptionListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
