package typingsJapgolly.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParserResult extends js.Object {
  /** Package name, if declared */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  /** Imports, if any */
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  /** Populated root instance */
  var root: Root
  /** Syntax, if specified (either `"proto2"` or `"proto3"`) */
  var syntax: js.UndefOr[String] = js.undefined
  /** Weak imports, if any */
  var weakImports: js.UndefOr[js.Array[String]] = js.undefined
}

object IParserResult {
  @scala.inline
  def apply(
    root: Root,
    _package: String = null,
    imports: js.Array[String] = null,
    syntax: String = null,
    weakImports: js.Array[String] = null
  ): IParserResult = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (weakImports != null) __obj.updateDynamic("weakImports")(weakImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParserResult]
  }
}

