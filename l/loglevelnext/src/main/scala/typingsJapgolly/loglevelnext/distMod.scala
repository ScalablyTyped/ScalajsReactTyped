package typingsJapgolly.loglevelnext

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.loglevelnext.distLogLevelMod.LogLevelOptions
import typingsJapgolly.loglevelnext.distPrefixFactoryMod.PrefixFactoryOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod extends Shortcut {
  
  @JSImport("loglevelnext/dist", JSImport.Default)
  @js.native
  val default: DefaultLogger = js.native
  
  @JSImport("loglevelnext/dist", "LogLevel")
  @js.native
  open class LogLevel protected ()
    extends typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel {
    def this(options: LogLevelOptions) = this()
  }
  
  @JSImport("loglevelnext/dist", "MethodFactory")
  @js.native
  open class MethodFactory ()
    extends typingsJapgolly.loglevelnext.distMethodFactoryMod.MethodFactory {
    def this(logger: typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel) = this()
  }
  
  @JSImport("loglevelnext/dist", "PrefixFactory")
  @js.native
  open class PrefixFactory ()
    extends typingsJapgolly.loglevelnext.distPrefixFactoryMod.PrefixFactory {
    def this(logger: typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel) = this()
    def this(logger: Unit, options: PrefixFactoryOptions) = this()
    def this(logger: typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel, options: PrefixFactoryOptions) = this()
  }
  
  @js.native
  trait DefaultLogger
    extends typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel {
    
    /* private */ var cache: Any = js.native
    
    def create(opts: String): typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel = js.native
    def create(opts: LogLevelOptions): typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel = js.native
    
    def factories: Any = js.native
    
    def loggers: Record[String, typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel] = js.native
  }
  
  type _To = DefaultLogger
  
  /* This means you don't have to write `default`, but can instead just say `distMod.foo` */
  override def _to: DefaultLogger = default
}
