package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`-1`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.confused
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  /**
    * @description The [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types) to add to the team discussion.
    * @enum {string}
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
}
object `62` {
  
  inline def apply(content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): `62` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
