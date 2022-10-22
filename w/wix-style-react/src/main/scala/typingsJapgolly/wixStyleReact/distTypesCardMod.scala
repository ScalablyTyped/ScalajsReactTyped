package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.wixStyleReact.anon.PartialCardProps
import typingsJapgolly.wixStyleReact.anon.WeakValidationMapCardProp
import typingsJapgolly.wixStyleReact.distTypesDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardMod {
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/Card.CardProps> & {  Content :new (): wix-style-react.wix-style-react/dist/types/Card/Content.default,   Header :new (): wix-style-react.wix-style-react/dist/types/Card/Header.default,   Divider :react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/Divider.DividerProps>,   Subheader :new (): wix-style-react.wix-style-react/dist/types/Card/Subheader.default} */
  object default {
    
    inline def apply(props: CardProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: CardProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-style-react/dist/types/Card", "default.Content")
    @js.native
    open class Content ()
      extends typingsJapgolly.wixStyleReact.distTypesCardContentMod.default
    @JSImport("wix-style-react/dist/types/Card", "default.Content")
    @js.native
    def Content: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCardContentMod.default] = js.native
    inline def Content_=(x: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCardContentMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Card", "default.Divider")
    @js.native
    def Divider: FunctionComponent[DividerProps] = js.native
    inline def Divider_=(x: FunctionComponent[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-style-react/dist/types/Card", "default.Header")
    @js.native
    open class Header ()
      extends typingsJapgolly.wixStyleReact.distTypesCardHeaderMod.default
    @JSImport("wix-style-react/dist/types/Card", "default.Header")
    @js.native
    def Header: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCardHeaderMod.default] = js.native
    inline def Header_=(x: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCardHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-style-react/dist/types/Card", "default.Subheader")
    @js.native
    open class Subheader ()
      extends typingsJapgolly.wixStyleReact.distTypesCardSubheaderMod.default
    @JSImport("wix-style-react/dist/types/Card", "default.Subheader")
    @js.native
    def Subheader: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCardSubheaderMod.default] = js.native
    inline def Subheader_=(x: Instantiable0[typingsJapgolly.wixStyleReact.distTypesCardSubheaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subheader")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Card", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Card", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCardProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCardProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Card", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Card", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCardProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCardProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait CardProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var controls: js.UndefOr[Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideOverflow: js.UndefOr[Boolean] = js.undefined
    
    var showShadow: js.UndefOr[Boolean] = js.undefined
    
    var stretchVertically: js.UndefOr[Boolean] = js.undefined
  }
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setControls(value: VdomNode): Self = StObject.set(x, "controls", value.rawNode.asInstanceOf[js.Any])
      
      inline def setControlsNull: Self = StObject.set(x, "controls", null)
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setControlsVdomElement(value: VdomElement): Self = StObject.set(x, "controls", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHideOverflow(value: Boolean): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
      
      inline def setHideOverflowUndefined: Self = StObject.set(x, "hideOverflow", js.undefined)
      
      inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      inline def setStretchVertically(value: Boolean): Self = StObject.set(x, "stretchVertically", value.asInstanceOf[js.Any])
      
      inline def setStretchVerticallyUndefined: Self = StObject.set(x, "stretchVertically", js.undefined)
    }
  }
}
