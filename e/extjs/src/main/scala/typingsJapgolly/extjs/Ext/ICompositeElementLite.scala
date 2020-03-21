package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeElementLite extends IBase {
  /** [Method] Adds elements to this Composite object
  		* @param els HTMLElement[]/Ext.dom.CompositeElement Either an Array of DOM elements to add, or another Composite object who's elements should be added.
  		* @returns Ext.dom.CompositeElement This Composite object.
  		*/
  var add: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[js.Any], typingsJapgolly.extjs.Ext.dom.ICompositeElement]
  ] = js.undefined
  /** [Method] Removes all elements from this Composite
  		* @param removeDom Boolean True to also remove the elements from the document.
  		*/
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Returns true if this composite contains the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.Element, or an HtmlElement to find within the composite collection.
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Calls the passed function for each element in this composite
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var each: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.undefined
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.undefined
  /** [Method] Clears this Composite and adds the elements passed
  		* @param els HTMLElement[]/Ext.dom.CompositeElement Either an array of DOM elements, or another Composite from which to fill this Composite.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var fill: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[js.Any], typingsJapgolly.extjs.Ext.dom.ICompositeElement]
  ] = js.undefined
  /** [Method] Filters this composite to only elements that match the passed selector
  		* @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
  		* @returns Ext.dom.CompositeElement this
  		*/
  var filter: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[js.Any], typingsJapgolly.extjs.Ext.dom.ICompositeElement]
  ] = js.undefined
  /** [Method] Returns the first Element
  		* @returns Ext.dom.Element
  		*/
  var first: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined
  /** [Method] Returns the number of elements in this Composite
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Property] (Boolean) */
  var isComposite: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
  		* @param index Number
  		* @returns Ext.dom.Element
  		*/
  var item: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typingsJapgolly.extjs.Ext.dom.IElement]
  ] = js.undefined
  /** [Method] Returns the last Element
  		* @returns Ext.dom.Element
  		*/
  var last: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean True to also remove the element from the document.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var removeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.undefined
  /** [Method] Replaces the specified element with the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
  		* @param replacement String/Ext.Element The id of an element or the Element itself.
  		* @param domReplace Boolean True to remove and replace the element in the document too.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typingsJapgolly.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.undefined
  /** [Method] Gets a range nodes
  		* @param start Number The index of the first node in the range
  		* @param end Number The index of the last node in the range
  		* @returns HTMLElement[] An array of nodes
  		*/
  var slice: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
}

object ICompositeElementLite {
  @scala.inline
  def apply(
    add: /* els */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.dom.ICompositeElement] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: /* removeDom */ js.UndefOr[Boolean] => Callback = null,
    config: js.Any = null,
    contains: /* el */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.extjs.Ext.dom.ICompositeElement] = null,
    elements: Array = null,
    extend: java.lang.String = null,
    fill: /* els */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.dom.ICompositeElement] = null,
    filter: /* selector */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.dom.ICompositeElement] = null,
    first: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    indexOf: /* el */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ICompositeElementLite] = null,
    isComposite: js.UndefOr[Boolean] = js.undefined,
    item: /* index */ js.UndefOr[Double] => CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement] = null,
    last: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined,
    mixins: js.Any = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.dom.ICompositeElement] = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.extjs.Ext.dom.ICompositeElement] = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slice: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    statics: js.Any = null,
    uses: Array = null
  ): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* els */ js.UndefOr[js.Any]) => add(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: /* removeDom */ js.UndefOr[scala.Boolean]) => clear(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => contains(t0).runNow()))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1((t0: /* els */ js.UndefOr[js.Any]) => fill(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[js.Any]) => filter(t0).runNow()))
    first.foreach(p => __obj.updateDynamic("first")(p.toJsFn))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isComposite)) __obj.updateDynamic("isComposite")(isComposite.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => item(t0).runNow()))
    last.foreach(p => __obj.updateDynamic("last")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* removeDom */ js.UndefOr[scala.Boolean]) => removeElement(t0, t1).runNow()))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* replacement */ js.UndefOr[js.Any], t2: /* domReplace */ js.UndefOr[scala.Boolean]) => replaceElement(t0, t1, t2).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(js.Any.fromFunction2((t0: /* start */ js.UndefOr[scala.Double], t1: /* end */ js.UndefOr[scala.Double]) => slice(t0, t1).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompositeElementLite]
  }
}

