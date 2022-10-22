package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.INamedACL
import typingsJapgolly.mfiles.INamedACLAdmin
import typingsJapgolly.mfiles.ISemanticAliases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.NamedACLAdmin")
@js.native
open class NamedACLAdmin ()
  extends StObject
     with INamedACLAdmin {
  
  /* CompleteClass */
  var AccessControlListForNamedACL: IAccessControlList = js.native
  
  /* CompleteClass */
  override def Clone(): INamedACLAdmin = js.native
  
  /* CompleteClass */
  var NamedACL: INamedACL = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
}
