package typingsJapgolly.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the arguments passed to the application on startup.
  * Use the [getArguments](Titanium.App.getArguments) method to retrieve the launch options.
  */
trait launchOptions extends js.Object {
  /**
  	 * If set to `true`, this key indicates that the application was launched in response to an
  	 * incoming location event.
  	 */
  var launchOptionsLocationKey: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This key indicates that the application was launched by another
  	 * application with the specified bundle ID.
  	 */
  var source: js.UndefOr[String] = js.undefined
  /**
  	 * This key indicates that the application was launched in order to open
  	 * the specified URL.
  	 */
  var url: js.UndefOr[String] = js.undefined
}

object launchOptions {
  @scala.inline
  def apply(
    launchOptionsLocationKey: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    url: String = null
  ): launchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(launchOptionsLocationKey)) __obj.updateDynamic("launchOptionsLocationKey")(launchOptionsLocationKey.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[launchOptions]
  }
}

