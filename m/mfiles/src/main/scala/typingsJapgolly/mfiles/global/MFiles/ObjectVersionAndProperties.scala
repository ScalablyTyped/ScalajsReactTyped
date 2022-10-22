package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectVersion
import typingsJapgolly.mfiles.IObjectVersionAndProperties
import typingsJapgolly.mfiles.IPropertyValues
import typingsJapgolly.mfiles.IVault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectVersionAndProperties")
@js.native
open class ObjectVersionAndProperties ()
  extends StObject
     with IObjectVersionAndProperties {
  
  /* CompleteClass */
  override def Clone(): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override val ObjVer: IObjVer = js.native
  
  /* CompleteClass */
  override val Properties: IPropertyValues = js.native
  
  /* CompleteClass */
  override val Vault: IVault = js.native
  
  /* CompleteClass */
  override val VersionData: IObjectVersion = js.native
}
