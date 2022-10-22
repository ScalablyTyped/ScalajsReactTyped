package typingsJapgolly.sucrase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sucrase.distTypesHelperManagerMod.HelperManager
import typingsJapgolly.sucrase.distTypesParserTokenizerKeywordsMod.ContextualKeyword
import typingsJapgolly.sucrase.distTypesParserTokenizerMod.Token
import typingsJapgolly.sucrase.distTypesParserTokenizerTypesMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokenProcessorMod {
  
  @JSImport("sucrase/dist/types/TokenProcessor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TokenProcessor {
    def this(
      code: String,
      tokens: js.Array[Token],
      isFlowEnabled: Boolean,
      disableESTransforms: Boolean,
      helperManager: HelperManager
    ) = this()
    
    /* CompleteClass */
    override def appendCode(code: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    var appendTokenPrefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var appendTokenSuffix: Any = js.native
    
    /* CompleteClass */
    override val code: String = js.native
    
    /* CompleteClass */
    override def copyExpectedToken(tokenType: TokenType): Unit = js.native
    
    /* CompleteClass */
    override def copyToken(): Unit = js.native
    
    /* CompleteClass */
    override def copyTokenWithPrefix(prefix: String): Unit = js.native
    
    /* CompleteClass */
    override def currentIndex(): Double = js.native
    
    /* CompleteClass */
    override def currentToken(): Token = js.native
    
    /* CompleteClass */
    override def currentTokenCode(): String = js.native
    
    /**
      * Remove and return the code generated since the snapshot, leaving the
      * current token position in-place. Unlike most TokenProcessor operations,
      * this operation can result in input/output line number mismatches because
      * the removed code may contain newlines, so this operation should be used
      * sparingly.
      */
    /* CompleteClass */
    override def dangerouslyGetAndRemoveCodeSinceSnapshot(snapshot: TokenProcessorSnapshot): String = js.native
    
    /* CompleteClass */
    override val disableESTransforms: Boolean = js.native
    
    /* CompleteClass */
    override def finish(): String = js.native
    
    /* CompleteClass */
    override val helperManager: HelperManager = js.native
    
    /* CompleteClass */
    override def identifierName(): String = js.native
    
    /* CompleteClass */
    override def identifierNameAtIndex(index: Double): String = js.native
    
    /* CompleteClass */
    override def identifierNameAtRelativeIndex(relativeIndex: Double): String = js.native
    
    /* CompleteClass */
    override def identifierNameForToken(token: Token): String = js.native
    
    /* CompleteClass */
    override def isAtEnd(): Boolean = js.native
    
    /* CompleteClass */
    override val isFlowEnabled: Boolean = js.native
    
    /* CompleteClass */
    override def matches1(t1: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches1AtIndex(index: Double, t1: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches2(t1: TokenType, t2: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches2AtIndex(index: Double, t1: TokenType, t2: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches3(t1: TokenType, t2: TokenType, t3: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches3AtIndex(index: Double, t1: TokenType, t2: TokenType, t3: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches4(t1: TokenType, t2: TokenType, t3: TokenType, t4: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matches5(t1: TokenType, t2: TokenType, t3: TokenType, t4: TokenType, t5: TokenType): Boolean = js.native
    
    /* CompleteClass */
    override def matchesContextIdAndLabel(`type`: TokenType, contextId: Double): Boolean = js.native
    
    /* CompleteClass */
    override def matchesContextual(contextualKeyword: ContextualKeyword): Boolean = js.native
    
    /* CompleteClass */
    override def matchesContextualAtIndex(index: Double, contextualKeyword: ContextualKeyword): Boolean = js.native
    
    /**
      * Move to the next token. Only suitable in preprocessing steps. When
      * generating new code, you should use copyToken or removeToken.
      */
    /* CompleteClass */
    override def nextToken(): Unit = js.native
    
    /* CompleteClass */
    override def previousToken(): Unit = js.native
    
    /* CompleteClass */
    override def previousWhitespaceAndComments(): String = js.native
    
    /* CompleteClass */
    override def rawCodeForToken(token: Token): String = js.native
    
    /**
      * Remove all code until the next }, accounting for balanced braces.
      */
    /* CompleteClass */
    override def removeBalancedCode(): Unit = js.native
    
    /* CompleteClass */
    override def removeInitialToken(): Unit = js.native
    
    /* CompleteClass */
    override def removeToken(): Unit = js.native
    
    /* CompleteClass */
    override def replaceToken(newCode: String): Unit = js.native
    
    /* CompleteClass */
    override def replaceTokenTrimmingLeftWhitespace(newCode: String): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def restoreToSnapshot(snapshot: TokenProcessorSnapshot): Unit = js.native
    
    /* private */ /* CompleteClass */
    var resultCode: Any = js.native
    
    /**
      * Make a new TokenProcessor for things like lookahead.
      */
    /* CompleteClass */
    override def snapshot(): TokenProcessorSnapshot = js.native
    
    /* CompleteClass */
    override def stringValue(): String = js.native
    
    /* CompleteClass */
    override def stringValueAtIndex(index: Double): String = js.native
    
    /* CompleteClass */
    override def stringValueForToken(token: Token): String = js.native
    
    /* CompleteClass */
    override def tokenAtRelativeIndex(relativeIndex: Double): Token = js.native
    
    /* private */ /* CompleteClass */
    var tokenIndex: Any = js.native
    
    /* CompleteClass */
    override val tokens: js.Array[Token] = js.native
  }
  
  trait TokenProcessor extends StObject {
    
    def appendCode(code: String): Unit
    
    /* private */ var appendTokenPrefix: Any
    
    /* private */ var appendTokenSuffix: Any
    
    val code: String
    
    def copyExpectedToken(tokenType: TokenType): Unit
    
    def copyToken(): Unit
    
    def copyTokenWithPrefix(prefix: String): Unit
    
    def currentIndex(): Double
    
    def currentToken(): Token
    
    def currentTokenCode(): String
    
    /**
      * Remove and return the code generated since the snapshot, leaving the
      * current token position in-place. Unlike most TokenProcessor operations,
      * this operation can result in input/output line number mismatches because
      * the removed code may contain newlines, so this operation should be used
      * sparingly.
      */
    def dangerouslyGetAndRemoveCodeSinceSnapshot(snapshot: TokenProcessorSnapshot): String
    
    val disableESTransforms: Boolean
    
    def finish(): String
    
    val helperManager: HelperManager
    
    def identifierName(): String
    
    def identifierNameAtIndex(index: Double): String
    
    def identifierNameAtRelativeIndex(relativeIndex: Double): String
    
    def identifierNameForToken(token: Token): String
    
    def isAtEnd(): Boolean
    
    val isFlowEnabled: Boolean
    
    def matches1(t1: TokenType): Boolean
    
    def matches1AtIndex(index: Double, t1: TokenType): Boolean
    
    def matches2(t1: TokenType, t2: TokenType): Boolean
    
    def matches2AtIndex(index: Double, t1: TokenType, t2: TokenType): Boolean
    
    def matches3(t1: TokenType, t2: TokenType, t3: TokenType): Boolean
    
    def matches3AtIndex(index: Double, t1: TokenType, t2: TokenType, t3: TokenType): Boolean
    
    def matches4(t1: TokenType, t2: TokenType, t3: TokenType, t4: TokenType): Boolean
    
    def matches5(t1: TokenType, t2: TokenType, t3: TokenType, t4: TokenType, t5: TokenType): Boolean
    
    def matchesContextIdAndLabel(`type`: TokenType, contextId: Double): Boolean
    
    def matchesContextual(contextualKeyword: ContextualKeyword): Boolean
    
    def matchesContextualAtIndex(index: Double, contextualKeyword: ContextualKeyword): Boolean
    
    /**
      * Move to the next token. Only suitable in preprocessing steps. When
      * generating new code, you should use copyToken or removeToken.
      */
    def nextToken(): Unit
    
    def previousToken(): Unit
    
    def previousWhitespaceAndComments(): String
    
    def rawCodeForToken(token: Token): String
    
    /**
      * Remove all code until the next }, accounting for balanced braces.
      */
    def removeBalancedCode(): Unit
    
    def removeInitialToken(): Unit
    
    def removeToken(): Unit
    
    def replaceToken(newCode: String): Unit
    
    def replaceTokenTrimmingLeftWhitespace(newCode: String): Unit
    
    def reset(): Unit
    
    def restoreToSnapshot(snapshot: TokenProcessorSnapshot): Unit
    
    /* private */ var resultCode: Any
    
    /**
      * Make a new TokenProcessor for things like lookahead.
      */
    def snapshot(): TokenProcessorSnapshot
    
    def stringValue(): String
    
    def stringValueAtIndex(index: Double): String
    
    def stringValueForToken(token: Token): String
    
    def tokenAtRelativeIndex(relativeIndex: Double): Token
    
    /* private */ var tokenIndex: Any
    
    val tokens: js.Array[Token]
  }
  object TokenProcessor {
    
    inline def apply(
      appendCode: String => Callback,
      appendTokenPrefix: Any,
      appendTokenSuffix: Any,
      code: String,
      copyExpectedToken: TokenType => Callback,
      copyToken: Callback,
      copyTokenWithPrefix: String => Callback,
      currentIndex: CallbackTo[Double],
      currentToken: CallbackTo[Token],
      currentTokenCode: CallbackTo[String],
      dangerouslyGetAndRemoveCodeSinceSnapshot: TokenProcessorSnapshot => String,
      disableESTransforms: Boolean,
      finish: CallbackTo[String],
      helperManager: HelperManager,
      identifierName: CallbackTo[String],
      identifierNameAtIndex: Double => String,
      identifierNameAtRelativeIndex: Double => String,
      identifierNameForToken: Token => String,
      isAtEnd: CallbackTo[Boolean],
      isFlowEnabled: Boolean,
      matches1: TokenType => Boolean,
      matches1AtIndex: (Double, TokenType) => Boolean,
      matches2: (TokenType, TokenType) => Boolean,
      matches2AtIndex: (Double, TokenType, TokenType) => Boolean,
      matches3: (TokenType, TokenType, TokenType) => Boolean,
      matches3AtIndex: (Double, TokenType, TokenType, TokenType) => Boolean,
      matches4: (TokenType, TokenType, TokenType, TokenType) => Boolean,
      matches5: (TokenType, TokenType, TokenType, TokenType, TokenType) => Boolean,
      matchesContextIdAndLabel: (TokenType, Double) => Boolean,
      matchesContextual: ContextualKeyword => Boolean,
      matchesContextualAtIndex: (Double, ContextualKeyword) => Boolean,
      nextToken: Callback,
      previousToken: Callback,
      previousWhitespaceAndComments: CallbackTo[String],
      rawCodeForToken: Token => String,
      removeBalancedCode: Callback,
      removeInitialToken: Callback,
      removeToken: Callback,
      replaceToken: String => Callback,
      replaceTokenTrimmingLeftWhitespace: String => Callback,
      reset: Callback,
      restoreToSnapshot: TokenProcessorSnapshot => Callback,
      resultCode: Any,
      snapshot: CallbackTo[TokenProcessorSnapshot],
      stringValue: CallbackTo[String],
      stringValueAtIndex: Double => String,
      stringValueForToken: Token => String,
      tokenAtRelativeIndex: Double => Token,
      tokenIndex: Any,
      tokens: js.Array[Token]
    ): TokenProcessor = {
      val __obj = js.Dynamic.literal(appendCode = js.Any.fromFunction1((t0: String) => appendCode(t0).runNow()), appendTokenPrefix = appendTokenPrefix.asInstanceOf[js.Any], appendTokenSuffix = appendTokenSuffix.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], copyExpectedToken = js.Any.fromFunction1((t0: TokenType) => copyExpectedToken(t0).runNow()), copyToken = copyToken.toJsFn, copyTokenWithPrefix = js.Any.fromFunction1((t0: String) => copyTokenWithPrefix(t0).runNow()), currentIndex = currentIndex.toJsFn, currentToken = currentToken.toJsFn, currentTokenCode = currentTokenCode.toJsFn, dangerouslyGetAndRemoveCodeSinceSnapshot = js.Any.fromFunction1(dangerouslyGetAndRemoveCodeSinceSnapshot), disableESTransforms = disableESTransforms.asInstanceOf[js.Any], finish = finish.toJsFn, helperManager = helperManager.asInstanceOf[js.Any], identifierName = identifierName.toJsFn, identifierNameAtIndex = js.Any.fromFunction1(identifierNameAtIndex), identifierNameAtRelativeIndex = js.Any.fromFunction1(identifierNameAtRelativeIndex), identifierNameForToken = js.Any.fromFunction1(identifierNameForToken), isAtEnd = isAtEnd.toJsFn, isFlowEnabled = isFlowEnabled.asInstanceOf[js.Any], matches1 = js.Any.fromFunction1(matches1), matches1AtIndex = js.Any.fromFunction2(matches1AtIndex), matches2 = js.Any.fromFunction2(matches2), matches2AtIndex = js.Any.fromFunction3(matches2AtIndex), matches3 = js.Any.fromFunction3(matches3), matches3AtIndex = js.Any.fromFunction4(matches3AtIndex), matches4 = js.Any.fromFunction4(matches4), matches5 = js.Any.fromFunction5(matches5), matchesContextIdAndLabel = js.Any.fromFunction2(matchesContextIdAndLabel), matchesContextual = js.Any.fromFunction1(matchesContextual), matchesContextualAtIndex = js.Any.fromFunction2(matchesContextualAtIndex), nextToken = nextToken.toJsFn, previousToken = previousToken.toJsFn, previousWhitespaceAndComments = previousWhitespaceAndComments.toJsFn, rawCodeForToken = js.Any.fromFunction1(rawCodeForToken), removeBalancedCode = removeBalancedCode.toJsFn, removeInitialToken = removeInitialToken.toJsFn, removeToken = removeToken.toJsFn, replaceToken = js.Any.fromFunction1((t0: String) => replaceToken(t0).runNow()), replaceTokenTrimmingLeftWhitespace = js.Any.fromFunction1((t0: String) => replaceTokenTrimmingLeftWhitespace(t0).runNow()), reset = reset.toJsFn, restoreToSnapshot = js.Any.fromFunction1((t0: TokenProcessorSnapshot) => restoreToSnapshot(t0).runNow()), resultCode = resultCode.asInstanceOf[js.Any], snapshot = snapshot.toJsFn, stringValue = stringValue.toJsFn, stringValueAtIndex = js.Any.fromFunction1(stringValueAtIndex), stringValueForToken = js.Any.fromFunction1(stringValueForToken), tokenAtRelativeIndex = js.Any.fromFunction1(tokenAtRelativeIndex), tokenIndex = tokenIndex.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenProcessor]
    }
    
    extension [Self <: TokenProcessor](x: Self) {
      
      inline def setAppendCode(value: String => Callback): Self = StObject.set(x, "appendCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAppendTokenPrefix(value: Any): Self = StObject.set(x, "appendTokenPrefix", value.asInstanceOf[js.Any])
      
      inline def setAppendTokenSuffix(value: Any): Self = StObject.set(x, "appendTokenSuffix", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCopyExpectedToken(value: TokenType => Callback): Self = StObject.set(x, "copyExpectedToken", js.Any.fromFunction1((t0: TokenType) => value(t0).runNow()))
      
      inline def setCopyToken(value: Callback): Self = StObject.set(x, "copyToken", value.toJsFn)
      
      inline def setCopyTokenWithPrefix(value: String => Callback): Self = StObject.set(x, "copyTokenWithPrefix", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCurrentIndex(value: CallbackTo[Double]): Self = StObject.set(x, "currentIndex", value.toJsFn)
      
      inline def setCurrentToken(value: CallbackTo[Token]): Self = StObject.set(x, "currentToken", value.toJsFn)
      
      inline def setCurrentTokenCode(value: CallbackTo[String]): Self = StObject.set(x, "currentTokenCode", value.toJsFn)
      
      inline def setDangerouslyGetAndRemoveCodeSinceSnapshot(value: TokenProcessorSnapshot => String): Self = StObject.set(x, "dangerouslyGetAndRemoveCodeSinceSnapshot", js.Any.fromFunction1(value))
      
      inline def setDisableESTransforms(value: Boolean): Self = StObject.set(x, "disableESTransforms", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: CallbackTo[String]): Self = StObject.set(x, "finish", value.toJsFn)
      
      inline def setHelperManager(value: HelperManager): Self = StObject.set(x, "helperManager", value.asInstanceOf[js.Any])
      
      inline def setIdentifierName(value: CallbackTo[String]): Self = StObject.set(x, "identifierName", value.toJsFn)
      
      inline def setIdentifierNameAtIndex(value: Double => String): Self = StObject.set(x, "identifierNameAtIndex", js.Any.fromFunction1(value))
      
      inline def setIdentifierNameAtRelativeIndex(value: Double => String): Self = StObject.set(x, "identifierNameAtRelativeIndex", js.Any.fromFunction1(value))
      
      inline def setIdentifierNameForToken(value: Token => String): Self = StObject.set(x, "identifierNameForToken", js.Any.fromFunction1(value))
      
      inline def setIsAtEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAtEnd", value.toJsFn)
      
      inline def setIsFlowEnabled(value: Boolean): Self = StObject.set(x, "isFlowEnabled", value.asInstanceOf[js.Any])
      
      inline def setMatches1(value: TokenType => Boolean): Self = StObject.set(x, "matches1", js.Any.fromFunction1(value))
      
      inline def setMatches1AtIndex(value: (Double, TokenType) => Boolean): Self = StObject.set(x, "matches1AtIndex", js.Any.fromFunction2(value))
      
      inline def setMatches2(value: (TokenType, TokenType) => Boolean): Self = StObject.set(x, "matches2", js.Any.fromFunction2(value))
      
      inline def setMatches2AtIndex(value: (Double, TokenType, TokenType) => Boolean): Self = StObject.set(x, "matches2AtIndex", js.Any.fromFunction3(value))
      
      inline def setMatches3(value: (TokenType, TokenType, TokenType) => Boolean): Self = StObject.set(x, "matches3", js.Any.fromFunction3(value))
      
      inline def setMatches3AtIndex(value: (Double, TokenType, TokenType, TokenType) => Boolean): Self = StObject.set(x, "matches3AtIndex", js.Any.fromFunction4(value))
      
      inline def setMatches4(value: (TokenType, TokenType, TokenType, TokenType) => Boolean): Self = StObject.set(x, "matches4", js.Any.fromFunction4(value))
      
      inline def setMatches5(value: (TokenType, TokenType, TokenType, TokenType, TokenType) => Boolean): Self = StObject.set(x, "matches5", js.Any.fromFunction5(value))
      
      inline def setMatchesContextIdAndLabel(value: (TokenType, Double) => Boolean): Self = StObject.set(x, "matchesContextIdAndLabel", js.Any.fromFunction2(value))
      
      inline def setMatchesContextual(value: ContextualKeyword => Boolean): Self = StObject.set(x, "matchesContextual", js.Any.fromFunction1(value))
      
      inline def setMatchesContextualAtIndex(value: (Double, ContextualKeyword) => Boolean): Self = StObject.set(x, "matchesContextualAtIndex", js.Any.fromFunction2(value))
      
      inline def setNextToken(value: Callback): Self = StObject.set(x, "nextToken", value.toJsFn)
      
      inline def setPreviousToken(value: Callback): Self = StObject.set(x, "previousToken", value.toJsFn)
      
      inline def setPreviousWhitespaceAndComments(value: CallbackTo[String]): Self = StObject.set(x, "previousWhitespaceAndComments", value.toJsFn)
      
      inline def setRawCodeForToken(value: Token => String): Self = StObject.set(x, "rawCodeForToken", js.Any.fromFunction1(value))
      
      inline def setRemoveBalancedCode(value: Callback): Self = StObject.set(x, "removeBalancedCode", value.toJsFn)
      
      inline def setRemoveInitialToken(value: Callback): Self = StObject.set(x, "removeInitialToken", value.toJsFn)
      
      inline def setRemoveToken(value: Callback): Self = StObject.set(x, "removeToken", value.toJsFn)
      
      inline def setReplaceToken(value: String => Callback): Self = StObject.set(x, "replaceToken", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setReplaceTokenTrimmingLeftWhitespace(value: String => Callback): Self = StObject.set(x, "replaceTokenTrimmingLeftWhitespace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setRestoreToSnapshot(value: TokenProcessorSnapshot => Callback): Self = StObject.set(x, "restoreToSnapshot", js.Any.fromFunction1((t0: TokenProcessorSnapshot) => value(t0).runNow()))
      
      inline def setResultCode(value: Any): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(value: CallbackTo[TokenProcessorSnapshot]): Self = StObject.set(x, "snapshot", value.toJsFn)
      
      inline def setStringValue(value: CallbackTo[String]): Self = StObject.set(x, "stringValue", value.toJsFn)
      
      inline def setStringValueAtIndex(value: Double => String): Self = StObject.set(x, "stringValueAtIndex", js.Any.fromFunction1(value))
      
      inline def setStringValueForToken(value: Token => String): Self = StObject.set(x, "stringValueForToken", js.Any.fromFunction1(value))
      
      inline def setTokenAtRelativeIndex(value: Double => Token): Self = StObject.set(x, "tokenAtRelativeIndex", js.Any.fromFunction1(value))
      
      inline def setTokenIndex(value: Any): Self = StObject.set(x, "tokenIndex", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait TokenProcessorSnapshot extends StObject {
    
    var resultCode: String
    
    var tokenIndex: Double
  }
  object TokenProcessorSnapshot {
    
    inline def apply(resultCode: String, tokenIndex: Double): TokenProcessorSnapshot = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], tokenIndex = tokenIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenProcessorSnapshot]
    }
    
    extension [Self <: TokenProcessorSnapshot](x: Self) {
      
      inline def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      inline def setTokenIndex(value: Double): Self = StObject.set(x, "tokenIndex", value.asInstanceOf[js.Any])
    }
  }
}
