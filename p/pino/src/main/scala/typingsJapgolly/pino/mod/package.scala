package typingsJapgolly.pino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LevelChangeEventListener = js.Function4[
    /* lvl */ typingsJapgolly.pino.mod.LevelWithSilent | java.lang.String, 
    /* val */ scala.Double, 
    /* prevLvl */ typingsJapgolly.pino.mod.LevelWithSilent | java.lang.String, 
    /* prevVal */ scala.Double, 
    scala.Unit
  ]
  type MixinFn = js.Function0[js.Object]
  type SerializedError = typingsJapgolly.pinoStdSerializers.mod.SerializedError
  type SerializedRequest = typingsJapgolly.pinoStdSerializers.mod.SerializedRequest
  type SerializedResponse = typingsJapgolly.pinoStdSerializers.mod.SerializedResponse
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  type TimeFn = js.Function0[java.lang.String]
  type WriteFn = js.Function1[/* o */ js.Object, scala.Unit]
}
