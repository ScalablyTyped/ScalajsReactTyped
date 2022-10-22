package typingsJapgolly.ipfsCoreTypes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ipfsCoreTypes.distSrcRefsMod.Local
import typingsJapgolly.ipfsCoreTypes.distSrcRefsMod.Refs
import typingsJapgolly.ipfsCoreTypes.distSrcRefsMod.RefsResult
import typingsJapgolly.ipfsCoreTypes.distSrcRootMod.API
import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Bases extends StObject {
    
    def getBase(code: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
    
    def listBases(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
      ]
  }
  object Bases {
    
    inline def apply(
      getBase: String => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
        ],
      listBases: CallbackTo[
          js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
          ]
        ]
    ): Bases = {
      val __obj = js.Dynamic.literal(getBase = js.Any.fromFunction1(getBase), listBases = listBases.toJsFn)
      __obj.asInstanceOf[Bases]
    }
    
    extension [Self <: Bases](x: Self) {
      
      inline def setGetBase(
        value: String => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
            ]
      ): Self = StObject.set(x, "getBase", js.Any.fromFunction1(value))
      
      inline def setListBases(
        value: CallbackTo[
              js.Array[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultibaseCodec<any> */ Any
              ]
            ]
      ): Self = StObject.set(x, "listBases", value.toJsFn)
    }
  }
  
  @js.native
  trait Codecs extends StObject {
    
    def getCodec(code: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.native
    def getCodec(code: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.native
    
    def listCodecs(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockCodec<any, any> */ Any
      ] = js.native
  }
  
  @js.native
  trait Hashers extends StObject {
    
    def getHasher(code: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
    def getHasher(code: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
    
    def listHashers(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
  }
  
  @js.native
  trait IPFS[OptionExtension]
    extends StObject
       with API[OptionExtension] {
    
    var bases: Bases = js.native
    
    var bitswap: typingsJapgolly.ipfsCoreTypes.distSrcBitswapMod.API[OptionExtension] = js.native
    
    var block: typingsJapgolly.ipfsCoreTypes.distSrcBlockMod.API[OptionExtension] = js.native
    
    var bootstrap: typingsJapgolly.ipfsCoreTypes.distSrcBootstrapMod.API[OptionExtension] = js.native
    
    var codecs: Codecs = js.native
    
    var config: typingsJapgolly.ipfsCoreTypes.distSrcConfigMod.API[OptionExtension] = js.native
    
    var dag: typingsJapgolly.ipfsCoreTypes.distSrcDagMod.API[OptionExtension] = js.native
    
    var dht: typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.API[OptionExtension] = js.native
    
    var diag: typingsJapgolly.ipfsCoreTypes.distSrcDiagMod.API[OptionExtension] = js.native
    
    var files: typingsJapgolly.ipfsCoreTypes.distSrcFilesMod.API[OptionExtension] = js.native
    
    var hashers: Hashers = js.native
    
    var key: typingsJapgolly.ipfsCoreTypes.distSrcKeyMod.API[OptionExtension] = js.native
    
    var log: typingsJapgolly.ipfsCoreTypes.distSrcLogMod.API[OptionExtension] = js.native
    
    var name: typingsJapgolly.ipfsCoreTypes.distSrcNameMod.API[OptionExtension] = js.native
    
    var `object`: typingsJapgolly.ipfsCoreTypes.distSrcObjectMod.API[OptionExtension] = js.native
    
    var pin: typingsJapgolly.ipfsCoreTypes.distSrcPinMod.API[OptionExtension] = js.native
    
    var pubsub: typingsJapgolly.ipfsCoreTypes.distSrcPubsubMod.API[OptionExtension] = js.native
    
    var refs: RefsAPI[OptionExtension] = js.native
    
    var repo: typingsJapgolly.ipfsCoreTypes.distSrcRepoMod.API[OptionExtension] = js.native
    
    var stats: typingsJapgolly.ipfsCoreTypes.distSrcStatsMod.API[OptionExtension] = js.native
    
    var swarm: typingsJapgolly.ipfsCoreTypes.distSrcSwarmMod.API[OptionExtension] = js.native
  }
  
  @js.native
  trait RefsAPI[OptionExtension] extends Refs[OptionExtension] {
    
    def local(): AsyncIterable[RefsResult] = js.native
    def local(options: AbortOptions & OptionExtension): AsyncIterable[RefsResult] = js.native
    @JSName("local")
    var local_Original: Local[OptionExtension] = js.native
  }
}
