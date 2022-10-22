package typingsJapgolly.reactBlessed.mod

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.blessed.mod.Widgets.BlessedElement
import typingsJapgolly.blessed.mod.Widgets.Events.IKeyEventArg
import typingsJapgolly.blessed.mod.Widgets.Events.IMouseEventArg
import typingsJapgolly.blessed.mod.Widgets.Log
import typingsJapgolly.blessed.mod.Widgets.NodeGenericEventType
import typingsJapgolly.blessed.mod.Widgets.NodeMouseEventType
import typingsJapgolly.blessed.mod.Widgets.NodeScreenEventType
import typingsJapgolly.blessed.mod.Widgets.Screen
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBlessed.anon.Children
import typingsJapgolly.reactBlessed.anon.Class
import typingsJapgolly.reactBlessed.mod.^
import typingsJapgolly.reactBlessed.reactBlessedBooleans.`false`
import typingsJapgolly.reactBlessed.reactBlessedStrings.Space
import typingsJapgolly.reactBlessed.reactBlessedStrings.children
import typingsJapgolly.reactBlessed.reactBlessedStrings.content
import typingsJapgolly.reactBlessed.reactBlessedStrings.element
import typingsJapgolly.reactBlessed.reactBlessedStrings.keypress
import typingsJapgolly.reactBlessed.reactBlessedStrings.style
import typingsJapgolly.reactBlessed.reactBlessedStrings.warning
import typingsJapgolly.std.Capitalize
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createBlessedRenderer(bls: Any): renderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlessedRenderer")(bls.asInstanceOf[js.Any]).asInstanceOf[renderer]

inline def render(c: typingsJapgolly.react.mod.global.JSX.Element, s: Screen): (Component[js.Object, js.Object]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Object, js.Object]) | Null]
inline def render(c: typingsJapgolly.react.mod.global.JSX.Element, s: Screen, callback: Callback): (Component[js.Object, js.Object]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(c.asInstanceOf[js.Any], s.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[js.Object, js.Object]) | Null]

type BigTextElement = typingsJapgolly.blessed.mod.Widgets.BigTextElement

type BlessedAttributes[E /* <: Element */] = WithClassProp[
(ModifiedBlessedOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: E['options'] */ js.Any
]) & ProgressBarProps[E] & ListProps[E] & LayoutProps[E], 
js.UndefOr[
  ((ModifiedBlessedOptions[
    /* import warning: importer.ImportType#apply Failed type conversion: E['options'] */ js.Any
  ]) & ProgressBarProps[E] & ListProps[E] & LayoutProps[E]) | `false` | Null
]]

type BoxElement = typingsJapgolly.blessed.mod.Widgets.BoxElement

type ButtonElement = typingsJapgolly.blessed.mod.Widgets.ButtonElement

type Callback = js.Function0[js.UndefOr[Unit | Null]]

type CamelCasedGenericEventNames = Prefix[GenericContentPrefix, Capitalize[GenericContent]]

type CamelCasedScreenEventNames = Prefix[ScreenElementPrefix, Capitalize[ScreenElement]]

type CheckboxElement = typingsJapgolly.blessed.mod.Widgets.CheckboxElement

type DetailedBlessedProps[E /* <: Element */] = BlessedAttributes[E] & ClassAttributes[E]

type Element = BlessedElement

type EventHandler[T] = js.Function1[
/* args */ SpreadableArgs[
  T, 
  /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<unknown> ? T : [T] */ js.Any
], 
Unit]

type ExludedGenericEventNames = Prefix[GenericContentPrefix, Prefix[Space, GenericContent]]

type ExludedScreenEventNames = Prefix[ScreenElementPrefix, Prefix[Space, ScreenElement]]

type FileManagerElement = typingsJapgolly.blessed.mod.Widgets.FileManagerElement

// remove {[key: string]: any} indexer defined in Blessed.Widgets.IOptions.
// 'blessed' doesn't exist in a DOM so it probably doesn't make sense to allow any property
type FilterOptions[T /* <: Record[Any, Any] */] = Partial[Omit[KnownKeys[T], style | children]]

type GenericContent = content

type GenericEvent = Unit

type GenericEventHandler = EventHandler[GenericEvent]

type GenericEventNames = (Exclude[NodeGenericEventType, ExludedGenericEventNames]) | CamelCasedGenericEventNames

type GenericEventProps = EventHandlerProp[GenericEventNames, GenericEventHandler]

type InputElement = typingsJapgolly.blessed.mod.Widgets.InputElement

type KeyPressEvent = js.Tuple2[/* key */ Any, /* event */ IKeyEventArg]

type KeyPressEventHandler = EventHandler[KeyPressEvent]

type KeyPressEventProps = EventHandlerProp[keypress, KeyPressEventHandler]

type LayoutElement = typingsJapgolly.blessed.mod.Widgets.LayoutElement

type LineElement = typingsJapgolly.blessed.mod.Widgets.LineElement

type ListElement = typingsJapgolly.blessed.mod.Widgets.ListElement

type ListTableElement = typingsJapgolly.blessed.mod.Widgets.ListTableElement

type ListbarElement = typingsJapgolly.blessed.mod.Widgets.ListbarElement

type LoadingElement = typingsJapgolly.blessed.mod.Widgets.LoadingElement

type LogElement = Log

type MessageElement = typingsJapgolly.blessed.mod.Widgets.MessageElement

type ModifiedBlessedOptions[T /* <: Record[Any, Any] */] = FilterOptions[T] & Children & EventProps

type MouseEvent = IMouseEventArg

type MouseEventHandler = EventHandler[MouseEvent]

type MouseEventProps = EventHandlerProp[NodeMouseEventType, MouseEventHandler]

/* EVENTS *******************************************************************/
type Prefix[T /* <: String */, P /* <: String */] = /* template literal string: ${T}${P} */ String

type ProgressBarElement = typingsJapgolly.blessed.mod.Widgets.ProgressBarElement

type ProgressBarEvent = Unit

type ProgressBarEventHandler = EventHandler[ProgressBarEvent]

type ProgressBarEventNames = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-blessed.anon.FnCall>[0] */ js.Any

type ProgressBarEventProps = EventHandlerProp[ProgressBarEventNames, ProgressBarEventHandler]

type PromptElement = typingsJapgolly.blessed.mod.Widgets.PromptElement

type QuestionElement = typingsJapgolly.blessed.mod.Widgets.QuestionElement

type RadioButtonElement = typingsJapgolly.blessed.mod.Widgets.RadioButtonElement

type RadioSetElement = typingsJapgolly.blessed.mod.Widgets.RadioSetElement

type ScreenElementPrefix = element

type ScreenEvent = Screen

type ScreenEventHandler = EventHandler[ScreenEvent]

type ScreenEventNames = (Exclude[NodeScreenEventType, ExludedScreenEventNames]) | CamelCasedScreenEventNames

type ScreenEventProps = EventHandlerProp[ScreenEventNames, ScreenEventHandler]

type ScrollableBoxElement = typingsJapgolly.blessed.mod.Widgets.ScrollableBoxElement

type ScrollableTextElement = typingsJapgolly.blessed.mod.Widgets.ScrollableTextElement

type SpreadableArgs[T, K] = K

type TableElement = typingsJapgolly.blessed.mod.Widgets.TableElement

type TerminalElement = typingsJapgolly.blessed.mod.Widgets.TerminalElement

type TextElement = typingsJapgolly.blessed.mod.Widgets.TextElement

type TextareaElement = typingsJapgolly.blessed.mod.Widgets.TextareaElement

type TextboxElement = typingsJapgolly.blessed.mod.Widgets.TextboxElement

type WarningEvent = String

type WarningEventHandler = EventHandler[WarningEvent]

type WarningEventProps = EventHandlerProp[warning, WarningEventHandler]

type WithClassProp[T, K] = T & Class[K]

type renderer = js.Function3[
/* c */ typingsJapgolly.react.mod.global.JSX.Element, 
/* s */ Screen, 
/* callback */ js.UndefOr[Callback], 
(Component[js.Object, js.Object]) | Null]
