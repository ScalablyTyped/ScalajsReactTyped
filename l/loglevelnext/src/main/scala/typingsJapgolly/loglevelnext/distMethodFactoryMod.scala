package typingsJapgolly.loglevelnext

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.loglevelnext.anon.DEBUG
import typingsJapgolly.loglevelnext.distLogLevelMod.LogLevel
import typingsJapgolly.loglevelnext.loglevelnextStrings.ERROR
import typingsJapgolly.loglevelnext.loglevelnextStrings.INFO
import typingsJapgolly.loglevelnext.loglevelnextStrings.SILENT
import typingsJapgolly.loglevelnext.loglevelnextStrings.TRACE
import typingsJapgolly.loglevelnext.loglevelnextStrings.WARN
import typingsJapgolly.std.Lowercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodFactoryMod {
  
  @JSImport("loglevelnext/dist/MethodFactory", "MethodFactory")
  @js.native
  open class MethodFactory ()
    extends StObject
       with Factory {
    def this(logger: LogLevel) = this()
    
    @JSName("levels")
    def levels_MMethodFactory: DEBUG = js.native
    
    @JSName("logger")
    def logger_MMethodFactory: LogLevel = js.native
    
    @JSName("methods")
    def methods_MMethodFactory: js.Array[String] = js.native
  }
  
  type BindTarget = StringDictionary[js.Function]
  
  @js.native
  trait Factory
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def bindMethod(obj: BindTarget, methodName: String): Any = js.native
    
    def distillLevel(level: String): Any = js.native
    def distillLevel(level: Double): Any = js.native
    
    def levelValid(level: String): Boolean = js.native
    def levelValid(level: Double): Boolean = js.native
    
    var levels: UnknownFactoryLevels = js.native
    
    var logger: LogLevel = js.native
    
    def make(methodName: String): js.Function = js.native
    
    var methods: js.UndefOr[js.Array[String]] = js.native
    
    def replaceMethods(logLevel: String): Unit = js.native
    def replaceMethods(logLevel: Double): Unit = js.native
  }
  
  type MethodFactoryLevels = Lowercase[
    /* keyof loglevelnext.anon.DEBUG */ TRACE | typingsJapgolly.loglevelnext.loglevelnextStrings.DEBUG | INFO | WARN | ERROR | SILENT
  ]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Uppercase<string> ]: number} */ trait UnknownFactoryLevels extends StObject {
    
    var SILENT: Double
  }
  object UnknownFactoryLevels {
    
    inline def apply(SILENT: Double): UnknownFactoryLevels = {
      val __obj = js.Dynamic.literal(SILENT = SILENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnknownFactoryLevels]
    }
    
    extension [Self <: UnknownFactoryLevels](x: Self) {
      
      inline def setSILENT(value: Double): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
    }
  }
}
