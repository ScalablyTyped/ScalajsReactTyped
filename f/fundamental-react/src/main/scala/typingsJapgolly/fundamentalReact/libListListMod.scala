package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListByli
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListFoot
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListHead
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListIcon
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListItem
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListSele
import typingsJapgolly.fundamentalReact.anon.FunctionComponentListText
import typingsJapgolly.fundamentalReact.anon.PartialListProps
import typingsJapgolly.fundamentalReact.anon.WeakValidationMapListProp
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactInts.`6`
import typingsJapgolly.fundamentalReact.libIconIconMod.IconGlyph
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListListMod {
  
  /* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListProps> & {  displayName :'List',   Footer :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListFooterProps> & {  displayName :'List.Footer'},   Header :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> & {  displayName :'List.Header'},   Selection :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListSelectionProps> & {  displayName :'List.Selection'},   Icon :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListIconProps> & {  displayName :'List.Icon'},   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName :'List.Item'},   Text :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListTextProps> & {  displayName :'List.Text'},   Byline :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListBylineProps> & {  displayName :'List.Byline'}} */
  object default {
    
    inline def apply(props: ListProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: ListProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("fundamental-react/lib/List/List", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fundamental-react/lib/List/List", "default.Byline")
    @js.native
    def Byline: FunctionComponentListByli = js.native
    inline def Byline_=(x: FunctionComponentListByli): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Byline")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Footer")
    @js.native
    def Footer: FunctionComponentListFoot = js.native
    inline def Footer_=(x: FunctionComponentListFoot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Header")
    @js.native
    def Header: FunctionComponentListHead = js.native
    inline def Header_=(x: FunctionComponentListHead): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Icon")
    @js.native
    def Icon: FunctionComponentListIcon = js.native
    inline def Icon_=(x: FunctionComponentListIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Item")
    @js.native
    def Item: FunctionComponentListItem = js.native
    inline def Item_=(x: FunctionComponentListItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Selection")
    @js.native
    def Selection: FunctionComponentListSele = js.native
    inline def Selection_=(x: FunctionComponentListSele): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Selection")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.Text")
    @js.native
    def Text: FunctionComponentListText = js.native
    inline def Text_=(x: FunctionComponentListText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialListProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.displayName")
    @js.native
    def displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.List | String] = js.native
    inline def displayName_=(x: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.List | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("fundamental-react/lib/List/List", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapListProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapListProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait ListBylineProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cssNamespace: js.UndefOr[String] = js.undefined
    
    var twoColumns: js.UndefOr[Boolean] = js.undefined
  }
  object ListBylineProps {
    
    inline def apply(): ListBylineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBylineProps]
    }
    
    extension [Self <: ListBylineProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCssNamespace(value: String): Self = StObject.set(x, "cssNamespace", value.asInstanceOf[js.Any])
      
      inline def setCssNamespaceUndefined: Self = StObject.set(x, "cssNamespace", js.undefined)
      
      inline def setTwoColumns(value: Boolean): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
      
      inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
    }
  }
  
  trait ListFooterProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object ListFooterProps {
    
    inline def apply(): ListFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListFooterProps]
    }
    
    extension [Self <: ListFooterProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait ListHeaderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object ListHeaderProps {
    
    inline def apply(): ListHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListHeaderProps]
    }
    
    extension [Self <: ListHeaderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait ListIconProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var glyph: IconGlyph
  }
  object ListIconProps {
    
    extension [Self <: ListIconProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItemProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClick(value: /* repeated */ Any => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait ListProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement] {
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[String | typingsJapgolly.react.mod.global.JSX.Element] = js.undefined
    
    var hasByline: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[String | typingsJapgolly.react.mod.global.JSX.Element] = js.undefined
    
    var level: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var navigation: js.UndefOr[Boolean] = js.undefined
    
    var noBorder: js.UndefOr[Boolean] = js.undefined
    
    var partialNavigation: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setFooter(value: String | typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHasByline(value: Boolean): Self = StObject.set(x, "hasByline", value.asInstanceOf[js.Any])
      
      inline def setHasBylineUndefined: Self = StObject.set(x, "hasByline", js.undefined)
      
      inline def setHeader(value: String | typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLevel(value: `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
      
      inline def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
      
      inline def setPartialNavigation(value: Boolean): Self = StObject.set(x, "partialNavigation", value.asInstanceOf[js.Any])
      
      inline def setPartialNavigationUndefined: Self = StObject.set(x, "partialNavigation", js.undefined)
      
      inline def setRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLAnchorElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLAnchorElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
  
  trait ListSelectionProps extends StObject {
    
    var checkBoxAriaLabel: String
    
    var className: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[HTMLInputElement], /* checkedState */ Boolean, Unit]
      ] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ListSelectionProps {
    
    inline def apply(checkBoxAriaLabel: String): ListSelectionProps = {
      val __obj = js.Dynamic.literal(checkBoxAriaLabel = checkBoxAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSelectionProps]
    }
    
    extension [Self <: ListSelectionProps](x: Self) {
      
      inline def setCheckBoxAriaLabel(value: String): Self = StObject.set(x, "checkBoxAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[HTMLInputElement], /* checkedState */ Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[HTMLInputElement], t1: /* checkedState */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait ListTextProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
  }
  object ListTextProps {
    
    inline def apply(): ListTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListTextProps]
    }
    
    extension [Self <: ListTextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    }
  }
}
