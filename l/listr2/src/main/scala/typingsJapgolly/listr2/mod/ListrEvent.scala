package typingsJapgolly.listr2.mod

import typingsJapgolly.listr2.anon.Duration
import typingsJapgolly.listr2.listr2Strings.DATA
import typingsJapgolly.listr2.listr2Strings.MESSAGE
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The internal communication event. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.listr2.anon.Data
  - typingsJapgolly.listr2.anon.Type
  - typingsJapgolly.listr2.anon.DataType
*/
trait ListrEvent extends StObject
object ListrEvent {
  
  inline def Data(`type`: Exclude[ListrEventType, MESSAGE | DATA]): typingsJapgolly.listr2.anon.Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.listr2.anon.Data]
  }
  
  inline def DataType(data: Duration, `type`: typingsJapgolly.listr2.mod.ListrEventType.MESSAGE): typingsJapgolly.listr2.anon.DataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.listr2.anon.DataType]
  }
  
  inline def Type(data: String, `type`: typingsJapgolly.listr2.mod.ListrEventType.DATA): typingsJapgolly.listr2.anon.Type = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.listr2.anon.Type]
  }
}
