package typingsJapgolly.jupyterlabObservables.observablejsonMod

import typingsJapgolly.jupyterlabObservables.observablejsonMod.ObservableJSON.IOptions
import typingsJapgolly.jupyterlabObservables.observablemapMod.ObservableMap
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablejson", "ObservableJSON")
@js.native
/**
  * Construct a new observable JSON object.
  */
class ObservableJSON_ () extends ObservableMap[JSONValue] {
  def this(options: IOptions) = this()
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONObject = js.native
}

