package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about supported commands
  *
  * This interface can be used to retrieve additional information about supported commands. This interface is normally used by configuration
  * implementations to retrieve all supported commands. A dispatch information provider is normally supported by a {@link Frame} service.
  * @see Frame
  * @since OOo 2.0
  */
trait XDispatchInformationProvider
  extends StObject
     with XInterface {
  
  /**
    * returns all supported command groups.
    * @returns a sequence of supported command groups.
    * @see CommandGroup
    */
  val SupportedCommandGroups: SafeArray[Double]
  
  /**
    * returns additional information about supported commands of a given command group.
    * @param CommandGroup specifies a command group.
    * @returns name and group name of every command supported. A group ID which is not supported returns an empty com::sun::star::uno::Sequence.
    */
  def getConfigurableDispatchInformation(CommandGroup: Double): SafeArray[DispatchInformation]
  
  /**
    * returns all supported command groups.
    * @returns a sequence of supported command groups.
    * @see CommandGroup
    */
  def getSupportedCommandGroups(): SafeArray[Double]
}
object XDispatchInformationProvider {
  
  inline def apply(
    SupportedCommandGroups: SafeArray[Double],
    acquire: Callback,
    getConfigurableDispatchInformation: Double => SafeArray[DispatchInformation],
    getSupportedCommandGroups: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback
  ): XDispatchInformationProvider = {
    val __obj = js.Dynamic.literal(SupportedCommandGroups = SupportedCommandGroups.asInstanceOf[js.Any], acquire = acquire.toJsFn, getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getSupportedCommandGroups = getSupportedCommandGroups.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDispatchInformationProvider]
  }
  
  extension [Self <: XDispatchInformationProvider](x: Self) {
    
    inline def setGetConfigurableDispatchInformation(value: Double => SafeArray[DispatchInformation]): Self = StObject.set(x, "getConfigurableDispatchInformation", js.Any.fromFunction1(value))
    
    inline def setGetSupportedCommandGroups(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getSupportedCommandGroups", value.toJsFn)
    
    inline def setSupportedCommandGroups(value: SafeArray[Double]): Self = StObject.set(x, "SupportedCommandGroups", value.asInstanceOf[js.Any])
  }
}
