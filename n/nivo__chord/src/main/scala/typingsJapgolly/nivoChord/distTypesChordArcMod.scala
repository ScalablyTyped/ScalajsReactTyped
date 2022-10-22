package typingsJapgolly.nivoChord

import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcGenerator
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcTooltipComponent
import typingsJapgolly.nivoChord.distTypesTypesMod.ChordArcMouseHandler
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordArcMod {
  
  @JSImport("@nivo/chord/dist/types/ChordArc", "ChordArc")
  @js.native
  val ChordArc: MemoExoticComponent[
    js.Function1[
      /* hasArcAnimatedPropsBorderWidthArcGeneratorSetCurrentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordArcProps, 
      Element
    ]
  ] = js.native
  
  @js.native
  trait ChordArcProps extends StObject {
    
    var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<ArcAnimatedProps> */ Any = js.native
    
    var arc: ArcDatum = js.native
    
    var arcGenerator: ArcGenerator = js.native
    
    var borderWidth: Double = js.native
    
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
