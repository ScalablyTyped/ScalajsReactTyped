package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.PartialSliderProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsSliderSliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSliderMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/slider", "Slider")
  @js.native
  open class Slider protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsSliderSliderMod.Slider {
    def this(props: SliderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliderProps, context: Any) = this()
  }
  /* static members */
  object Slider {
    
    @JSImport("wix-ui-core/dist/es/src/components/slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/slider", "Slider.defaultProps")
    @js.native
    def defaultProps: PartialSliderProps = js.native
    inline def defaultProps_=(x: PartialSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/slider", "Slider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
