package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.ArrowSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselSliderArrowMod {
  
  object default {
    
    inline def apply(hasDataHookArrowSizeButtonSkinIconClassNameControlsStartEndRemainingProps: ArrowSize): Element | Null = ^.asInstanceOf[js.Dynamic].apply(hasDataHookArrowSizeButtonSkinIconClassNameControlsStartEndRemainingProps.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/Carousel/SliderArrow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Carousel/SliderArrow", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Carousel/SliderArrow", "default.propTypes.icon")
      @js.native
      val icon: Validator[ReactElementLike] = js.native
    }
  }
}
