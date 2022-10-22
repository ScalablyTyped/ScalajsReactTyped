package typingsJapgolly.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rollup.mod.EmittedAsset
  - typingsJapgolly.rollup.mod.EmittedChunk
*/
trait EmittedFile extends StObject
object EmittedFile {
  
  inline def EmittedAsset(): typingsJapgolly.rollup.mod.EmittedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[typingsJapgolly.rollup.mod.EmittedAsset]
  }
  
  inline def EmittedChunk(id: String): typingsJapgolly.rollup.mod.EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[typingsJapgolly.rollup.mod.EmittedChunk]
  }
}
