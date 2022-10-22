package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationActionButtonMod {
  
  object default {
    
    inline def apply(hasChildrenOnClickTypeLinkTarget: Link): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenOnClickTypeLinkTarget.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Notification/ActionButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.defaultProps.target_1")
      @js.native
      val target1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.defaultProps.type_1")
      @js.native
      val type1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.propTypes.children")
      @js.native
      val children: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.propTypes.link")
      @js.native
      val link: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.propTypes.target")
      @js.native
      val target: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/ActionButton", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
    }
  }
}
