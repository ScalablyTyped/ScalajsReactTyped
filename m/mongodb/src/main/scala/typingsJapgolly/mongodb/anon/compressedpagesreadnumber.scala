package typingsJapgolly.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  compressed pages read :number,   compressed pages written :number,   page written failed to compress :number,   page written was too small to compress :number,   raw compression call failed, additional data available :number,   raw compression call failed, no additional data available :number,   raw compression call succeeded :number} & bson.bson.Document */
trait compressedpagesreadnumber
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `compressed pages read`: Double
  
  var `compressed pages written`: Double
  
  var `page written failed to compress`: Double
  
  var `page written was too small to compress`: Double
  
  @JSName("raw compression call failed, additional data available")
  var `raw compression call failedComma additional data available`: Double
  
  @JSName("raw compression call failed, no additional data available")
  var `raw compression call failedComma no additional data available`: Double
  
  var `raw compression call succeeded`: Double
}
object compressedpagesreadnumber {
  
  inline def apply(
    `compressed pages read`: Double,
    `compressed pages written`: Double,
    `page written failed to compress`: Double,
    `page written was too small to compress`: Double,
    `raw compression call failedComma additional data available`: Double,
    `raw compression call failedComma no additional data available`: Double,
    `raw compression call succeeded`: Double
  ): compressedpagesreadnumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressed pages read")((`compressed pages read`).asInstanceOf[js.Any])
    __obj.updateDynamic("compressed pages written")((`compressed pages written`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written failed to compress")((`page written failed to compress`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written was too small to compress")((`page written was too small to compress`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, additional data available")((`raw compression call failedComma additional data available`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, no additional data available")((`raw compression call failedComma no additional data available`).asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call succeeded")((`raw compression call succeeded`).asInstanceOf[js.Any])
    __obj.asInstanceOf[compressedpagesreadnumber]
  }
  
  extension [Self <: compressedpagesreadnumber](x: Self) {
    
    inline def `setCompressed pages read`(value: Double): Self = StObject.set(x, "compressed pages read", value.asInstanceOf[js.Any])
    
    inline def `setCompressed pages written`(value: Double): Self = StObject.set(x, "compressed pages written", value.asInstanceOf[js.Any])
    
    inline def `setPage written failed to compress`(value: Double): Self = StObject.set(x, "page written failed to compress", value.asInstanceOf[js.Any])
    
    inline def `setPage written was too small to compress`(value: Double): Self = StObject.set(x, "page written was too small to compress", value.asInstanceOf[js.Any])
    
    inline def `setRaw compression call failedComma additional data available`(value: Double): Self = StObject.set(x, "raw compression call failed, additional data available", value.asInstanceOf[js.Any])
    
    inline def `setRaw compression call failedComma no additional data available`(value: Double): Self = StObject.set(x, "raw compression call failed, no additional data available", value.asInstanceOf[js.Any])
    
    inline def `setRaw compression call succeeded`(value: Double): Self = StObject.set(x, "raw compression call succeeded", value.asInstanceOf[js.Any])
  }
}
