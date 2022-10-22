package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.LabelStyle
import typingsJapgolly.reactNativePaper.anon.Open
import typingsJapgolly.reactNativePaper.anon.PickPropsstylecoloronPres
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FABGroup {
  
  inline def apply(
    actions: js.Array[LabelStyle],
    icon: IconSource,
    onStateChange: /* state */ Open => Callback,
    open: Boolean,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onStateChange = js.Any.fromFunction1((t0: /* state */ Open) => onStateChange(t0).runNow()), open = open.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsstylecoloronPres]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/FAB/FABGroup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def backdropColor(value: String): this.type = set("backdropColor", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fabStyle(value: StyleProp[ViewStyle]): this.type = set("fabStyle", value.asInstanceOf[js.Any])
    
    inline def fabStyleNull: this.type = set("fabStyle", null)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsstylecoloronPres): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
