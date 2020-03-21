package typingsJapgolly.jupyterlabObservables.modeldbMod.ModelDB

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory interface for creating `IModelDB` objects.
  */
trait IFactory extends js.Object {
  /**
    * Create a new `IModelDB` instance.
    */
  def createNew(path: String): IModelDB
}

object IFactory {
  @scala.inline
  def apply(createNew: String => CallbackTo[IModelDB]): IFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createNew")(js.Any.fromFunction1((t0: java.lang.String) => createNew(t0).runNow()))
    __obj.asInstanceOf[IFactory]
  }
}

