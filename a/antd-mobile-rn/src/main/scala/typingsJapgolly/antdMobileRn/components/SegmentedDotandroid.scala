package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libSegmentedControlSegmentedDotandroidMod.SegmentControlNativeProps
import typingsJapgolly.antdMobileRn.libSegmentedControlSegmentedDotandroidMod.default
import typingsJapgolly.antdMobileRn.libSegmentedControlStyleIndexDotnativeMod.ISegmentControlStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedDotandroid {
  
  @JSImport("antd-mobile-rn/lib/segmented-control/segmented.android", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
    
    inline def onValueChange(value: /* value */ String => Callback): this.type = set("onValueChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: ISegmentControlStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    inline def values(value: js.Array[String]): this.type = set("values", value.asInstanceOf[js.Any])
    
    inline def valuesVarargs(value: String*): this.type = set("values", js.Array(value*))
  }
  
  implicit def make(companion: SegmentedDotandroid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SegmentControlNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
