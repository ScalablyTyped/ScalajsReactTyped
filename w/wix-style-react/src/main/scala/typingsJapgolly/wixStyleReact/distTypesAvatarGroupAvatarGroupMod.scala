package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.AriaLabel
import typingsJapgolly.wixStyleReact.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarGroupAvatarGroupMod {
  
  object default {
    
    /** AvatarGroup */
    inline def apply(hasDataHookClassNameTypeItemsMaxItemsSizeShowDivider: Items): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameTypeItemsMaxItemsSizeShowDivider.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.defaultProps.items_1")
      @js.native
      val items1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.defaultProps.maxItems_1")
      @js.native
      val maxItems1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.defaultProps.showDivider_1")
      @js.native
      val showDivider1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.defaultProps.type_1")
      @js.native
      val type1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.items")
      @js.native
      val items: Validator[js.Array[js.UndefOr[InferProps[AriaLabel] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.maxItems")
      @js.native
      val maxItems: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.showDivider")
      @js.native
      val showDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AvatarGroup/AvatarGroup", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
    }
  }
}
