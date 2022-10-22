package typingsJapgolly.pixiLoaders.mod

import typingsJapgolly.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/loaders", "TextureLoader")
@js.native
open class TextureLoader () extends StObject
/* static members */
object TextureLoader {
  
  @JSImport("@pixi/loaders", "TextureLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /** Handle SVG elements a text, render with SVGResource. */
  inline def add(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Unit]
  
  /** @ignore */
  @JSImport("@pixi/loaders", "TextureLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param resource
    * @param {Function} next
    */
  inline def use(resource: LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
