package typingsJapgolly.extjs.Ext.resizer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISplitter extends IComponent {
  /** [Config Option] (Boolean) */
  var collapseOnDblClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Ext.panel.Panel) */
  var collapseTarget: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var defaultSplitMax: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var defaultSplitMin: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the config object with an xclass property for the splitter tracker  */
  var getTrackerConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_ISplitter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (String) */
  var orientation: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var performCollapse: js.UndefOr[Boolean] = js.undefined
  /** [Method] Work around IE bug
  		* @returns Ext.Component this
  		*/
  @JSName("setSize")
  var setSize_ISplitter: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.undefined
}

object ISplitter {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    collapseOnDblClick: js.UndefOr[Boolean] = js.undefined,
    collapseTarget: js.Any = null,
    collapsedCls: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    defaultSplitMax: Int | Double = null,
    defaultSplitMin: Int | Double = null,
    getTrackerConfig: js.UndefOr[Callback] = js.undefined,
    onRender: js.UndefOr[Callback] = js.undefined,
    orientation: String = null,
    performCollapse: js.UndefOr[Boolean] = js.undefined,
    setSize: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    size: Int | Double = null
  ): ISplitter = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(collapseOnDblClick)) __obj.updateDynamic("collapseOnDblClick")(collapseOnDblClick.asInstanceOf[js.Any])
    if (collapseTarget != null) __obj.updateDynamic("collapseTarget")(collapseTarget.asInstanceOf[js.Any])
    if (collapsedCls != null) __obj.updateDynamic("collapsedCls")(collapsedCls.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (defaultSplitMax != null) __obj.updateDynamic("defaultSplitMax")(defaultSplitMax.asInstanceOf[js.Any])
    if (defaultSplitMin != null) __obj.updateDynamic("defaultSplitMin")(defaultSplitMin.asInstanceOf[js.Any])
    getTrackerConfig.foreach(p => __obj.updateDynamic("getTrackerConfig")(p.toJsFn))
    onRender.foreach(p => __obj.updateDynamic("onRender")(p.toJsFn))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(performCollapse)) __obj.updateDynamic("performCollapse")(performCollapse.asInstanceOf[js.Any])
    setSize.foreach(p => __obj.updateDynamic("setSize")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitter]
  }
}

