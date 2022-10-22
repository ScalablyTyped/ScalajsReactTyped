package typingsJapgolly.amapJsApiRiding

import typingsJapgolly.amapJsApiRiding.AMap.Riding.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap.Riding")
    @js.native
    open class Riding ()
      extends StObject
         with typingsJapgolly.amapJsApiRiding.AMap.Riding {
      def this(options: Options) = this()
    }
    
    @JSGlobal("AMap.RidingPolicy")
    @js.native
    object RidingPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.amapJsApiRiding.AMap.RidingPolicy & Double] = js.native
      
      /* 0 */ val DEFAULT: typingsJapgolly.amapJsApiRiding.AMap.RidingPolicy.DEFAULT & Double = js.native
      
      /* 2 */ val FASTEST: typingsJapgolly.amapJsApiRiding.AMap.RidingPolicy.FASTEST & Double = js.native
      
      /* 1 */ val RECOMMENDED: typingsJapgolly.amapJsApiRiding.AMap.RidingPolicy.RECOMMENDED & Double = js.native
    }
  }
}
