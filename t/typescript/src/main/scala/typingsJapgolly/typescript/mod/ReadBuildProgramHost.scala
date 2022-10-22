package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBuildProgramHost extends StObject {
  
  def getCurrentDirectory(): java.lang.String
  
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String]
  
  def useCaseSensitiveFileNames(): Boolean
}
object ReadBuildProgramHost {
  
  inline def apply(
    getCurrentDirectory: CallbackTo[java.lang.String],
    readFile: java.lang.String => js.UndefOr[java.lang.String],
    useCaseSensitiveFileNames: CallbackTo[Boolean]
  ): ReadBuildProgramHost = {
    val __obj = js.Dynamic.literal(getCurrentDirectory = getCurrentDirectory.toJsFn, readFile = js.Any.fromFunction1(readFile), useCaseSensitiveFileNames = useCaseSensitiveFileNames.toJsFn)
    __obj.asInstanceOf[ReadBuildProgramHost]
  }
  
  extension [Self <: ReadBuildProgramHost](x: Self) {
    
    inline def setGetCurrentDirectory(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCurrentDirectory", value.toJsFn)
    
    inline def setReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    inline def setUseCaseSensitiveFileNames(value: CallbackTo[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileNames", value.toJsFn)
  }
}
