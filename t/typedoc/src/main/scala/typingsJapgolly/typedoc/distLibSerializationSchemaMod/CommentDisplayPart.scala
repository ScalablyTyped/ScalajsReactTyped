package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedoc.anon.Kind
  - typingsJapgolly.typedoc.anon.Text
  - typingsJapgolly.typedoc.anon.Target
*/
trait CommentDisplayPart extends StObject
object CommentDisplayPart {
  
  inline def Kind(text: String): typingsJapgolly.typedoc.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = "text", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.anon.Kind]
  }
  
  inline def Target(tag: /* template literal string: @${string} */ String, text: String): typingsJapgolly.typedoc.anon.Target = {
    val __obj = js.Dynamic.literal(kind = "inline-tag", tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.anon.Target]
  }
  
  inline def Text(text: String): typingsJapgolly.typedoc.anon.Text = {
    val __obj = js.Dynamic.literal(kind = "code", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.anon.Text]
  }
}
