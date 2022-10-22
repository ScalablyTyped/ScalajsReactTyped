package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvg.libTypescriptElementsLinearGradientMod.LinearGradientProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("react-native-svg", "LinearGradient")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvg.mod.LinearGradient] {
    
    inline def children(value: js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def gradientTransform(value: ColumnMajorTransformMatrix | String): this.type = set("gradientTransform", value.asInstanceOf[js.Any])
    
    inline def gradientUnits(value: Units): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def x1(value: NumberProp): this.type = set("x1", value.asInstanceOf[js.Any])
    
    inline def x2(value: NumberProp): this.type = set("x2", value.asInstanceOf[js.Any])
    
    inline def y1(value: NumberProp): this.type = set("y1", value.asInstanceOf[js.Any])
    
    inline def y2(value: NumberProp): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LinearGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinearGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
