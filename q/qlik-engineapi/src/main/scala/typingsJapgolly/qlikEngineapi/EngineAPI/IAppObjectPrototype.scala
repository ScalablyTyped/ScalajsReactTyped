package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppObjectPrototype[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */] extends js.Object {
  def createObject(qProp: P): js.Promise[O]
  def createSessionObject(qProp: P): js.Promise[O]
}

object IAppObjectPrototype {
  @scala.inline
  def apply[P /* <: IGenericObjectProperties */, O /* <: IGenericObject */](createObject: P => CallbackTo[js.Promise[O]], createSessionObject: P => CallbackTo[js.Promise[O]]): IAppObjectPrototype[P, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createObject")(js.Any.fromFunction1((t0: P) => createObject(t0).runNow()))
    __obj.updateDynamic("createSessionObject")(js.Any.fromFunction1((t0: P) => createSessionObject(t0).runNow()))
    __obj.asInstanceOf[IAppObjectPrototype[P, O]]
  }
}

