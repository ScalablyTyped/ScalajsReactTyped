package typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageclient.anon.Id
  - typingsJapgolly.vscodeLanguageclient.anon.Kind
  - typingsJapgolly.vscodeLanguageclient.anon.Registrations
  - typingsJapgolly.vscodeLanguageclient.anon.`0`
*/
trait FeatureState extends StObject
object FeatureState {
  
  inline def `0`(): typingsJapgolly.vscodeLanguageclient.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = "static")
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageclient.anon.`0`]
  }
  
  inline def Id(id: String, matches: Boolean, registrations: Boolean): typingsJapgolly.vscodeLanguageclient.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "document", matches = matches.asInstanceOf[js.Any], registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageclient.anon.Id]
  }
  
  inline def Kind(id: String, registrations: Boolean): typingsJapgolly.vscodeLanguageclient.anon.Kind = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "workspace", registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageclient.anon.Kind]
  }
  
  inline def Registrations(id: String, registrations: Boolean): typingsJapgolly.vscodeLanguageclient.anon.Registrations = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "window", registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageclient.anon.Registrations]
  }
}
