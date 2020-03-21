package typingsJapgolly.dojo.dojox.app.utils

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/config.html
  *
  * This module contains the config
  *
  */
trait config extends js.Object {
  /**
    * does a deep copy of the source into the target to merge the config from the source into the target
    * configMerge will merge the source config into the target config with a deep copy.
    * anything starting with __ will be skipped and if the target is an array the source items will be pushed into the target.
    *
    * @param target an object representing the config which will be updated by merging in the source.
    * @param source an object representing the config to be merged into the target.
    */
  def configMerge(target: js.Object, source: js.Object): js.Any
  /**
    * scan the source config for has checks and call configMerge to merge has sections, and remove the has sections from the source.
    * configProcessHas will scan the source config for has checks.
    * For each has section the items inside the has section will be tested with has (sniff)
    * If the has test is true it will call configMerge to merge has sections back into the source config.
    * It will always remove the has section from the source after processing it.
    * The names in the has section can be separated by a comma, indicating that any of those being true will satisfy the test.
    *
    * @param source an object representing the config to be processed.
    */
  def configProcessHas(source: js.Object): js.Any
}

object config {
  @scala.inline
  def apply(
    configMerge: (js.Object, js.Object) => CallbackTo[js.Any],
    configProcessHas: js.Object => CallbackTo[js.Any]
  ): config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configMerge")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => configMerge(t0, t1).runNow()))
    __obj.updateDynamic("configProcessHas")(js.Any.fromFunction1((t0: js.Object) => configProcessHas(t0).runNow()))
    __obj.asInstanceOf[config]
  }
}

