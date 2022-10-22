package typingsJapgolly.redisBloom

import typingsJapgolly.redisBloom.redisBloomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsBloomInsertMod {
  
  @JSImport("@redis/bloom/dist/commands/bloom/INSERT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/INSERT", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, items: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, items: String, options: InsertOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, items: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, items: js.Array[String], options: InsertOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: js.Array[Double]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
  
  trait InsertOptions extends StObject {
    
    var CAPACITY: js.UndefOr[Double] = js.undefined
    
    var ERROR: js.UndefOr[Double] = js.undefined
    
    var EXPANSION: js.UndefOr[Double] = js.undefined
    
    var NOCREATE: js.UndefOr[`true`] = js.undefined
    
    var NONSCALING: js.UndefOr[`true`] = js.undefined
  }
  object InsertOptions {
    
    inline def apply(): InsertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertOptions]
    }
    
    extension [Self <: InsertOptions](x: Self) {
      
      inline def setCAPACITY(value: Double): Self = StObject.set(x, "CAPACITY", value.asInstanceOf[js.Any])
      
      inline def setCAPACITYUndefined: Self = StObject.set(x, "CAPACITY", js.undefined)
      
      inline def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setERRORUndefined: Self = StObject.set(x, "ERROR", js.undefined)
      
      inline def setEXPANSION(value: Double): Self = StObject.set(x, "EXPANSION", value.asInstanceOf[js.Any])
      
      inline def setEXPANSIONUndefined: Self = StObject.set(x, "EXPANSION", js.undefined)
      
      inline def setNOCREATE(value: `true`): Self = StObject.set(x, "NOCREATE", value.asInstanceOf[js.Any])
      
      inline def setNOCREATEUndefined: Self = StObject.set(x, "NOCREATE", js.undefined)
      
      inline def setNONSCALING(value: `true`): Self = StObject.set(x, "NONSCALING", value.asInstanceOf[js.Any])
      
      inline def setNONSCALINGUndefined: Self = StObject.set(x, "NONSCALING", js.undefined)
    }
  }
}
