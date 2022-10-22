package typingsJapgolly.octokitEndpoint

import typingsJapgolly.octokitTypes.distTypesEndpointDefaultsMod.EndpointDefaults
import typingsJapgolly.octokitTypes.distTypesEndpointOptionsMod.EndpointOptions
import typingsJapgolly.octokitTypes.distTypesRequestOptionsMod.RequestOptions
import typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typingsJapgolly.octokitTypes.distTypesRouteMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointWithDefaultsMod {
  
  @JSImport("@octokit/endpoint/dist-types/endpoint-with-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: EndpointOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: EndpointOptions, options: RequestParameters): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: Route): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: Route, options: RequestParameters): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
}
