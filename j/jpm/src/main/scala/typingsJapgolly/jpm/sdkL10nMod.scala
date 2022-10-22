package typingsJapgolly.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkL10nMod {
  
  @JSImport("sdk/l10n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(identifier: String, count: Double, placeholder: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")((scala.List(identifier.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).`++`(placeholder.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
  inline def get(identifier: String, count: Unit, placeholder: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get")((scala.List(identifier.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).`++`(placeholder.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[String]
}
