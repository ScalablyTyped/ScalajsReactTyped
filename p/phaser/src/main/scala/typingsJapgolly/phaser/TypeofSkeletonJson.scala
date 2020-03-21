package typingsJapgolly.phaser

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.phaser.spine.AttachmentLoader
import typingsJapgolly.phaser.spine.BlendMode
import typingsJapgolly.phaser.spine.PositionMode
import typingsJapgolly.phaser.spine.RotateMode
import typingsJapgolly.phaser.spine.SkeletonJson
import typingsJapgolly.phaser.spine.SpacingMode
import typingsJapgolly.phaser.spine.TransformMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSkeletonJson extends Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson] {
  def blendModeFromString(str: String): BlendMode = js.native
  def positionModeFromString(str: String): PositionMode = js.native
  def rotateModeFromString(str: String): RotateMode = js.native
  def spacingModeFromString(str: String): SpacingMode = js.native
  def transformModeFromString(str: String): TransformMode = js.native
}

