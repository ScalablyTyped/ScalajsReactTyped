package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiLoaders.anon.CrossOrigin
import typingsJapgolly.pixiLoaders.mod.LoaderResource.LOAD_TYPE
import typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE
import typingsJapgolly.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "LoaderResource")
@js.native
open class LoaderResource protected ()
  extends typingsJapgolly.pixiLoaders.mod.LoaderResource {
  /**
    * @param {string} name - The name of the resource to load.
    * @param {string|string[]} url - The url for this resource, for audio/video loads you can pass
    *      an array of sources.
    * @param {object} [options] - The options for the load.
    * @param {string|boolean} [options.crossOrigin] - Is this request cross-origin? Default is to
    *      determine automatically.
    * @param {number} [options.timeout=0] - A timeout in milliseconds for the load. If the load takes
    *      longer than this time it is cancelled and the load is considered a failure. If this value is
    *      set to `0` then there is no explicit timeout.
    * @param {PIXI.LoaderResource.LOAD_TYPE} [options.loadType=LOAD_TYPE.XHR] - How should this resource
    *      be loaded?
    * @param {PIXI.LoaderResource.XHR_RESPONSE_TYPE} [options.xhrType=XHR_RESPONSE_TYPE.DEFAULT] - How
    *      should the data being loaded be interpreted when using XHR?
    * @param {PIXI.LoaderResource.IMetadata} [options.metadata] - Extra configuration for middleware
    *      and the Resource object.
    */
  def this(name: String, url: String) = this()
  def this(name: String, url: js.Array[String]) = this()
  def this(name: String, url: String, options: CrossOrigin) = this()
  def this(name: String, url: js.Array[String], options: CrossOrigin) = this()
}
/* static members */
object LoaderResource {
  
  @JSImport("pixi.js", "LoaderResource")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "LoaderResource.EMPTY_GIF")
  @js.native
  val EMPTY_GIF: /* "data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==" */ String = js.native
  
  @JSImport("pixi.js", "LoaderResource.LOAD_TYPE")
  @js.native
  object LOAD_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.pixiLoaders.mod.LoaderResource.LOAD_TYPE & Double] = js.native
    
    /* 3 */ val AUDIO: typingsJapgolly.pixiLoaders.mod.LoaderResource.LOAD_TYPE.AUDIO & Double = js.native
    
    /* 2 */ val IMAGE: typingsJapgolly.pixiLoaders.mod.LoaderResource.LOAD_TYPE.IMAGE & Double = js.native
    
    /* 4 */ val VIDEO: typingsJapgolly.pixiLoaders.mod.LoaderResource.LOAD_TYPE.VIDEO & Double = js.native
    
    /* 1 */ val XHR: typingsJapgolly.pixiLoaders.mod.LoaderResource.LOAD_TYPE.XHR & Double = js.native
  }
  
  @JSImport("pixi.js", "LoaderResource.STATUS_FLAGS")
  @js.native
  object STATUS_FLAGS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.pixiLoaders.mod.LoaderResource.STATUS_FLAGS & Double] = js.native
    
    /* 2 */ val COMPLETE: typingsJapgolly.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.COMPLETE & Double = js.native
    
    /* 1 */ val DATA_URL: typingsJapgolly.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.DATA_URL & Double = js.native
    
    /* 4 */ val LOADING: typingsJapgolly.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.LOADING & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.pixiLoaders.mod.LoaderResource.STATUS_FLAGS.NONE & Double = js.native
  }
  
  @JSImport("pixi.js", "LoaderResource.TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE & Double] = js.native
    
    /* 4 */ val AUDIO: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.AUDIO & Double = js.native
    
    /* 3 */ val IMAGE: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.IMAGE & Double = js.native
    
    /* 1 */ val JSON: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.JSON & Double = js.native
    
    /* 6 */ val TEXT: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.TEXT & Double = js.native
    
    /* 0 */ val UNKNOWN: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.UNKNOWN & Double = js.native
    
    /* 5 */ val VIDEO: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.VIDEO & Double = js.native
    
    /* 2 */ val XML: typingsJapgolly.pixiLoaders.mod.LoaderResource.TYPE.XML & Double = js.native
  }
  
  @JSImport("pixi.js", "LoaderResource.XHR_RESPONSE_TYPE")
  @js.native
  object XHR_RESPONSE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE & String] = js.native
    
    /* "blob" */ val BLOB: typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.BLOB & String = js.native
    
    /* "arraybuffer" */ val BUFFER: typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.BUFFER & String = js.native
    
    /* "text" */ val DEFAULT: typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.DEFAULT & String = js.native
    
    /* "document" */ val DOCUMENT: typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.DOCUMENT & String = js.native
    
    /* "json" */ val JSON: typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.JSON & String = js.native
    
    /* "text" */ val TEXT: typingsJapgolly.pixiLoaders.mod.LoaderResource.XHR_RESPONSE_TYPE.TEXT & String = js.native
  }
  
  @JSImport("pixi.js", "LoaderResource._loadTypeMap")
  @js.native
  val loadTypeMap: Dict[Double] = js.native
  
  /**
    * Sets the load type to be used for a specific extension.
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {PIXI.LoaderResource.LOAD_TYPE} loadType - The load type to set it to.
    */
  inline def setExtensionLoadType(extname: String, loadType: LOAD_TYPE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionLoadType")(extname.asInstanceOf[js.Any], loadType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the load type to be used for a specific extension.
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {PIXI.LoaderResource.XHR_RESPONSE_TYPE} xhrType - The xhr type to set it to.
    */
  inline def setExtensionXhrType(extname: String, xhrType: XHR_RESPONSE_TYPE): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtensionXhrType")(extname.asInstanceOf[js.Any], xhrType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("pixi.js", "LoaderResource._xhrTypeMap")
  @js.native
  val xhrTypeMap: Dict[XHR_RESPONSE_TYPE] = js.native
}
