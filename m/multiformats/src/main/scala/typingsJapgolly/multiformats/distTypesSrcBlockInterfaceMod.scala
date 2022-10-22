package typingsJapgolly.multiformats

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.multiformats.distTypesSrcCidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Link
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBlockInterfaceMod {
  
  trait Block[T, C /* <: Double */, A /* <: Double */, V /* <: Version */] extends StObject {
    
    var bytes: ByteView[T]
    
    var cid: Link[T, C, A, V]
  }
  object Block {
    
    inline def apply[T, C /* <: Double */, A /* <: Double */, V /* <: Version */](bytes: ByteView[T], cid: Link[T, C, A, V]): Block[T, C, A, V] = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block[T, C, A, V]]
    }
    
    extension [Self <: Block[?, ?, ?, ?], T, C /* <: Double */, A /* <: Double */, V /* <: Version */](x: Self & (Block[T, C, A, V])) {
      
      inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setCid(value: Link[T, C, A, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.multiformats.anon.Remaining[T]
    - typingsJapgolly.multiformats.anon.RemainingValue
  */
  trait BlockCursorView[T /* <: Any */] extends StObject
  object BlockCursorView {
    
    inline def Remaining[T /* <: Any */](remaining: Unit, value: T): typingsJapgolly.multiformats.anon.Remaining[T] = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.multiformats.anon.Remaining[T]]
    }
    
    inline def RemainingValue(remaining: String, value: CID[Any, Double, Double, Version]): typingsJapgolly.multiformats.anon.RemainingValue = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.multiformats.anon.RemainingValue]
    }
  }
  
  trait BlockView[T, C /* <: Double */, A /* <: Double */, V /* <: Version */]
    extends StObject
       with Block[T, C, A, V] {
    
    @JSName("cid")
    var cid_BlockView: CID[T, C, A, V]
    
    def get(path: String): BlockCursorView[Any]
    
    def links(): js.Iterable[js.Tuple2[String, CID[Any, Double, Double, Version]]]
    
    def tree(): js.Iterable[String]
    
    var value: T
  }
  object BlockView {
    
    inline def apply[T, C /* <: Double */, A /* <: Double */, V /* <: Version */](
      bytes: ByteView[T],
      cid: CID[T, C, A, V],
      get: String => BlockCursorView[Any],
      links: CallbackTo[js.Iterable[js.Tuple2[String, CID[Any, Double, Double, Version]]]],
      tree: CallbackTo[js.Iterable[String]],
      value: T
    ): BlockView[T, C, A, V] = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), links = links.toJsFn, tree = tree.toJsFn, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockView[T, C, A, V]]
    }
    
    extension [Self <: BlockView[?, ?, ?, ?], T, C /* <: Double */, A /* <: Double */, V /* <: Version */](x: Self & (BlockView[T, C, A, V])) {
      
      inline def setCid(value: CID[T, C, A, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => BlockCursorView[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLinks(value: CallbackTo[js.Iterable[js.Tuple2[String, CID[Any, Double, Double, Version]]]]): Self = StObject.set(x, "links", value.toJsFn)
      
      inline def setTree(value: CallbackTo[js.Iterable[String]]): Self = StObject.set(x, "tree", value.toJsFn)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ByteView[Data]
    extends StObject
       with Uint8Array
       with Phantom[Data]
  
  @js.native
  trait Phantom[T] extends StObject
}
