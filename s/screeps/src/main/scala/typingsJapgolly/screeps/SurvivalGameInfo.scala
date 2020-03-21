package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with survival game info
  */
trait SurvivalGameInfo extends js.Object {
  /**
    * Current score.
    */
  var score: Double
  /**
    * Time to the next wave of invaders.
    */
  var timeToWave: Double
  /**
    * The number of the next wave.
    */
  var wave: Double
}

object SurvivalGameInfo {
  @scala.inline
  def apply(score: Double, timeToWave: Double, wave: Double): SurvivalGameInfo = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], timeToWave = timeToWave.asInstanceOf[js.Any], wave = wave.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SurvivalGameInfo]
  }
}

