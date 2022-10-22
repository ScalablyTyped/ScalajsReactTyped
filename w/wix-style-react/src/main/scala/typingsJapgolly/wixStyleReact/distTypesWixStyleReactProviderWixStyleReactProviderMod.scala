package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Features
import typingsJapgolly.wixStyleReact.anon.NewColorsBranding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixStyleReactProviderWixStyleReactProviderMod {
  
  object default {
    
    /** Wix Style React Provider */
    inline def apply(hasDataHookClassNameAsChildrenFeaturesTypographyClassRest: Features): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameAsChildrenFeaturesTypographyClassRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.defaultProps.as_1")
      @js.native
      val as1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.propTypes.as")
      @js.native
      val as: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/WixStyleReactProvider/WixStyleReactProvider", "default.propTypes.features")
      @js.native
      val features: Requireable[InferProps[NewColorsBranding]] = js.native
    }
  }
}
