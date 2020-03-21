package typingsJapgolly.gatsby.mod

import typingsJapgolly.gatsby.gatsbyStrings.ENUM
import typingsJapgolly.gatsby.gatsbyStrings.INPUT_OBJECT
import typingsJapgolly.gatsby.gatsbyStrings.INTERFACE
import typingsJapgolly.gatsby.gatsbyStrings.OBJECT
import typingsJapgolly.gatsby.gatsbyStrings.SCALAR
import typingsJapgolly.gatsby.gatsbyStrings.UNION
import typingsJapgolly.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import typingsJapgolly.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gatsby.mod.GatsbyGraphQLObjectType
  - typingsJapgolly.gatsby.mod.GatsbyGraphQLInputObjectType
  - typingsJapgolly.gatsby.mod.GatsbyGraphQLUnionType
  - typingsJapgolly.gatsby.mod.GatsbyGraphQLInterfaceType
  - typingsJapgolly.gatsby.mod.GatsbyGraphQLEnumType
  - typingsJapgolly.gatsby.mod.GatsbyGraphQLScalarType
*/
trait GatsbyGraphQLType extends js.Object

object GatsbyGraphQLType {
  @scala.inline
  def GatsbyGraphQLScalarType(config: ComposeScalarTypeConfig, kind: SCALAR): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLInterfaceType(config: ComposeInterfaceTypeConfig[_, _], kind: INTERFACE): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLEnumType(config: ComposeEnumTypeConfig, kind: ENUM): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLInputObjectType(config: ComposeInputObjectTypeConfig, kind: INPUT_OBJECT): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLObjectType(config: ComposeObjectTypeConfig[_, _], kind: OBJECT): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLUnionType(config: ComposeUnionTypeConfig[_, _], kind: UNION): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
}

