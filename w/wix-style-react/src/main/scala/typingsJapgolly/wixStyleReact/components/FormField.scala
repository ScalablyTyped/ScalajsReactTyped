package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.SetCharactersLeftCharactersLeftFn
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.FormFieldProps
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.LabelAlignment
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.LabelPlacement
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.LabelSize
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.StatusType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormField {
  
  @JSImport("wix-style-react", "FormField")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FormField] {
    
    inline def charCount(value: Double): this.type = set("charCount", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* data */ SetCharactersLeftCharactersLeftFn, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* data */ SetCharactersLeftCharactersLeftFn => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def infoContent(value: VdomNode): this.type = set("infoContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def infoContentNull: this.type = set("infoContent", null)
    
    inline def infoContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("infoContent", js.Array(value*))
    
    inline def infoContentVdomElement(value: VdomElement): this.type = set("infoContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def infoTooltipProps(value: TooltipCommonProps): this.type = set("infoTooltipProps", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelAlignment(value: LabelAlignment): this.type = set("labelAlignment", value.asInstanceOf[js.Any])
    
    inline def labelId(value: String): this.type = set("labelId", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelPlacement(value: LabelPlacement): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def labelSize(value: LabelSize): this.type = set("labelSize", value.asInstanceOf[js.Any])
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def status(value: StatusType): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def stretchContent(value: Boolean): this.type = set("stretchContent", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormField.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
