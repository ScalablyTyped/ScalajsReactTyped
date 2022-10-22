package typingsJapgolly.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.RequestUtils")
@js.native
open class RequestUtils ()
  extends StObject
     with typingsJapgolly.preloadjs.createjs.RequestUtils
/* static members */
object RequestUtils {
  
  @JSGlobal("createjs.RequestUtils")
  @js.native
  val ^ : js.Any = js.native
  
  // properties
  @JSGlobal("createjs.RequestUtils.ABSOLUTE_PATH")
  @js.native
  def ABSOLUTE_PATH: js.RegExp = js.native
  inline def ABSOLUTE_PATH_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE_PATH")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.RequestUtils.EXTENSION_PATT")
  @js.native
  def EXTENSION_PATT: js.RegExp = js.native
  inline def EXTENSION_PATT_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_PATT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.RequestUtils.RELATIVE_PATH")
  @js.native
  def RELATIVE_PATH: js.RegExp = js.native
  inline def RELATIVE_PATH_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_PATH")(x.asInstanceOf[js.Any])
  
  // methods
  inline def buildPath(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildPath(src: String, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(src.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatQueryString(data: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatQueryString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatQueryString(data: js.Object, query: js.Array[js.Object]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatQueryString")(data.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTypeByExtension(`extension`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeByExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAudioTag(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAudioTag")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinary(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCrossDomain(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrossDomain")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isImageTag(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageTag")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLocal(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocal")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isText(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVideoTag(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVideoTag")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseURI(path: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURI")(path.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
