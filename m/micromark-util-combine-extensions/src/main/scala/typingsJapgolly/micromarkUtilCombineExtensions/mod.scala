package typingsJapgolly.micromarkUtilCombineExtensions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-combine-extensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineExtensions(extensions: js.Array[Extension]): NormalizedExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("combineExtensions")(extensions.asInstanceOf[js.Any]).asInstanceOf[NormalizedExtension]
  
  inline def combineHtmlExtensions(htmlExtensions: js.Array[HtmlExtension]): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("combineHtmlExtensions")(htmlExtensions.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type Construct = typingsJapgolly.micromarkUtilTypes.mod.Construct
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  type HtmlExtension = typingsJapgolly.micromarkUtilTypes.mod.HtmlExtension
  
  type NormalizedExtension = typingsJapgolly.micromarkUtilTypes.mod.NormalizedExtension
}
