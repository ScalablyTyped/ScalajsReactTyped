package typingsJapgolly.reactSpinkit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSpinkit.mod.SpinnerProps
import typingsJapgolly.reactSpinkit.mod.^
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-beat`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate-multiple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate-pulse`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-grid-beat`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-grid-pulse`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-pulse-rise`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-pulse-sync`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-scale-multiple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-scale-ripple-multiple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-scale-ripple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-spin-fade-loader`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-triangle-path`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-zig-zag-deflect`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-zig-zag`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`chasing-dots`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`cube-grid`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`double-bounce`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`folding-cube`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale-party`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale-pulse-out-rapid`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale-pulse-out`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-spin-fade-loader`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`rotating-plane`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`three-bounce`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`triangle-skew-spin`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`wandering-cubes`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.circle
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.full
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.half
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.none
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.pacman
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.pulse
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.quarter
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.wave
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.wordpress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSpinkit {
  
  object ReactSpinkit {
    
    @JSImport("react-spinkit", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def fadeIn(value: full | half | quarter | none): this.type = set("fadeIn", value.asInstanceOf[js.Any])
      
      inline def name(
        value: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
      ): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def overrideSpinnerClassName(value: String): this.type = set("overrideSpinnerClassName", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ReactSpinkit.type): typingsJapgolly.reactSpinkit.components.ReactSpinkit.ReactSpinkit.Builder = new typingsJapgolly.reactSpinkit.components.ReactSpinkit.ReactSpinkit.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SpinnerProps): typingsJapgolly.reactSpinkit.components.ReactSpinkit.ReactSpinkit.Builder = new typingsJapgolly.reactSpinkit.components.ReactSpinkit.ReactSpinkit.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-spinkit", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fadeIn(value: full | half | quarter | none): this.type = set("fadeIn", value.asInstanceOf[js.Any])
    
    inline def name(
      value: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
    ): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def overrideSpinnerClassName(value: String): this.type = set("overrideSpinnerClassName", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSpinkit.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinnerProps & js.Object): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
