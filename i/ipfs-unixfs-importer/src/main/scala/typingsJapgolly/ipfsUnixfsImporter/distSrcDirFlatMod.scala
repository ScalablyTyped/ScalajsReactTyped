package typingsJapgolly.ipfsUnixfsImporter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDirFlatMod {
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('./dir').DirProps} DirProps
    * @typedef {import('@ipld/dag-pb').PBNode} PBNode
    * @typedef {import('@ipld/dag-pb').PBLink} PBLink
    */
  @JSImport("ipfs-unixfs-importer/dist/src/dir-flat", JSImport.Default)
  @js.native
  open class default () extends DirFlat
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  /**
    * @typedef {import('./types').ImporterOptions} ImporterOptions
    * @typedef {import('./types').ImportResult} ImportResult
    * @typedef {import('./types').InProgressImportResult} InProgressImportResult
    * @typedef {import('interface-blockstore').Blockstore} Blockstore
    * @typedef {import('./dir').DirProps} DirProps
    * @typedef {import('@ipld/dag-pb').PBNode} PBNode
    * @typedef {import('@ipld/dag-pb').PBLink} PBLink
    */
  @js.native
  trait DirFlat
    extends typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default {
    
    /** @type {{ [key: string]: InProgressImportResult | Dir }} */
    var _children: StringDictionary[
        typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult | typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default
      ] = js.native
    
    def childCount(): Double = js.native
    
    def directChildrenCount(): Double = js.native
    
    def onlyChild(): typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult | typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.default = js.native
  }
  
  type DirProps = typingsJapgolly.ipfsUnixfsImporter.distSrcDirMod.DirProps
  
  type ImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImportResult
  
  type ImporterOptions = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.ImporterOptions
  
  type InProgressImportResult = typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.InProgressImportResult
  
  type PBLink = typingsJapgolly.ipldDagPb.mod.PBLink
  
  type PBNode = typingsJapgolly.ipldDagPb.mod.PBNode
}
