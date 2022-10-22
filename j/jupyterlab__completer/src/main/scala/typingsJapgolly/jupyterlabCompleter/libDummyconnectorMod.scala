package typingsJapgolly.jupyterlabCompleter

import typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typingsJapgolly.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDummyconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/dummyconnector", "DummyConnector")
  @js.native
  open class DummyConnector () extends DataConnector[IReply, Unit, IRequest, String]
}
