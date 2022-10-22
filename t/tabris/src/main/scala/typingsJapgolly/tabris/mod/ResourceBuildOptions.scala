package typingsJapgolly.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabris.anon.Type[ResourceType]
  - typingsJapgolly.tabris.anon.Validator[ResourceType]
*/
trait ResourceBuildOptions[ResourceType] extends StObject
object ResourceBuildOptions {
  
  inline def Type[ResourceType](validator: Any => /* is ResourceType */ Boolean): typingsJapgolly.tabris.anon.Type[ResourceType] = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.asInstanceOf[typingsJapgolly.tabris.anon.Type[ResourceType]]
  }
  
  inline def Validator[ResourceType](`type`: Constructor[ResourceType]): typingsJapgolly.tabris.anon.Validator[ResourceType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tabris.anon.Validator[ResourceType]]
  }
}
