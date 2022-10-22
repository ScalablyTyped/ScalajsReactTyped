package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAvatarAvatarMod {
  
  @JSImport("react-toolbox/components/avatar/Avatar", JSImport.Default)
  @js.native
  open class default protected () extends Avatar {
    def this(props: AvatarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AvatarProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/avatar/Avatar", "Avatar")
  @js.native
  open class Avatar protected ()
    extends Component[AvatarProps, js.Object, Any] {
    def this(props: AvatarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AvatarProps, context: Any) = this()
  }
  
  trait AvatarProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Set to true if your image is not squared so it will be used as a cover for the element.
      * @default false
      */
    var cover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A key to identify an Icon from Material Design Icons or a custom Icon Element.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * An image source or an image element.
      */
    var image: js.UndefOr[Node] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[AvatarTheme] = js.undefined
    
    /**
      * A title for the image. If no image is provided, the first letter will be displayed as the avatar.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: AvatarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait AvatarTheme extends StObject {
    
    /**
      * Used for the root class of the element.
      */
    var avatar: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when the component has image.
      */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element if the component shows the letter.
      */
    var letter: js.UndefOr[String] = js.undefined
  }
  object AvatarTheme {
    
    inline def apply(): AvatarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarTheme]
    }
    
    extension [Self <: AvatarTheme](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLetter(value: String): Self = StObject.set(x, "letter", value.asInstanceOf[js.Any])
      
      inline def setLetterUndefined: Self = StObject.set(x, "letter", js.undefined)
    }
  }
}
