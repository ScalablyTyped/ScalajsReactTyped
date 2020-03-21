package typingsJapgolly.nodal.mod

import typingsJapgolly.nodal.AnonCount
import typingsJapgolly.nodal.AnonData
import typingsJapgolly.nodal.AnonFields
import typingsJapgolly.nodal.AnonMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "APIConstructor")
@js.native
class APIConstructor () extends js.Object {
  def error(message: String, details: String): AnonMeta = js.native
  def format(obj: js.Any): AnonData = js.native
  def format(obj: js.Any, arrInterface: js.Array[String]): AnonData = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any): AnonCount = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String): AnonCount = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String, resource: js.Any): AnonCount = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: Null, resource: js.Any): AnonCount = js.native
  def resourceFromArray(arr: js.Array[_]): AnonFields = js.native
  def resourceFromModelArray(modelArray: js.Any, arrInterface: js.Any): js.Any = js.native
  def response(itemArray: js.Any, arrInterface: js.Any): AnonData = js.native
  def response(itemArray: js.Any, arrInterface: js.Any, useResource: Boolean): AnonData = js.native
  def spoof(obj: js.Any): AnonData = js.native
  def spoof(obj: js.Any, useResource: Boolean): AnonData = js.native
}

