package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FAX_GROUP_STATUS_ENUM
import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxDeviceIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingGroup Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingGroup")
@js.native
/* private */ open class FaxOutboundRoutingGroup ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroup {
  
  /** Ordered collection of device IDs */
  /* CompleteClass */
  override def DeviceIds(lIndex: Double): Double = js.native
  /** Ordered collection of device IDs */
  /* CompleteClass */
  @JSName("DeviceIds")
  override val DeviceIds_Original: FaxDeviceIds = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRoutingGroup_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingGroup_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroup = js.native
  
  /** Name of the group */
  /* CompleteClass */
  override val Name: String = js.native
  
  /** Status of the group */
  /* CompleteClass */
  override val Status: FAX_GROUP_STATUS_ENUM = js.native
}
