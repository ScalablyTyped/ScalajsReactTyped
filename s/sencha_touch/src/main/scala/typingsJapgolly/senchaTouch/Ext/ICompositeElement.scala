package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeElement
  extends typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite {
  /** [Method] fixes scope with flyweight
  		* @param eventName Object
  		* @param handler Object
  		* @param scope Object
  		* @param opt Object
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("addListener")
  var addListener_ICompositeElement: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Adds elements to this Composite object
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
  		* @param root HTMLElement/String The root element of the query or id of the root.
  		* @returns Ext.dom.CompositeElementLite This Composite object.
  		*/
  @JSName("add")
  var add_ICompositeElement: js.UndefOr[
    js.Function2[
      /* els */ js.UndefOr[js.Any], 
      /* root */ js.UndefOr[js.Any], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Calls the passed function for each element in this composite
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("each")
  var each_ICompositeElement: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Clears this Composite and adds the elements passed
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("fill")
  var fill_ICompositeElement: js.UndefOr[
    js.Function1[
      /* els */ js.UndefOr[js.Any], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Filters this composite to only elements that match the passed selector
  		* @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("filter")
  var filter_ICompositeElement: js.UndefOr[
    js.Function1[
      /* selector */ js.UndefOr[js.Any], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean true to also remove the element from the document
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("removeElement")
  var removeElement_ICompositeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Replaces the specified element with the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
  		* @param replacement String/Ext.Element The id of an element or the Element itself.
  		* @param domReplace Boolean true to remove and replace the element in the document too.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("replaceElement")
  var replaceElement_ICompositeElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
  		* @param selector String/HTMLElement[] The CSS selector or an array of elements
  		* @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
  		* @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
  		*/
  @JSName("select")
  var select_ICompositeElement: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* composite */ js.UndefOr[Boolean], 
      typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite
    ]
  ] = js.undefined
}

object ICompositeElement {
  @scala.inline
  def apply(
    DISPLAY: Int | Double = null,
    OFFSETS: Int | Double = null,
    VISIBILITY: Int | Double = null,
    add: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    addCls: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: /* element */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    appendTo: /* el */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    child: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    clear: js.UndefOr[Callback] = js.undefined,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    contains: /* element */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[HTMLElement], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    cssTranslate: js.UndefOr[Callback] = js.undefined,
    defaultUnit: java.lang.String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dom: HTMLElement = null,
    down: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    elements: Array = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Callback = null,
    extend: java.lang.String = null,
    fill: /* els */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    filter: /* selector */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    findParent: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    findParentNode: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    first: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getAlignToXY: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    getAnchorXY: (/* anchor */ js.UndefOr[java.lang.String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getAttribute: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => CallbackTo[java.lang.String] = null,
    getBorderWidth: /* side */ js.UndefOr[java.lang.String] => CallbackTo[Double] = null,
    getBottom: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getBox: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getBubbleEvents: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getHTML: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getHeight: /* contentHeight */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getHtml: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getId: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMargin: /* sides */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getOffsetsTo: /* element */ js.UndefOr[js.Any] => CallbackTo[Array] = null,
    getOuterHeight: js.UndefOr[Callback] = js.undefined,
    getOuterWidth: js.UndefOr[Callback] = js.undefined,
    getPadding: /* side */ js.UndefOr[java.lang.String] => CallbackTo[Double] = null,
    getPageBox: /* asRegion */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getRight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollParent: js.UndefOr[Callback] = js.undefined,
    getSize: /* contentSize */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getStyle: /* prop */ js.UndefOr[java.lang.String] => CallbackTo[java.lang.String] = null,
    getTop: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getValue: /* asNumber */ js.UndefOr[Boolean] => CallbackTo[js.Any] = null,
    getViewSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getWidth: /* contentWidth */ js.UndefOr[Boolean] => CallbackTo[Double] = null,
    getX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hasCls: /* name */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    hide: js.UndefOr[Callback] = js.undefined,
    id: java.lang.String = null,
    indexOf: /* el */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    insertFirst: /* element */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    insertHtml: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    is: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    isDescendent: js.UndefOr[Callback] = js.undefined,
    isStyle: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => CallbackTo[Boolean] = null,
    isTransparent: /* prop */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    item: /* index */ js.UndefOr[Double] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    last: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    listeners: js.Any = null,
    mask: js.UndefOr[Callback] = js.undefined,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    next: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    parent: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    platformConfig: js.Any = null,
    prev: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    purgeAllListeners: js.UndefOr[Callback] = js.undefined,
    query: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[Array] = null,
    radioCls: /* className */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => CallbackTo[IObservable] = null,
    remove: js.UndefOr[Callback] = js.undefined,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeAllListeners: js.UndefOr[Callback] = js.undefined,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    removeCls: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    repaint: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement]] = js.undefined,
    replace: /* element */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    replaceCls: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Callback = null,
    select: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.ICompositeElementLite] = null,
    self: IClass = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => CallbackTo[java.lang.String] = null,
    set: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setBottom: /* bottom */ js.UndefOr[java.lang.String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setBox: /* box */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Callback = null,
    setCls: /* className */ js.UndefOr[js.Any] => Callback = null,
    setHTML: /* html */ js.UndefOr[java.lang.String] => Callback = null,
    setHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setHtml: /* html */ js.UndefOr[java.lang.String] => Callback = null,
    setLeft: /* left */ js.UndefOr[java.lang.String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Callback = null,
    setMaxHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setMaxWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setMinHeight: /* height */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setMinWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setRight: /* right */ js.UndefOr[java.lang.String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setTop: /* top */ js.UndefOr[java.lang.String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setTopLeft: js.UndefOr[Callback] = js.undefined,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setVisible: /* visible */ js.UndefOr[Boolean] => CallbackTo[IElement] = null,
    setWidth: /* width */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setX: /* x */ js.UndefOr[Double] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setXY: /* pos */ js.UndefOr[Array] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    setY: /* y */ js.UndefOr[Double] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    show: js.UndefOr[Callback] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.UndefOr[Callback] = js.undefined,
    toggleCls: /* className */ js.UndefOr[java.lang.String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.dom.IElement] = null,
    translatePoints: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Callback = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    unmask: js.UndefOr[Callback] = js.undefined,
    up: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    update: /* html */ js.UndefOr[java.lang.String] => Callback = null,
    uses: Array = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null
  ): ICompositeElement = {
    val __obj = js.Dynamic.literal()
    if (DISPLAY != null) __obj.updateDynamic("DISPLAY")(DISPLAY.asInstanceOf[js.Any])
    if (OFFSETS != null) __obj.updateDynamic("OFFSETS")(OFFSETS.asInstanceOf[js.Any])
    if (VISIBILITY != null) __obj.updateDynamic("VISIBILITY")(VISIBILITY.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2((t0: /* els */ js.UndefOr[js.Any], t1: /* root */ js.UndefOr[js.Any]) => add(t0, t1).runNow()))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addAfterListener(t0, t1, t2, t3).runNow()))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addBeforeListener(t0, t1, t2, t3).runNow()))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3((t0: /* names */ js.UndefOr[java.lang.String], t1: /* prefix */ js.UndefOr[java.lang.String], t2: /* suffix */ js.UndefOr[java.lang.String]) => addCls(t0, t1, t2).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* handler */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* opt */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => appendChild(t0).runNow()))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => appendTo(t0).runNow()))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1((t0: /* styles */ js.UndefOr[js.Any]) => applyStyles(t0).runNow()))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => child(t0, t1).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3((t0: /* config */ js.UndefOr[js.Any], t1: /* insertBefore */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => createChild(t0, t1, t2).runNow()))
    cssTranslate.foreach(p => __obj.updateDynamic("cssTranslate")(p.toJsFn))
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => down(t0, t1).runNow()))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1((t0: /* els */ js.UndefOr[js.Any]) => fill(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[js.Any]) => filter(t0).runNow()))
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3((t0: /* simpleSelector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParent(t0, t1, t2).runNow()))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3((t0: /* simpleSelector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => findParentNode(t0, t1, t2).runNow()))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => fireAction(t0, t1, t2, t3).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => first(t0, t1).runNow()))
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(js.Any.fromFunction3((t0: /* element */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[java.lang.String], t2: /* offsets */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => getAlignToXY(t0, t1, t2).runNow()))
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(js.Any.fromFunction3((t0: /* anchor */ js.UndefOr[java.lang.String], t1: /* local */ js.UndefOr[scala.Boolean], t2: /* size */ js.UndefOr[js.Any]) => getAnchorXY(t0, t1, t2).runNow()))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: /* name */ js.UndefOr[java.lang.String], t1: /* namespace */ js.UndefOr[java.lang.String]) => getAttribute(t0, t1).runNow()))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getBorderWidth(t0).runNow()))
    getBottom.foreach(p => __obj.updateDynamic("getBottom")(p.toJsFn))
    if (getBox != null) __obj.updateDynamic("getBox")(js.Any.fromFunction2((t0: /* contentBox */ js.UndefOr[scala.Boolean], t1: /* local */ js.UndefOr[scala.Boolean]) => getBox(t0, t1).runNow()))
    getBubbleEvents.foreach(p => __obj.updateDynamic("getBubbleEvents")(p.toJsFn))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getHTML.foreach(p => __obj.updateDynamic("getHTML")(p.toJsFn))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1((t0: /* contentHeight */ js.UndefOr[scala.Boolean]) => getHeight(t0).runNow()))
    getHtml.foreach(p => __obj.updateDynamic("getHtml")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLeft.foreach(p => __obj.updateDynamic("getLeft")(p.toJsFn))
    getListeners.foreach(p => __obj.updateDynamic("getListeners")(p.toJsFn))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1((t0: /* sides */ js.UndefOr[java.lang.String]) => getMargin(t0).runNow()))
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => getOffsetsTo(t0).runNow()))
    getOuterHeight.foreach(p => __obj.updateDynamic("getOuterHeight")(p.toJsFn))
    getOuterWidth.foreach(p => __obj.updateDynamic("getOuterWidth")(p.toJsFn))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1((t0: /* side */ js.UndefOr[java.lang.String]) => getPadding(t0).runNow()))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1((t0: /* asRegion */ js.UndefOr[scala.Boolean]) => getPageBox(t0).runNow()))
    getRight.foreach(p => __obj.updateDynamic("getRight")(p.toJsFn))
    getScrollParent.foreach(p => __obj.updateDynamic("getScrollParent")(p.toJsFn))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1((t0: /* contentSize */ js.UndefOr[scala.Boolean]) => getSize(t0).runNow()))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => getStyle(t0).runNow()))
    getTop.foreach(p => __obj.updateDynamic("getTop")(p.toJsFn))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: /* asNumber */ js.UndefOr[scala.Boolean]) => getValue(t0).runNow()))
    getViewSize.foreach(p => __obj.updateDynamic("getViewSize")(p.toJsFn))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1((t0: /* contentWidth */ js.UndefOr[scala.Boolean]) => getWidth(t0).runNow()))
    getX.foreach(p => __obj.updateDynamic("getX")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getY.foreach(p => __obj.updateDynamic("getY")(p.toJsFn))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => hasCls(t0).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertAfter(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => insertBefore(t0).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => insertFirst(t0).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3((t0: /* where */ js.UndefOr[java.lang.String], t1: /* html */ js.UndefOr[java.lang.String], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => insertHtml(t0, t1, t2).runNow()))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* where */ js.UndefOr[java.lang.String], t2: /* returnDom */ js.UndefOr[scala.Boolean]) => insertSibling(t0, t1, t2).runNow()))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    isDescendent.foreach(p => __obj.updateDynamic("isDescendent")(p.toJsFn))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2((t0: /* style */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[java.lang.String]) => isStyle(t0, t1).runNow()))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => isTransparent(t0).runNow()))
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => item(t0).runNow()))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => last(t0, t1).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    mask.foreach(p => __obj.updateDynamic("mask")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => next(t0, t1).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => on(t0, t1, t2, t3, t4).runNow()))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onAfter(t0, t1, t2, t3).runNow()))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => onBefore(t0, t1, t2, t3).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => parent(t0, t1).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* returnDom */ js.UndefOr[scala.Boolean]) => prev(t0, t1).runNow()))
    purgeAllListeners.foreach(p => __obj.updateDynamic("purgeAllListeners")(p.toJsFn))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => radioCls(t0).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2((t0: /* object */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[js.Any]) => relayEvents(t0, t1).runNow()))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeAfterListener(t0, t1, t2, t3).runNow()))
    removeAllListeners.foreach(p => __obj.updateDynamic("removeAllListeners")(p.toJsFn))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => removeBeforeListener(t0, t1, t2, t3).runNow()))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3((t0: /* names */ js.UndefOr[java.lang.String], t1: /* prefix */ js.UndefOr[java.lang.String], t2: /* suffix */ js.UndefOr[java.lang.String]) => removeCls(t0, t1, t2).runNow()))
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* removeDom */ js.UndefOr[scala.Boolean]) => removeElement(t0, t1).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => removeListener(t0, t1, t2, t3, t4).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* object */ js.UndefOr[js.Any], t1: /* eventName */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    repaint.foreach(p => __obj.updateDynamic("repaint")(p.toJsFn))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: /* element */ js.UndefOr[js.Any]) => replace(t0).runNow()))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4((t0: /* oldName */ js.UndefOr[java.lang.String], t1: /* newName */ js.UndefOr[java.lang.String], t2: /* prefix */ js.UndefOr[java.lang.String], t3: /* suffix */ js.UndefOr[java.lang.String]) => replaceCls(t0, t1, t2, t3).runNow()))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* replacement */ js.UndefOr[js.Any], t2: /* domReplace */ js.UndefOr[scala.Boolean]) => replaceElement(t0, t1, t2).runNow()))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => replaceWith(t0).runNow()))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1((t0: /* discardQueuedEvents */ js.UndefOr[scala.Boolean]) => resumeEvents(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[js.Any], t1: /* composite */ js.UndefOr[scala.Boolean]) => select(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1((t0: /* form */ js.UndefOr[js.Any]) => serializeForm(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* attributes */ js.UndefOr[js.Any], t1: /* useSet */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[java.lang.String]) => setBottom(t0).runNow()))
    if (setBox != null) __obj.updateDynamic("setBox")(js.Any.fromFunction1((t0: /* box */ js.UndefOr[js.Any]) => setBox(t0).runNow()))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[js.Any]) => setBubbleEvents(t0).runNow()))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[js.Any]) => setCls(t0).runNow()))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHTML(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setHeight(t0).runNow()))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => setHtml(t0).runNow()))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1((t0: /* left */ js.UndefOr[java.lang.String]) => setLeft(t0).runNow()))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1((t0: /* listeners */ js.UndefOr[js.Any]) => setListeners(t0).runNow()))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setMaxHeight(t0).runNow()))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setMaxWidth(t0).runNow()))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[js.Any]) => setMinHeight(t0).runNow()))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setMinWidth(t0).runNow()))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1((t0: /* right */ js.UndefOr[java.lang.String]) => setRight(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any]) => setSize(t0, t1).runNow()))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: /* property */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[java.lang.String]) => setStyle(t0, t1).runNow()))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1((t0: /* top */ js.UndefOr[java.lang.String]) => setTop(t0).runNow()))
    setTopLeft.foreach(p => __obj.updateDynamic("setTopLeft")(p.toJsFn))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1((t0: /* mode */ js.UndefOr[js.Any]) => setVisibilityMode(t0).runNow()))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: /* visible */ js.UndefOr[scala.Boolean]) => setVisible(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[js.Any]) => setWidth(t0).runNow()))
    if (setX != null) __obj.updateDynamic("setX")(js.Any.fromFunction1((t0: /* x */ js.UndefOr[scala.Double]) => setX(t0).runNow()))
    if (setXY != null) __obj.updateDynamic("setXY")(js.Any.fromFunction1((t0: /* pos */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setXY(t0).runNow()))
    if (setY != null) __obj.updateDynamic("setY")(js.Any.fromFunction1((t0: /* y */ js.UndefOr[scala.Double]) => setY(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    suspendEvents.foreach(p => __obj.updateDynamic("suspendEvents")(p.toJsFn))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => toggleCls(t0).runNow()))
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double]) => translatePoints(t0, t1).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any], t4: /* order */ js.UndefOr[java.lang.String]) => un(t0, t1, t2, t3, t4).runNow()))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unAfter(t0, t1, t2, t3).runNow()))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => unBefore(t0, t1, t2, t3).runNow()))
    unmask.foreach(p => __obj.updateDynamic("unmask")(p.toJsFn))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction2((t0: /* simpleSelector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any]) => up(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* html */ js.UndefOr[java.lang.String]) => update(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction2((t0: /* config */ js.UndefOr[js.Any], t1: /* domNode */ js.UndefOr[scala.Boolean]) => wrap(t0, t1).runNow()))
    __obj.asInstanceOf[ICompositeElement]
  }
}

