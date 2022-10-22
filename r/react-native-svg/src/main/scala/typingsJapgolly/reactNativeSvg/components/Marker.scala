package typingsJapgolly.reactNativeSvg.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvg.libTypescriptElementsMarkerMod.MarkerProps
import typingsJapgolly.reactNativeSvg.libTypescriptElementsMarkerMod.MarkerUnits
import typingsJapgolly.reactNativeSvg.libTypescriptElementsMarkerMod.Orient
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marker {
  
  @JSImport("react-native-svg", "Marker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvg.mod.Marker] {
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def markerHeight(value: NumberProp): this.type = set("markerHeight", value.asInstanceOf[js.Any])
    
    inline def markerUnits(value: MarkerUnits): this.type = set("markerUnits", value.asInstanceOf[js.Any])
    
    inline def markerWidth(value: NumberProp): this.type = set("markerWidth", value.asInstanceOf[js.Any])
    
    inline def orient(value: Orient | NumberProp): this.type = set("orient", value.asInstanceOf[js.Any])
    
    inline def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def refX(value: NumberProp): this.type = set("refX", value.asInstanceOf[js.Any])
    
    inline def refY(value: NumberProp): this.type = set("refY", value.asInstanceOf[js.Any])
    
    inline def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Marker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
