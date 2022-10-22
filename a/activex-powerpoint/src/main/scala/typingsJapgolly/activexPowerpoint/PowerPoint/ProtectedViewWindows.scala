package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedViewWindows extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ProtectedViewWindow = js.native
  
  /**
    * @param string [ReadPassword='']
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open(FileName: String): ProtectedViewWindow = js.native
  def Open(FileName: String, ReadPassword: String): ProtectedViewWindow = js.native
  def Open(FileName: String, ReadPassword: String, OpenAndRepair: MsoTriState): ProtectedViewWindow = js.native
  def Open(FileName: String, ReadPassword: Unit, OpenAndRepair: MsoTriState): ProtectedViewWindow = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.ProtectedViewWindows_typekey")
  var PowerPointDotProtectedViewWindows_typekey: ProtectedViewWindows = js.native
}
