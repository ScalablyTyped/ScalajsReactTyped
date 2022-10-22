package typingsJapgolly.reactNativeSvg.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvg.libTypescriptElementsPatternMod.PatternProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pattern {
  
  @JSImport("react-native-svg", "Pattern")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvg.mod.Pattern] {
    
    inline def height(value: NumberProp): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def patternContentUnits(value: Units): this.type = set("patternContentUnits", value.asInstanceOf[js.Any])
    
    inline def patternTransform(value: ColumnMajorTransformMatrix | String): this.type = set("patternTransform", value.asInstanceOf[js.Any])
    
    inline def patternUnits(value: Units): this.type = set("patternUnits", value.asInstanceOf[js.Any])
    
    inline def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def transform(value: ColumnMajorTransformMatrix | String | TransformProps): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    inline def width(value: NumberProp): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: NumberProp): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: NumberProp): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pattern.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PatternProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
