package typingsJapgolly.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactEmailEditor.mod.SimpleSpecialLink
  - typingsJapgolly.reactEmailEditor.mod.GroupedSpecialLink
*/
trait SpecialLink extends StObject
object SpecialLink {
  
  inline def GroupedSpecialLink(
    name: String,
    specialLinks: js.Array[SimpleSpecialLink | typingsJapgolly.reactEmailEditor.mod.GroupedSpecialLink]
  ): typingsJapgolly.reactEmailEditor.mod.GroupedSpecialLink = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specialLinks = specialLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactEmailEditor.mod.GroupedSpecialLink]
  }
  
  inline def SimpleSpecialLink(href: String, name: String, target: String): typingsJapgolly.reactEmailEditor.mod.SimpleSpecialLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactEmailEditor.mod.SimpleSpecialLink]
  }
}
