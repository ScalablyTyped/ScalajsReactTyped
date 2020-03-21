package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryNodeTransformer
import typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  def map(ast: SourceFile, selector: String, nodeTransformer: TSQueryNodeTransformer): SourceFile = js.native
  def map(
    ast: SourceFile,
    selector: String,
    nodeTransformer: TSQueryNodeTransformer,
    options: TSQueryOptions
  ): SourceFile = js.native
}

