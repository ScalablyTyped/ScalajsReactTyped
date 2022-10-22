package typingsJapgolly.reactNativeTableComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTableComponent.mod.ColsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cols {
  
  @JSImport("react-native-table-component", "Cols")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeTableComponent.mod.Cols] {
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def flexArr(value: js.Array[Double]): this.type = set("flexArr", value.asInstanceOf[js.Any])
    
    inline def flexArrVarargs(value: Double*): this.type = set("flexArr", js.Array(value*))
    
    inline def heightArr(value: js.Array[Double]): this.type = set("heightArr", value.asInstanceOf[js.Any])
    
    inline def heightArrVarargs(value: Double*): this.type = set("heightArr", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def widthArr(value: js.Array[Double]): this.type = set("widthArr", value.asInstanceOf[js.Any])
    
    inline def widthArrVarargs(value: Double*): this.type = set("widthArr", js.Array(value*))
  }
  
  implicit def make(companion: Cols.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ColsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
