package typingsJapgolly.extjs.Ext.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeCache extends IBase {
  /** [Method] Removes all elements from this NodeCache
  		* @param removeDom Boolean True to also remove the elements from the document.
  		*/
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Clears this NodeCache and adds the elements passed
  		* @param els HTMLElement[] An array of DOM elements from which to fill this NodeCache.
  		* @returns Ext.view.NodeCache this
  		*/
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean True to also remove the element from the document
  		*/
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Replaces the specified element with the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
  		* @param replacement String/Ext.Element The id of an element or the Element itself.
  		* @param domReplace Boolean True to remove and replace the element in the document too.
  		* @returns Ext.view.NodeCache this
  		*/
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Appends prepends records depending on direction flag
  		* @param newRecords Ext.data.Model[] Items to append/prepend
  		* @param direction Number -1' = scroll up,0` = scroll down.
  		* @param removeCount Number The number of records to remove from the end. if scrolling down, rows are removed from the top and the new rows are added at the bottom.
  		*/
  var scroll: js.UndefOr[
    js.Function3[
      /* newRecords */ js.UndefOr[Array], 
      /* direction */ js.UndefOr[Double], 
      /* removeCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
}

object INodeCache {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: /* removeDom */ js.UndefOr[Boolean] => Callback = null,
    config: js.Any = null,
    extend: String = null,
    fill: /* els */ js.UndefOr[Array] => CallbackTo[INodeCache] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    indexOf: /* el */ js.UndefOr[js.Any] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[INodeCache] = null,
    mixins: js.Any = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => Callback = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => CallbackTo[INodeCache] = null,
    requires: Array = null,
    scroll: (/* newRecords */ js.UndefOr[Array], /* direction */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => Callback = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): INodeCache = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: /* removeDom */ js.UndefOr[scala.Boolean]) => clear(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1((t0: /* els */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fill(t0).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[js.Any]) => indexOf(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* removeDom */ js.UndefOr[scala.Boolean]) => removeElement(t0, t1).runNow()))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* replacement */ js.UndefOr[js.Any], t2: /* domReplace */ js.UndefOr[scala.Boolean]) => replaceElement(t0, t1, t2).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction3((t0: /* newRecords */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t1: /* direction */ js.UndefOr[scala.Double], t2: /* removeCount */ js.UndefOr[scala.Double]) => scroll(t0, t1, t2).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeCache]
  }
}

