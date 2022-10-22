package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.distTypesSrcBasesInterfaceMod.Multibase
import typingsJapgolly.multiformats.distTypesSrcBasesInterfaceMod.MultibaseEncoder
import typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.Phantom
import typingsJapgolly.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typingsJapgolly.multiformats.multiformatsInts.`0`
import typingsJapgolly.multiformats.multiformatsInts.`0x12`
import typingsJapgolly.multiformats.multiformatsInts.`0x70`
import typingsJapgolly.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcLinkInterfaceMod {
  
  type DAG_PB = `0x70`
  
  type LegacyLink[T /* <: Any */] = Link[T, DAG_PB, SHA_256, `0`]
  
  @js.native
  trait Link[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, V /* <: Version */]
    extends StObject
       with Phantom[Data] {
    
    val byteLength: Double = js.native
    
    val byteOffset: Double = js.native
    
    val bytes: ByteView[Link[Data, Format, Alg, V]] = js.native
    
    val code: Format = js.native
    
    def link(): Link[Data, Format, Alg, V] = js.native
    
    val multihash: MultihashDigest[Alg] = js.native
    
    def toJSON(): typingsJapgolly.multiformats.anon.Version[V, Format] = js.native
    
    def toString[Prefix /* <: String */](base: MultibaseEncoder[Prefix]): ToString[Link[Data, Format, Alg, Version], Prefix] = js.native
    
    def toV1(): Link[Data, Format, Alg, `1`] = js.native
    
    val version: V = js.native
  }
  
  type SHA_256 = `0x12`
  
  type ToString[T, Prefix /* <: String */] = Multibase[Prefix] & Phantom[T]
  
  type UnknownLink = LegacyLink[Any] | (Link[Any, Double, Double, Version])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.multiformats.multiformatsInts.`0`
    - typingsJapgolly.multiformats.multiformatsInts.`1`
  */
  trait Version extends StObject
  object Version {
    
    inline def `0`: typingsJapgolly.multiformats.multiformatsInts.`0` = 0.asInstanceOf[typingsJapgolly.multiformats.multiformatsInts.`0`]
    
    inline def `1`: typingsJapgolly.multiformats.multiformatsInts.`1` = 1.asInstanceOf[typingsJapgolly.multiformats.multiformatsInts.`1`]
  }
}
