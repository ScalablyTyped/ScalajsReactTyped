package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IMemberExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.INameSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxElement
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTrivia
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxVisitor
import typingsJapgolly.typescriptServices.TypeScript.ITokenInfo
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.Syntax.IFactory
import typingsJapgolly.typescriptServices.TypeScript.Syntax.NormalModeFactory
import typingsJapgolly.typescriptServices.TypeScript.Syntax.StrictModeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Syntax {
  
  @JSImport("typescript-services", "Syntax")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "Syntax.EmptySyntaxList")
  @js.native
  open class EmptySyntaxList ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.EmptySyntaxList {
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def findTokenInternal(
      parent: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
      position: Double,
      fullStart: Double
    ): typingsJapgolly.typescriptServices.TypeScript.PositionedToken = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def insertChildrenInto(array: js.Array[ISyntaxElement], index: Double): Unit = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[ISyntaxNodeOrToken] = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia")
  @js.native
  open class FixedWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* private */ /* CompleteClass */
    var _leadingTriviaInfo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _trailingTriviaInfo: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithLeadingTrivia")
  @js.native
  open class FixedWidthTokenWithLeadingTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* private */ /* CompleteClass */
    var _leadingTriviaInfo: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithNoTrivia")
  @js.native
  open class FixedWidthTokenWithNoTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithNoTrivia {
    def this(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind) = this()
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.FixedWidthTokenWithTrailingTrivia")
  @js.native
  open class FixedWidthTokenWithTrailingTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.FixedWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* private */ /* CompleteClass */
    var _trailingTriviaInfo: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.NormalModeFactory")
  @js.native
  open class NormalModeFactory_ ()
    extends StObject
       with NormalModeFactory {
    
    /* CompleteClass */
    override def argumentList(
      typeArgumentList: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax,
      openParenToken: ISyntaxToken,
      arguments: ISeparatedSyntaxList,
      closeParenToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ArrayTypeSyntax = js.native
    
    /* CompleteClass */
    override def binaryExpression(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      left: IExpressionSyntax,
      operatorToken: ISyntaxToken,
      right: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.BlockSyntax = js.native
    
    /* CompleteClass */
    override def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax = js.native
    
    /* CompleteClass */
    override def callSignature(
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax = js.native
    
    /* CompleteClass */
    override def caseSwitchClause(
      caseKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      colonToken: ISyntaxToken,
      statements: ISyntaxList
    ): typingsJapgolly.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def castExpression(
      lessThanToken: ISyntaxToken,
      `type`: ITypeSyntax,
      greaterThanToken: ISyntaxToken,
      expression: IUnaryExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.CastExpressionSyntax = js.native
    
    /* CompleteClass */
    override def catchClause(
      catchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      identifier: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      closeParenToken: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax = js.native
    
    /* CompleteClass */
    override def classDeclaration(
      modifiers: ISyntaxList,
      classKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      openBraceToken: ISyntaxToken,
      classElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def conditionalExpression(
      condition: IExpressionSyntax,
      questionToken: ISyntaxToken,
      whenTrue: IExpressionSyntax,
      colonToken: ISyntaxToken,
      whenFalse: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
    
    /* CompleteClass */
    override def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax = js.native
    
    /* CompleteClass */
    override def constructSignature(
      newKeyword: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ConstructSignatureSyntax = js.native
    
    /* CompleteClass */
    override def constructorDeclaration(
      modifiers: ISyntaxList,
      constructorKeyword: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def constructorType(
      newKeyword: ISyntaxToken,
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
    
    /* CompleteClass */
    override def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
    
    /* CompleteClass */
    override def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.DebuggerStatementSyntax = js.native
    
    /* CompleteClass */
    override def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.DeleteExpressionSyntax = js.native
    
    /* CompleteClass */
    override def doStatement(
      doKeyword: ISyntaxToken,
      statement: IStatementSyntax,
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.DoStatementSyntax = js.native
    
    /* CompleteClass */
    override def elementAccessExpression(
      expression: IExpressionSyntax,
      openBracketToken: ISyntaxToken,
      argumentExpression: IExpressionSyntax,
      closeBracketToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax = js.native
    
    /* CompleteClass */
    override def emptyStatement(semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.EmptyStatementSyntax = js.native
    
    /* CompleteClass */
    override def enumDeclaration(
      modifiers: ISyntaxList,
      enumKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      enumElements: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def enumElement(
      propertyName: ISyntaxToken,
      equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.EnumElementSyntax = js.native
    
    /* CompleteClass */
    override def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax = js.native
    
    /* CompleteClass */
    override def exportAssignment(
      exportKeyword: ISyntaxToken,
      equalsToken: ISyntaxToken,
      identifier: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ExpressionStatementSyntax = js.native
    
    /* CompleteClass */
    override def externalModuleReference(
      requireKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      stringLiteral: ISyntaxToken,
      closeParenToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ExternalModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def finallyClause(finallyKeyword: ISyntaxToken, block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax): typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax = js.native
    
    /* CompleteClass */
    override def forInStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
      left: IExpressionSyntax,
      inKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax = js.native
    
    /* CompleteClass */
    override def forStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
      initializer: IExpressionSyntax,
      firstSemicolonToken: ISyntaxToken,
      condition: IExpressionSyntax,
      secondSemicolonToken: ISyntaxToken,
      incrementor: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax = js.native
    
    /* CompleteClass */
    override def functionDeclaration(
      modifiers: ISyntaxList,
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def functionExpression(
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def functionPropertyAssignment(
      propertyName: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def functionType(
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
    
    /* CompleteClass */
    override def genericType(
      name: INameSyntax,
      typeArgumentList: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.GenericTypeSyntax = js.native
    
    /* CompleteClass */
    override def getAccessor(
      modifiers: ISyntaxList,
      getKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def heritageClause(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      extendsOrImplementsKeyword: ISyntaxToken,
      typeNames: ISeparatedSyntaxList
    ): typingsJapgolly.typescriptServices.TypeScript.HeritageClauseSyntax = js.native
    
    /* CompleteClass */
    override def ifStatement(
      ifKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax,
      elseClause: typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.IfStatementSyntax = js.native
    
    /* CompleteClass */
    override def importDeclaration(
      modifiers: ISyntaxList,
      importKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      equalsToken: ISyntaxToken,
      moduleReference: IModuleReferenceSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexMemberDeclaration(
      modifiers: ISyntaxList,
      indexSignature: typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexSignature(
      openBracketToken: ISyntaxToken,
      parameter: typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax,
      closeBracketToken: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
    
    /* CompleteClass */
    override def interfaceDeclaration(
      modifiers: ISyntaxList,
      interfaceKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      body: typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def invocationExpression(
      expression: IMemberExpressionSyntax,
      argumentList: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.InvocationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
    
    /* CompleteClass */
    override def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.MemberAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def memberFunctionDeclaration(
      modifiers: ISyntaxList,
      propertyName: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def memberVariableDeclaration(
      modifiers: ISyntaxList,
      variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def methodSignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
    
    /* CompleteClass */
    override def moduleDeclaration(
      modifiers: ISyntaxList,
      moduleKeyword: ISyntaxToken,
      name: INameSyntax,
      stringLiteral: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      moduleElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def moduleNameModuleReference(moduleName: INameSyntax): typingsJapgolly.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def objectCreationExpression(
      newKeyword: ISyntaxToken,
      expression: IMemberExpressionSyntax,
      argumentList: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectLiteralExpression(
      openBraceToken: ISyntaxToken,
      propertyAssignments: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
    
    /* CompleteClass */
    override def omittedExpression(): typingsJapgolly.typescriptServices.TypeScript.OmittedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parameter(
      dotDotDotToken: ISyntaxToken,
      modifiers: ISyntaxList,
      identifier: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax = js.native
    
    /* CompleteClass */
    override def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedArrowFunctionExpression(
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ParenthesizedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def postfixUnaryExpression(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      operand: IMemberExpressionSyntax,
      operatorToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def prefixUnaryExpression(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      operatorToken: ISyntaxToken,
      operand: IUnaryExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def propertySignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
    
    /* CompleteClass */
    override def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
    
    /* CompleteClass */
    override def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
    
    /* CompleteClass */
    override def setAccessor(
      modifiers: ISyntaxList,
      setKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def simpleArrowFunctionExpression(
      identifier: ISyntaxToken,
      equalsGreaterThanToken: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax = js.native
    
    /* CompleteClass */
    override def switchStatement(
      switchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      switchClauses: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
    
    /* CompleteClass */
    override def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
    
    /* CompleteClass */
    override def tryStatement(
      tryKeyword: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      catchClause: typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax,
      finallyClause: typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax = js.native
    
    /* CompleteClass */
    override def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
    
    /* CompleteClass */
    override def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeOfExpressionSyntax = js.native
    
    /* CompleteClass */
    override def typeParameter(
      identifier: ISyntaxToken,
      constraint: typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax = js.native
    
    /* CompleteClass */
    override def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
    
    /* CompleteClass */
    override def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeQuerySyntax = js.native
    
    /* CompleteClass */
    override def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def variableDeclarator(
      propertyName: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax = js.native
    
    /* CompleteClass */
    override def variableStatement(
      modifiers: ISyntaxList,
      variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax = js.native
    
    /* CompleteClass */
    override def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
    
    /* CompleteClass */
    override def whileStatement(
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.WhileStatementSyntax = js.native
    
    /* CompleteClass */
    override def withStatement(
      withKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.WithStatementSyntax = js.native
  }
  
  @JSImport("typescript-services", "Syntax.StrictModeFactory")
  @js.native
  open class StrictModeFactory_ ()
    extends StObject
       with StrictModeFactory {
    
    /* CompleteClass */
    override def argumentList(
      typeArgumentList: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax,
      openParenToken: ISyntaxToken,
      arguments: ISeparatedSyntaxList,
      closeParenToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ArrayTypeSyntax = js.native
    
    /* CompleteClass */
    override def binaryExpression(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      left: IExpressionSyntax,
      operatorToken: ISyntaxToken,
      right: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.BlockSyntax = js.native
    
    /* CompleteClass */
    override def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax = js.native
    
    /* CompleteClass */
    override def callSignature(
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax = js.native
    
    /* CompleteClass */
    override def caseSwitchClause(
      caseKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      colonToken: ISyntaxToken,
      statements: ISyntaxList
    ): typingsJapgolly.typescriptServices.TypeScript.CaseSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def castExpression(
      lessThanToken: ISyntaxToken,
      `type`: ITypeSyntax,
      greaterThanToken: ISyntaxToken,
      expression: IUnaryExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.CastExpressionSyntax = js.native
    
    /* CompleteClass */
    override def catchClause(
      catchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      identifier: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      closeParenToken: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax = js.native
    
    /* CompleteClass */
    override def classDeclaration(
      modifiers: ISyntaxList,
      classKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      openBraceToken: ISyntaxToken,
      classElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ClassDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def conditionalExpression(
      condition: IExpressionSyntax,
      questionToken: ISyntaxToken,
      whenTrue: IExpressionSyntax,
      colonToken: ISyntaxToken,
      whenFalse: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
    
    /* CompleteClass */
    override def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax = js.native
    
    /* CompleteClass */
    override def constructSignature(
      newKeyword: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ConstructSignatureSyntax = js.native
    
    /* CompleteClass */
    override def constructorDeclaration(
      modifiers: ISyntaxList,
      constructorKeyword: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ConstructorDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def constructorType(
      newKeyword: ISyntaxToken,
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax = js.native
    
    /* CompleteClass */
    override def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax = js.native
    
    /* CompleteClass */
    override def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.DebuggerStatementSyntax = js.native
    
    /* CompleteClass */
    override def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax = js.native
    
    /* CompleteClass */
    override def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.DeleteExpressionSyntax = js.native
    
    /* CompleteClass */
    override def doStatement(
      doKeyword: ISyntaxToken,
      statement: IStatementSyntax,
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.DoStatementSyntax = js.native
    
    /* CompleteClass */
    override def elementAccessExpression(
      expression: IExpressionSyntax,
      openBracketToken: ISyntaxToken,
      argumentExpression: IExpressionSyntax,
      closeBracketToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ElementAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax = js.native
    
    /* CompleteClass */
    override def emptyStatement(semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.EmptyStatementSyntax = js.native
    
    /* CompleteClass */
    override def enumDeclaration(
      modifiers: ISyntaxList,
      enumKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      enumElements: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def enumElement(
      propertyName: ISyntaxToken,
      equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.EnumElementSyntax = js.native
    
    /* CompleteClass */
    override def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax = js.native
    
    /* CompleteClass */
    override def exportAssignment(
      exportKeyword: ISyntaxToken,
      equalsToken: ISyntaxToken,
      identifier: ISyntaxToken,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ExpressionStatementSyntax = js.native
    
    /* CompleteClass */
    override def externalModuleReference(
      requireKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      stringLiteral: ISyntaxToken,
      closeParenToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ExternalModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def finallyClause(finallyKeyword: ISyntaxToken, block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax): typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax = js.native
    
    /* CompleteClass */
    override def forInStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
      left: IExpressionSyntax,
      inKeyword: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax = js.native
    
    /* CompleteClass */
    override def forStatement(
      forKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
      initializer: IExpressionSyntax,
      firstSemicolonToken: ISyntaxToken,
      condition: IExpressionSyntax,
      secondSemicolonToken: ISyntaxToken,
      incrementor: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax = js.native
    
    /* CompleteClass */
    override def functionDeclaration(
      modifiers: ISyntaxList,
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def functionExpression(
      functionKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def functionPropertyAssignment(
      propertyName: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def functionType(
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      `type`: ITypeSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax = js.native
    
    /* CompleteClass */
    override def genericType(
      name: INameSyntax,
      typeArgumentList: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.GenericTypeSyntax = js.native
    
    /* CompleteClass */
    override def getAccessor(
      modifiers: ISyntaxList,
      getKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def heritageClause(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      extendsOrImplementsKeyword: ISyntaxToken,
      typeNames: ISeparatedSyntaxList
    ): typingsJapgolly.typescriptServices.TypeScript.HeritageClauseSyntax = js.native
    
    /* CompleteClass */
    override def ifStatement(
      ifKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax,
      elseClause: typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.IfStatementSyntax = js.native
    
    /* CompleteClass */
    override def importDeclaration(
      modifiers: ISyntaxList,
      importKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      equalsToken: ISyntaxToken,
      moduleReference: IModuleReferenceSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexMemberDeclaration(
      modifiers: ISyntaxList,
      indexSignature: typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def indexSignature(
      openBracketToken: ISyntaxToken,
      parameter: typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax,
      closeBracketToken: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax = js.native
    
    /* CompleteClass */
    override def interfaceDeclaration(
      modifiers: ISyntaxList,
      interfaceKeyword: ISyntaxToken,
      identifier: ISyntaxToken,
      typeParameterList: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax,
      heritageClauses: ISyntaxList,
      body: typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def invocationExpression(
      expression: IMemberExpressionSyntax,
      argumentList: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.InvocationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): typingsJapgolly.typescriptServices.TypeScript.LabeledStatementSyntax = js.native
    
    /* CompleteClass */
    override def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.MemberAccessExpressionSyntax = js.native
    
    /* CompleteClass */
    override def memberFunctionDeclaration(
      modifiers: ISyntaxList,
      propertyName: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def memberVariableDeclaration(
      modifiers: ISyntaxList,
      variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def methodSignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax = js.native
    
    /* CompleteClass */
    override def moduleDeclaration(
      modifiers: ISyntaxList,
      moduleKeyword: ISyntaxToken,
      name: INameSyntax,
      stringLiteral: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      moduleElements: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def moduleNameModuleReference(moduleName: INameSyntax): typingsJapgolly.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax = js.native
    
    /* CompleteClass */
    override def objectCreationExpression(
      newKeyword: ISyntaxToken,
      expression: IMemberExpressionSyntax,
      argumentList: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectLiteralExpression(
      openBraceToken: ISyntaxToken,
      propertyAssignments: ISeparatedSyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
    
    /* CompleteClass */
    override def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax = js.native
    
    /* CompleteClass */
    override def omittedExpression(): typingsJapgolly.typescriptServices.TypeScript.OmittedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parameter(
      dotDotDotToken: ISyntaxToken,
      modifiers: ISyntaxList,
      identifier: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax = js.native
    
    /* CompleteClass */
    override def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedArrowFunctionExpression(
      callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax,
      equalsGreaterThanToken: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ParenthesizedExpressionSyntax = js.native
    
    /* CompleteClass */
    override def postfixUnaryExpression(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      operand: IMemberExpressionSyntax,
      operatorToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def prefixUnaryExpression(
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      operatorToken: ISyntaxToken,
      operand: IUnaryExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax = js.native
    
    /* CompleteClass */
    override def propertySignature(
      propertyName: ISyntaxToken,
      questionToken: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax = js.native
    
    /* CompleteClass */
    override def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.QualifiedNameSyntax = js.native
    
    /* CompleteClass */
    override def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ReturnStatementSyntax = js.native
    
    /* CompleteClass */
    override def setAccessor(
      modifiers: ISyntaxList,
      setKeyword: ISyntaxToken,
      propertyName: ISyntaxToken,
      parameterList: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax = js.native
    
    /* CompleteClass */
    override def simpleArrowFunctionExpression(
      identifier: ISyntaxToken,
      equalsGreaterThanToken: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      expression: IExpressionSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
    
    /* CompleteClass */
    override def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax = js.native
    
    /* CompleteClass */
    override def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax = js.native
    
    /* CompleteClass */
    override def switchStatement(
      switchKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      expression: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      openBraceToken: ISyntaxToken,
      switchClauses: ISyntaxList,
      closeBraceToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.SwitchStatementSyntax = js.native
    
    /* CompleteClass */
    override def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
    
    /* CompleteClass */
    override def tryStatement(
      tryKeyword: ISyntaxToken,
      block: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax,
      catchClause: typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax,
      finallyClause: typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax = js.native
    
    /* CompleteClass */
    override def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax = js.native
    
    /* CompleteClass */
    override def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax = js.native
    
    /* CompleteClass */
    override def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeOfExpressionSyntax = js.native
    
    /* CompleteClass */
    override def typeParameter(
      identifier: ISyntaxToken,
      constraint: typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax = js.native
    
    /* CompleteClass */
    override def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax = js.native
    
    /* CompleteClass */
    override def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): typingsJapgolly.typescriptServices.TypeScript.TypeQuerySyntax = js.native
    
    /* CompleteClass */
    override def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax = js.native
    
    /* CompleteClass */
    override def variableDeclarator(
      propertyName: ISyntaxToken,
      typeAnnotation: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax,
      equalsValueClause: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax = js.native
    
    /* CompleteClass */
    override def variableStatement(
      modifiers: ISyntaxList,
      variableDeclaration: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax,
      semicolonToken: ISyntaxToken
    ): typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax = js.native
    
    /* CompleteClass */
    override def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.VoidExpressionSyntax = js.native
    
    /* CompleteClass */
    override def whileStatement(
      whileKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.WhileStatementSyntax = js.native
    
    /* CompleteClass */
    override def withStatement(
      withKeyword: ISyntaxToken,
      openParenToken: ISyntaxToken,
      condition: IExpressionSyntax,
      closeParenToken: ISyntaxToken,
      statement: IStatementSyntax
    ): typingsJapgolly.typescriptServices.TypeScript.WithStatementSyntax = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia")
  @js.native
  open class VariableWidthTokenWithLeadingAndTrailingTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingAndTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double,
      trailingTriviaInfo: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* private */ /* CompleteClass */
    var _leadingTriviaInfo: Any = js.native
    
    /* private */ /* CompleteClass */
    var _trailingTriviaInfo: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithLeadingTrivia")
  @js.native
  open class VariableWidthTokenWithLeadingTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithLeadingTrivia {
    def this(
      fullText: String,
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      leadingTriviaInfo: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* private */ /* CompleteClass */
    var _leadingTriviaInfo: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithNoTrivia")
  @js.native
  open class VariableWidthTokenWithNoTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithNoTrivia {
    def this(fullText: String, kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  @JSImport("typescript-services", "Syntax.VariableWidthTokenWithTrailingTrivia")
  @js.native
  open class VariableWidthTokenWithTrailingTrivia protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.Syntax.VariableWidthTokenWithTrailingTrivia {
    def this(
      fullText: String,
      kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
      trailingTriviaInfo: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var _fullText: Any = js.native
    
    /* private */ /* CompleteClass */
    var _trailingTriviaInfo: Any = js.native
    
    /* CompleteClass */
    override def accept(visitor: ISyntaxVisitor): Any = js.native
    
    /* CompleteClass */
    override def childAt(index: Double): ISyntaxElement = js.native
    
    /* CompleteClass */
    override def childCount(): Double = js.native
    
    /* CompleteClass */
    override def collectTextElements(elements: js.Array[String]): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def findTokenInternal(parent: Any, position: Any, fullStart: Any): Any = js.native
    
    /* CompleteClass */
    override def firstToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def fullText(): String = js.native
    
    /* CompleteClass */
    override def fullWidth(): Double = js.native
    
    /* CompleteClass */
    override def hasLeadingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasLeadingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def hasSkippedToken(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingComment(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingNewLine(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingSkippedText(): Boolean = js.native
    
    /* CompleteClass */
    override def hasTrailingTrivia(): Boolean = js.native
    
    /* CompleteClass */
    override def isExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isIncrementallyUnusable(): Boolean = js.native
    
    /* CompleteClass */
    override def isList(): Boolean = js.native
    
    /* CompleteClass */
    override def isMemberExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isNode(): Boolean = js.native
    
    /* CompleteClass */
    override def isPostfixExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isPrimaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def isSeparatedList(): Boolean = js.native
    
    /* CompleteClass */
    override def isToken(): Boolean = js.native
    
    /* CompleteClass */
    override def isTypeScriptSpecific(): Boolean = js.native
    
    /* CompleteClass */
    override def isUnaryExpression(): Boolean = js.native
    
    /* CompleteClass */
    override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def lastToken(): ISyntaxToken = js.native
    
    /* CompleteClass */
    override def leadingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def leadingTriviaWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    override def realize(): Any = js.native
    
    /* CompleteClass */
    override def text(): String = js.native
    
    /* CompleteClass */
    override def toJSON(key: Any): Any = js.native
    
    /* CompleteClass */
    var tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
    
    /* CompleteClass */
    override def trailingTrivia(): ISyntaxTriviaList = js.native
    
    /* CompleteClass */
    override def trailingTriviaWidth(): Double = js.native
    
    /* CompleteClass */
    override def value(): Any = js.native
    
    /* CompleteClass */
    override def valueText(): String = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
    
    /* CompleteClass */
    override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
    
    /* CompleteClass */
    override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  }
  
  inline def assignmentExpression(left: IExpressionSyntax, token: ISyntaxToken, right: IExpressionSyntax): typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax = (^.asInstanceOf[js.Dynamic].applyDynamic("assignmentExpression")(left.asInstanceOf[js.Any], token.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax]
  
  @JSImport("typescript-services", "Syntax.carriageReturnLineFeedTrivia")
  @js.native
  def carriageReturnLineFeedTrivia: ISyntaxTrivia = js.native
  inline def carriageReturnLineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carriageReturnLineFeedTrivia")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.carriageReturnTrivia")
  @js.native
  def carriageReturnTrivia: ISyntaxTrivia = js.native
  inline def carriageReturnTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carriageReturnTrivia")(x.asInstanceOf[js.Any])
  
  inline def childIndex(parent: ISyntaxElement, child: ISyntaxElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("childIndex")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def childOffset(parent: ISyntaxElement, child: ISyntaxElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("childOffset")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def childOffsetAt(parent: ISyntaxElement, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("childOffsetAt")(parent.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def convertToIdentifierName(token: ISyntaxToken): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToIdentifierName")(token.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  inline def deferredTrivia(
    kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind,
    text: ISimpleText,
    fullStart: Double,
    fullWidth: Double
  ): ISyntaxTrivia = (^.asInstanceOf[js.Dynamic].applyDynamic("deferredTrivia")(kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any], fullStart.asInstanceOf[js.Any], fullWidth.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTrivia]
  
  inline def elementStructuralEquals(element1: ISyntaxElement, element2: ISyntaxElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementStructuralEquals")(element1.asInstanceOf[js.Any], element2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("typescript-services", "Syntax.emptyList")
  @js.native
  def emptyList: ISyntaxList = js.native
  inline def emptyList_=(x: ISyntaxList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyList")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Syntax.emptySeparatedList")
  @js.native
  def emptySeparatedList: ISeparatedSyntaxList = js.native
  inline def emptySeparatedList_=(x: ISeparatedSyntaxList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySeparatedList")(x.asInstanceOf[js.Any])
  
  inline def emptySourceUnit(): typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("emptySourceUnit")().asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax]
  
  inline def emptyToken(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyToken")(kind.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  @JSImport("typescript-services", "Syntax.emptyTriviaList")
  @js.native
  def emptyTriviaList: ISyntaxTriviaList = js.native
  inline def emptyTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyTriviaList")(x.asInstanceOf[js.Any])
  
  inline def falseExpression(): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("falseExpression")().asInstanceOf[IUnaryExpressionSyntax]
  
  inline def findSkippedTokenInLeadingTriviaList(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken, position: Double): typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenInLeadingTriviaList")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken]
  
  inline def findSkippedTokenInPositionedToken(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken, position: Double): typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenInPositionedToken")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken]
  
  inline def findSkippedTokenInTrailingTriviaList(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken, position: Double): typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenInTrailingTriviaList")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken]
  
  inline def findSkippedTokenOnLeft(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken, position: Double): typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("findSkippedTokenOnLeft")(positionedToken.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedSkippedToken]
  
  inline def getAncestorOfKind(
    positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
  ): typingsJapgolly.typescriptServices.TypeScript.PositionedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getAncestorOfKind")(positionedToken.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedElement]
  
  inline def getStandaloneExpression(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken): typingsJapgolly.typescriptServices.TypeScript.PositionedNodeOrToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getStandaloneExpression")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PositionedNodeOrToken]
  
  inline def hasAncestorOfKind(
    positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedElement,
    kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAncestorOfKind")(positionedToken.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def identifier(text: String): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  inline def identifier(text: String, info: ITokenInfo): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(text.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  inline def identifierName(text: String): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  inline def identifierName(text: String, info: ITokenInfo): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(text.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  inline def isEntirelyInStringOrRegularExpressionLiteral(sourceUnit: typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelyInStringOrRegularExpressionLiteral")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEntirelyInsideComment(sourceUnit: typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelyInsideComment")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEntirelyInsideCommentTrivia(trivia: ISyntaxTrivia, fullStart: Double, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEntirelyInsideCommentTrivia")(trivia.asInstanceOf[js.Any], fullStart.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExpression(token: ISyntaxToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInModuleOrTypeContext(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInModuleOrTypeContext")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInTypeOnlyContext(positionedToken: typingsJapgolly.typescriptServices.TypeScript.PositionedToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTypeOnlyContext")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegerLiteral(expression: IExpressionSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerLiteral")(expression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuperInvocationExpression(node: IExpressionSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperInvocationExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuperInvocationExpressionStatement(node: typingsJapgolly.typescriptServices.TypeScript.SyntaxNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperInvocationExpressionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuperMemberAccessExpression(node: IExpressionSyntax): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperMemberAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSuperMemberAccessInvocationExpression(node: typingsJapgolly.typescriptServices.TypeScript.SyntaxNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuperMemberAccessInvocationExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnterminatedMultilineCommentTrivia(trivia: ISyntaxTrivia): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnterminatedMultilineCommentTrivia")(trivia.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnterminatedStringLiteral(token: ISyntaxToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnterminatedStringLiteral")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("typescript-services", "Syntax.lineFeedTrivia")
  @js.native
  def lineFeedTrivia: ISyntaxTrivia = js.native
  inline def lineFeedTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineFeedTrivia")(x.asInstanceOf[js.Any])
  
  inline def list(nodes: js.Array[ISyntaxNodeOrToken]): ISyntaxList = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(nodes.asInstanceOf[js.Any]).asInstanceOf[ISyntaxList]
  
  inline def listStructuralEquals(list1: ISyntaxList, list2: ISyntaxList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listStructuralEquals")(list1.asInstanceOf[js.Any], list2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def massageEscapes(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("massageEscapes")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def multiLineComment(text: String): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("multiLineComment")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  inline def nodeHasSkippedOrMissingTokens(node: typingsJapgolly.typescriptServices.TypeScript.SyntaxNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHasSkippedOrMissingTokens")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nodeOrTokenStructuralEquals(node1: ISyntaxNodeOrToken, node2: ISyntaxNodeOrToken): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeOrTokenStructuralEquals")(node1.asInstanceOf[js.Any], node2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nodeStructuralEquals(
    node1: typingsJapgolly.typescriptServices.TypeScript.SyntaxNode,
    node2: typingsJapgolly.typescriptServices.TypeScript.SyntaxNode
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeStructuralEquals")(node1.asInstanceOf[js.Any], node2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("typescript-services", "Syntax.normalModeFactory")
  @js.native
  def normalModeFactory: IFactory = js.native
  inline def normalModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalModeFactory")(x.asInstanceOf[js.Any])
  
  inline def numericLiteralExpression(text: String): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("numericLiteralExpression")(text.asInstanceOf[js.Any]).asInstanceOf[IUnaryExpressionSyntax]
  
  inline def realizeToken(token: ISyntaxToken): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("realizeToken")(token.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  
  inline def separatedList(nodes: js.Array[ISyntaxNodeOrToken]): ISeparatedSyntaxList = ^.asInstanceOf[js.Dynamic].applyDynamic("separatedList")(nodes.asInstanceOf[js.Any]).asInstanceOf[ISeparatedSyntaxList]
  
  inline def separatedListStructuralEquals(list1: ISeparatedSyntaxList, list2: ISeparatedSyntaxList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("separatedListStructuralEquals")(list1.asInstanceOf[js.Any], list2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def singleLineComment(text: String): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("singleLineComment")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  inline def skippedTokenTrivia(token: ISyntaxToken): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("skippedTokenTrivia")(token.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  @JSImport("typescript-services", "Syntax.spaceTrivia")
  @js.native
  def spaceTrivia: ISyntaxTrivia = js.native
  
  @JSImport("typescript-services", "Syntax.spaceTriviaList")
  @js.native
  def spaceTriviaList: ISyntaxTriviaList = js.native
  inline def spaceTriviaList_=(x: ISyntaxTriviaList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceTriviaList")(x.asInstanceOf[js.Any])
  
  inline def spaceTrivia_=(x: ISyntaxTrivia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceTrivia")(x.asInstanceOf[js.Any])
  
  inline def spaces(count: Double): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("spaces")(count.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
  
  inline def splitMultiLineCommentTriviaIntoMultipleLines(trivia: ISyntaxTrivia): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitMultiLineCommentTriviaIntoMultipleLines")(trivia.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("typescript-services", "Syntax.strictModeFactory")
  @js.native
  def strictModeFactory: IFactory = js.native
  inline def strictModeFactory_=(x: IFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strictModeFactory")(x.asInstanceOf[js.Any])
  
  inline def stringLiteralExpression(text: String): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLiteralExpression")(text.asInstanceOf[js.Any]).asInstanceOf[IUnaryExpressionSyntax]
  
  inline def token(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(kind.asInstanceOf[js.Any]).asInstanceOf[ISyntaxToken]
  inline def token(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind, info: ITokenInfo): ISyntaxToken = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(kind.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[ISyntaxToken]
  
  inline def tokenStructuralEquals(token1: ISyntaxToken, token2: ISyntaxToken): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenStructuralEquals")(token1.asInstanceOf[js.Any], token2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tokenToJSON(token: ISyntaxToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenToJSON")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def trivia(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind, text: String): ISyntaxTrivia = (^.asInstanceOf[js.Dynamic].applyDynamic("trivia")(kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[ISyntaxTrivia]
  
  inline def triviaList(trivia: js.Array[ISyntaxTrivia]): ISyntaxTriviaList = ^.asInstanceOf[js.Dynamic].applyDynamic("triviaList")(trivia.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTriviaList]
  
  inline def triviaListStructuralEquals(triviaList1: ISyntaxTriviaList, triviaList2: ISyntaxTriviaList): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("triviaListStructuralEquals")(triviaList1.asInstanceOf[js.Any], triviaList2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def triviaStructuralEquals(trivia1: ISyntaxTrivia, trivia2: ISyntaxTrivia): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("triviaStructuralEquals")(trivia1.asInstanceOf[js.Any], trivia2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def trueExpression(): IUnaryExpressionSyntax = ^.asInstanceOf[js.Dynamic].applyDynamic("trueExpression")().asInstanceOf[IUnaryExpressionSyntax]
  
  inline def value(token: ISyntaxToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def valueText(token: ISyntaxToken): String = ^.asInstanceOf[js.Dynamic].applyDynamic("valueText")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def whitespace(text: String): ISyntaxTrivia = ^.asInstanceOf[js.Dynamic].applyDynamic("whitespace")(text.asInstanceOf[js.Any]).asInstanceOf[ISyntaxTrivia]
}
