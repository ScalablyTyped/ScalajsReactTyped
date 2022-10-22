package typingsJapgolly.ipldCar

import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibEncoderMod {
  
  @JSImport("@ipld/car/types/lib/encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEncoder(writer: typingsJapgolly.ipldCar.typesLibCodingMod.IteratorChannelWriter[js.typedarray.Uint8Array]): CarEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoder")(writer.asInstanceOf[js.Any]).asInstanceOf[CarEncoder]
  
  inline def createHeader(roots: js.Array[CID]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeader")(roots.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  type Block = typingsJapgolly.ipldCar.typesApiMod.Block
  
  type CID = typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]
  
  type CarEncoder = typingsJapgolly.ipldCar.typesLibCodingMod.CarEncoder
  
  type IteratorChannelWriter = typingsJapgolly.ipldCar.typesLibCodingMod.IteratorChannelWriter[js.typedarray.Uint8Array]
}
