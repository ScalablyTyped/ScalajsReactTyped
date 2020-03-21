package typingsJapgolly.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  @js.native
  class Logger protected ()
    extends typingsJapgolly.sipJs.loggerMod.Logger {
    def this(logger: typingsJapgolly.sipJs.loggerFactoryMod.LoggerFactory, category: String) = this()
    def this(logger: typingsJapgolly.sipJs.loggerFactoryMod.LoggerFactory, category: String, label: String) = this()
  }
  
  @js.native
  class LoggerFactory ()
    extends typingsJapgolly.sipJs.loggerFactoryMod.LoggerFactory
  
  @js.native
  object Levels extends js.Object {
    /* 3 */ val debug: typingsJapgolly.sipJs.levelsMod.Levels.debug with Double = js.native
    /* 0 */ val error: typingsJapgolly.sipJs.levelsMod.Levels.error with Double = js.native
    /* 2 */ val log: typingsJapgolly.sipJs.levelsMod.Levels.log with Double = js.native
    /* 1 */ val warn: typingsJapgolly.sipJs.levelsMod.Levels.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sipJs.levelsMod.Levels with Double] = js.native
  }
  
}

