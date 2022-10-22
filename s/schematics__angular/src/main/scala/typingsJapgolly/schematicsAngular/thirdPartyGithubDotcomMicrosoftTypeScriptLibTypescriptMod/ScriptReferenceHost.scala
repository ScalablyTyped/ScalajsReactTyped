package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptReferenceHost extends StObject {
  
  def getCompilerOptions(): CompilerOptions
  
  def getCurrentDirectory(): java.lang.String
  
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile]
  
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile]
}
object ScriptReferenceHost {
  
  inline def apply(
    getCompilerOptions: CallbackTo[CompilerOptions],
    getCurrentDirectory: CallbackTo[java.lang.String],
    getSourceFile: java.lang.String => js.UndefOr[SourceFile],
    getSourceFileByPath: Path => js.UndefOr[SourceFile]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal(getCompilerOptions = getCompilerOptions.toJsFn, getCurrentDirectory = getCurrentDirectory.toJsFn, getSourceFile = js.Any.fromFunction1(getSourceFile), getSourceFileByPath = js.Any.fromFunction1(getSourceFileByPath))
    __obj.asInstanceOf[ScriptReferenceHost]
  }
  
  extension [Self <: ScriptReferenceHost](x: Self) {
    
    inline def setGetCompilerOptions(value: CallbackTo[CompilerOptions]): Self = StObject.set(x, "getCompilerOptions", value.toJsFn)
    
    inline def setGetCurrentDirectory(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCurrentDirectory", value.toJsFn)
    
    inline def setGetSourceFile(value: java.lang.String => js.UndefOr[SourceFile]): Self = StObject.set(x, "getSourceFile", js.Any.fromFunction1(value))
    
    inline def setGetSourceFileByPath(value: Path => js.UndefOr[SourceFile]): Self = StObject.set(x, "getSourceFileByPath", js.Any.fromFunction1(value))
  }
}
