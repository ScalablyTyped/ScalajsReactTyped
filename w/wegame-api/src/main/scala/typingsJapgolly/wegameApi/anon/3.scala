package typingsJapgolly.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  /**
    * 取值为0或1，取值为0时会把 App、Page 的生命周期函数和 wx 命名空间下的函数调用写入日志，取值为1则不会。
    * 默认值是 0
    */
  var level: js.UndefOr[
    typingsJapgolly.wegameApi.wegameApiInts.`0` | typingsJapgolly.wegameApi.wegameApiInts.`1`
  ] = js.undefined
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setLevel(value: typingsJapgolly.wegameApi.wegameApiInts.`0` | typingsJapgolly.wegameApi.wegameApiInts.`1`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
