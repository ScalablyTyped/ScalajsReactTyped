package typingsJapgolly.raven

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ravenStrings {
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
}

