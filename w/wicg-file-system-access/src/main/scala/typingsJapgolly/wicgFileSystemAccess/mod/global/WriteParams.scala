package typingsJapgolly.wicgFileSystemAccess.mod.global

import org.scalajs.dom.Blob
import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wicgFileSystemAccess.anon.Data
  - typingsJapgolly.wicgFileSystemAccess.anon.Position
  - typingsJapgolly.wicgFileSystemAccess.anon.Size
*/
trait WriteParams extends StObject
object WriteParams {
  
  inline def Data(data: BufferSource | Blob | String): typingsJapgolly.wicgFileSystemAccess.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("write")
    __obj.asInstanceOf[typingsJapgolly.wicgFileSystemAccess.anon.Data]
  }
  
  inline def Position(position: Double): typingsJapgolly.wicgFileSystemAccess.anon.Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("seek")
    __obj.asInstanceOf[typingsJapgolly.wicgFileSystemAccess.anon.Position]
  }
  
  inline def Size(size: Double): typingsJapgolly.wicgFileSystemAccess.anon.Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("truncate")
    __obj.asInstanceOf[typingsJapgolly.wicgFileSystemAccess.anon.Size]
  }
}
