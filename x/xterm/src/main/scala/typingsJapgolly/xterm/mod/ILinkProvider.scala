package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom link provider.
  */
trait ILinkProvider extends StObject {
  
  /**
    * Provides a link a buffer position
    * @param bufferLineNumber The y position of the buffer to check for links
    * within.
    * @param callback The callback to be fired when ready with the resulting
    * link(s) for the line or `undefined`.
    */
  def provideLinks(bufferLineNumber: Double, callback: js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]): Unit
}
object ILinkProvider {
  
  inline def apply(provideLinks: (Double, js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => Callback): ILinkProvider = {
    val __obj = js.Dynamic.literal(provideLinks = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => (provideLinks(t0, t1)).runNow()))
    __obj.asInstanceOf[ILinkProvider]
  }
  
  extension [Self <: ILinkProvider](x: Self) {
    
    inline def setProvideLinks(value: (Double, js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => Callback): Self = StObject.set(x, "provideLinks", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => (value(t0, t1)).runNow()))
  }
}
