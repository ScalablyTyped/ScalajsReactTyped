package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSource extends StObject {
  
  var connection: PlayToConnection
  
  var next: PlayToSource
  
  def playNext(): Unit
}
object IPlayToSource {
  
  inline def apply(connection: PlayToConnection, next: PlayToSource, playNext: Callback): IPlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = playNext.toJsFn)
    __obj.asInstanceOf[IPlayToSource]
  }
  
  extension [Self <: IPlayToSource](x: Self) {
    
    inline def setConnection(value: PlayToConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setNext(value: PlayToSource): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPlayNext(value: Callback): Self = StObject.set(x, "playNext", value.toJsFn)
  }
}
