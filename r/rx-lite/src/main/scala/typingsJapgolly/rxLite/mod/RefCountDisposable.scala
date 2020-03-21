package typingsJapgolly.rxLite.mod

import typingsJapgolly.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "RefCountDisposable")
@js.native
class RefCountDisposable protected ()
  extends typingsJapgolly.rxLite.Rx.RefCountDisposable {
  def this(disposable: IDisposable) = this()
}

