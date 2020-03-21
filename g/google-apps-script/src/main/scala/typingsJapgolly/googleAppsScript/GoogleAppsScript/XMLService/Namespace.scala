package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML namespace.
  */
trait Namespace extends js.Object {
  def getPrefix(): String
  def getURI(): String
}

object Namespace {
  @scala.inline
  def apply(getPrefix: CallbackTo[String], getURI: CallbackTo[String]): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPrefix")(getPrefix.toJsFn)
    __obj.updateDynamic("getURI")(getURI.toJsFn)
    __obj.asInstanceOf[Namespace]
  }
}

