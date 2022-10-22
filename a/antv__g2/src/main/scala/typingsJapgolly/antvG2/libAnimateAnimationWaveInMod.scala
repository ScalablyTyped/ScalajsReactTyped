package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libAnimateInterfaceMod.AnimateExtraCfg
import typingsJapgolly.antvG2.libInterfaceMod.GAnimateCfg
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateAnimationWaveInMod {
  
  @JSImport("@antv/g2/lib/animate/animation/wave-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waveIn(element: IGroup, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waveIn")(element.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def waveIn(element: IShape, animateCfg: GAnimateCfg, cfg: AnimateExtraCfg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waveIn")(element.asInstanceOf[js.Any], animateCfg.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
