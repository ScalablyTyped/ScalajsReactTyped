package typingsJapgolly.commitlintLoad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPluginNamingMod {
  
  @JSImport("@commitlint/load/lib/utils/plugin-naming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNamespaceFromTerm(term: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamespaceFromTerm")(term.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getShorthandName(fullname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShorthandName")(fullname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizePackageName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePackageName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
