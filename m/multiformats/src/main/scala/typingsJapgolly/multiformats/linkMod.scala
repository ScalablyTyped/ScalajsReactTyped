package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.distTypesSrcBasesInterfaceMod.MultibaseDecoder
import typingsJapgolly.multiformats.distTypesSrcBasesInterfaceMod.MultibaseEncoder
import typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typingsJapgolly.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.LegacyLink
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Link
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.ToString
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformats.multiformatsInts.`0`
import typingsJapgolly.multiformats.multiformatsInts.`18`
import typingsJapgolly.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object linkMod {
  
  @JSImport("multiformats/link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[Data /* <: Any */, Code /* <: Double */, Alg /* <: Double */](code: Code, digest: MultihashDigest[Alg]): Link[Data, Code, Alg, `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Link[Data, Code, Alg, `1`]]
  
  inline def createLegacy_18(digest: MultihashDigest[`18`]): LegacyLink[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLegacy")(digest.asInstanceOf[js.Any]).asInstanceOf[LegacyLink[Any]]
  
  inline def decode[Data /* <: Any */, Code /* <: Double */, Alg /* <: Double */, Ver /* <: Version */](bytes: ByteView[Link[Data, Code, Alg, Ver]]): Link[Data, Code, Alg, Ver] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Link[Data, Code, Alg, Ver]]
  
  inline def format[T /* <: Link[Any, Double, Double, Version] */, Prefix /* <: String */](link: T): ToString[T, Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(link.asInstanceOf[js.Any]).asInstanceOf[ToString[T, Prefix]]
  inline def format[T /* <: Link[Any, Double, Double, Version] */, Prefix /* <: String */](link: T, base: MultibaseEncoder[Prefix]): ToString[T, Prefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(link.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ToString[T, Prefix]]
  
  inline def isLink[L /* <: Link[Any, Double, Double, `0` | `1`] */](value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLink")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse[Prefix /* <: String */, Data /* <: Any */, Code /* <: Double */, Alg /* <: Double */, Ver /* <: Version */](source: ToString[Link[Data, Code, Alg, Ver], Prefix]): Link[Data, Code, Alg, Ver] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[Link[Data, Code, Alg, Ver]]
  inline def parse[Prefix /* <: String */, Data /* <: Any */, Code /* <: Double */, Alg /* <: Double */, Ver /* <: Version */](source: ToString[Link[Data, Code, Alg, Ver], Prefix], base: MultibaseDecoder[Prefix]): Link[Data, Code, Alg, Ver] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Link[Data, Code, Alg, Ver]]
}
