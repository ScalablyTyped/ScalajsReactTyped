package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesEditorMod.EditorInterface
import typingsJapgolly.slate.distInterfacesElementMod.ElementInterface
import typingsJapgolly.slate.distInterfacesLocationMod.LocationInterface
import typingsJapgolly.slate.distInterfacesLocationMod.SpanInterface
import typingsJapgolly.slate.distInterfacesNodeMod.NodeInterface
import typingsJapgolly.slate.distInterfacesOperationMod.OperationInterface
import typingsJapgolly.slate.distInterfacesPathMod.PathInterface
import typingsJapgolly.slate.distInterfacesPathRefMod.PathRefInterface
import typingsJapgolly.slate.distInterfacesPointMod.PointInterface
import typingsJapgolly.slate.distInterfacesPointRefMod.PointRefInterface
import typingsJapgolly.slate.distInterfacesRangeMod.RangeInterface
import typingsJapgolly.slate.distInterfacesRangeRefMod.RangeRefInterface
import typingsJapgolly.slate.distInterfacesScrubberMod.ScrubberInterface
import typingsJapgolly.slate.distInterfacesTextMod.TextInterface
import typingsJapgolly.slate.distTransformsGeneralMod.GeneralTransforms
import typingsJapgolly.slate.distTransformsNodeMod.NodeTransforms
import typingsJapgolly.slate.distTransformsSelectionMod.SelectionTransforms
import typingsJapgolly.slate.distTransformsTextMod.TextTransforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate", "Editor")
  @js.native
  val Editor: EditorInterface = js.native
  
  @JSImport("slate", "Element")
  @js.native
  val Element: ElementInterface = js.native
  
  @JSImport("slate", "Location")
  @js.native
  val Location: LocationInterface = js.native
  
  @JSImport("slate", "Node")
  @js.native
  val Node: NodeInterface = js.native
  
  @JSImport("slate", "Operation")
  @js.native
  val Operation: OperationInterface = js.native
  
  @JSImport("slate", "Path")
  @js.native
  val Path: PathInterface = js.native
  
  @JSImport("slate", "PathRef")
  @js.native
  val PathRef: PathRefInterface = js.native
  
  @JSImport("slate", "Point")
  @js.native
  val Point: PointInterface = js.native
  
  @JSImport("slate", "PointRef")
  @js.native
  val PointRef: PointRefInterface = js.native
  
  @JSImport("slate", "Range")
  @js.native
  val Range: RangeInterface = js.native
  
  @JSImport("slate", "RangeRef")
  @js.native
  val RangeRef: RangeRefInterface = js.native
  
  @JSImport("slate", "Scrubber")
  @js.native
  val Scrubber: ScrubberInterface = js.native
  
  @JSImport("slate", "Span")
  @js.native
  val Span: SpanInterface = js.native
  
  @JSImport("slate", "Text")
  @js.native
  val Text: TextInterface = js.native
  
  @JSImport("slate", "Transforms")
  @js.native
  val Transforms: GeneralTransforms & NodeTransforms & SelectionTransforms & TextTransforms = js.native
  
  inline def createEditor(): typingsJapgolly.slate.distInterfacesEditorMod.Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditor")().asInstanceOf[typingsJapgolly.slate.distInterfacesEditorMod.Editor]
}
