package typingsJapgolly.atAngularCore.schematicsMigrationsStaticDashQueriesAngularQueryDashDefinitionMod

import typingsJapgolly.atAngularCore.schematicsUtilsNgUnderscoreDecoratorsMod.NgDecorator
import typingsJapgolly.typescript.typescriptMod.ClassDeclaration
import typingsJapgolly.typescript.typescriptMod.Node
import typingsJapgolly.typescript.typescriptMod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgQueryDefinition extends js.Object {
  /** Class declaration that holds this query. */
  var container: ClassDeclaration
  /** Decorator that declares this as a query. */
  var decorator: NgDecorator
  /** Name of the query. Set to "null" in case the query name is not statically analyzable. */
  var name: String | Null
  /** Node that declares this query. */
  var node: Node
  /**
    * Property declaration that refers to the query value. For accessors there
    * is no property that is guaranteed to access the query value.
    */
  var property: PropertyDeclaration | Null
  /** Type of the query definition. */
  var `type`: QueryType
}

object NgQueryDefinition {
  @scala.inline
  def apply(
    container: ClassDeclaration,
    decorator: NgDecorator,
    node: Node,
    `type`: QueryType,
    name: String = null,
    property: PropertyDeclaration = null
  ): NgQueryDefinition = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], decorator = decorator.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgQueryDefinition]
  }
}

