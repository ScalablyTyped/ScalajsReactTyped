package typingsJapgolly.csstoolsPostcssSteppedValueFunctions

import typingsJapgolly.csstoolsPostcssSteppedValueFunctions.mod.pluginOptions
import typingsJapgolly.postcss.mod.Declaration
import typingsJapgolly.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRemMod {
  
  @JSImport("@csstools/postcss-stepped-value-functions/dist/rem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/postcss-stepped-value-functions/dist/rem", "remFunctionCheck")
  @js.native
  val remFunctionCheck: /* "rem(" */ String = js.native
  
  inline def transformRemFunction(decl: Declaration, result: Result, options: pluginOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRemFunction")(decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
