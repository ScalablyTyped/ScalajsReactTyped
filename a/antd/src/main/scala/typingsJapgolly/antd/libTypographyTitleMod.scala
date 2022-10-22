package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLHeadingElement
import typingsJapgolly.antd.antdInts.`1`
import typingsJapgolly.antd.antdInts.`2`
import typingsJapgolly.antd.antdInts.`3`
import typingsJapgolly.antd.antdInts.`4`
import typingsJapgolly.antd.antdInts.`5`
import typingsJapgolly.antd.libTypographyBaseMod.BaseType
import typingsJapgolly.antd.libTypographyBaseMod.CopyConfig
import typingsJapgolly.antd.libTypographyBaseMod.EditConfig
import typingsJapgolly.antd.libTypographyBaseMod.EllipsisConfig
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyTitleMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Title", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  /* Inlined std.Omit<antd.antd/lib/typography/Base.BlockProps & {  level :[1, 2, 3, 4, 5][number] | undefined,   onClick :(e : react.react.MouseEvent<std.HTMLDivElement, react.react.NativeMouseEvent> | undefined): void | undefined}, 'strong'> */
  trait TitleProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[Boolean] = js.undefined
    
    var copyable: js.UndefOr[Boolean | CopyConfig] = js.undefined
    
    var delete: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean | EditConfig] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[`1` | `2` | `3` | `4` | `5`] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[BaseType] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object TitleProps {
    
    inline def apply(): TitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleProps]
    }
    
    extension [Self <: TitleProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCopyable(value: Boolean | CopyConfig): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean | EditConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEllipsis(value: Boolean | EllipsisConfig): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLevel(value: `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setOnClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TitleProps & RefAttributes[HTMLHeadingElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyTitleMod.foo` */
  override def _to: ForwardRefExoticComponent[TitleProps & RefAttributes[HTMLHeadingElement]] = default
}
