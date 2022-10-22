package typingsJapgolly.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionicCliFramework.definitionsMod.TextFootnote
  - typingsJapgolly.ionicCliFramework.definitionsMod.LinkFootnote
*/
trait Footnote extends StObject
object Footnote {
  
  inline def LinkFootnote(id: String | Double, url: String): typingsJapgolly.ionicCliFramework.definitionsMod.LinkFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionicCliFramework.definitionsMod.LinkFootnote]
  }
  
  inline def TextFootnote(id: String | Double, text: String): typingsJapgolly.ionicCliFramework.definitionsMod.TextFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ionicCliFramework.definitionsMod.TextFootnote]
  }
}
