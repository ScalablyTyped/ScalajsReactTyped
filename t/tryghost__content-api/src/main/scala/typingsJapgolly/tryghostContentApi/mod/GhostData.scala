package typingsJapgolly.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tryghostContentApi.mod.PostOrPage
  - typingsJapgolly.tryghostContentApi.mod.Author
  - typingsJapgolly.tryghostContentApi.mod.Tag
  - typingsJapgolly.tryghostContentApi.mod.Settings
*/
trait GhostData extends StObject
object GhostData {
  
  inline def Author(id: String, slug: String): typingsJapgolly.tryghostContentApi.mod.Author = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tryghostContentApi.mod.Author]
  }
  
  inline def PostOrPage(id: String, slug: String): typingsJapgolly.tryghostContentApi.mod.PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tryghostContentApi.mod.PostOrPage]
  }
  
  inline def Settings(): typingsJapgolly.tryghostContentApi.mod.Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.tryghostContentApi.mod.Settings]
  }
  
  inline def Tag(id: String, slug: String): typingsJapgolly.tryghostContentApi.mod.Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tryghostContentApi.mod.Tag]
  }
}
