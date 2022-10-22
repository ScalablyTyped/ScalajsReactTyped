package typingsJapgolly.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PastLogsOptions
  extends StObject
     with LogsOptions {
  
  var toBlock: js.UndefOr[BlockNumber] = js.undefined
}
object PastLogsOptions {
  
  inline def apply(): PastLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PastLogsOptions]
  }
  
  extension [Self <: PastLogsOptions](x: Self) {
    
    inline def setToBlock(value: BlockNumber): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
    
    inline def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
  }
}
