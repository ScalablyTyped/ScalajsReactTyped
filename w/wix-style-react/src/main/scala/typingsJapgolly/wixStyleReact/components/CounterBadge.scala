package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCounterBadgeMod.CounterBadgeProps
import typingsJapgolly.wixStyleReact.distTypesCounterBadgeMod.CounterBadgeSize
import typingsJapgolly.wixStyleReact.distTypesCounterBadgeMod.CounterBadgeSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CounterBadge {
  
  @JSImport("wix-style-react", "CounterBadge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CounterBadge] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def showShadow(value: Boolean): this.type = set("showShadow", value.asInstanceOf[js.Any])
    
    inline def size(value: CounterBadgeSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: CounterBadgeSkin): this.type = set("skin", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CounterBadge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CounterBadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
