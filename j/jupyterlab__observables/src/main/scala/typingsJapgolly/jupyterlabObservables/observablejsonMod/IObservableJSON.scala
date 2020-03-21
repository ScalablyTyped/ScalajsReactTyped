package typingsJapgolly.jupyterlabObservables.observablejsonMod

import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableJSON extends IObservableMap[JSONValue] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject
}

@JSImport("@jupyterlab/observables/lib/observablejson", "IObservableJSON")
@js.native
object IObservableJSON extends js.Object {
  /**
    * A type alias for observable JSON changed args.
    */
  type IChangedArgs = typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[JSONValue]
}

