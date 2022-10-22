package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxNode
  extends StObject
     with ISyntaxNodeOrToken {
  
  /* private */ var _data: Any = js.native
  
  /* private */ def computeData(): Any = js.native
  
  /* private */ def data(): Any = js.native
  
  def findCompleteTokenOnLeft(position: Double): PositionedToken = js.native
  def findCompleteTokenOnLeft(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  
  def findToken(position: Double): PositionedToken = js.native
  def findToken(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  
  /* private */ def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
  
  def findTokenOnLeft(position: Double): PositionedToken = js.native
  def findTokenOnLeft(position: Double, includeSkippedTokens: Boolean): PositionedToken = js.native
  
  def hasLeadingTrivia(): Boolean = js.native
  
  def hasTrailingTrivia(): Boolean = js.native
  
  def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
  
  def isClassElement(): Boolean = js.native
  
  def isExpression(): Boolean = js.native
  
  def isModuleElement(): Boolean = js.native
  
  def isStatement(): Boolean = js.native
  
  def isSwitchClause(): Boolean = js.native
  
  def isTypeMember(): Boolean = js.native
  
  def parsedInStrictMode(): Boolean = js.native
  
  def replaceToken(token1: ISyntaxToken, token2: ISyntaxToken): SyntaxNode = js.native
  
  def structuralEquals(node: SyntaxNode): Boolean = js.native
  
  def toJSON(key: Any): Any = js.native
  
  /* private */ def tryGetEndOfFileAt(position: Any): Any = js.native
}
