package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.anon.RemainderPath
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLibResolveMod {
  
  @JSImport("ipfs-http-client/dist/src/lib/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve(
    cid: CID[Any, Double, Double, Version],
    path: String,
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    getBlock: js.Function2[
      /* cid */ CID[Any, Double, Double, Version], 
      /* options */ js.UndefOr[AbortOptions], 
      js.Promise[js.typedarray.Uint8Array]
    ]
  ): AsyncGenerator[RemainderPath, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(cid.asInstanceOf[js.Any], path.asInstanceOf[js.Any], codecs.asInstanceOf[js.Any], getBlock.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[RemainderPath, Unit, Any]]
  inline def resolve(
    cid: CID[Any, Double, Double, Version],
    path: String,
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    getBlock: js.Function2[
      /* cid */ CID[Any, Double, Double, Version], 
      /* options */ js.UndefOr[AbortOptions], 
      js.Promise[js.typedarray.Uint8Array]
    ],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
  ): AsyncGenerator[RemainderPath, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(cid.asInstanceOf[js.Any], path.asInstanceOf[js.Any], codecs.asInstanceOf[js.Any], getBlock.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[RemainderPath, Unit, Any]]
  
  type AbortOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.AbortOptions */ Any
}
