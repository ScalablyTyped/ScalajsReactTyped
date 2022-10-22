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
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.antdStrings.icon_
import typingsJapgolly.antd.antdStrings.textSlashhtml
import typingsJapgolly.antd.antdStrings.textSlashplain
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.antd.libTypographyTypographyMod.TypographyProps
import typingsJapgolly.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyBaseMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Base", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InternalBlockProps & RefAttributes[Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.secondary
    - typingsJapgolly.antd.antdStrings.success
    - typingsJapgolly.antd.antdStrings.warning
    - typingsJapgolly.antd.antdStrings.danger
  */
  trait BaseType extends StObject
  object BaseType {
    
    inline def danger: typingsJapgolly.antd.antdStrings.danger = "danger".asInstanceOf[typingsJapgolly.antd.antdStrings.danger]
    
    inline def secondary: typingsJapgolly.antd.antdStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.antd.antdStrings.secondary]
    
    inline def success: typingsJapgolly.antd.antdStrings.success = "success".asInstanceOf[typingsJapgolly.antd.antdStrings.success]
    
    inline def warning: typingsJapgolly.antd.antdStrings.warning = "warning".asInstanceOf[typingsJapgolly.antd.antdStrings.warning]
  }
  
  trait BlockProps
    extends StObject
       with TypographyProps {
    
    var code: js.UndefOr[Boolean] = js.undefined
    
    var copyable: js.UndefOr[Boolean | CopyConfig] = js.undefined
    
    var delete: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean | EditConfig] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var strong: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[BaseType] = js.undefined
    
    var underline: js.UndefOr[Boolean] = js.undefined
  }
  object BlockProps {
    
    inline def apply(): BlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps]
    }
    
    extension [Self <: BlockProps](x: Self) {
      
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
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  trait CopyConfig extends StObject {
    
    var format: js.UndefOr[textSlashplain | textSlashhtml] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var onCopy: js.UndefOr[js.Function1[/* event */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]], Unit]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var tooltips: js.UndefOr[Boolean | Node] = js.undefined
  }
  object CopyConfig {
    
    inline def apply(): CopyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyConfig]
    }
    
    extension [Self <: CopyConfig](x: Self) {
      
      inline def setFormat(value: textSlashplain | textSlashhtml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnCopy(value: /* event */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTooltips(value: Boolean | Node): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsNull: Self = StObject.set(x, "tooltips", null)
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      inline def setTooltipsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltips", js.Array(value*))
      
      inline def setTooltipsVdomElement(value: VdomElement): Self = StObject.set(x, "tooltips", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait EditConfig extends StObject {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
    
    var editing: js.UndefOr[Boolean] = js.undefined
    
    var enterIcon: js.UndefOr[Node] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tooltip: js.UndefOr[Boolean | Node] = js.undefined
    
    var triggerType: js.UndefOr[js.Array[icon_ | text_]] = js.undefined
  }
  object EditConfig {
    
    inline def apply(): EditConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditConfig]
    }
    
    extension [Self <: EditConfig](x: Self) {
      
      inline def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      inline def setEnterIcon(value: VdomNode): Self = StObject.set(x, "enterIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEnterIconNull: Self = StObject.set(x, "enterIcon", null)
      
      inline def setEnterIconUndefined: Self = StObject.set(x, "enterIcon", js.undefined)
      
      inline def setEnterIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "enterIcon", js.Array(value*))
      
      inline def setEnterIconVdomElement(value: VdomElement): Self = StObject.set(x, "enterIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setTooltip(value: Boolean | Node): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltip", js.Array(value*))
      
      inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "tooltip", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTriggerType(value: js.Array[icon_ | text_]): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      inline def setTriggerTypeVarargs(value: (icon_ | text_)*): Self = StObject.set(x, "triggerType", js.Array(value*))
    }
  }
  
  trait EllipsisConfig extends StObject {
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.undefined
    
    var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var symbol: js.UndefOr[Node] = js.undefined
    
    var tooltip: js.UndefOr[Node | TooltipProps] = js.undefined
  }
  object EllipsisConfig {
    
    inline def apply(): EllipsisConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisConfig]
    }
    
    extension [Self <: EllipsisConfig](x: Self) {
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setOnEllipsis(value: /* ellipsis */ Boolean => Callback): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1((t0: /* ellipsis */ Boolean) => value(t0).runNow()))
      
      inline def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
      
      inline def setOnExpand(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSymbol(value: VdomNode): Self = StObject.set(x, "symbol", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setSymbolVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "symbol", js.Array(value*))
      
      inline def setSymbolVdomElement(value: VdomElement): Self = StObject.set(x, "symbol", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Node | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltip", js.Array(value*))
      
      inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "tooltip", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait InternalBlockProps
    extends StObject
       with BlockProps {
    
    var component: String
  }
  object InternalBlockProps {
    
    inline def apply(component: String): InternalBlockProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalBlockProps]
    }
    
    extension [Self <: InternalBlockProps](x: Self) {
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[InternalBlockProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyBaseMod.foo` */
  override def _to: ForwardRefExoticComponent[InternalBlockProps & RefAttributes[Any]] = default
}
