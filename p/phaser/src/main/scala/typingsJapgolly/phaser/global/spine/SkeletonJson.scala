package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.AttachmentLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SkeletonJson")
@js.native
open class SkeletonJson protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.SkeletonJson {
  def this(attachmentLoader: AttachmentLoader) = this()
}
object SkeletonJson {
  
  @JSGlobal("spine.SkeletonJson")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def blendModeFromString(str: String): typingsJapgolly.phaser.spine.BlendMode = ^.asInstanceOf[js.Dynamic].applyDynamic("blendModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.BlendMode]
  
  /* static member */
  inline def positionModeFromString(str: String): typingsJapgolly.phaser.spine.PositionMode = ^.asInstanceOf[js.Dynamic].applyDynamic("positionModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.PositionMode]
  
  /* static member */
  inline def rotateModeFromString(str: String): typingsJapgolly.phaser.spine.RotateMode = ^.asInstanceOf[js.Dynamic].applyDynamic("rotateModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.RotateMode]
  
  /* static member */
  inline def spacingModeFromString(str: String): typingsJapgolly.phaser.spine.SpacingMode = ^.asInstanceOf[js.Dynamic].applyDynamic("spacingModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.SpacingMode]
  
  /* static member */
  inline def transformModeFromString(str: String): typingsJapgolly.phaser.spine.TransformMode = ^.asInstanceOf[js.Dynamic].applyDynamic("transformModeFromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.TransformMode]
}
