package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.hamtSharding.distSrcBucketMod.BucketChild
import typingsJapgolly.hamtSharding.mod.Bucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDirShardedMod {
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    */
  /**
    * @typedef {import('./dir').DirProps} DirProps
    */
  @JSImport("ipfs-unixfs-importer/dist/src/dir-sharded", JSImport.Default)
  @js.native
  open class default () extends DirSharded
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type DirProps = typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.DirProps
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    */
  /**
    * @typedef {import('./dir').DirProps} DirProps
    */
  @js.native
  trait DirSharded
    extends typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default {
    
    /** @type {Bucket<InProgressImportResult | Dir>} */
    var _bucket: Bucket[
        InProgressImportResult | typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default
      ] = js.native
    
    def childCount(): Double = js.native
    
    def directChildrenCount(): Double = js.native
    
    def onlyChild(): (Bucket[
        typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult | typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default
      ]) | (BucketChild[
        typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult | typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default
      ]) = js.native
  }
  
  type ImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
}
