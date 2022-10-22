package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rm extends StObject {
  
  def add(
    cid: CID[Any, Double, Double, Version],
    hasTimeoutSignalHeadersQuery: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddOptions */ Any) & AbortOptions & HTTPClientExtraOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Pin */ Any
  ]
  
  def ls(
    hasTimeoutSignalHeadersQuery: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions
  ): AsyncIterable[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Pin */ Any
  ]
  
  def rm(
    hasTimeoutSignalHeadersQuery: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions
  ): js.Promise[Unit]
  
  def rmAll(
    hasTimeoutSignalHeadersQuery: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions
  ): js.Promise[Unit]
  
  var service: Ls
}
object Rm {
  
  inline def apply(
    add: (CID[Any, Double, Double, Version], (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddOptions */ Any) & AbortOptions & HTTPClientExtraOptions) => js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Pin */ Any
    ],
    ls: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions => AsyncIterable[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Pin */ Any
    ],
    rm: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions => js.Promise[Unit],
    rmAll: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions => js.Promise[Unit],
    service: Ls
  ): Rm = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), ls = js.Any.fromFunction1(ls), rm = js.Any.fromFunction1(rm), rmAll = js.Any.fromFunction1(rmAll), service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rm]
  }
  
  extension [Self <: Rm](x: Self) {
    
    inline def setAdd(
      value: (CID[Any, Double, Double, Version], (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.AddOptions */ Any) & AbortOptions & HTTPClientExtraOptions) => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Pin */ Any
        ]
    ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setLs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions => AsyncIterable[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Pin */ Any
        ]
    ): Self = StObject.set(x, "ls", js.Any.fromFunction1(value))
    
    inline def setRm(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions => js.Promise[Unit]
    ): Self = StObject.set(x, "rm", js.Any.fromFunction1(value))
    
    inline def setRmAll(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Query */ Any) & AbortOptions & HTTPClientExtraOptions => js.Promise[Unit]
    ): Self = StObject.set(x, "rmAll", js.Any.fromFunction1(value))
    
    inline def setService(value: Ls): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
