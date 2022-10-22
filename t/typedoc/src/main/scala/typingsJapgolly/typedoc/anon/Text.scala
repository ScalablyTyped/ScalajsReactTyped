package typingsJapgolly.typedoc.anon

import typingsJapgolly.typedoc.distLibSerializationSchemaMod.CommentDisplayPart
import typingsJapgolly.typedoc.typedocStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with CommentDisplayPart
     with typingsJapgolly.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart {
  
  var kind: code
  
  var text: String
}
object Text {
  
  inline def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(kind = "code", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setKind(value: code): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
