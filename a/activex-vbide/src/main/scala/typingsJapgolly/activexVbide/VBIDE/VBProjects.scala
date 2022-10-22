package typingsJapgolly.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VBProjects extends StObject {
  
  def apply(index: Any): VBProject = js.native
  
  def Add(Type: vbextProjectType): VBProject = js.native
  
  val Count: Double = js.native
  
  def Item(index: Any): VBProject = js.native
  
  def Open(bstrPath: String): VBProject = js.native
  
  val Parent: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
  
  def Remove(lpc: VBProject): Unit = js.native
  
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
}
