package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.listTypesMod.ArtworkSizes
import typingsJapgolly.baseui.listTypesMod.StyledArtworkContainerProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledArtworkContainer {
  
  inline def apply[C /* <: ElementType */]($artworkSize: ArtworkSizes | Double): Builder[C] = {
    val __props = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
    new Builder[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyledArtworkContainerProps])]))
  }
  
  @JSImport("baseui/list", "StyledArtworkContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $style(value: StyleObject | (js.Function1[StyledArtworkContainerProps, StyleObject])): this.type = set("$style", value.asInstanceOf[js.Any])
    
    inline def $styleFunction1(value: StyledArtworkContainerProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    inline def $sublist(value: Boolean): this.type = set("$sublist", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyledArtworkContainerProps])): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
