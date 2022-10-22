package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.Href
import typingsJapgolly.antDesignPro.antDesignProStrings.`403`
import typingsJapgolly.antDesignPro.antDesignProStrings.`404`
import typingsJapgolly.antDesignPro.antDesignProStrings.`500`
import typingsJapgolly.antDesignPro.libExceptionMod.ExceptionProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Exception {
  
  @JSImport("ant-design-pro", "Exception")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.Exception] {
    
    inline def actions(value: VdomNode): this.type = set("actions", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionsNull: this.type = set("actions", null)
    
    inline def actionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("actions", js.Array(value*))
    
    inline def actionsVdomElement(value: VdomElement): this.type = set("actions", value.rawElement.asInstanceOf[js.Any])
    
    inline def backText(value: VdomNode): this.type = set("backText", value.rawNode.asInstanceOf[js.Any])
    
    inline def backTextNull: this.type = set("backText", null)
    
    inline def backTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backText", js.Array(value*))
    
    inline def backTextVdomElement(value: VdomElement): this.type = set("backText", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def desc(value: VdomNode): this.type = set("desc", value.rawNode.asInstanceOf[js.Any])
    
    inline def descNull: this.type = set("desc", null)
    
    inline def descVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("desc", js.Array(value*))
    
    inline def descVdomElement(value: VdomElement): this.type = set("desc", value.rawElement.asInstanceOf[js.Any])
    
    inline def img(value: String): this.type = set("img", value.asInstanceOf[js.Any])
    
    inline def linkElement(value: String | ComponentType[Href]): this.type = set("linkElement", value.asInstanceOf[js.Any])
    
    inline def redirect(value: String): this.type = set("redirect", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: `403` | `404` | `500`): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Exception.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ExceptionProps[Href]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
