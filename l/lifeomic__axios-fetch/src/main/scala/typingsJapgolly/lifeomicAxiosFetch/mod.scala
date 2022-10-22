package typingsJapgolly.lifeomicAxiosFetch

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import typingsJapgolly.lifeomicAxiosFetch.srcAxiosTypesMod.AxiosInstance
import typingsJapgolly.lifeomicAxiosFetch.srcAxiosTypesMod.AxiosRequestConfig
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lifeomic/axios-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildAxiosFetch[Init /* <: RequestInit */](axios: AxiosInstance): js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[Init], js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAxiosFetch")(axios.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[Init], js.Promise[Response]]]
  inline def buildAxiosFetch[Init /* <: RequestInit */](axios: AxiosInstance, transformer: AxiosTransformer[Init]): js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[Init], js.Promise[Response]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAxiosFetch")(axios.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[Init], js.Promise[Response]]]
  
  type AxiosTransformer[Init /* <: RequestInit */] = js.Function3[
    /* config */ AxiosRequestConfig, 
    /* input */ RequestInfo, 
    /* init */ js.UndefOr[Init], 
    AxiosRequestConfig
  ]
}
