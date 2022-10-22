package typingsJapgolly.winrt.global.Windows.UI

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StartScreen {
  
  @JSGlobal("Windows.UI.StartScreen.ForegroundText")
  @js.native
  object ForegroundText extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.StartScreen.ForegroundText & Double] = js.native
    
    /* 0 */ val dark: typingsJapgolly.winrt.Windows.UI.StartScreen.ForegroundText.dark & Double = js.native
    
    /* 1 */ val light: typingsJapgolly.winrt.Windows.UI.StartScreen.ForegroundText.light & Double = js.native
  }
  
  @JSGlobal("Windows.UI.StartScreen.SecondaryTile")
  @js.native
  open class SecondaryTile ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile {
    def this(tileId: String) = this()
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri
    ) = this()
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri,
      wideLogoReference: Uri
    ) = this()
  }
  /* static members */
  object SecondaryTile {
    
    @JSGlobal("Windows.UI.StartScreen.SecondaryTile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def exists(tileId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(tileId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def findAllAsync(): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile]]]
    inline def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(applicationId.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile]]]
    
    inline def findAllForPackageAsync(): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllForPackageAsync")().asInstanceOf[IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.StartScreen.SecondaryTile]]]
  }
  
  @JSGlobal("Windows.UI.StartScreen.TileOptions")
  @js.native
  object TileOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions & Double] = js.native
    
    /* 3 */ val copyOnDeployment: typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions.copyOnDeployment & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions.none & Double = js.native
    
    /* 1 */ val showNameOnLogo: typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions.showNameOnLogo & Double = js.native
    
    /* 2 */ val showNameOnWideLogo: typingsJapgolly.winrt.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo & Double = js.native
  }
}
