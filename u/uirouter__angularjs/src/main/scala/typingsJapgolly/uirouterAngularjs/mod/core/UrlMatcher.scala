package typingsJapgolly.uirouterAngularjs.mod.core

import typingsJapgolly.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.UrlMatcher")
@js.native
class UrlMatcher protected ()
  extends typingsJapgolly.uirouterCore.mod.UrlMatcher {
  /**
    * @param pattern The pattern to compile into a matcher.
    * @param paramTypes The [[ParamTypes]] registry
    * @param paramFactory A [[ParamFactory]] object
    * @param config  A [[UrlMatcherCompileConfig]] configuration object
    */
  def this(
    pattern: String,
    paramTypes: typingsJapgolly.uirouterCore.paramTypesMod.ParamTypes,
    paramFactory: typingsJapgolly.uirouterCore.urlMatcherFactoryMod.ParamFactory
  ) = this()
  def this(
    pattern: String,
    paramTypes: typingsJapgolly.uirouterCore.paramTypesMod.ParamTypes,
    paramFactory: typingsJapgolly.uirouterCore.urlMatcherFactoryMod.ParamFactory,
    config: UrlMatcherCompileConfig
  ) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "core.UrlMatcher")
@js.native
object UrlMatcher extends js.Object {
  /** @hidden */
  var nameValidator: js.RegExp = js.native
  /**
    * Compare two UrlMatchers
    *
    * This comparison function converts a UrlMatcher into static and dynamic path segments.
    * Each static path segment is a static string between a path separator (slash character).
    * Each dynamic segment is a path parameter.
    *
    * The comparison function sorts static segments before dynamic ones.
    */
  def compare(
    a: typingsJapgolly.uirouterCore.urlMatcherMod.UrlMatcher,
    b: typingsJapgolly.uirouterCore.urlMatcherMod.UrlMatcher
  ): Double = js.native
  /** @hidden */
  def encodeDashes(str: String): String = js.native
  /** @hidden Given a matcher, return an array with the matcher's path segments and path params, in order */
  def pathSegmentsAndParams(matcher: typingsJapgolly.uirouterCore.urlMatcherMod.UrlMatcher): js.Any = js.native
  /** @hidden Given a matcher, return an array with the matcher's query params */
  def queryParams(matcher: typingsJapgolly.uirouterCore.urlMatcherMod.UrlMatcher): js.Array[typingsJapgolly.uirouterCore.paramMod.Param] = js.native
}

