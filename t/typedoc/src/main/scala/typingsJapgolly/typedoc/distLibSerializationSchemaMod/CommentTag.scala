package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.CommentTag, 'tag' | 'name'> */
trait CommentTag extends StObject {
  
  var content: js.Array[CommentDisplayPart]
  
  var name: ToSerialized[js.UndefOr[String]]
  
  var tag: ToSerialized[/* template literal string: @${string} */ String]
}
object CommentTag {
  
  inline def apply(
    content: js.Array[CommentDisplayPart],
    name: ToSerialized[js.UndefOr[String]],
    tag: ToSerialized[/* template literal string: @${string} */ String]
  ): CommentTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTag]
  }
  
  extension [Self <: CommentTag](x: Self) {
    
    inline def setContent(value: js.Array[CommentDisplayPart]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: CommentDisplayPart*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setName(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTag(value: ToSerialized[/* template literal string: @${string} */ String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
