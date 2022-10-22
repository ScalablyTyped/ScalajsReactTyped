package typingsJapgolly.vueTestUtils.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.App
import typingsJapgolly.vueRuntimeCore.mod.ComponentInternalInstance
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueTestUtils.distConstantsDomEventsMod.DomEventNameWithModifier
import typingsJapgolly.vueTestUtils.distCreateDomEventMod.TriggerOptions
import typingsJapgolly.vueTestUtils.distDomWrapperMod.DOMWrapper
import typingsJapgolly.vueTestUtils.distInterfacesWrapperLikeMod.WrapperLike
import typingsJapgolly.vueTestUtils.vueTestUtilsBooleans.`false`
import typingsJapgolly.vueTestUtils.vueTestUtilsStrings.exists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@vue/test-utils.@vue/test-utils/dist/vueWrapper.VueWrapper<vue.vue.ComponentPublicInstance<{}, {}, {}, {}, {}, {}, {}, {}, false, @vue/runtime-core.@vue/runtime-core.ComponentOptionsBase<any, any, any, any, any, any, any, any, any, {}>>>, 'exists'> */
trait OmitVueWrapperComponentPu extends StObject {
  
  var __app: Any
  
  var __setProps: Any
  
  var attachNativeEventListener: Any
  
  def attributes(): StringDictionary[String]
  @JSName("attributes")
  var attributes_Original: js.Function0[StringDictionary[String]]
  
  def classes(): js.Array[String]
  @JSName("classes")
  var classes_Original: js.Function0[js.Array[String]]
  
  var componentVM: Any
  
  @JSName("constructor")
  var constructor_Original: js.Function3[
    /* app */ App[Any] | Null, 
    /* vm */ ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ], 
    /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]], 
    Any
  ]
  
  def element(): Element
  @JSName("element")
  var element_Original: js.Function0[Element]
  
  def emitted[T](): Record[String, js.Array[T]]
  @JSName("emitted")
  var emitted_Original: js.Function0[Record[String, js.Array[Any]]]
  
  def find[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): DOMWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
  ]
  
  def findAll[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): js.Array[
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
    ]
  ]
  
  def findAllComponents[T /* <: scala.Nothing */](selector: String): js.Array[WrapperLike]
  @JSName("findAllComponents")
  var findAllComponents_Original: js.Function1[/* selector */ String, js.Array[WrapperLike]]
  
  def findAllDOMElements(selector: String): js.Array[Element]
  @JSName("findAllDOMElements")
  var findAllDOMElements_Original: js.Function1[/* selector */ String, js.Array[Element]]
  
  @JSName("findAll")
  var findAll_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ]
  ]
  
  def findComponent[T /* <: scala.Nothing */](selector: String): WrapperLike
  @JSName("findComponent")
  var findComponent_Original: js.Function1[/* selector */ String, WrapperLike]
  
  @JSName("find")
  var find_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
    ]
  ]
  
  def get[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): Omit[
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
    ], 
    exists
  ]
  
  def getComponent[T /* <: scala.Nothing */](selector: String): Omitdefaultexists
  @JSName("getComponent")
  var getComponent_Original: js.Function1[/* selector */ String, Omitdefaultexists]
  
  def getCurrentComponent(): ComponentInternalInstance
  @JSName("getCurrentComponent")
  var getCurrentComponent_Original: js.Function0[ComponentInternalInstance]
  
  def getRootNodes(): js.Array[VueNodeNode]
  @JSName("getRootNodes")
  var getRootNodes_Original: js.Function0[js.Array[VueNodeNode]]
  
  @JSName("get")
  var get_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    Omit[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ], 
      exists
    ]
  ]
  
  def hasMultipleRoots(): Any
  @JSName("hasMultipleRoots")
  var hasMultipleRoots_Original: js.Function0[Any]
  
  def html(): String
  @JSName("html")
  var html_Original: js.Function0[String]
  
  def isDisabled(): Boolean
  @JSName("isDisabled")
  var isDisabled_Original: js.Function0[Boolean]
  
  def isVisible(): Boolean
  @JSName("isVisible")
  var isVisible_Original: js.Function0[Boolean]
  
  def parentElement(): Any
  @JSName("parentElement")
  var parentElement_Original: js.Function0[Any]
  
  def props(): StringDictionary[Any]
  @JSName("props")
  var props_Original: js.Function0[StringDictionary[Any]]
  
  var rootVM: Any
  
  def setData(data: Record[String, Any]): js.Promise[Unit]
  @JSName("setData")
  var setData_Original: js.Function1[/* data */ Record[String, Any], js.Promise[Unit]]
  
  def setProps(props: Record[String, Any]): js.Promise[Unit]
  @JSName("setProps")
  var setProps_Original: js.Function1[/* props */ Record[String, Any], js.Promise[Unit]]
  
  def setValue(value: Any): js.Promise[Unit]
  def setValue(value: Any, prop: String): js.Promise[Unit]
  @JSName("setValue")
  var setValue_Original: js.Function2[/* value */ Any, /* prop */ js.UndefOr[String], js.Promise[Unit]]
  
  def text(): String
  @JSName("text")
  var text_Original: js.Function0[String]
  
  def trigger(eventString: DomEventNameWithModifier): js.Promise[Unit]
  def trigger(eventString: DomEventNameWithModifier, options: TriggerOptions): js.Promise[Unit]
  @JSName("trigger")
  var trigger_Original: js.Function2[
    /* eventString */ DomEventNameWithModifier, 
    /* options */ js.UndefOr[TriggerOptions], 
    js.Promise[Unit]
  ]
  
  def unmount(): Unit
  @JSName("unmount")
  var unmount_Original: js.Function0[Unit]
  
  def vm(): ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
  ]
  @JSName("vm")
  var vm_Original: js.Function0[
    ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]
  
  var wrapperElement: VueNodeNode
}
object OmitVueWrapperComponentPu {
  
  inline def apply(
    __app: Any,
    __setProps: Any,
    attachNativeEventListener: Any,
    attributes: CallbackTo[StringDictionary[String]],
    classes: CallbackTo[js.Array[String]],
    componentVM: Any,
    constructor: (/* app */ App[Any] | Null, /* vm */ ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ], /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]]) => Any,
    element: CallbackTo[Element],
    emitted: CallbackTo[Record[String, js.Array[Any]]],
    find: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any => DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
    ],
    findAll: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any => js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ],
    findAllComponents: /* selector */ String => js.Array[WrapperLike],
    findAllDOMElements: /* selector */ String => js.Array[Element],
    findComponent: /* selector */ String => WrapperLike,
    get: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ], 
      exists
    ],
    getComponent: /* selector */ String => Omitdefaultexists,
    getCurrentComponent: CallbackTo[ComponentInternalInstance],
    getRootNodes: CallbackTo[js.Array[VueNodeNode]],
    hasMultipleRoots: CallbackTo[Any],
    html: CallbackTo[String],
    isDisabled: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    parentElement: CallbackTo[Any],
    props: CallbackTo[StringDictionary[Any]],
    rootVM: Any,
    setData: /* data */ Record[String, Any] => js.Promise[Unit],
    setProps: /* props */ Record[String, Any] => js.Promise[Unit],
    setValue: (/* value */ Any, /* prop */ js.UndefOr[String]) => js.Promise[Unit],
    text: CallbackTo[String],
    trigger: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit],
    unmount: Callback,
    vm: CallbackTo[
      ComponentPublicInstance[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        `false`, 
        ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
      ]
    ],
    wrapperElement: VueNodeNode
  ): OmitVueWrapperComponentPu = {
    val __obj = js.Dynamic.literal(__app = __app.asInstanceOf[js.Any], __setProps = __setProps.asInstanceOf[js.Any], attachNativeEventListener = attachNativeEventListener.asInstanceOf[js.Any], attributes = attributes.toJsFn, classes = classes.toJsFn, componentVM = componentVM.asInstanceOf[js.Any], constructor = js.Any.fromFunction3(constructor), element = element.toJsFn, emitted = emitted.toJsFn, find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), findAllComponents = js.Any.fromFunction1(findAllComponents), findAllDOMElements = js.Any.fromFunction1(findAllDOMElements), findComponent = js.Any.fromFunction1(findComponent), get = js.Any.fromFunction1(get), getComponent = js.Any.fromFunction1(getComponent), getCurrentComponent = getCurrentComponent.toJsFn, getRootNodes = getRootNodes.toJsFn, hasMultipleRoots = hasMultipleRoots.toJsFn, html = html.toJsFn, isDisabled = isDisabled.toJsFn, isVisible = isVisible.toJsFn, parentElement = parentElement.toJsFn, props = props.toJsFn, rootVM = rootVM.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), setProps = js.Any.fromFunction1(setProps), setValue = js.Any.fromFunction2(setValue), text = text.toJsFn, trigger = js.Any.fromFunction2(trigger), unmount = unmount.toJsFn, vm = vm.toJsFn, wrapperElement = wrapperElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitVueWrapperComponentPu]
  }
  
  extension [Self <: OmitVueWrapperComponentPu](x: Self) {
    
    inline def setAttachNativeEventListener(value: Any): Self = StObject.set(x, "attachNativeEventListener", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "attributes", value.toJsFn)
    
    inline def setClasses(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "classes", value.toJsFn)
    
    inline def setComponentVM(value: Any): Self = StObject.set(x, "componentVM", value.asInstanceOf[js.Any])
    
    inline def setConstructor(
      value: (/* app */ App[Any] | Null, /* vm */ ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ], /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]]) => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction3(value))
    
    inline def setElement(value: CallbackTo[Element]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setEmitted(value: CallbackTo[Record[String, js.Array[Any]]]): Self = StObject.set(x, "emitted", value.toJsFn)
    
    inline def setFind(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any => DOMWrapper[
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
        ]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindAll(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any => js.Array[
          DOMWrapper[
            /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
    
    inline def setFindAllComponents(value: /* selector */ String => js.Array[WrapperLike]): Self = StObject.set(x, "findAllComponents", js.Any.fromFunction1(value))
    
    inline def setFindAllDOMElements(value: /* selector */ String => js.Array[Element]): Self = StObject.set(x, "findAllDOMElements", js.Any.fromFunction1(value))
    
    inline def setFindComponent(value: /* selector */ String => WrapperLike): Self = StObject.set(x, "findComponent", js.Any.fromFunction1(value))
    
    inline def setGet(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.vueTestUtils.vueTestUtilsStrings.a, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.abbr, typingsJapgolly.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
          DOMWrapper[
            /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
          ], 
          exists
        ]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetComponent(value: /* selector */ String => Omitdefaultexists): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setGetCurrentComponent(value: CallbackTo[ComponentInternalInstance]): Self = StObject.set(x, "getCurrentComponent", value.toJsFn)
    
    inline def setGetRootNodes(value: CallbackTo[js.Array[VueNodeNode]]): Self = StObject.set(x, "getRootNodes", value.toJsFn)
    
    inline def setHasMultipleRoots(value: CallbackTo[Any]): Self = StObject.set(x, "hasMultipleRoots", value.toJsFn)
    
    inline def setHtml(value: CallbackTo[String]): Self = StObject.set(x, "html", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setParentElement(value: CallbackTo[Any]): Self = StObject.set(x, "parentElement", value.toJsFn)
    
    inline def setProps(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "props", value.toJsFn)
    
    inline def setRootVM(value: Any): Self = StObject.set(x, "rootVM", value.asInstanceOf[js.Any])
    
    inline def setSetData(value: /* data */ Record[String, Any] => js.Promise[Unit]): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetProps(value: /* props */ Record[String, Any] => js.Promise[Unit]): Self = StObject.set(x, "setProps", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: (/* value */ Any, /* prop */ js.UndefOr[String]) => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setTrigger(
      value: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit]
    ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    
    inline def setUnmount(value: Callback): Self = StObject.set(x, "unmount", value.toJsFn)
    
    inline def setVm(
      value: CallbackTo[
          ComponentPublicInstance[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            `false`, 
            ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
          ]
        ]
    ): Self = StObject.set(x, "vm", value.toJsFn)
    
    inline def setWrapperElement(value: VueNodeNode): Self = StObject.set(x, "wrapperElement", value.asInstanceOf[js.Any])
    
    inline def set__app(value: Any): Self = StObject.set(x, "__app", value.asInstanceOf[js.Any])
    
    inline def set__setProps(value: Any): Self = StObject.set(x, "__setProps", value.asInstanceOf[js.Any])
  }
}
