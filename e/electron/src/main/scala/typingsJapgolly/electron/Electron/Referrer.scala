package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`no-referrer-when-downgrade`
import typingsJapgolly.electron.electronStrings.`no-referrer`
import typingsJapgolly.electron.electronStrings.`same-origin`
import typingsJapgolly.electron.electronStrings.`strict-origin-when-cross-origin`
import typingsJapgolly.electron.electronStrings.`strict-origin`
import typingsJapgolly.electron.electronStrings.`unsafe-url`
import typingsJapgolly.electron.electronStrings.default
import typingsJapgolly.electron.electronStrings.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Referrer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/referrer
  /**
    * Can be default, unsafe-url, no-referrer-when-downgrade, no-referrer, origin,
    * strict-origin-when-cross-origin, same-origin or strict-origin. See the for more
    * details on the meaning of these values.
    */
  var policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`
  /**
    * HTTP Referrer URL.
    */
  var url: String
}

object Referrer {
  @scala.inline
  def apply(
    policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`,
    url: String
  ): Referrer = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Referrer]
  }
}

