package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is passed to an {@link InteractionHandler} when creating a stratum backend fails.
  * @since OOo 2.0
  */
trait StratumCreationException
  extends StObject
     with BackendSetupException {
  
  /** Initialization data passed to the stratum instance. */
  var StratumData: String
  
  /** Identifier of the stratum service that could not be created. */
  var StratumService: String
}
object StratumCreationException {
  
  inline def apply(
    BackendException: Any,
    Context: XInterface,
    Message: String,
    StratumData: String,
    StratumService: String
  ): StratumCreationException = {
    val __obj = js.Dynamic.literal(BackendException = BackendException.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StratumData = StratumData.asInstanceOf[js.Any], StratumService = StratumService.asInstanceOf[js.Any])
    __obj.asInstanceOf[StratumCreationException]
  }
  
  extension [Self <: StratumCreationException](x: Self) {
    
    inline def setStratumData(value: String): Self = StObject.set(x, "StratumData", value.asInstanceOf[js.Any])
    
    inline def setStratumService(value: String): Self = StObject.set(x, "StratumService", value.asInstanceOf[js.Any])
  }
}
