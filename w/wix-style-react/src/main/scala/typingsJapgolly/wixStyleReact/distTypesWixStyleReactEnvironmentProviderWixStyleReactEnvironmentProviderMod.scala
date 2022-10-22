package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.ChildrenLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixStyleReactEnvironmentProviderWixStyleReactEnvironmentProviderMod {
  
  object default {
    
    /** A wrapper component for an app to hold cross library global configuration such as locale, rtl and others */
    inline def apply(hasLocaleChildren: ChildrenLocale): Element = ^.asInstanceOf[js.Dynamic].apply(hasLocaleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/WixStyleReactEnvironmentProvider/WixStyleReactEnvironmentProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/WixStyleReactEnvironmentProvider/WixStyleReactEnvironmentProvider", "default.defaultProps.locale_1")
      @js.native
      val locale1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/WixStyleReactEnvironmentProvider/WixStyleReactEnvironmentProvider", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/WixStyleReactEnvironmentProvider/WixStyleReactEnvironmentProvider", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/WixStyleReactEnvironmentProvider/WixStyleReactEnvironmentProvider", "default.propTypes.locale")
      @js.native
      val locale: Requireable[String] = js.native
    }
  }
}
