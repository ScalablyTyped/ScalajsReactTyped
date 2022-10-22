package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryNodeTransformer
import typingsJapgolly.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryOptions
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMapMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def map(ast: SourceFile, selector: String, nodeTransformer: TSQueryNodeTransformer): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nodeTransformer.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  inline def map(
    ast: SourceFile,
    selector: String,
    nodeTransformer: TSQueryNodeTransformer,
    options: TSQueryOptions
  ): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nodeTransformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
}
