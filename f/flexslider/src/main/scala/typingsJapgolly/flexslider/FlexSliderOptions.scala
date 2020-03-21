package typingsJapgolly.flexslider

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexSliderOptions extends js.Object {
                //Callback: function(slider) - Fires when the slider reaches the last slide (asynchronous)
  var added: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
             //Callback: function(slider) - Fires asynchronously with each slider animation
  var after: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
         //{NEW} Selector: Must match a simple pattern. '{container} > {slide}' -- Ignore pattern at your own peril
  var animation: js.UndefOr[String] = js.undefined
                   //{NEW} Boolean: Reverse the animation direction
  var animationLoop: js.UndefOr[Boolean] = js.undefined
             //Integer: Set the speed of the slideshow cycling, in milliseconds
  var animationSpeed: js.UndefOr[Double] = js.undefined
                         //{NEW} Selector: Mirror the actions performed on this slider with another slider. Use with care.
  var asNavFor: js.UndefOr[String] = js.undefined
              //Callback: function(slider) - Fires when the slider loads the first slide
  var before: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
                     //{NEW} Boolean: If using video in the slider, will prevent CSS3 3D Transforms to avoid graphical glitches
  // Primary Controls
  var controlNav: js.UndefOr[js.Any] = js.undefined
                 //String: Set the text for the "play" pausePlay item
  // Special properties
  var controlsContainer: js.UndefOr[String] = js.undefined
                 //{NEW} String: Determines the easing method used in jQuery transitions. jQuery easing plugin is supported!
  var direction: js.UndefOr[String] = js.undefined
                 //Boolean: Create navigation for paging control of each clide? Note: Leave true for manualControls usage
  var directionNav: js.UndefOr[Boolean] = js.undefined
                //String: Select your animation type, "fade" or "slide"
  var easing: js.UndefOr[String] = js.undefined
              //Callback: function(slider) - Fires after each slider animation completes
  var end: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
              //Integer: Set the speed of animations, in milliseconds
  var initDelay: js.UndefOr[Double] = js.undefined
                     //{NEW} Integer: Box-model width of individual carousel items, including horizontal borders and padding.
  var itemMargin: js.UndefOr[Double] = js.undefined
                     //{NEW} Selector: Internal property exposed for turning the slider into a thumbnail navigation for another slider
  // Carousel Options
  var itemWidth: js.UndefOr[Double] = js.undefined
                 //String: Set the text for the "next" directionNav item
  // Secondary Navigation
  var keyboard: js.UndefOr[Boolean] = js.undefined
            //{UPDATED} Selector: USE CLASS SELECTOR. Declare which container the navigation elements should be appended too. Default container is the FlexSlider element. Example use would be ".flexslider-container". Property is ignored if given element is not found.
  var manualControls: js.UndefOr[String] = js.undefined
                      //{NEW} Integer: Minimum number of carousel items that should be visible. Items will resize fluidly when below this.
  var maxItems: js.UndefOr[Double] = js.undefined
                    //{NEW} Integer: Margin between carousel items.
  var minItems: js.UndefOr[Double] = js.undefined
          //{NEW} Boolean: Allow keyboard navigation to affect multiple sliders. Default behavior cuts out keyboard navigation with more than one slider present.
  var mousewheel: js.UndefOr[Boolean] = js.undefined
                      //{NEW} Integer: Maxmimum number of carousel items that should be visible. Items will resize fluidly when above this limit.
  var move: js.UndefOr[Double] = js.undefined
                   //Boolean: Allow slider navigating via keyboard left/right keys
  var multipleKeyboard: js.UndefOr[Boolean] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
             //String: Set the text for the "previous" directionNav item
  var nextText: js.UndefOr[String] = js.undefined
                 //Boolean: Randomize slide order
  // Usability features
  var pauseOnAction: js.UndefOr[Boolean] = js.undefined
              //Boolean: Pause the slideshow when interacting with control elements, highly recommended.
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
                //{UPDATED} Boolean: Requires jquery.mousewheel.js (https://github.com/brandonaaron/jquery-mousewheel) - Allows slider navigating via mousewheel
  var pausePlay: js.UndefOr[Boolean] = js.undefined
                 //Boolean: Create pause/play dynamic element
  var pauseText: js.UndefOr[String] = js.undefined
               //String: Set the text for the "pause" pausePlay item
  var playText: js.UndefOr[String] = js.undefined
               //Boolean: Create navigation for previous/next navigation? (true/false)
  var prevText: js.UndefOr[String] = js.undefined
                     //{NEW} Integer: Set an initialization delay, in milliseconds
  var randomize: js.UndefOr[Boolean] = js.undefined
              //{NEW} Callback: function(slider) - Fires after a slide is added
  var removed: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
          //String: Select the sliding direction, "horizontal" or "vertical"
  var reverse: js.UndefOr[Boolean] = js.undefined
               //{NEW} String: Prefix string attached to the class of every element generated by the plugin
  var selector: js.UndefOr[String] = js.undefined
                       //Integer: The slide that the slider should start on. Array notation (0 = first slide)
  var slideshow: js.UndefOr[Boolean] = js.undefined
                  //Boolean: Animate slider automatically
  var slideshowSpeed: js.UndefOr[Double] = js.undefined
               //Boolean: Should the animation loop? If boolean; directionNav will received "disable" classes at either end
  var smoothHeight: js.UndefOr[Boolean] = js.undefined
                          //{NEW} Integer: Number of carousel items that should move on animation. If number; slider will move all visible items.
  // Callback API
  var start: js.UndefOr[js.Function1[/* slider */ SliderObject, _]] = js.undefined
              //{NEW} Boolean: Allow height of the slider to animate smoothly in horizontal mode
  var startAt: js.UndefOr[Double] = js.undefined
               //Selector: Declare custom control navigation. Examples would be ".flex-control-nav li" or "#tabs-nav li img", etc. The number of elements in your controlNav should match the number of slides/tabs.
  var sync: js.UndefOr[String] = js.undefined
                     //{NEW} Boolean: Slider will use CSS3 transitions if available
  var touch: js.UndefOr[Boolean] = js.undefined
              //Boolean: Pause the slideshow when hovering over slider, then resume when no longer hovering
  var useCSS: js.UndefOr[Boolean] = js.undefined
                      //{NEW} Boolean: Allow touch swipe navigation of the slider on touch-enabled devices
  var video: js.UndefOr[Boolean] = js.undefined
}

object FlexSliderOptions {
  @scala.inline
  def apply(
    added: /* slider */ SliderObject => CallbackTo[js.Any] = null,
    after: /* slider */ SliderObject => CallbackTo[js.Any] = null,
    animation: String = null,
    animationLoop: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: Int | Double = null,
    asNavFor: String = null,
    before: /* slider */ SliderObject => CallbackTo[js.Any] = null,
    controlNav: js.Any = null,
    controlsContainer: String = null,
    direction: String = null,
    directionNav: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    end: /* slider */ SliderObject => CallbackTo[js.Any] = null,
    initDelay: Int | Double = null,
    itemMargin: Int | Double = null,
    itemWidth: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    manualControls: String = null,
    maxItems: Int | Double = null,
    minItems: Int | Double = null,
    mousewheel: js.UndefOr[Boolean] = js.undefined,
    move: Int | Double = null,
    multipleKeyboard: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    nextText: String = null,
    pauseOnAction: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    pausePlay: js.UndefOr[Boolean] = js.undefined,
    pauseText: String = null,
    playText: String = null,
    prevText: String = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    removed: /* slider */ SliderObject => CallbackTo[js.Any] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    slideshow: js.UndefOr[Boolean] = js.undefined,
    slideshowSpeed: Int | Double = null,
    smoothHeight: js.UndefOr[Boolean] = js.undefined,
    start: /* slider */ SliderObject => CallbackTo[js.Any] = null,
    startAt: Int | Double = null,
    sync: String = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined
  ): FlexSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(js.Any.fromFunction1((t0: /* slider */ typingsJapgolly.flexslider.SliderObject) => added(t0).runNow()))
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* slider */ typingsJapgolly.flexslider.SliderObject) => after(t0).runNow()))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(animationLoop)) __obj.updateDynamic("animationLoop")(animationLoop.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* slider */ typingsJapgolly.flexslider.SliderObject) => before(t0).runNow()))
    if (controlNav != null) __obj.updateDynamic("controlNav")(controlNav.asInstanceOf[js.Any])
    if (controlsContainer != null) __obj.updateDynamic("controlsContainer")(controlsContainer.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(directionNav)) __obj.updateDynamic("directionNav")(directionNav.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1((t0: /* slider */ typingsJapgolly.flexslider.SliderObject) => end(t0).runNow()))
    if (initDelay != null) __obj.updateDynamic("initDelay")(initDelay.asInstanceOf[js.Any])
    if (itemMargin != null) __obj.updateDynamic("itemMargin")(itemMargin.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (manualControls != null) __obj.updateDynamic("manualControls")(manualControls.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (!js.isUndefined(mousewheel)) __obj.updateDynamic("mousewheel")(mousewheel.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleKeyboard)) __obj.updateDynamic("multipleKeyboard")(multipleKeyboard.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnAction)) __obj.updateDynamic("pauseOnAction")(pauseOnAction.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(pausePlay)) __obj.updateDynamic("pausePlay")(pausePlay.asInstanceOf[js.Any])
    if (pauseText != null) __obj.updateDynamic("pauseText")(pauseText.asInstanceOf[js.Any])
    if (playText != null) __obj.updateDynamic("playText")(playText.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(js.Any.fromFunction1((t0: /* slider */ typingsJapgolly.flexslider.SliderObject) => removed(t0).runNow()))
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(slideshow)) __obj.updateDynamic("slideshow")(slideshow.asInstanceOf[js.Any])
    if (slideshowSpeed != null) __obj.updateDynamic("slideshowSpeed")(slideshowSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothHeight)) __obj.updateDynamic("smoothHeight")(smoothHeight.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* slider */ typingsJapgolly.flexslider.SliderObject) => start(t0).runNow()))
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexSliderOptions]
  }
}

