package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.entityMod.Entity
import typingsJapgolly.wonderFrp.idisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/Disposable/SingleDisposable", JSImport.Namespace)
@js.native
object singleDisposableMod extends js.Object {
  @js.native
  class SingleDisposable protected ()
    extends Entity
       with IDisposable {
    def this(dispose: js.Function) = this()
    def this(dispose: IDisposable) = this()
    var _disposable: js.Any = js.native
    var _isDisposed: js.Any = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    def setDispose(disposable: IDisposable): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SingleDisposable extends js.Object {
    def create(): SingleDisposable = js.native
    def create(dispose: js.Function): SingleDisposable = js.native
    def create(dispose: IDisposable): SingleDisposable = js.native
  }
  
}

