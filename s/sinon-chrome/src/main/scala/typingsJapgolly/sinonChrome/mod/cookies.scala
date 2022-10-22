package typingsJapgolly.sinonChrome.mod

import typingsJapgolly.sinonChrome.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookies {
  
  @JSImport("sinon-chrome", "cookies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "cookies.get")
  @js.native
  def get: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "cookies.getAll")
  @js.native
  def getAll: SinonChromeStub = js.native
  
  @JSImport("sinon-chrome", "cookies.getAllCookieStores")
  @js.native
  def getAllCookieStores: SinonChromeStub = js.native
  inline def getAllCookieStores_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAllCookieStores")(x.asInstanceOf[js.Any])
  
  inline def getAll_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAll")(x.asInstanceOf[js.Any])
  
  inline def get_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "cookies.onChanged")
  @js.native
  def onChanged: Event = js.native
  inline def onChanged_=(x: Event): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "cookies.remove")
  @js.native
  def remove: SinonChromeStub = js.native
  inline def remove_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "cookies.set")
  @js.native
  def set: SinonChromeStub = js.native
  inline def set_=(x: SinonChromeStub): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
}
