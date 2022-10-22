package typingsJapgolly.ioredis

import typingsJapgolly.ioredis.anon.Buffer
import typingsJapgolly.ioredis.anon.Lua
import typingsJapgolly.ioredis.builtTypesMod.WriteableStream
import typingsJapgolly.ioredis.builtUtilsRedisCommanderMod.ClientContext
import typingsJapgolly.ioredis.builtUtilsRedisCommanderMod.RedisCommander
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtUtilsCommanderMod {
  
  @JSImport("ioredis/built/utils/Commander", JSImport.Default)
  @js.native
  open class default[Context /* <: ClientContext */] ()
    extends StObject
       with Commander[Context]
  
  @js.native
  trait Commander[Context /* <: ClientContext */]
    extends StObject
       with RedisCommander[Context] {
    
    /**
      * Create add builtin command
      */
    def addBuiltinCommand(commandName: String): Unit = js.native
    
    /**
      * @ignore
      */
    var addedBuiltinSet: Set[String] = js.native
    
    /**
      * Create a builtin command
      */
    def createBuiltinCommand(commandName: String): Buffer = js.native
    
    /**
      * Define a custom command using lua script
      */
    def defineCommand(name: String, definition: Lua): Unit = js.native
    
    /**
      * Return supported builtin commands
      */
    def getBuiltinCommands(): js.Array[String] = js.native
    
    var options: CommanderOptions = js.native
    
    /**
      * @ignore
      */
    def sendCommand(command: typingsJapgolly.ioredis.builtCommandMod.default): Any = js.native
    def sendCommand(command: typingsJapgolly.ioredis.builtCommandMod.default, stream: Unit, node: Any): Any = js.native
    def sendCommand(command: typingsJapgolly.ioredis.builtCommandMod.default, stream: WriteableStream): Any = js.native
    def sendCommand(command: typingsJapgolly.ioredis.builtCommandMod.default, stream: WriteableStream, node: Any): Any = js.native
  }
  
  trait CommanderOptions extends StObject {
    
    var keyPrefix: js.UndefOr[String] = js.undefined
    
    var showFriendlyErrorStack: js.UndefOr[Boolean] = js.undefined
  }
  object CommanderOptions {
    
    inline def apply(): CommanderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommanderOptions]
    }
    
    extension [Self <: CommanderOptions](x: Self) {
      
      inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setShowFriendlyErrorStack(value: Boolean): Self = StObject.set(x, "showFriendlyErrorStack", value.asInstanceOf[js.Any])
      
      inline def setShowFriendlyErrorStackUndefined: Self = StObject.set(x, "showFriendlyErrorStack", js.undefined)
    }
  }
}
