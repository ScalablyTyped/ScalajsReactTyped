package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.mod.ListItemCenterElement
import typingsJapgolly.reactNativeMaterialUi.mod.ListItemProps
import typingsJapgolly.reactNativeMaterialUi.mod.ListItemStyle
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiInts.`1`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiInts.`2`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiInts.`3`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  inline def apply(centerElement: Element | String | ListItemCenterElement): Builder = {
    val __props = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ListItemProps]))
  }
  
  @JSImport("react-native-material-ui", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.ListItem] {
    
    inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    
    inline def divider(value: Boolean): this.type = set("divider", value.asInstanceOf[js.Any])
    
    inline def leftElement(value: Element | String): this.type = set("leftElement", value.asInstanceOf[js.Any])
    
    inline def leftElementVdomElement(value: VdomElement): this.type = set("leftElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def numberOfLines(value: `1` | `2` | `3` | dynamic): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def onPressValue(value: Any): this.type = set("onPressValue", value.asInstanceOf[js.Any])
    
    inline def onRightElementPress(value: Callback): this.type = set("onRightElementPress", value.toJsFn)
    
    inline def rightElement(value: Element | String): this.type = set("rightElement", value.asInstanceOf[js.Any])
    
    inline def rightElementVdomElement(value: VdomElement): this.type = set("rightElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: ListItemStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
