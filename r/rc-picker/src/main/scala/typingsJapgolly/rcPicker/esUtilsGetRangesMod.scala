package typingsJapgolly.rcPicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.anon.Label
import typingsJapgolly.rcPicker.esInterfaceMod.Components
import typingsJapgolly.rcPicker.esInterfaceMod.Locale
import typingsJapgolly.rcPicker.esInterfaceMod.RangeList
import typingsJapgolly.rcPicker.rcPickerBooleans.`false`
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetRangesMod {
  
  @JSImport("rc-picker/es/utils/getRanges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasPrefixClsRangeListComponentsNeedConfirmButtonOnNowOnOkOkDisabledShowNowLocale: RangesProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsRangeListComponentsNeedConfirmButtonOnNowOnOkOkDisabledShowNowLocale.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RangesProps extends StObject {
    
    var components: js.UndefOr[Components] = js.undefined
    
    var locale: Locale
    
    var needConfirmButton: Boolean
    
    var okDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined
    
    var onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined
    
    var prefixCls: String
    
    var rangeList: js.UndefOr[RangeList] = js.undefined
    
    var showNow: js.UndefOr[Boolean] = js.undefined
  }
  object RangesProps {
    
    inline def apply(locale: Locale, needConfirmButton: Boolean, prefixCls: String): RangesProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangesProps]
    }
    
    extension [Self <: RangesProps](x: Self) {
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNeedConfirmButton(value: Boolean): Self = StObject.set(x, "needConfirmButton", value.asInstanceOf[js.Any])
      
      inline def setOkDisabled(value: Boolean): Self = StObject.set(x, "okDisabled", value.asInstanceOf[js.Any])
      
      inline def setOkDisabledUndefined: Self = StObject.set(x, "okDisabled", js.undefined)
      
      inline def setOnNow(value: js.Function0[Unit] | `false`): Self = StObject.set(x, "onNow", value.asInstanceOf[js.Any])
      
      inline def setOnNowCallback(value: Callback): Self = StObject.set(x, "onNow", value.toJsFn)
      
      inline def setOnNowNull: Self = StObject.set(x, "onNow", null)
      
      inline def setOnNowUndefined: Self = StObject.set(x, "onNow", js.undefined)
      
      inline def setOnOk(value: js.Function0[Unit] | `false`): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
      
      inline def setOnOkCallback(value: Callback): Self = StObject.set(x, "onOk", value.toJsFn)
      
      inline def setOnOkNull: Self = StObject.set(x, "onOk", null)
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRangeList(value: RangeList): Self = StObject.set(x, "rangeList", value.asInstanceOf[js.Any])
      
      inline def setRangeListUndefined: Self = StObject.set(x, "rangeList", js.undefined)
      
      inline def setRangeListVarargs(value: Label*): Self = StObject.set(x, "rangeList", js.Array(value*))
      
      inline def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      inline def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
    }
  }
}
