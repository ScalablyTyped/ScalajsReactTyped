package typingsJapgolly.materialSegmentedButton

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialSegmentedButton.anon.PartialMDCSegmentedButtonAddClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentMod {
  
  @JSImport("@material/segmented-button/segment", "MDCSegmentedButtonSegment")
  @js.native
  open class MDCSegmentedButtonSegment protected ()
    extends typingsJapgolly.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSegmentedButtonSegment {
    
    @JSImport("@material/segmented-button/segment", "MDCSegmentedButtonSegment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialSegmentedButton.segmentComponentMod.MDCSegmentedButtonSegment]
  }
  
  @JSImport("@material/segmented-button/segment", "MDCSegmentedButtonSegmentFoundation")
  @js.native
  open class MDCSegmentedButtonSegmentFoundation ()
    extends typingsJapgolly.materialSegmentedButton.segmentFoundationMod.MDCSegmentedButtonSegmentFoundation {
    def this(adapter: PartialMDCSegmentedButtonAddClass) = this()
  }
}
