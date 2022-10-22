package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileBalancedMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file/balanced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[InProgressImportResult], reduce: Reducer, options: ImporterOptions): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  /**
    * @typedef {import('../../types').FileDAGBuilder} FileDAGBuilder
    */
  /**
    * @type {FileDAGBuilder}
    */
  inline def default(source: AsyncIterable[InProgressImportResult], reduce: Reducer, options: ImporterOptions): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  
  type FileDAGBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.FileDAGBuilder
}
