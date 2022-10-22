package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libListListItemDotnativeMod.BriefProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Brief {
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.libListListItemDotnativeMod.Brief] {
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: typingsJapgolly.antdMobileRn.anon.Brief): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Brief.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BriefProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
