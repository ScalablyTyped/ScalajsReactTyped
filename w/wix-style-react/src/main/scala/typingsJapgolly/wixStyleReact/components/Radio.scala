package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesRadioMod.OnChangeEvent
import typingsJapgolly.wixStyleReact.distTypesRadioMod.RadioAlignItems
import typingsJapgolly.wixStyleReact.distTypesRadioMod.RadioProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  @JSImport("wix-style-react", "Radio")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alignItems(value: RadioAlignItems): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def name(value: VdomNode): this.type = set("name", value.rawNode.asInstanceOf[js.Any])
    
    inline def nameNull: this.type = set("name", null)
    
    inline def nameVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("name", js.Array(value*))
    
    inline def nameVdomElement(value: VdomElement): this.type = set("name", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* event */ OnChangeEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ OnChangeEvent) => value(t0).runNow()))
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
