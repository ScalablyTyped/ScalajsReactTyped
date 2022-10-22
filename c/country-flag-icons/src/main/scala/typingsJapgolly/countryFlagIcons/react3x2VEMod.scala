package typingsJapgolly.countryFlagIcons

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object react3x2VEMod extends Shortcut {
  
  @JSImport("country-flag-icons/react/3x2/VE", JSImport.Default)
  @js.native
  val default: FlagComponent = js.native
  
  // React TypeScript Cheatsheet doesn't recommend using React.FunctionalComponent.
  // https://react-typescript-cheatsheet.netlify.app/docs/basic/getting-started/function_components
  // declare const ReactTimeAgo: React.FC<Props>;
  type FlagComponent = js.Function1[/* props */ Props, Element]
  
  // https://stackoverflow.com/questions/63165896/what-is-the-type-of-the-svg-element-in-typescript
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.std.EventTarget because Already inherited
  - typingsJapgolly.std.Node because Already inherited
  - typingsJapgolly.std.Slottable because Already inherited
  - typingsJapgolly.std.NonDocumentTypeChildNode because Already inherited
  - typingsJapgolly.std.InnerHTML because Already inherited
  - typingsJapgolly.std.ChildNode because Already inherited
  - typingsJapgolly.std.Animatable because Already inherited
  - typingsJapgolly.std.ARIAMixin because Already inherited
  - typingsJapgolly.std.HTMLOrSVGElement because Already inherited
  - typingsJapgolly.std.GlobalEventHandlers because Already inherited
  - typingsJapgolly.std.ElementCSSInlineStyle because Already inherited
  - typingsJapgolly.std.DocumentAndElementEventHandlers because Already inherited
  - typingsJapgolly.std.Element because Already inherited
  - typingsJapgolly.std.SVGElement because var conflicts: ariaAtomic, ariaAutoComplete, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColSpan, ariaCurrent, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autofocus, className, id, innerHTML, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onblur, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextmenu, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, scrollLeft, scrollTop, slot, tabIndex, textContent. Inlined ownerSVGElement, viewportElement */ @js.native
  trait HTMLSVGElement
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    val ownerSVGElement: SVGSVGElement | Null = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /* standard dom */
    val viewportElement: SVGElement | Null = js.native
  }
  
  type Props = HTMLAttributes[HTMLSVGElement]
  
  type _To = FlagComponent
  
  /* This means you don't have to write `default`, but can instead just say `react3x2VEMod.foo` */
  override def _to: FlagComponent = default
}
