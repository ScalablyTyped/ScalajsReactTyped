package typingsJapgolly.simpleReactLightbox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.simpleReactLightbox.mod.Callbacks
import typingsJapgolly.simpleReactLightbox.mod.Elements
import typingsJapgolly.simpleReactLightbox.mod.SRLWrapperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SRLWrapper {
  
  object WrapperWithChildrenoption {
    
    @JSImport("simple-react-lightbox", "SRLWrapper")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def callbacks(value: Callbacks): this.type = set("callbacks", value.asInstanceOf[js.Any])
      
      inline def options(value: SRLWrapperOptions): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: WrapperWithChildrenoption.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.simpleReactLightbox.anon.WrapperWithChildrenoption): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object WrapperWithElementsoption {
    
    inline def apply(elements: Elements): Builder = {
      val __props = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.simpleReactLightbox.anon.WrapperWithElementsoption]))
    }
    
    @JSImport("simple-react-lightbox", "SRLWrapper")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def callbacks(value: Callbacks): this.type = set("callbacks", value.asInstanceOf[js.Any])
      
      inline def options(value: SRLWrapperOptions): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.simpleReactLightbox.anon.WrapperWithElementsoption): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
