package typingsJapgolly.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconGroupMod.IconGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticICONS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.clockwise
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.counterclockwise
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.horizontally
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vertically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsIconIconMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[IconProps, js.Object, Any]
  object default {
    
    /* was `typeof IconGroup` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Icon/Icon", "default.Group")
    @js.native
    val Group: FC[IconGroupProps] = js.native
  }
  
  type Icon = PureComponent[IconProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right`
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right`
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left`
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left`
  */
  trait IconCorner extends StObject
  object IconCorner {
    
    inline def `bottom left`: typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left` = ("bottom left").asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left`]
    
    inline def `bottom right`: typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right` = ("bottom right").asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right`]
    
    inline def `top left`: typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left` = ("top left").asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left`]
    
    inline def `top right`: typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right` = ("top right").asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right`]
  }
  
  trait IconProps
    extends StObject
       with StrictIconProps
       with /* key */ StringDictionary[Any]
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
  */
  trait IconSizeProp extends StObject
  object IconSizeProp {
    
    inline def big: typingsJapgolly.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.big]
    
    inline def huge: typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge]
    
    inline def large: typingsJapgolly.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.large]
    
    inline def massive: typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive]
    
    inline def mini: typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini]
    
    inline def small: typingsJapgolly.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.small]
    
    inline def tiny: typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  trait StrictIconProps extends StObject {
    
    /** Icon can have an aria hidden. */
    var `aria-hidden`: js.UndefOr[String] = js.undefined
    
    /** Icon can have an aria label. */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Formatted to appear bordered */
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can formatted to appear circular. */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Color of the icon. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** Icons can display a smaller corner icon. */
    var corner: js.UndefOr[Boolean | IconCorner] = js.undefined
    
    /** Show that the icon is inactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Fitted, without space to left or right of Icon. */
    var fitted: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be flipped. */
    var flipped: js.UndefOr[horizontally | vertically] = js.undefined
    
    /** Formatted to have its colors inverted for contrast. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be formatted as a link. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /** Icon can be used as a simple loader. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the icon. */
    var name: js.UndefOr[SemanticICONS] = js.undefined
    
    /** Icon can rotated. */
    var rotated: js.UndefOr[clockwise | counterclockwise] = js.undefined
    
    /** Size of the icon. */
    var size: js.UndefOr[IconSizeProp] = js.undefined
  }
  object StrictIconProps {
    
    inline def apply(): StrictIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictIconProps]
    }
    
    extension [Self <: StrictIconProps](x: Self) {
      
      inline def `setAria-hidden`(value: String): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCorner(value: Boolean | IconCorner): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      inline def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      inline def setFlipped(value: horizontally | vertically): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
      
      inline def setFlippedUndefined: Self = StObject.set(x, "flipped", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setName(value: SemanticICONS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRotated(value: clockwise | counterclockwise): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      inline def setSize(value: IconSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
