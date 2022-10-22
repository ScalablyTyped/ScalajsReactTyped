package typingsJapgolly.reactSpinkit

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
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

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-spinkit", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends Component[SpinnerProps, js.Object, Any] {
    def this(props: SpinnerProps) = this()
    def this(props: SpinnerProps, context: Any) = this()
  }
  @JSImport("react-spinkit", JSImport.Namespace)
  @js.native
  val ^ : Spinner = js.native
  
  type Spinner = ComponentClassP[SpinnerProps & js.Object]
  
  trait SpinnerProps extends StObject {
    
    /**
      * Component className.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Programmatically set the color of the spinners (does not work
      * for circle or folding-cube); this can either be a hex value or a color word
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Set the time before the spinner fades in
      */
    var fadeIn: js.UndefOr[full | half | quarter | none] = js.undefined
    
    /**
      * Specify spinner to use.
      */
    var name: js.UndefOr[
        `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
      ] = js.undefined
    
    /**
      * Change the default "spinner" className.
      */
    var overrideSpinnerClassName: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SpinnerProps {
    
    inline def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    extension [Self <: SpinnerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFadeIn(value: full | half | quarter | none): Self = StObject.set(x, "fadeIn", value.asInstanceOf[js.Any])
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setName(
        value: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOverrideSpinnerClassName(value: String): Self = StObject.set(x, "overrideSpinnerClassName", value.asInstanceOf[js.Any])
      
      inline def setOverrideSpinnerClassNameUndefined: Self = StObject.set(x, "overrideSpinnerClassName", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = Spinner
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Spinner = ^
}
