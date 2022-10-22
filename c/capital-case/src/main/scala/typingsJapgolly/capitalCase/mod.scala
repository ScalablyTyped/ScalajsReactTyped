package typingsJapgolly.capitalCase

import typingsJapgolly.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("capital-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def capitalCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("capitalCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def capitalCaseTransform(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalCaseTransform")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
