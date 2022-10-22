package typingsJapgolly.accessibility

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.accessibility.accessibilityBooleans.`true`
import typingsJapgolly.accessibility.anon.Buttons
import typingsJapgolly.accessibility.anon.CBackground
import typingsJapgolly.accessibility.anon.Font
import typingsJapgolly.accessibility.anon.Persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Adaptive Accessibility Menu
    */
  @JSImport("accessibility", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Accessibility {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def alterTextSpace(isIncrease: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def build(): Unit = js.native
    
    /* CompleteClass */
    override def deleteOppositesIfDefined(options: Options): Options = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disabledUnsupportedFeatures(): Unit = js.native
    
    /* CompleteClass */
    override def fontFallback(): Unit = js.native
    
    /* CompleteClass */
    override def initFontSize(): Unit = js.native
    
    /* CompleteClass */
    override def injectCss(): Unit = js.native
    
    /* CompleteClass */
    override def invoke(action: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def listen(): Unit = js.native
    
    /* CompleteClass */
    override val menuInterface: MenuInterface = js.native
    
    /* CompleteClass */
    override def onChange(updateSession: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def read(): Unit = js.native
    
    /* CompleteClass */
    override def resetIfDefined(src: Any, dest: Any, prop: String): Unit = js.native
    
    /* CompleteClass */
    override def runHotkey(name: String): Unit = js.native
    
    /* CompleteClass */
    override def saveSession(): Unit = js.native
    
    /* CompleteClass */
    override def setSessionFromCache(): Unit = js.native
    
    /* CompleteClass */
    override def speechToText(): Unit = js.native
    
    /* CompleteClass */
    override def textToSpeech(text: String): Unit = js.native
    
    /* CompleteClass */
    override def toggleMenu(): Unit = js.native
  }
  @JSImport("accessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @deprecated */
  /* static member */
  inline def init(): Accessibility = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Accessibility]
  inline def init(options: Options): Accessibility = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Accessibility]
  
  /**
    * Adaptive Accessibility Menu
    */
  trait Accessibility extends StObject {
    
    def alterTextSpace(isIncrease: Boolean): Unit
    
    def build(): Unit
    
    def deleteOppositesIfDefined(options: Options): Options
    
    def destroy(): Unit
    
    def disabledUnsupportedFeatures(): Unit
    
    def fontFallback(): Unit
    
    def initFontSize(): Unit
    
    def injectCss(): Unit
    
    def invoke(action: js.Function0[Unit]): Unit
    
    def listen(): Unit
    
    val menuInterface: MenuInterface
    
    def onChange(updateSession: Boolean): Unit
    
    def read(): Unit
    
    def resetIfDefined(src: Any, dest: Any, prop: String): Unit
    
    def runHotkey(name: String): Unit
    
    def saveSession(): Unit
    
    def setSessionFromCache(): Unit
    
    def speechToText(): Unit
    
    def textToSpeech(text: String): Unit
    
    def toggleMenu(): Unit
  }
  object Accessibility {
    
    inline def apply(
      alterTextSpace: Boolean => Callback,
      build: Callback,
      deleteOppositesIfDefined: Options => Options,
      destroy: Callback,
      disabledUnsupportedFeatures: Callback,
      fontFallback: Callback,
      initFontSize: Callback,
      injectCss: Callback,
      invoke: js.Function0[Unit] => Callback,
      listen: Callback,
      menuInterface: MenuInterface,
      onChange: Boolean => Callback,
      read: Callback,
      resetIfDefined: (Any, Any, String) => Callback,
      runHotkey: String => Callback,
      saveSession: Callback,
      setSessionFromCache: Callback,
      speechToText: Callback,
      textToSpeech: String => Callback,
      toggleMenu: Callback
    ): Accessibility = {
      val __obj = js.Dynamic.literal(alterTextSpace = js.Any.fromFunction1((t0: Boolean) => alterTextSpace(t0).runNow()), build = build.toJsFn, deleteOppositesIfDefined = js.Any.fromFunction1(deleteOppositesIfDefined), destroy = destroy.toJsFn, disabledUnsupportedFeatures = disabledUnsupportedFeatures.toJsFn, fontFallback = fontFallback.toJsFn, initFontSize = initFontSize.toJsFn, injectCss = injectCss.toJsFn, invoke = js.Any.fromFunction1((t0: js.Function0[Unit]) => invoke(t0).runNow()), listen = listen.toJsFn, menuInterface = menuInterface.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Boolean) => onChange(t0).runNow()), read = read.toJsFn, resetIfDefined = js.Any.fromFunction3((t0: Any, t1: Any, t2: String) => (resetIfDefined(t0, t1, t2)).runNow()), runHotkey = js.Any.fromFunction1((t0: String) => runHotkey(t0).runNow()), saveSession = saveSession.toJsFn, setSessionFromCache = setSessionFromCache.toJsFn, speechToText = speechToText.toJsFn, textToSpeech = js.Any.fromFunction1((t0: String) => textToSpeech(t0).runNow()), toggleMenu = toggleMenu.toJsFn)
      __obj.asInstanceOf[Accessibility]
    }
    
    extension [Self <: Accessibility](x: Self) {
      
      inline def setAlterTextSpace(value: Boolean => Callback): Self = StObject.set(x, "alterTextSpace", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setBuild(value: Callback): Self = StObject.set(x, "build", value.toJsFn)
      
      inline def setDeleteOppositesIfDefined(value: Options => Options): Self = StObject.set(x, "deleteOppositesIfDefined", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisabledUnsupportedFeatures(value: Callback): Self = StObject.set(x, "disabledUnsupportedFeatures", value.toJsFn)
      
      inline def setFontFallback(value: Callback): Self = StObject.set(x, "fontFallback", value.toJsFn)
      
      inline def setInitFontSize(value: Callback): Self = StObject.set(x, "initFontSize", value.toJsFn)
      
      inline def setInjectCss(value: Callback): Self = StObject.set(x, "injectCss", value.toJsFn)
      
      inline def setInvoke(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "invoke", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setListen(value: Callback): Self = StObject.set(x, "listen", value.toJsFn)
      
      inline def setMenuInterface(value: MenuInterface): Self = StObject.set(x, "menuInterface", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setRead(value: Callback): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setResetIfDefined(value: (Any, Any, String) => Callback): Self = StObject.set(x, "resetIfDefined", js.Any.fromFunction3((t0: Any, t1: Any, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setRunHotkey(value: String => Callback): Self = StObject.set(x, "runHotkey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSaveSession(value: Callback): Self = StObject.set(x, "saveSession", value.toJsFn)
      
      inline def setSetSessionFromCache(value: Callback): Self = StObject.set(x, "setSessionFromCache", value.toJsFn)
      
      inline def setSpeechToText(value: Callback): Self = StObject.set(x, "speechToText", value.toJsFn)
      
      inline def setTextToSpeech(value: String => Callback): Self = StObject.set(x, "textToSpeech", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setToggleMenu(value: Callback): Self = StObject.set(x, "toggleMenu", value.toJsFn)
    }
  }
  
  trait Dimensions extends StObject {
    
    var height: js.UndefOr[SizeOrPosition] = js.undefined
    
    var width: js.UndefOr[SizeOrPosition] = js.undefined
  }
  object Dimensions {
    
    inline def apply(): Dimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setHeight(value: SizeOrPosition): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: SizeOrPosition): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type HotKeyDefinition = js.Tuple3[Double, Double, String]
  
  trait HotKeys extends StObject {
    
    /** @default false */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var helpTitles: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[StringDictionary[HotKeyDefinition]] = js.undefined
  }
  object HotKeys {
    
    inline def apply(): HotKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotKeys]
    }
    
    extension [Self <: HotKeys](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHelpTitles(value: Boolean): Self = StObject.set(x, "helpTitles", value.asInstanceOf[js.Any])
      
      inline def setHelpTitlesUndefined: Self = StObject.set(x, "helpTitles", js.undefined)
      
      inline def setKeys(value: StringDictionary[HotKeyDefinition]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
  
  trait Icon extends StObject {
    
    /** @default '#4054b2' */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var circularBorder: js.UndefOr[Boolean] = js.undefined
    
    /** @default '#fff' */
    var color: js.UndefOr[String] = js.undefined
    
    var dimensions: js.UndefOr[Dimensions] = js.undefined
    
    /** @default 'Material Icons' */
    var fontClass: js.UndefOr[String] = js.undefined
    
    /** @default ['https://fonts.googleapis.com/icon?family=Material+Icons'] */
    var fontFaceSrc: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @default 'Material Icons' */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** @default 'accessible' */
    var img: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    /** @default false */
    var useEmojis: js.UndefOr[Boolean] = js.undefined
    
    /** @default '9999' */
    var zIndex: js.UndefOr[String | Double] = js.undefined
  }
  object Icon {
    
    inline def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularBorder(value: Boolean): Self = StObject.set(x, "circularBorder", value.asInstanceOf[js.Any])
      
      inline def setCircularBorderUndefined: Self = StObject.set(x, "circularBorder", js.undefined)
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setFontClass(value: String): Self = StObject.set(x, "fontClass", value.asInstanceOf[js.Any])
      
      inline def setFontClassUndefined: Self = StObject.set(x, "fontClass", js.undefined)
      
      inline def setFontFaceSrc(value: js.Array[String]): Self = StObject.set(x, "fontFaceSrc", value.asInstanceOf[js.Any])
      
      inline def setFontFaceSrcUndefined: Self = StObject.set(x, "fontFaceSrc", js.undefined)
      
      inline def setFontFaceSrcVarargs(value: String*): Self = StObject.set(x, "fontFaceSrc", js.Array(value*))
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setUseEmojis(value: Boolean): Self = StObject.set(x, "useEmojis", value.asInstanceOf[js.Any])
      
      inline def setUseEmojisUndefined: Self = StObject.set(x, "useEmojis", js.undefined)
      
      inline def setZIndex(value: String | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Labels extends StObject {
    
    /** @default 'gray hues' */
    var bigCursor: js.UndefOr[String] = js.undefined
    
    /** @default 'Close' */
    var closeTitle: js.UndefOr[String] = js.undefined
    
    /** @default 'decrease text size' */
    var decreaseText: js.UndefOr[String] = js.undefined
    
    /** @default 'decrease text spacing' */
    var decreaseTextSpacing: js.UndefOr[String] = js.undefined
    
    /** @default 'gray hues' */
    var grayHues: js.UndefOr[String] = js.undefined
    
    /** @default 'increase text size' */
    var increaseText: js.UndefOr[String] = js.undefined
    
    /** @default 'increase text spacing' */
    var increaseTextSpacing: js.UndefOr[String] = js.undefined
    
    /** @default 'invert colors' */
    var invertColors: js.UndefOr[String] = js.undefined
    
    /** @default 'Accessibility Options' */
    var menuTitle: js.UndefOr[String] = js.undefined
    
    /** @default 'reading guide' */
    var readingGuide: js.UndefOr[String] = js.undefined
    
    /** @default 'Reset' */
    var resetTitle: js.UndefOr[String] = js.undefined
    
    /** @default 'speech to text' */
    var speechToText: js.UndefOr[String] = js.undefined
    
    /** @default 'underline links' */
    var textToSpeech: js.UndefOr[String] = js.undefined
    
    /** @default 'underline links' */
    var underlineLinks: js.UndefOr[String] = js.undefined
  }
  object Labels {
    
    inline def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    extension [Self <: Labels](x: Self) {
      
      inline def setBigCursor(value: String): Self = StObject.set(x, "bigCursor", value.asInstanceOf[js.Any])
      
      inline def setBigCursorUndefined: Self = StObject.set(x, "bigCursor", js.undefined)
      
      inline def setCloseTitle(value: String): Self = StObject.set(x, "closeTitle", value.asInstanceOf[js.Any])
      
      inline def setCloseTitleUndefined: Self = StObject.set(x, "closeTitle", js.undefined)
      
      inline def setDecreaseText(value: String): Self = StObject.set(x, "decreaseText", value.asInstanceOf[js.Any])
      
      inline def setDecreaseTextSpacing(value: String): Self = StObject.set(x, "decreaseTextSpacing", value.asInstanceOf[js.Any])
      
      inline def setDecreaseTextSpacingUndefined: Self = StObject.set(x, "decreaseTextSpacing", js.undefined)
      
      inline def setDecreaseTextUndefined: Self = StObject.set(x, "decreaseText", js.undefined)
      
      inline def setGrayHues(value: String): Self = StObject.set(x, "grayHues", value.asInstanceOf[js.Any])
      
      inline def setGrayHuesUndefined: Self = StObject.set(x, "grayHues", js.undefined)
      
      inline def setIncreaseText(value: String): Self = StObject.set(x, "increaseText", value.asInstanceOf[js.Any])
      
      inline def setIncreaseTextSpacing(value: String): Self = StObject.set(x, "increaseTextSpacing", value.asInstanceOf[js.Any])
      
      inline def setIncreaseTextSpacingUndefined: Self = StObject.set(x, "increaseTextSpacing", js.undefined)
      
      inline def setIncreaseTextUndefined: Self = StObject.set(x, "increaseText", js.undefined)
      
      inline def setInvertColors(value: String): Self = StObject.set(x, "invertColors", value.asInstanceOf[js.Any])
      
      inline def setInvertColorsUndefined: Self = StObject.set(x, "invertColors", js.undefined)
      
      inline def setMenuTitle(value: String): Self = StObject.set(x, "menuTitle", value.asInstanceOf[js.Any])
      
      inline def setMenuTitleUndefined: Self = StObject.set(x, "menuTitle", js.undefined)
      
      inline def setReadingGuide(value: String): Self = StObject.set(x, "readingGuide", value.asInstanceOf[js.Any])
      
      inline def setReadingGuideUndefined: Self = StObject.set(x, "readingGuide", js.undefined)
      
      inline def setResetTitle(value: String): Self = StObject.set(x, "resetTitle", value.asInstanceOf[js.Any])
      
      inline def setResetTitleUndefined: Self = StObject.set(x, "resetTitle", js.undefined)
      
      inline def setSpeechToText(value: String): Self = StObject.set(x, "speechToText", value.asInstanceOf[js.Any])
      
      inline def setSpeechToTextUndefined: Self = StObject.set(x, "speechToText", js.undefined)
      
      inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
      
      inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
      
      inline def setUnderlineLinks(value: String): Self = StObject.set(x, "underlineLinks", value.asInstanceOf[js.Any])
      
      inline def setUnderlineLinksUndefined: Self = StObject.set(x, "underlineLinks", js.undefined)
    }
  }
  
  @js.native
  trait MenuInterface extends StObject {
    
    def bigCursor(): Unit = js.native
    def bigCursor(destroy: Boolean): Unit = js.native
    
    def decreaseText(): Unit = js.native
    
    def decreaseTextSpacing(): Unit = js.native
    
    def grayHues(): Unit = js.native
    def grayHues(destroy: Boolean): Unit = js.native
    
    def increaseText(): Unit = js.native
    
    def increaseTextSpacing(): Unit = js.native
    
    def invertColors(): Unit = js.native
    def invertColors(destroy: Boolean): Unit = js.native
    
    def readingGuide(): Unit = js.native
    def readingGuide(destroy: Boolean): Unit = js.native
    
    def speechToText(): Unit = js.native
    def speechToText(destroy: Boolean): Unit = js.native
    
    def textToSpeech(): Unit = js.native
    def textToSpeech(destroy: Boolean): Unit = js.native
    
    def underlineLinks(): Unit = js.native
    def underlineLinks(destroy: Boolean): Unit = js.native
  }
  
  trait Modules extends StObject {
    
    /** @default true */
    var bigCursor: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var decreaseText: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var decreaseTextSpacing: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var grayHues: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var increaseText: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var increaseTextSpacing: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var invertColors: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var readingGuide: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var speechToText: js.UndefOr[`true`] = js.undefined
    
    /** @default true */
    var textToSpeech: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var underlineLinks: js.UndefOr[Boolean] = js.undefined
  }
  object Modules {
    
    inline def apply(): Modules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modules]
    }
    
    extension [Self <: Modules](x: Self) {
      
      inline def setBigCursor(value: Boolean): Self = StObject.set(x, "bigCursor", value.asInstanceOf[js.Any])
      
      inline def setBigCursorUndefined: Self = StObject.set(x, "bigCursor", js.undefined)
      
      inline def setDecreaseText(value: Boolean): Self = StObject.set(x, "decreaseText", value.asInstanceOf[js.Any])
      
      inline def setDecreaseTextSpacing(value: Boolean): Self = StObject.set(x, "decreaseTextSpacing", value.asInstanceOf[js.Any])
      
      inline def setDecreaseTextSpacingUndefined: Self = StObject.set(x, "decreaseTextSpacing", js.undefined)
      
      inline def setDecreaseTextUndefined: Self = StObject.set(x, "decreaseText", js.undefined)
      
      inline def setGrayHues(value: Boolean): Self = StObject.set(x, "grayHues", value.asInstanceOf[js.Any])
      
      inline def setGrayHuesUndefined: Self = StObject.set(x, "grayHues", js.undefined)
      
      inline def setIncreaseText(value: Boolean): Self = StObject.set(x, "increaseText", value.asInstanceOf[js.Any])
      
      inline def setIncreaseTextSpacing(value: Boolean): Self = StObject.set(x, "increaseTextSpacing", value.asInstanceOf[js.Any])
      
      inline def setIncreaseTextSpacingUndefined: Self = StObject.set(x, "increaseTextSpacing", js.undefined)
      
      inline def setIncreaseTextUndefined: Self = StObject.set(x, "increaseText", js.undefined)
      
      inline def setInvertColors(value: Boolean): Self = StObject.set(x, "invertColors", value.asInstanceOf[js.Any])
      
      inline def setInvertColorsUndefined: Self = StObject.set(x, "invertColors", js.undefined)
      
      inline def setReadingGuide(value: Boolean): Self = StObject.set(x, "readingGuide", value.asInstanceOf[js.Any])
      
      inline def setReadingGuideUndefined: Self = StObject.set(x, "readingGuide", js.undefined)
      
      inline def setSpeechToText(value: `true`): Self = StObject.set(x, "speechToText", value.asInstanceOf[js.Any])
      
      inline def setSpeechToTextUndefined: Self = StObject.set(x, "speechToText", js.undefined)
      
      inline def setTextToSpeech(value: Boolean): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
      
      inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
      
      inline def setUnderlineLinks(value: Boolean): Self = StObject.set(x, "underlineLinks", value.asInstanceOf[js.Any])
      
      inline def setUnderlineLinksUndefined: Self = StObject.set(x, "underlineLinks", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var animations: js.UndefOr[Buttons] = js.undefined
    
    var buttons: js.UndefOr[Font] = js.undefined
    
    var guide: js.UndefOr[CBackground] = js.undefined
    
    var hotkeys: js.UndefOr[HotKeys] = js.undefined
    
    var icon: js.UndefOr[Icon] = js.undefined
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var menu: js.UndefOr[typingsJapgolly.accessibility.anon.Dimensions] = js.undefined
    
    var modules: js.UndefOr[Modules] = js.undefined
    
    var session: js.UndefOr[Persistent] = js.undefined
    
    /** @default 'en-US' */
    var speechToTextLang: js.UndefOr[String] = js.undefined
    
    /** @default true */
    var textEmlMode: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var textPixelMode: js.UndefOr[Boolean] = js.undefined
    
    /** @default 'en-US' */
    var textToSpeechLang: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimations(value: Buttons): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      inline def setButtons(value: Font): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setGuide(value: CBackground): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setHotkeys(value: HotKeys): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      inline def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMenu(value: typingsJapgolly.accessibility.anon.Dimensions): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setModules(value: Modules): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setSession(value: Persistent): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setSpeechToTextLang(value: String): Self = StObject.set(x, "speechToTextLang", value.asInstanceOf[js.Any])
      
      inline def setSpeechToTextLangUndefined: Self = StObject.set(x, "speechToTextLang", js.undefined)
      
      inline def setTextEmlMode(value: Boolean): Self = StObject.set(x, "textEmlMode", value.asInstanceOf[js.Any])
      
      inline def setTextEmlModeUndefined: Self = StObject.set(x, "textEmlMode", js.undefined)
      
      inline def setTextPixelMode(value: Boolean): Self = StObject.set(x, "textPixelMode", value.asInstanceOf[js.Any])
      
      inline def setTextPixelModeUndefined: Self = StObject.set(x, "textPixelMode", js.undefined)
      
      inline def setTextToSpeechLang(value: String): Self = StObject.set(x, "textToSpeechLang", value.asInstanceOf[js.Any])
      
      inline def setTextToSpeechLangUndefined: Self = StObject.set(x, "textToSpeechLang", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var bottom: js.UndefOr[SizeOrPosition] = js.undefined
    
    var left: js.UndefOr[SizeOrPosition] = js.undefined
    
    var right: js.UndefOr[SizeOrPosition] = js.undefined
    
    var top: js.UndefOr[SizeOrPosition] = js.undefined
    
    var `type`: String
  }
  object Position {
    
    inline def apply(`type`: String): Position = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setBottom(value: SizeOrPosition): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: SizeOrPosition): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: SizeOrPosition): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: SizeOrPosition): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeOrPosition extends StObject {
    
    var size: Double | String
    
    var units: js.UndefOr[String] = js.undefined
  }
  object SizeOrPosition {
    
    inline def apply(size: Double | String): SizeOrPosition = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeOrPosition]
    }
    
    extension [Self <: SizeOrPosition](x: Self) {
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
}
