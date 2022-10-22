package typingsJapgolly.ipfsUnixfsExporter

import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs-exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exporter(path: String, blockstore: Blockstore): js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  inline def exporter(
    path: String,
    blockstore: Blockstore,
    options: typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  inline def exporter(path: CID[Any, Double, Double, Version], blockstore: Blockstore): js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  inline def exporter(
    path: CID[Any, Double, Double, Version],
    blockstore: Blockstore,
    options: typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("exporter")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry]]
  
  inline def recursive(path: String, blockstore: Blockstore): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(
    path: String,
    blockstore: Blockstore,
    options: typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(path: CID[Any, Double, Double, Version], blockstore: Blockstore): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def recursive(
    path: CID[Any, Double, Double, Version],
    blockstore: Blockstore,
    options: typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  
  inline def walkPath(path: String, blockstore: Blockstore): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(
    path: String,
    blockstore: Blockstore,
    options: typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(path: CID[Any, Double, Double, Version], blockstore: Blockstore): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  inline def walkPath(
    path: CID[Any, Double, Double, Version],
    blockstore: Blockstore,
    options: typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  ): AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkPath")(path.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry, Unit, Any]]
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type ExporterOptions = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  
  type IdentityNode = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.IdentityNode
  
  type ObjectNode = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ObjectNode
  
  type RawNode = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.RawNode
  
  type UnixFS = typingsJapgolly.ipfsUnixfs.mod.UnixFS
  
  type UnixFSDirectory = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSDirectory
  
  type UnixFSEntry = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSEntry
  
  type UnixFSFile = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.UnixFSFile
}
