package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distBadgeSrcBadgeMod.InnerBadgeProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.circle
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.count
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dot
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.icon
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerBadge {
  
  @JSImport("@orbit-ui/react-components", "InnerBadge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def overlap(value: circle | icon): this.type = set("overlap", value.asInstanceOf[js.Any])
    
    inline def variant(value: count | dot | icon): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InnerBadge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InnerBadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
