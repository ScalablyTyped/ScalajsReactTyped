package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.Padding
import typingsJapgolly.wixStyleReact.distTypesRadioGroupMod.RadioGroupDisplay
import typingsJapgolly.wixStyleReact.distTypesRadioGroupMod.RadioGroupProps
import typingsJapgolly.wixStyleReact.distTypesRadioGroupMod.RadioSelectionArea
import typingsJapgolly.wixStyleReact.distTypesRadioGroupMod.RadioSelectionAreaSkin
import typingsJapgolly.wixStyleReact.distTypesRadioGroupMod.RadioType
import typingsJapgolly.wixStyleReact.distTypesRadioMod.RadioAlignItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  @JSImport("wix-style-react", "RadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.RadioGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledRadios(value: js.Array[js.UndefOr[String | Double]]): this.type = set("disabledRadios", value.asInstanceOf[js.Any])
    
    inline def disabledRadiosVarargs(value: (js.UndefOr[String | Double])*): this.type = set("disabledRadios", js.Array(value*))
    
    inline def display(value: RadioGroupDisplay): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ js.UndefOr[String | Double] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String | Double]) => value(t0).runNow()))
    
    inline def selectionArea(value: RadioSelectionArea): this.type = set("selectionArea", value.asInstanceOf[js.Any])
    
    inline def selectionAreaPadding(value: Padding[String | Double]): this.type = set("selectionAreaPadding", value.asInstanceOf[js.Any])
    
    inline def selectionAreaSkin(value: RadioSelectionAreaSkin): this.type = set("selectionAreaSkin", value.asInstanceOf[js.Any])
    
    inline def spacing(value: String): this.type = set("spacing", value.asInstanceOf[js.Any])
    
    inline def `type`(value: RadioType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def vAlign(value: RadioAlignItems): this.type = set("vAlign", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
