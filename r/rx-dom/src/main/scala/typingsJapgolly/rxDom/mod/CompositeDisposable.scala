package typingsJapgolly.rxDom.mod

import typingsJapgolly.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typingsJapgolly.rx.mod.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

