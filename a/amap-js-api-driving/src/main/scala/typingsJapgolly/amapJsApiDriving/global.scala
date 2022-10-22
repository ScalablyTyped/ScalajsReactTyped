package typingsJapgolly.amapJsApiDriving

import typingsJapgolly.amapJsApiDriving.AMap.Driving.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Driving")
    @js.native
    /**
      * 驾车路线规划服务
      * @param options 自定义选项
      */
    open class Driving ()
      extends StObject
         with typingsJapgolly.amapJsApiDriving.AMap.Driving {
      def this(options: Options) = this()
    }
    
    @JSGlobal("AMap.DrivingPolicy")
    @js.native
    object DrivingPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy & Double] = js.native
      
      /* 7 */ val FEE_HIGHWAY: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.FEE_HIGHWAY & Double = js.native
      
      /* 8 */ val FEE_TRAFFIC: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.FEE_TRAFFIC & Double = js.native
      
      /* 6 */ val HIGHWAY: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.HIGHWAY & Double = js.native
      
      /* 2 */ val LEAST_DISTANCE: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.LEAST_DISTANCE & Double = js.native
      
      /* 1 */ val LEAST_FEE: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.LEAST_FEE & Double = js.native
      
      /* 0 */ val LEAST_TIME: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.LEAST_TIME & Double = js.native
      
      /* 5 */ val MULTI_POLICIES: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.MULTI_POLICIES & Double = js.native
      
      /* 4 */ val REAL_TRAFFIC: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.REAL_TRAFFIC & Double = js.native
      
      /* 9 */ val TRAFFIC_HIGHWAY: typingsJapgolly.amapJsApiDriving.AMap.DrivingPolicy.TRAFFIC_HIGHWAY & Double = js.native
    }
  }
}
