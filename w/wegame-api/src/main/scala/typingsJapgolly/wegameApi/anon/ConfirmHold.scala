package typingsJapgolly.wegameApi.anon

import typingsJapgolly.wegameApi.wegameApiStrings.done
import typingsJapgolly.wegameApi.wegameApiStrings.go
import typingsJapgolly.wegameApi.wegameApiStrings.next
import typingsJapgolly.wegameApi.wegameApiStrings.search
import typingsJapgolly.wegameApi.wegameApiStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmHold extends StObject {
  
  /**
    * 当点击完成时键盘是否收起
    */
  var confirmHold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 键盘右下角 confirm 按钮的类型，只影响按钮的文本内容
    */
  var confirmType: js.UndefOr[done | next | search | go | send] = js.undefined
  
  /**
    * 键盘输入框显示的默认值
    */
  var defaultValue: String
  
  /**
    * 键盘中文本的最大长度
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * 是否为多行输入
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
}
object ConfirmHold {
  
  inline def apply(defaultValue: String): ConfirmHold = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmHold]
  }
  
  extension [Self <: ConfirmHold](x: Self) {
    
    inline def setConfirmHold(value: Boolean): Self = StObject.set(x, "confirmHold", value.asInstanceOf[js.Any])
    
    inline def setConfirmHoldUndefined: Self = StObject.set(x, "confirmHold", js.undefined)
    
    inline def setConfirmType(value: done | next | search | go | send): Self = StObject.set(x, "confirmType", value.asInstanceOf[js.Any])
    
    inline def setConfirmTypeUndefined: Self = StObject.set(x, "confirmType", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
