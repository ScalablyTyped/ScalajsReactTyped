package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.ScopeFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.ScopeFolder")
@js.native
/* private */ open class ScopeFolder ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.ScopeFolder {
  
  /* CompleteClass */
  override def AddToSearchFolders(): Unit = js.native
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.ScopeFolder_typekey")
  var OfficeDotScopeFolder_typekey: typingsJapgolly.activexOffice.Office.ScopeFolder = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  override def ScopeFolders(Index: Double): typingsJapgolly.activexOffice.Office.ScopeFolder = js.native
  /* CompleteClass */
  @JSName("ScopeFolders")
  override val ScopeFolders_Original: ScopeFolders = js.native
}
