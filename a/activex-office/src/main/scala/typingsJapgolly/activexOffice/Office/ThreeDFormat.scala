package typingsJapgolly.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ThreeDFormat")
@js.native
class ThreeDFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var BevelBottomDepth: Double = js.native
  var BevelBottomInset: Double = js.native
  var BevelBottomType: MsoBevelType = js.native
  var BevelTopDepth: Double = js.native
  var BevelTopInset: Double = js.native
  var BevelTopType: MsoBevelType = js.native
  val ContourColor: ColorFormat = js.native
  var ContourWidth: Double = js.native
  val Creator: Double = js.native
  var Depth: Double = js.native
  val ExtrusionColor: ColorFormat = js.native
  var ExtrusionColorType: MsoExtrusionColorType = js.native
  var FieldOfView: Double = js.native
  var LightAngle: Double = js.native
  @JSName("Office.ThreeDFormat_typekey")
  var OfficeDotThreeDFormat_typekey: ThreeDFormat = js.native
  val Parent: js.Any = js.native
  var Perspective: MsoTriState = js.native
  val PresetCamera: MsoPresetCamera = js.native
  val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  var PresetLighting: MsoLightRigType = js.native
  var PresetLightingDirection: MsoPresetLightingDirection = js.native
  var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  var PresetMaterial: MsoPresetMaterial = js.native
  val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  var ProjectText: MsoTriState = js.native
  var RotationX: Double = js.native
  var RotationY: Double = js.native
  var RotationZ: Double = js.native
  var Visible: MsoTriState = js.native
  var Z: Double = js.native
  def IncrementRotationHorizontal(Increment: Double): Unit = js.native
  def IncrementRotationVertical(Increment: Double): Unit = js.native
  def IncrementRotationX(Increment: Double): Unit = js.native
  def IncrementRotationY(Increment: Double): Unit = js.native
  def IncrementRotationZ(Increment: Double): Unit = js.native
  def ResetRotation(): Unit = js.native
  def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
}

