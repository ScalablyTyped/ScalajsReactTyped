package typingsJapgolly.ipfsHttpClient

import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.Options
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagGetMod {
  
  @JSImport("ipfs-http-client/dist/src/dag/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGet(
    codecs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_multicodecs.Multicodecs */ Any,
    options: Options
  ): js.Function2[
    /* cid */ CID[Any, Double, Double, Version], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.GetOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.GetResult */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGet")(codecs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* cid */ CID[Any, Double, Double, Version], 
    /* options */ js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.GetOptions */ Any) & typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
    ], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.GetResult */ Any
    ]
  ]]
  
  type DAGAPI = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_dag.API<HTTPClientExtraOptions> */ Any
  
  type HTTPClientExtraOptions = typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
}
