package typingsJapgolly.graphqlTools.extractFieldMod

import typingsJapgolly.graphqlTools.AnonFrom
import typingsJapgolly.graphqlTools.interfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/ExtractField", JSImport.Default)
@js.native
class default protected () extends ExtractField {
  def this(hasFromTo: AnonFrom) = this()
  /* CompleteClass */
  override var from: js.Any = js.native
  /* CompleteClass */
  override var to: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MExtractField(originalRequest: Request): Request = js.native
}

