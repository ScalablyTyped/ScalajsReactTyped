package typingsJapgolly.tsJest

import typingsJapgolly.bsLogger.distLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("ts-jest/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-jest/dist/utils", "JsonableValue")
  @js.native
  open class JsonableValue[V] protected ()
    extends typingsJapgolly.tsJest.distUtilsJsonableValueMod.JsonableValue[V] {
    def this(value: V) = this()
  }
  
  inline def parse(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("ts-jest/dist/utils", "rootLogger")
  @js.native
  def rootLogger: Logger = js.native
  inline def rootLogger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootLogger")(x.asInstanceOf[js.Any])
  
  inline def stringify(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
