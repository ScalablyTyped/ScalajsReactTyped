package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLSchemaReferences extends StObject {
  
  /** @param boolean [InstallForAllUsers=false] */
  def Add(NamespaceURI: Any, Alias: Any, FileName: Any): XMLSchemaReference = js.native
  def Add(NamespaceURI: Any, Alias: Any, FileName: Any, InstallForAllUsers: Boolean): XMLSchemaReference = js.native
  
  var AllowSaveAsXMLWithoutValidation: Boolean = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  var AutomaticValidation: Boolean = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var HideValidationErrors: Boolean = js.native
  
  var IgnoreMixedContent: Boolean = js.native
  
  def Item(Index: Any): XMLSchemaReference = js.native
  
  val Parent: Any = js.native
  
  var ShowPlaceholderText: Boolean = js.native
  
  def Validate(): Unit = js.native
  
  /* private */ @JSName("Word.XMLSchemaReferences_typekey")
  var WordDotXMLSchemaReferences_typekey: XMLSchemaReferences = js.native
}
