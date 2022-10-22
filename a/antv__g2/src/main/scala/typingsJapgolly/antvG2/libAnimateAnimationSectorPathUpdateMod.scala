package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.anon.EndAngle
import typingsJapgolly.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typingsJapgolly.antvG2.libInterfaceMod.GAnimateCfg
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import typingsJapgolly.antvGBase.libTypesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateAnimationSectorPathUpdateMod {
  
  @JSImport("@antv/g2/lib/animate/animation/sector-path-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArcInfo(path: js.Array[PathCommand]): EndAngle = ^.asInstanceOf[js.Dynamic].applyDynamic("getArcInfo")(path.asInstanceOf[js.Any]).asInstanceOf[EndAngle]
  
  inline def sectorPathUpdate(shape: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sectorPathUpdate")(shape.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
