package typingsJapgolly.canvg.mod

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import org.scalajs.dom.Window
import typingsJapgolly.canvg.distScreenMod.IScreenOptions
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Screen")
@js.native
open class Screen protected ()
  extends typingsJapgolly.canvg.distScreenMod.Screen {
  def this(ctx: RenderingContext2D) = this()
  def this(ctx: RenderingContext2D, hasFetchWindow: IScreenOptions) = this()
}
/* static members */
object Screen {
  
  @JSImport("canvg", "Screen")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvg", "Screen.FRAMERATE")
  @js.native
  def FRAMERATE: Double = js.native
  inline def FRAMERATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAMERATE")(x.asInstanceOf[js.Any])
  
  @JSImport("canvg", "Screen.MAX_VIRTUAL_PIXELS")
  @js.native
  def MAX_VIRTUAL_PIXELS: Double = js.native
  inline def MAX_VIRTUAL_PIXELS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VIRTUAL_PIXELS")(x.asInstanceOf[js.Any])
  
  inline def defaultFetch(input: URL): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def defaultFetch(input: URL, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def defaultFetch(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def defaultFetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("canvg", "Screen.defaultWindow")
  @js.native
  val defaultWindow: Window & (/* globalThis */ Any) = js.native
}
