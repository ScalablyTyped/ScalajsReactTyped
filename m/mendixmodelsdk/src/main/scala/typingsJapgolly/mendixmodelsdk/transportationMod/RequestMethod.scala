package typingsJapgolly.mendixmodelsdk.transportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.get
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.put
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.post
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.delete
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.get = this.cast("get")
  @scala.inline
  def post: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.post = this.cast("post")
  @scala.inline
  def put: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.put = this.cast("put")
}

