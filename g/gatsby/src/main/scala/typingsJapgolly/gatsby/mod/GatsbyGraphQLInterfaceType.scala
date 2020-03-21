package typingsJapgolly.gatsby.mod

import typingsJapgolly.gatsby.gatsbyStrings.INTERFACE
import typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyGraphQLInterfaceType extends GatsbyGraphQLType {
  var config: ComposeInterfaceTypeConfig[_, _]
  var kind: INTERFACE
}

object GatsbyGraphQLInterfaceType {
  @scala.inline
  def apply(config: ComposeInterfaceTypeConfig[_, _], kind: INTERFACE): GatsbyGraphQLInterfaceType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLInterfaceType]
  }
}

