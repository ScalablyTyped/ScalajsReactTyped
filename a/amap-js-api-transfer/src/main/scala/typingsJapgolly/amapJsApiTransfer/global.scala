package typingsJapgolly.amapJsApiTransfer

import typingsJapgolly.amapJsApiTransfer.AMap.Transfer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Transfer")
    @js.native
    open class Transfer protected ()
      extends StObject
         with typingsJapgolly.amapJsApiTransfer.AMap.Transfer {
      /**
        * 公交换乘服务
        * @param options 构造函数选项
        */
      def this(options: Options) = this()
    }
    
    @JSGlobal("AMap.TransferPolicy")
    @js.native
    object TransferPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy & Double] = js.native
      
      /* 1 */ val LEAST_FEE: typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy.LEAST_FEE & Double = js.native
      
      /* 0 */ val LEAST_TIME: typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy.LEAST_TIME & Double = js.native
      
      /* 2 */ val LEAST_TRANSFER: typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy.LEAST_TRANSFER & Double = js.native
      
      /* 3 */ val LEAST_WALK: typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy.LEAST_WALK & Double = js.native
      
      /* 4 */ val MOST_COMFORT: typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy.MOST_COMFORT & Double = js.native
      
      /* 5 */ val NO_SUBWAY: typingsJapgolly.amapJsApiTransfer.AMap.TransferPolicy.NO_SUBWAY & Double = js.native
    }
  }
}
