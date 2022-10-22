package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressComponents.anon.ClassName
import typingsJapgolly.wordpressComponents.anon.Origin
import typingsJapgolly.wordpressComponents.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animate {
  
  object AppearProps {
    
    inline def apply(children: ClassName => Node): Builder = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __props.updateDynamic("type")("appear")
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.animateMod.Animate.AppearProps]))
    }
    
    @JSImport("@wordpress/components", "Animate")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def options(value: Origin): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressComponents.animateMod.Animate.AppearProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object LoadingProps {
    
    inline def apply(children: ClassName => Node): Default[js.Object] = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __props.updateDynamic("type")("loading")
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.animateMod.Animate.LoadingProps]))
    }
    
    @JSImport("@wordpress/components", "Animate")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsJapgolly.wordpressComponents.animateMod.Animate.LoadingProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SlideInProps {
    
    inline def apply(children: ClassName => Node): Builder = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __props.updateDynamic("type")("slide-in")
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wordpressComponents.animateMod.Animate.SlideInProps]))
    }
    
    @JSImport("@wordpress/components", "Animate")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def options(value: `0`): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.wordpressComponents.animateMod.Animate.SlideInProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
