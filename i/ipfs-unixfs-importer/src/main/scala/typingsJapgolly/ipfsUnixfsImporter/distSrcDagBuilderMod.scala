package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.interfaceBlockstore.mod.Blockstore
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: js.Iterable[ImportCandidate], blockstore: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  /**
    * @type {DAGBuilder}
    */
  inline def default(source: AsyncIterable[ImportCandidate], blockstore: Blockstore, options: ImporterOptions): AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]]
  
  type ChunkValidator = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ChunkValidator
  
  type Chunker = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Chunker
  
  type DAGBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.DAGBuilder
  
  type Directory = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Directory
  
  type File = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.File
}
