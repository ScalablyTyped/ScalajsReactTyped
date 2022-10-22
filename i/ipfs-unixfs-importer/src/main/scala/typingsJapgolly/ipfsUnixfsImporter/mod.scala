package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importer(source: js.Iterable[ImportCandidate], blockstore: Blockstore): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: js.Iterable[ImportCandidate], blockstore: Blockstore, options: UserImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: ImportCandidate, blockstore: Blockstore): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: ImportCandidate, blockstore: Blockstore, options: UserImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: AsyncIterable[ImportCandidate], blockstore: Blockstore): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  inline def importer(source: AsyncIterable[ImportCandidate], blockstore: Blockstore, options: UserImporterOptions): AsyncGenerator[ImportResult, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importer")(source.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[ImportResult, Unit, Any]]
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type BufferImporter = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.BufferImporter
  
  type ChunkValidator = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ChunkValidator
  
  type Chunker = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Chunker
  
  type DAGBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.DAGBuilder
  
  type Directory = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Directory
  
  type File = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.File
  
  type ImportCandidate = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportCandidate
  
  type ImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type ProgressHandler = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ProgressHandler
  
  type Reducer = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer
  
  type TreeBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.TreeBuilder
  
  type UserImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.UserImporterOptions
}
