package typingsJapgolly.gatsby.mod

import typingsJapgolly.gatsby.gatsbyStrings.SCALAR
import typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyGraphQLScalarType extends GatsbyGraphQLType {
  var config: ComposeScalarTypeConfig
  var kind: SCALAR
}

object GatsbyGraphQLScalarType {
  @scala.inline
  def apply(config: ComposeScalarTypeConfig, kind: SCALAR): GatsbyGraphQLScalarType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLScalarType]
  }
}

