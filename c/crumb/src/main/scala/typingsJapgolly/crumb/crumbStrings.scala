package typingsJapgolly.crumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object crumbStrings {
  @js.native
  sealed trait payload extends js.Object
  
  @js.native
  sealed trait query extends js.Object
  
  @scala.inline
  def payload: payload = "payload".asInstanceOf[payload]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
}

