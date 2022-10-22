package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.anon.Configuration
import typingsJapgolly.uirouterCore.anon.Hash
import typingsJapgolly.uirouterCore.anon.Instantiable
import typingsJapgolly.uirouterCore.anon.InstantiableLocationConfig
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationServices
import typingsJapgolly.uirouterCore.libRouterMod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaUtilsMod {
  
  @JSImport("@uirouter/core/lib/vanilla/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildUrl(loc: LocationServices): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUrl")(loc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParams(queryString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParams")(queryString.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def keyValsToObjectR(accum: Any, hasKeyVal: js.Tuple2[Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("keyValsToObjectR")(accum.asInstanceOf[js.Any], hasKeyVal.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("locationPluginFactory")(name.asInstanceOf[js.Any], isHtml5.asInstanceOf[js.Any], serviceClass.asInstanceOf[js.Any], configurationClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* uiRouter */ UIRouter, Configuration]]
  
  inline def parseUrl(url: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Hash]
}
