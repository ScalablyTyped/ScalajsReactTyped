package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringFormatStringMod {
  
  inline def apply(format: String, args: (String | Double)*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/string/formatString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
