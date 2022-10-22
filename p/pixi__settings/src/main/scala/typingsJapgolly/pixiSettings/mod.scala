package typingsJapgolly.pixiSettings

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import typingsJapgolly.pixiConstants.mod.ENV
import typingsJapgolly.pixiConstants.mod.GC_MODES
import typingsJapgolly.pixiConstants.mod.MIPMAP_MODES
import typingsJapgolly.pixiConstants.mod.MSAA_QUALITY
import typingsJapgolly.pixiConstants.mod.PRECISION
import typingsJapgolly.pixiConstants.mod.SCALE_MODES
import typingsJapgolly.pixiConstants.mod.WRAP_MODES
import typingsJapgolly.pixiSettings.anon.Blackberry
import typingsJapgolly.pixiSettings.anon.Device
import typingsJapgolly.pixiSettings.anon.Phone
import typingsJapgolly.pixiSettings.anon.TypeofWebGLRenderingConte
import typingsJapgolly.pixiSettings.anon.UserAgent
import typingsJapgolly.pixiSettings.pixiSettingsStrings.notMultiplied
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/settings", "BrowserAdapter")
  @js.native
  val BrowserAdapter: IAdapter = js.native
  
  @JSImport("@pixi/settings", "isMobile")
  @js.native
  val isMobile: isMobileResult = js.native
  
  @JSImport("@pixi/settings", "settings")
  @js.native
  val settings: ISettings = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pixiSettings.pixiSettingsStrings.`2d`
    - typingsJapgolly.pixiSettings.pixiSettingsStrings.webgl
    - typingsJapgolly.pixiSettings.pixiSettingsStrings.`experimental-webgl`
    - typingsJapgolly.pixiSettings.pixiSettingsStrings.webgl2
  */
  trait ContextIds extends StObject
  object ContextIds {
    
    inline def `2d`: typingsJapgolly.pixiSettings.pixiSettingsStrings.`2d` = "2d".asInstanceOf[typingsJapgolly.pixiSettings.pixiSettingsStrings.`2d`]
    
    inline def `experimental-webgl`: typingsJapgolly.pixiSettings.pixiSettingsStrings.`experimental-webgl` = "experimental-webgl".asInstanceOf[typingsJapgolly.pixiSettings.pixiSettingsStrings.`experimental-webgl`]
    
    inline def webgl: typingsJapgolly.pixiSettings.pixiSettingsStrings.webgl = "webgl".asInstanceOf[typingsJapgolly.pixiSettings.pixiSettingsStrings.webgl]
    
    inline def webgl2: typingsJapgolly.pixiSettings.pixiSettingsStrings.webgl2 = "webgl2".asInstanceOf[typingsJapgolly.pixiSettings.pixiSettingsStrings.webgl2]
  }
  
  @js.native
  trait IAdapter extends StObject {
    
    /** Returns a canvas object that can be used to create a webgl context. */
    def createCanvas(): HTMLCanvasElement = js.native
    def createCanvas(width: Double): HTMLCanvasElement = js.native
    def createCanvas(width: Double, height: Double): HTMLCanvasElement = js.native
    def createCanvas(width: Unit, height: Double): HTMLCanvasElement = js.native
    
    def fetch(url: RequestInfo): js.Promise[Response] = js.native
    def fetch(url: RequestInfo, options: RequestInit): js.Promise[Response] = js.native
    
    /** Returns the current base URL For browser environments this is either the document.baseURI or window.location.href */
    def getBaseUrl(): String = js.native
    
    /** Returns a partial implementation of the browsers window.navigator */
    def getNavigator(): UserAgent = js.native
    
    /** Returns a webgl rendering context. */
    def getWebGLRenderingContext(): TypeofWebGLRenderingConte = js.native
  }
  
  trait IRenderOptions extends StObject {
    
    var antialias: Boolean
    
    var autoDensity: Boolean
    
    var backgroundAlpha: Double
    
    var backgroundColor: Double
    
    var clearBeforeRender: Boolean
    
    var height: Double
    
    var legacy: Boolean
    
    var preserveDrawingBuffer: Boolean
    
    var useContextAlpha: Boolean | notMultiplied
    
    var view: HTMLCanvasElement
    
    var width: Double
  }
  object IRenderOptions {
    
    inline def apply(
      antialias: Boolean,
      autoDensity: Boolean,
      backgroundAlpha: Double,
      backgroundColor: Double,
      clearBeforeRender: Boolean,
      height: Double,
      legacy: Boolean,
      preserveDrawingBuffer: Boolean,
      useContextAlpha: Boolean | notMultiplied,
      view: HTMLCanvasElement,
      width: Double
    ): IRenderOptions = {
      val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], autoDensity = autoDensity.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], legacy = legacy.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], useContextAlpha = useContextAlpha.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderOptions]
    }
    
    extension [Self <: IRenderOptions](x: Self) {
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setUseContextAlpha(value: Boolean | notMultiplied): Self = StObject.set(x, "useContextAlpha", value.asInstanceOf[js.Any])
      
      inline def setView(value: HTMLCanvasElement): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettings extends StObject {
    
    var ADAPTER: IAdapter
    
    var ANISOTROPIC_LEVEL: Double
    
    var CAN_UPLOAD_SAME_BUFFER: Boolean
    
    var CREATE_IMAGE_BITMAP: Boolean
    
    var FAIL_IF_MAJOR_PERFORMANCE_CAVEAT: js.UndefOr[Boolean] = js.undefined
    
    var FILTER_MULTISAMPLE: MSAA_QUALITY
    
    var FILTER_RESOLUTION: Double
    
    var GC_MAX_CHECK_COUNT: Double
    
    var GC_MAX_IDLE: Double
    
    var GC_MODE: GC_MODES
    
    var MESH_CANVAS_PADDING: js.UndefOr[Double] = js.undefined
    
    var MIPMAP_TEXTURES: MIPMAP_MODES
    
    var PRECISION_FRAGMENT: PRECISION
    
    var PRECISION_VERTEX: PRECISION
    
    var PREFER_ENV: js.UndefOr[ENV] = js.undefined
    
    var RENDER_OPTIONS: IRenderOptions
    
    var RESOLUTION: Double
    
    var RETINA_PREFIX: js.UndefOr[js.RegExp] = js.undefined
    
    var ROUND_PIXELS: Boolean
    
    var SCALE_MODE: SCALE_MODES
    
    var SORTABLE_CHILDREN: js.UndefOr[Boolean] = js.undefined
    
    var SPRITE_BATCH_SIZE: Double
    
    var SPRITE_MAX_TEXTURES: Double
    
    var STRICT_TEXTURE_CACHE: js.UndefOr[Boolean] = js.undefined
    
    var TARGET_FPMS: js.UndefOr[Double] = js.undefined
    
    var UPLOADS_PER_FRAME: js.UndefOr[Double] = js.undefined
    
    var WRAP_MODE: WRAP_MODES
  }
  object ISettings {
    
    inline def apply(
      ADAPTER: IAdapter,
      ANISOTROPIC_LEVEL: Double,
      CAN_UPLOAD_SAME_BUFFER: Boolean,
      CREATE_IMAGE_BITMAP: Boolean,
      FILTER_MULTISAMPLE: MSAA_QUALITY,
      FILTER_RESOLUTION: Double,
      GC_MAX_CHECK_COUNT: Double,
      GC_MAX_IDLE: Double,
      GC_MODE: GC_MODES,
      MIPMAP_TEXTURES: MIPMAP_MODES,
      PRECISION_FRAGMENT: PRECISION,
      PRECISION_VERTEX: PRECISION,
      RENDER_OPTIONS: IRenderOptions,
      RESOLUTION: Double,
      ROUND_PIXELS: Boolean,
      SCALE_MODE: SCALE_MODES,
      SPRITE_BATCH_SIZE: Double,
      SPRITE_MAX_TEXTURES: Double,
      WRAP_MODE: WRAP_MODES
    ): ISettings = {
      val __obj = js.Dynamic.literal(ADAPTER = ADAPTER.asInstanceOf[js.Any], ANISOTROPIC_LEVEL = ANISOTROPIC_LEVEL.asInstanceOf[js.Any], CAN_UPLOAD_SAME_BUFFER = CAN_UPLOAD_SAME_BUFFER.asInstanceOf[js.Any], CREATE_IMAGE_BITMAP = CREATE_IMAGE_BITMAP.asInstanceOf[js.Any], FILTER_MULTISAMPLE = FILTER_MULTISAMPLE.asInstanceOf[js.Any], FILTER_RESOLUTION = FILTER_RESOLUTION.asInstanceOf[js.Any], GC_MAX_CHECK_COUNT = GC_MAX_CHECK_COUNT.asInstanceOf[js.Any], GC_MAX_IDLE = GC_MAX_IDLE.asInstanceOf[js.Any], GC_MODE = GC_MODE.asInstanceOf[js.Any], MIPMAP_TEXTURES = MIPMAP_TEXTURES.asInstanceOf[js.Any], PRECISION_FRAGMENT = PRECISION_FRAGMENT.asInstanceOf[js.Any], PRECISION_VERTEX = PRECISION_VERTEX.asInstanceOf[js.Any], RENDER_OPTIONS = RENDER_OPTIONS.asInstanceOf[js.Any], RESOLUTION = RESOLUTION.asInstanceOf[js.Any], ROUND_PIXELS = ROUND_PIXELS.asInstanceOf[js.Any], SCALE_MODE = SCALE_MODE.asInstanceOf[js.Any], SPRITE_BATCH_SIZE = SPRITE_BATCH_SIZE.asInstanceOf[js.Any], SPRITE_MAX_TEXTURES = SPRITE_MAX_TEXTURES.asInstanceOf[js.Any], WRAP_MODE = WRAP_MODE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettings]
    }
    
    extension [Self <: ISettings](x: Self) {
      
      inline def setADAPTER(value: IAdapter): Self = StObject.set(x, "ADAPTER", value.asInstanceOf[js.Any])
      
      inline def setANISOTROPIC_LEVEL(value: Double): Self = StObject.set(x, "ANISOTROPIC_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setCAN_UPLOAD_SAME_BUFFER(value: Boolean): Self = StObject.set(x, "CAN_UPLOAD_SAME_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setCREATE_IMAGE_BITMAP(value: Boolean): Self = StObject.set(x, "CREATE_IMAGE_BITMAP", value.asInstanceOf[js.Any])
      
      inline def setFAIL_IF_MAJOR_PERFORMANCE_CAVEAT(value: Boolean): Self = StObject.set(x, "FAIL_IF_MAJOR_PERFORMANCE_CAVEAT", value.asInstanceOf[js.Any])
      
      inline def setFAIL_IF_MAJOR_PERFORMANCE_CAVEATUndefined: Self = StObject.set(x, "FAIL_IF_MAJOR_PERFORMANCE_CAVEAT", js.undefined)
      
      inline def setFILTER_MULTISAMPLE(value: MSAA_QUALITY): Self = StObject.set(x, "FILTER_MULTISAMPLE", value.asInstanceOf[js.Any])
      
      inline def setFILTER_RESOLUTION(value: Double): Self = StObject.set(x, "FILTER_RESOLUTION", value.asInstanceOf[js.Any])
      
      inline def setGC_MAX_CHECK_COUNT(value: Double): Self = StObject.set(x, "GC_MAX_CHECK_COUNT", value.asInstanceOf[js.Any])
      
      inline def setGC_MAX_IDLE(value: Double): Self = StObject.set(x, "GC_MAX_IDLE", value.asInstanceOf[js.Any])
      
      inline def setGC_MODE(value: GC_MODES): Self = StObject.set(x, "GC_MODE", value.asInstanceOf[js.Any])
      
      inline def setMESH_CANVAS_PADDING(value: Double): Self = StObject.set(x, "MESH_CANVAS_PADDING", value.asInstanceOf[js.Any])
      
      inline def setMESH_CANVAS_PADDINGUndefined: Self = StObject.set(x, "MESH_CANVAS_PADDING", js.undefined)
      
      inline def setMIPMAP_TEXTURES(value: MIPMAP_MODES): Self = StObject.set(x, "MIPMAP_TEXTURES", value.asInstanceOf[js.Any])
      
      inline def setPRECISION_FRAGMENT(value: PRECISION): Self = StObject.set(x, "PRECISION_FRAGMENT", value.asInstanceOf[js.Any])
      
      inline def setPRECISION_VERTEX(value: PRECISION): Self = StObject.set(x, "PRECISION_VERTEX", value.asInstanceOf[js.Any])
      
      inline def setPREFER_ENV(value: ENV): Self = StObject.set(x, "PREFER_ENV", value.asInstanceOf[js.Any])
      
      inline def setPREFER_ENVUndefined: Self = StObject.set(x, "PREFER_ENV", js.undefined)
      
      inline def setRENDER_OPTIONS(value: IRenderOptions): Self = StObject.set(x, "RENDER_OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setRESOLUTION(value: Double): Self = StObject.set(x, "RESOLUTION", value.asInstanceOf[js.Any])
      
      inline def setRETINA_PREFIX(value: js.RegExp): Self = StObject.set(x, "RETINA_PREFIX", value.asInstanceOf[js.Any])
      
      inline def setRETINA_PREFIXUndefined: Self = StObject.set(x, "RETINA_PREFIX", js.undefined)
      
      inline def setROUND_PIXELS(value: Boolean): Self = StObject.set(x, "ROUND_PIXELS", value.asInstanceOf[js.Any])
      
      inline def setSCALE_MODE(value: SCALE_MODES): Self = StObject.set(x, "SCALE_MODE", value.asInstanceOf[js.Any])
      
      inline def setSORTABLE_CHILDREN(value: Boolean): Self = StObject.set(x, "SORTABLE_CHILDREN", value.asInstanceOf[js.Any])
      
      inline def setSORTABLE_CHILDRENUndefined: Self = StObject.set(x, "SORTABLE_CHILDREN", js.undefined)
      
      inline def setSPRITE_BATCH_SIZE(value: Double): Self = StObject.set(x, "SPRITE_BATCH_SIZE", value.asInstanceOf[js.Any])
      
      inline def setSPRITE_MAX_TEXTURES(value: Double): Self = StObject.set(x, "SPRITE_MAX_TEXTURES", value.asInstanceOf[js.Any])
      
      inline def setSTRICT_TEXTURE_CACHE(value: Boolean): Self = StObject.set(x, "STRICT_TEXTURE_CACHE", value.asInstanceOf[js.Any])
      
      inline def setSTRICT_TEXTURE_CACHEUndefined: Self = StObject.set(x, "STRICT_TEXTURE_CACHE", js.undefined)
      
      inline def setTARGET_FPMS(value: Double): Self = StObject.set(x, "TARGET_FPMS", value.asInstanceOf[js.Any])
      
      inline def setTARGET_FPMSUndefined: Self = StObject.set(x, "TARGET_FPMS", js.undefined)
      
      inline def setUPLOADS_PER_FRAME(value: Double): Self = StObject.set(x, "UPLOADS_PER_FRAME", value.asInstanceOf[js.Any])
      
      inline def setUPLOADS_PER_FRAMEUndefined: Self = StObject.set(x, "UPLOADS_PER_FRAME", js.undefined)
      
      inline def setWRAP_MODE(value: WRAP_MODES): Self = StObject.set(x, "WRAP_MODE", value.asInstanceOf[js.Any])
    }
  }
  
  trait isMobileResult extends StObject {
    
    var amazon: Phone
    
    var android: Phone
    
    var any: Boolean
    
    var apple: Device
    
    var other: Blackberry
    
    var phone: Boolean
    
    var tablet: Boolean
    
    var windows: Phone
  }
  object isMobileResult {
    
    inline def apply(
      amazon: Phone,
      android: Phone,
      any: Boolean,
      apple: Device,
      other: Blackberry,
      phone: Boolean,
      tablet: Boolean,
      windows: Phone
    ): isMobileResult = {
      val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.asInstanceOf[isMobileResult]
    }
    
    extension [Self <: isMobileResult](x: Self) {
      
      inline def setAmazon(value: Phone): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
      
      inline def setAndroid(value: Phone): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAny(value: Boolean): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setApple(value: Device): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
      
      inline def setOther(value: Blackberry): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: Phone): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
}
