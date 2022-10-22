package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileFlatMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file/flat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[InProgressImportResult], reduce: Reducer): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  /**
    * @type {import('../../types').FileDAGBuilder}
    */
  inline def default(source: AsyncIterable[InProgressImportResult], reduce: Reducer): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
}
