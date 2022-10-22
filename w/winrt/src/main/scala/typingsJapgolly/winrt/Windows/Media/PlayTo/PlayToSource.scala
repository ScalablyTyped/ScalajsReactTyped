package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSource
  extends StObject
     with IPlayToSource
object PlayToSource {
  
  inline def apply(connection: PlayToConnection, next: PlayToSource, playNext: Callback): PlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = playNext.toJsFn)
    __obj.asInstanceOf[PlayToSource]
  }
}
