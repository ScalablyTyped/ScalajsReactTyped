package typingsJapgolly.wordpressBlocks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockName extends StObject {
  
  var blockName: String
}
object BlockName {
  
  inline def apply(blockName: String): BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockName]
  }
  
  extension [Self <: BlockName](x: Self) {
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
  }
}
