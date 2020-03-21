package typingsJapgolly.ngmap.angular.map

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgMapProvider extends js.Object {
  /**
    * @param {Hash} options
    * @example
    *  app.config(function(NgMapProvider) {
    *    NgMapProvider.setDefaultOptions({
    *      marker: {
    *        optimized: false
    *      }
    *    });
    *  });
    */
  def setDefaultOptions(options: INgMapOptions): Unit
}

object INgMapProvider {
  @scala.inline
  def apply(setDefaultOptions: INgMapOptions => Callback): INgMapProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDefaultOptions")(js.Any.fromFunction1((t0: typingsJapgolly.ngmap.angular.map.INgMapOptions) => setDefaultOptions(t0).runNow()))
    __obj.asInstanceOf[INgMapProvider]
  }
}

