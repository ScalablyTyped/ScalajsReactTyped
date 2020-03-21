package typingsJapgolly.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any]
     with /**
  * 渲染编辑回调
  */
// renderEditer?:(React.ComponentClass<FitGaea.ComponentProps>,{})=>void
/* x */ StringDictionary[js.Any] {
  /**
    * 是否可以拖入子元素
    */
  var canDragIn: js.UndefOr[Boolean] = js.undefined
  /**
    * 父组件传递的数据
    */
  var gaeaData: js.UndefOr[js.Any] = js.undefined
  /**
    * 编辑信息
    */
  var gaeaEdit: js.UndefOr[js.Array[ComponentPropsGaeaEdit]] = js.undefined
  /**
    * 事件定义
    */
  var gaeaEvent: js.UndefOr[GaeaEvent] = js.undefined
  /**
    * 存储事件设置
    */
  var gaeaEventData: js.UndefOr[js.Array[EventData]] = js.undefined
  /**
    * 组件图标,为 fontAwesome
    */
  var gaeaIcon: js.UndefOr[String] = js.undefined
  /**
    * 组件的中文名
    */
  var gaeaName: String
  /**
    * 存储native事件设置
    */
  var gaeaNativeEventData: js.UndefOr[js.Array[EventData]] = js.undefined
  /**
    * 是否在预览模式，preivew 会传入 true
    */
  var gaeaPreview: js.UndefOr[Boolean] = js.undefined
  /**
    * 唯一的 key,用来唯一标识这个组件,所有盖亚内部组件都以 gaea- 为前缀
    */
  var gaeaUniqueKey: String
  /**
    * 存储变量信息
    */
  var gaeaVariables: js.UndefOr[StringDictionary[VariableData]] = js.undefined
}

object ComponentProps {
  @scala.inline
  def apply(
    gaeaName: String,
    gaeaUniqueKey: String,
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    StringDictionary: /**
    * 渲染编辑回调
    */
  // renderEditer?:(React.ComponentClass<FitGaea.ComponentProps>,{})=>void
  /* x */ StringDictionary[js.Any] = null,
    canDragIn: js.UndefOr[Boolean] = js.undefined,
    gaeaData: js.Any = null,
    gaeaEdit: js.Array[ComponentPropsGaeaEdit] = null,
    gaeaEvent: GaeaEvent = null,
    gaeaEventData: js.Array[EventData] = null,
    gaeaIcon: String = null,
    gaeaNativeEventData: js.Array[EventData] = null,
    gaeaPreview: js.UndefOr[Boolean] = js.undefined,
    gaeaVariables: StringDictionary[VariableData] = null
  ): ComponentProps = {
    val __obj = js.Dynamic.literal(gaeaName = gaeaName.asInstanceOf[js.Any], gaeaUniqueKey = gaeaUniqueKey.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(canDragIn)) __obj.updateDynamic("canDragIn")(canDragIn.asInstanceOf[js.Any])
    if (gaeaData != null) __obj.updateDynamic("gaeaData")(gaeaData.asInstanceOf[js.Any])
    if (gaeaEdit != null) __obj.updateDynamic("gaeaEdit")(gaeaEdit.asInstanceOf[js.Any])
    if (gaeaEvent != null) __obj.updateDynamic("gaeaEvent")(gaeaEvent.asInstanceOf[js.Any])
    if (gaeaEventData != null) __obj.updateDynamic("gaeaEventData")(gaeaEventData.asInstanceOf[js.Any])
    if (gaeaIcon != null) __obj.updateDynamic("gaeaIcon")(gaeaIcon.asInstanceOf[js.Any])
    if (gaeaNativeEventData != null) __obj.updateDynamic("gaeaNativeEventData")(gaeaNativeEventData.asInstanceOf[js.Any])
    if (!js.isUndefined(gaeaPreview)) __obj.updateDynamic("gaeaPreview")(gaeaPreview.asInstanceOf[js.Any])
    if (gaeaVariables != null) __obj.updateDynamic("gaeaVariables")(gaeaVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

