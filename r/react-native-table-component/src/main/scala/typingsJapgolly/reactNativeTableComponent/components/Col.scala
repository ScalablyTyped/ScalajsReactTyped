package typingsJapgolly.reactNativeTableComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTableComponent.mod.ColProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Col {
  
  @JSImport("react-native-table-component", "Col")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeTableComponent.mod.Col] {
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def heightArr(value: js.Array[Double]): this.type = set("heightArr", value.asInstanceOf[js.Any])
    
    inline def heightArrVarargs(value: Double*): this.type = set("heightArr", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Col.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
