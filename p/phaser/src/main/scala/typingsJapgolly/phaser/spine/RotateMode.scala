package typingsJapgolly.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RotateMode extends StObject
@JSGlobal("spine.RotateMode")
@js.native
object RotateMode extends StObject {
  
  @js.native
  sealed trait Chain
    extends StObject
       with RotateMode
  
  @js.native
  sealed trait ChainScale
    extends StObject
       with RotateMode
  
  @js.native
  sealed trait Tangent
    extends StObject
       with RotateMode
}
