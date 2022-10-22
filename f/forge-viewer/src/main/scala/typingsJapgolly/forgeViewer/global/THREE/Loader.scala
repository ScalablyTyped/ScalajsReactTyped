package typingsJapgolly.forgeViewer.global.THREE

import typingsJapgolly.forgeViewer.THREE.LoaderHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Loader")
@js.native
open class Loader ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.Loader
object Loader {
  
  @JSGlobal("THREE.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("THREE.Loader.Handlers")
  @js.native
  def Handlers: LoaderHandler = js.native
  inline def Handlers_=(x: LoaderHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Handlers")(x.asInstanceOf[js.Any])
}
