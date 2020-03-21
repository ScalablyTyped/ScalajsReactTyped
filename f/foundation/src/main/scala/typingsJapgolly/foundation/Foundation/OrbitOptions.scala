package typingsJapgolly.foundation.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/orbit.html#advanced
trait OrbitOptions extends js.Object {
  var active_slide_class: js.UndefOr[String] = js.undefined
  var after_slide_change: js.UndefOr[js.Function0[_]] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var animation_speed: js.UndefOr[Double] = js.undefined
  var before_slide_change: js.UndefOr[js.Function0[_]] = js.undefined
  var bullets: js.UndefOr[Boolean] = js.undefined
  var bullets_active_class: js.UndefOr[String] = js.undefined
  var bullets_container_class: js.UndefOr[String] = js.undefined
  var caption_class: js.UndefOr[String] = js.undefined
  var circular: js.UndefOr[Boolean] = js.undefined
  var container_class: js.UndefOr[String] = js.undefined
  var navigation_arrows: js.UndefOr[Boolean] = js.undefined
  var next_class: js.UndefOr[String] = js.undefined
  var next_on_click: js.UndefOr[Boolean] = js.undefined
  var orbit_transition_class: js.UndefOr[String] = js.undefined
  var pause_on_hover: js.UndefOr[Boolean] = js.undefined
  var preloader_class: js.UndefOr[String] = js.undefined
  var prev_class: js.UndefOr[String] = js.undefined
  var resume_on_mouseout: js.UndefOr[Boolean] = js.undefined
  var slide_number: js.UndefOr[Boolean] = js.undefined
  var slide_number_class: js.UndefOr[String] = js.undefined
  var slide_number_text: js.UndefOr[String] = js.undefined
  var slide_selector: js.UndefOr[String] = js.undefined
  var slides_container_class: js.UndefOr[String] = js.undefined
  var stack_on_small: js.UndefOr[Boolean] = js.undefined
  var stack_on_small_class: js.UndefOr[String] = js.undefined
  var swipe: js.UndefOr[Boolean] = js.undefined
  var timer: js.UndefOr[Boolean] = js.undefined
  var timer_container_class: js.UndefOr[String] = js.undefined
  var timer_paused_class: js.UndefOr[String] = js.undefined
  var timer_progress_class: js.UndefOr[String] = js.undefined
  var timer_speed: js.UndefOr[Double] = js.undefined
  var variable_height: js.UndefOr[Boolean] = js.undefined
}

object OrbitOptions {
  @scala.inline
  def apply(
    active_slide_class: String = null,
    after_slide_change: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    animation: String = null,
    animation_speed: Int | Double = null,
    before_slide_change: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    bullets: js.UndefOr[Boolean] = js.undefined,
    bullets_active_class: String = null,
    bullets_container_class: String = null,
    caption_class: String = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    container_class: String = null,
    navigation_arrows: js.UndefOr[Boolean] = js.undefined,
    next_class: String = null,
    next_on_click: js.UndefOr[Boolean] = js.undefined,
    orbit_transition_class: String = null,
    pause_on_hover: js.UndefOr[Boolean] = js.undefined,
    preloader_class: String = null,
    prev_class: String = null,
    resume_on_mouseout: js.UndefOr[Boolean] = js.undefined,
    slide_number: js.UndefOr[Boolean] = js.undefined,
    slide_number_class: String = null,
    slide_number_text: String = null,
    slide_selector: String = null,
    slides_container_class: String = null,
    stack_on_small: js.UndefOr[Boolean] = js.undefined,
    stack_on_small_class: String = null,
    swipe: js.UndefOr[Boolean] = js.undefined,
    timer: js.UndefOr[Boolean] = js.undefined,
    timer_container_class: String = null,
    timer_paused_class: String = null,
    timer_progress_class: String = null,
    timer_speed: Int | Double = null,
    variable_height: js.UndefOr[Boolean] = js.undefined
  ): OrbitOptions = {
    val __obj = js.Dynamic.literal()
    if (active_slide_class != null) __obj.updateDynamic("active_slide_class")(active_slide_class.asInstanceOf[js.Any])
    after_slide_change.foreach(p => __obj.updateDynamic("after_slide_change")(p.toJsFn))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animation_speed != null) __obj.updateDynamic("animation_speed")(animation_speed.asInstanceOf[js.Any])
    before_slide_change.foreach(p => __obj.updateDynamic("before_slide_change")(p.toJsFn))
    if (!js.isUndefined(bullets)) __obj.updateDynamic("bullets")(bullets.asInstanceOf[js.Any])
    if (bullets_active_class != null) __obj.updateDynamic("bullets_active_class")(bullets_active_class.asInstanceOf[js.Any])
    if (bullets_container_class != null) __obj.updateDynamic("bullets_container_class")(bullets_container_class.asInstanceOf[js.Any])
    if (caption_class != null) __obj.updateDynamic("caption_class")(caption_class.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (container_class != null) __obj.updateDynamic("container_class")(container_class.asInstanceOf[js.Any])
    if (!js.isUndefined(navigation_arrows)) __obj.updateDynamic("navigation_arrows")(navigation_arrows.asInstanceOf[js.Any])
    if (next_class != null) __obj.updateDynamic("next_class")(next_class.asInstanceOf[js.Any])
    if (!js.isUndefined(next_on_click)) __obj.updateDynamic("next_on_click")(next_on_click.asInstanceOf[js.Any])
    if (orbit_transition_class != null) __obj.updateDynamic("orbit_transition_class")(orbit_transition_class.asInstanceOf[js.Any])
    if (!js.isUndefined(pause_on_hover)) __obj.updateDynamic("pause_on_hover")(pause_on_hover.asInstanceOf[js.Any])
    if (preloader_class != null) __obj.updateDynamic("preloader_class")(preloader_class.asInstanceOf[js.Any])
    if (prev_class != null) __obj.updateDynamic("prev_class")(prev_class.asInstanceOf[js.Any])
    if (!js.isUndefined(resume_on_mouseout)) __obj.updateDynamic("resume_on_mouseout")(resume_on_mouseout.asInstanceOf[js.Any])
    if (!js.isUndefined(slide_number)) __obj.updateDynamic("slide_number")(slide_number.asInstanceOf[js.Any])
    if (slide_number_class != null) __obj.updateDynamic("slide_number_class")(slide_number_class.asInstanceOf[js.Any])
    if (slide_number_text != null) __obj.updateDynamic("slide_number_text")(slide_number_text.asInstanceOf[js.Any])
    if (slide_selector != null) __obj.updateDynamic("slide_selector")(slide_selector.asInstanceOf[js.Any])
    if (slides_container_class != null) __obj.updateDynamic("slides_container_class")(slides_container_class.asInstanceOf[js.Any])
    if (!js.isUndefined(stack_on_small)) __obj.updateDynamic("stack_on_small")(stack_on_small.asInstanceOf[js.Any])
    if (stack_on_small_class != null) __obj.updateDynamic("stack_on_small_class")(stack_on_small_class.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (!js.isUndefined(timer)) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (timer_container_class != null) __obj.updateDynamic("timer_container_class")(timer_container_class.asInstanceOf[js.Any])
    if (timer_paused_class != null) __obj.updateDynamic("timer_paused_class")(timer_paused_class.asInstanceOf[js.Any])
    if (timer_progress_class != null) __obj.updateDynamic("timer_progress_class")(timer_progress_class.asInstanceOf[js.Any])
    if (timer_speed != null) __obj.updateDynamic("timer_speed")(timer_speed.asInstanceOf[js.Any])
    if (!js.isUndefined(variable_height)) __obj.updateDynamic("variable_height")(variable_height.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrbitOptions]
  }
}

