package typingsJapgolly.monacoEditor.anon

import typingsJapgolly.monacoEditor.mod.languages.IDocComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocComment extends StObject {
  
  var docComment: js.UndefOr[IDocComment] = js.undefined
}
object DocComment {
  
  inline def apply(): DocComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocComment]
  }
  
  extension [Self <: DocComment](x: Self) {
    
    inline def setDocComment(value: IDocComment): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    inline def setDocCommentUndefined: Self = StObject.set(x, "docComment", js.undefined)
  }
}
