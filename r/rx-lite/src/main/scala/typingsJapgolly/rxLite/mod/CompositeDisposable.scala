package typingsJapgolly.rxLite.mod

import typingsJapgolly.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typingsJapgolly.rxLite.Rx.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

