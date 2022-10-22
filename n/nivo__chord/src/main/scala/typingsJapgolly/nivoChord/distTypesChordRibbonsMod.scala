package typingsJapgolly.nivoChord

import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.ChordRibbonMouseHandler
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonGenerator
import typingsJapgolly.nivoChord.distTypesTypesMod.RibbonTooltipComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordRibbonsMod {
  
  @JSImport("@nivo/chord/dist/types/ChordRibbons", "ChordRibbons")
  @js.native
  val ChordRibbons: MemoExoticComponent[
    js.Function1[
      /* hasRibbonsRibbonGeneratorBorderWidthBorderColorGetOpacityBlendModeIsInteractiveSetCurrentOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordRibbonsProps, 
      Element
    ]
  ] = js.native
  
  @js.native
  trait ChordRibbonsProps extends StObject {
    
    var blendMode: NonNullable[js.UndefOr[CssMixBlendMode]] = js.native
    
    var borderColor: InheritedColorConfig[ArcDatum] = js.native
    
    var borderWidth: Double = js.native
    
    def getOpacity(ribbon: RibbonDatum): Double = js.native
    
    var isInteractive: Boolean = js.native
    
    var onClick: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var ribbonGenerator: RibbonGenerator = js.native
    
    var ribbons: js.Array[RibbonDatum] = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(ribbon: RibbonDatum): Unit = js.native
    
    var tooltip: NonNullable[js.UndefOr[RibbonTooltipComponent]] = js.native
  }
}
