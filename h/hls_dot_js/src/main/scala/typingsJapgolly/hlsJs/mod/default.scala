package typingsJapgolly.hlsJs.mod

import typingsJapgolly.hlsJs.anon.PartialHlsConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @module Hls
  * @class
  * @constructor
  */
@JSImport("hls.js", JSImport.Default)
@js.native
/**
  * Creates an instance of an HLS client that can attach to exactly one `HTMLMediaElement`.
  *
  * @constructs Hls
  * @param {HlsConfig} config
  */
open class default ()
  extends StObject
     with Hls {
  def this(userConfig: PartialHlsConfig) = this()
}
object default {
  
  @JSImport("hls.js", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("hls.js", "default.defaultConfig")
  @js.native
  def defaultConfig: Any = js.native
  inline def defaultConfig_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
