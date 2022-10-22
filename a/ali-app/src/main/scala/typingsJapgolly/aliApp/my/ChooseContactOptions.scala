package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.all
import typingsJapgolly.aliApp.aliAppStrings.known
import typingsJapgolly.aliApp.aliAppStrings.multi
import typingsJapgolly.aliApp.aliAppStrings.none
import typingsJapgolly.aliApp.aliAppStrings.single
import typingsJapgolly.aliApp.anon.ContactsDicArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseContactOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 选择类型，值为single（单选）或者 multi（多选） */
  var chooseType: single | multi | String
  
  /** 是否包含自己 */
  var includeMe: js.UndefOr[Boolean] = js.undefined
  
  /** 包含手机通讯录联系人的模式：默认为不包含（none）、或者仅仅包含双向通讯录联系人（known）、或者包含手机通讯录联系人（all） */
  var includeMobileContactMode: js.UndefOr[none | known | all | String] = js.undefined
  
  /** 最大选择人数，仅 chooseType 为 multi 时才有效 */
  var multiChooseMax: js.UndefOr[Double] = js.undefined
  
  /** 多选达到上限的文案，仅 chooseType 为 multi 时才有效 */
  var multiChooseMaxTips: js.UndefOr[String] = js.undefined
  
  @JSName("success")
  def success_MChooseContactOptions(result: ContactsDicArray): Unit
}
object ChooseContactOptions {
  
  inline def apply(chooseType: single | multi | String, success: ContactsDicArray => Callback): ChooseContactOptions = {
    val __obj = js.Dynamic.literal(chooseType = chooseType.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: ContactsDicArray) => success(t0).runNow()))
    __obj.asInstanceOf[ChooseContactOptions]
  }
  
  extension [Self <: ChooseContactOptions](x: Self) {
    
    inline def setChooseType(value: single | multi | String): Self = StObject.set(x, "chooseType", value.asInstanceOf[js.Any])
    
    inline def setIncludeMe(value: Boolean): Self = StObject.set(x, "includeMe", value.asInstanceOf[js.Any])
    
    inline def setIncludeMeUndefined: Self = StObject.set(x, "includeMe", js.undefined)
    
    inline def setIncludeMobileContactMode(value: none | known | all | String): Self = StObject.set(x, "includeMobileContactMode", value.asInstanceOf[js.Any])
    
    inline def setIncludeMobileContactModeUndefined: Self = StObject.set(x, "includeMobileContactMode", js.undefined)
    
    inline def setMultiChooseMax(value: Double): Self = StObject.set(x, "multiChooseMax", value.asInstanceOf[js.Any])
    
    inline def setMultiChooseMaxTips(value: String): Self = StObject.set(x, "multiChooseMaxTips", value.asInstanceOf[js.Any])
    
    inline def setMultiChooseMaxTipsUndefined: Self = StObject.set(x, "multiChooseMaxTips", js.undefined)
    
    inline def setMultiChooseMaxUndefined: Self = StObject.set(x, "multiChooseMax", js.undefined)
    
    inline def setSuccess(value: ContactsDicArray => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ContactsDicArray) => value(t0).runNow()))
  }
}
