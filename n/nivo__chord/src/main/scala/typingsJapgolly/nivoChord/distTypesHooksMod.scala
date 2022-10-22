package typingsJapgolly.nivoChord

import typingsJapgolly.d3Chord.mod.ChordLayout
import typingsJapgolly.nivoChord.anon.ActiveArcOpacity
import typingsJapgolly.nivoChord.anon.Arcs
import typingsJapgolly.nivoChord.anon.Center
import typingsJapgolly.nivoChord.anon.Chord
import typingsJapgolly.nivoChord.anon.Colors
import typingsJapgolly.nivoChord.anon.CurrentArc
import typingsJapgolly.nivoChord.anon.GetColor
import typingsJapgolly.nivoChord.anon.Height
import typingsJapgolly.nivoChord.anon.PadAngle
import typingsJapgolly.nivoChord.anon.Radius
import typingsJapgolly.nivoChord.distTypesTypesMod.CustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/chord/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useChord(hasDataKeysLabelValueFormatWidthHeightInnerRadiusRatioInnerRadiusOffsetPadAngleColors: Colors): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useChord")(hasDataKeysLabelValueFormatWidthHeightInnerRadiusRatioInnerRadiusOffsetPadAngleColors.asInstanceOf[js.Any]).asInstanceOf[GetColor]
  
  inline def useChordArcsAndRibbons(hasChordGetColorKeysDataGetLabelFormatValue: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordArcsAndRibbons")(hasChordGetColorKeysDataGetLabelFormatValue.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def useChordGenerators(hasWidthHeightInnerRadiusRatioInnerRadiusOffset: Height): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordGenerators")(hasWidthHeightInnerRadiusRatioInnerRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def useChordLayout(hasPadAngle: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordLayout")(hasPadAngle.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def useChordSelection(
    hasArcOpacityActiveArcOpacityInactiveArcOpacityRibbonsRibbonOpacityActiveRibbonOpacityInactiveRibbonOpacity: ActiveArcOpacity
  ): CurrentArc = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordSelection")(hasArcOpacityActiveArcOpacityInactiveArcOpacityRibbonsRibbonOpacityActiveRibbonOpacityInactiveRibbonOpacity.asInstanceOf[js.Any]).asInstanceOf[CurrentArc]
  
  inline def useCustomLayerProps(hasCenterRadiusArcsArcGeneratorRibbonsRibbonGenerator: Radius): CustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(hasCenterRadiusArcsArcGeneratorRibbonsRibbonGenerator.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps]
}
