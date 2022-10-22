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
import typingsJapgolly.node.bufferMod.global.Buffer
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
import typingsJapgolly.wdioProtocols.buildTypesMod.ElementReference
import typingsJapgolly.webdriverio.anon.Fn1
import typingsJapgolly.webdriverio.anon.Fn2
import typingsJapgolly.webdriverio.anon.Fn3
import typingsJapgolly.webdriverio.anon.FnCallNamespaceURILocalName
import typingsJapgolly.webdriverio.anon.FnCallQualifiedName
import typingsJapgolly.webdriverio.anon.FnCallSelector
import typingsJapgolly.webdriverio.anon.FnCallSelectors
import typingsJapgolly.webdriverio.anon.FnCallThisProp
import typingsJapgolly.webdriverio.anon.FnCallTypeListenerOptions
import typingsJapgolly.webdriverio.anon.FnCallXY
import typingsJapgolly.webdriverio.anon.PartialWaitUntilOptions
import typingsJapgolly.webdriverio.buildCommandsElementAddValueMod.CommandOptions
import typingsJapgolly.webdriverio.buildCommandsElementAddValueMod.Value
import typingsJapgolly.webdriverio.buildCommandsElementDragAndDropMod.DragAndDropOptions
import typingsJapgolly.webdriverio.buildCommandsElementDragAndDropMod.ElementCoordinates
import typingsJapgolly.webdriverio.buildCommandsElementGetLocationMod.Location
import typingsJapgolly.webdriverio.buildCommandsElementGetSizeMod.Size
import typingsJapgolly.webdriverio.buildCommandsElementMoveToMod.MoveToOptions
import typingsJapgolly.webdriverio.buildTypesMod.ChainablePromiseElement
import typingsJapgolly.webdriverio.buildTypesMod.ClickOptions
import typingsJapgolly.webdriverio.buildTypesMod.ElementArray
import typingsJapgolly.webdriverio.buildTypesMod.ParsedCSSValue
import typingsJapgolly.webdriverio.buildTypesMod.ReactSelectorOptions
import typingsJapgolly.webdriverio.buildTypesMod.Selector
import typingsJapgolly.webdriverio.buildTypesMod.TouchActions
import typingsJapgolly.webdriverio.buildTypesMod.WaitForOptions
import typingsJapgolly.webdriverio.webdriverioBooleans.`true`
import typingsJapgolly.webdriverio.webdriverioStrings.height
import typingsJapgolly.webdriverio.webdriverioStrings.width
import typingsJapgolly.webdriverio.webdriverioStrings.x
import typingsJapgolly.webdriverio.webdriverioStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementMod {
  
  object default {
    
    @JSImport("webdriverio/build/commands/element", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriverio/build/commands/element", "default.$$")
    @js.native
    def $: js.ThisFunction1[
        /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
        /* selector */ Selector | (js.Array[Element | ElementReference]), 
        js.Promise[ElementArray]
      ] = js.native
    
    inline def $(selector: js.Array[Element | ElementReference]): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def $(selector: Selector): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def $_=(
      x: js.ThisFunction1[
          /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
          /* selector */ Selector | (js.Array[Element | ElementReference]), 
          js.Promise[ElementArray]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$")(x.asInstanceOf[js.Any])
    @JSImport("webdriverio/build/commands/element", "default.$")
    @js.native
    def _empty: js.ThisFunction1[
        /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
        /* selector */ Selector, 
        js.Promise[Element]
      ] = js.native
    
    inline def _empty(selector: Selector): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
    inline def _empty_=(
      x: js.ThisFunction1[
          /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
          /* selector */ Selector, 
          js.Promise[Element]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.addValue")
    @js.native
    def addValue: js.ThisFunction2[
        /* this */ Element, 
        /* value */ Value | js.Array[Value], 
        /* hasTranslateToUnicode */ js.UndefOr[CommandOptions], 
        js.Promise[Unit]
      ] = js.native
    inline def addValue(value: js.Array[Value]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def addValue(value: js.Array[Value], hasTranslateToUnicode: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addValue")(value.asInstanceOf[js.Any], hasTranslateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def addValue(value: Value): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def addValue(value: Value, hasTranslateToUnicode: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addValue")(value.asInstanceOf[js.Any], hasTranslateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def addValue_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* value */ Value | js.Array[Value], 
          /* hasTranslateToUnicode */ js.UndefOr[CommandOptions], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addValue")(x.asInstanceOf[js.Any])
    
    inline def clearValue(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearValue")().asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/element", "default.clearValue")
    @js.native
    def clearValue_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Unit]] = js.native
    
    inline def clearValue_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearValue")(x.asInstanceOf[js.Any])
    
    inline def click(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")().asInstanceOf[js.Promise[Unit]]
    inline def click(options: ClickOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/element", "default.click")
    @js.native
    def click_Fdefault: js.ThisFunction1[/* this */ Element, /* options */ js.UndefOr[ClickOptions], js.Promise[Unit]] = js.native
    
    inline def click_Fdefault_=(x: js.ThisFunction1[/* this */ Element, /* options */ js.UndefOr[ClickOptions], js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("click")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.custom$")
    @js.native
    def custom: js.ThisFunction2[/* this */ Element, /* strategyName */ String, /* repeated */ Any, js.Promise[Element]] = js.native
    
    inline def custom(strategyName: String, strategyArguments: Any*): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom$")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[Element]]
    
    @JSImport("webdriverio/build/commands/element", "default.custom$$")
    @js.native
    def custom$: js.ThisFunction2[
        /* this */ Element, 
        /* strategyName */ String, 
        /* repeated */ Any, 
        js.Promise[ElementArray]
      ] = js.native
    
    inline def custom$(strategyName: String, strategyArguments: Any*): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom$$")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[ElementArray]]
    inline def custom$_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* strategyName */ String, 
          /* repeated */ Any, 
          js.Promise[ElementArray]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom$$")(x.asInstanceOf[js.Any])
    
    inline def custom_=(
      x: js.ThisFunction2[/* this */ Element, /* strategyName */ String, /* repeated */ Any, js.Promise[Element]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom$")(x.asInstanceOf[js.Any])
    
    inline def doubleClick(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleClick")().asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/element", "default.doubleClick")
    @js.native
    def doubleClick_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Unit]] = js.native
    
    inline def doubleClick_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.dragAndDrop")
    @js.native
    def dragAndDrop: js.ThisFunction2[
        /* this */ Element, 
        /* target */ Element | ElementCoordinates, 
        /* hasDuration */ js.UndefOr[DragAndDropOptions], 
        js.Promise[Unit]
      ] = js.native
    inline def dragAndDrop(target: Element): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dragAndDrop")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def dragAndDrop(target: Element, hasDuration: DragAndDropOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragAndDrop")(target.asInstanceOf[js.Any], hasDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def dragAndDrop(target: ElementCoordinates): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dragAndDrop")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def dragAndDrop(target: ElementCoordinates, hasDuration: DragAndDropOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragAndDrop")(target.asInstanceOf[js.Any], hasDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def dragAndDrop_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* target */ Element | ElementCoordinates, 
          /* hasDuration */ js.UndefOr[DragAndDropOptions], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.getAttribute")
    @js.native
    def getAttribute: js.ThisFunction1[/* this */ Element, /* attributeName */ String, js.Promise[String]] = js.native
    inline def getAttribute(attributeName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(attributeName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def getAttribute_=(x: js.ThisFunction1[/* this */ Element, /* attributeName */ String, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.getCSSProperty")
    @js.native
    def getCSSProperty: js.ThisFunction1[/* this */ Element, /* cssProperty */ String, js.Promise[ParsedCSSValue]] = js.native
    inline def getCSSProperty(cssProperty: String): js.Promise[ParsedCSSValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSSProperty")(cssProperty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedCSSValue]]
    inline def getCSSProperty_=(x: js.ThisFunction1[/* this */ Element, /* cssProperty */ String, js.Promise[ParsedCSSValue]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getCSSProperty")(x.asInstanceOf[js.Any])
    
    inline def getComputedLabel(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedLabel")().asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/element", "default.getComputedLabel")
    @js.native
    def getComputedLabel_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[String]] = js.native
    
    inline def getComputedLabel_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getComputedLabel")(x.asInstanceOf[js.Any])
    
    inline def getComputedRole(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedRole")().asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/element", "default.getComputedRole")
    @js.native
    def getComputedRole_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[String]] = js.native
    
    inline def getComputedRole_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getComputedRole")(x.asInstanceOf[js.Any])
    
    inline def getHTML(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHTML")().asInstanceOf[js.Promise[String]]
    inline def getHTML(includeSelectorTag: Boolean): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHTML")(includeSelectorTag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/element", "default.getHTML")
    @js.native
    def getHTML_Fdefault: js.ThisFunction1[/* this */ Element, /* includeSelectorTag */ js.UndefOr[Boolean], js.Promise[String]] = js.native
    
    inline def getHTML_Fdefault_=(
      x: js.ThisFunction1[/* this */ Element, /* includeSelectorTag */ js.UndefOr[Boolean], js.Promise[String]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getHTML")(x.asInstanceOf[js.Any])
    
    inline def getLocation(): js.Promise[Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")().asInstanceOf[js.Promise[Location]]
    inline def getLocation(prop: x | y): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    @JSImport("webdriverio/build/commands/element", "default.getLocation")
    @js.native
    def getLocation_Fdefault: FnCallThisProp = js.native
    
    inline def getLocation_Fdefault_=(x: FnCallThisProp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLocation")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.getProperty")
    @js.native
    def getProperty: js.ThisFunction1[
        /* this */ Element, 
        /* property */ String, 
        js.Promise[
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
        ]
      ] = js.native
    inline def getProperty(property: String): js.Promise[
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
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperty")(property.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
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
    inline def getProperty_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* property */ String, 
          js.Promise[
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
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getProperty")(x.asInstanceOf[js.Any])
    
    inline def getSize(): js.Promise[Size] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[js.Promise[Size]]
    inline def getSize(prop: /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ x | y | width | height): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    @JSImport("webdriverio/build/commands/element", "default.getSize")
    @js.native
    def getSize_Fdefault: Fn3 = js.native
    
    inline def getSize_Fdefault_=(x: Fn3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSize")(x.asInstanceOf[js.Any])
    
    inline def getTagName(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagName")().asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/element", "default.getTagName")
    @js.native
    def getTagName_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[String]] = js.native
    
    inline def getTagName_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTagName")(x.asInstanceOf[js.Any])
    
    inline def getText(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")().asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/element", "default.getText")
    @js.native
    def getText_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[String]] = js.native
    
    inline def getText_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getText")(x.asInstanceOf[js.Any])
    
    inline def getValue(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")().asInstanceOf[js.Promise[String]]
    @JSImport("webdriverio/build/commands/element", "default.getValue")
    @js.native
    def getValue_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[String]] = js.native
    
    inline def getValue_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getValue")(x.asInstanceOf[js.Any])
    
    inline def isClickable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isClickable")().asInstanceOf[js.Promise[Boolean]]
    @JSImport("webdriverio/build/commands/element", "default.isClickable")
    @js.native
    def isClickable_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isClickable_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClickable")(x.asInstanceOf[js.Any])
    
    inline def isDisplayed(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayed")().asInstanceOf[js.Promise[Boolean]]
    
    inline def isDisplayedInViewport(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayedInViewport")().asInstanceOf[js.Promise[Boolean]]
    @JSImport("webdriverio/build/commands/element", "default.isDisplayedInViewport")
    @js.native
    def isDisplayedInViewport_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isDisplayedInViewport_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDisplayedInViewport")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.isDisplayed")
    @js.native
    def isDisplayed_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isDisplayed_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDisplayed")(x.asInstanceOf[js.Any])
    
    inline def isEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")().asInstanceOf[js.Promise[Boolean]]
    @JSImport("webdriverio/build/commands/element", "default.isEnabled")
    @js.native
    def isEnabled_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isEnabled_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.isEqual")
    @js.native
    def isEqual: js.ThisFunction1[/* this */ Element, /* el */ Element, js.Promise[Boolean]] = js.native
    inline def isEqual(el: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def isEqual_=(x: js.ThisFunction1[/* this */ Element, /* el */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(x.asInstanceOf[js.Any])
    
    inline def isExisting(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isExisting")().asInstanceOf[js.Promise[Boolean]]
    @JSImport("webdriverio/build/commands/element", "default.isExisting")
    @js.native
    def isExisting_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isExisting_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExisting")(x.asInstanceOf[js.Any])
    
    inline def isFocused(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")().asInstanceOf[js.Promise[Boolean]]
    @JSImport("webdriverio/build/commands/element", "default.isFocused")
    @js.native
    def isFocused_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isFocused_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(x.asInstanceOf[js.Any])
    
    inline def isSelected(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelected")().asInstanceOf[js.Promise[Boolean]]
    @JSImport("webdriverio/build/commands/element", "default.isSelected")
    @js.native
    def isSelected_Fdefault: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]] = js.native
    
    inline def isSelected_Fdefault_=(x: js.ThisFunction0[/* this */ Element, js.Promise[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    inline def moveTo(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveTo")().asInstanceOf[js.Promise[Unit]]
    inline def moveTo(hasXOffsetYOffset: MoveToOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveTo")(hasXOffsetYOffset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/element", "default.moveTo")
    @js.native
    def moveTo_Fdefault: js.ThisFunction1[
        /* this */ Element, 
        /* hasXOffsetYOffset */ js.UndefOr[MoveToOptions], 
        js.Promise[Unit]
      ] = js.native
    
    inline def moveTo_Fdefault_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* hasXOffsetYOffset */ js.UndefOr[MoveToOptions], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(x.asInstanceOf[js.Any])
    
    inline def nextElement(): ChainablePromiseElement[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextElement")().asInstanceOf[ChainablePromiseElement[Element]]
    @JSImport("webdriverio/build/commands/element", "default.nextElement")
    @js.native
    def nextElement_Fdefault: js.ThisFunction0[/* this */ Element, ChainablePromiseElement[Element]] = js.native
    
    inline def nextElement_Fdefault_=(x: js.ThisFunction0[/* this */ Element, ChainablePromiseElement[Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextElement")(x.asInstanceOf[js.Any])
    
    inline def parentElement(): ChainablePromiseElement[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parentElement")().asInstanceOf[ChainablePromiseElement[Element]]
    @JSImport("webdriverio/build/commands/element", "default.parentElement")
    @js.native
    def parentElement_Fdefault: js.ThisFunction0[/* this */ Element, ChainablePromiseElement[Element]] = js.native
    
    inline def parentElement_Fdefault_=(x: js.ThisFunction0[/* this */ Element, ChainablePromiseElement[Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentElement")(x.asInstanceOf[js.Any])
    
    inline def previousElement(): ChainablePromiseElement[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("previousElement")().asInstanceOf[ChainablePromiseElement[Element]]
    @JSImport("webdriverio/build/commands/element", "default.previousElement")
    @js.native
    def previousElement_Fdefault: js.ThisFunction0[/* this */ Element, ChainablePromiseElement[Element]] = js.native
    
    inline def previousElement_Fdefault_=(x: js.ThisFunction0[/* this */ Element, ChainablePromiseElement[Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("previousElement")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.react$")
    @js.native
    def react: js.ThisFunction2[
        /* this */ Element, 
        /* selector */ String, 
        /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
        js.Promise[Element]
      ] = js.native
    
    inline def react(selector: String): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("react$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
    inline def react(selector: String, hasPropsState: ReactSelectorOptions): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("react$")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
    
    @JSImport("webdriverio/build/commands/element", "default.react$$")
    @js.native
    def react$: js.ThisFunction2[
        /* this */ Element, 
        /* selector */ String, 
        /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
        js.Promise[ElementArray]
      ] = js.native
    
    inline def react$(selector: String): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("react$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def react$(selector: String, hasPropsState: ReactSelectorOptions): js.Promise[ElementArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("react$$")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ElementArray]]
    inline def react$_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* selector */ String, 
          /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
          js.Promise[ElementArray]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react$$")(x.asInstanceOf[js.Any])
    
    inline def react_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* selector */ String, 
          /* hasPropsState */ js.UndefOr[ReactSelectorOptions], 
          js.Promise[Element]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("react$")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.saveScreenshot")
    @js.native
    def saveScreenshot: js.ThisFunction1[/* this */ Element, /* filepath */ String, js.Promise[Buffer]] = js.native
    inline def saveScreenshot(filepath: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveScreenshot")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def saveScreenshot_=(x: js.ThisFunction1[/* this */ Element, /* filepath */ String, js.Promise[Buffer]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("saveScreenshot")(x.asInstanceOf[js.Any])
    
    inline def scrollIntoView(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")().asInstanceOf[js.Promise[Unit]]
    inline def scrollIntoView(scrollIntoViewOptions: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollIntoViewOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def scrollIntoView(scrollIntoViewOptions: ScrollIntoViewOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollIntoViewOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @JSImport("webdriverio/build/commands/element", "default.scrollIntoView")
    @js.native
    def scrollIntoView_Fdefault: js.ThisFunction1[
        /* this */ Element, 
        /* scrollIntoViewOptions */ js.UndefOr[Boolean | ScrollIntoViewOptions], 
        js.Promise[Unit]
      ] = js.native
    
    inline def scrollIntoView_Fdefault_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* scrollIntoViewOptions */ js.UndefOr[Boolean | ScrollIntoViewOptions], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollIntoView")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.selectByAttribute")
    @js.native
    def selectByAttribute: js.ThisFunction2[
        /* this */ Element, 
        /* attribute */ String, 
        /* value */ String | Double, 
        js.Promise[Unit]
      ] = js.native
    inline def selectByAttribute(attribute: String, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectByAttribute")(attribute.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectByAttribute(attribute: String, value: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectByAttribute")(attribute.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def selectByAttribute_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* attribute */ String, 
          /* value */ String | Double, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectByAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.selectByIndex")
    @js.native
    def selectByIndex: js.ThisFunction1[/* this */ Element, /* index */ Double, js.Promise[Unit]] = js.native
    inline def selectByIndex(index: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectByIndex")(index.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def selectByIndex_=(x: js.ThisFunction1[/* this */ Element, /* index */ Double, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectByIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.selectByVisibleText")
    @js.native
    def selectByVisibleText: js.ThisFunction1[/* this */ Element, /* text */ String | Double, js.Promise[Unit]] = js.native
    inline def selectByVisibleText(text: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectByVisibleText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def selectByVisibleText(text: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectByVisibleText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def selectByVisibleText_=(x: js.ThisFunction1[/* this */ Element, /* text */ String | Double, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectByVisibleText")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.setValue")
    @js.native
    def setValue: js.ThisFunction2[
        /* this */ Element, 
        /* value */ Value | js.Array[Value], 
        /* hasTranslateToUnicode */ js.UndefOr[CommandOptions], 
        js.Promise[Unit]
      ] = js.native
    inline def setValue(value: js.Array[Value]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setValue(value: js.Array[Value], hasTranslateToUnicode: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(value.asInstanceOf[js.Any], hasTranslateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def setValue(value: Value): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setValue(value: Value, hasTranslateToUnicode: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(value.asInstanceOf[js.Any], hasTranslateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def setValue_=(
      x: js.ThisFunction2[
          /* this */ Element, 
          /* value */ Value | js.Array[Value], 
          /* hasTranslateToUnicode */ js.UndefOr[CommandOptions], 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setValue")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.shadow$")
    @js.native
    def shadow: js.ThisFunction1[/* this */ Element, /* selector */ String, js.Promise[Element]] = js.native
    
    inline def shadow(selector: String): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
    
    @JSImport("webdriverio/build/commands/element", "default.shadow$$")
    @js.native
    def shadow$: js.ThisFunction1[/* this */ Element, /* selector */ String, js.Promise[ElementArray]] = js.native
    
    inline def shadow$(selector: String): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow$$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementArray]]
    inline def shadow$_=(x: js.ThisFunction1[/* this */ Element, /* selector */ String, js.Promise[ElementArray]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadow$$")(x.asInstanceOf[js.Any])
    
    inline def shadow_=(x: js.ThisFunction1[/* this */ Element, /* selector */ String, js.Promise[Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadow$")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.touchAction")
    @js.native
    def touchAction: js.ThisFunction1[/* this */ Element, /* actions */ TouchActions, js.Promise[Unit]] = js.native
    inline def touchAction(actions: TouchActions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("touchAction")(actions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def touchAction_=(x: js.ThisFunction1[/* this */ Element, /* actions */ TouchActions, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(x.asInstanceOf[js.Any])
    
    inline def waitForClickable(): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForClickable")().asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitForClickable(hasTimeoutIntervalReverseTimeoutMsg: WaitForOptions): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForClickable")(hasTimeoutIntervalReverseTimeoutMsg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
    @JSImport("webdriverio/build/commands/element", "default.waitForClickable")
    @js.native
    def waitForClickable_Fdefault: js.ThisFunction1[
        /* this */ Element, 
        /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
        js.Promise[`true` | Unit]
      ] = js.native
    
    inline def waitForClickable_Fdefault_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
          js.Promise[`true` | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForClickable")(x.asInstanceOf[js.Any])
    
    inline def waitForDisplayed(): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDisplayed")().asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitForDisplayed(hasTimeoutIntervalReverseTimeoutMsg: WaitForOptions): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDisplayed")(hasTimeoutIntervalReverseTimeoutMsg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
    @JSImport("webdriverio/build/commands/element", "default.waitForDisplayed")
    @js.native
    def waitForDisplayed_Fdefault: js.ThisFunction1[
        /* this */ Element, 
        /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
        js.Promise[`true` | Unit]
      ] = js.native
    
    inline def waitForDisplayed_Fdefault_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
          js.Promise[`true` | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForDisplayed")(x.asInstanceOf[js.Any])
    
    inline def waitForEnabled(): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForEnabled")().asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitForEnabled(hasTimeoutIntervalReverseTimeoutMsg: WaitForOptions): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForEnabled")(hasTimeoutIntervalReverseTimeoutMsg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
    @JSImport("webdriverio/build/commands/element", "default.waitForEnabled")
    @js.native
    def waitForEnabled_Fdefault: js.ThisFunction1[
        /* this */ Element, 
        /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
        js.Promise[`true` | Unit]
      ] = js.native
    
    inline def waitForEnabled_Fdefault_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
          js.Promise[`true` | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForEnabled")(x.asInstanceOf[js.Any])
    
    inline def waitForExist(): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForExist")().asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitForExist(hasTimeoutIntervalReverseTimeoutMsg: WaitForOptions): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForExist")(hasTimeoutIntervalReverseTimeoutMsg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
    @JSImport("webdriverio/build/commands/element", "default.waitForExist")
    @js.native
    def waitForExist_Fdefault: js.ThisFunction1[
        /* this */ Element, 
        /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
        js.Promise[`true` | Unit]
      ] = js.native
    
    inline def waitForExist_Fdefault_=(
      x: js.ThisFunction1[
          /* this */ Element, 
          /* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[WaitForOptions], 
          js.Promise[`true` | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForExist")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriverio/build/commands/element", "default.waitUntil")
    @js.native
    def waitUntil: js.ThisFunction2[
        /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
        /* condition */ js.Function0[Boolean | js.Promise[Boolean]], 
        /* hasTimeoutIntervalTimeoutMsg */ js.UndefOr[PartialWaitUntilOptions], 
        js.Promise[`true` | Unit]
      ] = js.native
    inline def waitUntil(condition: js.Function0[Boolean | js.Promise[Boolean]]): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitUntil(
      condition: js.Function0[Boolean | js.Promise[Boolean]],
      hasTimeoutIntervalTimeoutMsg: PartialWaitUntilOptions
    ): js.Promise[`true` | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(condition.asInstanceOf[js.Any], hasTimeoutIntervalTimeoutMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`true` | Unit]]
    inline def waitUntil_=(
      x: js.ThisFunction2[
          /* this */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) | Element, 
          /* condition */ js.Function0[Boolean | js.Promise[Boolean]], 
          /* hasTimeoutIntervalTimeoutMsg */ js.UndefOr[PartialWaitUntilOptions], 
          js.Promise[`true` | Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitUntil")(x.asInstanceOf[js.Any])
  }
}
