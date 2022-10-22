package typingsJapgolly.preact.srcJsxMod.JSXInternal

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import typingsJapgolly.preact.anon.CurrentTarget
import typingsJapgolly.preact.anon.TargetedEventEventTargetE
import typingsJapgolly.preact.mod.Component
import typingsJapgolly.preact.mod.ComponentType
import typingsJapgolly.preact.mod.FunctionComponent
import typingsJapgolly.preact.mod.VNode
import typingsJapgolly.preact.preactStrings.currentTarget
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllCSSProperties = StringDictionary[js.UndefOr[String | Double | Null]]

type AnimationEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedAnimationEvent[Target]]

type ClipboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedClipboardEvent[Target]]

type CompositionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedCompositionEvent[Target]]

type DetailedHTMLProps[HA /* <: HTMLAttributes[RefType] */, RefType /* <: EventTarget */] = HA

type DragEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedDragEvent[Target]]

type Element = VNode[Any]

type ElementClass = (Component[Any, Any]) | FunctionComponent[Any]

type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'marquee' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'svg' | 'animate' | 'circle' | 'animateTransform' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'feSpecularLighting' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' ]: P extends preact.preact/src/jsx.JSXInternal.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'marquee' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'svg' | 'animate' | 'circle' | 'animateTransform' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'feSpecularLighting' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use'] */ js.Any) | ComponentType[P]

type EventHandler[E /* <: TargetedEventEventTargetE */] = js.ThisFunction1[/* this */ scala.Nothing, /* event */ E, Unit]

type FocusEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedFocusEvent[Target]]

type GenericEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedEvent[Target, Event]]

type KeyboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedKeyboardEvent[Target]]

type MouseEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedMouseEvent[Target]]

type PointerEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedPointerEvent[Target]]

type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) & CurrentTarget[Target]

type TouchEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTouchEvent[Target]]

type TransitionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTransitionEvent[Target]]

type UIEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedUIEvent[Target]]

type WheelEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedWheelEvent[Target]]
