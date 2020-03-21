package typingsJapgolly.relayCompiler.iRMod

import typingsJapgolly.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive
  extends IR
     with VisitNode {
  var args: js.Array[Argument]
  var kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Directive
  var loc: Location
  var metadata: Metadata
  var name: String
}

object Directive {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Directive,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): Directive = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
}

