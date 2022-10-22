package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to information on a set of commands.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XCommandInfo
  extends StObject
     with XInterface {
  
  /**
    * obtains information for all supported commands.
    * @returns a sequence with information for all supported commands.
    */
  val Commands: SafeArray[CommandInfo]
  
  /**
    * returns information for a specific command.
    * @param Handle specifies the handle of the requested command.
    * @returns the information for the requested command.
    * @throws UnsupportedCommandException if the command is not supported.
    */
  def getCommandInfoByHandle(Handle: Double): CommandInfo
  
  /**
    * returns information for a specific command.
    * @param Name specifies the name of the requested command.
    * @returns the information for the requested command.
    * @throws UnsupportedCommandException if the command is not supported.
    */
  def getCommandInfoByName(Name: String): CommandInfo
  
  /**
    * obtains information for all supported commands.
    * @returns a sequence with information for all supported commands.
    */
  def getCommands(): SafeArray[CommandInfo]
  
  /**
    * checks whether a specific command is supported.
    * @param Handle specifies the handle of the requested command.
    * @returns `TRUE` if a command with the specified handle is supported; otherwise `FALSE` is returned.
    */
  def hasCommandByHandle(Handle: Double): Boolean
  
  /**
    * checks whether a command specific is supported.
    * @param Name specifies the name of the requested command.
    * @returns `TRUE` if a command with the specified name is supported; otherwise `FALSE` is returned.
    */
  def hasCommandByName(Name: String): Boolean
}
object XCommandInfo {
  
  inline def apply(
    Commands: SafeArray[CommandInfo],
    acquire: Callback,
    getCommandInfoByHandle: Double => CommandInfo,
    getCommandInfoByName: String => CommandInfo,
    getCommands: CallbackTo[SafeArray[CommandInfo]],
    hasCommandByHandle: Double => Boolean,
    hasCommandByName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XCommandInfo = {
    val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCommandInfoByHandle = js.Any.fromFunction1(getCommandInfoByHandle), getCommandInfoByName = js.Any.fromFunction1(getCommandInfoByName), getCommands = getCommands.toJsFn, hasCommandByHandle = js.Any.fromFunction1(hasCommandByHandle), hasCommandByName = js.Any.fromFunction1(hasCommandByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCommandInfo]
  }
  
  extension [Self <: XCommandInfo](x: Self) {
    
    inline def setCommands(value: SafeArray[CommandInfo]): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
    
    inline def setGetCommandInfoByHandle(value: Double => CommandInfo): Self = StObject.set(x, "getCommandInfoByHandle", js.Any.fromFunction1(value))
    
    inline def setGetCommandInfoByName(value: String => CommandInfo): Self = StObject.set(x, "getCommandInfoByName", js.Any.fromFunction1(value))
    
    inline def setGetCommands(value: CallbackTo[SafeArray[CommandInfo]]): Self = StObject.set(x, "getCommands", value.toJsFn)
    
    inline def setHasCommandByHandle(value: Double => Boolean): Self = StObject.set(x, "hasCommandByHandle", js.Any.fromFunction1(value))
    
    inline def setHasCommandByName(value: String => Boolean): Self = StObject.set(x, "hasCommandByName", js.Any.fromFunction1(value))
  }
}
