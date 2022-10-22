package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingExtensions
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRouting")
@js.native
/* private */ open class FaxInboundRouting ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  var FAXCOMEXLibDotFaxInboundRouting_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting = js.native
  
  /** Registered inbound routing extensions collection */
  /* CompleteClass */
  override def GetExtensions(): FaxInboundRoutingExtensions = js.native
  
  /** Ordered collection of all the registered methods */
  /* CompleteClass */
  override def GetMethods(): FaxInboundRoutingMethods = js.native
}
