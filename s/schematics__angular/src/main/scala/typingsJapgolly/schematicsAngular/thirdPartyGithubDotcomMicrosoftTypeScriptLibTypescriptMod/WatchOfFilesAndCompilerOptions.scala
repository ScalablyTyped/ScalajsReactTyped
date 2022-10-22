package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates the watch that generates program using the root files and compiler options
  */
trait WatchOfFilesAndCompilerOptions[T]
  extends StObject
     with Watch[T] {
  
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: js.Array[java.lang.String]): Unit
}
object WatchOfFilesAndCompilerOptions {
  
  inline def apply[T](
    close: Callback,
    getProgram: CallbackTo[T],
    updateRootFileNames: js.Array[java.lang.String] => Callback
  ): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, getProgram = getProgram.toJsFn, updateRootFileNames = js.Any.fromFunction1((t0: js.Array[java.lang.String]) => updateRootFileNames(t0).runNow()))
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
  
  extension [Self <: WatchOfFilesAndCompilerOptions[?], T](x: Self & WatchOfFilesAndCompilerOptions[T]) {
    
    inline def setUpdateRootFileNames(value: js.Array[java.lang.String] => Callback): Self = StObject.set(x, "updateRootFileNames", js.Any.fromFunction1((t0: js.Array[java.lang.String]) => value(t0).runNow()))
  }
}
