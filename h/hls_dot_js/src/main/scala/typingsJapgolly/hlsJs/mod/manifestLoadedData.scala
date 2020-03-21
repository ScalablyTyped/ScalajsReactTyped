package typingsJapgolly.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait manifestLoadedData extends js.Object {
  var audioTracks: js.Array[Double]
  var levels: js.Array[Double]
  var stats: Stats
  var url: String
}

object manifestLoadedData {
  @scala.inline
  def apply(audioTracks: js.Array[Double], levels: js.Array[Double], stats: Stats, url: String): manifestLoadedData = {
    val __obj = js.Dynamic.literal(audioTracks = audioTracks.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[manifestLoadedData]
  }
}

