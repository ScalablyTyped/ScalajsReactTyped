package typingsJapgolly.relayCompiler.iRMod

import typingsJapgolly.relayCompiler.irvisitorMod.VisitNode
import typingsJapgolly.relayCompiler.schemaMod.InputTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootArgumentDefinition
  extends ArgumentDefinition
     with IR
     with VisitNode {
  var kind: typingsJapgolly.relayCompiler.relayCompilerStrings.RootArgumentDefinition
  var loc: Location
  var name: String
  var `type`: InputTypeID
}

object RootArgumentDefinition {
  @scala.inline
  def apply(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): RootArgumentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootArgumentDefinition]
  }
}

