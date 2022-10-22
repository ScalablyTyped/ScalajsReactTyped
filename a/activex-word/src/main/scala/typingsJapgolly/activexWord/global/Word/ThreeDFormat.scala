package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.MsoBevelType
import typingsJapgolly.activexOffice.Office.MsoExtrusionColorType
import typingsJapgolly.activexOffice.Office.MsoLightRigType
import typingsJapgolly.activexOffice.Office.MsoPresetCamera
import typingsJapgolly.activexOffice.Office.MsoPresetExtrusionDirection
import typingsJapgolly.activexOffice.Office.MsoPresetLightingDirection
import typingsJapgolly.activexOffice.Office.MsoPresetLightingSoftness
import typingsJapgolly.activexOffice.Office.MsoPresetMaterial
import typingsJapgolly.activexOffice.Office.MsoPresetThreeDFormat
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ThreeDFormat")
@js.native
/* private */ open class ThreeDFormat ()
  extends StObject
     with typingsJapgolly.activexWord.Word.ThreeDFormat {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var BevelBottomDepth: Double = js.native
  
  /* CompleteClass */
  var BevelBottomInset: Double = js.native
  
  /* CompleteClass */
  var BevelBottomType: MsoBevelType = js.native
  
  /* CompleteClass */
  var BevelTopDepth: Double = js.native
  
  /* CompleteClass */
  var BevelTopInset: Double = js.native
  
  /* CompleteClass */
  var BevelTopType: MsoBevelType = js.native
  
  /* CompleteClass */
  override val ContourColor: typingsJapgolly.activexWord.Word.ColorFormat = js.native
  
  /* CompleteClass */
  var ContourWidth: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Depth: Double = js.native
  
  /* CompleteClass */
  override val ExtrusionColor: typingsJapgolly.activexWord.Word.ColorFormat = js.native
  
  /* CompleteClass */
  var ExtrusionColorType: MsoExtrusionColorType = js.native
  
  /* CompleteClass */
  var FieldOfView: Double = js.native
  
  /* CompleteClass */
  override def IncrementRotationHorizontal(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementRotationVertical(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementRotationX(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementRotationY(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementRotationZ(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  var LightAngle: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Perspective: MsoTriState = js.native
  
  /* CompleteClass */
  override val PresetCamera: MsoPresetCamera = js.native
  
  /* CompleteClass */
  override val PresetExtrusionDirection: MsoPresetExtrusionDirection = js.native
  
  /* CompleteClass */
  var PresetLighting: MsoLightRigType = js.native
  
  /* CompleteClass */
  var PresetLightingDirection: MsoPresetLightingDirection = js.native
  
  /* CompleteClass */
  var PresetLightingSoftness: MsoPresetLightingSoftness = js.native
  
  /* CompleteClass */
  var PresetMaterial: MsoPresetMaterial = js.native
  
  /* CompleteClass */
  override val PresetThreeDFormat: MsoPresetThreeDFormat = js.native
  
  /* CompleteClass */
  var ProjectText: MsoTriState = js.native
  
  /* CompleteClass */
  override def ResetRotation(): Unit = js.native
  
  /* CompleteClass */
  var RotationX: Double = js.native
  
  /* CompleteClass */
  var RotationY: Double = js.native
  
  /* CompleteClass */
  var RotationZ: Double = js.native
  
  /* CompleteClass */
  override def SetExtrusionDirection(PresetExtrusionDirection: MsoPresetExtrusionDirection): Unit = js.native
  
  /* CompleteClass */
  override def SetPresetCamera(PresetCamera: MsoPresetCamera): Unit = js.native
  
  /* CompleteClass */
  override def SetThreeDFormat(PresetThreeDFormat: MsoPresetThreeDFormat): Unit = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.ThreeDFormat_typekey")
  var WordDotThreeDFormat_typekey: typingsJapgolly.activexWord.Word.ThreeDFormat = js.native
  
  /* CompleteClass */
  var Z: Double = js.native
}
