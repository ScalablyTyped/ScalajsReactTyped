package typingsJapgolly.nivoAnnotations.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoAnnotations.mod.NoteCoordinate
import typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.circle
import typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.dot
import typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Annotation {
  def CircleAnnotationProps(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    size: Double,
    x: Double,
    y: Double,
    `type`: circle,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    note: VdomNode = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.nivoAnnotations.mod.CircleAnnotationProps, 
    typingsJapgolly.nivoAnnotations.mod.Annotation, 
    Unit, 
    typingsJapgolly.nivoAnnotations.mod.CircleAnnotationProps
  ] = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.rawNode.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoAnnotations.mod.CircleAnnotationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoAnnotations.mod.Annotation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoAnnotations.mod.CircleAnnotationProps])(children: _*)
  }
  def DotAnnotationProps(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    x: Double,
    y: Double,
    `type`: dot,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    note: VdomNode = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null,
    size: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.nivoAnnotations.mod.DotAnnotationProps, 
    typingsJapgolly.nivoAnnotations.mod.Annotation, 
    Unit, 
    typingsJapgolly.nivoAnnotations.mod.DotAnnotationProps
  ] = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.rawNode.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoAnnotations.mod.DotAnnotationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoAnnotations.mod.Annotation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoAnnotations.mod.DotAnnotationProps])(children: _*)
  }
  def RectAnnotationProps(
    containerHeight: Double,
    containerWidth: Double,
    height: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    width: Double,
    x: Double,
    y: Double,
    `type`: rect,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    note: VdomNode = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.nivoAnnotations.mod.RectAnnotationProps, 
    typingsJapgolly.nivoAnnotations.mod.Annotation, 
    Unit, 
    typingsJapgolly.nivoAnnotations.mod.RectAnnotationProps
  ] = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.rawNode.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoAnnotations.mod.RectAnnotationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoAnnotations.mod.Annotation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoAnnotations.mod.RectAnnotationProps])(children: _*)
  }
  @JSImport("@nivo/annotations", "Annotation")
  @js.native
  object componentImport extends js.Object
  
}

