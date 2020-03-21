package typingsJapgolly.graphqlTools

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Request
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/transforms", JSImport.Namespace)
@js.native
object transformsTransformsMod extends js.Object {
  def applyRequestTransforms(originalRequest: Request, transforms: js.Array[Transform]): Request = js.native
  def applyResultTransforms(originalResult: js.Any, transforms: js.Array[Transform]): js.Any = js.native
  def applySchemaTransforms(originalSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema = js.native
  def composeTransforms(transforms: Transform*): Transform = js.native
}

