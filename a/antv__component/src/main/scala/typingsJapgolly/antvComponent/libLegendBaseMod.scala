package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libTypesMod.GroupComponentCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendBaseCfg
import typingsJapgolly.antvComponent.libTypesMod.PointLocationCfg
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLegendBaseMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/legend/base", JSImport.Default)
  @js.native
  open class default[T /* <: LegendBaseCfg */] () extends LegendBase[T]
  
  @js.native
  trait LegendBase[T /* <: LegendBaseCfg */]
    extends typingsJapgolly.antvComponent.libAbstractGroupComponentMod.default[GroupComponentCfg] {
    
    /* protected */ def drawBackground(group: IGroup): Unit = js.native
    
    /* protected */ def drawLegendContent(group: Any): Any = js.native
    
    /* protected */ def drawTitle(group: IGroup): Unit = js.native
    
    /* protected */ def getDrawPoint(): Point = js.native
    
    /* private */ var resetDraw: Any = js.native
    
    /* protected */ def resetLocation(): Unit = js.native
    
    /* protected */ def setDrawPoint(point: Point): Unit = js.native
    
    def setLocation(cfg: PointLocationCfg): Unit = js.native
  }
}
