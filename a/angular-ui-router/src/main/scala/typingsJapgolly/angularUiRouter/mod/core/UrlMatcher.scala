package typingsJapgolly.angularUiRouter.mod.core

import typingsJapgolly.uirouterCore.libUrlInterfaceMod.UrlMatcherCompileConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "core.UrlMatcher")
@js.native
open class UrlMatcher protected ()
  extends typingsJapgolly.uirouterCore.mod.UrlMatcher {
  /**
    * @param pattern The pattern to compile into a matcher.
    * @param paramTypes The [[ParamTypes]] registry
    * @param paramFactory A [[ParamFactory]] object
    * @param config  A [[UrlMatcherCompileConfig]] configuration object
    */
  def this(
    pattern: String,
    paramTypes: typingsJapgolly.uirouterCore.libParamsParamTypesMod.ParamTypes,
    paramFactory: typingsJapgolly.uirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory
  ) = this()
  def this(
    pattern: String,
    paramTypes: typingsJapgolly.uirouterCore.libParamsParamTypesMod.ParamTypes,
    paramFactory: typingsJapgolly.uirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory,
    config: UrlMatcherCompileConfig
  ) = this()
}
/* static members */
object UrlMatcher {
  
  @JSImport("angular-ui-router", "core.UrlMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compare two UrlMatchers
    *
    * This comparison function converts a UrlMatcher into static and dynamic path segments.
    * Each static path segment is a static string between a path separator (slash character).
    * Each dynamic segment is a path parameter.
    *
    * The comparison function sorts static segments before dynamic ones.
    */
  inline def compare(
    a: typingsJapgolly.uirouterCore.libUrlUrlMatcherMod.UrlMatcher,
    b: typingsJapgolly.uirouterCore.libUrlUrlMatcherMod.UrlMatcher
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** @internal */
  inline def encodeDashes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDashes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** @internal */
  @JSImport("angular-ui-router", "core.UrlMatcher.nameValidator")
  @js.native
  def nameValidator: js.RegExp = js.native
  inline def nameValidator_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameValidator")(x.asInstanceOf[js.Any])
  
  /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
  inline def pathSegmentsAndParams(matcher: typingsJapgolly.uirouterCore.libUrlUrlMatcherMod.UrlMatcher): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSegmentsAndParams")(matcher.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** @internal Given a matcher, return an array with the matcher's query params */
  inline def queryParams(matcher: typingsJapgolly.uirouterCore.libUrlUrlMatcherMod.UrlMatcher): js.Array[typingsJapgolly.uirouterCore.libParamsParamMod.Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParams")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libParamsParamMod.Param]]
}
