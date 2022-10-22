package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import typingsJapgolly.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disposable
  extends StObject
     with IDisposable
object Disposable {
  
  inline def apply(dispose: Callback): Disposable = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[Disposable]
  }
}
