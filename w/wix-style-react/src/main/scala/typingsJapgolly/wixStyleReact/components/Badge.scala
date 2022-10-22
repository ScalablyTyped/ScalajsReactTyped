package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeProps
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSize
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSkin
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("wix-style-react", "Badge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Badge] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def noPadding(value: Boolean): this.type = set("noPadding", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def prefixIcon(value: VdomElement): this.type = set("prefixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: BadgeSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: BadgeSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def suffixIcon(value: VdomElement): this.type = set("suffixIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: BadgeType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def uppercase(value: Boolean): this.type = set("uppercase", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
