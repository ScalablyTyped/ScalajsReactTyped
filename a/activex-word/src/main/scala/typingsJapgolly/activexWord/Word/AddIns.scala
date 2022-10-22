package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIns extends StObject {
  
  def Add(FileName: String): AddIn = js.native
  def Add(FileName: String, Install: Any): AddIn = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): AddIn = js.native
  
  val Parent: Any = js.native
  
  def Unload(RemoveFromList: Boolean): Unit = js.native
  
  /* private */ @JSName("Word.AddIns_typekey")
  var WordDotAddIns_typekey: AddIns = js.native
}
