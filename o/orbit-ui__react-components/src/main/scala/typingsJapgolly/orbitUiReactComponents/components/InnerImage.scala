package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distImageSrcImageMod.InnerImageProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`scale-down`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.circular
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.contain
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.cover
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.fill
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.none
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.rounded
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.straight
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerImage {
  
  inline def apply(alt: String): Builder = {
    val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InnerImageProps]))
  }
  
  @JSImport("@orbit-ui/react-components", "InnerImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def fit(value: contain | cover | fill | `scale-down` | none): this.type = set("fit", value.asInstanceOf[js.Any])
    
    inline def forwardedRef(value: ForwardedRef[Any]): this.type = set("forwardedRef", value.asInstanceOf[js.Any])
    
    inline def forwardedRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def forwardedRefNull: this.type = set("forwardedRef", null)
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def shape(value: straight | rounded | circular): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InnerImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
