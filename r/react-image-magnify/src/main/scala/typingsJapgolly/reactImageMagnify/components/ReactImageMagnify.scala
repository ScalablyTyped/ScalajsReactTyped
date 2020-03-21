package typingsJapgolly.reactImageMagnify.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageMagnify.AnonHeight
import typingsJapgolly.reactImageMagnify.ReactImageMagnifyPropsRea
import typingsJapgolly.reactImageMagnify.mod.LargeImageType
import typingsJapgolly.reactImageMagnify.mod.SmallImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageMagnify {
  def apply(
    largeImage: LargeImageType,
    smallImage: SmallImageType,
    className: String = null,
    enlargedImageClassName: String = null,
    enlargedImageContainerClassName: String = null,
    enlargedImageContainerDimensions: AnonHeight = null,
    enlargedImageContainerStyle: CSSProperties = null,
    enlargedImagePortalId: String = null,
    enlargedImagePosition: String = null,
    enlargedImageStyle: CSSProperties = null,
    fadeDurationInMs: Int | Double = null,
    hintComponent: js.UndefOr[Callback] = js.undefined,
    hintTextMouse: String = null,
    hintTextTouch: String = null,
    hoverDelayInMs: Int | Double = null,
    hoverOffDelayInMs: Int | Double = null,
    imageClassName: String = null,
    imageStyle: CSSProperties = null,
    isActivatedOnTouch: js.UndefOr[Boolean] = js.undefined,
    isEnlargedImagePortalEnabledForTouch: js.UndefOr[Boolean] = js.undefined,
    isHintEnabled: js.UndefOr[Boolean] = js.undefined,
    lensComponent: js.UndefOr[Callback] = js.undefined,
    lensStyle: CSSProperties = null,
    pressDuration: Int | Double = null,
    pressMoveThreshold: Int | Double = null,
    shouldHideHintAfterFirstActivation: js.UndefOr[Boolean] = js.undefined,
    shouldUsePositiveSpaceLens: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ReactImageMagnifyPropsRea, 
    MountedWithRawType[
      ReactImageMagnifyPropsRea, 
      js.Object, 
      RawMounted[ReactImageMagnifyPropsRea, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(largeImage = largeImage.asInstanceOf[js.Any], smallImage = smallImage.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (enlargedImageClassName != null) __obj.updateDynamic("enlargedImageClassName")(enlargedImageClassName.asInstanceOf[js.Any])
    if (enlargedImageContainerClassName != null) __obj.updateDynamic("enlargedImageContainerClassName")(enlargedImageContainerClassName.asInstanceOf[js.Any])
    if (enlargedImageContainerDimensions != null) __obj.updateDynamic("enlargedImageContainerDimensions")(enlargedImageContainerDimensions.asInstanceOf[js.Any])
    if (enlargedImageContainerStyle != null) __obj.updateDynamic("enlargedImageContainerStyle")(enlargedImageContainerStyle.asInstanceOf[js.Any])
    if (enlargedImagePortalId != null) __obj.updateDynamic("enlargedImagePortalId")(enlargedImagePortalId.asInstanceOf[js.Any])
    if (enlargedImagePosition != null) __obj.updateDynamic("enlargedImagePosition")(enlargedImagePosition.asInstanceOf[js.Any])
    if (enlargedImageStyle != null) __obj.updateDynamic("enlargedImageStyle")(enlargedImageStyle.asInstanceOf[js.Any])
    if (fadeDurationInMs != null) __obj.updateDynamic("fadeDurationInMs")(fadeDurationInMs.asInstanceOf[js.Any])
    hintComponent.foreach(p => __obj.updateDynamic("hintComponent")(p.toJsFn))
    if (hintTextMouse != null) __obj.updateDynamic("hintTextMouse")(hintTextMouse.asInstanceOf[js.Any])
    if (hintTextTouch != null) __obj.updateDynamic("hintTextTouch")(hintTextTouch.asInstanceOf[js.Any])
    if (hoverDelayInMs != null) __obj.updateDynamic("hoverDelayInMs")(hoverDelayInMs.asInstanceOf[js.Any])
    if (hoverOffDelayInMs != null) __obj.updateDynamic("hoverOffDelayInMs")(hoverOffDelayInMs.asInstanceOf[js.Any])
    if (imageClassName != null) __obj.updateDynamic("imageClassName")(imageClassName.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isActivatedOnTouch)) __obj.updateDynamic("isActivatedOnTouch")(isActivatedOnTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnlargedImagePortalEnabledForTouch)) __obj.updateDynamic("isEnlargedImagePortalEnabledForTouch")(isEnlargedImagePortalEnabledForTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(isHintEnabled)) __obj.updateDynamic("isHintEnabled")(isHintEnabled.asInstanceOf[js.Any])
    lensComponent.foreach(p => __obj.updateDynamic("lensComponent")(p.toJsFn))
    if (lensStyle != null) __obj.updateDynamic("lensStyle")(lensStyle.asInstanceOf[js.Any])
    if (pressDuration != null) __obj.updateDynamic("pressDuration")(pressDuration.asInstanceOf[js.Any])
    if (pressMoveThreshold != null) __obj.updateDynamic("pressMoveThreshold")(pressMoveThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldHideHintAfterFirstActivation)) __obj.updateDynamic("shouldHideHintAfterFirstActivation")(shouldHideHintAfterFirstActivation.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUsePositiveSpaceLens)) __obj.updateDynamic("shouldUsePositiveSpaceLens")(shouldUsePositiveSpaceLens.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactImageMagnify.ReactImageMagnifyPropsRea, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImageMagnify.ReactImageMagnifyPropsRea])(children: _*)
  }
  @JSImport("react-image-magnify", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

