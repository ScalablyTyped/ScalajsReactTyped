package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.ColorSetting
import typingsJapgolly.wordpressBlockEditor.componentsPanelColorSettingsMod.PanelColorSettings.Props
import typingsJapgolly.wordpressComponents.iconMod.Icon.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelColorSettings {
  
  inline def apply(colorSettings: js.Array[ColorSetting]): Builder = {
    val __props = js.Dynamic.literal(colorSettings = colorSettings.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "PanelColorSettings")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: Any): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableCustomColors(value: Boolean): this.type = set("disableCustomColors", value.asInstanceOf[js.Any])
    
    inline def icon(value: IconType[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def initialOpen(value: Boolean): this.type = set("initialOpen", value.asInstanceOf[js.Any])
    
    inline def onToggle(value: Callback): this.type = set("onToggle", value.toJsFn)
    
    inline def opened(value: Boolean): this.type = set("opened", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
