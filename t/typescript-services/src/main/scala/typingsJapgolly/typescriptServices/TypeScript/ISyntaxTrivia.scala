package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyntaxTrivia extends StObject {
  
  def fullText(): String
  
  def fullWidth(): Double
  
  def isComment(): Boolean
  
  def isNewLine(): Boolean
  
  def isSkippedToken(): Boolean
  
  def isWhitespace(): Boolean
  
  def kind(): SyntaxKind
  
  def skippedToken(): ISyntaxToken
}
object ISyntaxTrivia {
  
  inline def apply(
    fullText: CallbackTo[String],
    fullWidth: CallbackTo[Double],
    isComment: CallbackTo[Boolean],
    isNewLine: CallbackTo[Boolean],
    isSkippedToken: CallbackTo[Boolean],
    isWhitespace: CallbackTo[Boolean],
    kind: CallbackTo[SyntaxKind],
    skippedToken: CallbackTo[ISyntaxToken]
  ): ISyntaxTrivia = {
    val __obj = js.Dynamic.literal(fullText = fullText.toJsFn, fullWidth = fullWidth.toJsFn, isComment = isComment.toJsFn, isNewLine = isNewLine.toJsFn, isSkippedToken = isSkippedToken.toJsFn, isWhitespace = isWhitespace.toJsFn, kind = kind.toJsFn, skippedToken = skippedToken.toJsFn)
    __obj.asInstanceOf[ISyntaxTrivia]
  }
  
  extension [Self <: ISyntaxTrivia](x: Self) {
    
    inline def setFullText(value: CallbackTo[String]): Self = StObject.set(x, "fullText", value.toJsFn)
    
    inline def setFullWidth(value: CallbackTo[Double]): Self = StObject.set(x, "fullWidth", value.toJsFn)
    
    inline def setIsComment(value: CallbackTo[Boolean]): Self = StObject.set(x, "isComment", value.toJsFn)
    
    inline def setIsNewLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNewLine", value.toJsFn)
    
    inline def setIsSkippedToken(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSkippedToken", value.toJsFn)
    
    inline def setIsWhitespace(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWhitespace", value.toJsFn)
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setSkippedToken(value: CallbackTo[ISyntaxToken]): Self = StObject.set(x, "skippedToken", value.toJsFn)
  }
}
