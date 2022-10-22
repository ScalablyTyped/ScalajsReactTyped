package typingsJapgolly.nivoChord

import typingsJapgolly.d3Chord.mod.ChordLayout
import typingsJapgolly.nivoChord.anon.ArcGenerator
import typingsJapgolly.nivoChord.anon.Arcs
import typingsJapgolly.nivoChord.anon.Center
import typingsJapgolly.nivoChord.anon.Chord
import typingsJapgolly.nivoChord.anon.Height
import typingsJapgolly.nivoChord.anon.PadAngle
import typingsJapgolly.nivoChord.anon.RibbonGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/chord/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcPath(hasStartAngleEndAngleArcGenerator: ArcGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcPath")(hasStartAngleEndAngleArcGenerator.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def computeChordArcsAndRibbons(hasChordDataKeysGetLabelFormatValueGetColor: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordArcsAndRibbons")(hasChordDataKeysGetLabelFormatValueGetColor.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def computeChordGenerators(hasWidthHeightInnerRadiusRatioInnerRadiusOffset: Height): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordGenerators")(hasWidthHeightInnerRadiusRatioInnerRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def computeChordLayout(hasPadAngle: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordLayout")(hasPadAngle.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def computeRibbonPath(hasSourceStartAngleSourceEndAngleTargetStartAngleTargetEndAngleRibbonGenerator: RibbonGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRibbonPath")(hasSourceStartAngleSourceEndAngleTargetStartAngleTargetEndAngleRibbonGenerator.asInstanceOf[js.Any]).asInstanceOf[Any]
}
