package typingsJapgolly.redisBloom

import typingsJapgolly.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCuckooReserveMod {
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/RESERVE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/cuckoo/RESERVE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, capacity: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, capacity: Double, options: ReserveOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait ReserveOptions extends StObject {
    
    var BUCKETSIZE: js.UndefOr[Double] = js.undefined
    
    var EXPANSION: js.UndefOr[Double] = js.undefined
    
    var MAXITERATIONS: js.UndefOr[Double] = js.undefined
  }
  object ReserveOptions {
    
    inline def apply(): ReserveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReserveOptions]
    }
    
    extension [Self <: ReserveOptions](x: Self) {
      
      inline def setBUCKETSIZE(value: Double): Self = StObject.set(x, "BUCKETSIZE", value.asInstanceOf[js.Any])
      
      inline def setBUCKETSIZEUndefined: Self = StObject.set(x, "BUCKETSIZE", js.undefined)
      
      inline def setEXPANSION(value: Double): Self = StObject.set(x, "EXPANSION", value.asInstanceOf[js.Any])
      
      inline def setEXPANSIONUndefined: Self = StObject.set(x, "EXPANSION", js.undefined)
      
      inline def setMAXITERATIONS(value: Double): Self = StObject.set(x, "MAXITERATIONS", value.asInstanceOf[js.Any])
      
      inline def setMAXITERATIONSUndefined: Self = StObject.set(x, "MAXITERATIONS", js.undefined)
    }
  }
}
