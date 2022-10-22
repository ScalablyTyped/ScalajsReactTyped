package typingsJapgolly.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows extends StObject {
  
  def apply(index: Any): Window = js.native
  
  val Count: Double = js.native
  
  def CreateToolWindow(AddInInst: AddIn, ProgId: String, Caption: String, GuidPosition: String, DocObj: Any): Window = js.native
  
  def Item(index: Any): Window = js.native
  
  val Parent: Application = js.native
  
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
}
