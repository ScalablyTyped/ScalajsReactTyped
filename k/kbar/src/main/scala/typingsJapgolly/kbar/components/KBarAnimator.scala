package typingsJapgolly.kbar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.kbar.libKbaranimatorMod.KBarAnimatorProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KBarAnimator {
  
  @JSImport("kbar", "KBarAnimator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: KBarAnimator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[KBarAnimatorProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
