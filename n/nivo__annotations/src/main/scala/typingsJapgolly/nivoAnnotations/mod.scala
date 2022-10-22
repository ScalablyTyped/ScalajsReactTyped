package typingsJapgolly.nivoAnnotations

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoAnnotations.anon.Annotations
import typingsJapgolly.nivoAnnotations.anon.AnnotationsArray
import typingsJapgolly.nivoAnnotations.anon.Computed
import typingsJapgolly.nivoAnnotations.anon.Data
import typingsJapgolly.nivoAnnotations.anon.GetDimensions
import typingsJapgolly.nivoAnnotations.anon.Height
import typingsJapgolly.nivoAnnotations.anon.NoteTextOffset
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationInstructions
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationSpec
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.Note
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/annotations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Annotation[Datum](annotation: BoundAnnotation[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Annotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def bindAnnotations[Datum](hasDataAnnotationsGetPositionGetDimensions: Data[Datum]): js.Array[BoundAnnotation[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAnnotations")(hasDataAnnotationsGetPositionGetDimensions.asInstanceOf[js.Any]).asInstanceOf[js.Array[BoundAnnotation[Datum]]]
  
  inline def computeAnnotation[Datum](annotation: BoundAnnotation[Datum]): AnnotationInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[AnnotationInstructions]
  
  object defaultProps {
    
    @JSImport("@nivo/annotations", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/annotations", "defaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/annotations", "defaultProps.dotSize")
    @js.native
    def dotSize: Double = js.native
    inline def dotSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/annotations", "defaultProps.motionDamping")
    @js.native
    def motionDamping: Double = js.native
    inline def motionDamping_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionDamping")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/annotations", "defaultProps.motionStiffness")
    @js.native
    def motionStiffness: Double = js.native
    inline def motionStiffness_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionStiffness")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/annotations", "defaultProps.noteTextOffset")
    @js.native
    def noteTextOffset: Double = js.native
    inline def noteTextOffset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noteTextOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/annotations", "defaultProps.noteWidth")
    @js.native
    def noteWidth: Double = js.native
    inline def noteWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noteWidth")(x.asInstanceOf[js.Any])
  }
  
  inline def getLinkAngle(sourceX: Double, sourceY: Double, targetX: Double, targetY: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAngle")(sourceX.asInstanceOf[js.Any], sourceY.asInstanceOf[js.Any], targetX.asInstanceOf[js.Any], targetY.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isCanvasNote[Datum](note: Note[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteCanvas<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanvasNote")(note.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteCanvas<Datum> */ Boolean]
  
  inline def isCircleAnnotation[Datum](annotationSpec: AnnotationSpec[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.CircleAnnotationSpec<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCircleAnnotation")(annotationSpec.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.CircleAnnotationSpec<Datum> */ Boolean]
  
  inline def isDotAnnotation[Datum](annotationSpec: AnnotationSpec[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.DotAnnotationSpec<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDotAnnotation")(annotationSpec.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.DotAnnotationSpec<Datum> */ Boolean]
  
  inline def isRectAnnotation[Datum](annotationSpec: AnnotationSpec[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.RectAnnotationSpec<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRectAnnotation")(annotationSpec.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.RectAnnotationSpec<Datum> */ Boolean]
  
  inline def isSvgNote[Datum](note: Note[Datum]): /* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteSvg<Datum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSvgNote")(note.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/annotations.@nivo/annotations/dist/types/types.NoteSvg<Datum> */ Boolean]
  
  inline def renderAnnotationsToCanvas[Datum](ctx: CanvasRenderingContext2D, hasAnnotationsTheme: Annotations[Datum]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAnnotationsToCanvas")(ctx.asInstanceOf[js.Any], hasAnnotationsTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAnnotations[Datum](hasDataAnnotationsGetPositionGetDimensions: GetDimensions[Datum]): js.Array[BoundAnnotation[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnnotations")(hasDataAnnotationsGetPositionGetDimensions.asInstanceOf[js.Any]).asInstanceOf[js.Array[BoundAnnotation[Datum]]]
  
  inline def useComputedAnnotation[Datum](annotation: BoundAnnotation[Datum]): AnnotationInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputedAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[AnnotationInstructions]
  
  inline def useComputedAnnotations[Datum](hasAnnotations: AnnotationsArray[Datum]): js.Array[Computed[Datum] | NoteTextOffset[Datum] | Height[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComputedAnnotations")(hasAnnotations.asInstanceOf[js.Any]).asInstanceOf[js.Array[Computed[Datum] | NoteTextOffset[Datum] | Height[Datum]]]
}
