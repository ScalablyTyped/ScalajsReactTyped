package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.angularDevkitCore.mod.logging.IndentLogger
import typingsJapgolly.angularDevkitCore.mod.logging.LevelTransformLogger
import typingsJapgolly.angularDevkitCore.mod.logging.NullLogger
import typingsJapgolly.angularDevkitCore.mod.logging.TransformLogger
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LogEntry
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LogLevel
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.Logger
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflogging extends StObject {
  
  var IndentLogger: Instantiable1[/* name */ String, typingsJapgolly.angularDevkitCore.mod.logging.IndentLogger]
  
  var LevelCapLogger: TypeofLevelCapLogger
  
  var LevelTransformLogger: Instantiable3[
    /* name */ String, 
    /* parent */ Logger, 
    /* levelTransform */ js.Function1[/* level */ LogLevel, LogLevel], 
    typingsJapgolly.angularDevkitCore.mod.logging.LevelTransformLogger
  ]
  
  var Logger: Instantiable1[/* name */ String, typingsJapgolly.angularDevkitCore.mod.logging.Logger]
  
  var NullLogger: Instantiable0[typingsJapgolly.angularDevkitCore.mod.logging.NullLogger]
  
  var TransformLogger: Instantiable2[
    /* name */ String, 
    /* transform */ js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]], 
    typingsJapgolly.angularDevkitCore.mod.logging.TransformLogger
  ]
}
object Typeoflogging {
  
  inline def apply(
    IndentLogger: Instantiable1[/* name */ String, IndentLogger],
    LevelCapLogger: TypeofLevelCapLogger,
    LevelTransformLogger: Instantiable3[
      /* name */ String, 
      /* parent */ Logger, 
      /* levelTransform */ js.Function1[/* level */ LogLevel, LogLevel], 
      LevelTransformLogger
    ],
    Logger: Instantiable1[/* name */ String, typingsJapgolly.angularDevkitCore.mod.logging.Logger],
    NullLogger: Instantiable0[NullLogger],
    TransformLogger: Instantiable2[
      /* name */ String, 
      /* transform */ js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]], 
      TransformLogger
    ]
  ): Typeoflogging = {
    val __obj = js.Dynamic.literal(IndentLogger = IndentLogger.asInstanceOf[js.Any], LevelCapLogger = LevelCapLogger.asInstanceOf[js.Any], LevelTransformLogger = LevelTransformLogger.asInstanceOf[js.Any], Logger = Logger.asInstanceOf[js.Any], NullLogger = NullLogger.asInstanceOf[js.Any], TransformLogger = TransformLogger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflogging]
  }
  
  extension [Self <: Typeoflogging](x: Self) {
    
    inline def setIndentLogger(value: Instantiable1[/* name */ String, IndentLogger]): Self = StObject.set(x, "IndentLogger", value.asInstanceOf[js.Any])
    
    inline def setLevelCapLogger(value: TypeofLevelCapLogger): Self = StObject.set(x, "LevelCapLogger", value.asInstanceOf[js.Any])
    
    inline def setLevelTransformLogger(
      value: Instantiable3[
          /* name */ String, 
          /* parent */ Logger, 
          /* levelTransform */ js.Function1[/* level */ LogLevel, LogLevel], 
          LevelTransformLogger
        ]
    ): Self = StObject.set(x, "LevelTransformLogger", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Instantiable1[/* name */ String, typingsJapgolly.angularDevkitCore.mod.logging.Logger]): Self = StObject.set(x, "Logger", value.asInstanceOf[js.Any])
    
    inline def setNullLogger(value: Instantiable0[NullLogger]): Self = StObject.set(x, "NullLogger", value.asInstanceOf[js.Any])
    
    inline def setTransformLogger(
      value: Instantiable2[
          /* name */ String, 
          /* transform */ js.Function1[/* stream */ Observable_[LogEntry], Observable_[LogEntry]], 
          TransformLogger
        ]
    ): Self = StObject.set(x, "TransformLogger", value.asInstanceOf[js.Any])
  }
}
