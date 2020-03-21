package typingsJapgolly.senchaTouch.Ext.dataview

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IComponent
import typingsJapgolly.senchaTouch.Ext.IContainer
import typingsJapgolly.senchaTouch.Ext.IElement
import typingsJapgolly.senchaTouch.Ext.data.INodeInterface
import typingsJapgolly.senchaTouch.Ext.data.IRecord
import typingsJapgolly.senchaTouch.Ext.event.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INestedList extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var backButton: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var backText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var clearSelectionDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.Component) */
  var detailCard: js.UndefOr[IComponent] = js.undefined
  /** [Config Option] (Ext.Container) */
  var detailContainer: js.UndefOr[IContainer] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of backButton
  		* @returns Object
  		*/
  var getBackButton: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of backText
  		* @returns String
  		*/
  var getBackText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of clearSelectionOnListChange
  		* @returns Boolean
  		*/
  var getClearSelectionOnListChange: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of detailCard
  		* @returns Ext.Component
  		*/
  var getDetailCard: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Returns the value of detailContainer
  		* @returns Ext.Container
  		*/
  var getDetailContainer: js.UndefOr[js.Function0[IContainer]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Override this method to provide custom template rendering of individual nodes
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getItemTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], String]] = js.undefined
  /** [Method] Returns the value of listConfig
  		* @returns Object
  		*/
  var getListConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String
  		*/
  var getLoadingText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.TreeStore/String
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the subList for a specified node  */
  var getSubList: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Override this method to provide custom template rendering of titles back buttons when useTitleAsBackText is enabled
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getTitleTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], String]] = js.undefined
  /** [Method] Returns the value of toolbar
  		* @returns Ext.Toolbar/Object/Boolean
  		*/
  var getToolbar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of updateTitleText
  		* @returns Boolean
  		*/
  var getUpdateTitleText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useTitleAsBackText
  		* @returns Boolean
  		*/
  var getUseTitleAsBackText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useToolbar
  		* @returns Boolean
  		*/
  var getUseToolbar: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] The leaf you want to navigate to
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToLeaf: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.undefined
  /** [Method] Method to handle going to a specific node within this nested list
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[String] = js.undefined
  /** [Method] Called when the backButton has been tapped  */
  var onBackTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean/Function) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called when an list item has been tapped
  		* @param list Ext.List The subList the item is on.
  		* @param index Number The id of the item tapped.
  		* @param target Ext.Element The list item tapped.
  		* @param record Ext.data.Record The record which as tapped.
  		* @param e Ext.event.Event The event.
  		*/
  var onItemTap: js.UndefOr[
    js.Function5[
      /* list */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IList], 
      /* index */ js.UndefOr[Double], 
      /* target */ js.UndefOr[IElement], 
      /* record */ js.UndefOr[IRecord], 
      /* e */ js.UndefOr[IEvent], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of backButton
  		* @param backButton Object The new value.
  		*/
  var setBackButton: js.UndefOr[js.Function1[/* backButton */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of backText
  		* @param backText String The new value.
  		*/
  var setBackText: js.UndefOr[js.Function1[/* backText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of clearSelectionOnListChange
  		* @param clearSelectionOnListChange Boolean The new value.
  		*/
  var setClearSelectionOnListChange: js.UndefOr[js.Function1[/* clearSelectionOnListChange */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of detailCard
  		* @param detailCard Ext.Component The new value.
  		*/
  var setDetailCard: js.UndefOr[js.Function1[/* detailCard */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Sets the value of detailContainer
  		* @param detailContainer Ext.Container The new value.
  		*/
  var setDetailContainer: js.UndefOr[js.Function1[/* detailContainer */ js.UndefOr[IContainer], Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of listConfig
  		* @param listConfig Object The new value.
  		*/
  var setListConfig: js.UndefOr[js.Function1[/* listConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.TreeStore/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of toolbar
  		* @param toolbar Ext.Toolbar/Object/Boolean The new value.
  		*/
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ui
  		* @param ui Object The new value.
  		*/
  @JSName("setUi")
  var setUi_INestedList: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of updateTitleText
  		* @param updateTitleText Boolean The new value.
  		*/
  var setUpdateTitleText: js.UndefOr[js.Function1[/* updateTitleText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useTitleAsBackText
  		* @param useTitleAsBackText Boolean The new value.
  		*/
  var setUseTitleAsBackText: js.UndefOr[js.Function1[/* useTitleAsBackText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useToolbar
  		* @param useToolbar Boolean The new value.
  		*/
  var setUseToolbar: js.UndefOr[js.Function1[/* useToolbar */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.data.TreeStore/String) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.Toolbar/Object/Boolean) */
  var toolbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var updateTitleText: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitleAsBackText: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useToolbar: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.undefined
}

object INestedList {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    backButton: js.Any = null,
    backText: String = null,
    clearSelectionDelay: Int | Double = null,
    detailCard: IComponent = null,
    detailContainer: IContainer = null,
    displayField: String = null,
    emptyText: String = null,
    getAllowDeselect: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getBackButton: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBackText: js.UndefOr[CallbackTo[String]] = js.undefined,
    getClearSelectionOnListChange: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDetailCard: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getDetailContainer: js.UndefOr[CallbackTo[IContainer]] = js.undefined,
    getDisplayField: js.UndefOr[CallbackTo[String]] = js.undefined,
    getEmptyText: js.UndefOr[CallbackTo[String]] = js.undefined,
    getItemHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getItemTextTpl: /* node */ js.UndefOr[IRecord] => CallbackTo[String] = null,
    getListConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getLoadingText: js.UndefOr[CallbackTo[String]] = js.undefined,
    getOnItemDisclosure: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getStore: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSubList: js.UndefOr[Callback] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    getTitleTextTpl: /* node */ js.UndefOr[IRecord] => CallbackTo[String] = null,
    getToolbar: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUpdateTitleText: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseSimpleItems: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseTitleAsBackText: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getUseToolbar: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getVariableHeights: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    goToLeaf: /* node */ js.UndefOr[INodeInterface] => Callback = null,
    goToNode: /* node */ js.UndefOr[INodeInterface] => Callback = null,
    itemHeight: Int | Double = null,
    listConfig: js.Any = null,
    loadingText: String = null,
    onBackTap: js.UndefOr[Callback] = js.undefined,
    onItemDisclosure: js.Any = null,
    onItemTap: (/* list */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IList], /* index */ js.UndefOr[Double], /* target */ js.UndefOr[IElement], /* record */ js.UndefOr[IRecord], /* e */ js.UndefOr[IEvent]) => Callback = null,
    setAllowDeselect: /* allowDeselect */ js.UndefOr[Boolean] => Callback = null,
    setBackButton: /* backButton */ js.UndefOr[js.Any] => Callback = null,
    setBackText: /* backText */ js.UndefOr[String] => Callback = null,
    setClearSelectionOnListChange: /* clearSelectionOnListChange */ js.UndefOr[Boolean] => Callback = null,
    setDetailCard: /* detailCard */ js.UndefOr[IComponent] => Callback = null,
    setDetailContainer: /* detailContainer */ js.UndefOr[IContainer] => Callback = null,
    setDisplayField: /* displayField */ js.UndefOr[String] => Callback = null,
    setEmptyText: /* emptyText */ js.UndefOr[String] => Callback = null,
    setItemHeight: /* itemHeight */ js.UndefOr[Double] => Callback = null,
    setListConfig: /* listConfig */ js.UndefOr[js.Any] => Callback = null,
    setLoadingText: /* loadingText */ js.UndefOr[String] => Callback = null,
    setOnItemDisclosure: /* onItemDisclosure */ js.UndefOr[js.Any] => Callback = null,
    setStore: /* store */ js.UndefOr[js.Any] => Callback = null,
    setTitle: /* title */ js.UndefOr[String] => Callback = null,
    setToolbar: /* toolbar */ js.UndefOr[js.Any] => Callback = null,
    setUi: /* ui */ js.UndefOr[js.Any] => Callback = null,
    setUpdateTitleText: /* updateTitleText */ js.UndefOr[Boolean] => Callback = null,
    setUseSimpleItems: /* useSimpleItems */ js.UndefOr[Boolean] => Callback = null,
    setUseTitleAsBackText: /* useTitleAsBackText */ js.UndefOr[Boolean] => Callback = null,
    setUseToolbar: /* useToolbar */ js.UndefOr[Boolean] => Callback = null,
    setVariableHeights: /* variableHeights */ js.UndefOr[Boolean] => Callback = null,
    store: js.Any = null,
    title: String = null,
    toolbar: js.Any = null,
    updateTitleText: js.UndefOr[Boolean] = js.undefined,
    useSimpleItems: js.UndefOr[Boolean] = js.undefined,
    useTitleAsBackText: js.UndefOr[Boolean] = js.undefined,
    useToolbar: js.UndefOr[Boolean] = js.undefined,
    variableHeights: js.UndefOr[Boolean] = js.undefined
  ): INestedList = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (backButton != null) __obj.updateDynamic("backButton")(backButton.asInstanceOf[js.Any])
    if (backText != null) __obj.updateDynamic("backText")(backText.asInstanceOf[js.Any])
    if (clearSelectionDelay != null) __obj.updateDynamic("clearSelectionDelay")(clearSelectionDelay.asInstanceOf[js.Any])
    if (detailCard != null) __obj.updateDynamic("detailCard")(detailCard.asInstanceOf[js.Any])
    if (detailContainer != null) __obj.updateDynamic("detailContainer")(detailContainer.asInstanceOf[js.Any])
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    getAllowDeselect.foreach(p => __obj.updateDynamic("getAllowDeselect")(p.toJsFn))
    getBackButton.foreach(p => __obj.updateDynamic("getBackButton")(p.toJsFn))
    getBackText.foreach(p => __obj.updateDynamic("getBackText")(p.toJsFn))
    getClearSelectionOnListChange.foreach(p => __obj.updateDynamic("getClearSelectionOnListChange")(p.toJsFn))
    getDetailCard.foreach(p => __obj.updateDynamic("getDetailCard")(p.toJsFn))
    getDetailContainer.foreach(p => __obj.updateDynamic("getDetailContainer")(p.toJsFn))
    getDisplayField.foreach(p => __obj.updateDynamic("getDisplayField")(p.toJsFn))
    getEmptyText.foreach(p => __obj.updateDynamic("getEmptyText")(p.toJsFn))
    getItemHeight.foreach(p => __obj.updateDynamic("getItemHeight")(p.toJsFn))
    if (getItemTextTpl != null) __obj.updateDynamic("getItemTextTpl")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord]) => getItemTextTpl(t0).runNow()))
    getListConfig.foreach(p => __obj.updateDynamic("getListConfig")(p.toJsFn))
    getLoadingText.foreach(p => __obj.updateDynamic("getLoadingText")(p.toJsFn))
    getOnItemDisclosure.foreach(p => __obj.updateDynamic("getOnItemDisclosure")(p.toJsFn))
    getStore.foreach(p => __obj.updateDynamic("getStore")(p.toJsFn))
    getSubList.foreach(p => __obj.updateDynamic("getSubList")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    if (getTitleTextTpl != null) __obj.updateDynamic("getTitleTextTpl")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord]) => getTitleTextTpl(t0).runNow()))
    getToolbar.foreach(p => __obj.updateDynamic("getToolbar")(p.toJsFn))
    getUpdateTitleText.foreach(p => __obj.updateDynamic("getUpdateTitleText")(p.toJsFn))
    getUseSimpleItems.foreach(p => __obj.updateDynamic("getUseSimpleItems")(p.toJsFn))
    getUseTitleAsBackText.foreach(p => __obj.updateDynamic("getUseTitleAsBackText")(p.toJsFn))
    getUseToolbar.foreach(p => __obj.updateDynamic("getUseToolbar")(p.toJsFn))
    getVariableHeights.foreach(p => __obj.updateDynamic("getVariableHeights")(p.toJsFn))
    if (goToLeaf != null) __obj.updateDynamic("goToLeaf")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => goToLeaf(t0).runNow()))
    if (goToNode != null) __obj.updateDynamic("goToNode")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => goToNode(t0).runNow()))
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (listConfig != null) __obj.updateDynamic("listConfig")(listConfig.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    onBackTap.foreach(p => __obj.updateDynamic("onBackTap")(p.toJsFn))
    if (onItemDisclosure != null) __obj.updateDynamic("onItemDisclosure")(onItemDisclosure.asInstanceOf[js.Any])
    if (onItemTap != null) __obj.updateDynamic("onItemTap")(js.Any.fromFunction5((t0: /* list */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IList], t1: /* index */ js.UndefOr[scala.Double], t2: /* target */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IElement], t3: /* record */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord], t4: /* e */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.event.IEvent]) => onItemTap(t0, t1, t2, t3, t4).runNow()))
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1((t0: /* allowDeselect */ js.UndefOr[scala.Boolean]) => setAllowDeselect(t0).runNow()))
    if (setBackButton != null) __obj.updateDynamic("setBackButton")(js.Any.fromFunction1((t0: /* backButton */ js.UndefOr[js.Any]) => setBackButton(t0).runNow()))
    if (setBackText != null) __obj.updateDynamic("setBackText")(js.Any.fromFunction1((t0: /* backText */ js.UndefOr[java.lang.String]) => setBackText(t0).runNow()))
    if (setClearSelectionOnListChange != null) __obj.updateDynamic("setClearSelectionOnListChange")(js.Any.fromFunction1((t0: /* clearSelectionOnListChange */ js.UndefOr[scala.Boolean]) => setClearSelectionOnListChange(t0).runNow()))
    if (setDetailCard != null) __obj.updateDynamic("setDetailCard")(js.Any.fromFunction1((t0: /* detailCard */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IComponent]) => setDetailCard(t0).runNow()))
    if (setDetailContainer != null) __obj.updateDynamic("setDetailContainer")(js.Any.fromFunction1((t0: /* detailContainer */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.IContainer]) => setDetailContainer(t0).runNow()))
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(js.Any.fromFunction1((t0: /* displayField */ js.UndefOr[java.lang.String]) => setDisplayField(t0).runNow()))
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(js.Any.fromFunction1((t0: /* emptyText */ js.UndefOr[java.lang.String]) => setEmptyText(t0).runNow()))
    if (setItemHeight != null) __obj.updateDynamic("setItemHeight")(js.Any.fromFunction1((t0: /* itemHeight */ js.UndefOr[scala.Double]) => setItemHeight(t0).runNow()))
    if (setListConfig != null) __obj.updateDynamic("setListConfig")(js.Any.fromFunction1((t0: /* listConfig */ js.UndefOr[js.Any]) => setListConfig(t0).runNow()))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1((t0: /* loadingText */ js.UndefOr[java.lang.String]) => setLoadingText(t0).runNow()))
    if (setOnItemDisclosure != null) __obj.updateDynamic("setOnItemDisclosure")(js.Any.fromFunction1((t0: /* onItemDisclosure */ js.UndefOr[js.Any]) => setOnItemDisclosure(t0).runNow()))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1((t0: /* store */ js.UndefOr[js.Any]) => setStore(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setToolbar != null) __obj.updateDynamic("setToolbar")(js.Any.fromFunction1((t0: /* toolbar */ js.UndefOr[js.Any]) => setToolbar(t0).runNow()))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1((t0: /* ui */ js.UndefOr[js.Any]) => setUi(t0).runNow()))
    if (setUpdateTitleText != null) __obj.updateDynamic("setUpdateTitleText")(js.Any.fromFunction1((t0: /* updateTitleText */ js.UndefOr[scala.Boolean]) => setUpdateTitleText(t0).runNow()))
    if (setUseSimpleItems != null) __obj.updateDynamic("setUseSimpleItems")(js.Any.fromFunction1((t0: /* useSimpleItems */ js.UndefOr[scala.Boolean]) => setUseSimpleItems(t0).runNow()))
    if (setUseTitleAsBackText != null) __obj.updateDynamic("setUseTitleAsBackText")(js.Any.fromFunction1((t0: /* useTitleAsBackText */ js.UndefOr[scala.Boolean]) => setUseTitleAsBackText(t0).runNow()))
    if (setUseToolbar != null) __obj.updateDynamic("setUseToolbar")(js.Any.fromFunction1((t0: /* useToolbar */ js.UndefOr[scala.Boolean]) => setUseToolbar(t0).runNow()))
    if (setVariableHeights != null) __obj.updateDynamic("setVariableHeights")(js.Any.fromFunction1((t0: /* variableHeights */ js.UndefOr[scala.Boolean]) => setVariableHeights(t0).runNow()))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(updateTitleText)) __obj.updateDynamic("updateTitleText")(updateTitleText.asInstanceOf[js.Any])
    if (!js.isUndefined(useSimpleItems)) __obj.updateDynamic("useSimpleItems")(useSimpleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(useTitleAsBackText)) __obj.updateDynamic("useTitleAsBackText")(useTitleAsBackText.asInstanceOf[js.Any])
    if (!js.isUndefined(useToolbar)) __obj.updateDynamic("useToolbar")(useToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(variableHeights)) __obj.updateDynamic("variableHeights")(variableHeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[INestedList]
  }
}

