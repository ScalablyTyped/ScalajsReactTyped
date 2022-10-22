package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAutomaticPermissions
import typingsJapgolly.mfiles.INamedValueNamespaces
import typingsJapgolly.mfiles.IObjectType
import typingsJapgolly.mfiles.IObjectTypeAdmin
import typingsJapgolly.mfiles.IObjectTypeColumnMappings
import typingsJapgolly.mfiles.ISemanticAliases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjTypeAdmin")
@js.native
open class ObjTypeAdmin ()
  extends StObject
     with IObjectTypeAdmin {
  
  /* CompleteClass */
  override def Clone(): IObjectTypeAdmin = js.native
  
  /* CompleteClass */
  var ColumnMappings: IObjectTypeColumnMappings = js.native
  
  /* CompleteClass */
  var ConnectionString: String = js.native
  
  /* CompleteClass */
  var DefaultForAutomaticPermissions: IAutomaticPermissions = js.native
  
  /* CompleteClass */
  var DeleteStatement: String = js.native
  
  /* CompleteClass */
  var InsertIntoStatement: String = js.native
  
  /* CompleteClass */
  var NamedValueNamespaces: INamedValueNamespaces = js.native
  
  /* CompleteClass */
  var ObjectType: IObjectType = js.native
  
  /* CompleteClass */
  var SelectExtIDStatement: String = js.native
  
  /* CompleteClass */
  var SelectStatement: String = js.native
  
  /* CompleteClass */
  var SelectStatementOneRecord: String = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var Translatable: Boolean = js.native
  
  /* CompleteClass */
  var UpdateStatement: String = js.native
}
