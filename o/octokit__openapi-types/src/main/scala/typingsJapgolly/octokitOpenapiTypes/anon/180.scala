package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `180` extends StObject {
  
  /**
    * @description The [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types) to add to the release.
    * @enum {string}
    */
  var content: Plussign1 | laugh | heart | hooray | rocket | eyes
}
object `180` {
  
  inline def apply(content: Plussign1 | laugh | heart | hooray | rocket | eyes): `180` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`180`]
  }
  
  extension [Self <: `180`](x: Self) {
    
    inline def setContent(value: Plussign1 | laugh | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
