package typingsJapgolly.antdMobileRn.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xl
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xs
import typingsJapgolly.antdMobileRn.libWhiteSpaceIndexDotnativeMod.WhiteSpaceProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WhiteSpace {
  
  @JSImport("antd-mobile-rn", "WhiteSpace")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.WhiteSpace] {
    
    inline def size(value: xs | sm | md | lg | xl): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: WhiteSpace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WhiteSpaceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
