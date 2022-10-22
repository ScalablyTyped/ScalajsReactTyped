package typingsJapgolly.angularPlatformBrowser.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ɵConsole
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularCore.mod.ɵɵInjectableDeclaration
import typingsJapgolly.angularPlatformBrowser.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275HammerGesturesPlugin")
@js.native
open class ɵHammerGesturesPlugin protected ()
  extends StObject
     with EventManagerPlugin {
  def this(doc: Any, _config: HammerGestureConfig, console: ɵConsole) = this()
  def this(doc: Any, _config: HammerGestureConfig, console: ɵConsole, loader: HammerLoader) = this()
  
  /* private */ var _config: Any = js.native
  
  /* private */ /* CompleteClass */
  var _doc: Any = js.native
  
  /* private */ var _loaderPromise: Any = js.native
  
  /* CompleteClass */
  override def addEventListener(element: HTMLElement, eventName: String, handler: js.Function): js.Function = js.native
  
  /* CompleteClass */
  override def addGlobalEventListener(element: String, eventName: String, handler: js.Function): js.Function = js.native
  
  /* private */ var console: Any = js.native
  
  def isCustomEvent(eventName: String): Boolean = js.native
  
  /* private */ var loader: Any = js.native
  
  /* CompleteClass */
  var manager: EventManager = js.native
  
  /* CompleteClass */
  override def supports(eventName: String): Boolean = js.native
}
/* static members */
object ɵHammerGesturesPlugin {
  
  @JSImport("@angular/platform-browser", "\u0275HammerGesturesPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "\u0275HammerGesturesPlugin.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ɵHammerGesturesPlugin, js.Tuple4[Null, Null, Null, `0`]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵHammerGesturesPlugin, js.Tuple4[Null, Null, Null, `0`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "\u0275HammerGesturesPlugin.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ɵHammerGesturesPlugin] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵHammerGesturesPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
