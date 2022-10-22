package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an interrupt which occurs in the scripting engine.
  * @deprecated Deprecated
  */
trait InterruptEngineEvent
  extends StObject
     with EventObject {
  
  /** contains the first column in the "EndLine" which is NOT affected by the event that took place. */
  var EndColumn: Double
  
  /** contains the last line in the module's source code that is affected by the event that took place. */
  var EndLine: Double
  
  /**
    * error message.
    *
    * Only valid if Reason is RuntimeError or CompileError.
    */
  var ErrorMessage: String
  
  /**
    * fully qualified name to address the module or function affected by the event that took place.
    *
    * If the module or function can't be addressed by name (for example, in case that a runtime-generated eval-module is executed), this string is empty.
    */
  var Name: String
  
  /** contains the interrupt reason. */
  var Reason: InterruptReason
  
  /**
    * source code of the Module affected by the event that took place.
    *
    * If the source can be accessed using the ModuleName, or if the source is unknown (executing compiled code), this string can be empty.
    */
  var SourceCode: String
  
  /** contains the first column in the "StartLine" that is affected by the event that took place. */
  var StartColumn: Double
  
  /**
    * contains the first line in the module's source code that is affected by the event that took place.
    *
    * If "name" addresses a function, all line and column values are nevertheless given relative to the module's source. If source code is not available,
    * this value addresses a binary position in the compiled code.
    * @see XLibraryAccess.getModuleCode
    * @see XLibraryAccess.getFunctionCode
    */
  var StartLine: Double
}
object InterruptEngineEvent {
  
  inline def apply(
    EndColumn: Double,
    EndLine: Double,
    ErrorMessage: String,
    Name: String,
    Reason: InterruptReason,
    Source: XInterface,
    SourceCode: String,
    StartColumn: Double,
    StartLine: Double
  ): InterruptEngineEvent = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndLine = EndLine.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartLine = StartLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterruptEngineEvent]
  }
  
  extension [Self <: InterruptEngineEvent](x: Self) {
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "EndColumn", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "EndLine", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setReason(value: InterruptReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setSourceCode(value: String): Self = StObject.set(x, "SourceCode", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Double): Self = StObject.set(x, "StartColumn", value.asInstanceOf[js.Any])
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "StartLine", value.asInstanceOf[js.Any])
  }
}
