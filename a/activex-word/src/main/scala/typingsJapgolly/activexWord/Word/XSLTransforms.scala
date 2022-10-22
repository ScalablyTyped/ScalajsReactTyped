package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XSLTransforms extends StObject {
  
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Location: String, Alias: Any): XSLTransform = js.native
  def Add(Location: String, Alias: Any, InstallForAllUsers: Boolean): XSLTransform = js.native
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): XSLTransform = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.XSLTransforms_typekey")
  var WordDotXSLTransforms_typekey: XSLTransforms = js.native
}
