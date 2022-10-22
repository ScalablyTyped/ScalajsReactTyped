package typingsJapgolly.vegas

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.jquery.JQuery.TriggeredEvent
import typingsJapgolly.vegas.anon.ReadonlySettings
import typingsJapgolly.vegas.mod.global.JQuery
import typingsJapgolly.vegas.vegasStrings.auto
import typingsJapgolly.vegas.vegasStrings.repeat
import typingsJapgolly.vegas.vegasStrings.vegasend
import typingsJapgolly.vegas.vegasStrings.vegasinit
import typingsJapgolly.vegas.vegasStrings.vegaspause
import typingsJapgolly.vegas.vegasStrings.vegasplay
import typingsJapgolly.vegas.vegasStrings.vegaswalk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegas.vegasStrings.center
    - typingsJapgolly.vegas.vegasStrings.top
    - typingsJapgolly.vegas.vegasStrings.right
    - typingsJapgolly.vegas.vegasStrings.bottom
    - typingsJapgolly.vegas.vegasStrings.left
    - scala.Double
  */
  type AlignType = _AlignType | Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegas.vegasStrings.kenburns
    - typingsJapgolly.vegas.vegasStrings.kenburnsLeft
    - typingsJapgolly.vegas.vegasStrings.kenburnsRight
    - typingsJapgolly.vegas.vegasStrings.kenburnsUp
    - typingsJapgolly.vegas.vegasStrings.kenburnsUpLeft
    - typingsJapgolly.vegas.vegasStrings.kenburnsUpRight
    - typingsJapgolly.vegas.vegasStrings.kenburnsDown
    - typingsJapgolly.vegas.vegasStrings.kenburnsDownLeft
    - typingsJapgolly.vegas.vegasStrings.kenburnsDownRight
  */
  trait Animation
    extends StObject
       with _AnimationType
  object Animation {
    
    inline def kenburns: typingsJapgolly.vegas.vegasStrings.kenburns = "kenburns".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburns]
    
    inline def kenburnsDown: typingsJapgolly.vegas.vegasStrings.kenburnsDown = "kenburnsDown".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsDown]
    
    inline def kenburnsDownLeft: typingsJapgolly.vegas.vegasStrings.kenburnsDownLeft = "kenburnsDownLeft".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsDownLeft]
    
    inline def kenburnsDownRight: typingsJapgolly.vegas.vegasStrings.kenburnsDownRight = "kenburnsDownRight".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsDownRight]
    
    inline def kenburnsLeft: typingsJapgolly.vegas.vegasStrings.kenburnsLeft = "kenburnsLeft".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsLeft]
    
    inline def kenburnsRight: typingsJapgolly.vegas.vegasStrings.kenburnsRight = "kenburnsRight".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsRight]
    
    inline def kenburnsUp: typingsJapgolly.vegas.vegasStrings.kenburnsUp = "kenburnsUp".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsUp]
    
    inline def kenburnsUpLeft: typingsJapgolly.vegas.vegasStrings.kenburnsUpLeft = "kenburnsUpLeft".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsUpLeft]
    
    inline def kenburnsUpRight: typingsJapgolly.vegas.vegasStrings.kenburnsUpRight = "kenburnsUpRight".asInstanceOf[typingsJapgolly.vegas.vegasStrings.kenburnsUpRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegas.mod.Animation
    - typingsJapgolly.vegas.vegasStrings.random
    - js.Array[typingsJapgolly.vegas.mod.Animation]
  */
  type AnimationType = _AnimationType | js.Array[Animation]
  
  type Duration = auto | Double
  
  @js.native
  trait JQueryExtension extends StObject {
    
    def apply(): JQuery[HTMLElement] = js.native
    def apply(config: Settings): JQuery[HTMLElement] = js.native
    
    val defaults: ReadonlySettings = js.native
    
    def isVideoCompatible(): Boolean = js.native
  }
  
  trait Settings extends StObject {
    
    /**
      * Horizontal alignment of the image in the slide.
      * Could be `center` `top` `right` `bottom` `left` or a percentage.
      * @default 'center'
      */
    var align: js.UndefOr[AlignType] = js.undefined
    
    /**
      * Set the animation of the slides.
      * Could be an animation name, `random` or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    /**
      * Set the animation duration in milliseconds.
      * Could be `auto` so the animation duration will be equal to the slide delay .
      * @default 'auto'
      */
    var animationDuration: js.UndefOr[Duration] = js.undefined
    
    /**
      * Add custom animations to the animations list available in random mode.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var animationRegister: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Start the Slideshow automatically.
      * @default true
      */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Slide background color
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * `true` the slide image is scaled to fit the container.
      * `false` the slide image is displayed entirely.
      * `repeat` the slide image is repeated.
      * @default true
      */
    var cover: js.UndefOr[Boolean | repeat] = js.undefined
    
    /**
      * Delay beetween slides in milliseconds
      * @default 5_000
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Function called when the Slideshow is completed (loop: false).
      */
    var end: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
    
    /**
      * Set the transition for the first played slide.
      * Could be a transition name, `random` or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var firstTransition: js.UndefOr[TransitionType] = js.undefined
    
    /**
      * Set the transition duration in milliseconds for the first played slide.
      * Could be `auto` so the transition duration will be equal to the slide delay .
      */
    var firstTransitionDuration: js.UndefOr[Duration] = js.undefined
    
    /**
      * Function called when Vegas is applied to an element.
      */
    var init: js.UndefOr[js.Function1[/* settings */ this.type, Unit]] = js.undefined
    
    /**
      * Loop the Slideshow.
      * @default true
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display/hide the overlay.
      * Could be `true` `false` or the path of an overlay image pattern.
      * These image can be found in the overlays folder. Read the Overlay section for more information.
      * @default false
      */
    var overlay: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Function called when Vegas pauses the slideshow.
      */
    var pause: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
    
    /**
      * Function called when Vegas starts to play the slideshow.
      */
    var play: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
    
    /**
      * Preload both images and videos at start.
      * @default false
      */
    var preload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preload images at start. preload must be false .
      * @default false
      */
    var preloadImage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The array of slides is shuffled before.
      * @default false
      */
    var shuffle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index number of initial slide.
      * @default 0
      */
    var slide: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of slides
      * {@link http://vegas.jaysalvat.com/documentation/settings/#slide}
      */
    var slides: js.UndefOr[js.Array[Slide]] = js.undefined
    
    /**
      * Number of slides to keep in the background before removing it.
      * @default 1
      */
    var slidesToKeep: js.UndefOr[Double] = js.undefined
    
    /**
      * Display/hide timer bar.
      * The timer class is .vegas-timer-progress .
      * @default true
      */
    var timer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the transition between slides.
      * Could be a transition name| random or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions}
      * @default 'fade'
      */
    var transition: js.UndefOr[TransitionType] = js.undefined
    
    /**
      * Set the transition duration in milliseconds.
      * Could be `auto` so the transition duration will be equal to the slide delay.
      * @default 1_000
      */
    var transitionDuration: js.UndefOr[Duration] = js.undefined
    
    /**
      * Add custom transitions to the transitions list available in random mode.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var transitionRegister: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Vertical alignment of the image in the slide.
      * Could be `center` `top` `right` `bottom` `left` or a percentage.
      * @default 'center'
      */
    var valign: js.UndefOr[AlignType] = js.undefined
    
    /**
      * Function called when Vegas changes the slide.
      */
    var walk: js.UndefOr[js.Function2[/* index */ Double, /* slide */ Slide, Unit]] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDuration(value: Duration): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationRegister(value: js.Array[String]): Self = StObject.set(x, "animationRegister", value.asInstanceOf[js.Any])
      
      inline def setAnimationRegisterUndefined: Self = StObject.set(x, "animationRegister", js.undefined)
      
      inline def setAnimationRegisterVarargs(value: String*): Self = StObject.set(x, "animationRegister", js.Array(value*))
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnimationVarargs(value: Animation*): Self = StObject.set(x, "animation", js.Array(value*))
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCover(value: Boolean | repeat): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnd(value: (/* index */ Double, /* slide */ Slide) => Callback): Self = StObject.set(x, "end", js.Any.fromFunction2((t0: /* index */ Double, t1: /* slide */ Slide) => (value(t0, t1)).runNow()))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFirstTransition(value: TransitionType): Self = StObject.set(x, "firstTransition", value.asInstanceOf[js.Any])
      
      inline def setFirstTransitionDuration(value: Duration): Self = StObject.set(x, "firstTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setFirstTransitionDurationUndefined: Self = StObject.set(x, "firstTransitionDuration", js.undefined)
      
      inline def setFirstTransitionUndefined: Self = StObject.set(x, "firstTransition", js.undefined)
      
      inline def setFirstTransitionVarargs(value: Transition*): Self = StObject.set(x, "firstTransition", js.Array(value*))
      
      inline def setInit(value: Settings => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Settings) => value(t0).runNow()))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOverlay(value: Boolean | String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPause(value: (/* index */ Double, /* slide */ Slide) => Callback): Self = StObject.set(x, "pause", js.Any.fromFunction2((t0: /* index */ Double, t1: /* slide */ Slide) => (value(t0, t1)).runNow()))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPlay(value: (/* index */ Double, /* slide */ Slide) => Callback): Self = StObject.set(x, "play", js.Any.fromFunction2((t0: /* index */ Double, t1: /* slide */ Slide) => (value(t0, t1)).runNow()))
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadImage(value: Boolean): Self = StObject.set(x, "preloadImage", value.asInstanceOf[js.Any])
      
      inline def setPreloadImageUndefined: Self = StObject.set(x, "preloadImage", js.undefined)
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
      
      inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
      
      inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setSlides(value: js.Array[Slide]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesToKeep(value: Double): Self = StObject.set(x, "slidesToKeep", value.asInstanceOf[js.Any])
      
      inline def setSlidesToKeepUndefined: Self = StObject.set(x, "slidesToKeep", js.undefined)
      
      inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      inline def setSlidesVarargs(value: Slide*): Self = StObject.set(x, "slides", js.Array(value*))
      
      inline def setTimer(value: Boolean): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDuration(value: Duration): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionRegister(value: js.Array[String]): Self = StObject.set(x, "transitionRegister", value.asInstanceOf[js.Any])
      
      inline def setTransitionRegisterUndefined: Self = StObject.set(x, "transitionRegister", js.undefined)
      
      inline def setTransitionRegisterVarargs(value: String*): Self = StObject.set(x, "transitionRegister", js.Array(value*))
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitionVarargs(value: Transition*): Self = StObject.set(x, "transition", js.Array(value*))
      
      inline def setValign(value: AlignType): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWalk(value: (/* index */ Double, /* slide */ Slide) => Callback): Self = StObject.set(x, "walk", js.Any.fromFunction2((t0: /* index */ Double, t1: /* slide */ Slide) => (value(t0, t1)).runNow()))
      
      inline def setWalkUndefined: Self = StObject.set(x, "walk", js.undefined)
    }
  }
  
  trait Slide extends StObject {
    
    /**
      * Horizontal alignment of the image in the slide.
      * @default 'center'
      */
    var align: js.UndefOr[AlignType] = js.undefined
    
    /**
      * Set the animation of this slide.
      * Could be an animation name, `random` or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      */
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    /**
      * Set the animation duration in milliseconds.
      * Could be `auto` so the animation duration will be equal to the slide delay .
      */
    var animationDuration: js.UndefOr[Duration] = js.undefined
    
    /**
      * Slide background color.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * `true` the background image is scaled to fit the container.
      * `false` the background image is displayed entirely.
      * @default true
      */
    var cover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Delay beetween slides in milliseconds.
      * @default 5_000
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Path of the image.
      */
    var src: js.UndefOr[String] = js.undefined
    
    /**
      * Set the transition of this slide.
      * Could be a transition name, random or an array of transition picked randomly.
      * {@link http://vegas.jaysalvat.com/documentation/transitions/}
      * @default 'fade'
      */
    var transition: js.UndefOr[TransitionType] = js.undefined
    
    /**
      * Set the transition duration in milliseconds.
      * Could be `auto` so the transition duration will be equal to the slide delay .
      * @default 1_000
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical alignment of the image in the slide.
      * @default 'center'
      */
    var valing: js.UndefOr[AlignType] = js.undefined
    
    /**
      * {@link http://vegas.jaysalvat.com/documentation/settings/#videos}
      */
    var video: js.UndefOr[Video] = js.undefined
  }
  object Slide {
    
    inline def apply(): Slide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Slide]
    }
    
    extension [Self <: Slide](x: Self) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDuration(value: Duration): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnimationVarargs(value: Animation*): Self = StObject.set(x, "animation", js.Array(value*))
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitionVarargs(value: Transition*): Self = StObject.set(x, "transition", js.Array(value*))
      
      inline def setValing(value: AlignType): Self = StObject.set(x, "valing", value.asInstanceOf[js.Any])
      
      inline def setValingUndefined: Self = StObject.set(x, "valing", js.undefined)
      
      inline def setVideo(value: Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait Support extends StObject {
    
    val objectFit: Boolean
    
    val transition: Boolean
    
    val video: Boolean
  }
  object Support {
    
    inline def apply(objectFit: Boolean, transition: Boolean, video: Boolean): Support = {
      val __obj = js.Dynamic.literal(objectFit = objectFit.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Support]
    }
    
    extension [Self <: Support](x: Self) {
      
      inline def setObjectFit(value: Boolean): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegas.vegasStrings.fade
    - typingsJapgolly.vegas.vegasStrings.fade2
    - typingsJapgolly.vegas.vegasStrings.blur
    - typingsJapgolly.vegas.vegasStrings.blur2
    - typingsJapgolly.vegas.vegasStrings.flash
    - typingsJapgolly.vegas.vegasStrings.flash2
    - typingsJapgolly.vegas.vegasStrings.negative
    - typingsJapgolly.vegas.vegasStrings.negative2
    - typingsJapgolly.vegas.vegasStrings.burn
    - typingsJapgolly.vegas.vegasStrings.burn2
    - typingsJapgolly.vegas.vegasStrings.slideLeft
    - typingsJapgolly.vegas.vegasStrings.slideLeft2
    - typingsJapgolly.vegas.vegasStrings.slideRight
    - typingsJapgolly.vegas.vegasStrings.slideRight2
    - typingsJapgolly.vegas.vegasStrings.slideUp
    - typingsJapgolly.vegas.vegasStrings.slideUp2
    - typingsJapgolly.vegas.vegasStrings.slideDown
    - typingsJapgolly.vegas.vegasStrings.slideDown2
    - typingsJapgolly.vegas.vegasStrings.zoomIn
    - typingsJapgolly.vegas.vegasStrings.zoomIn2
    - typingsJapgolly.vegas.vegasStrings.zoomOut
    - typingsJapgolly.vegas.vegasStrings.zoomOut2
    - typingsJapgolly.vegas.vegasStrings.swirlLeft
    - typingsJapgolly.vegas.vegasStrings.swirlLeft2
    - typingsJapgolly.vegas.vegasStrings.swirlRight
    - typingsJapgolly.vegas.vegasStrings.swirlRight2
  */
  trait Transition
    extends StObject
       with _TransitionType
  object Transition {
    
    inline def blur: typingsJapgolly.vegas.vegasStrings.blur = "blur".asInstanceOf[typingsJapgolly.vegas.vegasStrings.blur]
    
    inline def blur2: typingsJapgolly.vegas.vegasStrings.blur2 = "blur2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.blur2]
    
    inline def burn: typingsJapgolly.vegas.vegasStrings.burn = "burn".asInstanceOf[typingsJapgolly.vegas.vegasStrings.burn]
    
    inline def burn2: typingsJapgolly.vegas.vegasStrings.burn2 = "burn2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.burn2]
    
    inline def fade: typingsJapgolly.vegas.vegasStrings.fade = "fade".asInstanceOf[typingsJapgolly.vegas.vegasStrings.fade]
    
    inline def fade2: typingsJapgolly.vegas.vegasStrings.fade2 = "fade2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.fade2]
    
    inline def flash: typingsJapgolly.vegas.vegasStrings.flash = "flash".asInstanceOf[typingsJapgolly.vegas.vegasStrings.flash]
    
    inline def flash2: typingsJapgolly.vegas.vegasStrings.flash2 = "flash2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.flash2]
    
    inline def negative: typingsJapgolly.vegas.vegasStrings.negative = "negative".asInstanceOf[typingsJapgolly.vegas.vegasStrings.negative]
    
    inline def negative2: typingsJapgolly.vegas.vegasStrings.negative2 = "negative2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.negative2]
    
    inline def slideDown: typingsJapgolly.vegas.vegasStrings.slideDown = "slideDown".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideDown]
    
    inline def slideDown2: typingsJapgolly.vegas.vegasStrings.slideDown2 = "slideDown2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideDown2]
    
    inline def slideLeft: typingsJapgolly.vegas.vegasStrings.slideLeft = "slideLeft".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideLeft]
    
    inline def slideLeft2: typingsJapgolly.vegas.vegasStrings.slideLeft2 = "slideLeft2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideLeft2]
    
    inline def slideRight: typingsJapgolly.vegas.vegasStrings.slideRight = "slideRight".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideRight]
    
    inline def slideRight2: typingsJapgolly.vegas.vegasStrings.slideRight2 = "slideRight2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideRight2]
    
    inline def slideUp: typingsJapgolly.vegas.vegasStrings.slideUp = "slideUp".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideUp]
    
    inline def slideUp2: typingsJapgolly.vegas.vegasStrings.slideUp2 = "slideUp2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.slideUp2]
    
    inline def swirlLeft: typingsJapgolly.vegas.vegasStrings.swirlLeft = "swirlLeft".asInstanceOf[typingsJapgolly.vegas.vegasStrings.swirlLeft]
    
    inline def swirlLeft2: typingsJapgolly.vegas.vegasStrings.swirlLeft2 = "swirlLeft2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.swirlLeft2]
    
    inline def swirlRight: typingsJapgolly.vegas.vegasStrings.swirlRight = "swirlRight".asInstanceOf[typingsJapgolly.vegas.vegasStrings.swirlRight]
    
    inline def swirlRight2: typingsJapgolly.vegas.vegasStrings.swirlRight2 = "swirlRight2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.swirlRight2]
    
    inline def zoomIn: typingsJapgolly.vegas.vegasStrings.zoomIn = "zoomIn".asInstanceOf[typingsJapgolly.vegas.vegasStrings.zoomIn]
    
    inline def zoomIn2: typingsJapgolly.vegas.vegasStrings.zoomIn2 = "zoomIn2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.zoomIn2]
    
    inline def zoomOut: typingsJapgolly.vegas.vegasStrings.zoomOut = "zoomOut".asInstanceOf[typingsJapgolly.vegas.vegasStrings.zoomOut]
    
    inline def zoomOut2: typingsJapgolly.vegas.vegasStrings.zoomOut2 = "zoomOut2".asInstanceOf[typingsJapgolly.vegas.vegasStrings.zoomOut2]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegas.mod.Transition
    - typingsJapgolly.vegas.vegasStrings.random
    - js.Array[typingsJapgolly.vegas.mod.Transition]
  */
  type TransitionType = _TransitionType | js.Array[Transition]
  
  type VegasEnd = vegasend
  
  type VegasInitEvent = vegasinit
  
  type VegasInitHnalder[TElement] = TriggeredEvent[TElement, Unit, HTMLElement, HTMLElement]
  
  type VegasPause = vegaspause
  
  type VegasPlay = vegasplay
  
  type VegasWalk = vegaswalk
  
  trait Video extends StObject {
    
    /**
      * @default false
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var mute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path of the video.
      * Could be a string or an array of sources.
      */
    var src: String | js.Array[String]
  }
  object Video {
    
    inline def apply(src: String | js.Array[String]): Video = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Video]
    }
    
    extension [Self <: Video](x: Self) {
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
    }
  }
  
  trait _AlignType extends StObject
  
  trait _AnimationType extends StObject
  
  trait _TransitionType extends StObject
  
  object global {
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
      def on(
        events: VegasEnd,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      def on(events: VegasInitEvent, handler: js.Function2[/* event */ Event, /* settings */ Settings, Unit]): this.type = js.native
      def on(
        events: VegasPause,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      def on(
        events: VegasPlay,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      def on(
        events: VegasWalk,
        handler: js.Function3[/* event */ Event, /* index */ Double, /* slide */ Slide, Unit]
      ): this.type = js.native
      
      def vegas(): JQuery[HTMLElement] = js.native
      def vegas(config: Settings): JQuery[HTMLElement] = js.native
      @JSName("vegas")
      var vegas_Original: JQueryExtension = js.native
    }
    
    trait JQueryStatic extends StObject {
      
      def vegas(): JQuery[HTMLElement]
      def vegas(config: Settings): JQuery[HTMLElement]
      @JSName("vegas")
      var vegas_Original: JQueryExtension
    }
    object JQueryStatic {
      
      inline def apply(vegas: JQueryExtension): JQueryStatic = {
        val __obj = js.Dynamic.literal(vegas = vegas.asInstanceOf[js.Any])
        __obj.asInstanceOf[JQueryStatic]
      }
      
      extension [Self <: JQueryStatic](x: Self) {
        
        inline def setVegas(value: JQueryExtension): Self = StObject.set(x, "vegas", value.asInstanceOf[js.Any])
      }
    }
  }
}
