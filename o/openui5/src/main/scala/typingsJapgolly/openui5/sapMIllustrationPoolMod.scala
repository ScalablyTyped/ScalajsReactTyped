package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.openui5.anon.SetFamily
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIllustrationPoolMod extends Shortcut {
  
  @JSImport("sap/m/IllustrationPool", JSImport.Default)
  @js.native
  val default: IllustrationPool = js.native
  
  /**
    * @SINCE 1.98
    *
    * `IllustrationPool` loads the illustration assets (SVGs) via XMLHttpRequest requests.
    *
    * The successfully loaded data is kept in the DOM (div with ID `sap-illustration-pool`) in the `sap-ui-static`
    * DOM element.
    *
    * To load a given asset, register its illustration set through the {@link sap.m.IllustrationPool.registerIllustrationSet
    * registerIllustrationSet} API of `IllustrationPool`. The exception being the `sapIllus`, which is the
    * default illustration set that is registered by default.
    *
    * The default behavior of `IllustrationPool` is to load/require an asset only when it's needed by using
    * the {@link sap.m.IllustrationPool.loadAsset} API. When registering the new illustration set, you are
    * given the option to load all of its assets.
    *
    * If some of the assets are not loaded initially, you can load the rest of them on a later state with the
    * {@link sap.m.IllustrationPool.loadRestOfTheAssets} API.
    */
  trait IllustrationPool extends StObject {
    
    /**
      * Loads an SVG asset depending on the input asset ID.
      */
    def loadAsset(
      /**
      * The string ID of the asset being loaded
      */
    sAssetId: String,
      /**
      * the ID of the Illustration instance which is requiring the asset
      */
    sInstanceId: String
    ): Unit
    
    /**
      * Loads the rest of the SVG assets for a given illustration set.
      */
    def loadRestOfTheAssets(
      /**
      * The illustration set, the rest of the assets should be loaded for
      */
    sIllustrationSet: String
    ): Unit
    
    /**
      * Registers an illustration set, which is needed before loading any of its assets.
      */
    def registerIllustrationSet(
      /**
      * object containing the name and the path of the Illustration Set
      */
    oConfig: SetFamily,
      /**
      * whether or not all of the assets for the Illustration Set should be loaded once the metadata is loaded
      */
    bLoadAllResources: Boolean
    ): Unit
  }
  object IllustrationPool {
    
    inline def apply(
      loadAsset: (String, String) => Callback,
      loadRestOfTheAssets: String => Callback,
      registerIllustrationSet: (SetFamily, Boolean) => Callback
    ): IllustrationPool = {
      val __obj = js.Dynamic.literal(loadAsset = js.Any.fromFunction2((t0: String, t1: String) => (loadAsset(t0, t1)).runNow()), loadRestOfTheAssets = js.Any.fromFunction1((t0: String) => loadRestOfTheAssets(t0).runNow()), registerIllustrationSet = js.Any.fromFunction2((t0: SetFamily, t1: Boolean) => (registerIllustrationSet(t0, t1)).runNow()))
      __obj.asInstanceOf[IllustrationPool]
    }
    
    extension [Self <: IllustrationPool](x: Self) {
      
      inline def setLoadAsset(value: (String, String) => Callback): Self = StObject.set(x, "loadAsset", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setLoadRestOfTheAssets(value: String => Callback): Self = StObject.set(x, "loadRestOfTheAssets", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRegisterIllustrationSet(value: (SetFamily, Boolean) => Callback): Self = StObject.set(x, "registerIllustrationSet", js.Any.fromFunction2((t0: SetFamily, t1: Boolean) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = IllustrationPool
  
  /* This means you don't have to write `default`, but can instead just say `sapMIllustrationPoolMod.foo` */
  override def _to: IllustrationPool = default
}
