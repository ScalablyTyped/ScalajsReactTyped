package typingsJapgolly.ipfsUnixfsExporter

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsUnixfsExporter.distSrcResolversUnixfsV1Mod.UnixfsV1Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversUnixfsV1ContentFileMod extends Shortcut {
  
  /**
    * @type {import('../').UnixfsV1Resolver}
    */
  @JSImport("ipfs-unixfs-exporter/dist/src/resolvers/unixfs-v1/content/file", JSImport.Default)
  @js.native
  val default: UnixfsV1Resolver = js.native
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type ExporterOptions = typingsJapgolly.ipfsUnixfsExporter.distSrcTypesMod.ExporterOptions
  
  type PBLink = typingsJapgolly.ipldDagPb.mod.PBLink
  
  type PBNode = typingsJapgolly.ipldDagPb.mod.PBNode
  
  type _To = UnixfsV1Resolver
  
  /* This means you don't have to write `default`, but can instead just say `distSrcResolversUnixfsV1ContentFileMod.foo` */
  override def _to: UnixfsV1Resolver = default
}
