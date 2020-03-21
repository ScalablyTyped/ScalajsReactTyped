package typingsJapgolly.fullpageJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.fullpageJs.fullpageJsStrings.bottom
import typingsJapgolly.fullpageJs.fullpageJsStrings.fingersonly
import typingsJapgolly.fullpageJs.fullpageJsStrings.horizontal
import typingsJapgolly.fullpageJs.fullpageJsStrings.mouseonly
import typingsJapgolly.fullpageJs.fullpageJsStrings.sections
import typingsJapgolly.fullpageJs.fullpageJsStrings.slides
import typingsJapgolly.fullpageJs.fullpageJsStrings.top
import typingsJapgolly.fullpageJs.fullpageJsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullPageJsOptions extends js.Object {
  /**
    * Callback fired once the sections have been loaded, after the scrolling has ended.
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    */
  var afterLoad: js.UndefOr[js.Function2[/* anchorLink */ String, /* index */ Double, Unit]] = js.undefined
  /**
    * This callback is fired just after the structure of the page is generated. This is the callback you want to use to initialize other plugins or fire any code which requires the document to be ready (as this plugin modifies the DOM to create the resulting structure).
    */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * This callback is fired after resizing the browser's window. Just after the sections are resized.
    */
  var afterResize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * This callback is fired after fullpage.js changes from normal to responsive mode or from responsive mode to normal mode.
    * @param {boolean} isResponsive boolean that determines if it enters into responsive mode (true) or goes back to normal mode (false)
    */
  var afterResponsive: js.UndefOr[js.Function1[/* isResponsive */ Boolean, Unit]] = js.undefined
  /**
    * Callback fired once the slide of a section have been loaded, after the scrolling has ended.
    *
    * In case of not having anchorLinks defined for the slide or slides the slideIndex parameter would be the only one to use.
    *
    * Parameters:
    *
    * @param anchorLink anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    * @param slideAnchor anchor corresponding to the slide (in case there is)
    * @param slideIndex index of the slide. Starting from 1. (the default slide doesn't count as slide, but as a section)
    */
  var afterSlideLoad: js.UndefOr[
    js.Function4[
      /* anchorLink */ String, 
      /* index */ Double, 
      /* slideAnchor */ String, 
      /* slideIndex */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * (default []) Defines the anchor links (#example) to be shown on the URL for each section. Anchors value should be unique. The position of the anchors in the array will define to which sections the anchor is applied. (second position for second section and so on). Using anchors forward and backward navigation will also be possible through the browser. This option also allows users to bookmark a specific section or slide. Be careful! anchors can not have the same value as any ID element on the site (or NAME element for IE). Now anchors can be defined directly in the HTML structure by using the attribute data-anchor as explained here.
    */
  var anchors: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (default true) Defines whether the load of the site when given an anchor (#) will scroll with animation to its destination or will directly load on the given section.
    */
  var animateAnchor: js.UndefOr[Boolean] = js.undefined
  /**
    * (default true) Defines whether to use the "automatic" scrolling or the "normal" one. It also has affects the way the sections fit in the browser/device window in tablets and mobile phones.
    */
  var autoScrolling: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines how to scroll to a section which size is bigger than the viewport. By default fullPage.js scrolls to the top if you come from a section above the destination one and to the bottom if you come from a section below the destination one.
    */
  var bigSectionsDestination: js.UndefOr[top | bottom | Null] = js.undefined
  /**
    * (default false) Extension of fullpage.js. Defines whether sliding right in the last slide should slide right to the first one or not, and if scrolling left in the first slide should slide left to the last one or not. Not compatible with loopHorizontal. Requires fullpage.js >= 2.8.3.
    */
  var continuousHorizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * (default false) Defines whether scrolling down in the last section should scroll down to the first one or not, and if scrolling up in the first section should scroll up to the last one or not. Not compatible with loopTop or loopBottom.
    */
  var continuousVertical: js.UndefOr[Boolean] = js.undefined
  // Design
  /**
    * (default: true) Determines whether to use control arrows for the slides to move right or left.
    */
  var controlArrows: js.UndefOr[Boolean] = js.undefined
  // Scrolling
  /**
    * (default true). Defines whether to use JavaScript or CSS3 transforms to scroll within sections and slides. Useful to speed up the movement in tablet and mobile devices with browsers supporting CSS3. If this option is set to true and the browser doesn't support CSS3, a jQuery fallback will be used instead.
    */
  var css3: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables or disables the dragging and flicking of sections and slides by using mouse or fingers. Requires fullpage.js >= 2.8.9. Possible values are: 
    * true: enables the feature.
    * false: disables the feature.
    * vertical: enables the feature only vertically.
    * horizontal: enables the feature only horizontally.
    * fingersonly: enables the feature for touch devices only.
    * mouseonly: enables the feature for desktop devices only (mouse and trackpad).
    */
  var dragAndMove: js.UndefOr[Boolean | vertical | horizontal | fingersonly | mouseonly] = js.undefined
  /**
    * (default easeInOutCubic) Defines the transition effect to use for the vertical and horizontal scrolling. It requires the file vendors/jquery.easings.min.js or jQuery UI for using some of its transitions. Other libraries could be used instead.
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * (default ease) Defines the transition effect to use in case of using css3:true. You can use the pre-defined ones (such as linear, ease-out...) or create your own ones using the cubic-bezier function. You might want to use Matthew Lein CSS Easing Animation Tool for it.
    */
  var easingcss3: js.UndefOr[String] = js.undefined
  /**
    * Defines whether to use a fading effect or not instead of the default scrolling one. Possible values are true, false, sections, slides. It can therefore be applied just vertically or horizontally, or to both at the time. Requires fullpage.js >= 2.8.6.
    */
  var fadingEffect: js.UndefOr[Boolean | sections | slides] = js.undefined
  /**
    * (default true). Determines whether or not to fit sections to the viewport or not. When set to true the current active section will always fill the whole viewport. Otherwise the user will be free to stop in the middle of a section (when )
    */
  var fitToSection: js.UndefOr[Boolean] = js.undefined
  /**
    * (default 1000). If fitToSection is set to true, this delays the fitting by the configured milliseconds.
    */
  var fitToSectionDelay: js.UndefOr[Double] = js.undefined
  /**
    * (default null) Defines which elements will be taken off the scrolling structure of the plugin which is necessary when using the css3 option to keep them fixed. It requires a string with the jQuery selectors for those elements. (For example: fixedElements: '#element1, .element2')
    */
  var fixedElements: js.UndefOr[String] = js.undefined
  /** 
    * (default false) Extension of fullpage.js. Determines whether moving one horizontal slider will force the sliding of sliders in other section in the same direction. Possible values are true, false or an array with the interlocked sections. For example [1,3,5] starting by 1. Requires fullpage.js >= 2.8.3. 
    */
  var interlockedSlides: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  // Accessibility
  /**
    * (default true) Defines if the content can be navigated using the keyboard
    */
  var keyboardScrolling: js.UndefOr[Boolean] = js.undefined
  /**
    * Lazy loading is active by default which means it will lazy load any media element containing the attribute data-src as detailed in the Lazy Loading docs . If you want to use any other lazy loading library you can disable this fullpage.js feature.
    */ 
  var lazyLoading: js.UndefOr[Boolean] = js.undefined
  /**
    * (default false). Determines whether anchors in the URL will have any effect at all in the plugin. You can still using anchors internally for your own functions and callbacks, but they won't have any effect in the scrolling of the site. Useful if you want to combine fullPage.js with other plugins using anchor in the URL.
    */
  var lockAnchors: js.UndefOr[Boolean] = js.undefined
  /**
    * (default false) Defines whether scrolling down in the last section should scroll to the first one or not.
    */
  var loopBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * (default true) Defines whether horizontal sliders will loop after reaching the last or previous slide or not.
    */
  var loopHorizontal: js.UndefOr[Boolean] = js.undefined
  /**
    *  (default false) Defines whether scrolling up in the first section should scroll to the last one or not.
    */
  var loopTop: js.UndefOr[Boolean] = js.undefined
  /**
    * (default false) A selector can be used to specify the menu to link with the sections. This way the scrolling of the sections will activate the corresponding element in the menu using the class active. This won't generate a menu but will just add the active class to the element in the given menu with the corresponding anchor links. In order to link the elements of the menu with the sections, an HTML 5 data-tag (data-menuanchor) will be needed to use with the same anchor links as used within the sections.
    */
  var menu: js.UndefOr[String] = js.undefined
  /**
    * (default false) If set to true, it will show a navigation bar made up of small circles.
    */
  var navigation: js.UndefOr[Boolean] = js.undefined
  /**
    * (default none) It can be set to left or right and defines which position the navigation bar will be shown (if using one).
    */
  var navigationPosition: js.UndefOr[String] = js.undefined
  /**
    * (default []) Defines the tooltips to show for the navigation circles in case they are being used. Example: navigationTooltips: ['firstSlide', 'secondSlide'].
    */
  var navigationTooltips: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (default 5) Defines the threshold for the number of hops up the html node tree Fullpage will test to see if normalScrollElements is a match to allow scrolling functionality on divs on a touch device. (For example: normalScrollElementTouchThreshold: 3)
    */
  var normalScrollElementTouchThreshold: js.UndefOr[Double] = js.undefined
  /**
    *  (default null) If you want to avoid the auto scroll when scrolling over some elements, this is the option you need to use. (useful for maps, scrolling divs etc.) It requires a string with the jQuery selectors for those elements. (For example: normalScrollElements: '#element1, .element2')
    */
  var normalScrollElements: js.UndefOr[String] = js.undefined
  /**
    * (default false)Extension of fullpage.js. Provides a way to use non full screen sections based on percentage. Ideal to show visitors there's more content in the site by showing part of the next or previous section. Requires fullPage.js >= 2.8.8 To define the percentage of each section the attribute data-percentage must be used. The centering of the section in the viewport can be determined by using a boolean value in the attribute data-centered (default to true if not specified). For example:
    */
  var offsetSections: js.UndefOr[Boolean] = js.undefined
  // Events
  /**
    * This callback is fired once the user leaves a section, in the transition to the new section. Returning false will cancel the move before it takes place.
    * @param index index of the leaving section. Starting from 1.
    * @param nextIndex index of the destination section. Starting from 1.
    * @param direction it will take the values up or down depending on the scrolling direction.
    */
  var onLeave: js.UndefOr[
    js.Function3[/* index */ Double, /* nextIndex */ Double, /* direction */ String, Unit]
  ] = js.undefined
  /**
    * This callback is fired once the user leaves an slide to go to another, in the transition to the new slide. Returning false will cancel the move before it takes place.
    * @param anchorLink: anchorLink corresponding to the section.
    * @param index index of the section. Starting from 1.
    * @param slideIndex index of the slide. Starting from 0.
    * @param direction takes the values right or left depending on the scrolling direction.
    * @param nextSlideIndex index of the destination slide. Starting from 0.
    */
  var onSlideLeave: js.UndefOr[
    js.Function5[
      /* anchorLink */ String, 
      /* index */ Double, 
      /* slideIndex */ Double, 
      /* direction */ String, 
      /* nextSlideIndex */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * (default 0) Defines the bottom padding for each section with a numerical value and its measure (paddingBottom: '10px', paddingBottom: '10em'...). Useful in case of using a fixed footer.
    */
  var paddingBottom: js.UndefOr[String] = js.undefined
  /**
    * (default 0) Defines the top padding for each section with a numerical value and its measure (paddingTop: '10px', paddingTop: '10em'...) Useful in case of using a fixed header.
    */
  var paddingTop: js.UndefOr[String] = js.undefined
  /**
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */
  var parallax: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows to configure the parameters for the parallax backgrounds effect when using the option parallax:true.
    */ 
  var parallaxOptions: js.UndefOr[AnonPercentage] = js.undefined
  /**
    * (default true) Defines whether to push the state of the site to the browser's history. When set to true each section/slide of the site will act as a new page and the back and forward buttons of the browser will scroll the sections/slides to reach the previous or next state of the site. When set to false, the URL will keep changing but will have no effect on the browser's history. This option is automatically turned off when using autoScrolling:false.
    */
  var recordHistory: js.UndefOr[Boolean] = js.undefined
  /** 
    * (default false). Extension of fullpage.js. Defines whether or not to reset every slider after leaving its section. Requires fullpage.js >= 2.8.3.
    */
  var resetSliders: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * (default 0) A normal scroll (autoScrolling:false) will be used under the defined height in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for their own responsive CSS. For example, if set to 900, whenever the browser's height is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveHeight: js.UndefOr[Double] = js.undefined
  /** 
    * When set to true slides will be turned into vertical sections when responsive mode is fired. (by using the responsiveWidth or responsiveHeight options detailed above). Requires fullpage.js >= 2.8.5.
    */ 
  var responsiveSlides: js.UndefOr[Boolean] = js.undefined
  /**
    *  (default 0) A normal scroll (autoScrolling:false) will be used under the defined width in pixels. A class fp-responsive is added to the body tag in case the user wants to use it for their own responsive CSS. For example, if set to 900, whenever the browser's width is less than 900 the plugin will scroll like a normal site.
    */
  var responsiveWidth: js.UndefOr[Double] = js.undefined
  /**
    *  (default false). Determines whether to use scrollbar for the site or not. In case of using scroll bar, the autoScrolling functionality will still working as expected. The user will also be free to scroll the site with the scroll bar and fullPage.js will fit the section in the screen when scrolling finishes.
    */
  var scrollBar: js.UndefOr[Boolean] = js.undefined
  /**
    * (default false) Extension of fullpage.js. Defines whether to slide horizontally within sliders by using the mouse wheel or trackpad. Ideal for story telling. Requires fullpage.js >= 2.8.3.
    */
  var scrollHorizontally: js.UndefOr[Boolean] = js.undefined
  /**
    * (default false) defines whether or not to create a scroll for the section/slide in case its content is bigger than the height of it. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback. In case of setting it to true, it requires the vendor library scrolloverflow.min.js and it should be loaded before the fullPage.js plugin.
    */
  var scrollOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    * when using scrollOverflow:true fullpage.js will make use of a forked and modified version of iScroll.js libary. You can customize the scrolling behaviour by providing fullpage.js with the iScroll.js options you want to use. Check its documentation for more info.
    */
  var scrollOverflowOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * When set to true it scrolls up the content of the section/slide with scroll bar when leaving to another vertical section. This way the section/slide will always show the start of its content even when scrolling from a section under it
    */
  var scrollOverflowReset: js.UndefOr[Boolean] = js.undefined
  /**
    * (default 700) Speed in milliseconds for the scrolling transitions.
    */
  var scrollingSpeed: js.UndefOr[Double] = js.undefined
  // Custom selectors
  /**
    * (default .section) Defines the jQuery selector used for the plugin sections. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var sectionSelector: js.UndefOr[String] = js.undefined
  /**
    * (default none) Define the CSS background-color property for each section
    */
  var sectionsColor: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (default false) Shows a persistent tooltip for the actively viewed section in the vertical navigation.
    */
  var showActiveTooltip: js.UndefOr[Boolean] = js.undefined
  /**
    * (default .slide) Defines the jQuery selector used for the plugin slides. It might need to be changed sometimes to avoid problem with other plugins using the same selectors as fullpage.js.
    */
  var slideSelector: js.UndefOr[String] = js.undefined
  /**
    * (default bottom) Defines the position for the landscape navigation bar for sliders. Admits top and bottom as values. You may want to modify the CSS styles to determine the distance from the top or bottom as well as any other style such as color.
    */
  var slidesNavPosition: js.UndefOr[String] = js.undefined
  /**
    * (default false) If set to true it will show a navigation bar made up of small circles for each landscape slider on the site.
    */
  var slidesNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * (default 5) Defines a percentage of the browsers window width/height, and how far a swipe must measure for navigating to the next section / slide
    */
  var touchSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * (default true) Vertically centering of the content within sections. When set to true, your content will be wrapped by the plugin. Consider using delegation or load your other scripts in the afterRender callback.
    */
  var verticalCentered: js.UndefOr[Boolean] = js.undefined
}

object FullPageJsOptions {
  @scala.inline
  def apply(
    afterLoad: (/* anchorLink */ String, /* index */ Double) => Callback = null,
    afterRender: js.UndefOr[Callback] = js.undefined,
    afterResize: js.UndefOr[Callback] = js.undefined,
    afterResponsive: /* isResponsive */ Boolean => Callback = null,
    afterSlideLoad: (/* anchorLink */ String, /* index */ Double, /* slideAnchor */ String, /* slideIndex */ Double) => Callback = null,
    anchors: js.Array[String] = null,
    animateAnchor: js.UndefOr[Boolean] = js.undefined,
    autoScrolling: js.UndefOr[Boolean] = js.undefined,
    bigSectionsDestination: top | bottom = null,
    continuousHorizontal: js.UndefOr[Boolean] = js.undefined,
    continuousVertical: js.UndefOr[Boolean] = js.undefined,
    controlArrows: js.UndefOr[Boolean] = js.undefined,
    css3: js.UndefOr[Boolean] = js.undefined,
    dragAndMove: Boolean | vertical | horizontal | fingersonly | mouseonly = null,
    easing: String = null,
    easingcss3: String = null,
    fadingEffect: Boolean | sections | slides = null,
    fitToSection: js.UndefOr[Boolean] = js.undefined,
    fitToSectionDelay: Int | Double = null,
    fixedElements: String = null,
    interlockedSlides: Boolean | js.Array[Double] = null,
    keyboardScrolling: js.UndefOr[Boolean] = js.undefined,
    lazyLoading: js.UndefOr[Boolean] = js.undefined,
    lockAnchors: js.UndefOr[Boolean] = js.undefined,
    loopBottom: js.UndefOr[Boolean] = js.undefined,
    loopHorizontal: js.UndefOr[Boolean] = js.undefined,
    loopTop: js.UndefOr[Boolean] = js.undefined,
    menu: String = null,
    navigation: js.UndefOr[Boolean] = js.undefined,
    navigationPosition: String = null,
    navigationTooltips: js.Array[String] = null,
    normalScrollElementTouchThreshold: Int | Double = null,
    normalScrollElements: String = null,
    offsetSections: js.UndefOr[Boolean] = js.undefined,
    onLeave: (/* index */ Double, /* nextIndex */ Double, /* direction */ String) => Callback = null,
    onSlideLeave: (/* anchorLink */ String, /* index */ Double, /* slideIndex */ Double, /* direction */ String, /* nextSlideIndex */ Double) => Callback = null,
    paddingBottom: String = null,
    paddingTop: String = null,
    parallax: js.UndefOr[Boolean] = js.undefined,
    parallaxOptions: AnonPercentage = null,
    recordHistory: js.UndefOr[Boolean] = js.undefined,
    resetSliders: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    responsiveHeight: Int | Double = null,
    responsiveSlides: js.UndefOr[Boolean] = js.undefined,
    responsiveWidth: Int | Double = null,
    scrollBar: js.UndefOr[Boolean] = js.undefined,
    scrollHorizontally: js.UndefOr[Boolean] = js.undefined,
    scrollOverflow: js.UndefOr[Boolean] = js.undefined,
    scrollOverflowOptions: js.Any = null,
    scrollOverflowReset: js.UndefOr[Boolean] = js.undefined,
    scrollingSpeed: Int | Double = null,
    sectionSelector: String = null,
    sectionsColor: js.Array[String] = null,
    showActiveTooltip: js.UndefOr[Boolean] = js.undefined,
    slideSelector: String = null,
    slidesNavPosition: String = null,
    slidesNavigation: js.UndefOr[Boolean] = js.undefined,
    touchSensitivity: Int | Double = null,
    verticalCentered: js.UndefOr[Boolean] = js.undefined
  ): FullPageJsOptions = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction2((t0: /* anchorLink */ java.lang.String, t1: /* index */ scala.Double) => afterLoad(t0, t1).runNow()))
    afterRender.foreach(p => __obj.updateDynamic("afterRender")(p.toJsFn))
    afterResize.foreach(p => __obj.updateDynamic("afterResize")(p.toJsFn))
    if (afterResponsive != null) __obj.updateDynamic("afterResponsive")(js.Any.fromFunction1((t0: /* isResponsive */ scala.Boolean) => afterResponsive(t0).runNow()))
    if (afterSlideLoad != null) __obj.updateDynamic("afterSlideLoad")(js.Any.fromFunction4((t0: /* anchorLink */ java.lang.String, t1: /* index */ scala.Double, t2: /* slideAnchor */ java.lang.String, t3: /* slideIndex */ scala.Double) => afterSlideLoad(t0, t1, t2, t3).runNow()))
    if (anchors != null) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAnchor)) __obj.updateDynamic("animateAnchor")(animateAnchor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrolling)) __obj.updateDynamic("autoScrolling")(autoScrolling.asInstanceOf[js.Any])
    if (bigSectionsDestination != null) __obj.updateDynamic("bigSectionsDestination")(bigSectionsDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousHorizontal)) __obj.updateDynamic("continuousHorizontal")(continuousHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(continuousVertical)) __obj.updateDynamic("continuousVertical")(continuousVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(controlArrows)) __obj.updateDynamic("controlArrows")(controlArrows.asInstanceOf[js.Any])
    if (!js.isUndefined(css3)) __obj.updateDynamic("css3")(css3.asInstanceOf[js.Any])
    if (dragAndMove != null) __obj.updateDynamic("dragAndMove")(dragAndMove.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (easingcss3 != null) __obj.updateDynamic("easingcss3")(easingcss3.asInstanceOf[js.Any])
    if (fadingEffect != null) __obj.updateDynamic("fadingEffect")(fadingEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToSection)) __obj.updateDynamic("fitToSection")(fitToSection.asInstanceOf[js.Any])
    if (fitToSectionDelay != null) __obj.updateDynamic("fitToSectionDelay")(fitToSectionDelay.asInstanceOf[js.Any])
    if (fixedElements != null) __obj.updateDynamic("fixedElements")(fixedElements.asInstanceOf[js.Any])
    if (interlockedSlides != null) __obj.updateDynamic("interlockedSlides")(interlockedSlides.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardScrolling)) __obj.updateDynamic("keyboardScrolling")(keyboardScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoading)) __obj.updateDynamic("lazyLoading")(lazyLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAnchors)) __obj.updateDynamic("lockAnchors")(lockAnchors.asInstanceOf[js.Any])
    if (!js.isUndefined(loopBottom)) __obj.updateDynamic("loopBottom")(loopBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(loopHorizontal)) __obj.updateDynamic("loopHorizontal")(loopHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(loopTop)) __obj.updateDynamic("loopTop")(loopTop.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigationPosition != null) __obj.updateDynamic("navigationPosition")(navigationPosition.asInstanceOf[js.Any])
    if (navigationTooltips != null) __obj.updateDynamic("navigationTooltips")(navigationTooltips.asInstanceOf[js.Any])
    if (normalScrollElementTouchThreshold != null) __obj.updateDynamic("normalScrollElementTouchThreshold")(normalScrollElementTouchThreshold.asInstanceOf[js.Any])
    if (normalScrollElements != null) __obj.updateDynamic("normalScrollElements")(normalScrollElements.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetSections)) __obj.updateDynamic("offsetSections")(offsetSections.asInstanceOf[js.Any])
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* nextIndex */ scala.Double, t2: /* direction */ java.lang.String) => onLeave(t0, t1, t2).runNow()))
    if (onSlideLeave != null) __obj.updateDynamic("onSlideLeave")(js.Any.fromFunction5((t0: /* anchorLink */ java.lang.String, t1: /* index */ scala.Double, t2: /* slideIndex */ scala.Double, t3: /* direction */ java.lang.String, t4: /* nextSlideIndex */ scala.Double) => onSlideLeave(t0, t1, t2, t3, t4).runNow()))
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (!js.isUndefined(parallax)) __obj.updateDynamic("parallax")(parallax.asInstanceOf[js.Any])
    if (parallaxOptions != null) __obj.updateDynamic("parallaxOptions")(parallaxOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(recordHistory)) __obj.updateDynamic("recordHistory")(recordHistory.asInstanceOf[js.Any])
    if (!js.isUndefined(resetSliders)) __obj.updateDynamic("resetSliders")(resetSliders.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (responsiveHeight != null) __obj.updateDynamic("responsiveHeight")(responsiveHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveSlides)) __obj.updateDynamic("responsiveSlides")(responsiveSlides.asInstanceOf[js.Any])
    if (responsiveWidth != null) __obj.updateDynamic("responsiveWidth")(responsiveWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollBar)) __obj.updateDynamic("scrollBar")(scrollBar.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHorizontally)) __obj.updateDynamic("scrollHorizontally")(scrollHorizontally.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOverflow)) __obj.updateDynamic("scrollOverflow")(scrollOverflow.asInstanceOf[js.Any])
    if (scrollOverflowOptions != null) __obj.updateDynamic("scrollOverflowOptions")(scrollOverflowOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOverflowReset)) __obj.updateDynamic("scrollOverflowReset")(scrollOverflowReset.asInstanceOf[js.Any])
    if (scrollingSpeed != null) __obj.updateDynamic("scrollingSpeed")(scrollingSpeed.asInstanceOf[js.Any])
    if (sectionSelector != null) __obj.updateDynamic("sectionSelector")(sectionSelector.asInstanceOf[js.Any])
    if (sectionsColor != null) __obj.updateDynamic("sectionsColor")(sectionsColor.asInstanceOf[js.Any])
    if (!js.isUndefined(showActiveTooltip)) __obj.updateDynamic("showActiveTooltip")(showActiveTooltip.asInstanceOf[js.Any])
    if (slideSelector != null) __obj.updateDynamic("slideSelector")(slideSelector.asInstanceOf[js.Any])
    if (slidesNavPosition != null) __obj.updateDynamic("slidesNavPosition")(slidesNavPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesNavigation)) __obj.updateDynamic("slidesNavigation")(slidesNavigation.asInstanceOf[js.Any])
    if (touchSensitivity != null) __obj.updateDynamic("touchSensitivity")(touchSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCentered)) __obj.updateDynamic("verticalCentered")(verticalCentered.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullPageJsOptions]
  }
}

