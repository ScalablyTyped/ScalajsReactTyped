package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselWIPControlMod {
  
  object default {
    
    inline def apply(hasDataHookClassNameOnClickIconSizeSkinDisabled: Icon): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameOnClickIconSizeSkinDisabled.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/CarouselWIP/Control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.icon")
      @js.native
      val icon: Validator[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.onClick")
      @js.native
      val onClick: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CarouselWIP/Control", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
    }
  }
}
