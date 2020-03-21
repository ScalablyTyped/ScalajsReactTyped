package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping[Source, Target] extends js.Object {
  /**
    * The array of results. These results will be synchronized with the latest array of sources that were provided using [[map]].
    */
  var results: js.Array[Target]
  /**
    * Maps a new array of sources and updates [[results]].
    *
    * @param newSources   The new array of sources.
    */
  def map(newSources: js.Array[Source]): Unit
}

object Mapping {
  @scala.inline
  def apply[Source, Target](map: js.Array[Source] => Callback, results: js.Array[Target]): Mapping[Source, Target] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Array[Source]) => map(t0).runNow()))
    __obj.asInstanceOf[Mapping[Source, Target]]
  }
}

