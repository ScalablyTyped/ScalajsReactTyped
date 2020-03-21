package typingsJapgolly.next.NodeJS

import typingsJapgolly.next.nextStrings.development
import typingsJapgolly.next.nextStrings.production
import typingsJapgolly.next.nextStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEnv extends js.Object {
  val NODE_ENV: development | production | test
}

object ProcessEnv {
  @scala.inline
  def apply(NODE_ENV: development | production | test): ProcessEnv = {
    val __obj = js.Dynamic.literal(NODE_ENV = NODE_ENV.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessEnv]
  }
}

