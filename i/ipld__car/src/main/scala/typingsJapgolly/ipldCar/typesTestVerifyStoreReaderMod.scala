package typingsJapgolly.ipldCar

import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTestVerifyStoreReaderMod {
  
  @JSImport("@ipld/car/types/test/verify-store-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyBlocks(iterator: BlockIterator, unordered: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlocks")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyBlocks(iterator: BlockIterator, unordered: Unit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBlocks")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyCids(iterator: CIDIterator, unordered: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCids")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyCids(iterator: CIDIterator, unordered: Unit): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyCids")(iterator.asInstanceOf[js.Any], unordered.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyGet(reader: BlockReader): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyGet")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyHas(reader: BlockReader): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyHas")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyRoots(reader: RootsReader): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyRoots")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type Block = typingsJapgolly.ipldCar.typesApiMod.Block
  
  type BlockIterator = typingsJapgolly.ipldCar.typesApiMod.BlockIterator
  
  type BlockReader = typingsJapgolly.ipldCar.typesApiMod.BlockReader
  
  type CID = typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]
  
  type CIDIterator = typingsJapgolly.ipldCar.typesApiMod.CIDIterator
  
  type RootsReader = typingsJapgolly.ipldCar.typesApiMod.RootsReader
}
