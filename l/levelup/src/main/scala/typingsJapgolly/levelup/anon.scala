package typingsJapgolly.levelup

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.levelErrors.mod.InitializationError
import typingsJapgolly.levelErrors.mod.LevelUPError
import typingsJapgolly.levelErrors.mod.NotFoundError
import typingsJapgolly.levelErrors.mod.OpenError
import typingsJapgolly.levelErrors.mod.ReadError
import typingsJapgolly.levelErrors.mod.WriteError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EncodingError extends StObject {
    
    var EncodingError: Instantiable0[typingsJapgolly.levelErrors.mod.EncodingError]
    
    var InitializationError: Instantiable0[typingsJapgolly.levelErrors.mod.InitializationError]
    
    var LevelUPError: Instantiable0[typingsJapgolly.levelErrors.mod.LevelUPError]
    
    var NotFoundError: Instantiable0[typingsJapgolly.levelErrors.mod.NotFoundError]
    
    var OpenError: Instantiable0[typingsJapgolly.levelErrors.mod.OpenError]
    
    var ReadError: Instantiable0[typingsJapgolly.levelErrors.mod.ReadError]
    
    var WriteError: Instantiable0[typingsJapgolly.levelErrors.mod.WriteError]
  }
  object EncodingError {
    
    inline def apply(
      EncodingError: Instantiable0[typingsJapgolly.levelErrors.mod.EncodingError],
      InitializationError: Instantiable0[InitializationError],
      LevelUPError: Instantiable0[LevelUPError],
      NotFoundError: Instantiable0[NotFoundError],
      OpenError: Instantiable0[OpenError],
      ReadError: Instantiable0[ReadError],
      WriteError: Instantiable0[WriteError]
    ): EncodingError = {
      val __obj = js.Dynamic.literal(EncodingError = EncodingError.asInstanceOf[js.Any], InitializationError = InitializationError.asInstanceOf[js.Any], LevelUPError = LevelUPError.asInstanceOf[js.Any], NotFoundError = NotFoundError.asInstanceOf[js.Any], OpenError = OpenError.asInstanceOf[js.Any], ReadError = ReadError.asInstanceOf[js.Any], WriteError = WriteError.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingError]
    }
    
    extension [Self <: EncodingError](x: Self) {
      
      inline def setEncodingError(value: Instantiable0[typingsJapgolly.levelErrors.mod.EncodingError]): Self = StObject.set(x, "EncodingError", value.asInstanceOf[js.Any])
      
      inline def setInitializationError(value: Instantiable0[InitializationError]): Self = StObject.set(x, "InitializationError", value.asInstanceOf[js.Any])
      
      inline def setLevelUPError(value: Instantiable0[LevelUPError]): Self = StObject.set(x, "LevelUPError", value.asInstanceOf[js.Any])
      
      inline def setNotFoundError(value: Instantiable0[NotFoundError]): Self = StObject.set(x, "NotFoundError", value.asInstanceOf[js.Any])
      
      inline def setOpenError(value: Instantiable0[OpenError]): Self = StObject.set(x, "OpenError", value.asInstanceOf[js.Any])
      
      inline def setReadError(value: Instantiable0[ReadError]): Self = StObject.set(x, "ReadError", value.asInstanceOf[js.Any])
      
      inline def setWriteError(value: Instantiable0[WriteError]): Self = StObject.set(x, "WriteError", value.asInstanceOf[js.Any])
    }
  }
}
