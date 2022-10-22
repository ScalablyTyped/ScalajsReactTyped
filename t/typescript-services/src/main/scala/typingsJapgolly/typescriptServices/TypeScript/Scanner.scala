package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scanner
  extends StObject
     with ISlidingWindowSource {
  
  /* private */ var _languageVersion: Any
  
  def absoluteIndex(): Double
  
  /* private */ def advanceAndSetTokenKind(kind: Any): Any
  
  /* private */ def createIllegalEscapeDiagnostic(start: Any, end: Any): Any
  
  /* private */ def createToken(
    fullStart: Any,
    leadingTriviaInfo: Any,
    start: Any,
    kind: Any,
    end: Any,
    fullEnd: Any,
    trailingTriviaInfo: Any,
    isVariableWidthKeyword: Any
  ): Any
  
  /* private */ def currentCharCode(): Any
  
  /* private */ var fileName: Any
  
  /* private */ def getErrorMessageText(text: Any): Any
  
  /* private */ def isDotPrefixedNumericLiteral(): Any
  
  /* private */ def isHexNumericLiteral(): Any
  
  /* private */ def isIdentifierPart(interpretedChar: Any): Any
  
  /* private */ def isIdentifierStart(interpretedChar: Any): Any
  
  /* private */ def isNewLineCharacter(ch: Any): Any
  
  /* private */ def isOctalNumericLiteral(): Any
  
  /* private */ def isUnicodeEscape(character: Any): Any
  
  def languageVersion(): LanguageVersion
  
  /* private */ def peekCharOrUnicodeEscape(): Any
  
  /* private */ def peekUnicodeOrHexEscape(): Any
  
  def scan(diagnostics: js.Array[Diagnostic], allowRegularExpression: Boolean): ISyntaxToken
  
  /* private */ def scanAmpersandToken(): Any
  
  /* private */ def scanAsteriskToken(): Any
  
  /* private */ def scanBarToken(): Any
  
  /* private */ def scanCaretToken(): Any
  
  /* private */ def scanCharOrUnicodeEscape(errors: Any): Any
  
  /* private */ def scanDecimalDigits(): Any
  
  /* private */ def scanDecimalNumericLiteral(): Any
  
  /* private */ def scanDefaultCharacter(character: Any, diagnostics: Any): Any
  
  /* private */ def scanDotToken(diagnostics: Any): Any
  
  /* private */ def scanEqualsToken(): Any
  
  /* private */ def scanExclamationToken(): Any
  
  /* private */ def scanHexNumericLiteral(): Any
  
  /* private */ def scanLessThanToken(): Any
  
  /* private */ def scanLineTerminatorSequenceLength(ch: Any): Any
  
  /* private */ def scanLineTerminatorSequenceTrivia(ch: Any): Any
  
  /* private */ def scanMinusToken(): Any
  
  /* private */ def scanMultiLineCommentTrivia(underlyingText: Any, underlyingTextStart: Any): Any
  
  /* private */ def scanMultiLineCommentTriviaLength(diagnostics: Any): Any
  
  /* private */ def scanNumericLiteral(diagnostics: Any): Any
  
  /* private */ def scanOctalNumericLiteral(diagnostics: Any): Any
  
  /* private */ def scanPercentToken(): Any
  
  /* private */ def scanPlusToken(): Any
  
  /* private */ def scanSingleLineCommentTrivia(underlyingText: Any, underlyingTextStart: Any): Any
  
  /* private */ def scanSingleLineCommentTriviaLength(): Any
  
  /* private */ def scanSlashToken(allowRegularExpression: Any): Any
  
  /* private */ def scanStringLiteral(diagnostics: Any): Any
  
  /* private */ def scanSyntaxToken(diagnostics: Any, allowRegularExpression: Any): Any
  
  /* private */ def scanTrivia(underlyingText: Any, underlyingTextStart: Any, isTrailing: Any): Any
  
  /* private */ def scanTriviaInfo(diagnostics: Any, isTrailing: Any): Any
  
  /* private */ def scanUnicodeOrHexEscape(errors: Any): Any
  
  /* private */ def scanWhitespaceTrivia(underlyingText: Any, underlyingTextStart: Any): Any
  
  def setAbsoluteIndex(index: Double): Unit
  
  /* private */ def skipEscapeSequence(diagnostics: Any): Any
  
  /* private */ var slidingWindow: Any
  
  /* private */ def slowScanIdentifierOrKeyword(diagnostics: Any): Any
  
  def substring(start: Double, end: Double, intern: Boolean): String
  
  /* private */ var text: Any
  
  /* private */ def tryFastScanIdentifierOrKeyword(firstCharacter: Any): Any
  
  /* private */ def tryScanRegularExpressionToken(): Any
}
object Scanner {
  
  inline def apply(
    _languageVersion: Any,
    absoluteIndex: CallbackTo[Double],
    advanceAndSetTokenKind: Any => Any,
    createIllegalEscapeDiagnostic: (Any, Any) => Any,
    createToken: (Any, Any, Any, Any, Any, Any, Any, Any) => Any,
    currentCharCode: CallbackTo[Any],
    fetchMoreItems: (Any, Double, js.Array[Any], Double, Double) => Double,
    fileName: Any,
    getErrorMessageText: Any => Any,
    isDotPrefixedNumericLiteral: CallbackTo[Any],
    isHexNumericLiteral: CallbackTo[Any],
    isIdentifierPart: Any => Any,
    isIdentifierStart: Any => Any,
    isNewLineCharacter: Any => Any,
    isOctalNumericLiteral: CallbackTo[Any],
    isUnicodeEscape: Any => Any,
    languageVersion: CallbackTo[LanguageVersion],
    peekCharOrUnicodeEscape: CallbackTo[Any],
    peekUnicodeOrHexEscape: CallbackTo[Any],
    scan: (js.Array[Diagnostic], Boolean) => ISyntaxToken,
    scanAmpersandToken: CallbackTo[Any],
    scanAsteriskToken: CallbackTo[Any],
    scanBarToken: CallbackTo[Any],
    scanCaretToken: CallbackTo[Any],
    scanCharOrUnicodeEscape: Any => Any,
    scanDecimalDigits: CallbackTo[Any],
    scanDecimalNumericLiteral: CallbackTo[Any],
    scanDefaultCharacter: (Any, Any) => Any,
    scanDotToken: Any => Any,
    scanEqualsToken: CallbackTo[Any],
    scanExclamationToken: CallbackTo[Any],
    scanHexNumericLiteral: CallbackTo[Any],
    scanLessThanToken: CallbackTo[Any],
    scanLineTerminatorSequenceLength: Any => Any,
    scanLineTerminatorSequenceTrivia: Any => Any,
    scanMinusToken: CallbackTo[Any],
    scanMultiLineCommentTrivia: (Any, Any) => Any,
    scanMultiLineCommentTriviaLength: Any => Any,
    scanNumericLiteral: Any => Any,
    scanOctalNumericLiteral: Any => Any,
    scanPercentToken: CallbackTo[Any],
    scanPlusToken: CallbackTo[Any],
    scanSingleLineCommentTrivia: (Any, Any) => Any,
    scanSingleLineCommentTriviaLength: CallbackTo[Any],
    scanSlashToken: Any => Any,
    scanStringLiteral: Any => Any,
    scanSyntaxToken: (Any, Any) => Any,
    scanTrivia: (Any, Any, Any) => Any,
    scanTriviaInfo: (Any, Any) => Any,
    scanUnicodeOrHexEscape: Any => Any,
    scanWhitespaceTrivia: (Any, Any) => Any,
    setAbsoluteIndex: Double => Callback,
    skipEscapeSequence: Any => Any,
    slidingWindow: Any,
    slowScanIdentifierOrKeyword: Any => Any,
    substring: (Double, Double, Boolean) => String,
    text: Any,
    tryFastScanIdentifierOrKeyword: Any => Any,
    tryScanRegularExpressionToken: CallbackTo[Any]
  ): Scanner = {
    val __obj = js.Dynamic.literal(_languageVersion = _languageVersion.asInstanceOf[js.Any], absoluteIndex = absoluteIndex.toJsFn, advanceAndSetTokenKind = js.Any.fromFunction1(advanceAndSetTokenKind), createIllegalEscapeDiagnostic = js.Any.fromFunction2(createIllegalEscapeDiagnostic), createToken = js.Any.fromFunction8(createToken), currentCharCode = currentCharCode.toJsFn, fetchMoreItems = js.Any.fromFunction5(fetchMoreItems), fileName = fileName.asInstanceOf[js.Any], getErrorMessageText = js.Any.fromFunction1(getErrorMessageText), isDotPrefixedNumericLiteral = isDotPrefixedNumericLiteral.toJsFn, isHexNumericLiteral = isHexNumericLiteral.toJsFn, isIdentifierPart = js.Any.fromFunction1(isIdentifierPart), isIdentifierStart = js.Any.fromFunction1(isIdentifierStart), isNewLineCharacter = js.Any.fromFunction1(isNewLineCharacter), isOctalNumericLiteral = isOctalNumericLiteral.toJsFn, isUnicodeEscape = js.Any.fromFunction1(isUnicodeEscape), languageVersion = languageVersion.toJsFn, peekCharOrUnicodeEscape = peekCharOrUnicodeEscape.toJsFn, peekUnicodeOrHexEscape = peekUnicodeOrHexEscape.toJsFn, scan = js.Any.fromFunction2(scan), scanAmpersandToken = scanAmpersandToken.toJsFn, scanAsteriskToken = scanAsteriskToken.toJsFn, scanBarToken = scanBarToken.toJsFn, scanCaretToken = scanCaretToken.toJsFn, scanCharOrUnicodeEscape = js.Any.fromFunction1(scanCharOrUnicodeEscape), scanDecimalDigits = scanDecimalDigits.toJsFn, scanDecimalNumericLiteral = scanDecimalNumericLiteral.toJsFn, scanDefaultCharacter = js.Any.fromFunction2(scanDefaultCharacter), scanDotToken = js.Any.fromFunction1(scanDotToken), scanEqualsToken = scanEqualsToken.toJsFn, scanExclamationToken = scanExclamationToken.toJsFn, scanHexNumericLiteral = scanHexNumericLiteral.toJsFn, scanLessThanToken = scanLessThanToken.toJsFn, scanLineTerminatorSequenceLength = js.Any.fromFunction1(scanLineTerminatorSequenceLength), scanLineTerminatorSequenceTrivia = js.Any.fromFunction1(scanLineTerminatorSequenceTrivia), scanMinusToken = scanMinusToken.toJsFn, scanMultiLineCommentTrivia = js.Any.fromFunction2(scanMultiLineCommentTrivia), scanMultiLineCommentTriviaLength = js.Any.fromFunction1(scanMultiLineCommentTriviaLength), scanNumericLiteral = js.Any.fromFunction1(scanNumericLiteral), scanOctalNumericLiteral = js.Any.fromFunction1(scanOctalNumericLiteral), scanPercentToken = scanPercentToken.toJsFn, scanPlusToken = scanPlusToken.toJsFn, scanSingleLineCommentTrivia = js.Any.fromFunction2(scanSingleLineCommentTrivia), scanSingleLineCommentTriviaLength = scanSingleLineCommentTriviaLength.toJsFn, scanSlashToken = js.Any.fromFunction1(scanSlashToken), scanStringLiteral = js.Any.fromFunction1(scanStringLiteral), scanSyntaxToken = js.Any.fromFunction2(scanSyntaxToken), scanTrivia = js.Any.fromFunction3(scanTrivia), scanTriviaInfo = js.Any.fromFunction2(scanTriviaInfo), scanUnicodeOrHexEscape = js.Any.fromFunction1(scanUnicodeOrHexEscape), scanWhitespaceTrivia = js.Any.fromFunction2(scanWhitespaceTrivia), setAbsoluteIndex = js.Any.fromFunction1((t0: Double) => setAbsoluteIndex(t0).runNow()), skipEscapeSequence = js.Any.fromFunction1(skipEscapeSequence), slidingWindow = slidingWindow.asInstanceOf[js.Any], slowScanIdentifierOrKeyword = js.Any.fromFunction1(slowScanIdentifierOrKeyword), substring = js.Any.fromFunction3(substring), text = text.asInstanceOf[js.Any], tryFastScanIdentifierOrKeyword = js.Any.fromFunction1(tryFastScanIdentifierOrKeyword), tryScanRegularExpressionToken = tryScanRegularExpressionToken.toJsFn)
    __obj.asInstanceOf[Scanner]
  }
  
  extension [Self <: Scanner](x: Self) {
    
    inline def setAbsoluteIndex(value: CallbackTo[Double]): Self = StObject.set(x, "absoluteIndex", value.toJsFn)
    
    inline def setAdvanceAndSetTokenKind(value: Any => Any): Self = StObject.set(x, "advanceAndSetTokenKind", js.Any.fromFunction1(value))
    
    inline def setCreateIllegalEscapeDiagnostic(value: (Any, Any) => Any): Self = StObject.set(x, "createIllegalEscapeDiagnostic", js.Any.fromFunction2(value))
    
    inline def setCreateToken(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "createToken", js.Any.fromFunction8(value))
    
    inline def setCurrentCharCode(value: CallbackTo[Any]): Self = StObject.set(x, "currentCharCode", value.toJsFn)
    
    inline def setFileName(value: Any): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setGetErrorMessageText(value: Any => Any): Self = StObject.set(x, "getErrorMessageText", js.Any.fromFunction1(value))
    
    inline def setIsDotPrefixedNumericLiteral(value: CallbackTo[Any]): Self = StObject.set(x, "isDotPrefixedNumericLiteral", value.toJsFn)
    
    inline def setIsHexNumericLiteral(value: CallbackTo[Any]): Self = StObject.set(x, "isHexNumericLiteral", value.toJsFn)
    
    inline def setIsIdentifierPart(value: Any => Any): Self = StObject.set(x, "isIdentifierPart", js.Any.fromFunction1(value))
    
    inline def setIsIdentifierStart(value: Any => Any): Self = StObject.set(x, "isIdentifierStart", js.Any.fromFunction1(value))
    
    inline def setIsNewLineCharacter(value: Any => Any): Self = StObject.set(x, "isNewLineCharacter", js.Any.fromFunction1(value))
    
    inline def setIsOctalNumericLiteral(value: CallbackTo[Any]): Self = StObject.set(x, "isOctalNumericLiteral", value.toJsFn)
    
    inline def setIsUnicodeEscape(value: Any => Any): Self = StObject.set(x, "isUnicodeEscape", js.Any.fromFunction1(value))
    
    inline def setLanguageVersion(value: CallbackTo[LanguageVersion]): Self = StObject.set(x, "languageVersion", value.toJsFn)
    
    inline def setPeekCharOrUnicodeEscape(value: CallbackTo[Any]): Self = StObject.set(x, "peekCharOrUnicodeEscape", value.toJsFn)
    
    inline def setPeekUnicodeOrHexEscape(value: CallbackTo[Any]): Self = StObject.set(x, "peekUnicodeOrHexEscape", value.toJsFn)
    
    inline def setScan(value: (js.Array[Diagnostic], Boolean) => ISyntaxToken): Self = StObject.set(x, "scan", js.Any.fromFunction2(value))
    
    inline def setScanAmpersandToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanAmpersandToken", value.toJsFn)
    
    inline def setScanAsteriskToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanAsteriskToken", value.toJsFn)
    
    inline def setScanBarToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanBarToken", value.toJsFn)
    
    inline def setScanCaretToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanCaretToken", value.toJsFn)
    
    inline def setScanCharOrUnicodeEscape(value: Any => Any): Self = StObject.set(x, "scanCharOrUnicodeEscape", js.Any.fromFunction1(value))
    
    inline def setScanDecimalDigits(value: CallbackTo[Any]): Self = StObject.set(x, "scanDecimalDigits", value.toJsFn)
    
    inline def setScanDecimalNumericLiteral(value: CallbackTo[Any]): Self = StObject.set(x, "scanDecimalNumericLiteral", value.toJsFn)
    
    inline def setScanDefaultCharacter(value: (Any, Any) => Any): Self = StObject.set(x, "scanDefaultCharacter", js.Any.fromFunction2(value))
    
    inline def setScanDotToken(value: Any => Any): Self = StObject.set(x, "scanDotToken", js.Any.fromFunction1(value))
    
    inline def setScanEqualsToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanEqualsToken", value.toJsFn)
    
    inline def setScanExclamationToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanExclamationToken", value.toJsFn)
    
    inline def setScanHexNumericLiteral(value: CallbackTo[Any]): Self = StObject.set(x, "scanHexNumericLiteral", value.toJsFn)
    
    inline def setScanLessThanToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanLessThanToken", value.toJsFn)
    
    inline def setScanLineTerminatorSequenceLength(value: Any => Any): Self = StObject.set(x, "scanLineTerminatorSequenceLength", js.Any.fromFunction1(value))
    
    inline def setScanLineTerminatorSequenceTrivia(value: Any => Any): Self = StObject.set(x, "scanLineTerminatorSequenceTrivia", js.Any.fromFunction1(value))
    
    inline def setScanMinusToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanMinusToken", value.toJsFn)
    
    inline def setScanMultiLineCommentTrivia(value: (Any, Any) => Any): Self = StObject.set(x, "scanMultiLineCommentTrivia", js.Any.fromFunction2(value))
    
    inline def setScanMultiLineCommentTriviaLength(value: Any => Any): Self = StObject.set(x, "scanMultiLineCommentTriviaLength", js.Any.fromFunction1(value))
    
    inline def setScanNumericLiteral(value: Any => Any): Self = StObject.set(x, "scanNumericLiteral", js.Any.fromFunction1(value))
    
    inline def setScanOctalNumericLiteral(value: Any => Any): Self = StObject.set(x, "scanOctalNumericLiteral", js.Any.fromFunction1(value))
    
    inline def setScanPercentToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanPercentToken", value.toJsFn)
    
    inline def setScanPlusToken(value: CallbackTo[Any]): Self = StObject.set(x, "scanPlusToken", value.toJsFn)
    
    inline def setScanSingleLineCommentTrivia(value: (Any, Any) => Any): Self = StObject.set(x, "scanSingleLineCommentTrivia", js.Any.fromFunction2(value))
    
    inline def setScanSingleLineCommentTriviaLength(value: CallbackTo[Any]): Self = StObject.set(x, "scanSingleLineCommentTriviaLength", value.toJsFn)
    
    inline def setScanSlashToken(value: Any => Any): Self = StObject.set(x, "scanSlashToken", js.Any.fromFunction1(value))
    
    inline def setScanStringLiteral(value: Any => Any): Self = StObject.set(x, "scanStringLiteral", js.Any.fromFunction1(value))
    
    inline def setScanSyntaxToken(value: (Any, Any) => Any): Self = StObject.set(x, "scanSyntaxToken", js.Any.fromFunction2(value))
    
    inline def setScanTrivia(value: (Any, Any, Any) => Any): Self = StObject.set(x, "scanTrivia", js.Any.fromFunction3(value))
    
    inline def setScanTriviaInfo(value: (Any, Any) => Any): Self = StObject.set(x, "scanTriviaInfo", js.Any.fromFunction2(value))
    
    inline def setScanUnicodeOrHexEscape(value: Any => Any): Self = StObject.set(x, "scanUnicodeOrHexEscape", js.Any.fromFunction1(value))
    
    inline def setScanWhitespaceTrivia(value: (Any, Any) => Any): Self = StObject.set(x, "scanWhitespaceTrivia", js.Any.fromFunction2(value))
    
    inline def setSetAbsoluteIndex(value: Double => Callback): Self = StObject.set(x, "setAbsoluteIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSkipEscapeSequence(value: Any => Any): Self = StObject.set(x, "skipEscapeSequence", js.Any.fromFunction1(value))
    
    inline def setSlidingWindow(value: Any): Self = StObject.set(x, "slidingWindow", value.asInstanceOf[js.Any])
    
    inline def setSlowScanIdentifierOrKeyword(value: Any => Any): Self = StObject.set(x, "slowScanIdentifierOrKeyword", js.Any.fromFunction1(value))
    
    inline def setSubstring(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "substring", js.Any.fromFunction3(value))
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTryFastScanIdentifierOrKeyword(value: Any => Any): Self = StObject.set(x, "tryFastScanIdentifierOrKeyword", js.Any.fromFunction1(value))
    
    inline def setTryScanRegularExpressionToken(value: CallbackTo[Any]): Self = StObject.set(x, "tryScanRegularExpressionToken", value.toJsFn)
    
    inline def set_languageVersion(value: Any): Self = StObject.set(x, "_languageVersion", value.asInstanceOf[js.Any])
  }
}
