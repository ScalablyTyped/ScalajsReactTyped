package typingsJapgolly.axiosCaseConverter

import typingsJapgolly.axiosCaseConverter.typingsTypesMod.ApplyCaseMiddleware
import typingsJapgolly.axiosCaseConverter.typingsTypesMod.CreateAxiosInterceptor
import typingsJapgolly.axiosCaseConverter.typingsTypesMod.CreateAxiosRequestTransformer
import typingsJapgolly.axiosCaseConverter.typingsTypesMod.CreateAxiosResponseTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMiddlewareMod {
  
  @JSImport("axios-case-converter/typings/middleware", "applyCaseMiddleware")
  @js.native
  val applyCaseMiddleware: ApplyCaseMiddleware = js.native
  
  @JSImport("axios-case-converter/typings/middleware", "createCamelResponseTransformer")
  @js.native
  val createCamelResponseTransformer: CreateAxiosResponseTransformer = js.native
  
  @JSImport("axios-case-converter/typings/middleware", "createSnakeParamsInterceptor")
  @js.native
  val createSnakeParamsInterceptor: CreateAxiosInterceptor = js.native
  
  @JSImport("axios-case-converter/typings/middleware", "createSnakeRequestTransformer")
  @js.native
  val createSnakeRequestTransformer: CreateAxiosRequestTransformer = js.native
}
