package typingsJapgolly.graphqlTools.checkResultAndHandleErrorsMod

import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/CheckResultAndHandleErrors", JSImport.Default)
@js.native
class default protected () extends CheckResultAndHandleErrors {
  def this(info: GraphQLResolveInfo) = this()
  def this(info: GraphQLResolveInfo, fieldName: String) = this()
  /* CompleteClass */
  override var info: js.Any = js.native
  /* CompleteClass */
  @JSName("transformResult")
  override def transformResult_MCheckResultAndHandleErrors(result: js.Any): js.Any = js.native
}

