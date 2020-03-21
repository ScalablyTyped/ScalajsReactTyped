package typingsJapgolly.senchaTouch.Ext.dataview

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IList extends IDataView {
  /** [Property] (Number) */
  var bufferSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var disclosureProperty: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of disclosureProperty
  		* @returns String
  		*/
  var getDisclosureProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of grouped
  		* @returns Boolean
  		*/
  var getGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of icon
  		* @returns Object
  		*/
  var getIcon: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of indexBar
  		* @returns Boolean/Object
  		*/
  var getIndexBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of infinite
  		* @returns Boolean
  		*/
  var getInfinite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of minimumBufferDistance
  		* @returns Number
  		*/
  var getMinimumBufferDistance: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function/Object
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of pinHeaders
  		* @returns Boolean
  		*/
  var getPinHeaders: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of preventSelectionOnDisclose
  		* @returns Boolean
  		*/
  var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of refreshHeightOnUpdate
  		* @returns Boolean
  		*/
  var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns all the items that are docked in the scroller in this list
  		* @returns Array An array of the scrollDock items
  		*/
  var getScrollDockedItems: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of striped
  		* @returns Boolean
  		*/
  var getStriped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useHeaders
  		* @returns Boolean
  		*/
  var getUseHeaders: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var indexBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var infinite: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean/Function/Object) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var pinHeaders: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventSelectionOnDisclose: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var refreshHeightOnUpdate: js.UndefOr[Boolean] = js.undefined
  /** [Method] Scrolls the list so that the specified record is at the top
  		* @param record Object {Ext.data.Model} Record in the lists store to scroll to
  		* @param animate Object {Boolean} Determines if scrolling is animated to a cut
  		* @param overscroll Object {Boolean} Determines if list can be overscrolled
  		*/
  var scrollToRecord: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* overscroll */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of disclosureProperty
  		* @param disclosureProperty String The new value.
  		*/
  var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of grouped
  		* @param grouped Boolean The new value.
  		*/
  var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of icon
  		* @param icon Object The new value.
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of indexBar
  		* @param indexBar Boolean/Object The new value.
  		*/
  var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of infinite
  		* @param infinite Boolean The new value.
  		*/
  var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of minimumBufferDistance
  		* @param minimumBufferDistance Number The new value.
  		*/
  var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function/Object The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of pinHeaders
  		* @param pinHeaders Boolean The new value.
  		*/
  var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of preventSelectionOnDisclose
  		* @param preventSelectionOnDisclose Boolean The new value.
  		*/
  var setPreventSelectionOnDisclose: js.UndefOr[js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of refreshHeightOnUpdate
  		* @param refreshHeightOnUpdate Boolean The new value.
  		*/
  var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of striped
  		* @param striped Boolean The new value.
  		*/
  var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useHeaders
  		* @param useHeaders Boolean The new value.
  		*/
  var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var striped: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.undefined
}

object IList {
  @scala.inline
  def apply(
    IDataView: IDataView = null,
    bufferSize: Int | Double = null,
    disclosureProperty: String = null,
    getDisclosureProperty: js.UndefOr[CallbackTo[String]] = js.undefined,
    getGrouped: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getIcon: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getIndexBar: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInfinite: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getItemHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinimumBufferDistance: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getOnItemDisclosure: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getPinHeaders: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getPreventSelectionOnDisclose: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getRefreshHeightOnUpdate: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getScrollDockedItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getStriped: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseHeaders: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseSimpleItems: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getVariableHeights: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    grouped: js.UndefOr[Boolean] = js.undefined,
    indexBar: js.Any = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    itemHeight: Int | Double = null,
    onItemDisclosure: js.Any = null,
    pinHeaders: js.UndefOr[Boolean] = js.undefined,
    preventSelectionOnDisclose: js.UndefOr[Boolean] = js.undefined,
    refreshHeightOnUpdate: js.UndefOr[Boolean] = js.undefined,
    scrollToRecord: (/* record */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* overscroll */ js.UndefOr[js.Any]) => Callback = null,
    setDisclosureProperty: /* disclosureProperty */ js.UndefOr[String] => Callback = null,
    setGrouped: /* grouped */ js.UndefOr[Boolean] => Callback = null,
    setIcon: /* icon */ js.UndefOr[js.Any] => Callback = null,
    setIndexBar: /* indexBar */ js.UndefOr[js.Any] => Callback = null,
    setInfinite: /* infinite */ js.UndefOr[Boolean] => Callback = null,
    setItemHeight: /* itemHeight */ js.UndefOr[Double] => Callback = null,
    setMinimumBufferDistance: /* minimumBufferDistance */ js.UndefOr[Double] => Callback = null,
    setOnItemDisclosure: /* onItemDisclosure */ js.UndefOr[js.Any] => Callback = null,
    setPinHeaders: /* pinHeaders */ js.UndefOr[Boolean] => Callback = null,
    setPreventSelectionOnDisclose: /* preventSelectionOnDisclose */ js.UndefOr[Boolean] => Callback = null,
    setRefreshHeightOnUpdate: /* refreshHeightOnUpdate */ js.UndefOr[Boolean] => Callback = null,
    setStriped: /* striped */ js.UndefOr[Boolean] => Callback = null,
    setUseHeaders: /* useHeaders */ js.UndefOr[Boolean] => Callback = null,
    setUseSimpleItems: /* useSimpleItems */ js.UndefOr[Boolean] => Callback = null,
    setVariableHeights: /* variableHeights */ js.UndefOr[Boolean] => Callback = null,
    striped: js.UndefOr[Boolean] = js.undefined,
    useSimpleItems: js.UndefOr[Boolean] = js.undefined,
    variableHeights: js.UndefOr[Boolean] = js.undefined
  ): IList = {
    val __obj = js.Dynamic.literal()
    if (IDataView != null) js.Dynamic.global.Object.assign(__obj, IDataView)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (disclosureProperty != null) __obj.updateDynamic("disclosureProperty")(disclosureProperty.asInstanceOf[js.Any])
    getDisclosureProperty.foreach(p => __obj.updateDynamic("getDisclosureProperty")(p.toJsFn))
    getGrouped.foreach(p => __obj.updateDynamic("getGrouped")(p.toJsFn))
    getIcon.foreach(p => __obj.updateDynamic("getIcon")(p.toJsFn))
    getIndexBar.foreach(p => __obj.updateDynamic("getIndexBar")(p.toJsFn))
    getInfinite.foreach(p => __obj.updateDynamic("getInfinite")(p.toJsFn))
    getItemHeight.foreach(p => __obj.updateDynamic("getItemHeight")(p.toJsFn))
    getMinimumBufferDistance.foreach(p => __obj.updateDynamic("getMinimumBufferDistance")(p.toJsFn))
    getOnItemDisclosure.foreach(p => __obj.updateDynamic("getOnItemDisclosure")(p.toJsFn))
    getPinHeaders.foreach(p => __obj.updateDynamic("getPinHeaders")(p.toJsFn))
    getPreventSelectionOnDisclose.foreach(p => __obj.updateDynamic("getPreventSelectionOnDisclose")(p.toJsFn))
    getRefreshHeightOnUpdate.foreach(p => __obj.updateDynamic("getRefreshHeightOnUpdate")(p.toJsFn))
    getScrollDockedItems.foreach(p => __obj.updateDynamic("getScrollDockedItems")(p.toJsFn))
    getStriped.foreach(p => __obj.updateDynamic("getStriped")(p.toJsFn))
    getUseHeaders.foreach(p => __obj.updateDynamic("getUseHeaders")(p.toJsFn))
    getUseSimpleItems.foreach(p => __obj.updateDynamic("getUseSimpleItems")(p.toJsFn))
    getVariableHeights.foreach(p => __obj.updateDynamic("getVariableHeights")(p.toJsFn))
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (indexBar != null) __obj.updateDynamic("indexBar")(indexBar.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (onItemDisclosure != null) __obj.updateDynamic("onItemDisclosure")(onItemDisclosure.asInstanceOf[js.Any])
    if (!js.isUndefined(pinHeaders)) __obj.updateDynamic("pinHeaders")(pinHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(preventSelectionOnDisclose)) __obj.updateDynamic("preventSelectionOnDisclose")(preventSelectionOnDisclose.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshHeightOnUpdate)) __obj.updateDynamic("refreshHeightOnUpdate")(refreshHeightOnUpdate.asInstanceOf[js.Any])
    if (scrollToRecord != null) __obj.updateDynamic("scrollToRecord")(js.Any.fromFunction3((t0: /* record */ js.UndefOr[js.Any], t1: /* animate */ js.UndefOr[js.Any], t2: /* overscroll */ js.UndefOr[js.Any]) => scrollToRecord(t0, t1, t2).runNow()))
    if (setDisclosureProperty != null) __obj.updateDynamic("setDisclosureProperty")(js.Any.fromFunction1((t0: /* disclosureProperty */ js.UndefOr[java.lang.String]) => setDisclosureProperty(t0).runNow()))
    if (setGrouped != null) __obj.updateDynamic("setGrouped")(js.Any.fromFunction1((t0: /* grouped */ js.UndefOr[scala.Boolean]) => setGrouped(t0).runNow()))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: /* icon */ js.UndefOr[js.Any]) => setIcon(t0).runNow()))
    if (setIndexBar != null) __obj.updateDynamic("setIndexBar")(js.Any.fromFunction1((t0: /* indexBar */ js.UndefOr[js.Any]) => setIndexBar(t0).runNow()))
    if (setInfinite != null) __obj.updateDynamic("setInfinite")(js.Any.fromFunction1((t0: /* infinite */ js.UndefOr[scala.Boolean]) => setInfinite(t0).runNow()))
    if (setItemHeight != null) __obj.updateDynamic("setItemHeight")(js.Any.fromFunction1((t0: /* itemHeight */ js.UndefOr[scala.Double]) => setItemHeight(t0).runNow()))
    if (setMinimumBufferDistance != null) __obj.updateDynamic("setMinimumBufferDistance")(js.Any.fromFunction1((t0: /* minimumBufferDistance */ js.UndefOr[scala.Double]) => setMinimumBufferDistance(t0).runNow()))
    if (setOnItemDisclosure != null) __obj.updateDynamic("setOnItemDisclosure")(js.Any.fromFunction1((t0: /* onItemDisclosure */ js.UndefOr[js.Any]) => setOnItemDisclosure(t0).runNow()))
    if (setPinHeaders != null) __obj.updateDynamic("setPinHeaders")(js.Any.fromFunction1((t0: /* pinHeaders */ js.UndefOr[scala.Boolean]) => setPinHeaders(t0).runNow()))
    if (setPreventSelectionOnDisclose != null) __obj.updateDynamic("setPreventSelectionOnDisclose")(js.Any.fromFunction1((t0: /* preventSelectionOnDisclose */ js.UndefOr[scala.Boolean]) => setPreventSelectionOnDisclose(t0).runNow()))
    if (setRefreshHeightOnUpdate != null) __obj.updateDynamic("setRefreshHeightOnUpdate")(js.Any.fromFunction1((t0: /* refreshHeightOnUpdate */ js.UndefOr[scala.Boolean]) => setRefreshHeightOnUpdate(t0).runNow()))
    if (setStriped != null) __obj.updateDynamic("setStriped")(js.Any.fromFunction1((t0: /* striped */ js.UndefOr[scala.Boolean]) => setStriped(t0).runNow()))
    if (setUseHeaders != null) __obj.updateDynamic("setUseHeaders")(js.Any.fromFunction1((t0: /* useHeaders */ js.UndefOr[scala.Boolean]) => setUseHeaders(t0).runNow()))
    if (setUseSimpleItems != null) __obj.updateDynamic("setUseSimpleItems")(js.Any.fromFunction1((t0: /* useSimpleItems */ js.UndefOr[scala.Boolean]) => setUseSimpleItems(t0).runNow()))
    if (setVariableHeights != null) __obj.updateDynamic("setVariableHeights")(js.Any.fromFunction1((t0: /* variableHeights */ js.UndefOr[scala.Boolean]) => setVariableHeights(t0).runNow()))
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (!js.isUndefined(useSimpleItems)) __obj.updateDynamic("useSimpleItems")(useSimpleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(variableHeights)) __obj.updateDynamic("variableHeights")(variableHeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[IList]
  }
}

