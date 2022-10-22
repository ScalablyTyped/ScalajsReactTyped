package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typingsJapgolly.antvG2.libInterfaceMod.GAnimateCfg
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateAnimationPositionUpdateMod {
  
  @JSImport("@antv/g2/lib/animate/animation/position-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionUpdate(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("positionUpdate")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
