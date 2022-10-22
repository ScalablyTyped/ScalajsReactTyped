package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.anon.TagName
  - typingsJapgolly.angularCompiler.anon.Text
*/
trait JSDocTag extends StObject
object JSDocTag {
  
  inline def TagName(tagName: JSDocTagName | String): typingsJapgolly.angularCompiler.anon.TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.anon.TagName]
  }
  
  inline def Text(tagName: Unit, text: String): typingsJapgolly.angularCompiler.anon.Text = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.anon.Text]
  }
}
