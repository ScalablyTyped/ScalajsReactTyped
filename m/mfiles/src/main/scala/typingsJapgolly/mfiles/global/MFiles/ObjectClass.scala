package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IAdditionalClassInfo
import typingsJapgolly.mfiles.IAssociatedPropertyDefs
import typingsJapgolly.mfiles.IAutomaticPermissions
import typingsJapgolly.mfiles.IObjectClass
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectClass")
@js.native
open class ObjectClass ()
  extends StObject
     with IObjectClass {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override val AdditionalClassInfo: IAdditionalClassInfo = js.native
  
  /* CompleteClass */
  var AssociatedPropertyDefs: IAssociatedPropertyDefs = js.native
  
  /* CompleteClass */
  var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  
  /* CompleteClass */
  override def Clone(): IObjectClass = js.native
  
  /* CompleteClass */
  var ForceWorkflow: Boolean = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var NamePropertyDef: Double = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  var Workflow: Double = js.native
}
