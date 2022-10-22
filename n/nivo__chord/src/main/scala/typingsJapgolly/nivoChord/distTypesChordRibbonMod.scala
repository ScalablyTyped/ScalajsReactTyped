package typingsJapgolly.nivoChord

import typingsJapgolly.nivoChord.distTypesTypesMod.ChordRibbonMouseHandler
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonGenerator
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonTooltipComponent
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordRibbonMod {
  
  @JSImport("@nivo/chord/dist/types/ChordRibbon", "ChordRibbon")
  @js.native
  val ChordRibbon: MemoExoticComponent[
    js.Function1[
      /* hasRibbonRibbonGeneratorAnimatedPropsBorderWidthBlendModeIsInteractiveSetCurrentOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordRibbonProps, 
      Element
    ]
  ] = js.native
  
  @js.native
  trait ChordRibbonProps extends StObject {
    
    var animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<RibbonAnimatedProps> */ Any = js.native
    
    var blendMode: NonNullable[js.UndefOr[CssMixBlendMode]] = js.native
    
    var borderWidth: Double = js.native
    
    var isInteractive: Boolean = js.native
    
    var onClick: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var ribbon: RibbonDatum = js.native
    
    var ribbonGenerator: RibbonGenerator = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(ribbon: RibbonDatum): Unit = js.native
    
    var tooltip: NonNullable[js.UndefOr[RibbonTooltipComponent]] = js.native
  }
}
