package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuilderProgramHost extends StObject {
  
  /**
    * If provided this would be used this hash instead of actual file shape text for detecting changes
    */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.undefined
  
  /**
    * return true if file names are treated with case sensitivity
    */
  def useCaseSensitiveFileNames(): Boolean
  
  /**
    * When emit or emitNextAffectedFile are called without writeFile,
    * this callback if present would be used to write files
    */
  var writeFile: js.UndefOr[WriteFileCallback] = js.undefined
}
object BuilderProgramHost {
  
  inline def apply(useCaseSensitiveFileNames: CallbackTo[Boolean]): BuilderProgramHost = {
    val __obj = js.Dynamic.literal(useCaseSensitiveFileNames = useCaseSensitiveFileNames.toJsFn)
    __obj.asInstanceOf[BuilderProgramHost]
  }
  
  extension [Self <: BuilderProgramHost](x: Self) {
    
    inline def setCreateHash(value: /* data */ java.lang.String => java.lang.String): Self = StObject.set(x, "createHash", js.Any.fromFunction1(value))
    
    inline def setCreateHashUndefined: Self = StObject.set(x, "createHash", js.undefined)
    
    inline def setUseCaseSensitiveFileNames(value: CallbackTo[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileNames", value.toJsFn)
    
    inline def setWriteFile(
      value: (/* fileName */ java.lang.String, /* text */ java.lang.String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], /* data */ js.UndefOr[WriteFileCallbackData]) => Callback
    ): Self = StObject.set(x, "writeFile", js.Any.fromFunction6((t0: /* fileName */ java.lang.String, t1: /* text */ java.lang.String, t2: /* writeByteOrderMark */ Boolean, t3: /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], t4: /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], t5: /* data */ js.UndefOr[WriteFileCallbackData]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
  }
}
