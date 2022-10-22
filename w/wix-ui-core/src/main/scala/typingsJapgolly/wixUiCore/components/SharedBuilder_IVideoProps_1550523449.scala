package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoTypesMod.IConfig
import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoTypesMod.PlayerNameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IVideoProps_1550523449[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def config(value: IConfig): this.type = set("config", value.asInstanceOf[js.Any])
  
  inline def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
  
  inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
  
  inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
  
  inline def fillAllSpace(value: Boolean): this.type = set("fillAllSpace", value.asInstanceOf[js.Any])
  
  inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def hideOverlay(value: Boolean): this.type = set("hideOverlay", value.asInstanceOf[js.Any])
  
  inline def isResponsiveMode(value: Boolean): this.type = set("isResponsiveMode", value.asInstanceOf[js.Any])
  
  inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
  
  inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
  
  inline def onDuration(value: js.Function): this.type = set("onDuration", value.asInstanceOf[js.Any])
  
  inline def onEnded(value: js.Function): this.type = set("onEnded", value.asInstanceOf[js.Any])
  
  inline def onError(value: js.Function): this.type = set("onError", value.asInstanceOf[js.Any])
  
  inline def onFirstEnded(value: js.Function): this.type = set("onFirstEnded", value.asInstanceOf[js.Any])
  
  inline def onFirstPlay(value: js.Function): this.type = set("onFirstPlay", value.asInstanceOf[js.Any])
  
  inline def onInit(value: (/* player */ Any, /* playerName */ PlayerNameType) => Callback): this.type = set("onInit", js.Any.fromFunction2((t0: /* player */ Any, t1: /* playerName */ PlayerNameType) => (value(t0, t1)).runNow()))
  
  inline def onPause(value: js.Function): this.type = set("onPause", value.asInstanceOf[js.Any])
  
  inline def onPlay(value: js.Function): this.type = set("onPlay", value.asInstanceOf[js.Any])
  
  inline def onProgress(value: js.Function): this.type = set("onProgress", value.asInstanceOf[js.Any])
  
  inline def onReady(value: js.Function): this.type = set("onReady", value.asInstanceOf[js.Any])
  
  inline def playerRef(value: js.Function): this.type = set("playerRef", value.asInstanceOf[js.Any])
  
  inline def playing(value: Boolean): this.type = set("playing", value.asInstanceOf[js.Any])
  
  inline def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
  
  inline def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  
  inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
}
