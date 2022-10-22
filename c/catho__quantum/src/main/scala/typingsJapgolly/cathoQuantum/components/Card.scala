package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.cathoQuantum.anon.Alt
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeSpacing
import typingsJapgolly.cathoQuantum.anon.ClassName
import typingsJapgolly.cathoQuantum.anon.ColorsSpacing
import typingsJapgolly.cathoQuantum.anon.Small
import typingsJapgolly.cathoQuantum.anon.SmallTheme
import typingsJapgolly.cathoQuantum.anon.Theme
import typingsJapgolly.cathoQuantum.anon.`3`
import typingsJapgolly.cathoQuantum.anon.`8`
import typingsJapgolly.cathoQuantum.cardMod.Props
import typingsJapgolly.cathoQuantum.cardMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  object Content {
    
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def theme(value: BaseFontSizeSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsJapgolly.cathoQuantum.components.Card.Content.Builder = new typingsJapgolly.cathoQuantum.components.Card.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Theme): typingsJapgolly.cathoQuantum.components.Card.Content.Builder = new typingsJapgolly.cathoQuantum.components.Card.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
      
      inline def theme(value: BaseFontSizeSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Description.type): typingsJapgolly.cathoQuantum.components.Card.Description.Builder = new typingsJapgolly.cathoQuantum.components.Card.Description.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Small): typingsJapgolly.cathoQuantum.components.Card.Description.Builder = new typingsJapgolly.cathoQuantum.components.Card.Description.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): SharedBuilder_3301687753 = new SharedBuilder_3301687753(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `3`): SharedBuilder_3301687753 = new SharedBuilder_3301687753(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_3301687753 = new SharedBuilder_3301687753(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `3`): SharedBuilder_3301687753 = new SharedBuilder_3301687753(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object HeaderText {
    
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: HeaderText.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Media {
    
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def theme(value: ColorsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Media.type): typingsJapgolly.cathoQuantum.components.Card.Media.Builder = new typingsJapgolly.cathoQuantum.components.Card.Media.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ClassName): typingsJapgolly.cathoQuantum.components.Card.Media.Builder = new typingsJapgolly.cathoQuantum.components.Card.Media.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Thumbnail {
    
    inline def apply(alt: String, src: String): typingsJapgolly.cathoQuantum.components.Card.Thumbnail.Builder = {
      val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      new typingsJapgolly.cathoQuantum.components.Card.Thumbnail.Builder(js.Array(this.component, __props.asInstanceOf[Alt]))
    }
    
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
      
      inline def theme(value: `8`): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Alt): typingsJapgolly.cathoQuantum.components.Card.Thumbnail.Builder = new typingsJapgolly.cathoQuantum.components.Card.Thumbnail.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Title.type): SharedBuilder_SmallTheme1067188870 = new SharedBuilder_SmallTheme1067188870(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SmallTheme): SharedBuilder_SmallTheme1067188870 = new SharedBuilder_SmallTheme1067188870(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onClick(value: /* e */ ReactMouseEventFrom[Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
    
    inline def theme(value: `8`): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
