package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {import('../../types').UnixFSV1DagBuilder<File>}
    */
  inline def default(
    file: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.File,
    block: typingsJapgolly.interfaceBlockstore.mod.Blockstore,
    options: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type DAGBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.DAGBuilder
  
  type File = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.File
  
  type FileDAGBuilder = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.FileDAGBuilder
  
  type ImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type Reducer = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.Reducer
}
