package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppInts.`11`
import typingsJapgolly.aliApp.aliAppStrings.HHColonmm
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM-dd`
import typingsJapgolly.aliApp.aliAppStrings.`yyyy-MM`
import typingsJapgolly.aliApp.aliAppStrings.yyyy
import typingsJapgolly.aliApp.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 选择日期 https://docs.alipay.com/mini/api/ui-date
trait DatePickerOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: String
  
  /** 最大日期时间 */
  var endDate: String
  
  /** 11 用户取消操作 */
  @JSName("fail")
  def fail_11(error: `11`): Unit
  
  /**
    * 返回的日期格式，
    * 1. yyyy-MM-dd（默认）
    * 2. HH:mm
    * 3. yyyy-MM-dd HH:mm
    * 4. yyyy-MM （最低基础库：1.1.1, 可用 canIUse('datePicker.object.format.yyyy-MM') 判断）
    * 5. yyyy （最低基础库：1.1.1,可用 canIUse('datePicker.object.format.yyyy') 判断）
    */
  var format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy
  
  /** 最小日期时间 */
  var startDate: String
  
  @JSName("success")
  def success_MDatePickerOptions(result: Date): Unit
}
object DatePickerOptions {
  
  inline def apply(
    currentDate: String,
    endDate: String,
    fail: `11` => Callback,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy,
    startDate: String,
    success: Date => Callback
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], fail = js.Any.fromFunction1((t0: `11`) => fail(t0).runNow()), format = format.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: Date) => success(t0).runNow()))
    __obj.asInstanceOf[DatePickerOptions]
  }
  
  extension [Self <: DatePickerOptions](x: Self) {
    
    inline def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setFail(value: `11` => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: `11`) => value(t0).runNow()))
    
    inline def setFormat(value: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Date => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Date) => value(t0).runNow()))
  }
}
