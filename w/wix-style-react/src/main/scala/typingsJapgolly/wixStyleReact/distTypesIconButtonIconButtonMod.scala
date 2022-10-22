package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesWixStyleReactDefaultsOverrideProviderWixStyleReactDefaultsOverrideProviderMod.WixStyleReactDefaultsOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIconButtonIconButtonMod {
  
  @JSImport("wix-style-react/dist/types/IconButton/IconButton", JSImport.Default)
  @js.native
  open class default protected () extends IconButton {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/IconButton/IconButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.contextType")
    @js.native
    def contextType: Context[WixStyleReactDefaultsOverride] = js.native
    inline def contextType_=(x: Context[WixStyleReactDefaultsOverride]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.defaultProps.priority")
      @js.native
      def priority: String = js.native
      inline def priority_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Defines a string value that labels the button element */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      /** Identifies the element that labels the button element */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.ariaLabelledBy")
      @js.native
      def ariaLabelledBy: Requireable[String] = js.native
      inline def ariaLabelledBy_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(x.asInstanceOf[js.Any])
      
      /** render as some other component or DOM tag */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.as")
      @js.native
      def as: Requireable[String | js.Object] = js.native
      inline def as_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("as")(x.asInstanceOf[js.Any])
      
      /** Used for passing any wix-style-react icon. For external icon make sure to follow ux sizing guidelines */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Classes to be applied to the root element */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** String based data hook */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Applies disabled styles */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Click event handler  */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Button priority */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.priority")
      @js.native
      def priority: Requireable[String] = js.native
      inline def priority_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
      
      /** Button size */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Button skins */
      @JSImport("wix-style-react/dist/types/IconButton/IconButton", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IconButton extends PureComponent[Any, Any, Any] {
    
    var button: RefHandle[Any] = js.native
    
    /**
      * Sets focus on the button element
      */
    def focus(): Unit = js.native
  }
}
