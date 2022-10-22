package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatDiagnosticsHost extends StObject {
  
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String
  
  def getCurrentDirectory(): java.lang.String
  
  def getNewLine(): java.lang.String
}
object FormatDiagnosticsHost {
  
  inline def apply(
    getCanonicalFileName: java.lang.String => java.lang.String,
    getCurrentDirectory: CallbackTo[java.lang.String],
    getNewLine: CallbackTo[java.lang.String]
  ): FormatDiagnosticsHost = {
    val __obj = js.Dynamic.literal(getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = getCurrentDirectory.toJsFn, getNewLine = getNewLine.toJsFn)
    __obj.asInstanceOf[FormatDiagnosticsHost]
  }
  
  extension [Self <: FormatDiagnosticsHost](x: Self) {
    
    inline def setGetCanonicalFileName(value: java.lang.String => java.lang.String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCurrentDirectory", value.toJsFn)
    
    inline def setGetNewLine(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getNewLine", value.toJsFn)
  }
}
