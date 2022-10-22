package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.typographyTypographyMod.TypographyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatar[SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */] extends StObject {
  
  /**
    * The action to display in the card header.
    */
  var action: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The Avatar for the Card Header.
    */
  var avatar: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
    * This can be useful to render an alternative Typography variant by wrapping
    * the `title` text, and optional `subheader` text
    * with the Typography component.
    */
  var disableTypography: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var subheader: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * These props will be forwarded to the subheader
    * (as long as disableTypography is not `true`).
    */
  var subheaderTypographyProps: js.UndefOr[TypographyProps[SubheaderTypographyComponent, `1`[SubheaderTypographyComponent]]] = js.undefined
  
  /**
    * The content of the Card Title.
    */
  var title: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * These props will be forwarded to the title
    * (as long as disableTypography is not `true`).
    */
  var titleTypographyProps: js.UndefOr[TypographyProps[TitleTypographyComponent, `2`[TitleTypographyComponent]]] = js.undefined
}
object Avatar {
  
  inline def apply[SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */](): Avatar[SubheaderTypographyComponent, TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avatar[SubheaderTypographyComponent, TitleTypographyComponent]]
  }
  
  extension [Self <: Avatar[?, ?], SubheaderTypographyComponent /* <: ElementType */, TitleTypographyComponent /* <: ElementType */](x: Self & (Avatar[SubheaderTypographyComponent, TitleTypographyComponent])) {
    
    inline def setAction(value: VdomNode): Self = StObject.set(x, "action", value.rawNode.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActionVdomElement(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAvatar(value: VdomNode): Self = StObject.set(x, "avatar", value.rawNode.asInstanceOf[js.Any])
    
    inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value*))
    
    inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisableTypography(value: Boolean): Self = StObject.set(x, "disableTypography", value.asInstanceOf[js.Any])
    
    inline def setDisableTypographyUndefined: Self = StObject.set(x, "disableTypography", js.undefined)
    
    inline def setSubheader(value: VdomNode): Self = StObject.set(x, "subheader", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubheaderNull: Self = StObject.set(x, "subheader", null)
    
    inline def setSubheaderTypographyProps(value: TypographyProps[SubheaderTypographyComponent, `1`[SubheaderTypographyComponent]]): Self = StObject.set(x, "subheaderTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setSubheaderTypographyPropsUndefined: Self = StObject.set(x, "subheaderTypographyProps", js.undefined)
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
    
    inline def setSubheaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subheader", js.Array(value*))
    
    inline def setSubheaderVdomElement(value: VdomElement): Self = StObject.set(x, "subheader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleTypographyProps(value: TypographyProps[TitleTypographyComponent, `2`[TitleTypographyComponent]]): Self = StObject.set(x, "titleTypographyProps", value.asInstanceOf[js.Any])
    
    inline def setTitleTypographyPropsUndefined: Self = StObject.set(x, "titleTypographyProps", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
