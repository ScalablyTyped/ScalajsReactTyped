package typingsJapgolly.ipfsUnixfsImporter

import typingsJapgolly.interfaceBlockstore.mod.Blockstore
import typingsJapgolly.ipfsUnixfsImporter.distSrcTypesMod.PersistOptions
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPersistMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/utils/persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {Uint8Array} buffer
    * @param {import('interface-blockstore').Blockstore} blockstore
    * @param {import('../types').PersistOptions} options
    */
  inline def default(buffer: js.typedarray.Uint8Array, blockstore: Blockstore, options: PersistOptions): js.Promise[CID[Any, Double, Double, Version]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(buffer.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CID[Any, Double, Double, Version]]]
}
