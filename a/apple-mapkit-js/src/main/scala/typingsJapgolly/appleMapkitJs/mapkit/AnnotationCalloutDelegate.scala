package typingsJapgolly.appleMapkitJs.mapkit

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.appleMapkitJs.AnonHeight
import typingsJapgolly.std.DOMPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Methods for customizing the behavior and appearance of an annotation callout.
  */
trait AnnotationCalloutDelegate extends js.Object {
  /**
    * Returns a point determining the callout's anchor offset.
    */
  var calloutAnchorOffsetForAnnotation: js.UndefOr[js.Function2[/* annotation */ Annotation, /* size */ AnonHeight, DOMPoint]] = js.undefined
  /**
    * Returns a CSS animation used when the callout appears.
    */
  var calloutAppearanceAnimationForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, String]] = js.undefined
  /**
    * Returns custom content for the callout bubble.
    */
  var calloutContentForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Returns an element representing a custom callout.
    */
  var calloutElementForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Returns an element used as a custom accessory on the left side of the
    * callout content area.
    */
  var calloutLeftAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Returns an element used as a custom accessory on the right side of the
    * callout content area.
    */
  var calloutRightAccessoryForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Element]] = js.undefined
  /**
    * Determines whether the callout should animate.
    */
  var calloutShouldAnimateForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.undefined
  /**
    * Determines whether the callout should appear for an annotation.
    */
  var calloutShouldAppearForAnnotation: js.UndefOr[js.Function1[/* annotation */ Annotation, Boolean]] = js.undefined
}

object AnnotationCalloutDelegate {
  @scala.inline
  def apply(
    calloutAnchorOffsetForAnnotation: (/* annotation */ Annotation, /* size */ AnonHeight) => CallbackTo[DOMPoint] = null,
    calloutAppearanceAnimationForAnnotation: /* annotation */ Annotation => CallbackTo[String] = null,
    calloutContentForAnnotation: /* annotation */ Annotation => CallbackTo[Element] = null,
    calloutElementForAnnotation: /* annotation */ Annotation => CallbackTo[Element] = null,
    calloutLeftAccessoryForAnnotation: /* annotation */ Annotation => CallbackTo[Element] = null,
    calloutRightAccessoryForAnnotation: /* annotation */ Annotation => CallbackTo[Element] = null,
    calloutShouldAnimateForAnnotation: /* annotation */ Annotation => CallbackTo[Boolean] = null,
    calloutShouldAppearForAnnotation: /* annotation */ Annotation => CallbackTo[Boolean] = null
  ): AnnotationCalloutDelegate = {
    val __obj = js.Dynamic.literal()
    if (calloutAnchorOffsetForAnnotation != null) __obj.updateDynamic("calloutAnchorOffsetForAnnotation")(js.Any.fromFunction2((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation, t1: /* size */ typingsJapgolly.appleMapkitJs.AnonHeight) => calloutAnchorOffsetForAnnotation(t0, t1).runNow()))
    if (calloutAppearanceAnimationForAnnotation != null) __obj.updateDynamic("calloutAppearanceAnimationForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutAppearanceAnimationForAnnotation(t0).runNow()))
    if (calloutContentForAnnotation != null) __obj.updateDynamic("calloutContentForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutContentForAnnotation(t0).runNow()))
    if (calloutElementForAnnotation != null) __obj.updateDynamic("calloutElementForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutElementForAnnotation(t0).runNow()))
    if (calloutLeftAccessoryForAnnotation != null) __obj.updateDynamic("calloutLeftAccessoryForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutLeftAccessoryForAnnotation(t0).runNow()))
    if (calloutRightAccessoryForAnnotation != null) __obj.updateDynamic("calloutRightAccessoryForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutRightAccessoryForAnnotation(t0).runNow()))
    if (calloutShouldAnimateForAnnotation != null) __obj.updateDynamic("calloutShouldAnimateForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutShouldAnimateForAnnotation(t0).runNow()))
    if (calloutShouldAppearForAnnotation != null) __obj.updateDynamic("calloutShouldAppearForAnnotation")(js.Any.fromFunction1((t0: /* annotation */ typingsJapgolly.appleMapkitJs.mapkit.Annotation) => calloutShouldAppearForAnnotation(t0).runNow()))
    __obj.asInstanceOf[AnnotationCalloutDelegate]
  }
}

