package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.materialUiCoreStrings.span
import typingsJapgolly.materialUiCore.overridableComponentMod.DefaultComponentProps
import typingsJapgolly.materialUiCore.sliderSliderMod.SliderTypeMap
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("@material-ui/core", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(
      value: Partial[
          ClassNameMap[
            /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
          ]
        ]
    ): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefaultComponentProps[SliderTypeMap[js.Object, span]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
