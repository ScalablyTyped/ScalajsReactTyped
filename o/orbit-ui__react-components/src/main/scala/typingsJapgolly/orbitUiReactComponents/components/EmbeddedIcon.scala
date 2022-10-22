package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distIconsSrcEmbeddedIconMod.EmbeddedIconProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EmbeddedIcon {
  
  @JSImport("@orbit-ui/react-components", "EmbeddedIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def size(value: `2xs` | xs | sm | md | lg | xl | inherit): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EmbeddedIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmbeddedIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
