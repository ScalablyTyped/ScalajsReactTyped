package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNativeSvg.libTypescriptElementsStopMod.StopProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stop {
  
  @JSImport("react-native-svg", "Stop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvg.mod.Stop] {
    
    inline def offset(value: NumberProp): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def parent(value: Component[js.Object, js.Object]): this.type = set("parent", value.asInstanceOf[js.Any])
    
    inline def stopColor(value: ColorValue): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    inline def stopOpacity(value: NumberProp): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stop.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
