package typingsJapgolly.titlecase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("titlecase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toLaxTitleCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLaxTitleCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTitleCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTitleCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
