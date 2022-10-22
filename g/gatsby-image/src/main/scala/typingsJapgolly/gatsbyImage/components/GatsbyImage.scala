package typingsJapgolly.gatsbyImage.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gatsbyImage.anon.WasCached
import typingsJapgolly.gatsbyImage.mod.FixedObject
import typingsJapgolly.gatsbyImage.mod.FluidObject
import typingsJapgolly.gatsbyImage.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GatsbyImage {
  
  object GatsbyImageFixedProps {
    
    inline def apply(fixed: FixedObject | js.Array[FixedObject]): Builder = {
      val __props = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.gatsbyImage.mod.GatsbyImageFixedProps]))
    }
    
    @JSImport("gatsby-image", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[default] {
      
      inline def Tag(value: String): this.type = set("Tag", value.asInstanceOf[js.Any])
      
      inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
      
      inline def backgroundColor(value: String | Boolean): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      inline def className(value: String | js.Object): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def critical(value: Boolean): this.type = set("critical", value.asInstanceOf[js.Any])
      
      inline def crossOrigin(value: String | Boolean): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def durationFadeIn(value: Double): this.type = set("durationFadeIn", value.asInstanceOf[js.Any])
      
      inline def fadeIn(value: Boolean): this.type = set("fadeIn", value.asInstanceOf[js.Any])
      
      inline def imgStyle(value: js.Object): this.type = set("imgStyle", value.asInstanceOf[js.Any])
      
      inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      inline def loading(value: /* template literal string: auto */ String): this.type = set("loading", value.asInstanceOf[js.Any])
      
      inline def onError(value: /* event */ Any => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
      
      inline def onStartLoad(value: /* param */ WasCached => Callback): this.type = set("onStartLoad", js.Any.fromFunction1((t0: /* param */ WasCached) => value(t0).runNow()))
      
      inline def placeholderClassName(value: String): this.type = set("placeholderClassName", value.asInstanceOf[js.Any])
      
      inline def placeholderStyle(value: js.Object): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
      
      inline def resolutions(value: FixedObject): this.type = set("resolutions", value.asInstanceOf[js.Any])
      
      inline def sizes(value: FluidObject): this.type = set("sizes", value.asInstanceOf[js.Any])
      
      inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.gatsbyImage.mod.GatsbyImageFixedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object GatsbyImageFluidProps {
    
    inline def apply(fluid: FluidObject | js.Array[FluidObject]): Builder = {
      val __props = js.Dynamic.literal(fluid = fluid.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.gatsbyImage.mod.GatsbyImageFluidProps]))
    }
    
    @JSImport("gatsby-image", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[default] {
      
      inline def Tag(value: String): this.type = set("Tag", value.asInstanceOf[js.Any])
      
      inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
      
      inline def backgroundColor(value: String | Boolean): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      inline def className(value: String | js.Object): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def critical(value: Boolean): this.type = set("critical", value.asInstanceOf[js.Any])
      
      inline def crossOrigin(value: String | Boolean): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def durationFadeIn(value: Double): this.type = set("durationFadeIn", value.asInstanceOf[js.Any])
      
      inline def fadeIn(value: Boolean): this.type = set("fadeIn", value.asInstanceOf[js.Any])
      
      inline def imgStyle(value: js.Object): this.type = set("imgStyle", value.asInstanceOf[js.Any])
      
      inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      inline def loading(value: /* template literal string: auto */ String): this.type = set("loading", value.asInstanceOf[js.Any])
      
      inline def onError(value: /* event */ Any => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
      
      inline def onStartLoad(value: /* param */ WasCached => Callback): this.type = set("onStartLoad", js.Any.fromFunction1((t0: /* param */ WasCached) => value(t0).runNow()))
      
      inline def placeholderClassName(value: String): this.type = set("placeholderClassName", value.asInstanceOf[js.Any])
      
      inline def placeholderStyle(value: js.Object): this.type = set("placeholderStyle", value.asInstanceOf[js.Any])
      
      inline def resolutions(value: FixedObject): this.type = set("resolutions", value.asInstanceOf[js.Any])
      
      inline def sizes(value: FluidObject): this.type = set("sizes", value.asInstanceOf[js.Any])
      
      inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.gatsbyImage.mod.GatsbyImageFluidProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
