package typingsJapgolly.reactDevtoolsInline.commonsMod

import typingsJapgolly.reactDevtoolsInline.reactDevtoolsInlineStrings.`unknown-hook`
import typingsJapgolly.reactDevtoolsInline.reactDevtoolsInlineStrings.uncaught
import typingsJapgolly.reactDevtoolsInline.reactDevtoolsInlineStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementError
  - typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementFullData
  - typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementHydratedPath
  - typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementNoChange
  - typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementNotFound
*/
trait InspectedElementPayload extends StObject
object InspectedElementPayload {
  
  inline def InspectElementError(errorType: user | `unknown-hook` | uncaught, id: Double, message: String, responseID: Double): typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementError = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementError]
  }
  
  inline def InspectElementFullData(id: Double, responseID: Double, value: InspectedElement): typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementFullData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("full-data")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementFullData]
  }
  
  inline def InspectElementHydratedPath(id: Double, path: js.Array[String | Double], responseID: Double, value: Any): typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementHydratedPath = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hydrated-path")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementHydratedPath]
  }
  
  inline def InspectElementNoChange(id: Double, responseID: Double): typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementNoChange = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("no-change")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementNoChange]
  }
  
  inline def InspectElementNotFound(id: Double, responseID: Double): typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementNotFound = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], responseID = responseID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not-found")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.InspectElementNotFound]
  }
}
