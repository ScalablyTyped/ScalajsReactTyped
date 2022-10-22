package typingsJapgolly.uifabricUtilities

import typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.localStorage
import typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.none
import typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.sessionStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageMod {
  
  @JSImport("@uifabric/utilities/lib/language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLanguage(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[String | Null]
  inline def getLanguage(persistenceType: localStorage | sessionStorage | none): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")(persistenceType.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setLanguage(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setLanguage(language: String, avoidPersisting: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any], avoidPersisting.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setLanguage(language: String, persistenceType: localStorage | sessionStorage | none): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any], persistenceType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
