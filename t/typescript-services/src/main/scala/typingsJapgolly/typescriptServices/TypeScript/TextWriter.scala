package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextWriter extends StObject {
  
  def Close(): Unit
  
  def Write(s: String): Unit
  
  def WriteLine(s: String): Unit
  
  /* private */ var contents: Any
  
  def getOutputFile(): OutputFile
  
  /* private */ var name: Any
  
  var onNewLine: Boolean
  
  /* private */ var outputFileType: Any
  
  /* private */ var writeByteOrderMark: Any
}
object TextWriter {
  
  inline def apply(
    Close: Callback,
    Write: String => Callback,
    WriteLine: String => Callback,
    contents: Any,
    getOutputFile: CallbackTo[OutputFile],
    name: Any,
    onNewLine: Boolean,
    outputFileType: Any,
    writeByteOrderMark: Any
  ): TextWriter = {
    val __obj = js.Dynamic.literal(Close = Close.toJsFn, Write = js.Any.fromFunction1((t0: String) => Write(t0).runNow()), WriteLine = js.Any.fromFunction1((t0: String) => WriteLine(t0).runNow()), contents = contents.asInstanceOf[js.Any], getOutputFile = getOutputFile.toJsFn, name = name.asInstanceOf[js.Any], onNewLine = onNewLine.asInstanceOf[js.Any], outputFileType = outputFileType.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextWriter]
  }
  
  extension [Self <: TextWriter](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setGetOutputFile(value: CallbackTo[OutputFile]): Self = StObject.set(x, "getOutputFile", value.toJsFn)
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnNewLine(value: Boolean): Self = StObject.set(x, "onNewLine", value.asInstanceOf[js.Any])
    
    inline def setOutputFileType(value: Any): Self = StObject.set(x, "outputFileType", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: String => Callback): Self = StObject.set(x, "Write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteByteOrderMark(value: Any): Self = StObject.set(x, "writeByteOrderMark", value.asInstanceOf[js.Any])
    
    inline def setWriteLine(value: String => Callback): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
