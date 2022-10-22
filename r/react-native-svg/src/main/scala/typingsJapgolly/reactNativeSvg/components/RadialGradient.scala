package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvg.libTypescriptElementsRadialGradientMod.RadialGradientProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadialGradient {
  
  @JSImport("react-native-svg", "RadialGradient")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvg.mod.RadialGradient] {
    
    inline def children(value: js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def cx(value: NumberProp): this.type = set("cx", value.asInstanceOf[js.Any])
    
    inline def cy(value: NumberProp): this.type = set("cy", value.asInstanceOf[js.Any])
    
    inline def fx(value: NumberProp): this.type = set("fx", value.asInstanceOf[js.Any])
    
    inline def fy(value: NumberProp): this.type = set("fy", value.asInstanceOf[js.Any])
    
    inline def gradientTransform(value: ColumnMajorTransformMatrix | String): this.type = set("gradientTransform", value.asInstanceOf[js.Any])
    
    inline def gradientUnits(value: Units): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def r(value: NumberProp): this.type = set("r", value.asInstanceOf[js.Any])
    
    inline def rx(value: NumberProp): this.type = set("rx", value.asInstanceOf[js.Any])
    
    inline def ry(value: NumberProp): this.type = set("ry", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RadialGradient.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadialGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
