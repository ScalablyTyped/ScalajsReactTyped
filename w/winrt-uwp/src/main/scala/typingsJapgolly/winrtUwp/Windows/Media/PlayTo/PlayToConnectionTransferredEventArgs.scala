package typingsJapgolly.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the Transferred event. */
trait PlayToConnectionTransferredEventArgs extends StObject {
  
  /** Gets the current Play To source that a connection was transferred to. */
  var currentSource: PlayToSource
  
  /** Gets the previous Play To source that a connection was transferred from. */
  var previousSource: PlayToSource
}
object PlayToConnectionTransferredEventArgs {
  
  inline def apply(currentSource: PlayToSource, previousSource: PlayToSource): PlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource.asInstanceOf[js.Any], previousSource = previousSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionTransferredEventArgs]
  }
  
  extension [Self <: PlayToConnectionTransferredEventArgs](x: Self) {
    
    inline def setCurrentSource(value: PlayToSource): Self = StObject.set(x, "currentSource", value.asInstanceOf[js.Any])
    
    inline def setPreviousSource(value: PlayToSource): Self = StObject.set(x, "previousSource", value.asInstanceOf[js.Any])
  }
}
