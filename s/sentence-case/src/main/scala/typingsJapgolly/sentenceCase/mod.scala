package typingsJapgolly.sentenceCase

import typingsJapgolly.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sentence-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sentenceCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sentenceCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sentenceCaseTransform(input: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sentenceCaseTransform")(input.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
}
