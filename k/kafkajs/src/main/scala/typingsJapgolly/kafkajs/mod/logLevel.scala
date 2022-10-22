package typingsJapgolly.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait logLevel extends StObject
@JSImport("kafkajs", "logLevel")
@js.native
object logLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logLevel & Double] = js.native
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with logLevel
  /* 5 */ val DEBUG: typingsJapgolly.kafkajs.mod.logLevel.DEBUG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with logLevel
  /* 1 */ val ERROR: typingsJapgolly.kafkajs.mod.logLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with logLevel
  /* 4 */ val INFO: typingsJapgolly.kafkajs.mod.logLevel.INFO & Double = js.native
  
  @js.native
  sealed trait NOTHING
    extends StObject
       with logLevel
  /* 0 */ val NOTHING: typingsJapgolly.kafkajs.mod.logLevel.NOTHING & Double = js.native
  
  @js.native
  sealed trait WARN
    extends StObject
       with logLevel
  /* 2 */ val WARN: typingsJapgolly.kafkajs.mod.logLevel.WARN & Double = js.native
}
