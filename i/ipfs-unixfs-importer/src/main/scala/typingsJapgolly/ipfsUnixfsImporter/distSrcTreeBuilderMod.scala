package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTreeBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/tree-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {TreeBuilder}
    */
  inline def default(
    source: AsyncIterable[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult],
    block: typingsJapgolly.interfaceBlockstore.mod.Blockstore,
    options: typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  ): AsyncIterable[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportResult]]
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type ImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
  
  type TreeBuilder = js.Function3[
    /* source */ AsyncIterable[InProgressImportResult], 
    /* blockstore */ Blockstore, 
    /* options */ ImporterOptions, 
    AsyncIterable[ImportResult]
  ]
}
