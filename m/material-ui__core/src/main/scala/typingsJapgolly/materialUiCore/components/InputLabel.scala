package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.inputLabelInputLabelMod.InputLabelClassKey
import typingsJapgolly.materialUiCore.inputLabelInputLabelMod.InputLabelProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputLabel {
  
  @JSImport("@material-ui/core", "InputLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Partial[ClassNameMap[InputLabelClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def color(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>['color'] */ js.Any
    ): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disableAnimation(value: Boolean): this.type = set("disableAnimation", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def margin(value: dense): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def shrink(value: Boolean): this.type = set("shrink", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def variant(value: standard | outlined | filled): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InputLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
