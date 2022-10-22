package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.bannerTypesMod.ActionContent
import typingsJapgolly.baseui.bannerTypesMod.ArtworkContent
import typingsJapgolly.baseui.bannerTypesMod.BannerOverrides
import typingsJapgolly.baseui.bannerTypesMod.BannerProps
import typingsJapgolly.baseui.bannerTypesMod.Hierarchy
import typingsJapgolly.baseui.bannerTypesMod.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Banner {
  
  @JSImport("baseui/banner", "Banner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def action(value: ActionContent): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def artwork(value: ArtworkContent): this.type = set("artwork", value.asInstanceOf[js.Any])
    
    inline def hierarchy(value: Hierarchy): this.type = set("hierarchy", value.asInstanceOf[js.Any])
    
    inline def kind(value: Kind): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def nested(value: Boolean): this.type = set("nested", value.asInstanceOf[js.Any])
    
    inline def overrides(value: BannerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Banner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BannerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
