package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.menuPropsTypeMod.DataItem
import typingsJapgolly.antdMobile.subMenuMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubMenu {
  def apply(
    selItem: js.Array[DataItem],
    showSelect: Boolean,
    subMenuData: js.Array[DataItem],
    onSel: DataItem => Callback,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    radioPrefixCls: String = null,
    subMenuPrefixCls: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropsType, 
    MountedWithRawType[PropsType, js.Object, RawMounted[PropsType, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(selItem = selItem.asInstanceOf[js.Any], showSelect = showSelect.asInstanceOf[js.Any], subMenuData = subMenuData.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onSel")(js.Any.fromFunction1((t0: typingsJapgolly.antdMobile.menuPropsTypeMod.DataItem) => onSel(t0).runNow()))
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (radioPrefixCls != null) __obj.updateDynamic("radioPrefixCls")(radioPrefixCls.asInstanceOf[js.Any])
    if (subMenuPrefixCls != null) __obj.updateDynamic("subMenuPrefixCls")(subMenuPrefixCls.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antdMobile.subMenuMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.subMenuMod.PropsType])(children: _*)
  }
  @JSImport("antd-mobile/lib/menu/SubMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

