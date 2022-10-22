package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Credential
import typingsJapgolly.arcgisJsApi.esri.CredentialConstructor
import typingsJapgolly.arcgisJsApi.esri.CredentialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriIdentityCredentialMod extends Shortcut {
  
  @JSImport("esri/identity/Credential", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CredentialConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/Credential", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Credential {
    def this(properties: CredentialProperties) = this()
  }
  
  type _To = js.Object & CredentialConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriIdentityCredentialMod.foo` */
  override def _to: js.Object & CredentialConstructor = ^
}
