package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileTrickleMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file/trickle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    source: js.Iterable[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult],
    reduce: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer,
    options: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): js.Promise[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult]]
  /**
    * @typedef {import('ipfs-unixfs').UnixFS} UnixFS
    * @typedef {import('../../types').ImporterOptions} ImporterOptions
    * @typedef {import('../../types').InProgressImportResult} InProgressImportResult
    * @typedef {import('../../types').TrickleDagNode} TrickleDagNode
    * @typedef {import('../../types').Reducer} Reducer
    * @typedef {import('../../types').FileDAGBuilder} FileDAGBuilder
    */
  /**
    * @type {FileDAGBuilder}
    */
  inline def default(
    source: AsyncIterable[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult],
    reduce: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer,
    options: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): js.Promise[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], reduce.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult]]
  
  type FileDAGBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.FileDAGBuilder
  
  type ImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
  
  type Reducer = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer
  
  type TrickleDagNode = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.TrickleDagNode
  
  type UnixFS = typingsJapgolly.ipfsUnixfs.mod.UnixFS
}
