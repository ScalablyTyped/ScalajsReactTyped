package typingsJapgolly.webdriverio

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.Attr
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.DOMRect
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.NamedNodeMap
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.ParentNode
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.std.Animation
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.DOMRectList
import typingsJapgolly.std.DOMStringMap
import typingsJapgolly.std.DocumentAndElementEventHandlers
import typingsJapgolly.std.ElementInternals
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.FullscreenOptions
import typingsJapgolly.std.GetAnimationsOptions
import typingsJapgolly.std.GetRootNodeOptions
import typingsJapgolly.std.GlobalEventHandlers
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.InsertPosition
import typingsJapgolly.std.Keyframe
import typingsJapgolly.std.KeyframeAnimationOptions
import typingsJapgolly.std.OnErrorEventHandler
import typingsJapgolly.std.PropertyIndexedKeyframes
import typingsJapgolly.std.ScrollIntoViewOptions
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.ShadowRootInit
import typingsJapgolly.std.SubmitEvent
import typingsJapgolly.webdriverio.anon.Fn1
import typingsJapgolly.webdriverio.anon.Fn2
import typingsJapgolly.webdriverio.anon.FnCallNamespaceURILocalName
import typingsJapgolly.webdriverio.anon.FnCallQualifiedName
import typingsJapgolly.webdriverio.anon.FnCallSelector
import typingsJapgolly.webdriverio.anon.FnCallSelectors
import typingsJapgolly.webdriverio.anon.FnCallTypeListenerOptions
import typingsJapgolly.webdriverio.anon.FnCallXY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementGetPropertyMod {
  
  @JSImport("webdriverio/build/commands/element/getProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(property: String): js.Promise[
    js.UndefOr[
      String | Double | Boolean | HTMLElement | Element | EventTarget | ChildNode | ParentNode | (js.Function0[js.Array[String] | Boolean | DOMRect | DOMRectList | ElementInternals | Unit]) | Document | (js.Function1[
        js.UndefOr[
          (/* attr */ Attr) | Boolean | (/* pointerId */ Double) | (/* event */ Event) | FocusOptions | FullscreenOptions | GetAnimationsOptions | GetRootNodeOptions | (/* node */ Node) | Null | ScrollIntoViewOptions | (/* init */ ShadowRootInit) | (/* qualifiedName */ String)
        ], 
        js.Array[Animation] | Attr | Boolean | Double | HTMLCollectionOf[Element] | Node | Null | js.Promise[Unit] | ShadowRoot | String | Unit
      ]) | (js.ThisFunction1[
        (/* this */ DocumentAndElementEventHandlers) | (/* this */ Element) | (/* this */ GlobalEventHandlers), 
        (/* ev */ AnimationEvent) | (/* ev */ ClipboardEvent) | (/* ev */ DragEvent) | (/* ev */ Event) | (/* ev */ FocusEvent) | (/* ev */ FormDataEvent) | (/* ev */ KeyboardEvent) | (/* ev */ MouseEvent) | (/* ev */ PointerEvent) | (/* ev */ ProgressEvent) | (/* ev */ SecurityPolicyViolationEvent) | (/* ev */ SubmitEvent) | (/* ev */ TouchEvent) | (/* ev */ TransitionEvent) | (/* ev */ UIEvent) | (/* ev */ WheelEvent), 
        Any
      ]) | OnErrorEventHandler | FnCallTypeListenerOptions | Fn1 | NamedNodeMap | DOMTokenList | ShadowRoot | FnCallSelector | (js.Function2[
        js.Array[Keyframe] | (/* where */ InsertPosition) | (/* node */ Node) | Null | PropertyIndexedKeyframes | String, 
        js.UndefOr[
          Boolean | Double | (/* element */ Element) | KeyframeAnimationOptions | Node | Null | (/* localName */ String)
        ], 
        Animation | Attr | Boolean | Element | Node | Null | String | Unit
      ]) | FnCallQualifiedName | FnCallNamespaceURILocalName | FnCallXY | (js.Function3[/* namespace */ String | Null, /* qualifiedName */ String, /* value */ String, Unit]) | (NodeList[ChildNode & Node]) | HTMLCollection[Any] | FnCallSelectors | Fn2 | HTMLSlotElement | CSSStyleDeclaration | DOMStringMap
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(property.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      String | Double | Boolean | HTMLElement | Element | EventTarget | ChildNode | ParentNode | (js.Function0[js.Array[String] | Boolean | DOMRect | DOMRectList | ElementInternals | Unit]) | Document | (js.Function1[
        js.UndefOr[
          (/* attr */ Attr) | Boolean | (/* pointerId */ Double) | (/* event */ Event) | FocusOptions | FullscreenOptions | GetAnimationsOptions | GetRootNodeOptions | (/* node */ Node) | Null | ScrollIntoViewOptions | (/* init */ ShadowRootInit) | (/* qualifiedName */ String)
        ], 
        js.Array[Animation] | Attr | Boolean | Double | HTMLCollectionOf[Element] | Node | Null | js.Promise[Unit] | ShadowRoot | String | Unit
      ]) | (js.ThisFunction1[
        (/* this */ DocumentAndElementEventHandlers) | (/* this */ Element) | (/* this */ GlobalEventHandlers), 
        (/* ev */ AnimationEvent) | (/* ev */ ClipboardEvent) | (/* ev */ DragEvent) | (/* ev */ Event) | (/* ev */ FocusEvent) | (/* ev */ FormDataEvent) | (/* ev */ KeyboardEvent) | (/* ev */ MouseEvent) | (/* ev */ PointerEvent) | (/* ev */ ProgressEvent) | (/* ev */ SecurityPolicyViolationEvent) | (/* ev */ SubmitEvent) | (/* ev */ TouchEvent) | (/* ev */ TransitionEvent) | (/* ev */ UIEvent) | (/* ev */ WheelEvent), 
        Any
      ]) | OnErrorEventHandler | FnCallTypeListenerOptions | Fn1 | NamedNodeMap | DOMTokenList | ShadowRoot | FnCallSelector | (js.Function2[
        js.Array[Keyframe] | (/* where */ InsertPosition) | (/* node */ Node) | Null | PropertyIndexedKeyframes | String, 
        js.UndefOr[
          Boolean | Double | (/* element */ Element) | KeyframeAnimationOptions | Node | Null | (/* localName */ String)
        ], 
        Animation | Attr | Boolean | Element | Node | Null | String | Unit
      ]) | FnCallQualifiedName | FnCallNamespaceURILocalName | FnCallXY | (js.Function3[/* namespace */ String | Null, /* qualifiedName */ String, /* value */ String, Unit]) | (NodeList[ChildNode & Node]) | HTMLCollection[Any] | FnCallSelectors | Fn2 | HTMLSlotElement | CSSStyleDeclaration | DOMStringMap
    ]
  ]]
}
