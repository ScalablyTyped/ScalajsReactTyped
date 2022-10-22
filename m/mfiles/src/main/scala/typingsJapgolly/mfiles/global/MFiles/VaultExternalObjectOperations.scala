package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectVersionAndProperties
import typingsJapgolly.mfiles.IPropertyValues
import typingsJapgolly.mfiles.IVaultExternalObjectOperations
import typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultExternalObjectOperations")
@js.native
open class VaultExternalObjectOperations ()
  extends StObject
     with IVaultExternalObjectOperations {
  
  /* CompleteClass */
  override def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties = js.native
}
