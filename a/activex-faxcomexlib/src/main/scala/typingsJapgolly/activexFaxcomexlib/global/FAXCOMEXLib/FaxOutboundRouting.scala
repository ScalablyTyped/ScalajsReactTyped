package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroups
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRouting")
@js.native
/* private */ open class FaxOutboundRouting ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting = js.native
  
  /** Configuration of the outbound routing groups */
  /* CompleteClass */
  override def GetGroups(): FaxOutboundRoutingGroups = js.native
  
  /** Configuration of the outbound routing rules */
  /* CompleteClass */
  override def GetRules(): FaxOutboundRoutingRules = js.native
}
