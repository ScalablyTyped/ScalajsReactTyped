package typingsJapgolly.nivoChord

import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcGenerator
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcTooltipComponent
import typingsJapgolly.nivoChord.distTypesTypesMod.ChordArcMouseHandler
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordArcsMod {
  
  @JSImport("@nivo/chord/dist/types/ChordArcs", "ChordArcs")
  @js.native
  val ChordArcs: MemoExoticComponent[
    js.Function1[
      /* hasArcsBorderWidthBorderColorGetOpacityArcGeneratorSetCurrentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordArcsProps, 
      Element
    ]
  ] = js.native
  
  @js.native
  trait ChordArcsProps extends StObject {
    
    var arcGenerator: ArcGenerator = js.native
    
    var arcs: js.Array[ArcDatum] = js.native
    
    var borderColor: InheritedColorConfig[ArcDatum] = js.native
    
    var borderWidth: Double = js.native
    
    def getOpacity(arc: ArcDatum): Double = js.native
    
    var isInteractive: Boolean = js.native
    
    var onClick: js.UndefOr[ChordArcMouseHandler] = js.native
    
    var onMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.native
    
    var onMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.native
    
    var onMouseMove: js.UndefOr[ChordArcMouseHandler] = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(arc: ArcDatum): Unit = js.native
    
    var tooltip: ArcTooltipComponent = js.native
  }
}
